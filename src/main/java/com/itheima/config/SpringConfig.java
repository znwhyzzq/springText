package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configurable
@ComponentScan("com.itheima")
@EnableAspectJAutoProxy
//@Import({JdbcConfig.class, MybatisConfig.class})
//@PropertySource("jdbc.properties")
public class SpringConfig {

}


