package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Package {
    private String packageId;

    private String packageManursingContent;

    private String package1Name;

    private BigDecimal package1Cost;

    private Date packageCreatetime;

    private Date packageUpdatime;

    private String package1Describe;

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }

    public String getPackageManursingContent() {
        return packageManursingContent;
    }

    public void setPackageManursingContent(String packageManursingContent) {
        this.packageManursingContent = packageManursingContent == null ? null : packageManursingContent.trim();
    }

    public String getPackage1Name() {
        return package1Name;
    }

    public void setPackage1Name(String package1Name) {
        this.package1Name = package1Name == null ? null : package1Name.trim();
    }

    public BigDecimal getPackage1Cost() {
        return package1Cost;
    }

    public void setPackage1Cost(BigDecimal package1Cost) {
        this.package1Cost = package1Cost;
    }

    public Date getPackageCreatetime() {
        return packageCreatetime;
    }

    public void setPackageCreatetime(Date packageCreatetime) {
        this.packageCreatetime = packageCreatetime;
    }

    public Date getPackageUpdatime() {
        return packageUpdatime;
    }

    public void setPackageUpdatime(Date packageUpdatime) {
        this.packageUpdatime = packageUpdatime;
    }

    public String getPackage1Describe() {
        return package1Describe;
    }

    public void setPackage1Describe(String package1Describe) {
        this.package1Describe = package1Describe == null ? null : package1Describe.trim();
    }
}