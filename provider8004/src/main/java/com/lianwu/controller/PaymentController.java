package com.lianwu.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController
public class PaymentController {

    private final static Logger logger = LoggerFactory.getLogger(PaymentController.class);


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/api/payment/getZooKeeper")
    public Object getDiscovery(){
        String result = "spring cloud zookeeper:"+serverPort+"==>"+ UUID.randomUUID();
        return  result;
    }
}
