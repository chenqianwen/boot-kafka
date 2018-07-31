package com.example.boot.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * @author： ygl
 * @date： 2018/07/31
 * @Description：
 */
@Data
@Configuration
public class DruidProperties {

    /**############################# 连接池配置 #############################**/
    /**
     * 配置初始化大小、最小、最大
     */
    private int initialSize = 1;
    private int minIdle = 1;
    private int maxActive = 2;
    private int maxWait = 6000;
}