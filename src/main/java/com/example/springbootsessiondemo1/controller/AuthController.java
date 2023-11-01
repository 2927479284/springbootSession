package com.example.springbootsessiondemo1.controller;

import com.example.springbootsessiondemo1.common.AjaxResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequestMapping("auth/")
@RestController
public class AuthController {

    @PostMapping("login")
    public AjaxResult login(HttpSession session){
        //设置Session
        session.setAttribute("session", "aaaaaaaaaaaaaaaaaaa");
        return null;
    }
}
