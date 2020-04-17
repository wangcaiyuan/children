package com.lianwu.controller;

import com.lianwu.entities.CommentResult;
import com.lianwu.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName : ConsumerController  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-14 10:02
 */
@RestController
public class ConsumerController {

//    private String PAYMENT_URL = "http://localhost:8001";
    private String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/api/consumer/saveConsumerInfo")
    public CommentResult saveConsumerInfo(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/api/payment/savePaymentInfo", payment, CommentResult.class);
    }

    @GetMapping("/api/consumer/getConsumerInfo/{serialNumber}")
    public CommentResult getConsumerInfo(@PathVariable("serialNumber") String serialNumber){
        return restTemplate.getForObject(PAYMENT_URL+"/api/payment/getPaymentInfo/{serialNumber}", CommentResult.class, serialNumber);
    }
}
