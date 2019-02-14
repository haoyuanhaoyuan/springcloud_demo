package com.qf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yuan
 * @Date: 2019/2/12 20:10
 * @Version 1.0
 */
@FeignClient(value = "provider",fallback = FeginImpl.class)
public interface MyFegin {
    @RequestMapping("/test")
    String test();
}
