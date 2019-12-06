package com.cloud.eurekaribbon.controller;

import com.cloud.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @GetMapping(value = "/hi")
    public String hello(@RequestParam String name){
        return helloService.hiService(name);
    }


}
