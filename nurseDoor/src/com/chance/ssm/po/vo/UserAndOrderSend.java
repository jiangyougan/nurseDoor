package com.chance.ssm.po.vo;

import com.chance.ssm.po.OrderSend;

public class UserAndOrderSend extends OrderSend {
	private String userId;
	private String userNick;
	private String userName;
	
	private String nurseId;
	private String nurseName;
	private String nurseNick;
	
	private Integer cancelBeforeState;//取消前的状态
	
	private  Integer orderCancalUserAgree;//用户是否同意(0同意/1不同意)
	
	private String contentId;//二级服务ID
	
	private int handleMode;//取消未退款订单的记录数据0退款/1换护士/2原人处理
	
	private String  complaintContentOver;
	
	
	
	
	public String getComplaintContentOver() {
		return complaintContentOver;
	}
	public void setComplaintContentOver(String complaintContentOver) {
		this.complaintContentOver = complaintContentOver;
	}
	public int getHandleMode() {
		return handleMode;
	}
	public void setHandleMode(int handleMode) {
		this.handleMode = handleMode;
	}
	public Integer getOrderCancalUserAgree() {
		return orderCancalUserAgree;
	}
	public void setOrderCancalUserAgree(Integer orderCancalUserAgree) {
		this.orderCancalUserAgree = orderCancalUserAgree;
	}
	public String getContentId() {
		return contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public Integer getCancelBeforeState() {
		return cancelBeforeState;
	}
	public void setCancelBeforeState(Integer cancelBeforeState) {
		this.cancelBeforeState = cancelBeforeState;
	}
	public String getNurseId() {
		return nurseId;
	}
	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}
	public String getNurseName() {
		return nurseName;
	}
	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}
	public String getNurseNick() {
		return nurseNick;
	}
	public void setNurseNick(String nurseNick) {
		this.nurseNick = nurseNick;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
