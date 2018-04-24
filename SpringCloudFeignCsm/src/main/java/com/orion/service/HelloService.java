package com.orion.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orionlily on 2018/4/23.
 */

// 如果需要获得回调触发的原因，可以使用@FeignClient的fallbackFactory属性。
@FeignClient(value="SPRINGCLOUDCLIENT",fallback = HystrixFallbackMethod.class)
public interface HelloService {
    @RequestMapping("/hello/{name}")
    String sayHello(@PathVariable("name") String name);
}

//内部类的形式
@Component
class InnerHystrixFallbackMethod implements HelloService{

    @Override
    public String sayHello(String name) {
        return "error,sorry,"+name;
    }
}
