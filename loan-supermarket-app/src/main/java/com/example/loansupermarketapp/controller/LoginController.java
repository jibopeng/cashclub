package com.example.loansupermarketapp.controller;

import com.example.loansupermarketapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Scope("prototype")
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/api/login/judge_login.htm")
    public String judge_login(@RequestParam(value = "phone") String phone) {

        Integer count = loginService.judge_login(phone);
        return String.valueOf(count);
    }
}
