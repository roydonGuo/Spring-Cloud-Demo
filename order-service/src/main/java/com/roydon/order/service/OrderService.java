package com.roydon.order.service;

import com.roydon.feign.clients.UserClient;
import com.roydon.feign.entity.User;
import com.roydon.order.entity.Order;
import com.roydon.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.使用Feign进行远程调用
        User user = userClient.findById(order.getUserId());
        // 3.封装user到order
        order.setUser(user);
        // 4.返回
        return order;

    }

//    @Resource
//    private RestTemplate restTemplate;

//    public Order queryOrderById(Long orderId) {
//        // 1.查询订单
//        Order order = orderMapper.findById(orderId);
//        // 2.利用Bean注册的RestTemplate发起http请求，查询用户
////        String url = "http://localhost:8081/user/" + order.getUserId();
//        // 替换eureka中userservice服务
//        String url = "http://userservice/user/" + order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);
//        // 3.封装user到order
//        order.setUser(user);
//        // 4.返回
//        return order;
//    }

}
