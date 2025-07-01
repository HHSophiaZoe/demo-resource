package com.hit.demo.ui.consumer;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ConsumerTest {

    @SneakyThrows
    @KafkaListener(
            topics = "TEST_ACK",
            groupId = "${messaging.kafka.consumer.group-id}",
            autoStartup = "true")
    public void test(@Payload String message) {
        Thread.sleep(20000);
        log.info("Received message='{}'", message);
    }

}
