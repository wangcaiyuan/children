package com.lianwu.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : OpenFeignConfig  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-22 16:51
 */
@Configuration
public class OpenFeignConfig {

    @Bean
    public Logger.Level getOpenFeignLevel(){
        return Logger.Level.FULL;
    }
}
