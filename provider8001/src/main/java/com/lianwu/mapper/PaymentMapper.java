package com.lianwu.mapper;

import com.lianwu.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

   int save(Payment payment);

   Payment findBySerialNumber(@Param("serialNumber") String serialNumber);
}
