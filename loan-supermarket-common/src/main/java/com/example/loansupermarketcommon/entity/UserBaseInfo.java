package com.example.loansupermarketcommon.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="user_base_info")
public class UserBaseInfo implements Serializable,Cloneable{
    /** 主键 */
    @Id
    @GeneratedValue
    private Long id ;
    /** 用户编号 */
    private String userId ;
    /** 手机号 */
    private String phone ;
    /** 真实姓名 */
    private String realName ;
    /** 年龄 */
    private Integer age ;
    /** 第一个名字 */
    private String firstName ;
    /** 姓氏 */
    private String lastName ;
    /** 中间名字 */
    private String middleName ;
    /** 出生日期 */
    private String dateOfBirth ;
    /** 性别 */
    private Integer sex ;
    /** 婚姻状况 */
    private String married ;
    /** 邮箱 */
    private String email ;
    /** 就业情况 */
    private String employmentStatus ;
    /** 雇佣类型 */
    private String employmentType ;
    /** 公司行业 */
    private String commpanyIndystry ;
    /** 职位 */
    private String jobTitle ;
    /** 月收入 */
    private String incomeMonthly ;
    /** 工作时间 */
    private String workingSince ;
    /** 银行名称 */
    private String bankName ;
    /** 银行卡号 */
    private String accountNumber ;
    /** bvn */
    private String bvn ;
    /** 创建时间 */
    private Date createTime ;

    public UserBaseInfo() {
    }

    public UserBaseInfo(Long id, String userId, String phone, String realName, Integer age, String firstName, String lastName, String middleName, String dateOfBirth, Integer sex, String married, String email, String employmentStatus, String employmentType, String commpanyIndystry, String jobTitle, String incomeMonthly, String workingSince, String bankName, String accountNumber, String bvn, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.phone = phone;
        this.realName = realName;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.married = married;
        this.email = email;
        this.employmentStatus = employmentStatus;
        this.employmentType = employmentType;
        this.commpanyIndystry = commpanyIndystry;
        this.jobTitle = jobTitle;
        this.incomeMonthly = incomeMonthly;
        this.workingSince = workingSince;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.bvn = bvn;
        this.createTime = createTime;
    }

    /** 主键 */
    public Long getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(Long id){
        this.id = id;
    }
    /** 用户编号 */
    public String getUserId(){
        return this.userId;
    }
    /** 用户编号 */
    public void setUserId(String userId){
        this.userId = userId;
    }
    /** 手机号 */
    public String getPhone(){
        return this.phone;
    }
    /** 手机号 */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /** 真实姓名 */
    public String getRealName(){
        return this.realName;
    }
    /** 真实姓名 */
    public void setRealName(String realName){
        this.realName = realName;
    }
    /** 年龄 */
    public Integer getAge(){
        return this.age;
    }
    /** 年龄 */
    public void setAge(Integer age){
        this.age = age;
    }
    /** 第一个名字 */
    public String getFirstName(){
        return this.firstName;
    }
    /** 第一个名字 */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /** 姓氏 */
    public String getLastName(){
        return this.lastName;
    }
    /** 姓氏 */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    /** 中间名字 */
    public String getMiddleName(){
        return this.middleName;
    }
    /** 中间名字 */
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    /** 出生日期 */
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    /** 出生日期 */
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    /** 性别 */
    public Integer getSex(){
        return this.sex;
    }
    /** 性别 */
    public void setSex(Integer sex){
        this.sex = sex;
    }
    /** 婚姻状况 */
    public String getMarried(){
        return this.married;
    }
    /** 婚姻状况 */
    public void setMarried(String married){
        this.married = married;
    }
    /** 邮箱 */
    public String getEmail(){
        return this.email;
    }
    /** 邮箱 */
    public void setEmail(String email){
        this.email = email;
    }
    /** 就业情况 */
    public String getEmploymentStatus(){
        return this.employmentStatus;
    }
    /** 就业情况 */
    public void setEmploymentStatus(String employmentStatus){
        this.employmentStatus = employmentStatus;
    }
    /** 雇佣类型 */
    public String getEmploymentType(){
        return this.employmentType;
    }
    /** 雇佣类型 */
    public void setEmploymentType(String employmentType){
        this.employmentType = employmentType;
    }
    /** 公司行业 */
    public String getCommpanyIndystry(){
        return this.commpanyIndystry;
    }
    /** 公司行业 */
    public void setCommpanyIndystry(String commpanyIndystry){
        this.commpanyIndystry = commpanyIndystry;
    }
    /** 职位 */
    public String getJobTitle(){
        return this.jobTitle;
    }
    /** 职位 */
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    /** 月收入 */
    public String getIncomeMonthly(){
        return this.incomeMonthly;
    }
    /** 月收入 */
    public void setIncomeMonthly(String incomeMonthly){
        this.incomeMonthly = incomeMonthly;
    }
    /** 工作时间 */
    public String getWorkingSince(){
        return this.workingSince;
    }
    /** 工作时间 */
    public void setWorkingSince(String workingSince){
        this.workingSince = workingSince;
    }
    /** 银行名称 */
    public String getBankName(){
        return this.bankName;
    }
    /** 银行名称 */
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    /** 银行卡号 */
    public String getAccountNumber(){
        return this.accountNumber;
    }
    /** 银行卡号 */
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    /** bvn */
    public String getBvn(){
        return this.bvn;
    }
    /** bvn */
    public void setBvn(String bvn){
        this.bvn = bvn;
    }
    /** 创建时间 */
    public Date getCreateTime(){
        return this.createTime;
    }
    /** 创建时间 */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
}