package com.zzt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Administrator
 * @date: 2021/06/07
 * @description: 实例化restTemplate模板引擎
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    /**
     *
        添加负载均衡注解
     */
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
