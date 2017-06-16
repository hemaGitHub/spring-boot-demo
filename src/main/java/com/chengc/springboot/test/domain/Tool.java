package com.chengc.springboot.test.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by chengc on 2017/3/15.
 */
@Component
@Scope("prototype")
public class Tool {
    /**
     * On your application classpath (e.g. inside your jar) you can have an application.properties that provides a sensible default property value for name.
     * When running in a new environment, an application.properties can be provided outside of your jar that overrides the name;
     * and for one-off testing, you can launch with a specific command line switch (e.g. java -jar app.jar --name="Spring").
     */
    @Value("${brand}")
    private String brand;

    private String line;

    private int level;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
