package com.example.boot.controller;

import com.example.boot.dao.TestUserMapper;
import com.example.boot.entity.TestUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： ygl
 * @date： 2018/07/31
 * @Description：
 */
@Slf4j
@RequestMapping("/test/user")
@RestController
public class TestUserController {

    @Autowired
    private TestUserMapper testUserMapper;

    @Transactional
    @GetMapping("/{id}")
    public TestUser findById(@PathVariable String id) {
        TestUser testUser1 = testUserMapper.findById("22");
        try {
            log.info("--------waiting----------");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestUser testUser2 = testUserMapper.findById(id);
        return testUser2;
    }
}
