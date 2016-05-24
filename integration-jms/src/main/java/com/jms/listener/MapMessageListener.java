package com.jms.listener;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.listener.SessionAwareMessageListener;

public class MapMessageListener implements SessionAwareMessageListener<MapMessage> {

    private static final Logger log = LoggerFactory.getLogger(MapMessageListener.class);

    public void onMessage(MapMessage message, Session session) throws JMSException {

        log.info("Message Received \r\n" + message);

    }

}