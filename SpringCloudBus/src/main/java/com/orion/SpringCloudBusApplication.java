package com.orion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class SpringCloudBusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudBusApplication.class,args);
    }

    @Value("${foobartip}")
    private String foobartip;

    @RequestMapping("buscfgcli")
    public  String buscfgcli(){
        return  foobartip;
    }
}
