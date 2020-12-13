package com.sunny.study.testproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class SunnyPropertiesPrinter implements ApplicationRunner {

    @Autowired
    SunnyProperties sunnyProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=============");
        System.out.println(sunnyProperties.getName());
        System.out.println(sunnyProperties.getAge());
        System.out.println("=============");
    }
}
