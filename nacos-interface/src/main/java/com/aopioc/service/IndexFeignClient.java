package com.aopioc.service;

import com.aopioc.pojo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author:JefferyChang
 * @Date:2019/4/23 14:47
 * @Desp:
 */
@FeignClient(name ="nacos-provider")
public interface IndexFeignClient {

    @GetMapping("/user/findAll")
    List<User> user();
}
