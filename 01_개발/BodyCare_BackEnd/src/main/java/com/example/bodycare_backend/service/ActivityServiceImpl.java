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
 * fileName : ActivityServiceImpl
 * author : 4571c
 * date : 2022-06-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-30         4571c          최초 생성
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityDao activityDao; // 객체 정의 ( null => 스프링 객체 )

    // 나중에 에러 로그 추적을 위해 하나 만들어둠
    Logger logger = LoggerFactory.getLogger(this.getClass());


    // 모든 활동명 조회 서비스
    @Override
    public List<Activity> findAll(Criteria criteria) {
        return activityDao.findAll(criteria);
    }
}
