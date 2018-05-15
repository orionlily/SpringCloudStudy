package com.orion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by LLC on 2018/5/16.
 */

@SpringBootApplication
@EnableZipkinServer
public class SpringCloudZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinServerApplication.class,args);
    }
}
