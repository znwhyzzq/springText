package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configurable
@ComponentScan("com.itheima")
@Import({JdbcConfig.class, MybatisConfig.class})
@PropertySource("jdbc.properties")
public class SpringConfig {

}


