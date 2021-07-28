package com.example.loansupermarketapp.service.impl;

import com.example.loansupermarketapp.service.LoginService;
import com.example.loansupermarketcommon.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Integer judge_login(String phone) {

        return loginMapper.judge_login(phone);
    }
}
