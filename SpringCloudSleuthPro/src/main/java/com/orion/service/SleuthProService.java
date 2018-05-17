package com.orion.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/16.
 */
@FeignClient(value = "SpringCloudSleuthRe",fallback =InnerHystrixFallbackMethod.class )
public interface SleuthProService {
    @RequestMapping("/re/{name}")
    String useReMenthod(@PathVariable("name") String name);
}



