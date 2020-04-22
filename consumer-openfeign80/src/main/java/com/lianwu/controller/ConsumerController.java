package com.lianwu.controller;

import com.lianwu.entities.CommentResult;
import com.lianwu.entities.Payment;
import com.lianwu.service.ConsumerOpenfeignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Resource
    private ConsumerOpenfeignService consumerOpenfeignService;

    @GetMapping("/api/consumer/getConsumerInfoNew/{serialNumber}")
    public CommentResult<Payment> getConsumerInfoNew(@PathVariable("serialNumber") String serialNumber){
        return consumerOpenfeignService.getPaymentInfo(serialNumber);
    }
}
