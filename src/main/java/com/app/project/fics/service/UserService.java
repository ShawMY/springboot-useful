package com.app.project.fics.service;

import com.app.project.fics.dao.UserMapper;
import com.app.project.fics.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<Users> selectUsers(){
        return userMapper.selectUser();
    }
}
