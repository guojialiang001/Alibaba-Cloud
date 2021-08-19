package com.demo.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "SimpleEchoService") //定义group
public class SimpleEchoService implements EchoapiService {
    @Override
    public String echodubbo(String s) {
        return "[ECHO] " + s;
    }
}