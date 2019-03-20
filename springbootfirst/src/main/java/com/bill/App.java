package com.bill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author Bill
 * @Date 2019/3/15 11:32
 * @Description
 */
//@EnableAutoConfiguration  引入第三方组件，指定spring默认加载的组件位于META-INF/spring.factories
@SpringBootApplication
@MapperScan("com.bill.dao")
@EnableTransactionManagement  // 这一行加不加都行
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
