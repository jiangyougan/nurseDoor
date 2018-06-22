package com.chance.ssm.po.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.chance.ssm.po.OrderCancelOrder;

public class OrderSendCancalVo extends OrderCancelOrder{
	
	private String orderSendId;
	
	private String orderSendUserid;
	
	private BigDecimal orderSendCostmoney;//服务费用

	private BigDecimal orderSendTotalmoney;//订单总费用
	
	private Date orderSendBegintime;//订单开始时间
	
	private Integer orderSendStoptime;//取消人身份
	
	public String getOrderSendId() {
		return orderSendId;
	}
	public void setOrderSendId(String orderSendId) {
		this.orderSendId = orderSendId;
	}
	public String getOrderSendUserid() {
		return orderSendUserid;
	}
	public void setOrderSendUserid(String orderSendUserid) {
		this.orderSendUserid = orderSendUserid;
	}

	public BigDecimal getOrderSendCostmoney() {
		return orderSendCostmoney;
	}
	public void setOrderSendCostmoney(BigDecimal orderSendCostmoney) {
		this.orderSendCostmoney = orderSendCostmoney;
	}
	public BigDecimal getOrderSendTotalmoney() {
		return orderSendTotalmoney;
	}
	public void setOrderSendTotalmoney(BigDecimal orderSendTotalmoney) {
		this.orderSendTotalmoney = orderSendTotalmoney;
	}
	public Date getOrderSendBegintime() {
		return orderSendBegintime;
	}
	public void setOrderSendBegintime(Date orderSendBegintime) {
		this.orderSendBegintime = orderSendBegintime;
	}
	public Integer getOrderSendStoptime() {
		return orderSendStoptime;
	}
	public void setOrderSendStoptime(Integer orderSendStoptime) {
		this.orderSendStoptime = orderSendStoptime;
	}
	
	
}
