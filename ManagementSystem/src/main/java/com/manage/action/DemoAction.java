package com.manage.action;

import com.alibaba.fastjson.JSON;
import com.manage.model.Sysconfigdic;
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
import java.util.List;
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

    @RequestMapping("/getDDByType")
    @ResponseBody
    public Map<String, Sysconfigdic> getDDByType(String type){
        return demoService.getDDByType(type);
    }

    @RequestMapping("/getDDBListyType")
    @ResponseBody
    public List<Sysconfigdic> getDDBListyType(String type){
        return demoService.getDDBListyType(type);
    }

    @RequestMapping("/getSysconfigdic")
    @ResponseBody
    public Sysconfigdic getSysconfigdic(String type,String key){
        return demoService.getSysconfigdic(type,key);
    }


}
