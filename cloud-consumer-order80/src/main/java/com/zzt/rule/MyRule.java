package com.zzt.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Administrator
 * @date: 2021/06/08
 * @description:
 */
@Configuration
public class MyRule {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
