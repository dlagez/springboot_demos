package com.example.demospringsecurityjwt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 * @author: roczhang
 * @date: 2023/11/14 19:51
 */
@Data
@TableName("user")
public class User {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String mobile;
}
