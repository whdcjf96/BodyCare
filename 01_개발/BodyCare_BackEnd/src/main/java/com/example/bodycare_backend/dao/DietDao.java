package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.Diet;
import com.example.bodycare_backend.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

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
@Mapper
public interface DietDao {

    //    인풋창에서 조회
    List<Diet> selectAll(Criteria criteria);

    //    인풋창에서 타이틀별로 검색
    List<Diet> selectByTitle(Criteria criteria);

    // id 로 회원 조회 메소드
    Optional<Diet> selectById(Long id);

    //    음식 추가
    Long insertDiet(Diet diet);

}
