package com.example.demo.controller;
import com.example.demo.data.entity.User;
import com.example.demo.data.repository.UserRepository;
import com.example.demo.service.userServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class userController {

    private final userServiceImpl userService;
    private final UserRepository userRepository;

    @PostMapping("/insert")
    public User insertUser(@RequestBody User user) {
        System.out.println(user.getUserId());
        System.out.println(user.getUserName());
        System.out.println(user.getUserAge());
        return userRepository.save(user);
    }

    public Map<String, Object> user(){

        return userService.getUser();
    }
}
