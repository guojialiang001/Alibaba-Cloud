package com.demo.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "SimpleEchoService2") //定义group
public class SimpleEchoService2 implements EchoapiService {
    @Override
    public String echodubbo(String s) {
        return "[ECHO]2323 " + s;
    }
}