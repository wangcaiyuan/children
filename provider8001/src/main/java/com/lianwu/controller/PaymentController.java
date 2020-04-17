package com.lianwu.controller;

import com.lianwu.entities.CommentResult;
import com.lianwu.entities.Payment;
import com.lianwu.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/api/payment/savePaymentInfo")
    public CommentResult savePaymentInfo(@RequestBody Payment payment){
        int number = paymentService.savePayment(payment);
        if(number>0){
            return  new CommentResult(200, "保存成功"+serverPort, payment);
        }else{
            return  new CommentResult(400, "保存失败"+serverPort, null);
        }
    }

    @GetMapping("/api/payment/getPaymentInfo/{serialNumber}")
    public CommentResult getPaymentInfo(@PathVariable("serialNumber") String serialNumber){
        Payment payment = paymentService.findBySerialNumber(serialNumber);
        if(payment!=null){
            return new CommentResult(200, "有数据结果"+serverPort , payment);
        }else{
            return new CommentResult(400, "无查询数据结果"+serverPort, null);
        }
    }
}
