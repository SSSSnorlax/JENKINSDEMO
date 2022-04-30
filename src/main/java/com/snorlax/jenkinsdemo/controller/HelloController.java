package com.snorlax.jenkinsdemo.controller;

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
    @GetMapping("hello")
    public String sayHello(){
        return "hello customer!";
    }
}
