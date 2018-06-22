package com.chance.ssm.po.vo;

import com.chance.ssm.po.Evaluate;

public class EvaluateVO extends Evaluate {
	
	private String userNike; //用户昵称
	
	private String userPhone;//用户电话 
	
	private String userHeader;//用户头像
	
	

	public String getUserHeader() {
		return userHeader;
	}

	public void setUserHeader(String userHeader) {
		this.userHeader = userHeader;
	}

	public String getUserNike() {
		return userNike;
	}

	public void setUserNike(String userNike) {
		this.userNike = userNike;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	
	
	

}
