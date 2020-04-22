package com.lianwu.controller;

import com.lianwu.entities.CommentResult;
import com.lianwu.entities.Payment;
import com.lianwu.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class PaymentController {

    private final static Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Resource
    private PaymentService paymentService;
    @Resource
    private DiscoveryClient discoveryClient;


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

    @GetMapping("/api/payment/getDiscovery")
    public Object getDiscovery(){
        List<String> services = discoveryClient.getServices();
        for(String service:services){
            logger.info("++++service++++"+service);
        }

        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance serviceInstance:serviceInstanceList){
            logger.info("host=="+serviceInstance.getHost()+"uri=="+serviceInstance.getUri());
        }
        return discoveryClient;
    }

    @GetMapping("/api/payment/getServerPort")
    public String getServerPort(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
