package com.orion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by Administrator on 2018/5/20.
 */
@SpringBootApplication
@EnableTurbine
public class SpringCloudTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTurbineApplication.class,args);
    }
}
