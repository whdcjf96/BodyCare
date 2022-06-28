package com.example.bodycare_backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : com.example.bodycare_backend.model
 * fileName : Basic
 * author : 4571c
 * date : 2022-06-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-28         4571c          최초 생성
 */
@Getter
@Setter
@ToString
public class Basic {
    private int userId; // 유저 아이디
    private Long weight; // 체중
    private Long bodyFat; // 체지방량
    private Long muscleMass; // 골격근량
    private String createdTime; // 생성날짜
}
