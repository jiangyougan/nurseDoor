package com.chance.ssm.po.vo;

public class NurseRankingVO {
	private String nurseId;//护士id
	private String nurseHeader;//护士头像
	private String nurseNick;//护士昵称
	private String  nurseMark;//护士积分
	private Integer followCounts;//关注数
	private String ranks;//护士排行
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
	public String getNurseMark() {
		return nurseMark;
	}
	public void setNurseMark(String nurseMark) {
		this.nurseMark = nurseMark;
	}
	public Integer getFollowCounts() {
		return followCounts;
	}
	public void setFollowCounts(Integer followCounts) {
		this.followCounts = followCounts;
	}
	public String getRanks() {
		return ranks;
	}
	public void setRanks(String ranks) {
		this.ranks = ranks;
	}
	
	
	
}
