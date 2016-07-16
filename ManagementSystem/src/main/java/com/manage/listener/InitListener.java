package com.manage.listener;

import com.manage.mapper.SysconfigdicMapper;
import com.manage.model.Sysconfigdic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InitListener implements ApplicationListener<ContextRefreshedEvent> {

    private Logger logger = LoggerFactory.getLogger(InitListener.class);

    @Resource(name="redisTemplate")
    private HashOperations<String,String,Sysconfigdic> hashOperations;

    @Resource
    private SysconfigdicMapper sysconfigdicMapper;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent evt) {
        if (evt.getApplicationContext().getParent() == null) {
            logger.info("数据字典初始化开始");
            init();
            logger.info("数据字典初始化结束");
        }
    }

    private void init() {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("sysCfgDicParenntId", "0");
        List<Sysconfigdic> list = sysconfigdicMapper.querySysconfigdic(param);
        if (list == null || list.size() == 0) {
            logger.error("数据字典为空，请检查Sysconfigdic表中是否有数据");
        }else {
            param.clear();
            for (Sysconfigdic sysconfigdic : list) {
                param.put("sysCfgDicParenntId", sysconfigdic.getSysCfgDicId());
                List<Sysconfigdic> childrenList = sysconfigdicMapper.querySysconfigdic(param);
                if(childrenList == null || childrenList.size()==0)continue;
                for (Sysconfigdic childrenSysconfigdic : childrenList) {
                    hashOperations.put(sysconfigdic.getSysCfgDicKey(),childrenSysconfigdic.getSysCfgDicKey(),childrenSysconfigdic);
                    logger.info("加载数据字典："+childrenSysconfigdic.getSysCfgDicKey()+"---->"+childrenSysconfigdic.getSysCfgDicVal());
                }
            }
        }

    }
}
