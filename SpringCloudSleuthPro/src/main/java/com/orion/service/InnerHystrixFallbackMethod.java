package com.orion.service;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/16.
 */
@Component
public class InnerHystrixFallbackMethod implements SleuthProService{
    @Override
    public String useReMenthod(String name) {
        return "pro error,"+name+",sorry!";
    }
}
