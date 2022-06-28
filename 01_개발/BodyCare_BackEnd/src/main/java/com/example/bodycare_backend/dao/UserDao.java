package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.userspring.dao
 * fileName : UserDao
 * author : ds
 * date : 2022-06-07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-07         ds          최초 생성
 */
// mybatis 사용시 아래 어노테이션을 붙임
//    인터페이스 구현 => .xml에서 함(스프링에 자동 객체 생성)
@Mapper
public interface UserDao {
//    Todo : 1개 수정 findAll, 2개 추가 findByEmailContaining, selectTotalCount

//    id로 회원 조회 메소드
    Optional<User> findById(Long id);

//    회원 생성 메소드
    long insertUser(User user);

//    회원 수정 메소드
    long updateUser(User user);

//    id로 회원 삭제 메소드
    int deleteUser(Long id);
//    전체 회원 삭제 메소드
    int deleteAll();
}












