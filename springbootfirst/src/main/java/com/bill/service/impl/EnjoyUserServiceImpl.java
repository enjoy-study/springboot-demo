package com.bill.service.impl;

import com.bill.dao.EnjoyUserMapper;
import com.bill.model.EnjoyUser;
import com.bill.service.IEnjoyUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author Bill
 * @Date 2019/3/16 17:35
 * @Description
 */
@Service
public class EnjoyUserServiceImpl implements IEnjoyUserService{

    @Resource
    private EnjoyUserMapper enjoyUserMapper;

    @Override
    public boolean login(String username, String passwd) {
        EnjoyUser user = enjoyUserMapper.findByUsernameAndPasswd(username,passwd);
        if(null != user) {
            return true;
        }
        return false;
    }

    @Override
    public boolean register(String username, String passwd) {
        EnjoyUser user = new EnjoyUser();
        user.setUsername(username);
        user.setPasswd(passwd);
        int i = enjoyUserMapper.insert(user);
        if(i > 0) {
            return true;
        }
        return false;

    }


    @Override
    @Transactional
    public void batchAdd(String username, String passwd) {
        EnjoyUser user1 = new EnjoyUser();
        user1.setUsername(username);
        user1.setPasswd(passwd);
        enjoyUserMapper.insert(user1);

        int i = 10/0;

        EnjoyUser user2 = new EnjoyUser();
        user2.setUsername(username);
        user2.setPasswd(passwd);
        enjoyUserMapper.insert(user2);
    }
}
