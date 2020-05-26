package com.autumnwen.suzhou.cloud.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.autumnwen.suzhou.cloud.mall.mapper","com.autumnwen.suzhou.cloud.mall.search.dao"})
public class MyBatisConfig {
}
