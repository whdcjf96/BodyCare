package com.example.bodycare_backend.service;

import com.example.bodycare_backend.dao.MypageDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * packageName : com.example.bodycare_backend.service
 * fileName : MyPageServicempl
 * author : ds
 * date : 2022-06-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-28         ds          최초 생성
 */
public class MyPageServicempl implements MypageService{


    //    @Autowired : 스프링에 생성된 객체를 받아옴
    @Autowired
    private MypageDao mypage; // 객체 정의 { null } => 스프링 객체

    //    향후에 로그 찍고 싶을때 사용하는 객체
    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public boolean save(MypageDao mypage) {
        int queryResult = 0;

//        매개변수 tutorial 안의 값을 로그로 출력
        logger.info("tutorial {} : ", mypage);

        if(MypageDao.getName() == null) {

        } else {
//            id 값이 있으면 update 문 실행
            queryResult = MypageDao.updateMypage(mypage);
        }

        return (queryResult >= 1) ? true : false;
    }

}
