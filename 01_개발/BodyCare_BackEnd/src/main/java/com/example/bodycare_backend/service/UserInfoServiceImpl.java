package com.example.bodycare_backend.service;

import com.example.bodycare_backend.dao.UserInfoDao;
import com.example.bodycare_backend.model.User;
import com.example.bodycare_backend.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * packageName : com.example.bodycare_backend.service
 * fileName : UserInfoServiceImpl
 * author : 4571c
 * date : 2022-07-01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-01         4571c          최초 생성
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;

    // 나중에 에러 로그 추적을 위해 하나 만들어둠
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public UserInfo selectAct(Long userId) {
        return userInfoDao.selectAct(userId);
    }

    @Override
    public UserInfo selectExer(Long userId) {
        return userInfoDao.selectExer(userId);
    }

    @Override
    public UserInfo saveFirst(UserInfo userInfo) {
        // db 시퀀스 번호 저장을 위한 변수
        long seqId = 0;

        // 매개변수 userInfo 정보 출력
        logger.info("userInfo {}", userInfo);

        // customer.getId() 없으면 insert 문 호출(새로운 회원 생성)
        if (userInfo.getUserId() == null) {
            userInfoDao.insertUserBasic(userInfo);
        }
        //                  있으면 update 문 호출
//        else {
//            complainDao.updateComplain(complain);
//        }

        // insert 문 후에는 customer 의 id 속성에 값이 저장됨(<selectkey>)
        seqId = userInfo.getUserId();
        logger.info("seqId {}", seqId);

        return userInfoDao.findByIdF(seqId);
    }

    @Override
    public UserInfo saveSecond(UserInfo userInfo) {
        // db 시퀀스 번호 저장을 위한 변수
        long seqId = 0;

        // 매개변수 userInfo 정보 출력
        logger.info("userInfo {}", userInfo);

        // customer.getId() 없으면 insert 문 호출(새로운 회원 생성)
        if (userInfo.getUserId() == null) {
            userInfoDao.insertUserExer(userInfo);
        }
        //                  있으면 update 문 호출
//        else {
//            complainDao.updateComplain(complain);
//        }

        // insert 문 후에는 customer 의 id 속성에 값이 저장됨(<selectkey>)
        seqId = userInfo.getUserId();
        logger.info("seqId {}", seqId);

        return userInfoDao.findByIdS(seqId);
    }
}
