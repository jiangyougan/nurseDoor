package com.chance.ssm.po;

import java.util.Date;

public class PostRollPic {
    private String postRollPicId;

    private String postRollPicUrl;

    private String postRollPicAddress;

    private String postRollPicNote;

    private String postRollPicSpeak;

    private String postRollPicRank;

    private String postRollPicCreater;

    private Date postRollPicCreatetime;

    public String getPostRollPicId() {
        return postRollPicId;
    }

    public void setPostRollPicId(String postRollPicId) {
        this.postRollPicId = postRollPicId == null ? null : postRollPicId.trim();
    }

    public String getPostRollPicUrl() {
        return postRollPicUrl;
    }

    public void setPostRollPicUrl(String postRollPicUrl) {
        this.postRollPicUrl = postRollPicUrl == null ? null : postRollPicUrl.trim();
    }

    public String getPostRollPicAddress() {
        return postRollPicAddress;
    }

    public void setPostRollPicAddress(String postRollPicAddress) {
        this.postRollPicAddress = postRollPicAddress == null ? null : postRollPicAddress.trim();
    }

    public String getPostRollPicNote() {
        return postRollPicNote;
    }

    public void setPostRollPicNote(String postRollPicNote) {
        this.postRollPicNote = postRollPicNote == null ? null : postRollPicNote.trim();
    }

    public String getPostRollPicSpeak() {
        return postRollPicSpeak;
    }

    public void setPostRollPicSpeak(String postRollPicSpeak) {
        this.postRollPicSpeak = postRollPicSpeak == null ? null : postRollPicSpeak.trim();
    }

    public String getPostRollPicRank() {
        return postRollPicRank;
    }

    public void setPostRollPicRank(String postRollPicRank) {
        this.postRollPicRank = postRollPicRank == null ? null : postRollPicRank.trim();
    }

    public String getPostRollPicCreater() {
        return postRollPicCreater;
    }

    public void setPostRollPicCreater(String postRollPicCreater) {
        this.postRollPicCreater = postRollPicCreater == null ? null : postRollPicCreater.trim();
    }

    public Date getPostRollPicCreatetime() {
        return postRollPicCreatetime;
    }

    public void setPostRollPicCreatetime(Date postRollPicCreatetime) {
        this.postRollPicCreatetime = postRollPicCreatetime;
    }
}