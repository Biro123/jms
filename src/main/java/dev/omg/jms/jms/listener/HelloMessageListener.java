package dev.omg.jms.jms.listener;

import dev.omg.jms.jms.config.JmsConfig;
import dev.omg.jms.jms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers,
                       Message<HelloWorldMessage> message) {
        System.out.println("Message Received..");
        System.out.println(helloWorldMessage);
    }
}
