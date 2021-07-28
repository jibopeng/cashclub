package com.example.loansupermarketcommon.service.app.impl;

import com.example.loansupermarketcommon.service.app.LoginService;
import com.example.loansupermarketcommon.orm.user.mapper.LoginMapper;
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
