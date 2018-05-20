package com.orion.controller;

import com.orion.service.SleuthReService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/16.
 */
@RestController
public class SleuthReController {
    @Autowired
    private SleuthReService sleuthReService;

    @RequestMapping("pro/{name}")
    public String useProMethod(@PathVariable("name")String name){
       return sleuthReService.useProMenthod(name);
    }

    @RequestMapping("/re/{name}")
    public  String useReMethod(@PathVariable("name") String name){
        return "hello."+name+",this is re method!";
    }
}
