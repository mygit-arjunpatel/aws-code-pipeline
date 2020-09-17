package com.arjun.aws.beanstalk.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class controller {

    @GetMapping("/getStatus")
    public String getStatus()
    {
        return "This is from getStatus get Mapping controller";
    }


}
