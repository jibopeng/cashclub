package com.example.loansupermarketcommon.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sms")
public class Sms implements Serializable,Cloneable{
    /** 编号 */
    @Id
    private Long id ;
    /** 手机号 */
    private String phone ;
    /** 发送时间 */
    private Date sendTime ;
    /** 发送内容 */
    private String content ;
    /** 响应时间 */
    private Date respTime ;
    /** 响应内容 */
    private String respContent ;
    /** 短信类型 */
    private String smsType ;
    /** 验证码 */
    private String code ;
    /** 订单号 */
    private String orderNo ;
    /** 状态;10发送成功未使用，20发送失败或已使用，30发送中 */
    private String state ;
    /** 验证次数 */
    private String verifyTime ;

    public Sms() {
    }

    public Sms(Long id, String phone, Date sendTime, String content, Date respTime, String respContent, String smsType, String code, String orderNo, String state, String verifyTime) {
        this.id = id;
        this.phone = phone;
        this.sendTime = sendTime;
        this.content = content;
        this.respTime = respTime;
        this.respContent = respContent;
        this.smsType = smsType;
        this.code = code;
        this.orderNo = orderNo;
        this.state = state;
        this.verifyTime = verifyTime;
    }

    /** 编号 */
    public Long getId(){
        return this.id;
    }
    /** 编号 */
    public void setId(Long id){
        this.id = id;
    }
    /** 手机号 */
    public String getPhone(){
        return this.phone;
    }
    /** 手机号 */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /** 发送时间 */
    public Date getSendTime(){
        return this.sendTime;
    }
    /** 发送时间 */
    public void setSendTime(Date sendTime){
        this.sendTime = sendTime;
    }
    /** 发送内容 */
    public String getContent(){
        return this.content;
    }
    /** 发送内容 */
    public void setContent(String content){
        this.content = content;
    }
    /** 响应时间 */
    public Date getRespTime(){
        return this.respTime;
    }
    /** 响应时间 */
    public void setRespTime(Date respTime){
        this.respTime = respTime;
    }
    /** 响应内容 */
    public String getRespContent(){
        return this.respContent;
    }
    /** 响应内容 */
    public void setRespContent(String respContent){
        this.respContent = respContent;
    }
    /** 短信类型 */
    public String getSmsType(){
        return this.smsType;
    }
    /** 短信类型 */
    public void setSmsType(String smsType){
        this.smsType = smsType;
    }
    /** 验证码 */
    public String getCode(){
        return this.code;
    }
    /** 验证码 */
    public void setCode(String code){
        this.code = code;
    }
    /** 订单号 */
    public String getOrderNo(){
        return this.orderNo;
    }
    /** 订单号 */
    public void setOrderNo(String orderNo){
        this.orderNo = orderNo;
    }
    /** 状态;10发送成功未使用，20发送失败或已使用，30发送中 */
    public String getState(){
        return this.state;
    }
    /** 状态;10发送成功未使用，20发送失败或已使用，30发送中 */
    public void setState(String state){
        this.state = state;
    }
    /** 验证次数 */
    public String getVerifyTime(){
        return this.verifyTime;
    }
    /** 验证次数 */
    public void setVerifyTime(String verifyTime){
        this.verifyTime = verifyTime;
    }
}