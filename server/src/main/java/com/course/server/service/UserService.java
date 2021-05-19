package com.course.server.service;

import com.course.server.domain.User;
import com.course.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public List<User> list() {
        return userMapper.lists();
    }
}
