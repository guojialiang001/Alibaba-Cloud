package com.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class ServiceController {
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return "[ECHO] : " + message;
    }
}
