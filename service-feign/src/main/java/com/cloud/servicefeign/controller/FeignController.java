package com.cloud.servicefeign.controller;

import com.cloud.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("name") String name){
        return feignService.feignClient1(name);
    }
}
