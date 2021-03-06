package com.demo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@DubboComponentScan
@SpringBootApplication
@EnableDiscoveryClient
public class ProvderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProvderApp.class, args);
    }
}
