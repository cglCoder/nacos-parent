package com.aopioc.nacos.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable{

    @Id
    @GeneratedValue
    private Integer id ;

    private String name ;

    private Integer age;





}
