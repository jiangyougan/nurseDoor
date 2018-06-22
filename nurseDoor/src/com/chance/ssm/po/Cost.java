package com.chance.ssm.po;

import java.math.BigDecimal;

public class Cost {
	//交通费
	private BigDecimal trafficMoney;
	
	//保险费
	private BigDecimal saveCost;

	public BigDecimal getTrafficMoney() {
		return trafficMoney;
	}

	public void setTrafficMoney(BigDecimal trafficMoney) {
		this.trafficMoney = trafficMoney;
	}

	public BigDecimal getSaveCost() {
		return saveCost;
	}

	public void setSaveCost(BigDecimal saveCost) {
		this.saveCost = saveCost;
	}
	
	
}
