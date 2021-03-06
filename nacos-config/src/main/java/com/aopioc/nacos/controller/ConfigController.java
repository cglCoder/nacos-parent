package com.aopioc.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:JefferyChang
 * @Date:2019/4/22 18:33
 * @Desp:
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {


    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }







}
