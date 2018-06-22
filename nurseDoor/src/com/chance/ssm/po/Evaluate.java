package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Evaluate {
    private String evaluateId;

    private String evaluateUserid;

    private String evaluateNurseid;

    private String evaluateOrderSendId;

    private String evaluateContent;

    private BigDecimal evaluateMark;

    private Date evaluateCreatetime;
    
    private String manageNursingContentId;
    
    private String manageNursingContenName;
    
    


	public String getManageNursingContentId() {
		return manageNursingContentId;
	}

	public void setManageNursingContentId(String manageNursingContentId) {
		this.manageNursingContentId = manageNursingContentId;
	}

	public String getManageNursingContenName() {
		return manageNursingContenName;
	}

	public void setManageNursingContenName(String manageNursingContenName) {
		this.manageNursingContenName = manageNursingContenName;
	}

	public String getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(String evaluateId) {
        this.evaluateId = evaluateId == null ? null : evaluateId.trim();
    }

    public String getEvaluateUserid() {
        return evaluateUserid;
    }

    public void setEvaluateUserid(String evaluateUserid) {
        this.evaluateUserid = evaluateUserid == null ? null : evaluateUserid.trim();
    }

    public String getEvaluateNurseid() {
        return evaluateNurseid;
    }

    public void setEvaluateNurseid(String evaluateNurseid) {
        this.evaluateNurseid = evaluateNurseid == null ? null : evaluateNurseid.trim();
    }

    public String getEvaluateOrderSendId() {
        return evaluateOrderSendId;
    }

    public void setEvaluateOrderSendId(String evaluateOrderSendId) {
        this.evaluateOrderSendId = evaluateOrderSendId == null ? null : evaluateOrderSendId.trim();
    }

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent == null ? null : evaluateContent.trim();
    }

    public BigDecimal getEvaluateMark() {
		return evaluateMark;
	}

	public void setEvaluateMark(BigDecimal evaluateMark) {
		this.evaluateMark = evaluateMark;
	}

	public Date getEvaluateCreatetime() {
        return evaluateCreatetime;
    }

    public void setEvaluateCreatetime(Date evaluateCreatetime) {
        this.evaluateCreatetime = evaluateCreatetime;
    }
}