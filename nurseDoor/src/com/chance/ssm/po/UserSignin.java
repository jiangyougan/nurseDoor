package com.chance.ssm.po;

import java.util.Date;

public class UserSignin {
    private String userId;

    private Integer signinIntegral;

    private Date signinTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getSigninIntegral() {
        return signinIntegral;
    }

    public void setSigninIntegral(Integer signinIntegral) {
        this.signinIntegral = signinIntegral;
    }

    public Date getSigninTime() {
        return signinTime;
    }

    public void setSigninTime(Date signinTime) {
        this.signinTime = signinTime;
    }
}