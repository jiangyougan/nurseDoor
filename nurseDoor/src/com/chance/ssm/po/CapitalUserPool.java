package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class CapitalUserPool {
    private String capitalUserPoolId;

    private String capitalUserPoolPeopleid;

    private String capitalUserPoolOrdersendid;

    private Integer capitalUserPoolPeopleIdentity;

    private BigDecimal capitalUserPoolMoney;

    private String capitalUserPoolSpeak;

    private Date capitalUserPoolCreatetime;

    public String getCapitalUserPoolId() {
        return capitalUserPoolId;
    }

    public void setCapitalUserPoolId(String capitalUserPoolId) {
        this.capitalUserPoolId = capitalUserPoolId == null ? null : capitalUserPoolId.trim();
    }

    public String getCapitalUserPoolPeopleid() {
        return capitalUserPoolPeopleid;
    }

    public void setCapitalUserPoolPeopleid(String capitalUserPoolPeopleid) {
        this.capitalUserPoolPeopleid = capitalUserPoolPeopleid == null ? null : capitalUserPoolPeopleid.trim();
    }

    public String getCapitalUserPoolOrdersendid() {
        return capitalUserPoolOrdersendid;
    }

    public void setCapitalUserPoolOrdersendid(String capitalUserPoolOrdersendid) {
        this.capitalUserPoolOrdersendid = capitalUserPoolOrdersendid == null ? null : capitalUserPoolOrdersendid.trim();
    }

    public Integer getCapitalUserPoolPeopleIdentity() {
        return capitalUserPoolPeopleIdentity;
    }

    public void setCapitalUserPoolPeopleIdentity(Integer capitalUserPoolPeopleIdentity) {
        this.capitalUserPoolPeopleIdentity = capitalUserPoolPeopleIdentity;
    }

    public BigDecimal getCapitalUserPoolMoney() {
        return capitalUserPoolMoney;
    }

    public void setCapitalUserPoolMoney(BigDecimal capitalUserPoolMoney) {
        this.capitalUserPoolMoney = capitalUserPoolMoney;
    }

    public String getCapitalUserPoolSpeak() {
        return capitalUserPoolSpeak;
    }

    public void setCapitalUserPoolSpeak(String capitalUserPoolSpeak) {
        this.capitalUserPoolSpeak = capitalUserPoolSpeak == null ? null : capitalUserPoolSpeak.trim();
    }

    public Date getCapitalUserPoolCreatetime() {
        return capitalUserPoolCreatetime;
    }

    public void setCapitalUserPoolCreatetime(Date capitalUserPoolCreatetime) {
        this.capitalUserPoolCreatetime = capitalUserPoolCreatetime;
    }
}