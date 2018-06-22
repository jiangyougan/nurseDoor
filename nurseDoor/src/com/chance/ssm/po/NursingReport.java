package com.chance.ssm.po;

import java.util.Date;

public class NursingReport {
    private String nursingReportid;

    private String nursingReportOrderid;

    private String nursingReportNurseid;

    private String nursingReportContentid;

    private String nursingReportNote;

    private String nursingReportServicepic;

    private String nursingReportAddrecords;

    private String nursingReportLable;

    private String nursingReportpic;

    private Date nursingReportCreatetime;

    public String getNursingReportid() {
        return nursingReportid;
    }

    public void setNursingReportid(String nursingReportid) {
        this.nursingReportid = nursingReportid == null ? null : nursingReportid.trim();
    }

    public String getNursingReportOrderid() {
        return nursingReportOrderid;
    }

    public void setNursingReportOrderid(String nursingReportOrderid) {
        this.nursingReportOrderid = nursingReportOrderid == null ? null : nursingReportOrderid.trim();
    }

    public String getNursingReportNurseid() {
        return nursingReportNurseid;
    }

    public void setNursingReportNurseid(String nursingReportNurseid) {
        this.nursingReportNurseid = nursingReportNurseid == null ? null : nursingReportNurseid.trim();
    }

    public String getNursingReportContentid() {
        return nursingReportContentid;
    }

    public void setNursingReportContentid(String nursingReportContentid) {
        this.nursingReportContentid = nursingReportContentid == null ? null : nursingReportContentid.trim();
    }

    public String getNursingReportNote() {
        return nursingReportNote;
    }

    public void setNursingReportNote(String nursingReportNote) {
        this.nursingReportNote = nursingReportNote == null ? null : nursingReportNote.trim();
    }

    public String getNursingReportServicepic() {
        return nursingReportServicepic;
    }

    public void setNursingReportServicepic(String nursingReportServicepic) {
        this.nursingReportServicepic = nursingReportServicepic == null ? null : nursingReportServicepic.trim();
    }

    public String getNursingReportAddrecords() {
        return nursingReportAddrecords;
    }

    public void setNursingReportAddrecords(String nursingReportAddrecords) {
        this.nursingReportAddrecords = nursingReportAddrecords == null ? null : nursingReportAddrecords.trim();
    }

    public String getNursingReportLable() {
        return nursingReportLable;
    }

    public void setNursingReportLable(String nursingReportLable) {
        this.nursingReportLable = nursingReportLable == null ? null : nursingReportLable.trim();
    }

    public String getNursingReportpic() {
        return nursingReportpic;
    }

    public void setNursingReportpic(String nursingReportpic) {
        this.nursingReportpic = nursingReportpic == null ? null : nursingReportpic.trim();
    }

    public Date getNursingReportCreatetime() {
        return nursingReportCreatetime;
    }

    public void setNursingReportCreatetime(Date nursingReportCreatetime) {
        this.nursingReportCreatetime = nursingReportCreatetime;
    }
}