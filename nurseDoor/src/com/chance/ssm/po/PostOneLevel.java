package com.chance.ssm.po;

import java.util.Date;

public class PostOneLevel {
    private String postOneLevelId;

    private String postOneLevelName;

    private String postOneLevelNote;

    private String postOneLevelSpeak;

    private Integer postOneLevelRank;

    private String postOneLevelCreateter;

    private Date postOneLevelCreatetetime;
    
    private String postTwoInfo;//包含二级学术圈的ID和名称
    
    

    public String getPostTwoInfo() {
		return postTwoInfo;
	}

	public void setPostTwoInfo(String postTwoInfo) {
		this.postTwoInfo = postTwoInfo;
	}

	public String getPostOneLevelId() {
        return postOneLevelId;
    }

    public void setPostOneLevelId(String postOneLevelId) {
        this.postOneLevelId = postOneLevelId == null ? null : postOneLevelId.trim();
    }

    public String getPostOneLevelName() {
        return postOneLevelName;
    }

    public void setPostOneLevelName(String postOneLevelName) {
        this.postOneLevelName = postOneLevelName == null ? null : postOneLevelName.trim();
    }

    public String getPostOneLevelNote() {
        return postOneLevelNote;
    }

    public void setPostOneLevelNote(String postOneLevelNote) {
        this.postOneLevelNote = postOneLevelNote == null ? null : postOneLevelNote.trim();
    }

    public String getPostOneLevelSpeak() {
        return postOneLevelSpeak;
    }

    public void setPostOneLevelSpeak(String postOneLevelSpeak) {
        this.postOneLevelSpeak = postOneLevelSpeak == null ? null : postOneLevelSpeak.trim();
    }

    public Integer getPostOneLevelRank() {
        return postOneLevelRank;
    }

    public void setPostOneLevelRank(Integer postOneLevelRank) {
        this.postOneLevelRank = postOneLevelRank;
    }

    public String getPostOneLevelCreateter() {
        return postOneLevelCreateter;
    }

    public void setPostOneLevelCreateter(String postOneLevelCreateter) {
        this.postOneLevelCreateter = postOneLevelCreateter == null ? null : postOneLevelCreateter.trim();
    }

    public Date getPostOneLevelCreatetetime() {
        return postOneLevelCreatetetime;
    }

    public void setPostOneLevelCreatetetime(Date postOneLevelCreatetetime) {
        this.postOneLevelCreatetetime = postOneLevelCreatetetime;
    }
}