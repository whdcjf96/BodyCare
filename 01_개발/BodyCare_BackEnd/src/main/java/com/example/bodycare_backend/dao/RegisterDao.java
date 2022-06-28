package com.example.bodycare_backend.dao;

import com.example.dongsungsi.model.Register;
import com.example.dongsungsi.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.customerspring.dao
 * fileName : RegisterDao
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
public interface RegisterDao {
//    Todo : 1개 수정 findAll, 2개 추가 findByEmailContaining, selectTotalCount
//    전체 회원 조회 메소드
//    Todo : findAll() -> findAll(Criteria criteria)
    List<Register> findAll(Criteria criteria);

//    Email로 검색 메소드
    List<Register> findByEmailContaining(Criteria criteria);

//    Email로 검색시 총 건수 메소드
    int selectTotalCount(String email);

//    id로 회원 조회 메소드
    Optional<Register> findById(Long id);

//    회원 생성 메소드
    long insertRegister(Register customer);

//    회원 수정 메소드
    long updateRegister(Register customer);

//    id로 회원 삭제 메소드
    int deleteRegister(Long id);
//    전체 회원 삭제 메소드
    int deleteAll();
}












