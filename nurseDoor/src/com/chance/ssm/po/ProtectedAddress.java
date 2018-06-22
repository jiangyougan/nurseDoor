package com.chance.ssm.po;

import java.util.Date;

public class ProtectedAddress{
    private String protectedAddressId;

    private String protectedAddressUserid;

    private Double protectedAddressPositionX;

    private Double protectedAddressPositionY;

    private String protectedAddressAddress;

    private Date protectedAddressCreatetime;

    public String getProtectedAddressId() {
        return protectedAddressId;
    }

    public void setProtectedAddressId(String protectedAddressId) {
        this.protectedAddressId = protectedAddressId == null ? null : protectedAddressId.trim();
    }

    public String getProtectedAddressUserid() {
        return protectedAddressUserid;
    }

    public void setProtectedAddressUserid(String protectedAddressUserid) {
        this.protectedAddressUserid = protectedAddressUserid == null ? null : protectedAddressUserid.trim();
    }

    public Double getProtectedAddressPositionX() {
        return protectedAddressPositionX;
    }

    public void setProtectedAddressPositionX(Double protectedAddressPositionX) {
        this.protectedAddressPositionX = protectedAddressPositionX;
    }

    public Double getProtectedAddressPositionY() {
        return protectedAddressPositionY;
    }

    public void setProtectedAddressPositionY(Double protectedAddressPositionY) {
        this.protectedAddressPositionY = protectedAddressPositionY;
    }

    public String getProtectedAddressAddress() {
        return protectedAddressAddress;
    }

    public void setProtectedAddressAddress(String protectedAddressAddress) {
        this.protectedAddressAddress = protectedAddressAddress == null ? null : protectedAddressAddress.trim();
    }

    public Date getProtectedAddressCreatetime() {
        return protectedAddressCreatetime;
    }

    public void setProtectedAddressCreatetime(Date protectedAddressCreatetime) {
        this.protectedAddressCreatetime = protectedAddressCreatetime;
    }
}