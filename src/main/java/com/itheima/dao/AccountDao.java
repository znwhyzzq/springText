package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.*;

import java.awt.*;
import java.util.List;

public interface AccountDao {
//    @Insert("insert into tbl_account(name,money)values(#{name},#{money})")
//    void save(Account account);
//    @Delete("delete from tbl_account where id=#{id}")
//    void delete(Integer id);
    @Update("update tbl_account set money=money+#{money} where name=#{name}")
    void inMoney(@Param("name") String name,@Param("money") Double money);
    @Update("update tbl_account set money=money-#{money} where name=#{name}")
    void outMoney(@Param("name") String name,@Param("money") Double money);
//    @Select("select * from tbl_account")
//    List<Account> findAll();
//
//    @Select("select * from tbl_account where id=#{id}")
//    Account findById(Integer id);
}
