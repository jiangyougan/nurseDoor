package com.chance.ssm.po.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.chance.ssm.po.OrderSend;

public class OrderReceiverAndOrderVO extends OrderSend {
	private String orderReceiveId;

    private String orderNurseid;

    private String orderOrdersendid;

    private String orderReceivestate;

    private Date orderCreatetime;

    private String userid;
    
    private String userNick;
    
    private String userHeader;
    
    private String userName;
    
    private String evaluateContent;//评价内容
    
    private BigDecimal evaluateMark;//评价分数
    
    private String personId;//受护人ID
    
    private int isEvaluate;//是否评价
    
    private String orderSpeakByCancel;
    
    
    
	public String getOrderSpeakByCancel() {
		return orderSpeakByCancel;
	}

	public void setOrderSpeakByCancel(String orderSpeakByCancel) {
		this.orderSpeakByCancel = orderSpeakByCancel;
	}

	public int getIsEvaluate() {
		return isEvaluate;
	}

	public void setIsEvaluate(int isEvaluate) {
		this.isEvaluate = isEvaluate;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserHeader() {
		return userHeader;
	}

	public void setUserHeader(String userHeader) {
		this.userHeader = userHeader;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEvaluateContent() {
		return evaluateContent;
	}

	public void setEvaluateContent(String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}


	public BigDecimal getEvaluateMark() {
		return evaluateMark;
	}

	public void setEvaluateMark(BigDecimal evaluateMark) {
		this.evaluateMark = evaluateMark;
	}

	public String getOrderReceiveId() {
		return orderReceiveId;
	}

	public void setOrderReceiveId(String orderReceiveId) {
		this.orderReceiveId = orderReceiveId;
	}

	public String getOrderNurseid() {
		return orderNurseid;
	}

	public void setOrderNurseid(String orderNurseid) {
		this.orderNurseid = orderNurseid;
	}

	public String getOrderOrdersendid() {
		return orderOrdersendid;
	}

	public void setOrderOrdersendid(String orderOrdersendid) {
		this.orderOrdersendid = orderOrdersendid;
	}

	public String getOrderReceivestate() {
		return orderReceivestate;
	}

	public void setOrderReceivestate(String orderReceivestate) {
		this.orderReceivestate = orderReceivestate;
	}

	public Date getOrderCreatetime() {
		return orderCreatetime;
	}

	public void setOrderCreatetime(Date orderCreatetime) {
		this.orderCreatetime = orderCreatetime;
	}

    
}
