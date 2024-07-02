package com.trading.wikimedia.producer.producer;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//this class sends the topic to the Apache kafka
@Slf4j
@Service
@RequiredArgsConstructor
public class WikimediaProducer {
    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String msg){
       // log.info(format("Sending message to tradeFinance Topic::%s",msg));
        kafkaTemplate.send("wikimedia-stream",msg);
    }
}
