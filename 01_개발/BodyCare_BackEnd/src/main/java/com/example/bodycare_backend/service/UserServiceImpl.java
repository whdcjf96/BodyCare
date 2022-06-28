package com.example.bodycare_backend.service;


import com.example.bodycare_backend.dao.UserDao;
import com.example.bodycare_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName : com.example.taegyungsi.service
 * fileName : UserServiceImpl
 * author : kangtaegyung
 * date : 2022/05/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/23         kangtaegyung          최초 생성
 */
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