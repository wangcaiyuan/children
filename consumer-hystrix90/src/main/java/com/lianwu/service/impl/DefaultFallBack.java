package com.lianwu.service.impl;

import com.lianwu.entities.CommentResult;
import com.lianwu.service.ConsumerOpenfeignService;
import org.springframework.stereotype.Service;

/**
 * @ClassName : DefaultFallBack  //类名
 * @Description : TODO  //描述
 * @Author : 8470
 * @Date: 2020-04-23 15:21
 */
@Service("ConsumerOpenfeignService")
public class DefaultFallBack implements ConsumerOpenfeignService {

    @Override
    public CommentResult getPaymentInfo(String serialNumber) {
        return new CommentResult(100,"feign中的断路器开启==>"+System.currentTimeMillis());
    }
}
