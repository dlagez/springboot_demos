package com.example.springcloudnacos1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springcloudnacos1.model.NacosConfigInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: roczhang
 * @date: 2023/11/18 11:18
 */
@RestController
@RequestMapping("/nacos/bean")
public class TestController {

    @Autowired
    private NacosConfigInfo nacosConfigInfo;

    @RequestMapping("/get")
    public String get() {
        return "Hello Nacos Config!";
    }

    @GetMapping
    public Map<String, String> getConfigInfo() {
        Map<String, String> result = new HashMap<>();
        result.put("serverAddr", nacosConfigInfo.getServerAddr());
        result.put("prefix", nacosConfigInfo.getPrefix());
        result.put("group", nacosConfigInfo.getGroup());
        result.put("namespace", nacosConfigInfo.getNamespace());
        return result;
    }
}
