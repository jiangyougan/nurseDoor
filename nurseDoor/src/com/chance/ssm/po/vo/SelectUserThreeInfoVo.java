package com.chance.ssm.po.vo;

import java.math.BigDecimal;

public class SelectUserThreeInfoVo {
	
	  private String userCity;//支付宝账号

	  private String userDistrict;//密码
	  
	  private BigDecimal userBalance;//余额

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserDistrict() {
		return userDistrict;
	}

	public void setUserDistrict(String userDistrict) {
		this.userDistrict = userDistrict;
	}

	public BigDecimal getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(BigDecimal userBalance) {
		this.userBalance = userBalance;
	}

	  
}
