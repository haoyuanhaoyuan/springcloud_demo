package com.qf.feign;

import org.springframework.stereotype.Component;

/**
 * @Author: yuan
 * @Date: 2019/2/13 19:53
 * @Version 1.0
 */
@Component
public class FeginImpl implements  MyFegin {
    @Override
    public String test() {
        return "降级方法fegin_9091";
    }
}
