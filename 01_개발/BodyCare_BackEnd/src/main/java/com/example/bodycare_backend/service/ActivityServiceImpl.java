package com.example.bodycare_backend.service;

import com.example.bodycare_backend.dao.ActivityDao;
import com.example.bodycare_backend.model.Activity;
import com.example.bodycare_backend.paging.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.bodycare_backend.service
 * fileName : activityServiceImpl
 * author : 4571c
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         4571c          최초 생성
 */
@Service
public class ActivityServiceImpl implements ActivityService{
    @Autowired
    private ActivityDao activityDao; // 객체 정의 ( null => 스프링 객체 )

    // 나중에 에러 로그 추적을 위해 하나 만들어둠
    Logger logger = LoggerFactory.getLogger(this.getClass());

    // 모든 회원 조회 서비스
    @Override
    public List<Activity> findAll(Criteria criteria) {

        return activityDao.findAll(criteria);
    }

    // 회원 생성 / 수정 서비스 (insert / update)
    @Override
    public Optional<Activity> save(Activity activity) {
        // db 시퀀스 번호 저장을 위한 변수
        long seqId = 0;

        // 매개변수 activity 정보 출력
        logger.info("activity {}", activity);

        seqId = activity.getId();
        logger.info("seqId {}", seqId);

        return activityDao.findById(seqId);
    }
}
