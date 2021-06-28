package com.zzt.springcloud.service.impl;

import cn.hutool.core.lang.UUID;
import com.zzt.springcloud.service.IMessageServer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @author: Administrator
 * @date: 2021/06/17
 * @description:
 */
@EnableBinding(Source.class)
public class MessageServerImpl implements IMessageServer {

    @Resource
    private MessageChannel output;

    @Override
    public void send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("******serial: "+serial);
    }
}
