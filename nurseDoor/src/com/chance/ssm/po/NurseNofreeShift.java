package com.chance.ssm.po;

import java.util.Date;

public class NurseNofreeShift {
    private String nurseNofreeShiftId;

    private String nurseNofreeShiftNurseId;

    private String nurseNofreeShiftName;

    private String nurseNofreeShiftNote;

    private String nurseNofreeShiftColor;

    private String nurseNofreeShiftBegintime;

    private String nurseNofreeShiftStoptime;

    private Integer nurseNofreeShiftState;

    private Date nurseNofreeShiftCreatetime;

    public String getNurseNofreeShiftId() {
        return nurseNofreeShiftId;
    }

    public void setNurseNofreeShiftId(String nurseNofreeShiftId) {
        this.nurseNofreeShiftId = nurseNofreeShiftId == null ? null : nurseNofreeShiftId.trim();
    }

    public String getNurseNofreeShiftNurseId() {
        return nurseNofreeShiftNurseId;
    }

    public void setNurseNofreeShiftNurseId(String nurseNofreeShiftNurseId) {
        this.nurseNofreeShiftNurseId = nurseNofreeShiftNurseId == null ? null : nurseNofreeShiftNurseId.trim();
    }

    public String getNurseNofreeShiftName() {
        return nurseNofreeShiftName;
    }

    public void setNurseNofreeShiftName(String nurseNofreeShiftName) {
        this.nurseNofreeShiftName = nurseNofreeShiftName == null ? null : nurseNofreeShiftName.trim();
    }

    public String getNurseNofreeShiftNote() {
        return nurseNofreeShiftNote;
    }

    public void setNurseNofreeShiftNote(String nurseNofreeShiftNote) {
        this.nurseNofreeShiftNote = nurseNofreeShiftNote == null ? null : nurseNofreeShiftNote.trim();
    }

    public String getNurseNofreeShiftColor() {
        return nurseNofreeShiftColor;
    }

    public void setNurseNofreeShiftColor(String nurseNofreeShiftColor) {
        this.nurseNofreeShiftColor = nurseNofreeShiftColor == null ? null : nurseNofreeShiftColor.trim();
    }

    public String getNurseNofreeShiftBegintime() {
        return nurseNofreeShiftBegintime;
    }

    public void setNurseNofreeShiftBegintime(String nurseNofreeShiftBegintime) {
        this.nurseNofreeShiftBegintime = nurseNofreeShiftBegintime == null ? null : nurseNofreeShiftBegintime.trim();
    }

    public String getNurseNofreeShiftStoptime() {
        return nurseNofreeShiftStoptime;
    }

    public void setNurseNofreeShiftStoptime(String nurseNofreeShiftStoptime) {
        this.nurseNofreeShiftStoptime = nurseNofreeShiftStoptime == null ? null : nurseNofreeShiftStoptime.trim();
    }

    public Integer getNurseNofreeShiftState() {
        return nurseNofreeShiftState;
    }

    public void setNurseNofreeShiftState(Integer nurseNofreeShiftState) {
        this.nurseNofreeShiftState = nurseNofreeShiftState;
    }

    public Date getNurseNofreeShiftCreatetime() {
        return nurseNofreeShiftCreatetime;
    }

    public void setNurseNofreeShiftCreatetime(Date nurseNofreeShiftCreatetime) {
        this.nurseNofreeShiftCreatetime = nurseNofreeShiftCreatetime;
    }
}