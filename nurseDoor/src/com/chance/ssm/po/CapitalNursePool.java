package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class CapitalNursePool {
    private String capitalNursePoolId;

    private String capitalNursePoolPeopleid;

    private String capitalNursePoolOrdersendid;

    private Integer capitalNursePoolPeopleidIdentity;

    private BigDecimal capitalNursePoolMoney;

    private Integer capitalNursePoolType;

    private String capitalNursePoolSpeak;

    private Date capitalNursePoolCreatetime;

    public String getCapitalNursePoolId() {
        return capitalNursePoolId;
    }

    public void setCapitalNursePoolId(String capitalNursePoolId) {
        this.capitalNursePoolId = capitalNursePoolId == null ? null : capitalNursePoolId.trim();
    }

    public String getCapitalNursePoolPeopleid() {
        return capitalNursePoolPeopleid;
    }

    public void setCapitalNursePoolPeopleid(String capitalNursePoolPeopleid) {
        this.capitalNursePoolPeopleid = capitalNursePoolPeopleid == null ? null : capitalNursePoolPeopleid.trim();
    }

    public String getCapitalNursePoolOrdersendid() {
        return capitalNursePoolOrdersendid;
    }

    public void setCapitalNursePoolOrdersendid(String capitalNursePoolOrdersendid) {
        this.capitalNursePoolOrdersendid = capitalNursePoolOrdersendid == null ? null : capitalNursePoolOrdersendid.trim();
    }

    public Integer getCapitalNursePoolPeopleidIdentity() {
        return capitalNursePoolPeopleidIdentity;
    }

    public void setCapitalNursePoolPeopleidIdentity(Integer capitalNursePoolPeopleidIdentity) {
        this.capitalNursePoolPeopleidIdentity = capitalNursePoolPeopleidIdentity;
    }

    public BigDecimal getCapitalNursePoolMoney() {
        return capitalNursePoolMoney;
    }

    public void setCapitalNursePoolMoney(BigDecimal capitalNursePoolMoney) {
        this.capitalNursePoolMoney = capitalNursePoolMoney;
    }

    public Integer getCapitalNursePoolType() {
        return capitalNursePoolType;
    }

    public void setCapitalNursePoolType(Integer capitalNursePoolType) {
        this.capitalNursePoolType = capitalNursePoolType;
    }

    public String getCapitalNursePoolSpeak() {
        return capitalNursePoolSpeak;
    }

    public void setCapitalNursePoolSpeak(String capitalNursePoolSpeak) {
        this.capitalNursePoolSpeak = capitalNursePoolSpeak == null ? null : capitalNursePoolSpeak.trim();
    }

    public Date getCapitalNursePoolCreatetime() {
        return capitalNursePoolCreatetime;
    }

    public void setCapitalNursePoolCreatetime(Date capitalNursePoolCreatetime) {
        this.capitalNursePoolCreatetime = capitalNursePoolCreatetime;
    }
}