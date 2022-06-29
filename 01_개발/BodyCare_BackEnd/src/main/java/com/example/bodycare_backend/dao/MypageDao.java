package com.example.bodycare_backend.dao;

/**
 * packageName : com.example.bodycare_backend.dao
 * fileName : Mypage
 * author : ds
 * date : 2022-06-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-28         ds          최초 생성
 */
public interface MypageDao {


    //조회
    int lookupMypage(MypageDao mypage);
    //수정
    int updateMypage(MypageDao mypage);

}
