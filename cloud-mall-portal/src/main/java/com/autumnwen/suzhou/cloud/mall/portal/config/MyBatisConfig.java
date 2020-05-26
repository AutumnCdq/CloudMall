package com.autumnwen.suzhou.cloud.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.autumnwen.suzhou.cloud.mall.mapper","com.autumnwen.suzhou.cloud.mall.portal.dao"})
public class MyBatisConfig {
}
