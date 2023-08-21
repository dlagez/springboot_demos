package com.example.provider.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @description:
 * @author: roczhang
 * @date: 2023/8/21 10:31
 */
@Controller
@RequestMapping("config")
public class ConfigController {

  @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
  private boolean useLocalCache;

  @RequestMapping(value = "/get", method = GET)
  @ResponseBody
  public boolean get() {
    return useLocalCache;
  }
}
