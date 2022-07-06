package com.example.bodycare_backend.controller;

import com.example.bodycare_backend.model.User;
import com.example.bodycare_backend.model.UserInfo;
import com.example.bodycare_backend.service.UserInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * packageName : com.example.bodycare_backend.controller
 * fileName : BasicController
 * author : jc
 * date : 2022-07-05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-05         jc          최초 생성
 */
@CrossOrigin(origins = "http://localhost:8081")
// @RestController : 통신을 json 형태로 주고받고 싶을 때 사용
@RestController
// @RequestMapping("/api") : http://localhost:8000/api
@RequestMapping("/api")
public class UserInfoController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserInfoServiceImpl userInfoService;


    @GetMapping("/userInfoAct/{id}")
    public ResponseEntity<Object> getUserInfoAct(@PathVariable("id") Long id){
        UserInfo userInfo= userInfoService.selectAct(id).get();

        try{
            if(userInfo != null){
                return new ResponseEntity<Object>(userInfo, HttpStatus.OK);
            } else {
                return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);

            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/userInfoExer/{id}")
    public ResponseEntity<Object> getUserInfoExer(@PathVariable("id") Long id){
        UserInfo userInfo= userInfoService.selectExer(id).get();

        try{
            if(userInfo != null){
                return new ResponseEntity<Object>(userInfo, HttpStatus.OK);
            } else {
                return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);

            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("userInfoAct")
    public ResponseEntity<Object> createUserInfoAct(@RequestBody UserInfo userInfo){
        UserInfo savedUserInfo = userInfoService.saveAct(userInfo).get();

        try{
            return new ResponseEntity<Object>(savedUserInfo, HttpStatus.OK);
        }catch (Exception e){
            logger.error(e.getMessage(),e);

            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("userInfoAct/{id}")
    public ResponseEntity<Object> updateUserInfoAct(@PathVariable("id") Long id, @RequestBody UserInfo userInfo){
        try{
            userInfo.setUserId(id);
            UserInfo savedUserInfo = userInfoService.saveAct(userInfo).get();

            return new ResponseEntity<Object>(savedUserInfo, HttpStatus.OK);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("userInfoExer/{id}")
    public ResponseEntity<Object> updateUserInfoExer(@PathVariable("id") Long id, @RequestBody UserInfo userInfo){
        try{
            userInfo.setUserId(id);
            UserInfo savedUserInfo = userInfoService.saveExer(userInfo).get();

            return new ResponseEntity<Object>(savedUserInfo, HttpStatus.OK);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

}
