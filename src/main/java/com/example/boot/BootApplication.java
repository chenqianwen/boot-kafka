package com.example.boot;

import com.example.boot.kafka.KafkaSender;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@MapperScan("com.example.boot.dao")
@SpringBootApplication
@EnableScheduling
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Autowired
    private KafkaSender kafkaSender;

    //然后每隔1分钟执行一次
    @Scheduled(fixedRate = 1000 * 60)
    public void testKafka() {
        kafkaSender.sendTest();
    }
}
