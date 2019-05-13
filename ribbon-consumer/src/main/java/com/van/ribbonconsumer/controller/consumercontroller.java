package com.van.ribbonconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname consumercontroller
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/9 11:15
 * @Version 1.0
 **/
@RestController()
@RequestMapping("/rbconsumer")
public class consumercontroller {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/get")
    public String get() {
        String body = restTemplate.getForEntity("http://provider-service/pro/out", String.class).getBody();
        System.out.println(body);
        return body;
    }

    public String fallback(){
        return "error";
    }
}
