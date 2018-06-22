package com.chance.ssm.po;

import java.util.Date;

public class PostNursefFocus {
    private String postNursefFocusId;

    private String postNursefFocusNurseId;

    private String postNursefPostTwoLevelId;

    private String postNursefFocusNote;

    private String postNursefFocusSpeak;

    private Date postNursefFocusCreatetime;

    public String getPostNursefFocusId() {
        return postNursefFocusId;
    }

    public void setPostNursefFocusId(String postNursefFocusId) {
        this.postNursefFocusId = postNursefFocusId == null ? null : postNursefFocusId.trim();
    }

    public String getPostNursefFocusNurseId() {
        return postNursefFocusNurseId;
    }

    public void setPostNursefFocusNurseId(String postNursefFocusNurseId) {
        this.postNursefFocusNurseId = postNursefFocusNurseId == null ? null : postNursefFocusNurseId.trim();
    }

    public String getPostNursefPostTwoLevelId() {
        return postNursefPostTwoLevelId;
    }

    public void setPostNursefPostTwoLevelId(String postNursefPostTwoLevelId) {
        this.postNursefPostTwoLevelId = postNursefPostTwoLevelId == null ? null : postNursefPostTwoLevelId.trim();
    }

    public String getPostNursefFocusNote() {
        return postNursefFocusNote;
    }

    public void setPostNursefFocusNote(String postNursefFocusNote) {
        this.postNursefFocusNote = postNursefFocusNote == null ? null : postNursefFocusNote.trim();
    }

    public String getPostNursefFocusSpeak() {
        return postNursefFocusSpeak;
    }

    public void setPostNursefFocusSpeak(String postNursefFocusSpeak) {
        this.postNursefFocusSpeak = postNursefFocusSpeak == null ? null : postNursefFocusSpeak.trim();
    }

    public Date getPostNursefFocusCreatetime() {
        return postNursefFocusCreatetime;
    }

    public void setPostNursefFocusCreatetime(Date postNursefFocusCreatetime) {
        this.postNursefFocusCreatetime = postNursefFocusCreatetime;
    }
}