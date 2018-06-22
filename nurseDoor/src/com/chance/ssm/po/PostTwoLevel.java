package com.chance.ssm.po;

import java.util.Date;

public class PostTwoLevel {
    private String postTwoLevelId;

    private String postOneLevelId;

    private String postTwoLevelName;

    private String postTwoLevelNote;

    private String postTwoLevelSpeak;

    private Integer postTwoLevelRank;

    private String postTwoLevelCreateter;

    private Date postTwoLevelCreatetime;

    public String getPostTwoLevelId() {
        return postTwoLevelId;
    }

    public void setPostTwoLevelId(String postTwoLevelId) {
        this.postTwoLevelId = postTwoLevelId == null ? null : postTwoLevelId.trim();
    }

    public String getPostOneLevelId() {
        return postOneLevelId;
    }

    public void setPostOneLevelId(String postOneLevelId) {
        this.postOneLevelId = postOneLevelId == null ? null : postOneLevelId.trim();
    }

    public String getPostTwoLevelName() {
        return postTwoLevelName;
    }

    public void setPostTwoLevelName(String postTwoLevelName) {
        this.postTwoLevelName = postTwoLevelName == null ? null : postTwoLevelName.trim();
    }

    public String getPostTwoLevelNote() {
        return postTwoLevelNote;
    }

    public void setPostTwoLevelNote(String postTwoLevelNote) {
        this.postTwoLevelNote = postTwoLevelNote == null ? null : postTwoLevelNote.trim();
    }

    public String getPostTwoLevelSpeak() {
        return postTwoLevelSpeak;
    }

    public void setPostTwoLevelSpeak(String postTwoLevelSpeak) {
        this.postTwoLevelSpeak = postTwoLevelSpeak == null ? null : postTwoLevelSpeak.trim();
    }

    public Integer getPostTwoLevelRank() {
        return postTwoLevelRank;
    }

    public void setPostTwoLevelRank(Integer postTwoLevelRank) {
        this.postTwoLevelRank = postTwoLevelRank;
    }

    public String getPostTwoLevelCreateter() {
        return postTwoLevelCreateter;
    }

    public void setPostTwoLevelCreateter(String postTwoLevelCreateter) {
        this.postTwoLevelCreateter = postTwoLevelCreateter == null ? null : postTwoLevelCreateter.trim();
    }

    public Date getPostTwoLevelCreatetime() {
        return postTwoLevelCreatetime;
    }

    public void setPostTwoLevelCreatetime(Date postTwoLevelCreatetime) {
        this.postTwoLevelCreatetime = postTwoLevelCreatetime;
    }
}