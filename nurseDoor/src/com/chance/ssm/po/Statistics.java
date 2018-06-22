package com.chance.ssm.po;

import java.util.Date;

public class Statistics {
    private String countId;

    private String countProjectId;

    private String countContentId;

    private String countGoodsId;

    private String countNurseId;

    private String contentName;

    private String countRedundancy;

    private String countRedundancyAny;

    private Date countNurseCreatetime;

    public String getCountId() {
        return countId;
    }

    public void setCountId(String countId) {
        this.countId = countId == null ? null : countId.trim();
    }

    public String getCountProjectId() {
        return countProjectId;
    }

    public void setCountProjectId(String countProjectId) {
        this.countProjectId = countProjectId == null ? null : countProjectId.trim();
    }

    public String getCountContentId() {
        return countContentId;
    }

    public void setCountContentId(String countContentId) {
        this.countContentId = countContentId == null ? null : countContentId.trim();
    }

    public String getCountGoodsId() {
        return countGoodsId;
    }

    public void setCountGoodsId(String countGoodsId) {
        this.countGoodsId = countGoodsId == null ? null : countGoodsId.trim();
    }

    public String getCountNurseId() {
        return countNurseId;
    }

    public void setCountNurseId(String countNurseId) {
        this.countNurseId = countNurseId == null ? null : countNurseId.trim();
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName == null ? null : contentName.trim();
    }

    public String getCountRedundancy() {
        return countRedundancy;
    }

    public void setCountRedundancy(String countRedundancy) {
        this.countRedundancy = countRedundancy == null ? null : countRedundancy.trim();
    }

    public String getCountRedundancyAny() {
        return countRedundancyAny;
    }

    public void setCountRedundancyAny(String countRedundancyAny) {
        this.countRedundancyAny = countRedundancyAny == null ? null : countRedundancyAny.trim();
    }

    public Date getCountNurseCreatetime() {
        return countNurseCreatetime;
    }

    public void setCountNurseCreatetime(Date countNurseCreatetime) {
        this.countNurseCreatetime = countNurseCreatetime;
    }
}