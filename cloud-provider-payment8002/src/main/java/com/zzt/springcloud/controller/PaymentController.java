package com.zzt.springcloud.controller;

import com.zzt.springcloud.enmu.ResponseEnmu;
import com.zzt.springcloud.entities.CommonResult;
import com.zzt.springcloud.entities.Payment;
import com.zzt.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: Administrator
 * @date: 2021/06/04
 * @description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody  Payment payment){
        int result = paymentService.create(payment);
        log.info("***插入数据成功***,",result);
        if(result > 0){
            return new CommonResult(ResponseEnmu.Payment.SUCCESS.getCode(),ResponseEnmu.Payment.SUCCESS.getMessage()+". serverPort: "+serverPort,result);
        } else {
            return new CommonResult(ResponseEnmu.Payment.FAILURE.getCode(),ResponseEnmu.Payment.FAILURE.getMessage(),null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询数据成功,"+payment);
        int test = 10 /2;
        if(payment != null) {
            return new CommonResult(ResponseEnmu.Payment.SUCCESS.getCode(),ResponseEnmu.Payment.SUCCESS.getMessage()+". serverPort: "+serverPort,payment);
        } else {
            return new CommonResult(ResponseEnmu.Payment.FAILURE.getCode(),ResponseEnmu.Payment.FAILURE.getMessage(),null);
        }
    }
}
