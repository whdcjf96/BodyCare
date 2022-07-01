package com.example.bodycare_backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : com.example.bodycare_backend.model
 * fileName : User
 * author : jc
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         jc          최초 생성
 */
@Getter
@Setter
@ToString
public class User {
    private Long id;
    private String email;
    private String password;
    private String name;
    private char gender;
    private float height;
    private String createdTime;
    private String updateTime;
    private int age;

}
