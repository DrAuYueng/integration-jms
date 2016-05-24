/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.integration.main;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;

import com.integration.domain.Department;

public class Main {

    private final static String[] configFilesChannelAdapterDemo = { "/spring-mockrunner.xml", "/spring-int-jms.xml" };

    public static void main(String[] args) throws InterruptedException {

        System.out.println("    Loading Channel Adapter Demo...");
        final GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext(configFilesChannelAdapterDemo);

        final QueueChannel stdinToJmsoutChannel = applicationContext.getBean("outputChannel", QueueChannel.class);
        final Department defaultDepartment = new Department();
        stdinToJmsoutChannel.send(MessageBuilder.withPayload(defaultDepartment).build());

        // final QueueChannel queueChannel =
        // applicationContext.getBean("inputChannel", QueueChannel.class);
        //
        // @SuppressWarnings("unchecked")
        // Message<Department> reply = (Message<Department>)
        // queueChannel.receive(20000);
        // Department out = reply.getPayload();
        // System.out.println("接收到的消息" + out);
        // applicationContext.close();
        Thread.sleep(50000000l);
    }
}
