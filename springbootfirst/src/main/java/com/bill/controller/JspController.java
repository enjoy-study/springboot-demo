package com.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Bill
 * @Date 2019/3/17 17:01
 * @Description
 */
@Controller
@RequestMapping("/jsp")
public class JspController {

    @RequestMapping("/hi")
    public String sayHello() {
        return "index";
    }
}
