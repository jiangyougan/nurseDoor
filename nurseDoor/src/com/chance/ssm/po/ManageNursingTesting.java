package com.chance.ssm.po;

import java.util.Date;

public class ManageNursingTesting {
    private String manageNursingTestingId;

    private String manageNursingTestingMacontent;

    private String manageNursingTestingName;

    private String manageNursingTestingCreatetime;

    private Date manageNursingTestingCreateter;

    private Date manageNursingTestingUpdatetime;

    public String getManageNursingTestingId() {
        return manageNursingTestingId;
    }

    public void setManageNursingTestingId(String manageNursingTestingId) {
        this.manageNursingTestingId = manageNursingTestingId == null ? null : manageNursingTestingId.trim();
    }

    public String getManageNursingTestingMacontent() {
        return manageNursingTestingMacontent;
    }

    public void setManageNursingTestingMacontent(String manageNursingTestingMacontent) {
        this.manageNursingTestingMacontent = manageNursingTestingMacontent == null ? null : manageNursingTestingMacontent.trim();
    }

    public String getManageNursingTestingName() {
        return manageNursingTestingName;
    }

    public void setManageNursingTestingName(String manageNursingTestingName) {
        this.manageNursingTestingName = manageNursingTestingName == null ? null : manageNursingTestingName.trim();
    }

    public String getManageNursingTestingCreatetime() {
        return manageNursingTestingCreatetime;
    }

    public void setManageNursingTestingCreatetime(String manageNursingTestingCreatetime) {
        this.manageNursingTestingCreatetime = manageNursingTestingCreatetime == null ? null : manageNursingTestingCreatetime.trim();
    }

    public Date getManageNursingTestingCreateter() {
        return manageNursingTestingCreateter;
    }

    public void setManageNursingTestingCreateter(Date manageNursingTestingCreateter) {
        this.manageNursingTestingCreateter = manageNursingTestingCreateter;
    }

    public Date getManageNursingTestingUpdatetime() {
        return manageNursingTestingUpdatetime;
    }

    public void setManageNursingTestingUpdatetime(Date manageNursingTestingUpdatetime) {
        this.manageNursingTestingUpdatetime = manageNursingTestingUpdatetime;
    }
}