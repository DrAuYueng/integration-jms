package com.integration.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.Message;
import org.springframework.integration.MessagingException;

public class LocalMessageHandler implements org.springframework.integration.core.MessageHandler {

    private static final Logger log = LoggerFactory.getLogger(LocalMessageHandler.class);

    // public void handleMessage(Department message) {
    // log.info("这是我们从队列接受过来的直接数组数据 " + message);
    // // return message;
    // }

    public void handleMessage(Message<?> message) throws MessagingException {
        log.info("这是我们从队列接受过来的直接数组数据 " + message);

    }

}