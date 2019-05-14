package com.van.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConfigController
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/14 16:52
 * @Version 1.0
 **/
@RequestMapping("configclient")
@RestController
public class ConfigController {

     @Value("${jdbc.password}")
    private String  target;

    @RequestMapping("test")
    public String print(){
        System.out.println(target);
        return target;
    }

}
