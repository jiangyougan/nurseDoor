package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Coupon {
    private String couponId;

    private BigDecimal couponMoney;

    private String couponPic;

    private BigDecimal couponFullGive;

    private Integer couponExpirationTime;

    private String couponNote;

    private String couponSpeak;

    private Integer couponType;

    private String couponCreater;

    private Date couponCreatetime;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public BigDecimal getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(BigDecimal couponMoney) {
        this.couponMoney = couponMoney;
    }

    public String getCouponPic() {
        return couponPic;
    }

    public void setCouponPic(String couponPic) {
        this.couponPic = couponPic == null ? null : couponPic.trim();
    }

    public BigDecimal getCouponFullGive() {
        return couponFullGive;
    }

    public void setCouponFullGive(BigDecimal couponFullGive) {
        this.couponFullGive = couponFullGive;
    }

    public Integer getCouponExpirationTime() {
        return couponExpirationTime;
    }

    public void setCouponExpirationTime(Integer couponExpirationTime) {
        this.couponExpirationTime = couponExpirationTime;
    }

    public String getCouponNote() {
        return couponNote;
    }

    public void setCouponNote(String couponNote) {
        this.couponNote = couponNote == null ? null : couponNote.trim();
    }

    public String getCouponSpeak() {
        return couponSpeak;
    }

    public void setCouponSpeak(String couponSpeak) {
        this.couponSpeak = couponSpeak == null ? null : couponSpeak.trim();
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getCouponCreater() {
        return couponCreater;
    }

    public void setCouponCreater(String couponCreater) {
        this.couponCreater = couponCreater == null ? null : couponCreater.trim();
    }

    public Date getCouponCreatetime() {
        return couponCreatetime;
    }

    public void setCouponCreatetime(Date couponCreatetime) {
        this.couponCreatetime = couponCreatetime;
    }
}