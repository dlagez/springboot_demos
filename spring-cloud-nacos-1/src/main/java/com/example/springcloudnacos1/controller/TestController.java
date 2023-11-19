package com.example.springcloudnacos1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: roczhang
 * @date: 2023/11/18 11:18
 */
@RestController
@RequestMapping("/config")
public class TestController {

    @RequestMapping("/get")
    public String get() {
        return "Hello Nacos Config!";
    }

}
