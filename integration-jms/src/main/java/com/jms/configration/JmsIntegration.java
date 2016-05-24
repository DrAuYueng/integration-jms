package com.jms.configration;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JmsIntegration {

    @Bean
    public ActiveMQConnectionFactory ConnectionFactory() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        // factory.setBrokerURL(brokerUrl);
        return factory;
    }

    @Bean
    public ActiveMQTopic mqTopic() {
        // return new ActiveMQTopic(jmstopic);
        return null;
    }

    // @Bean
    // public SubscribableChannel cloudBusOutboundChannel() {
    // return new DirectChannel();
    // }
    //
    // @Bean
    // public IntegrationFlow jmsOutboundFlow() {
    // return IntegrationFlows
    // .from(cloudBusOutboundChannel())
    // .handle(Jms.outboundAdapter(ConnectionFactory()).destination(mqTopic()),
    // new Consumer<GenericEndpointSpec<JmsSendingMessageHandler>>() {
    //
    // void accept(GenericEndpointSpec<JmsSendingMessageHandler> spec) {
    // spec.poller(Pollers.fixedDelay(10000).receiveTimeout(0));
    // }
    // }).get();
    // }
}
