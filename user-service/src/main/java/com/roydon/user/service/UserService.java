package com.roydon.user.service;

import com.roydon.user.entity.User;
import com.roydon.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }

}