package com.snorlax.jenkinsdemo.service.impl;

import com.snorlax.jenkinsdemo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: Snorlax
 * @Date: 2022/4/30 23:32
 * @Version: 1.0
 * @History:
 * @Note:
 */
@Service("HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String say() {
        return "Hello Springboot!";
    }
}
