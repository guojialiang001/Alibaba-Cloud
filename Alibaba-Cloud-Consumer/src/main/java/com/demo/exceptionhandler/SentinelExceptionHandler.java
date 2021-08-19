package com.demo.exceptionhandler;

import com.demo.service.ConsumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 使用说明：实现限流的异常处理
 *
 * @author huangxiangxiang
 * @version 2.0.0
 * @createTime 2019年08月22日 18:07:00
 */

@Component
public class SentinelExceptionHandler implements ConsumService {
    final static Logger logger = LoggerFactory.getLogger(SentinelExceptionHandler.class);

    @Override
    public String getNmae(String name) {
        logger.info("sentinel 熔断处理 {}", "SentinelExceptionHandler");
        return "Sentinel {由于你的访问次数太多，已为你限流、您已进入保护模式，请稍后再试！}>>>熔断处理函数";
    }
}