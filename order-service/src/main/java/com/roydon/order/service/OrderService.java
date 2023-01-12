package com.roydon.order.service;

import com.roydon.order.entity.Order;
import com.roydon.order.entity.User;
import com.roydon.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.利用Bean注册的RestTemplate发起http请求，查询用户
//        String url = "http://localhost:8081/user/" + order.getUserId();
        // 替换eureka中userservice服务
        String url = "http://userservice/user/" + order.getUserId();
        User user = restTemplate.getForObject(url, User.class);
        // 3.封装user到order
        order.setUser(user);
        // 4.返回
        return order;
    }

}
