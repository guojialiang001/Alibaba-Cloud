package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("Alibaba-Cloud-Provder") // 指向服务提供者应用
public interface EchoService {
    @GetMapping("/echo/{message}")
    String echo(@PathVariable("message") String message);
}