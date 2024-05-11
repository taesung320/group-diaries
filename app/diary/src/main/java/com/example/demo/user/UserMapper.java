package com.example.demo.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    // 모든 사용자 정보 조회
    List<UserModel> selectUsers();

    // 사용자 생성
    void insertUser(UserModel user);

    // 사용자 정보 수정
    void updateUser(UserModel user);

    // 사용자 삭제
    void deleteUser(int userId);

    // 사용자 이름 요청
//    String requestUserName(int userId);

    // 사용자 정보 요청
//    UserModel requestUserInfo(int userId);

    // 사용자 이메일 검색
    List<UserModel> userEmailSearchModel(String searchWord);

}
