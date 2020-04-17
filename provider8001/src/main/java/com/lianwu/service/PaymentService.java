package com.lianwu.service;

import com.lianwu.entities.Payment;

public interface PaymentService {

    int savePayment(Payment payment);

    Payment findBySerialNumber(String serialNumber);
}
