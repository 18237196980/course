package com.course.server.mapper;

import com.course.server.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    List<User> lists();
}
