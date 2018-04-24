package com.orion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by orionlily on 2018/4/24.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@RestController
public class SpringCloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class,args);
    }

    @RequestMapping("/hi")
    public String hi(){
        return  "hi";
    }
}
