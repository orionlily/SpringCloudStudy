package com.orion.controller;

import com.orion.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by orionlily on 2018/4/23.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return helloService.sayHello(name);
    }
}
