package com.chance.ssm.po.vo;

import com.chance.ssm.po.Nurse;

public class NurseVO extends Nurse implements Comparable {
	private String ApprovalRating;// 好评率
	private String NursedNumber;// 护理次数
	private String AttentionNumber;// 关注人数
	private double distance;// 距离

	private String nurseNumber;// 护士个数
	
	private String isfollow;//是否已经被这个用户关注
	

	public String getIsfollow() {
		return isfollow;
	}

	public void setIsfollow(String isfollow) {
		this.isfollow = isfollow;
	}

	public String getNurseNumber() {
		return nurseNumber;
	}

	public void setNurseNumber(String nurseNumber) {
		this.nurseNumber = nurseNumber;
	}

	public String getApprovalRating() {
		return ApprovalRating;
	}

	public void setApprovalRating(String approvalRating) {
		ApprovalRating = approvalRating;
	}

	public String getNursedNumber() {
		return NursedNumber;
	}

	public void setNursedNumber(String nursedNumber) {
		NursedNumber = nursedNumber;
	}

	public String getAttentionNumber() {
		return AttentionNumber;
	}

	public void setAttentionNumber(String attentionNumber) {
		AttentionNumber = attentionNumber;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		NurseVO n1 = (NurseVO) o;
		// int otherdis = (new Double(n1.getDistance())).intValue();
		// int thisdis = (new Double(this.distance)).intValue();\
		if (this.distance > n1.getDistance()) {
			return 0;
		} else {
			return -1;
		}

	}

}
