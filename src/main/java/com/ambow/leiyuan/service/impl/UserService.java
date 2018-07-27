package com.ambow.leiyuan.service.impl;

import com.ambow.leiyuan.dao.UserMapper;
import com.ambow.leiyuan.entity.User;
import com.ambow.leiyuan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService implements IUserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public int newUser(User user) {
        return mapper.insert(user);
    }
}
