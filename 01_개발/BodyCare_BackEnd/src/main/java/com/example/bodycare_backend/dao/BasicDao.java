package com.example.bodycare_backend.dao;

import com.example.bodycare_backend.model.Basic;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.bodycare_backend.dao
 * fileName : BasicDao
 * author : 4571c
 * date : 2022-06-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-28         4571c          최초 생성
 */
public class BasicDao {
    // 제목 검색을 위한 메소드
    public Basic findByEmailContaining(Basic basic);

    // 전체 회원 조회 메소드
    List<Customer> findAll(Criteria criteria);

    // 이메일에 따른 데이터 건수를 세는 메소드
    public int selectTotalCount(String email);

    // id 로 회원 조회 메소드
    Optional<Customer> findById(Long id);

    // 회원 생성 메소드
    long insertCustomer(Customer customer);

    // 회원 수정 메소드
    long updateCustomer(Customer customer);
}
