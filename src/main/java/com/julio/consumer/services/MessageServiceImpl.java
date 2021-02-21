package com.julio.consumer.services;

import com.julio.consumer.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService{

    @Override
    public void printMessage(Message message) {
        log.info(message.getMsg());
    }

    @Bean
    public Consumer<Message> messageListen() {
        return this::printMessage;
    }
}
