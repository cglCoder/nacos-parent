package com.aopioc.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:JefferyChang
 * @Date:2019/4/22 19:42
 * @Desp:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplications {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplications.class, args);
    }

}
