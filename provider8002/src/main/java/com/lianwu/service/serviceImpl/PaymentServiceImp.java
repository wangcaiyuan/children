package com.lianwu.service.serviceImpl;

import com.lianwu.entities.Payment;
import com.lianwu.mapper.PaymentMapper;
import com.lianwu.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImp implements PaymentService {

    private final static Logger logger = LoggerFactory.getLogger(PaymentServiceImp.class);

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int savePayment(Payment payment) {
        logger.info("保存数据");
        return paymentMapper.save(payment);
    }

    @Override
    public Payment findBySerialNumber(String serialNumber) {
        logger.info("查询数据number={}",serialNumber);
        return paymentMapper.findBySerialNumber(serialNumber);
    }
}
