package com.aopioc.nacos.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author:JefferyChang
 * @Date:2019/4/25 16:36
 * @Desp:
 */
@Data
public class User implements Serializable{

    private Integer id ;

    private String name ;

    private Integer age;


}
