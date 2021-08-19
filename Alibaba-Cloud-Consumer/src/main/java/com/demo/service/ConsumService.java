package com.demo.service;
import com.demo.exceptionhandler.SentinelExceptionHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用说明：远程调用fegin --- 加入fallback 熔断器  解决连锁反应 被调用服务挂的的时候 和服务崩溃的情况
 *
 * @author huangxiangxiang
 * @version 2.0.0
 * @createTime 2019年09月10日 13:30:00
 */

@FeignClient(value = "alibaba-cloud-prod-provder",fallback = SentinelExceptionHandler.class)
public interface ConsumService {

    @RequestMapping("/alibaba/getNmae")
    public String getNmae(@RequestParam("name")  String name);

}