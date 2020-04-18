package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MyRule  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-18 16:53
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
