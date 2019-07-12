package com.van.ribbonconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");

        HashSet<String> hashSet=new HashSet<>(list);
        list.clear();
        list.addAll(hashSet);
        for (String s : list) {
            System.out.println(s);
        }



    }
}
