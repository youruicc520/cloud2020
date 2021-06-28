package com.zzt.springcloud.dao;

import com.zzt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Administrator
 * @date: 2021/06/04
 * @description:
 */
@Mapper
public interface PaymentDao {
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
