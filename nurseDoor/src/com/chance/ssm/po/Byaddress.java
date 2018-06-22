package com.chance.ssm.po;

import java.util.Date;

public class Byaddress {
    private String byaddressId;

    private String byaddressUserid;

    private Double byaddressPositionX;

    private Double byaddressPositionY;

    private String byaddressAddress;

    private Date byaddressCreatetime;

    public String getByaddressId() {
        return byaddressId;
    }

    public void setByaddressId(String byaddressId) {
        this.byaddressId = byaddressId == null ? null : byaddressId.trim();
    }

    public String getByaddressUserid() {
        return byaddressUserid;
    }

    public void setByaddressUserid(String byaddressUserid) {
        this.byaddressUserid = byaddressUserid == null ? null : byaddressUserid.trim();
    }

    public Double getByaddressPositionX() {
        return byaddressPositionX;
    }

    public void setByaddressPositionX(Double byaddressPositionX) {
        this.byaddressPositionX = byaddressPositionX;
    }

    public Double getByaddressPositionY() {
        return byaddressPositionY;
    }

    public void setByaddressPositionY(Double byaddressPositionY) {
        this.byaddressPositionY = byaddressPositionY;
    }

    public String getByaddressAddress() {
        return byaddressAddress;
    }

    public void setByaddressAddress(String byaddressAddress) {
        this.byaddressAddress = byaddressAddress == null ? null : byaddressAddress.trim();
    }

    public Date getByaddressCreatetime() {
        return byaddressCreatetime;
    }

    public void setByaddressCreatetime(Date byaddressCreatetime) {
        this.byaddressCreatetime = byaddressCreatetime;
    }
}