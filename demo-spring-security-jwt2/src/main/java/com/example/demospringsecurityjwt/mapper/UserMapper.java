package com.example.demospringsecurityjwt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demospringsecurityjwt.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author: roczhang
 * @date: 2023/11/14 19:53
 */
@Repository
public interface UserMapper extends BaseMapper<User> {}
