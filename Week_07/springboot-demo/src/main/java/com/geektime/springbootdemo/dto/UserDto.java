package com.geektime.springbootdemo.dto;

import java.util.Date;

/**
 * @author Administrator
 * @since 2020/12/2 17:05
 */
public class UserDto {
    /** 用户ID **/
    private Integer id;

    /** 会员号 **/
    private String userCode;

    /** 昵称 **/
    private String userNick;

    /** 1：男；2：女 **/
    private Byte gender;

    /** 生日 **/
    private Date userBirthday;

    /** 地址 **/
    private String userAddress;

    /** 电话 **/
    private String userPhone;

    /** 邮箱 **/
    private String userEmail;

    /** 头像url **/
    private String avatar;

    /** 最后登陆IP **/
    private String lastLoginIp;

    /** 最后登陆时间 **/
    private Date lastLoginDate;

    /**  **/
    private String salt;

    /** 系统登录密码 **/
    private String password;

    /** 状态（1正常 2冻结 3禁用 4删除 ） **/
    private Byte userState;


    /** 用户ID **/
    public Integer getId() {
        return id;
    }

    /** 用户ID **/
    public void setId(Integer id) {
        this.id = id;
    }

    /** 会员号 **/
    public String getUserCode() {
        return userCode;
    }

    /** 会员号 **/
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /** 昵称 **/
    public String getUserNick() {
        return userNick;
    }

    /** 昵称 **/
    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    /** 1：男；2：女 **/
    public Byte getGender() {
        return gender;
    }

    /** 1：男；2：女 **/
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /** 生日 **/
    public Date getUserBirthday() {
        return userBirthday;
    }

    /** 生日 **/
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /** 地址 **/
    public String getUserAddress() {
        return userAddress;
    }

    /** 地址 **/
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /** 电话 **/
    public String getUserPhone() {
        return userPhone;
    }

    /** 电话 **/
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /** 邮箱 **/
    public String getUserEmail() {
        return userEmail;
    }

    /** 邮箱 **/
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /** 头像url **/
    public String getAvatar() {
        return avatar;
    }

    /** 头像url **/
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /** 最后登陆IP **/
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /** 最后登陆IP **/
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /** 最后登陆时间 **/
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /** 最后登陆时间 **/
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**  **/
    public String getSalt() {
        return salt;
    }

    /**  **/
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /** 系统登录密码 **/
    public String getPassword() {
        return password;
    }

    /** 系统登录密码 **/
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 状态（1正常 2冻结 3禁用 4删除 ） **/
    public Byte getUserState() {
        return userState;
    }

    /** 状态（1正常 2冻结 3禁用 4删除 ） **/
    public void setUserState(Byte userState) {
        this.userState = userState;
    }


}
