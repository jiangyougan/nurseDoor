package com.chance.ssm.po.vo;

import com.chance.ssm.po.ManageNursingContentWithBLOBs;

public class ManageNursingContentVO extends ManageNursingContentWithBLOBs {
	
	private String projectNname;//服务名称
	
	private String projectId;//服务ID
	
	private String nursedNumber;// 护理次数
	
	private String minMoney;//最低价钱
	
	private String nursingNurseid;//用户ID
	
//	private List<Note> noteList;//备注信息
	
	

	public String getMinMoney() {
		return minMoney;
	}

	public String getNursingNurseid() {
		return nursingNurseid;
	}

	public void setNursingNurseid(String nursingNurseid) {
		this.nursingNurseid = nursingNurseid;
	}

	public void setMinMoney(String minMoney) {
		this.minMoney = minMoney;
	}

//	public List<Note> getNoteList() {
//		return noteList;
//	}
//
//	public void setNoteList(List<Note> noteList) {
//		this.noteList = noteList;
//	}

	public String getNursedNumber() {
		return nursedNumber;
	}

	public void setNursedNumber(String nursedNumber) {
		this.nursedNumber = nursedNumber;
	}

	public String getProjectNname() {
		return projectNname;
	}

	public void setProjectNname(String projectNname) {
		this.projectNname = projectNname;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	
}
