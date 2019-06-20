package com.cboy.service.impl;

import com.cboy.mapper.UsersMapper;
import com.cboy.pojo.Users;
import com.cboy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }
}
