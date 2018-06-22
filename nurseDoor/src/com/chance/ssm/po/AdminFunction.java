package com.chance.ssm.po;

import java.util.Date;

public class AdminFunction {
    private String adminFunctionId;

    private String adminFunctionModularId;

    private Integer adminFunctionAdd;

    private Integer adminFunctionDel;

    private Integer adminFunctionUpd;

    private Integer adminFunctionSel;

    private String adminFunctionCreateter;

    private Date adminFunctionCreatetime;

    public String getAdminFunctionId() {
        return adminFunctionId;
    }

    public void setAdminFunctionId(String adminFunctionId) {
        this.adminFunctionId = adminFunctionId == null ? null : adminFunctionId.trim();
    }

    public String getAdminFunctionModularId() {
        return adminFunctionModularId;
    }

    public void setAdminFunctionModularId(String adminFunctionModularId) {
        this.adminFunctionModularId = adminFunctionModularId == null ? null : adminFunctionModularId.trim();
    }

    public Integer getAdminFunctionAdd() {
        return adminFunctionAdd;
    }

    public void setAdminFunctionAdd(Integer adminFunctionAdd) {
        this.adminFunctionAdd = adminFunctionAdd;
    }

    public Integer getAdminFunctionDel() {
        return adminFunctionDel;
    }

    public void setAdminFunctionDel(Integer adminFunctionDel) {
        this.adminFunctionDel = adminFunctionDel;
    }

    public Integer getAdminFunctionUpd() {
        return adminFunctionUpd;
    }

    public void setAdminFunctionUpd(Integer adminFunctionUpd) {
        this.adminFunctionUpd = adminFunctionUpd;
    }

    public Integer getAdminFunctionSel() {
        return adminFunctionSel;
    }

    public void setAdminFunctionSel(Integer adminFunctionSel) {
        this.adminFunctionSel = adminFunctionSel;
    }

    public String getAdminFunctionCreateter() {
        return adminFunctionCreateter;
    }

    public void setAdminFunctionCreateter(String adminFunctionCreateter) {
        this.adminFunctionCreateter = adminFunctionCreateter == null ? null : adminFunctionCreateter.trim();
    }

    public Date getAdminFunctionCreatetime() {
        return adminFunctionCreatetime;
    }

    public void setAdminFunctionCreatetime(Date adminFunctionCreatetime) {
        this.adminFunctionCreatetime = adminFunctionCreatetime;
    }
}