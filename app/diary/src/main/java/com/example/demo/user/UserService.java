package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserMapper userMapper;

    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public List<UserModel> getUsers() {
        return userMapper.selectUsers();
    }

    public void insertUser(UserModel user) {
        userMapper.insertUser(user);
    }

    public void updateUser(int userId, UserModel user) {
        user.setId(userId);
        userMapper.updateUser(user);
    }

    public void deleteUser(int userId) {
        userMapper.deleteUser(userId);
    }

}
