package com.example.bodycare_backend.service;


import com.example.bodycare_backend.dao.UserDao;
import com.example.bodycare_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public Boolean save(User user) {
        int queryResult = 0;

        queryResult = userDao.registerUser(user);

        return (queryResult >= 1) ? true : false;
    }
}