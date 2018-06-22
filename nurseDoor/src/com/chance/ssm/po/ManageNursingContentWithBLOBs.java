package com.chance.ssm.po;

public class ManageNursingContentWithBLOBs extends ManageNursingContent {
    private String manageNursingContentForpeople;

    private String manageNursingContentLook;

    public String getManageNursingContentForpeople() {
        return manageNursingContentForpeople;
    }

    public void setManageNursingContentForpeople(String manageNursingContentForpeople) {
        this.manageNursingContentForpeople = manageNursingContentForpeople == null ? null : manageNursingContentForpeople.trim();
    }

    public String getManageNursingContentLook() {
        return manageNursingContentLook;
    }

    public void setManageNursingContentLook(String manageNursingContentLook) {
        this.manageNursingContentLook = manageNursingContentLook == null ? null : manageNursingContentLook.trim();
    }
}