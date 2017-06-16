package com.chengc.springboot.test.controller;

import com.chengc.springboot.test.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chengc on 2017/3/20.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/profile/controller")
public class ProfileController {
    @Autowired
    private MessageService messageService;
    //The @RequestMapping annotation provides “routing” information.
    // It is telling Spring that any HTTP request with the path “/” should be mapped to the home method.
    @RequestMapping("/profile")
//    @ResponseBody - if you use @RestController before Controller ,you don`t need to use @ResponseBody after  @RequestMapping
    String profiletest(@Value("${cusvar}")String cusvar,@Value("${profile_env}")String profile_env) {
        return "Hello ,cusvar "+cusvar+" , this is "+profile_env;
    }
    @RequestMapping("/profile/service")
    String profileServiceTEst(){
        return "hehe ,"+this.messageService.getMessage();
    }
}
