package com.chance.ssm.po;

import java.util.Date;

public class RollPic {
    private String rollPicId;

    private String rollPicUrl;

    private String rollPicAddress;

    private String rollPicNote;

    private String rollPicSpeak;

    private String rollPicCreater;

    private Date rollPicCreatetime;

    public String getRollPicId() {
        return rollPicId;
    }

    public void setRollPicId(String rollPicId) {
        this.rollPicId = rollPicId == null ? null : rollPicId.trim();
    }

    public String getRollPicUrl() {
        return rollPicUrl;
    }

    public void setRollPicUrl(String rollPicUrl) {
        this.rollPicUrl = rollPicUrl == null ? null : rollPicUrl.trim();
    }

    public String getRollPicAddress() {
        return rollPicAddress;
    }

    public void setRollPicAddress(String rollPicAddress) {
        this.rollPicAddress = rollPicAddress == null ? null : rollPicAddress.trim();
    }

    public String getRollPicNote() {
        return rollPicNote;
    }

    public void setRollPicNote(String rollPicNote) {
        this.rollPicNote = rollPicNote == null ? null : rollPicNote.trim();
    }

    public String getRollPicSpeak() {
        return rollPicSpeak;
    }

    public void setRollPicSpeak(String rollPicSpeak) {
        this.rollPicSpeak = rollPicSpeak == null ? null : rollPicSpeak.trim();
    }

    public String getRollPicCreater() {
        return rollPicCreater;
    }

    public void setRollPicCreater(String rollPicCreater) {
        this.rollPicCreater = rollPicCreater == null ? null : rollPicCreater.trim();
    }

    public Date getRollPicCreatetime() {
        return rollPicCreatetime;
    }

    public void setRollPicCreatetime(Date rollPicCreatetime) {
        this.rollPicCreatetime = rollPicCreatetime;
    }
}