package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Save {
    private String saveId;

    private BigDecimal saveCost;

    private String saveCreateter;

    private Date saveCreatetime;

    private Date saveUpdatetime;

    private String saveName;

    private String saveLogo;

    private String saveUrl;

    private String saveInfo;

    public String getSaveId() {
        return saveId;
    }

    public void setSaveId(String saveId) {
        this.saveId = saveId == null ? null : saveId.trim();
    }

    public BigDecimal getSaveCost() {
        return saveCost;
    }

    public void setSaveCost(BigDecimal saveCost) {
        this.saveCost = saveCost;
    }

    public String getSaveCreateter() {
        return saveCreateter;
    }

    public void setSaveCreateter(String saveCreateter) {
        this.saveCreateter = saveCreateter == null ? null : saveCreateter.trim();
    }

    public Date getSaveCreatetime() {
        return saveCreatetime;
    }

    public void setSaveCreatetime(Date saveCreatetime) {
        this.saveCreatetime = saveCreatetime;
    }

    public Date getSaveUpdatetime() {
        return saveUpdatetime;
    }

    public void setSaveUpdatetime(Date saveUpdatetime) {
        this.saveUpdatetime = saveUpdatetime;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName == null ? null : saveName.trim();
    }

    public String getSaveLogo() {
        return saveLogo;
    }

    public void setSaveLogo(String saveLogo) {
        this.saveLogo = saveLogo == null ? null : saveLogo.trim();
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl == null ? null : saveUrl.trim();
    }

    public String getSaveInfo() {
        return saveInfo;
    }

    public void setSaveInfo(String saveInfo) {
        this.saveInfo = saveInfo == null ? null : saveInfo.trim();
    }
}