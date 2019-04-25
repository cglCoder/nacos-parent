package com.aopioc.nacos.service;

import com.aopioc.nacos.pojo.User;

import java.util.List;

/**
 * @author:JefferyChang
 * @Date:2019/4/23 16:00
 * @Desp:
 */
public interface IndexService {

    List<User> findAll();
}
