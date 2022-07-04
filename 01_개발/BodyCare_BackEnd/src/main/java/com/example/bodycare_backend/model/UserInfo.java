package com.example.bodycare_backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : com.example.bodycare_backend.model
 * fileName : UserInfo
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
public class UserInfo {
//    유저테이블 pfk
    private Long userId;
    private float weight;
    private float bodyFat;
    private float muscleMass;
    private float kcalStart;
    private float kcal;
    private float kcalWeekly;
    private float weightGoal;
    private float weightLoss;
    private String createdTime;
    private String updateTime;

//    join 추가 컬럼
    private float height;
    private int age;
    private char gender;
    private Long intensity;
    private float activityTime;

}
