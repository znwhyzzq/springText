package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
 //  ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
//         BookDao bookDao=(BookDao)ctx.getBean("bookDao");
        BookDao bookDao=ctx.getBean("bookDao",BookDao.class);
         bookDao.save();
//        BookService bookService=(BookService) ctx.getBean("bookService");
//        bookService.save();
//        DataSource dataSource=(DataSource)  ctx.getBean("dataSource");
//        System.out.println(dataSource);
    }
}
