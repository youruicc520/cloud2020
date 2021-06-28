package com.zzt.springcloud.service;

import com.zzt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Administrator
 * @date: 2021/06/04
 * @description:
 */
public interface PaymentService {
    /**
     * 创建订单
     * @param payment
     */
    int create(Payment payment);

    /**
     * 根据id查询订单
     * @param id
     */
    Payment getPaymentById(@Param("id") Long id);
}
