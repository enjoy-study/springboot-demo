package com.bill.service;

import org.springframework.stereotype.Service;

/**
 * @Author Bill
 * @Date 2019/3/16 17:34
 * @Description
 */
public interface IEnjoyUserService {
    boolean login(String username, String passwd);
    boolean register(String username, String passwd);
    void batchAdd(String username, String passwd);
}
