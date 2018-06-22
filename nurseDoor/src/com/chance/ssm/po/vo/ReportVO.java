package com.chance.ssm.po.vo;

import java.util.Date;

/**
 * 护理报告页
 * **/
public class ReportVO {
	private String nursingReportid;//护理报告id
	
	private String nursingReportOrderid;//订单id
	
	private Date nursingReportCreatetime;//创建时间
	
	private String nursingReportNurseid;//护士id
	
	private String protectedPersonId;//受护人id
	
	private String protectedPersonName;//受护人名字
	
	private String protectedPersonSex;//性别
	
	private String protectedPersonCard;//身份证号码
	
	private String protectedPersonAge;//年龄
	
	private String nurseId;//护士id
	
	private String nurseNick;//护士昵称
	
	private String nurseOffice;//科室
	
	private String nurseTruename;//真实姓名
	
	private String orderSendUserid;//用户id
	
	private String orderSendAddree;//地址
	
	private String orderSendServicecontent;//服务
	
	private Integer counts;//总数
	
	
	
	public String getOrderSendUserid() {
		return orderSendUserid;
	}
	public void setOrderSendUserid(String orderSendUserid) {
		this.orderSendUserid = orderSendUserid;
	}
	public String getNursingReportid() {
		return nursingReportid;
	}
	public void setNursingReportid(String nursingReportid) {
		this.nursingReportid = nursingReportid;
	}
	public String getNursingReportOrderid() {
		return nursingReportOrderid;
	}
	public void setNursingReportOrderid(String nursingReportOrderid) {
		this.nursingReportOrderid = nursingReportOrderid;
	}

	public Date getNursingReportCreatetime() {
		return nursingReportCreatetime;
	}
	public void setNursingReportCreatetime(Date nursingReportCreatetime) {
		this.nursingReportCreatetime = nursingReportCreatetime;
	}
	public String getNursingReportNurseid() {
		return nursingReportNurseid;
	}
	public void setNursingReportNurseid(String nursingReportNurseid) {
		this.nursingReportNurseid = nursingReportNurseid;
	}
	public String getProtectedPersonId() {
		return protectedPersonId;
	}
	public void setProtectedPersonId(String protectedPersonId) {
		this.protectedPersonId = protectedPersonId;
	}
	public String getProtectedPersonName() {
		return protectedPersonName;
	}
	public void setProtectedPersonName(String protectedPersonName) {
		this.protectedPersonName = protectedPersonName;
	}
	public String getProtectedPersonSex() {
		return protectedPersonSex;
	}
	public void setProtectedPersonSex(String protectedPersonSex) {
		this.protectedPersonSex = protectedPersonSex;
	}
	public String getProtectedPersonCard() {
		return protectedPersonCard;
	}
	public void setProtectedPersonCard(String protectedPersonCard) {
		this.protectedPersonCard = protectedPersonCard;
	}
	public String getProtectedPersonAge() {
		return protectedPersonAge;
	}
	public void setProtectedPersonAge(String protectedPersonAge) {
		this.protectedPersonAge = protectedPersonAge;
	}
	public String getNurseId() {
		return nurseId;
	}
	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}
	public String getNurseNick() {
		return nurseNick;
	}
	public void setNurseNick(String nurseNick) {
		this.nurseNick = nurseNick;
	}
	public String getNurseOffice() {
		return nurseOffice;
	}
	public void setNurseOffice(String nurseOffice) {
		this.nurseOffice = nurseOffice;
	}
	public String getNurseTruename() {
		return nurseTruename;
	}
	public void setNurseTruename(String nurseTruename) {
		this.nurseTruename = nurseTruename;
	}
	public String getOrderSendAddree() {
		return orderSendAddree;
	}
	public void setOrderSendAddree(String orderSendAddree) {
		this.orderSendAddree = orderSendAddree;
	}
	public String getOrderSendServicecontent() {
		return orderSendServicecontent;
	}
	public void setOrderSendServicecontent(String orderSendServicecontent) {
		this.orderSendServicecontent = orderSendServicecontent;
	}
	public Integer getCounts() {
		return counts;
	}
	public void setCounts(Integer counts) {
		this.counts = counts;
	}
	
	
}
