package com.lianwu.service;


import com.lianwu.entities.CommentResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface ConsumerOpenfeignService {

    @GetMapping("/api/payment/getPaymentInfo/{serialNumber}")
    CommentResult getPaymentInfo(@PathVariable("serialNumber") String serialNumber);

    @GetMapping("/api/payment/getServerPort")
    String getServerPort();
}
