package com.bill.test;

import com.bill.App;
import com.bill.dao.EnjoyUserMapper;
import com.bill.model.EnjoyUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author Bill
 * @Date 2019/3/15 18:55
 * @Description
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Resource
    public EnjoyUserMapper enjoyUserMapper;

    @Test
    public void testAdd() {
        EnjoyUser enjoyUser = new EnjoyUser();
        enjoyUser.setPasswd("124");
        enjoyUser.setUsername("lzb");
        enjoyUserMapper.insert(enjoyUser);
    }

    @Test
    public void testFindUser() {
        EnjoyUser enjoyUser = enjoyUserMapper.findByUsernameAndPasswd("lzb", "123");
        System.out.println(enjoyUser);
    }

//    @Test
//    public void testBatchAdd() {
//        enjoyUserMapper.
//    }

}
