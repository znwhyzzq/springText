//package com.itheima;
//
//import com.itheima.dao.BookDao;
//import com.itheima.service.BookService;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class App2 {
//    public static void main(String[] args) {
////        Resource=new ClassPathResource("applicationContext.xml");
////        BeanFactory bf=new XmlBeanFactory(resource);
////        BookDao bookDao=bf.getBean(BookDao.class);
////        bookDao.save();
//
//        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//       ctx.registerShutdownHook();
//         BookDao bookDao=(BookDao)ctx.getBean("bookDao");
//         bookDao.save();
////         ctx.close();
//        BookService bookService=(BookService) ctx.getBean(BookService.class);
//        bookService.save();
//
//    }
//}
