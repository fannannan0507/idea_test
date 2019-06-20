package com.cboy.mapper;

import com.cboy.pojo.Users;

import java.util.List;

/**
 * @Author: fannn
 * @Date: 2019/6/18 0018
 * @Description: com.cboy.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
