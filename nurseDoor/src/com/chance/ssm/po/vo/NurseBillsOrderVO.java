package com.chance.ssm.po.vo;

import java.math.BigDecimal;
import java.util.Date;

public class NurseBillsOrderVO {
	private String userNick;
	private String userPhone;
	private String userHeader;
	private BigDecimal price;
	private Date orderSendFinishOrderTime;
	private String orderSendServicecontent;
	
	
	public String getOrderSendServicecontent() {
		return orderSendServicecontent;
	}
	public void setOrderSendServicecontent(String orderSendServicecontent) {
		this.orderSendServicecontent = orderSendServicecontent;
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
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getOrderSendFinishOrderTime() {
		return orderSendFinishOrderTime;
	}
	public void setOrderSendFinishOrderTime(Date orderSendFinishOrderTime) {
		this.orderSendFinishOrderTime = orderSendFinishOrderTime;
	}
	
	@Override
	public String toString() {
		return "NurseBillsOrderVO [userNick=" + userNick + ", userPhone="
				+ userPhone + ", userHeader=" + userHeader + ", price=" + price
				+ ", orderSendFinishOrderTime=" + orderSendFinishOrderTime
				+ "]";
	}
	
}
