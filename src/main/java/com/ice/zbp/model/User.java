package com.ice.zbp.model;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userIp;

    private String userCreattime;

    private String userLogintime;

    private String userStatus;

    private String userPhone;

    private String userAddress;

    private String userAmt;

    private String userEmail;

    private String userAdress2;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getUserCreattime() {
        return userCreattime;
    }

    public void setUserCreattime(String userCreattime) {
        this.userCreattime = userCreattime == null ? null : userCreattime.trim();
    }

    public String getUserLogintime() {
        return userLogintime;
    }

    public void setUserLogintime(String userLogintime) {
        this.userLogintime = userLogintime == null ? null : userLogintime.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserAmt() {
        return userAmt;
    }

    public void setUserAmt(String userAmt) {
        this.userAmt = userAmt == null ? null : userAmt.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserAdress2() {
        return userAdress2;
    }

    public void setUserAdress2(String userAdress2) {
        this.userAdress2 = userAdress2 == null ? null : userAdress2.trim();
    }
}