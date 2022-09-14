package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.io.IOException;

public interface AccountService {
    @Transactional(rollbackFor = {IOException.class})
    public  void trsnafer(String out,String in,Double money) throws IOException;
}
