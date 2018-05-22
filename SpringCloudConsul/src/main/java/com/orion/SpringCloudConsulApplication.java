package com.orion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LLC on 2018/5/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulApplication.class,args);
    }

    @RequestMapping("/helloConsul/{name}")
    public  String helloConsul(@PathVariable String name){
        return "helloConsul,"+name;
    }
}
