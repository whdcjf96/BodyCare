package com.example.bodycare_backend.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * packageName : com.example.bodycare_backend.dao
 * fileName : UserDiet
 * author : jc
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         jc          최초 생성
 */
@Mapper
public interface UserDiet {

//    식단관리페이지에서 조회
    UserDiet selectById(Long id);

//    인풋창에서 데이터 삽입
    Long insertDiet(UserDiet userDiet);

}
