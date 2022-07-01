package com.example.bodycare_backend.dao;

import org.apache.ibatis.annotations.Mapper;
import com.example.bodycare_backend.model.UserDiet;

import java.util.List;

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
public interface UserDietDao {

//    식단관리페이지에서 아침조회
    List<UserDiet> selectById(Long id);

//    인풋창에서 데이터 삽입
    Long insertDiet(UserDiet userDiet);

    Long updateDiet(UserDiet userDiet);

    Long deleteDiet(Long id);
    


}
