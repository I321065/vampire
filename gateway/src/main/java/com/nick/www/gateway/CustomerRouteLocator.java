package com.nick.www.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author "yinzheng"
 * @date 2018-09-02
 */
@Configuration
public class CustomerRouteLocator {


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                //basic proxy
                .route(r -> r.path("/baidu")
                        .uri("https://www.google.com.hk/webhp")
                ).build();
    }

}
