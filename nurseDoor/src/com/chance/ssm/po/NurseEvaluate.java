package com.chance.ssm.po;

import java.util.Date;

public class NurseEvaluate {
    private String nurseEvaluateId;

    private String evaluateNurseId;

    private String evaluteUserId;

    private String evaluteSendId;

    private String evaluteInfo;

    private Integer evaluteMark;

    private Date evaluteCrtetime;

    public String getNurseEvaluateId() {
        return nurseEvaluateId;
    }

    public void setNurseEvaluateId(String nurseEvaluateId) {
        this.nurseEvaluateId = nurseEvaluateId == null ? null : nurseEvaluateId.trim();
    }

    public String getEvaluateNurseId() {
        return evaluateNurseId;
    }

    public void setEvaluateNurseId(String evaluateNurseId) {
        this.evaluateNurseId = evaluateNurseId == null ? null : evaluateNurseId.trim();
    }

    public String getEvaluteUserId() {
        return evaluteUserId;
    }

    public void setEvaluteUserId(String evaluteUserId) {
        this.evaluteUserId = evaluteUserId == null ? null : evaluteUserId.trim();
    }

    public String getEvaluteSendId() {
        return evaluteSendId;
    }

    public void setEvaluteSendId(String evaluteSendId) {
        this.evaluteSendId = evaluteSendId == null ? null : evaluteSendId.trim();
    }

    public String getEvaluteInfo() {
        return evaluteInfo;
    }

    public void setEvaluteInfo(String evaluteInfo) {
        this.evaluteInfo = evaluteInfo == null ? null : evaluteInfo.trim();
    }

    public Integer getEvaluteMark() {
        return evaluteMark;
    }

    public void setEvaluteMark(Integer evaluteMark) {
        this.evaluteMark = evaluteMark;
    }

    public Date getEvaluteCrtetime() {
        return evaluteCrtetime;
    }

    public void setEvaluteCrtetime(Date evaluteCrtetime) {
        this.evaluteCrtetime = evaluteCrtetime;
    }
}