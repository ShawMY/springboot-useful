package com.app.project.fics.controller;

import com.app.project.fics.model.Users;
import com.app.project.fics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    public List<Users> getAllUser(){
        return userService.selectUsers();
    }
}
