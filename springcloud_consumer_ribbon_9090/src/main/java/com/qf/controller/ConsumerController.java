package com.qf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yuan
 * @Date: 2019/2/12 19:05
 * @Version 1.0
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping("/hello")
    public String helllo() {
        String result  = restTemplate.getForObject("http://PROVIDER/test", String.class);
        return "消费者启动,返回值:"+result;
    }

    public String error() {
        return "服务繁忙_9090";
    }

}
