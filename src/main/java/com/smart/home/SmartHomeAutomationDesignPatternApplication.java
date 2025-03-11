package com.smart.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SmartHomeAutomationDesignPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartHomeAutomationDesignPatternApplication.class, args);
    }
}
