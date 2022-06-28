package com.example.bodycare_backend.controller;

import com.example.bodycare_backend.model.User;
import com.example.bodycare_backend.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 기본 보안 주소 허용 : http://localhost:8080
@CrossOrigin(origins = "http://localhost:8080")
// @RestController : 통신을 json형태로 주고받고 싶을때 사용
@RestController
// @RequestMapping("/api") : http://localhost:8000/api
@RequestMapping("/api")
public class UserController {

    //    logger 찍기를 위한 객체 만듬
    Logger logger = LoggerFactory.getLogger(this.getClass());

    //  @Autowired : 스프링 객체 하나 받아오기
    @Autowired
    private UserServiceImpl UserService; // 객체정의(null => 스프링객체)

    //    회원 생성 메뉴
    @PostMapping("/Users")
    public ResponseEntity<Object>
    createUser(@RequestBody User User) {

//        save 리턴값 Optional<User> => save(User).get() 객체를 꺼냄
        User savedUser = UserService.save(User).get();
        try {
//            Vue에 객체 + 성공메세지 전송
            return new ResponseEntity<Object>(savedUser, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
//            Vue에 보낼 에러 메세지 전송
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    //    id로 회원 조회 메뉴
    @GetMapping("/Users/{id}")
    public ResponseEntity<Object>
    getUserById(@PathVariable("id") Long id) {
//        id로 회원 조회 하는 서비스를 호출 ( Optional 떼내기 : get() )
        User User = UserService.findById(id).get();

        try {
            if (User != null) {
//                성공시 Vue에 객체 + 성공메세지 전송
                return new ResponseEntity<Object>(User, HttpStatus.OK);
            } else {
//                Vue에 데이터가 없을 경우 Not found 전송
                return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
            }

        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
//            Vue에 에러 메세지 전송
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    //    id 회원 수정 메뉴
//    Vue에서 전송 : url 매개변수 + 객체
//    @PathVariable : url 매개변수을 받는 어노테이션
//    @RequestBody : 객체를 받는 어노테이션
    @PutMapping("/Users/{id}")
    public ResponseEntity<Object> updateUser(
            @PathVariable("id") Long id,
            @RequestBody User User
    ) {
        try {

//            User에 id값 저장
            User.setId(id);
//          save : id가 null일경우  insert , id가 null이 아닐경우 update
//            Optional<User> => User 객체를 꺼낼려면 get() 호출해야함
            User savedUser = UserService.save(User).get();
//          Vue에 db에 저장된 객체 + 상태메세지를 전송(OK)
            return new ResponseEntity<Object>(savedUser, HttpStatus.OK);

        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
//            Vue 에러메세지 전송
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    //    id로 회원 삭제 메뉴
//    /Users/deletion/{id}
    @PutMapping("/Users/deletion/{id}")
    public ResponseEntity<HttpStatus> deleteUser(
            @PathVariable("id") Long id
    ) {
        try {
//            id로 삭제 서비스를 호출(내부적으로 update문이 실행됨)
            UserService.deleteById(id);
//            Vue에 성공메세지
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
// 웹애플리케이션 개발 : 클라이언트(Vue,React,HTML) <-> 서버(SpringBoot, Node)
// Vue(클라이언트) 에 에러메세지를 전송
            return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
        }
    }

}











