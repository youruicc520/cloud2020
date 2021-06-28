package com.zzt.springcloud.service.impl;

import com.zzt.springcloud.dao.PaymentDao;
import com.zzt.springcloud.entities.Payment;
import com.zzt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Administrator
 * @date: 2021/06/04
 * @description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
