package com.qf.controller;

import com.qf.feign.MyFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yuan
 * @Date: 2019/2/12 20:08
 * @Version 1.0
 */
@RestController
public class FeginController {
    @Autowired
    private MyFegin myFegin;

    @RequestMapping("/hello2")
    public String hello2(){
        String result = myFegin.test();
        return "调用者2被调用！返回值：" + result;
    }
}
