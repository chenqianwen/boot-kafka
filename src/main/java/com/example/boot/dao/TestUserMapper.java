package com.example.boot.dao;

import com.example.boot.entity.TestUser;
import org.apache.ibatis.annotations.Select;

/**
 * @author： ygl
 * @date： 2018/07/31
 * @Description：
 */
public interface TestUserMapper {

    @Select("SELECT * FROM test_user WHERE id = #{id}")
    TestUser findById(String id);

}
