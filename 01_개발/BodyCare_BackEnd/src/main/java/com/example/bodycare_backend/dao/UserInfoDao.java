package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * packageName : com.example.bodycare_backend.dao
 * fileName : UserInfoDao
 * author : jc
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         jc          최초 생성
 */
@Mapper
public interface UserInfoDao {

//    기본페이지 데이터 입력
    Long insertUserBasic(UserInfo userInfo);

//    활동관리페이지/식단관리에서 활동대사량 계산을 위해 읽어오기
    UserInfo selectAct(Long userId);

//    운동도우미에서 리드
    UserInfo selectExer(Long userId);


    Long updateUserAct(UserInfo userInfo);

//    운동도우미에서 업데이트
    Long updateUserExer(UserInfo userInfo);


}
