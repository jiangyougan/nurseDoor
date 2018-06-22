package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class CouponUser {
    private String couponUserId;

    private String couponUserUserId;

    private BigDecimal couponUserMoney;

    private String couponUserPic;

    private BigDecimal couponUserFullGive;

    private Date couponUserExpirationTime;

    private Integer couponUserIstouse;

    private String couponUserNote;

    private String couponUserSperak;

    private String couponUserCreateter;

    private Date couponUserCreatetime;

    public String getCouponUserId() {
        return couponUserId;
    }

    public void setCouponUserId(String couponUserId) {
        this.couponUserId = couponUserId == null ? null : couponUserId.trim();
    }

    public String getCouponUserUserId() {
        return couponUserUserId;
    }

    public void setCouponUserUserId(String couponUserUserId) {
        this.couponUserUserId = couponUserUserId == null ? null : couponUserUserId.trim();
    }

    public BigDecimal getCouponUserMoney() {
        return couponUserMoney;
    }

    public void setCouponUserMoney(BigDecimal couponUserMoney) {
        this.couponUserMoney = couponUserMoney;
    }

    public String getCouponUserPic() {
        return couponUserPic;
    }

    public void setCouponUserPic(String couponUserPic) {
        this.couponUserPic = couponUserPic == null ? null : couponUserPic.trim();
    }

    public BigDecimal getCouponUserFullGive() {
        return couponUserFullGive;
    }

    public void setCouponUserFullGive(BigDecimal couponUserFullGive) {
        this.couponUserFullGive = couponUserFullGive;
    }

    public Date getCouponUserExpirationTime() {
        return couponUserExpirationTime;
    }

    public void setCouponUserExpirationTime(Date couponUserExpirationTime) {
        this.couponUserExpirationTime = couponUserExpirationTime;
    }

    public Integer getCouponUserIstouse() {
        return couponUserIstouse;
    }

    public void setCouponUserIstouse(Integer couponUserIstouse) {
        this.couponUserIstouse = couponUserIstouse;
    }

    public String getCouponUserNote() {
        return couponUserNote;
    }

    public void setCouponUserNote(String couponUserNote) {
        this.couponUserNote = couponUserNote == null ? null : couponUserNote.trim();
    }

    public String getCouponUserSperak() {
        return couponUserSperak;
    }

    public void setCouponUserSperak(String couponUserSperak) {
        this.couponUserSperak = couponUserSperak == null ? null : couponUserSperak.trim();
    }

    public String getCouponUserCreateter() {
        return couponUserCreateter;
    }

    public void setCouponUserCreateter(String couponUserCreateter) {
        this.couponUserCreateter = couponUserCreateter == null ? null : couponUserCreateter.trim();
    }

    public Date getCouponUserCreatetime() {
        return couponUserCreatetime;
    }

    public void setCouponUserCreatetime(Date couponUserCreatetime) {
        this.couponUserCreatetime = couponUserCreatetime;
    }
}