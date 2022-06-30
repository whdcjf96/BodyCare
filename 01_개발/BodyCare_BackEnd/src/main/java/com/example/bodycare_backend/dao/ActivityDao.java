package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.Activity;
import com.example.bodycare_backend.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.bodycare_backend.dao
 * fileName : activityDao
 * author : 4571c
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         4571c          최초 생성
 */
@Mapper
public interface ActivityDao {
    // 전체 행동 조회 메소드
    List<Activity> findAll(Criteria criteria);

    // id 로 회원 조회 메소드
    Optional<Activity> findById(Long id);

    // 활동명에 따른 데이터 건수를 세는 메소드
    public int selectTotalCount(String activity);

}
