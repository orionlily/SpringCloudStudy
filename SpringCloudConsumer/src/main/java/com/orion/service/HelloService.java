package com.orion.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by orionlily on 2018/4/23.
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://SPRINGCLOUDCLIENT/SpringCloudClient/hello/"+name,String.class);
    }

    public String hiError(String name){
        return "hello,"+name+",error!";
    }
}
