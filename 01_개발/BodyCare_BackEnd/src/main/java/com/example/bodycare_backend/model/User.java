package com.example.bodycare_backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : com.example.customerspring.model
 * fileName : Customer
 * author : ds
 * date : 2022-06-07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-07         ds          최초 생성
 */
@Getter
@Setter
@ToString
public class User {
//    Long(객체), long(일반자료형) => 8byte 정수형
    private Long id; // 회원아이디
    private char gender; // 성별
    private float height; // 키
    private String name; // 회원 이름
    private String email;  // email
    private String password; // 비빌번호
}











