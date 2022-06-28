package com.example.bodycare_backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
public class User {

//  유저 아이디
  private Long id;

//  사용자 이름
  private String name;

//  이메일
//  @Email
  private String email;

//  비밀번호
  private String password;

//  만든시간
  private String createdTime;

//  수정시간
  private String updateTime;

// 성별
  private char gender;
// 키
  private float height;


//  public User(String username, String email, String password) {
//    this.name = name;
//    this.email = email;
//    this.password = password;
//  }
}
