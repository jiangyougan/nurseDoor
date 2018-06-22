package com.chance.ssm.po;

import java.util.Date;

public class NurseSignin {
    private String nurseId;

    private Integer signinIntegral;

    private Date signinTime;

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId == null ? null : nurseId.trim();
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