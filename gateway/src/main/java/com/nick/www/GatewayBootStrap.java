package com.nick.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

/**
 * @author "yinzheng"
 * @date 2018-08-31
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
@Component
public class GatewayBootStrap {


    public static void main(String[] args) {
        SpringApplication.run(GatewayBootStrap.class, args);
    }
}
