package com.aopioc.nacos.service;

import com.aopioc.nacos.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author:JefferyChang
 * @Date:2019/4/25 16:35
 * @Desp:
 */
@FeignClient(name = "nacos-provider")
public interface IndexFeignClient {

    @GetMapping("/user/findAll")
    List<User> findAll();
}
