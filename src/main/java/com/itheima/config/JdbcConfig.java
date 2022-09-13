//package com.itheima.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
//public class JdbcConfig {
//    @Value("${jdbc.driver}")
//    private String driver;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.userName}")
//    private String userName;
//    @Value("${jdbc.password}")
//    private String password;
//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource ds = new DruidDataSource();
//        ds.setDriverClassName(driver);
//        ds.setUrl(url);
//        ds.setUsername(userName);
//        ds.setPassword(password);
//        return ds;
//    }
////    public DataSource dataSource(BookDao bookDao) {
////        System.out.println(bookDao);
////        DruidDataSource ds = new DruidDataSource();
////        ds.setDriverClassName(driver);
////        ds.setUrl(url);
////        ds.setUsername(userName);
////        ds.setPassword(password);
////        return ds;
////    }
//}
