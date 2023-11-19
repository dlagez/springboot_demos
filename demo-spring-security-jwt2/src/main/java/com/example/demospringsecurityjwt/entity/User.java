package com.example.demospringsecurityjwt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

/**
 * @author: roczhang
 * @date: 2023/11/14 19:51
 */
@Data
@TableName("user")
public class User {

  private Long id;

  private String username;

  private String email;

  private String password;

  private Set<Role> roles = new HashSet<>();
}
