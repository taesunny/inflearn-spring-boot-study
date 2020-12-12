package com.sunny.study.testapparguments;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppArgumentsSample {

    public AppArgumentsSample(ApplicationArguments arguments) {
        System.out.println("arguments test: " + arguments.containsOption("test"));
    }
}