package com.lianwu.service;

import com.lianwu.entities.CommentResult;
import com.lianwu.service.impl.DefaultFallBack;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "CLOUD-PAYMENT-SERVICE", fallback = DefaultFallBack.class)
public interface ConsumerOpenfeignService {

    @GetMapping("/api/payment/getPaymentInfo/{serialNumber}")

    CommentResult getPaymentInfo(@PathVariable("serialNumber") String serialNumber);

}
