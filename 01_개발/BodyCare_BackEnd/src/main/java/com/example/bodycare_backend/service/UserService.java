package com.example.bodycare_backend.service;

import com.example.bodycare_backend.model.User;

import java.util.Optional;

/**
 * packageName : com.example.taegyungsi.service
 * fileName : UserService
 * author : kangtaegyung
 * date : 2022/05/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/23         kangtaegyung          최초 생성
 */
public interface UserService {

    Boolean save(User user);
}
