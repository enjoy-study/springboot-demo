package com.bill.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Bill
 * @Date 2019/3/16 18:40
 * @Description
 */
@RestController
public class BaseController {

    @RequestMapping("/404.do")
    public String error_404() {
        return "你的页面被吃了";
    }

}
