package com.qf.com.qf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yuan
 * @Date: 2019/2/12 16:41
 * @Version 1.0
 */
@Controller
public class TestController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("微服务被调用，端口：" + port);
        return "调用了当前的微服务，微服务的端口为：" + port;
    }
}
