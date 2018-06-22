package com.chance.ssm.po;

import java.util.Date;

public class SimpleMajor {
    private String simpleMajorId;

    private String simpleMajorName;

    private String simpleMajorNote;

    private String simpleMajorCreater;

    private Date simpleMajorCreatetime;

    private Date simpleMajorUpdatetime;

    public String getSimpleMajorId() {
        return simpleMajorId;
    }

    public void setSimpleMajorId(String simpleMajorId) {
        this.simpleMajorId = simpleMajorId == null ? null : simpleMajorId.trim();
    }

    public String getSimpleMajorName() {
        return simpleMajorName;
    }

    public void setSimpleMajorName(String simpleMajorName) {
        this.simpleMajorName = simpleMajorName == null ? null : simpleMajorName.trim();
    }

    public String getSimpleMajorNote() {
        return simpleMajorNote;
    }

    public void setSimpleMajorNote(String simpleMajorNote) {
        this.simpleMajorNote = simpleMajorNote == null ? null : simpleMajorNote.trim();
    }

    public String getSimpleMajorCreater() {
        return simpleMajorCreater;
    }

    public void setSimpleMajorCreater(String simpleMajorCreater) {
        this.simpleMajorCreater = simpleMajorCreater == null ? null : simpleMajorCreater.trim();
    }

    public Date getSimpleMajorCreatetime() {
        return simpleMajorCreatetime;
    }

    public void setSimpleMajorCreatetime(Date simpleMajorCreatetime) {
        this.simpleMajorCreatetime = simpleMajorCreatetime;
    }

    public Date getSimpleMajorUpdatetime() {
        return simpleMajorUpdatetime;
    }

    public void setSimpleMajorUpdatetime(Date simpleMajorUpdatetime) {
        this.simpleMajorUpdatetime = simpleMajorUpdatetime;
    }
}