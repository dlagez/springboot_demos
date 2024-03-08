package com.example.springcloudnacos1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roczhang
 * @date 2023/11/18 11:18
 */
@RestController
@RequestMapping("/nacos/bean")
@RefreshScope
public class TestController {

    @Value("${name:roczhang-local}")
    private String useLocalCache;

    @RequestMapping("/get")
    public String get() {
        return useLocalCache;
    }

}
