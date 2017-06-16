package com.chengc.springboot.test.controller;

import com.chengc.springboot.test.custom.CustomizationBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by chengc on 2017/3/13.
 * Demo:http://projects.spring.io/spring-boot/
 */

/**
 * @RestController  : combine @Controller and @ResponseBody
 * Types that carry this annotation are treated as controllers where
 * {@link RequestMapping @RequestMapping} methods assume
 * {@link ResponseBody @ResponseBody} semantics by default.
 * The @RestController annotation tells Spring to render the resulting string directly back to the caller.
 */
@org.springframework.web.bind.annotation.RestController
public class HelloController{

    //The @RequestMapping annotation provides “routing” information.
    // It is telling Spring that any HTTP request with the path “/” should be mapped to the home method.
    @RequestMapping("/hello")
//    @ResponseBody - if you use @RestController before Controller ,you don`t need to use @ResponseBody after  @RequestMapping
    String home() {
        return "Hello ,spring boot!";
    }

}