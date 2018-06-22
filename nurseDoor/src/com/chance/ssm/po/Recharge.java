package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Recharge {
    private String rechargeId;

    private String rechargeUser;

    private BigDecimal rechargeMoney;

    private Integer rechargeState;

    private String rechargeOver;

    private Date rechargeTime;

    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId == null ? null : rechargeId.trim();
    }

    public String getRechargeUser() {
        return rechargeUser;
    }

    public void setRechargeUser(String rechargeUser) {
        this.rechargeUser = rechargeUser == null ? null : rechargeUser.trim();
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public Integer getRechargeState() {
        return rechargeState;
    }

    public void setRechargeState(Integer rechargeState) {
        this.rechargeState = rechargeState;
    }

    public String getRechargeOver() {
        return rechargeOver;
    }

    public void setRechargeOver(String rechargeOver) {
        this.rechargeOver = rechargeOver == null ? null : rechargeOver.trim();
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }
}