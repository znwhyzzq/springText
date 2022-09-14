//package com.itheima;
//
//import com.itheima.config.SpringConfig;
//import com.itheima.dao.BookDao;
//import com.itheima.service.BookService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class App {
//    public static void main(String[] args) {
////         ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
////         ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
////         BookDao bookDao=(BookDao)ctx.getBean("bookDao");
////         BookDao bookDao=ctx.getBean("bookDao",BookDao.class);
////         bookDao.save();
////        BookService bookService=(BookService) ctx.getBean("bookService");
////        bookService.save();
////        DataSource dataSource=(DataSource)  ctx.getBean("dataSource");
////        System.out.println(dataSource);
//        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao= ctx.getBean(BookDao.class);
//        String name=bookDao.findName(100);
//        System.out.println(name);;
//
//    }
//}
