package com.nick.www.vampire.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author "yinzheng"
 * @date 2018-08-31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(GatewayBootStrap.class, args);
    }

    @GetMapping("/ping")
    public String ping() {
        return "ok";
    }
}
