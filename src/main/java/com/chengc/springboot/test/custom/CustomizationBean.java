package com.chengc.springboot.test.custom;

import org.springframework.boot.context.embedded.*;
import org.springframework.stereotype.Component;

/**
 * Implements EmbeddedServletContainerCustomizer
 * You can set custom settings with overriding customize method.
 */
@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer {
    public CustomizationBean(){
        System.out.println("-------------- CustomizationBean");
    }

    /**
     * Value setting in this place is prior to value setting in application-xxx.properties.
     * @param container
     */
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
//        container.setPort(9001);
    }

}