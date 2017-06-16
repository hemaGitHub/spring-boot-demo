package com.chengc.springboot.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Profile;
/**
 * Created by chengc on 2017/3/15.
 * Many Spring Boot developers always have their main class annotated with @Configuration, @EnableAutoConfiguration and @ComponentScan.
 * Since these annotations are so frequently used together (especially if you follow the best practices above), Spring Boot provides a convenient @SpringBootApplication alternative.
 * The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes:
 */
/**The second class-level annotation is @EnableAutoConfiguration.
 * This annotation tells Spring Boot to “guess” how you will want to configure Spring, based on the jar dependencies that you have added.
 * Since spring-boot-starter-web added Tomcat and Spring MVC, the auto-configuration will assume that you are developing a web application and setup Spring accordingly.
 * You can also use the @SpringBootApplication annotation if your main class is in the root package.
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application  {

    /**
     * The final part of our application is the main method.
     * This is just a standard method that follows the Java convention for an application entry point.
     * Our main method delegates to Spring Boot’s SpringApplication class by calling run.
     * SpringApplication will bootstrap our application, starting Spring which will in turn start the auto-configured Tomcat web server.
     * We need to pass HelloController.class as an argument to the run method to tell SpringApplication which is the primary Spring component.
     * The args array is also passed through to expose any command-line arguments.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        //运行之后在浏览器中访问：http://localhost:8080/hello
        SpringApplication.run(Application.class, args);
    }

}
