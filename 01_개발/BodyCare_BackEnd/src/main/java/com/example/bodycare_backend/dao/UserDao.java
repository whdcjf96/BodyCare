package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

/**
 * packageName : com.example.taegyungsi.dao
 * fileName : UserDao
 * author : kangtaegyung
 * date : 2022/05/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/23         kangtaegyung          최초 생성
 */

@Mapper
public interface UserDao {
    //    회원정보(user) insert 메소드
    int registerUser(User user);
}
