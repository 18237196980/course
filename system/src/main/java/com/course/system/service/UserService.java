package com.course.system.service;

import com.course.system.domain.User;
import com.course.system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> list() {
        return userMapper.list();
    }
}
