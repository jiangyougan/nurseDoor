package com.chance.ssm.po;

import java.util.Date;

public class NursingTestingContent {
    private String nursingTestingContentid;

    private String nursingOrderid;

    private String nursingNurseid;//服务检测内容（如血糖，血压）

    private String nursingTestingId;//护理具体数据（10/20）

    private String nursingProjectNote;//护理具体数据单位（摄氏度）

    private Date nursingCreatetime;

    public String getNursingTestingContentid() {
        return nursingTestingContentid;
    }

    public void setNursingTestingContentid(String nursingTestingContentid) {
        this.nursingTestingContentid = nursingTestingContentid == null ? null : nursingTestingContentid.trim();
    }

    public String getNursingOrderid() {
        return nursingOrderid;
    }

    public void setNursingOrderid(String nursingOrderid) {
        this.nursingOrderid = nursingOrderid == null ? null : nursingOrderid.trim();
    }

    public String getNursingNurseid() {
        return nursingNurseid;
    }

    public void setNursingNurseid(String nursingNurseid) {
        this.nursingNurseid = nursingNurseid == null ? null : nursingNurseid.trim();
    }

    public String getNursingTestingId() {
        return nursingTestingId;
    }

    public void setNursingTestingId(String nursingTestingId) {
        this.nursingTestingId = nursingTestingId == null ? null : nursingTestingId.trim();
    }

    public String getNursingProjectNote() {
        return nursingProjectNote;
    }

    public void setNursingProjectNote(String nursingProjectNote) {
        this.nursingProjectNote = nursingProjectNote == null ? null : nursingProjectNote.trim();
    }

    public Date getNursingCreatetime() {
        return nursingCreatetime;
    }

    public void setNursingCreatetime(Date nursingCreatetime) {
        this.nursingCreatetime = nursingCreatetime;
    }
}