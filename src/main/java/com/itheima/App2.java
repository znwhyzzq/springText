package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.userDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        ctx.registerShutdownHook();
         BookDao bookDao=(BookDao)ctx.getBean("bookDao");
         bookDao.save();
//         ctx.close();
//        BookService bookService=(BookService) ctx.getBean("bookService");
//        bookService.save();
    }
}
