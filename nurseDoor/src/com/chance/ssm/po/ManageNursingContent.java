package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class ManageNursingContent {
    private String manageNursingContentId;

    private String manageNursingContentMaproject;

    private String manageNursingContentMajor;

    private String manageNursingContentName;

    private String manageNursingContentContent;

    private BigDecimal manageNursingContentCost;

    private BigDecimal manageNursingContentSupplies;

    private String contentImgurl;

    private Integer contentRequired;

    private String contentNote;

    private String manageNursingContentCreateter;

    private Date manageNursingContentCreatetime;

    private Date manageNursingContentUpdatetime;

    private Integer contentOrder;

    public String getManageNursingContentId() {
        return manageNursingContentId;
    }

    public void setManageNursingContentId(String manageNursingContentId) {
        this.manageNursingContentId = manageNursingContentId == null ? null : manageNursingContentId.trim();
    }

    public String getManageNursingContentMaproject() {
        return manageNursingContentMaproject;
    }

    public void setManageNursingContentMaproject(String manageNursingContentMaproject) {
        this.manageNursingContentMaproject = manageNursingContentMaproject == null ? null : manageNursingContentMaproject.trim();
    }

    public String getManageNursingContentMajor() {
        return manageNursingContentMajor;
    }

    public void setManageNursingContentMajor(String manageNursingContentMajor) {
        this.manageNursingContentMajor = manageNursingContentMajor == null ? null : manageNursingContentMajor.trim();
    }

    public String getManageNursingContentName() {
        return manageNursingContentName;
    }

    public void setManageNursingContentName(String manageNursingContentName) {
        this.manageNursingContentName = manageNursingContentName == null ? null : manageNursingContentName.trim();
    }

    public String getManageNursingContentContent() {
        return manageNursingContentContent;
    }

    public void setManageNursingContentContent(String manageNursingContentContent) {
        this.manageNursingContentContent = manageNursingContentContent == null ? null : manageNursingContentContent.trim();
    }

    public BigDecimal getManageNursingContentCost() {
        return manageNursingContentCost;
    }

    public void setManageNursingContentCost(BigDecimal manageNursingContentCost) {
        this.manageNursingContentCost = manageNursingContentCost;
    }

    public BigDecimal getManageNursingContentSupplies() {
        return manageNursingContentSupplies;
    }

    public void setManageNursingContentSupplies(BigDecimal manageNursingContentSupplies) {
        this.manageNursingContentSupplies = manageNursingContentSupplies;
    }

    public String getContentImgurl() {
        return contentImgurl;
    }

    public void setContentImgurl(String contentImgurl) {
        this.contentImgurl = contentImgurl == null ? null : contentImgurl.trim();
    }

    public Integer getContentRequired() {
        return contentRequired;
    }

    public void setContentRequired(Integer contentRequired) {
        this.contentRequired = contentRequired;
    }

    public String getContentNote() {
        return contentNote;
    }

    public void setContentNote(String contentNote) {
        this.contentNote = contentNote == null ? null : contentNote.trim();
    }

    public String getManageNursingContentCreateter() {
        return manageNursingContentCreateter;
    }

    public void setManageNursingContentCreateter(String manageNursingContentCreateter) {
        this.manageNursingContentCreateter = manageNursingContentCreateter == null ? null : manageNursingContentCreateter.trim();
    }

    public Date getManageNursingContentCreatetime() {
        return manageNursingContentCreatetime;
    }

    public void setManageNursingContentCreatetime(Date manageNursingContentCreatetime) {
        this.manageNursingContentCreatetime = manageNursingContentCreatetime;
    }

    public Date getManageNursingContentUpdatetime() {
        return manageNursingContentUpdatetime;
    }

    public void setManageNursingContentUpdatetime(Date manageNursingContentUpdatetime) {
        this.manageNursingContentUpdatetime = manageNursingContentUpdatetime;
    }

    public Integer getContentOrder() {
        return contentOrder;
    }

    public void setContentOrder(Integer contentOrder) {
        this.contentOrder = contentOrder;
    }
}