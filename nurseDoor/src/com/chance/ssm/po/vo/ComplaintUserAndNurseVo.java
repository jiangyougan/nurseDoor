package com.chance.ssm.po.vo;

import com.chance.ssm.po.Complaint;

public class ComplaintUserAndNurseVo extends Complaint{
	private String nurseId;
	private String  nurseHeader;
	private String  nurseNick;
	private String  nurseName;
	private String  userId;
	private String  userHeader;
	private String  userNick;
	private String  userName;
	
	private String orderSendNumber;
	
	
	public String getOrderSendNumber() {
		return orderSendNumber;
	}
	public void setOrderSendNumber(String orderSendNumber) {
		this.orderSendNumber = orderSendNumber;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserHeader() {
		return userHeader;
	}
	public void setUserHeader(String userHeader) {
		this.userHeader = userHeader;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
