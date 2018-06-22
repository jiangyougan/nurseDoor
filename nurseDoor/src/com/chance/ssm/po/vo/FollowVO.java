package com.chance.ssm.po.vo;

import com.chance.ssm.po.Follow;

public class FollowVO extends Follow {
	
	private String nurseHeader;//护士头像
	
	private String nurseNick;//护士昵称
	
	private String workUnit;//护士工作单位
	
	private String nurseNote;//备注
	
	

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

	public String getWorkUnit() {
		return workUnit;
	}

	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}

	public String getNurseNote() {
		return nurseNote;
	}

	public void setNurseNote(String nurseNote) {
		this.nurseNote = nurseNote;
	}
	
	
	
	

}
