package com.roydon.order.entity;

import com.roydon.feign.entity.User;
import lombok.Data;

import java.sql.Date;

@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Date createdTime;
    private Long userId;
    private User user;
}