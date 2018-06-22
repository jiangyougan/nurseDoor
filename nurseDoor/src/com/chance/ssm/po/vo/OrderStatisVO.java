package com.chance.ssm.po.vo;

import java.math.BigDecimal;

public class OrderStatisVO {
	private String orderTime;
	private Integer amount;
	private BigDecimal orderPrice;
	
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	@Override
	public String toString() {
		return "OrderStatisVO [orderTime=" + orderTime + ", amount=" + amount
				+ ", orderPrice=" + orderPrice + "]";
	}
	
	
}
