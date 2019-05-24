package com.van.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ThreadLocalTest
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/24 11:21
 * @Version 1.0
 **/
@RestController
@RequestMapping("/threadlocal")
public class ThreadLocalTestController {


    @RequestMapping("/test")
    public void test(){

    }

}
