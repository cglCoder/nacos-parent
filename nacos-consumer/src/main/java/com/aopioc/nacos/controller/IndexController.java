package com.aopioc.nacos.controller;

import com.aopioc.nacos.pojo.User;
import com.aopioc.nacos.service.IndexFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:JefferyChang
 * @Date:2019/4/23 11:16
 * @Desp:
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexFeignClient indexFeignClient;


    @GetMapping("/findAll")
    public List<User> index(){
        return indexFeignClient.findAll();
    }




}
