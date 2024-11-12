package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class userServiceImpl implements userService {

    @Override
    public Map<String, Object> getUser() {

        Map<String, Object> userData = new HashMap<>();

        userData.put("1", "kim");
        userData.put("2", "lee");
        userData.put("3", "choi");

        return userData;
    }
}
