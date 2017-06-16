package com.chengc.springboot.test.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ControllerAdvice 即把@ControllerAdvice注解内部使用@ExceptionHandler、@InitBinder、@ModelAttribute注解的方法应用到所有的 @RequestMapping注解的方法。
 * 非常简单，不过只有当使用@ExceptionHandler最有用，另外两个@InitBinder、@ModelAttribute用处不大。
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    //下面一行定义抛出所有Exception异常时执行此方法
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        Map<String,Object> errorMap = new HashMap<>();
        errorMap.put("status",1);
        errorMap.put("message",e.getMessage());
        errorMap.put("data",new Object());
        return JSON.toJSONString(errorMap);

    }

}
