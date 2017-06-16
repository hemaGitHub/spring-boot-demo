package com.chengc.springboot.test.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({ "product" })
public class GenericService implements MessageService {

  @Value("${hello:Hello}")
  private String hello;

  @Value("${name:World}")
  private String name;

  @Override
  public String getMessage() {
    return this.hello + " " + this.name;
  }

}