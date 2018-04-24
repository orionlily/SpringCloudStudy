package com.orion.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orionlily on 2018/4/23.
 */

@FeignClient(value="SPRINGCLOUDCLIENT")
public interface HelloService {
    @RequestMapping("/hello/{name}")
    String sayHello(@PathVariable("name") String name);
}
