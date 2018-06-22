package com.chance.ssm.po.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.Save;

public class ProtectedPersonVO extends ProtectedPerson {

	private String serviceName;// 护理名称

	private String serviceMoney;// 护理金钱
	
	private String contentId;//服务ID

    private String nurseNofreeBbegintime;//不空闲的开始时间段
	
	private String nurseNofreeStoptime;//不空闲的结束时间段
	
	private String nurseId;//护士ID
	
	private String saveLogo;//保险logo
	
	private BigDecimal saveCost; //保险费用
	
	private String saveUrl;//保险链接
	
	private String saveInfo;//保险信息
	
	private String saveID;
	
	private BigDecimal trafficCost; //交通费用
	
	private String imgurls;
	
	private String iscollect;//是否已经收藏
	

	public String getIscollect() {
		return iscollect;
	}

	public void setIscollect(String iscollect) {
		this.iscollect = iscollect;
	}

	public String getImgurls() {
		return imgurls;
	}

	public void setImgurls(String imgurls) {
		this.imgurls = imgurls;
	}

	public BigDecimal getSaveCost() {
		return saveCost;
	}

	public void setSaveCost(BigDecimal saveCost) {
		this.saveCost = saveCost;
	}

	public BigDecimal getTrafficCost() {
		return trafficCost;
	}

	public void setTrafficCost(BigDecimal trafficCost) {
		this.trafficCost = trafficCost;
	}

	public String getSaveID() {
		return saveID;
	}

	public void setSaveID(String saveID) {
		this.saveID = saveID;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getNurseNofreeBbegintime() {
		return nurseNofreeBbegintime;
	}

	public void setNurseNofreeBbegintime(String nurseNofreeBbegintime) {
		this.nurseNofreeBbegintime = nurseNofreeBbegintime;
	}

	public String getNurseNofreeStoptime() {
		return nurseNofreeStoptime;
	}

	public void setNurseNofreeStoptime(String nurseNofreeStoptime) {
		this.nurseNofreeStoptime = nurseNofreeStoptime;
	}

	public String getNurseId() {
		return nurseId;
	}

	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}

	public String getSaveLogo() {
		return saveLogo;
	}

	public void setSaveLogo(String saveLogo) {
		this.saveLogo = saveLogo;
	}

	public String getSaveUrl() {
		return saveUrl;
	}

	public void setSaveUrl(String saveUrl) {
		this.saveUrl = saveUrl;
	}

	public String getSaveInfo() {
		return saveInfo;
	}

	public void setSaveInfo(String saveInfo) {
		this.saveInfo = saveInfo;
	}

	private List<Save> saves;

	Map<String, String> beginandendtime;

	public Map<String, String> getBeginandendtime() {
		return beginandendtime;
	}

	public void setBeginandendtime(Map<String, String> beginandendtime) {
		this.beginandendtime = beginandendtime;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceMoney() {
		return serviceMoney;
	}

	public void setServiceMoney(String serviceMoney) {
		this.serviceMoney = serviceMoney;
	}

	// public List<String> getNurseNofreeBbegintime() {
	// return nurseNofreeBbegintime;
	// }
	//
	// public void setNurseNofreeBbegintime(List<String> nurseNofreeBbegintime)
	// {
	// this.nurseNofreeBbegintime = nurseNofreeBbegintime;
	// }
	//
	// public List<String> getNurseNofreeStoptime() {
	// return nurseNofreeStoptime;
	// }
	//
	// public void setNurseNofreeStoptime(List<String> nurseNofreeStoptime) {
	// this.nurseNofreeStoptime = nurseNofreeStoptime;
	// }

	public List<Save> getSaves() {
		return saves;
	}

	public void setSaves(List<Save> saves) {
		this.saves = saves;
	}

}
