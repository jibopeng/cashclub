package com.example.loansupermarketcommon.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="user")
public class User implements Serializable,Cloneable{
    /** 用户编号 */
    @Id
    @GeneratedValue
    private Long id ;
    /** 登录名 */
    private String loginName ;
    /** 登录密码 */
    private String loginPwd ;
    /** 上次修改密码时间 */
    private Date loginpwdModifyTime ;
    /** 注册时间 */
    private Date registerTime ;
    /** 交易密码 */
    private String tradePwd ;
    /** 登录时间 */
    private Date loginTime ;

    public User() {
    }

    public User(Long id, String loginName, String loginPwd, Date loginpwdModifyTime, Date registerTime, String tradePwd, Date loginTime) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.loginpwdModifyTime = loginpwdModifyTime;
        this.registerTime = registerTime;
        this.tradePwd = tradePwd;
        this.loginTime = loginTime;
    }

    /** 用户编号 */
    public Long getId(){
        return this.id;
    }
    /** 用户编号 */
    public void setId(Long id){
        this.id = id;
    }
    /** 登录名 */
    public String getLoginName(){
        return this.loginName;
    }
    /** 登录名 */
    public void setLoginName(String loginName){
        this.loginName = loginName;
    }
    /** 登录密码 */
    public String getLoginPwd(){
        return this.loginPwd;
    }
    /** 登录密码 */
    public void setLoginPwd(String loginPwd){
        this.loginPwd = loginPwd;
    }
    /** 上次修改密码时间 */
    public Date getLoginpwdModifyTime(){
        return this.loginpwdModifyTime;
    }
    /** 上次修改密码时间 */
    public void setLoginpwdModifyTime(Date loginpwdModifyTime){
        this.loginpwdModifyTime = loginpwdModifyTime;
    }
    /** 注册时间 */
    public Date getRegisterTime(){
        return this.registerTime;
    }
    /** 注册时间 */
    public void setRegisterTime(Date registerTime){
        this.registerTime = registerTime;
    }
    /** 交易密码 */
    public String getTradePwd(){
        return this.tradePwd;
    }
    /** 交易密码 */
    public void setTradePwd(String tradePwd){
        this.tradePwd = tradePwd;
    }
    /** 登录时间 */
    public Date getLoginTime(){
        return this.loginTime;
    }
    /** 登录时间 */
    public void setLoginTime(Date loginTime){
        this.loginTime = loginTime;
    }
}