package com.example.bodycare_backend.controller;

import com.example.bodycare_backend.model.Register;
import com.example.bodycare_backend.service.RegisterServiceImpl;
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
public class RegisterController {

    //    logger 찍기를 위한 객체 만듬
    Logger logger = LoggerFactory.getLogger(this.getClass());

    //  @Autowired : 스프링 객체 하나 받아오기
    @Autowired
    private RegisterServiceImpl RegisterService; // 객체정의(null => 스프링객체)

    //    모든 회원 조회 메뉴
    @GetMapping("/Registers")
    public ResponseEntity<Map<String,Object>>
            getAllRegistersPage(Criteria criteria) {

        logger.info("criteria(vue에서 전송됨) {}", criteria);
//        모든 회원 조회 서비스 호출 : findByEmailContaining
//        email 없으면 findAll , 있으면  findByEmailContaining
        List<Register> Registers
                = RegisterService.findByEmailContaining(criteria);
        logger.info("Registers {}", Registers);

        try {
            if(Registers.isEmpty()) {
//                Vue로 내용물 없다고 전송(HttpStatus.NO_CONTENT)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            logger.info("실행 후 : criteria {}", criteria);

//            Todo : Map 에 넣어 객체과 페이지정보를 Vue로 보냄
            Map<String, Object> response = new HashMap<>();
            response.put("Registers", Registers);
            response.put("currentPage", criteria.getPage());
            response.put("totalItems", criteria.getTotalItems());
            response.put("totalPages", criteria.getTotalPages());

//            Vue에 성공메세지 + 객체를 전송 + 페이지정보 전송
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
//            Vue 에 에러메세지 전송
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    회원 생성 메뉴
    @PostMapping("/Registers")
    public ResponseEntity<Object>
    createRegister(@RequestBody Register Register) {

//        save 리턴값 Optional<Register> => save(Register).get() 객체를 꺼냄
        Register savedRegister = RegisterService.save(Register).get();
        try {
//            Vue에 객체 + 성공메세지 전송
            return new ResponseEntity<Object>(savedRegister, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
//            Vue에 보낼 에러 메세지 전송
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    //    id로 회원 조회 메뉴
    @GetMapping("/Registers/{id}")
    public ResponseEntity<Object>
    getRegisterById(@PathVariable("id") Long id) {
//        id로 회원 조회 하는 서비스를 호출 ( Optional 떼내기 : get() )
        Register Register = RegisterService.findById(id).get();

        try {
            if (Register != null) {
//                성공시 Vue에 객체 + 성공메세지 전송
                return new ResponseEntity<Object>(Register, HttpStatus.OK);
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
    @PutMapping("/Registers/{id}")
    public ResponseEntity<Object> updateRegister(
            @PathVariable("id") Long id,
            @RequestBody Register Register
    ) {
        try {

//            Register에 id값 저장
            Register.setId(id);
//          save : id가 null일경우  insert , id가 null이 아닐경우 update
//            Optional<Register> => Register 객체를 꺼낼려면 get() 호출해야함
            Register savedRegister = RegisterService.save(Register).get();
//          Vue에 db에 저장된 객체 + 상태메세지를 전송(OK)
            return new ResponseEntity<Object>(savedRegister, HttpStatus.OK);

        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
//            Vue 에러메세지 전송
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    //    id로 회원 삭제 메뉴
//    /Registers/deletion/{id}
    @PutMapping("/Registers/deletion/{id}")
    public ResponseEntity<HttpStatus> deleteRegister(
            @PathVariable("id") Long id
    ) {
        try {
//            id로 삭제 서비스를 호출(내부적으로 update문이 실행됨)
            RegisterService.deleteById(id);
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











