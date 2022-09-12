//package com.itheima.Factory;
//
//import com.itheima.dao.BookDao;
//import com.itheima.dao.impl.BookDaoImpl;
//import org.springframework.beans.factory.FactoryBean;
//
//public  class BookDaoFct implements FactoryBean<BookDao> {
//
//    @Override
//    public BookDao getObject() throws Exception {
//        return new BookDaoImpl();}
//
//    @Override
//    public Class<?> getObjectType() {
//        return BookDao.class;
//    }
//}
