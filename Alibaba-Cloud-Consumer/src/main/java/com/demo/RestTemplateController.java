package com.demo;


import com.demo.service.EchoapiService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class RestTemplateController {
    @LoadBalanced
    @Autowired
    public RestTemplate restTemplate;



    @DubboReference(check = false,group = "SimpleEchoService2")
    private EchoapiService simpleEchoService2;

    @DubboReference(check = false,group = "SimpleEchoService")
    private EchoapiService simpleEchoService;




    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/call/echo/{message}")
    public String callEcho(@PathVariable String message) {
// 访问应用 nacos-discovery-provider-sample 的 REST "/echo/{message}"
        return restTemplate.getForObject("http://Alibaba-Cloud-Provder/echo/" +
                message, String.class);
    }

    @GetMapping("/test/echo/{message}")
    public String echo(@PathVariable String message) {
        return simpleEchoService.echodubbo(message);
    }


    @GetMapping("/test2/echo/{message}")
    public String echo2(@PathVariable String message) {
        return simpleEchoService2.echodubbo(message);
    }


    @GetMapping("/demo/hello/{message}")
    public String echodubbohello(@PathVariable String message) {
        return simpleEchoService2.echodubbohello(message);
    }




}