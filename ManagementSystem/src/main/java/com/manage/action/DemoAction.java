package com.manage.action;

import com.alibaba.fastjson.JSON;
import com.manage.model.Syslog;
import com.manage.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoAction {
    Logger logger = LoggerFactory.getLogger(DemoAction.class);

    @Resource
    DemoService demoService;

    @RequestMapping("/index")
    public String home(){
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json(){
        Map<String, String> result = new HashMap<String, String>();
        result.put("key1", "123");
        result.put("key2", "123");
        result.put("key3", "231");
        return result;
    }

    @RequestMapping("/redisAndMybatis")
    @ResponseBody
    public Map<String, String> redisAndMybatis(@RequestBody Syslog syslog){
        logger.info(JSON.toJSONString(syslog));
        Map<String, String> result = new HashMap<String, String>();
        result.put("result", "syslog");
        demoService.insertDemo(syslog);
        return result;
    }


}
