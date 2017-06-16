package com.chengc.springboot.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.chengc.springboot.test.domain.Tool;
import com.chengc.springboot.test.domain.User;
import com.chengc.springboot.test.utils.SpringContextUtil;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by chengc on 2017/3/15.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Resource
    Environment environment;
    @RequestMapping("/rest")
    String home() {
        return "RestController";
    }
    @RequestMapping("/login")
    public ResponseEntity<String> login(
    @RequestParam(required = true) String userName,
    @RequestParam(required = false) String ip,
    @RequestParam(required = false) Long phone,
    @RequestParam(required = false) Long certId,
    @RequestParam(defaultValue = "0") int start,
    @RequestParam(defaultValue = "20") int length
    ) throws Exception {
        if(StringUtils.isEmpty(userName)){
            throw new Exception("userName can`t be null while login");
        }
        User user = (User)SpringContextUtil.getBean("user");
        System.out.println("user = "+user);
        user.setUserName(userName);
        user.setIp(ip);
        user.setPhone(phone);
        user.setCertId(certId);
        Tool tool = (Tool)SpringContextUtil.getBean("tool");
        tool.setLine(environment.getProperty("line"));
        tool.setLevel(Integer.parseInt(environment.getProperty("level")));
        user.setTool(tool);
        return ResponseEntity.ok("Welcome,"+JSONObject.toJSONString(user));
    }
}
