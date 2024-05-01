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


    @GetMapping("/users")
    public HashMap<String, Object> getUsers() {
        HashMap<String, Object> result = new HashMap<>();
        List<UserModel> data = userService.getUsers();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    @PostMapping("/users")
    public HashMap<String, String> insertUser(@RequestBody UserModel user) {

        userService.insertUser(user);

        System.out.println(2);
        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @PutMapping("/users/{id}")
    public HashMap<String, String> updateUser(@RequestBody UserModel userData, @PathVariable(required = true) int id) {

        userService.updateUser(id, userData);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @DeleteMapping("/users/{id}")
    public HashMap<String, String> deleteUser(@PathVariable(required = true) int id, @RequestParam(defaultValue = "succ") String succMsg) {

        userService.deleteUser(id);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", succMsg);
        return result;
    }

}
