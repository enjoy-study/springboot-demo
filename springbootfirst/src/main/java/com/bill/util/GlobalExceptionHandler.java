package com.bill.util;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Bill
 * @Date 2019/3/16 18:31
 * @Description
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public String exceptionHandler() {
        return "我是异常类";
    }

    /**
     * 代替web.xml里的通用错误页面
     * 自定义web容器
     * WebServerFactoryCustomizer 容器定制化类
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {

        WebServerFactoryCustomizer<ConfigurableWebServerFactory> result = new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory configurableWebServerFactory) {
                ErrorPage errorPage = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");//定义一个404错误返回页面
                configurableWebServerFactory.addErrorPages(errorPage);
            }
        };
        return result;
    }

}
