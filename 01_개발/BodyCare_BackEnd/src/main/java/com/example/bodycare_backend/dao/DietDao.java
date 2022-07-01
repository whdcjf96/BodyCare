package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.Diet;
import com.example.bodycare_backend.paging.Criteria;

import java.util.List;

/**
 * packageName : com.example.bodycare_backend.dao
 * fileName : DietDao
 * author : jc
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         jc          최초 생성
 */
public interface DietDao {

//    인풋창에서 조회
    List<Diet> selectAll(Criteria criteria);

//    인풋창에서 타이틀별로 검색
    List<Diet> selectByTitle(Criteria criteria);

//    음식 추가
    Long insertDiet(Diet diet);

}
