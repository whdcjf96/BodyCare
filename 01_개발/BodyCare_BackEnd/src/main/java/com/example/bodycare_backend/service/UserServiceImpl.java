package com.example.bodycare_backend.service;

import com.example.bodycare_backend.dao.UserDao;
import com.example.bodycare_backend.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.Userspring.service
 * fileName : UserServiceImpl
 * author : ds
 * date : 2022-06-07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-07         ds          최초 생성
 */
// @Service : 스프링에 객체로 생성
@Service
public class UserServiceImpl implements UserService {

//    스프링에 UserDao 이미 생성되어 있음
//    생성된 객체를 받아오는 어노테이션 : @Autowired
    @Autowired
    private UserDao UserDao; // 객체 정의 ( null => 스프링 객체 )

//    나중에 에러 로그 추적을 위해 하나 만들어둠
    Logger logger = LoggerFactory.getLogger(this.getClass());

//    id로 회원 조회 하는 메소드
    @Override
    public Optional<User> findById(long id) {
        return UserDao.findById(id);
    }

//    Todo : 1개 수정 findAll, 1개 추가 findByEmailContaining
//    모든 회원 조회 서비스


    //    회원 생성 / 수정 서비스 ( insert / update )
    @Override
    public Optional<User> save(User user) {
//        db 시퀀스 번호 저장을 위한 변수
        long seqId = 0;

//        매개변수 User 정보 출력
        logger.info("User {}", user);

//        User.getId() 없으면 insert 문 호출( 새로운 회원 생성 )
        if(user.getId() == null) {
            UserDao.insertUser(user);
        }
        //                         있으면 update 문 호출
        else {
            UserDao.updateUser(user);
        }

//        insert 문 후에는 User의 id속성에 값이 저장됨(<selectkey>)
        seqId = user.getId();
        logger.info("seqId {}", seqId);

        return UserDao.findById(seqId);
    }

    @Override
    public boolean deleteById(Long id) {
        int queryResult = 0;

        queryResult = UserDao.deleteUser(id);

        return (queryResult >=1) ? true : false;
    }

    @Override
    public boolean deleteAll() {
        int queryResult = 0;

//        delete / update / insert 문은 결과 실행 후
//        정상 실행되면 건수(삭제/수정/생성)가 결과로 리턴(반환)
        queryResult = UserDao.deleteAll();

        return (queryResult >=1) ? true : false;
    }
}











