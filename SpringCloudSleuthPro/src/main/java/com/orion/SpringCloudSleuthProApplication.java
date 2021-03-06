package com.orion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2018/5/16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudSleuthProApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSleuthProApplication.class,args);
    }

    @Bean
    public AlwaysSampler sampler(){
        return  new AlwaysSampler();
    }
}
