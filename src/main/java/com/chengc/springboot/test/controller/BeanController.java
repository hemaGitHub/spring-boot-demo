package com.chengc.springboot.test.controller;

import com.chengc.springboot.test.domain.Person;
import com.chengc.springboot.test.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by chengc on 2017/3/20.
 */
@org.springframework.web.bind.annotation.RestController
public class BeanController {
    @Resource
    Person person;
    private MessageService messageService;
    //The @RequestMapping annotation provides “routing” information.
    // It is telling Spring that any HTTP request with the path “/” should be mapped to the home method.
    @RequestMapping("/person")
//    @ResponseBody - if you use @RestController before Controller ,you don`t need to use @ResponseBody after  @RequestMapping
    String personInfo() {
        return "Hello ,person your id is "+person.getId()+" , your name is  "+person.getName();
    }
}
