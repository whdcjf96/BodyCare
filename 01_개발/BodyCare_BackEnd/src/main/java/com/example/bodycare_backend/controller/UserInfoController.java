package com.example.bodycare_backend.controller;

import com.example.bodycare_backend.service.UserInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
