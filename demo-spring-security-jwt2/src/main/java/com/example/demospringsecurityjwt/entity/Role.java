package com.example.demospringsecurityjwt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: roczhang
 * @date: 2023/11/14 19:51
 */
@Data
@TableName("roles")
public class Role {

  private Integer id;

  private ERole name;
}
