package com.lianwu;

import com.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName : ConsumerTestApplication  //类名
 * @Description : 测试类  //描述
 * @Author : 8470
 * @Date: 2020-04-14 09:38
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyRule.class)
public class ConsumerTestApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerTestApplication.class, args);
    }
}
