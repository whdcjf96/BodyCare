package com.example.bodycare_backend.service;

import com.example.bodycare_backend.dao.UserDietDao;
import com.example.bodycare_backend.model.UserDiet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.bodycare_backend.service
 * fileName : UserDietServiceImpl
 * author : 4571c
 * date : 2022-07-01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-01         4571c          최초 생성
 */
@Service
public class UserDietServiceImpl implements UserDietService {

    @Autowired
    private UserDietDao userDietDao;

    // 나중에 에러 로그 추적을 위해 하나 만들어둠
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<UserDiet> selectById(Long id) {
        return userDietDao.selectById(id);
    }


    @Override
    public Optional<UserDiet> save(UserDiet userDiet) {
        // db 시퀀스 번호 저장을 위한 변수
        long seqId = 0;

        // 매개변수 userDiet 정보 출력
        logger.info("userDiet {}", userDiet);

        // customer.getId() 없으면 insert 문 호출(새로운 회원 생성)
        if (userDiet.getId() == null) {
            userDietDao.insertDiet(userDiet);
        }
        //                  있으면 update 문 호출
//        else {
//            complainDao.updateComplain(complain);
//        }

        // insert 문 후에는 customer 의 id 속성에 값이 저장됨(<selectkey>)
        seqId = user.getId();
        logger.info("seqId {}", seqId);

        return userDao.findById(seqId);
    }
}
