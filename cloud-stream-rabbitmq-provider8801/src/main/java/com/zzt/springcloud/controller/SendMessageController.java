package com.zzt.springcloud.controller;

import com.zzt.springcloud.service.IMessageServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Administrator
 * @date: 2021/06/17
 * @description:
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageServer messageServer;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        messageServer.send();
        return null;
    }

}
