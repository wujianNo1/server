package com.itbaizhan.mapper;

import com.itbaizhan.pojo.User;

public interface UserMapper {
    User loadUserByUsername(String username);
}
