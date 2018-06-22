package com.chance.ssm.po;

import java.util.Date;

public class NurseFinishOrderSignin {
    private String nurseFinishOrderSignin;

    private String nurseFinishOrderNurseId;

    private Integer nurseFinishOrderNurseSignin;

    private Date nurseFinishOrderCreatetime;

    public String getNurseFinishOrderSignin() {
        return nurseFinishOrderSignin;
    }

    public void setNurseFinishOrderSignin(String nurseFinishOrderSignin) {
        this.nurseFinishOrderSignin = nurseFinishOrderSignin == null ? null : nurseFinishOrderSignin.trim();
    }

    public String getNurseFinishOrderNurseId() {
        return nurseFinishOrderNurseId;
    }

    public void setNurseFinishOrderNurseId(String nurseFinishOrderNurseId) {
        this.nurseFinishOrderNurseId = nurseFinishOrderNurseId == null ? null : nurseFinishOrderNurseId.trim();
    }

    public Integer getNurseFinishOrderNurseSignin() {
        return nurseFinishOrderNurseSignin;
    }

    public void setNurseFinishOrderNurseSignin(Integer nurseFinishOrderNurseSignin) {
        this.nurseFinishOrderNurseSignin = nurseFinishOrderNurseSignin;
    }

    public Date getNurseFinishOrderCreatetime() {
        return nurseFinishOrderCreatetime;
    }

    public void setNurseFinishOrderCreatetime(Date nurseFinishOrderCreatetime) {
        this.nurseFinishOrderCreatetime = nurseFinishOrderCreatetime;
    }
}