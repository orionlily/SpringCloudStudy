package com.orion.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/16.
 */
@FeignClient(value = "SpringCloudSleuthPro",fallback = InnerHystrixFallbackMethod.class )
public interface SleuthReService {
    @RequestMapping("pro/{name}")
    String useProMenthod(@PathVariable("name") String name);
}

//内部类的形式
@Component
class InnerHystrixFallbackMethod implements SleuthReService{

    @Override
    public String useProMenthod(String name) {
        return "re error,sorry,"+name;
    }
}
