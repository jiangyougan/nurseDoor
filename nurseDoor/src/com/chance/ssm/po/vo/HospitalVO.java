package com.chance.ssm.po.vo;

import com.chance.ssm.po.Hospital;

public class HospitalVO extends Hospital {
	
	private String majorId;//专业ID
	
	private String majorName;//专业名称

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	
	
}
