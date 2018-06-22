package com.chance.ssm.po;

import java.util.Date;

public class NurseNofree {
    private String nurseNofreeId;

    private String nurseNofreeNurseid;

    private String nurseNofreeShiftId;

    private String nurseNofreeName;

    private String nurseNofreeNote;

    private Date nurseNofreeDate;

    private Date nurseNofreeCreatetime;

    public String getNurseNofreeId() {
        return nurseNofreeId;
    }

    public void setNurseNofreeId(String nurseNofreeId) {
        this.nurseNofreeId = nurseNofreeId == null ? null : nurseNofreeId.trim();
    }

    public String getNurseNofreeNurseid() {
        return nurseNofreeNurseid;
    }

    public void setNurseNofreeNurseid(String nurseNofreeNurseid) {
        this.nurseNofreeNurseid = nurseNofreeNurseid == null ? null : nurseNofreeNurseid.trim();
    }

    public String getNurseNofreeShiftId() {
        return nurseNofreeShiftId;
    }

    public void setNurseNofreeShiftId(String nurseNofreeShiftId) {
        this.nurseNofreeShiftId = nurseNofreeShiftId == null ? null : nurseNofreeShiftId.trim();
    }

    public String getNurseNofreeName() {
        return nurseNofreeName;
    }

    public void setNurseNofreeName(String nurseNofreeName) {
        this.nurseNofreeName = nurseNofreeName == null ? null : nurseNofreeName.trim();
    }

    public String getNurseNofreeNote() {
        return nurseNofreeNote;
    }

    public void setNurseNofreeNote(String nurseNofreeNote) {
        this.nurseNofreeNote = nurseNofreeNote == null ? null : nurseNofreeNote.trim();
    }

    public Date getNurseNofreeDate() {
        return nurseNofreeDate;
    }

    public void setNurseNofreeDate(Date nurseNofreeDate) {
        this.nurseNofreeDate = nurseNofreeDate;
    }

    public Date getNurseNofreeCreatetime() {
        return nurseNofreeCreatetime;
    }

    public void setNurseNofreeCreatetime(Date nurseNofreeCreatetime) {
        this.nurseNofreeCreatetime = nurseNofreeCreatetime;
    }
}