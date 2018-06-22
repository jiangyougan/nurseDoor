package com.chance.ssm.po;

import java.util.Date;

public class PostReply {
    private String postReplyId;

    private String postReplyReplyToPeople;

    private String postReplyBeReplyToPeople;

    private String postReplyPostThreeId;

    private String postReplyContent;

    private String postReplyNote;

    private String postReplySpeak;

    private Date postReplyCreatetime;
    
    private String nurseId;

    private String nurseHeader;

    private String nurseNick;

    private String nurseName;

    public String getPostReplyId() {
        return postReplyId;
    }

    public void setPostReplyId(String postReplyId) {
        this.postReplyId = postReplyId == null ? null : postReplyId.trim();
    }

    public String getPostReplyReplyToPeople() {
        return postReplyReplyToPeople;
    }

    public void setPostReplyReplyToPeople(String postReplyReplyToPeople) {
        this.postReplyReplyToPeople = postReplyReplyToPeople == null ? null : postReplyReplyToPeople.trim();
    }

    public String getPostReplyBeReplyToPeople() {
        return postReplyBeReplyToPeople;
    }

    public void setPostReplyBeReplyToPeople(String postReplyBeReplyToPeople) {
        this.postReplyBeReplyToPeople = postReplyBeReplyToPeople == null ? null : postReplyBeReplyToPeople.trim();
    }

    public String getPostReplyPostThreeId() {
        return postReplyPostThreeId;
    }

    public void setPostReplyPostThreeId(String postReplyPostThreeId) {
        this.postReplyPostThreeId = postReplyPostThreeId == null ? null : postReplyPostThreeId.trim();
    }

    public String getPostReplyContent() {
        return postReplyContent;
    }

    public void setPostReplyContent(String postReplyContent) {
        this.postReplyContent = postReplyContent == null ? null : postReplyContent.trim();
    }

    public String getPostReplyNote() {
        return postReplyNote;
    }

    public void setPostReplyNote(String postReplyNote) {
        this.postReplyNote = postReplyNote == null ? null : postReplyNote.trim();
    }

    public String getPostReplySpeak() {
        return postReplySpeak;
    }

    public void setPostReplySpeak(String postReplySpeak) {
        this.postReplySpeak = postReplySpeak == null ? null : postReplySpeak.trim();
    }

    public Date getPostReplyCreatetime() {
        return postReplyCreatetime;
    }

    public void setPostReplyCreatetime(Date postReplyCreatetime) {
        this.postReplyCreatetime = postReplyCreatetime;
    }

	public String getNurseId() {
		return nurseId;
	}

	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}

	public String getNurseHeader() {
		return nurseHeader;
	}

	public void setNurseHeader(String nurseHeader) {
		this.nurseHeader = nurseHeader;
	}

	public String getNurseNick() {
		return nurseNick;
	}

	public void setNurseNick(String nurseNick) {
		this.nurseNick = nurseNick;
	}

	public String getNurseName() {
		return nurseName;
	}

	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}

    
}