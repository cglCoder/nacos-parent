package com.aopioc.nacos.controller;

import com.aopioc.nacos.pojo.User;
import com.aopioc.nacos.service.IndexService;
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
@RequestMapping("/user")
public class IndexController {


    @Autowired
    private IndexService indexService;


    @GetMapping("/findAll")
    public List<User> findAll(){
        return indexService.findAll();
    };




}
