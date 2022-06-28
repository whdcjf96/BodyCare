package com.example.bodycare_backend.service;

import com.example.bodycare_backend.model.Register;

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
public interface RegisterService {
//    id로 조회하는 메소드(결과 : 1건)
    Optional<Register> findById(long id);

//     Todo: 1개 수정 findAll, 1개 추가 findByEmailContaining
//    모든 회원 조회하는 메소드(결과 : 여러건)
    List<Register> findAll(Criteria criteria);

    List<Register> findByEmailContaining(Criteria criteria);

//    회원 저장 / 수정하는 메소드( insert / update )
    Optional<Register> save(Register register);

//    id로 회원 삭제하는 메소드
    boolean deleteById(Long id);

//    모든 회원 삭제하는 메소드
    boolean deleteAll();
}











