package com.lianwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentTestApplication {
    public static void main(String[] args){
        SpringApplication.run(PaymentTestApplication.class, args);
    }
}
