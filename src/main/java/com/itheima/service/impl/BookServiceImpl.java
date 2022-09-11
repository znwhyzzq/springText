package com.itheima.service.impl;
import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.dao.impl.userDaoImpl;
import com.itheima.dao.userDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
//    private userDao;
//public  BookServiceImpl(BookDao bookDao){
//    this.bookDao=bookDao;
////    this.userDao=userDao;
//}

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
//        userDao.save();
    }

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//
//    @Override
//    public void destroy() throws Exception {
////        System.out.println("1212");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
////        System.out.println("32121");
//
//    }
//
//    public void setUserDao(userDaoImpl userDao) {
//        this.userDao = userDao;
//    }
}