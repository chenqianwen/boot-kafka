package com.example.boot.test;

import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;

/**
 * @author： ygl
 * @date： 2018/07/31
 * @Description：
 * 单个测试
 */
public class AloneTest {
    public static RestTemplate restTemplate = new RestTemplate();
    public static String url = "http://localhost:8080/test/user/11";

    public static void main(String[] args) {
        String body = restTemplate.getForEntity(url, String.class).getBody();
        System.out.println("-----------------------------"+body);
    }
}
