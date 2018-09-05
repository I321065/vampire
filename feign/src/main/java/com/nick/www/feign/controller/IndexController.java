package com.nick.www.feign.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author "yinzheng"
 * @date 2018-09-01
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public String index() {
        return "faksfk;askf";
    }


}
