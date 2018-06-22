package com.chance.ssm.po;

import java.util.Date;

public class CaseLable {
    private String caseLableId;

    private String caseLableName;

    private String caseLableNote;

    private String caseLableCreater;

    private Date caseLableCreatetime;

    private Date caseLableUpdatetime;

    public String getCaseLableId() {
        return caseLableId;
    }

    public void setCaseLableId(String caseLableId) {
        this.caseLableId = caseLableId == null ? null : caseLableId.trim();
    }

    public String getCaseLableName() {
        return caseLableName;
    }

    public void setCaseLableName(String caseLableName) {
        this.caseLableName = caseLableName == null ? null : caseLableName.trim();
    }

    public String getCaseLableNote() {
        return caseLableNote;
    }

    public void setCaseLableNote(String caseLableNote) {
        this.caseLableNote = caseLableNote == null ? null : caseLableNote.trim();
    }

    public String getCaseLableCreater() {
        return caseLableCreater;
    }

    public void setCaseLableCreater(String caseLableCreater) {
        this.caseLableCreater = caseLableCreater == null ? null : caseLableCreater.trim();
    }

    public Date getCaseLableCreatetime() {
        return caseLableCreatetime;
    }

    public void setCaseLableCreatetime(Date caseLableCreatetime) {
        this.caseLableCreatetime = caseLableCreatetime;
    }

    public Date getCaseLableUpdatetime() {
        return caseLableUpdatetime;
    }

    public void setCaseLableUpdatetime(Date caseLableUpdatetime) {
        this.caseLableUpdatetime = caseLableUpdatetime;
    }
}