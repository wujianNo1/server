package com.itbaizhan.service;

import com.itbaizhan.mapper.UserMapper;
import com.itbaizhan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User loadUserByUsername(String username){
        return userMapper.loadUserByUsername(username);
    }
}
