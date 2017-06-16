package com.chengc.springboot.test.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by chengc on 2017/3/15.
 */
@Component
@Scope("prototype")
public class User {
    private String userName;
    private String ip;
    private Long phone;
    private Long certId;
    private Tool tool;
    /**
     * On your application classpath (e.g. inside your jar) you can have an application.properties that provides a sensible default property value for name.
     * When running in a new environment, an application.properties can be provided outside of your jar that overrides the name;
     * and for one-off testing, you can launch with a specific command line switch (e.g. java -jar app.jar --name="Spring").
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getCertId() {
        return certId;
    }

    public void setCertId(Long certId) {
        this.certId = certId;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
