package com.lianwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : EurekaTestApplication  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-14 15:44
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaTestApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaTestApplication.class, args);
    }
}
