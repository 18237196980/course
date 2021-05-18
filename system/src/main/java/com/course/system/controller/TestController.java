package com.course.system.controller;

import com.course.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public Object get() {
        return "你好";
    }

    @RequestMapping("/list")
    public Object list() {
        return userService.list();
    }
}
