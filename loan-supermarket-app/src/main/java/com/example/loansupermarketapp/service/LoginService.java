package com.example.loansupermarketapp.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    Integer judge_login(String phone);
}
