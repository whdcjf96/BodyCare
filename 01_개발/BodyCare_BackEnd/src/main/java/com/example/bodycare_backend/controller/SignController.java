package com.example.bodycare_backend.controller;

import com.example.bodycare_backend.model.JwtResponse;
import com.example.bodycare_backend.model.MessageResponse;
import com.example.bodycare_backend.model.User;
import com.example.bodycare_backend.security.JwtTokenProvider;
import com.example.bodycare_backend.service.CustomUserDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName : com.example.bodycare_backend.controller
 * fileName : SignController
 * author : ds
 * date : 2022-06-20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-20         ds          최초 생성
 */
@RestController
@RequestMapping("/api/auth")
public class SignController {
//
    Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired : springboot의 객체를 하나 받아오기(싱글톤 :공유객체)
//                 null => 스프링 객체


//    패스워드 암호화 변수(스프링부트에서 제공함)
    @Autowired
    private PasswordEncoder passwordEncoder;



//    회원가입 메뉴( sign up ) : insert 문 호출
    @PostMapping(value="/signup")
    public ResponseEntity<?> addUser( @RequestBody User signupUser ) {
//        임시 유저 객체 정의
        User user = signupUser;
//        signupUser.getPassword() : 암호화되기전 패스워드
//        passwordEncoder.encode : 패스워드 암호화가 됨
        user.setPassword(passwordEncoder.encode(signupUser.getPassword()));

//        DB insert 할 서비스(메소드) 호출
        int result = customUserDetailService.signInUser(user);

//        DB insert 성공
        if( result == 1) {
//            성공메세지 전송
            return ResponseEntity
                    .ok(new MessageResponse("User registered successfully!"));
        } else if( result == -1 ) {
//            db에 유저가 있으므로 있다고 응답을 전송
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse
                            ("Error: Name is already taken!"));
        } else {
//            DB 에러났으므로 관리자에게 문의하세요 응답 보냄
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse
                            ("Error: Ask system admin"));
        }
    }
}










