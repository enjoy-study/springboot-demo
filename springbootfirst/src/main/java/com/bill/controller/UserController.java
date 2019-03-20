package com.bill.controller;

import com.bill.dao.EnjoyUserMapper;
import com.bill.service.IEnjoyUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Bill
 * @Date 2019/3/15 12:35
 * @Description
 */
@RestController
public class UserController {

    private EnjoyUserMapper enjoyUserMapper;
    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Resource
    private IEnjoyUserService enjoyUserService;

    @RequestMapping("/hello")
    public String sayHello() {
        log.debug("test log ......");
        return "hello";
    }

    @RequestMapping("/add")
    public void addUser() {

    }

    @RequestMapping("/batchAdd")
    public String batchAdd(String username, String passwd) {
        enjoyUserService.batchAdd(username, passwd);
        return "success";
    }
}
