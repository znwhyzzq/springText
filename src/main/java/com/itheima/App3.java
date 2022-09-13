//package com.itheima;
//
//import com.itheima.dao.AccountDao;
//import com.itheima.domain.Account;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import java.io.IOException;
//import java.io.InputStream;
//import static org.apache.ibatis.io.Resources.getResourceAsStream;
//
//
//public class App3 {
//    public static void main(String[] args) throws IOException {
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=  new SqlSessionFactoryBuilder();
//        InputStream inputStream= getResourceAsStream("SqlMapConfig.xml.bak");
//        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//        AccountDao accountDao=sqlSession.getMapper(AccountDao.class);
//        Account ac =accountDao.findById(1);
//        System.out.println(ac);
//        sqlSession.close();
//    }
//}
