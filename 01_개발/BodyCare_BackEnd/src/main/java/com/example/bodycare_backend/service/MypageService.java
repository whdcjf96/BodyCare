package com.example.bodycare_backend.service;

import com.example.bodycare_backend.dao.MypageDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * packageName : com.example.bodycare_backend.service
 * fileName : MypageService
 * author : ds
 * date : 2022-06-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-28         ds          최초 생성
 */

@Mapper

public interface MypageService {

    int lookupMypage(MypageDao mypage);

    int updateMypage(MypageDao mypage);

}
