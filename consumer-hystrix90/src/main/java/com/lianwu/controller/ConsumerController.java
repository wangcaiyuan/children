package com.lianwu.controller;

import com.lianwu.entities.CommentResult;
import com.lianwu.entities.Payment;
import com.lianwu.service.ConsumerOpenfeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : HystrixTestApplication  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-23 15:28
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
