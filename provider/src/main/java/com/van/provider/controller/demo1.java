package com.van.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Timer;

/**
 * @Classname demo1
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/8 17:12
 * @Version 1.0
 **/
@RequestMapping("/pro")
@RestController
public class demo1 {

    @RequestMapping("/out")
    public String string() {
        try {
            //Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello,欢迎使用";
    }

    @Value("${name}")
    private    String name;

    @RequestMapping("config")
    public   String string2(){

        System.out.println(name);
        return name;
    }

}
