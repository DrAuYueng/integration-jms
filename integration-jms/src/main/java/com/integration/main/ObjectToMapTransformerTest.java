package com.integration.main;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.integration.domain.Department;
import com.mockrunner.mock.jms.MockQueue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-mockrunner.xml", "classpath:spring-int-jms.xml" })
public class ObjectToMapTransformerTest {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private MockQueue inBoundQueue;

    @Test
    public void shouldSendMessage() throws InterruptedException {
        final Department defaultDepartment = new Department();
        jmsTemplate.send(inBoundQueue, new MessageCreator() {

            public Message createMessage(Session session) throws JMSException {

                ObjectMessage objectMessage = session.createObjectMessage();
                objectMessage.setObject(defaultDepartment);
                return objectMessage;
            }
        });
        Thread.sleep(50000000l);
    }
}