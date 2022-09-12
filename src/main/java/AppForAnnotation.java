//import com.itheima.config.SpringConfig;
//import com.itheima.dao.BookDao;
//import com.itheima.service.BookService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import javax.sql.DataSource;
//
//public class AppForAnnotation {
//    public static void main(String[] args) {
//        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
//        DataSource dataSource=ctx.getBean(DataSource.class);
//        System.out.println(dataSource);
//        BookDao bookDao=(BookDao)ctx.getBean("bookDao");
//        BookDao bookDao2=(BookDao)ctx.getBean("bookDao");
//        System.out.println(bookDao);
//        System.out.println(bookDao2);
//        bookDao.save();
//         ctx.close();
//        BookService bookService=(BookService) ctx.getBean(BookService.class);
//        bookService.save();
//    }
//}
