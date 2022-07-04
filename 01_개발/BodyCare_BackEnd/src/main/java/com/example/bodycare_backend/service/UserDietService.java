package com.example.bodycare_backend.service;

import com.example.bodycare_backend.model.UserDiet;

import java.util.List;

/**
 * packageName : com.example.bodycare_backend.service
 * fileName : UserDietService
 * author : 4571c
 * date : 2022-07-01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-01         4571c          최초 생성
 */
public interface UserDietService {
    //    식단관리페이지에서 아침조회
    List<UserDiet> selectById(Long id);

    boolean deleteDiet(Long id);

    // 인풋창 저장 메소드(insert)
    List<UserDiet> save(UserDiet userDiet);
}
