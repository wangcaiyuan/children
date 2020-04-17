package com.lianwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : PaymentTestApplication  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-17 15:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentTestApplication {
    public static void main(String[] args){
        SpringApplication.run(PaymentTestApplication.class, args);
    }
}
