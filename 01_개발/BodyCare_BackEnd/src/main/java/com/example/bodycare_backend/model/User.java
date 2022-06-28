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
//  @NotBlank
//  @Size(max=20)
  private String username;

//  이메일
//  @NotBlank
//  @Size(max=50)
//  @Email
  private String email;

//  비밀번호
//  @NotBlank
//  @Size(max=120)
  private String password;

//  todo : role column 추가 할것
//  todo : role 변수 추가 할것 테스트
//  DB 역할 컬럼
  private String role;
// 성별
  private char gender;
// 키
  private float height;

//  SpringSecuriry 역활
//  private Set<Role> roles = new HashSet<>();
  private Set<String> roles = new HashSet<>();

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }
}
