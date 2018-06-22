package com.chance.ssm.po;

import java.util.Date;

public class StandInnerLetter {
    private String standInnerLetterId;

    private String standInnerLetterUserId;

    private Integer standInnerLetterUserIdentity;

    private Integer standInnerLetterUserType;

    private String standInnerLetterTitle;

    private String standInnerLetterNote;

    private String standInnerLetterContent;

    private Date standInnerLetterCreatetime;

    public String getStandInnerLetterId() {
        return standInnerLetterId;
    }

    public void setStandInnerLetterId(String standInnerLetterId) {
        this.standInnerLetterId = standInnerLetterId == null ? null : standInnerLetterId.trim();
    }

    public String getStandInnerLetterUserId() {
        return standInnerLetterUserId;
    }

    public void setStandInnerLetterUserId(String standInnerLetterUserId) {
        this.standInnerLetterUserId = standInnerLetterUserId == null ? null : standInnerLetterUserId.trim();
    }

    public Integer getStandInnerLetterUserIdentity() {
        return standInnerLetterUserIdentity;
    }

    public void setStandInnerLetterUserIdentity(Integer standInnerLetterUserIdentity) {
        this.standInnerLetterUserIdentity = standInnerLetterUserIdentity;
    }

    public Integer getStandInnerLetterUserType() {
        return standInnerLetterUserType;
    }

    public void setStandInnerLetterUserType(Integer standInnerLetterUserType) {
        this.standInnerLetterUserType = standInnerLetterUserType;
    }

    public String getStandInnerLetterTitle() {
        return standInnerLetterTitle;
    }

    public void setStandInnerLetterTitle(String standInnerLetterTitle) {
        this.standInnerLetterTitle = standInnerLetterTitle == null ? null : standInnerLetterTitle.trim();
    }

    public String getStandInnerLetterNote() {
        return standInnerLetterNote;
    }

    public void setStandInnerLetterNote(String standInnerLetterNote) {
        this.standInnerLetterNote = standInnerLetterNote == null ? null : standInnerLetterNote.trim();
    }

    public String getStandInnerLetterContent() {
        return standInnerLetterContent;
    }

    public void setStandInnerLetterContent(String standInnerLetterContent) {
        this.standInnerLetterContent = standInnerLetterContent == null ? null : standInnerLetterContent.trim();
    }

    public Date getStandInnerLetterCreatetime() {
        return standInnerLetterCreatetime;
    }

    public void setStandInnerLetterCreatetime(Date standInnerLetterCreatetime) {
        this.standInnerLetterCreatetime = standInnerLetterCreatetime;
    }
}