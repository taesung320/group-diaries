package com.example.demo.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<UserModel> selectUsers();
    void insertUser(UserModel user);

    void updateUser(UserModel user);

    void deleteUser(int userId);

}
