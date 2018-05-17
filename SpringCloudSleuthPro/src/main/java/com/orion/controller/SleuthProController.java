package com.orion.controller;

import com.orion.service.SleuthProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/16.
 */
@RestController
public class SleuthProController {

    @Autowired
    private SleuthProService sleuthProService;

    @RequestMapping("/re/{name}")
    public  String useReMethod(@PathVariable("name") String name){
        return sleuthProService.useReMenthod(name);
    }

    @RequestMapping("/pro/{name}")
    public  String useProMethod(@PathVariable("name") String name){
        return "hello."+name+",this is pro method!";
    }
}
