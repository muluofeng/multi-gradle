package com.example.controller;

import com.example.multiservice.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiexingxing
 * @Created by 2019-09-30 14:33.
 */
@RestController
@RequestMapping("/test")
public class IndexController {


    @RequestMapping("/adduser")
    public String test() {
        UserService userService = new UserService();
        userService.addUser();
        return "adduser";
    }
}