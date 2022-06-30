package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.bodycare_backend.dao
 * fileName : UserDao
 * author : jc
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         jc          최초 생성
 */
@Mapper
public interface UserDao {

    List<User> findAll();

    User findById(Long id);

    User findByEmail(String email);

    Long insertUser(User user);

    Long deleteUser(String email);
}
