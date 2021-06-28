package com.zzt.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * @author: Administrator
 * @date: 2021/06/17
 * @description:
 */
@Controller
@EnableBinding(Sink.class)
public class ReceiveListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message) {
        System.out.println("消费者2号,------>接收到消息: "+message.getPayload()+" ,端口: "+serverPort);
    }
}
