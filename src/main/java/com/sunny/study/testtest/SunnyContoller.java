package com.sunny.study.testtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SunnyContoller {

    @Autowired
    private SunnyService sunnyService;

    @GetMapping("/hello")
    public String hello() {
        return "hello " + sunnyService.getName();
    }
}
