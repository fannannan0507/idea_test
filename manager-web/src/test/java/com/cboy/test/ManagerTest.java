package com.cboy.test;

import com.cboy.mapper.UsersMapper;
import com.cboy.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(20);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);
    }
}
