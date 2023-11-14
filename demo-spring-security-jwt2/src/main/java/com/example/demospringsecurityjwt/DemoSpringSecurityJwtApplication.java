package com.example.demospringsecurityjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demospringsecurityjwt.mapper")
public class DemoSpringSecurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringSecurityJwtApplication.class, args);
    }

}
