package com.orion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringCloudConfigClientApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCloudConfigClientApplication.class,args);
    }

    @Value("${foobar}")
    String foobar;

    @RequestMapping("/cfgclient")
    public String cfgclient(){
        return foobar;
    }
}
