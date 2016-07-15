package com.manage.service;

import com.manage.mapper.SyslogMapper;
import com.manage.model.Syslog;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Random;

@Service
public class DemoService {

    @Resource
    SyslogMapper syslogMapper;

//  列表操作
//  @Resource(name="redisTemplate")
//  private ListOperations<String, String> listOps;

//  哈希操作
//  @Resource(name="redisTemplate")
//  private HashOperations hashOperations;

    @Resource(name="redisTemplate")
    private SetOperations<String,Syslog> setOperations;



    public void insertDemo(Syslog syslog) {

        syslog.setSysLogId(new Random().nextInt()+"");

        //写入redis
        setOperations.add("asdasd",syslog);

        //从redis读出
        Syslog tmp = setOperations.pop("asdasd");

        //写入db
        syslogMapper.insertSyslog(tmp);
    }
}
