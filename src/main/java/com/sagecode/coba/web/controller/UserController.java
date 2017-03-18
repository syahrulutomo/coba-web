package com.sagecode.coba.web.controller;

import com.sagecode.coba.web.entity.User;
import com.sagecode.coba.web.entity.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserDao userDao;
    
    @RequestMapping("/")
    public Page<User> semuaUser(Pageable page){
        return userDao.findAll(page);
    }
}
