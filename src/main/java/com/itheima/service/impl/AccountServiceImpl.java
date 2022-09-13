//package com.itheima.service.impl;
//
//import com.itheima.dao.AccountDao;
//import com.itheima.domain.Account;
//import com.itheima.service.AccountService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public  class AccountServiceImpl implements AccountService {
//    private AccountDao accountDao;
//
//    public AccountServiceImpl(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }
//
//    public void save(Account account){accountDao.save(account);}
//    public void update(Account account){accountDao.update(account);}
//    public void delete(Integer id){accountDao.delete(id);}
//    public  Account findById(Integer id){return accountDao.findById(id);}
//    public List<Account> findAll(){return accountDao.findAll();}
//
//
//
//}
