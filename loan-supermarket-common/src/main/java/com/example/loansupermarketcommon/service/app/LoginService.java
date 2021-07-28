package com.example.loansupermarketcommon.service.app;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    Integer judge_login(String phone);
}
