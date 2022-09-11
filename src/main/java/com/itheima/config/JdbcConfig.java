package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
//@Configurable
public class JdbcConfig {
    @Value("com.microsoft.sqlserver.jdbc.SQLServerDriver")
    private String driver;
    @Value("jdbc:sqlserver://localhost:1433/test2")
    private String url;
    @Value("sa")
    private String userName;
    @Value("123456")
    private String password;
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
