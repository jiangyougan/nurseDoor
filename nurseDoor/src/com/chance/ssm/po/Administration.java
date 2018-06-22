package com.chance.ssm.po;

import java.util.Date;

public class Administration {
    private String administrationId;

    private String administrationName;

    private String administrationPwd;

    private String administrationNick;

    private String administrationTrueName;

    private String administrationDepartment;

    private Integer administrationSex;

    private String administrationEmail;

    private String administrationPhone;

    private String administrationAddress;

    private Integer administrationGrade;

    private Integer administrationState;

    private Date administrationCreatetime;

    private String administrationCreateter;

    public String getAdministrationId() {
        return administrationId;
    }

    public void setAdministrationId(String administrationId) {
        this.administrationId = administrationId == null ? null : administrationId.trim();
    }

    public String getAdministrationName() {
        return administrationName;
    }

    public void setAdministrationName(String administrationName) {
        this.administrationName = administrationName == null ? null : administrationName.trim();
    }

    public String getAdministrationPwd() {
        return administrationPwd;
    }

    public void setAdministrationPwd(String administrationPwd) {
        this.administrationPwd = administrationPwd == null ? null : administrationPwd.trim();
    }

    public String getAdministrationNick() {
        return administrationNick;
    }

    public void setAdministrationNick(String administrationNick) {
        this.administrationNick = administrationNick == null ? null : administrationNick.trim();
    }

    public String getAdministrationTrueName() {
        return administrationTrueName;
    }

    public void setAdministrationTrueName(String administrationTrueName) {
        this.administrationTrueName = administrationTrueName == null ? null : administrationTrueName.trim();
    }

    public String getAdministrationDepartment() {
        return administrationDepartment;
    }

    public void setAdministrationDepartment(String administrationDepartment) {
        this.administrationDepartment = administrationDepartment == null ? null : administrationDepartment.trim();
    }

    public Integer getAdministrationSex() {
        return administrationSex;
    }

    public void setAdministrationSex(Integer administrationSex) {
        this.administrationSex = administrationSex;
    }

    public String getAdministrationEmail() {
        return administrationEmail;
    }

    public void setAdministrationEmail(String administrationEmail) {
        this.administrationEmail = administrationEmail == null ? null : administrationEmail.trim();
    }

    public String getAdministrationPhone() {
        return administrationPhone;
    }

    public void setAdministrationPhone(String administrationPhone) {
        this.administrationPhone = administrationPhone == null ? null : administrationPhone.trim();
    }

    public String getAdministrationAddress() {
        return administrationAddress;
    }

    public void setAdministrationAddress(String administrationAddress) {
        this.administrationAddress = administrationAddress == null ? null : administrationAddress.trim();
    }

    public Integer getAdministrationGrade() {
        return administrationGrade;
    }

    public void setAdministrationGrade(Integer administrationGrade) {
        this.administrationGrade = administrationGrade;
    }

    public Integer getAdministrationState() {
        return administrationState;
    }

    public void setAdministrationState(Integer administrationState) {
        this.administrationState = administrationState;
    }

    public Date getAdministrationCreatetime() {
        return administrationCreatetime;
    }

    public void setAdministrationCreatetime(Date administrationCreatetime) {
        this.administrationCreatetime = administrationCreatetime;
    }

    public String getAdministrationCreateter() {
        return administrationCreateter;
    }

    public void setAdministrationCreateter(String administrationCreateter) {
        this.administrationCreateter = administrationCreateter == null ? null : administrationCreateter.trim();
    }
}