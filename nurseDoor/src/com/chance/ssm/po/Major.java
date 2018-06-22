package com.chance.ssm.po;

import java.util.Date;

public class Major {
    private String majorId;

    private String majorName;

    private String majorNote;

    private String majorDetails;

    private String majorCreateter;

    private Date majorCteatetime;
    
    private String hbt; //医院
    
    

    public String getHbt() {
		return hbt;
	}

	public void setHbt(String hbt) {
		this.hbt = hbt;
	}

	public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId == null ? null : majorId.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public String getMajorNote() {
        return majorNote;
    }

    public void setMajorNote(String majorNote) {
        this.majorNote = majorNote == null ? null : majorNote.trim();
    }

    public String getMajorDetails() {
        return majorDetails;
    }

    public void setMajorDetails(String majorDetails) {
        this.majorDetails = majorDetails == null ? null : majorDetails.trim();
    }

    public String getMajorCreateter() {
        return majorCreateter;
    }

    public void setMajorCreateter(String majorCreateter) {
        this.majorCreateter = majorCreateter == null ? null : majorCreateter.trim();
    }

    public Date getMajorCteatetime() {
        return majorCteatetime;
    }

    public void setMajorCteatetime(Date majorCteatetime) {
        this.majorCteatetime = majorCteatetime;
    }
}