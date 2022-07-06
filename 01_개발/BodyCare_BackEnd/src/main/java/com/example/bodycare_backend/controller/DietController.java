package com.example.bodycare_backend.controller;

import com.example.bodycare_backend.model.Activity;
import com.example.bodycare_backend.model.Diet;
import com.example.bodycare_backend.model.UserActivity;
import com.example.bodycare_backend.model.UserDiet;
import com.example.bodycare_backend.paging.Criteria;
import com.example.bodycare_backend.service.ActivityServiceImpl;
import com.example.bodycare_backend.service.DietServiceImpl;
import com.example.bodycare_backend.service.UserActivityServiceImpl;
import com.example.bodycare_backend.service.UserDietServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName : com.example.bodycare_backend.controller
 * fileName : ActivityController
 * author : 4571c
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         4571c          최초 생성
 */
@CrossOrigin(origins = "http://localhost:8081")
// @RestController : 통신을 json 형태로 주고받고 싶을 때 사용
@RestController
// @RequestMapping("/api") : http://localhost:8000/api
@RequestMapping("/api")
public class DietController {
    // logger 찍기를 위한 객체 만듬
    Logger logger = LoggerFactory.getLogger(this.getClass());

    // @Autowired : 스프링 객체 하나 받아오기
    @Autowired
    private DietServiceImpl dietService; // 객체 정의( null => 스프링 객체)

    @Autowired
    private UserDietServiceImpl userDietService;

    // 모든 회원 조회 메뉴
    @GetMapping("/diets")
    public ResponseEntity<Map<String,Object>> getAllDiets(Criteria criteria) {
        logger.info("criteria {}", criteria);
        // 모든 회원 조회 서비스 호출

        try {
            List<Diet> diets = dietService.findByTitleContaining(criteria);

            if (diets.isEmpty()) {
                // Vue 성공메세지 + 객체를 전송
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            logger.info("criteria {}", criteria);
            Map<String, Object> response = new HashMap<>();
            response.put("diets", diets);
            // page : 현재 페이지
            response.put("currentPage", criteria.getPage());
            // totalItems : 총 데이터 건수
            response.put("totalItems", criteria.getTotalItems());
            // totalPages : 총 페이지 개수
            response.put("totalPages", criteria.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            // Vue 에 에러메세지 전송
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    @PostMapping("/diets")
//    public ResponseEntity<Object>
//    insertActivities(@RequestBody UserDiet userDiet){
//        UserDiet savedUD = userDietService.save(userDiet).get();
//        try{
//            return new ResponseEntity<Object>(savedUD, HttpStatus.OK);
//        }catch (Exception e){
//            logger.error(e.getMessage(),e);
//            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @DeleteMapping("activities/deletion/{id}")
//    public ResponseEntity<HttpStatus> deleteActivities(@PathVariable("id") Long id){
//        try{
//            userActivityService.deleteById(id);
//            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
//        }catch (Exception e){
//            logger.error(e.getMessage(),e);
//            return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
//        }
//    }
}
