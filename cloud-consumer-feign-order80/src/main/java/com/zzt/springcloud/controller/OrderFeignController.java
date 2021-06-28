package com.zzt.springcloud.controller;


import com.zzt.springcloud.entities.CommonResult;
import com.zzt.springcloud.entities.Payment;
import com.zzt.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Administrator
 * @date: 2021/06/09
 * @description:
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/provider/payment/feign/timeout")
    public String getTimeout(){
        return paymentFeignService.getTimeout();
    }
}
