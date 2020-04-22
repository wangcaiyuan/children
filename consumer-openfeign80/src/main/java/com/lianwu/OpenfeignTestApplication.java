package com.lianwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : OpenfeignTestApplication  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-21 17:11
 */
@SpringBootApplication
@EnableFeignClients
public class OpenfeignTestApplication {
    public static void main(String[] args){
        SpringApplication.run(OpenfeignTestApplication.class, args);
    }

}
