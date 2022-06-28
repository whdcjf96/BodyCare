package com.example.bodycare_backend.service;

import com.example.bodycare_backend.model.User;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.registerspring.service
 * fileName : RegisterService
 * author : ds
 * date : 2022-06-07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-07         ds          최초 생성
 */
public interface UserService {
//    id로 조회하는 메소드(결과 : 1건)
    Optional<User> findById(long id);

//    회원 저장 / 수정하는 메소드( insert / update )
    Optional<User> save(User user);

//    id로 회원 삭제하는 메소드
    boolean deleteById(Long id);

//    모든 회원 삭제하는 메소드
    boolean deleteAll();
}











