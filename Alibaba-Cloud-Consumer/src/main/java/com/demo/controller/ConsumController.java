package com.demo.controller;



import com.demo.service.ConsumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用说明：
 *
 * @author huangxiangxiang
 * @version 2.0.0
 * @createTime 2019年09月10日 13:32:00
 */

@RestController
@RequestMapping("/aonsum")
public class ConsumController {

    @Autowired
    private ConsumService consumService;

    @RequestMapping("/getNmae")
    public String getNmae(@RequestParam("name") String name) {
        String nmaes = consumService.getNmae(name);
        System.out.println(".......消费者fegin调用.....配置中心................." + nmaes);
        return nmaes;
    }
}

