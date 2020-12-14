package com.sunny.study.testtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SunnyController {

    @Autowired
    private SunnyService sunnyService;

    @GetMapping("/sunny/hello")
    public String helloSunny() {
        return "hello " + sunnyService.getName();
    }
}
