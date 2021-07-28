package com.example.loansupermarketcommon.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    Integer judge_login(String phone);


}
