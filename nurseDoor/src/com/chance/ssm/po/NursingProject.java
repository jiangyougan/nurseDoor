package com.chance.ssm.po;

import java.util.Date;

public class NursingProject {
    private String nursingProjectId;

    private String nursingNurseid;

    private String nursingProjectMacontent;

    private String nursingProjectNote;

    private Date nursingProjectCreatetime;

    public String getNursingProjectId() {
        return nursingProjectId;
    }

    public void setNursingProjectId(String nursingProjectId) {
        this.nursingProjectId = nursingProjectId == null ? null : nursingProjectId.trim();
    }

    public String getNursingNurseid() {
        return nursingNurseid;
    }

    public void setNursingNurseid(String nursingNurseid) {
        this.nursingNurseid = nursingNurseid == null ? null : nursingNurseid.trim();
    }

    public String getNursingProjectMacontent() {
        return nursingProjectMacontent;
    }

    public void setNursingProjectMacontent(String nursingProjectMacontent) {
        this.nursingProjectMacontent = nursingProjectMacontent == null ? null : nursingProjectMacontent.trim();
    }

    public String getNursingProjectNote() {
        return nursingProjectNote;
    }

    public void setNursingProjectNote(String nursingProjectNote) {
        this.nursingProjectNote = nursingProjectNote == null ? null : nursingProjectNote.trim();
    }

    public Date getNursingProjectCreatetime() {
        return nursingProjectCreatetime;
    }

    public void setNursingProjectCreatetime(Date nursingProjectCreatetime) {
        this.nursingProjectCreatetime = nursingProjectCreatetime;
    }
}