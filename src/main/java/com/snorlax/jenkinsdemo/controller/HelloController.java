package com.snorlax.jenkinsdemo.controller;

import com.snorlax.jenkinsdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Snorlax
 * @Date: 2022/4/30 13:31
 * @Version: 1.0
 * @History:
 * @Note:
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("hello")
    public String sayHello(){
        return helloService.say();
    }
}
