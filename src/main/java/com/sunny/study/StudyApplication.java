package com.sunny.study;

import com.sunny.study.testlistener.SampleListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StudyApplication.class);
        app.addListeners(new SampleListener());
        app.run(args);
    }
}
