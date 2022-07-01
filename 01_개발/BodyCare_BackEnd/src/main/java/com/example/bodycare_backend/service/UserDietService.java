package com.example.bodycare_backend.service;

import com.example.bodycare_backend.dao.UserDietDao;
import com.example.bodycare_backend.model.Diet;
import com.example.bodycare_backend.model.UserDiet;

import java.util.List;
import java.util.Optional;

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
    List<UserDiet> selectByIdM(Long id);
    //    식단관리페이지에서 점심조회
    List<UserDiet> selectByIdL(Long id);
    //    식단관리페이지에서 저녁조회
    List<UserDiet> selectByIdD(Long id);
    //    식단관리페이지에서 간식조회
    List<UserDiet> selectByIdS(Long id);

    // 인풋창 저장 메소드(insert)
    Optional<UserDiet> save(UserDiet userDiet);
}
