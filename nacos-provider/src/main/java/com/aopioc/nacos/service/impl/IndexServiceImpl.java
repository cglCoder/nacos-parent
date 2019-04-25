package com.aopioc.nacos.service.impl;

import com.aopioc.nacos.pojo.User;
import com.aopioc.nacos.repository.IndexRepository;
import com.aopioc.nacos.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:JefferyChang
 * @Date:2019/4/23 16:00
 * @Desp:
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexRepository indexRepository;

    @Override
    public List<User> findAll() {
        List<User> listUser = indexRepository.findAll();
        return listUser;
    }
}
