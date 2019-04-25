package com.aopioc.pojo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author:JefferyChang
 * @Date:2019/4/17 20:00
 * @Desp:
 */
@Entity
@Table(name="t_order")
@Data
public class Order implements Serializable{

    @Id
    private Long orderId;

    private Long userId;





}
