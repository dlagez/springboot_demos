package com.example.demospringsecurityjwt.service;
import com.example.demospringsecurityjwt.entity.User;
import com.example.demospringsecurityjwt.mapper.UserMapper;
import jakarta.annotation.Resource;

/**
 * @author: roczhang
 * @date: 2023/11/14 19:54
 */
public class UserService {

    @Resource
    private UserMapper userMapper;


    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }
}
