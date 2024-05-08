package com.example.demo;

import com.example.demo.user.UserModel;
import com.example.demo.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 모든 사용자 정보 조회
    @GetMapping("/users")
    public HashMap<String, Object> getUsers() {
        List<UserModel> data = userService.getUsers();

        HashMap<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    // 사용자 생성
    @PostMapping("/users")
    public HashMap<String, String> insertUser(@RequestBody UserModel user) {
        userService.insertUser(user);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    // 사용자 정보 수정
    @PutMapping("/users/{id}")
    public HashMap<String, String> updateUser(@RequestBody UserModel userData, @PathVariable(required = true) int id) {
        userService.updateUser(id, userData);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    // 사용자 삭제
    @DeleteMapping("/users/{id}")
    public HashMap<String, String> deleteUser(@PathVariable(required = true) int id, @RequestParam(defaultValue = "succ") String succMsg) {
        userService.deleteUser(id);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", succMsg);
        return result;
    }

    // 사용자 이름 요청
    @GetMapping("/users/{userId}")
    public HashMap<String, Object> requestUserName(@PathVariable(required = true) int userId) {
        String data = userService.requestUserName(userId);

        HashMap<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }


    // 사용자 이메일 검색
//    @GetMapping("/users")
//    public HashMap<String, Object> userEmailSearchModel(@RequestBody String searchWord) {
//        List<UserModel> data = userService.userEmailSearchModel(searchWord);
//
//        HashMap<String, Object> result = new HashMap<>();
//        result.put("result", "success");
//        result.put("data", data);
//        return result;
//    }

}
