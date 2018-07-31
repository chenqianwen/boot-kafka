package com.example.boot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author： ygl
 * @date： 2018/07/31
 * @Description：
 */
@Slf4j
@Component
public class KafkaConsumer {

    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        log.info("test topic message : {}", message);
    }
}