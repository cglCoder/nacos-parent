package com.aopioc.nacos.repository;

import com.aopioc.nacos.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author:JefferyChang
 * @Date:2019/4/23 16:01
 * @Desp:
 */
@Repository
public interface IndexRepository  extends JpaRepository<User,Integer> {

}
