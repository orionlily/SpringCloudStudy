package com.orion.service;

import org.springframework.stereotype.Component;

/**
 * Created by orionlily on 2018/4/24.
 */
@Component
public class HystrixFallbackMethod implements HelloService{
        @Override
        public String sayHello(String name) {
            return "error,sorry,"+name;
        }
}
