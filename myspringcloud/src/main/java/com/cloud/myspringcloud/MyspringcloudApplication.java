package com.cloud.myspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyspringcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyspringcloudApplication.class, args);
    }
}
