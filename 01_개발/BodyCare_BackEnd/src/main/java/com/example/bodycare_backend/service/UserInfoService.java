package com.example.bodycare_backend.service;

import com.example.bodycare_backend.model.User;
import com.example.bodycare_backend.model.UserDiet;
import com.example.bodycare_backend.model.UserInfo;

import java.util.List;

/**
 * packageName : com.example.bodycare_backend.service
 * fileName : UserInfoService
 * author : 4571c
 * date : 2022-07-01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-01         4571c          최초 생성
 */
public interface UserInfoService {

    //    활동관리페이지/식단관리에서 활동대사량 계산을 위해 읽어오기
    UserInfo selectAct(Long userId);

    //    운동도우미에서 리드
    UserInfo selectExer(Long userId);


    // 유저정보 저장 메소드(insert)
    UserInfo saveFirst(UserInfo userInfo);

    // 유저정보 저장 메소드(insert)
    UserInfo saveSecond(UserInfo userInfo);


}
