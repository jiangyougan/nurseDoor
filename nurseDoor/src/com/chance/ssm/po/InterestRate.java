package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class InterestRate {
    private String interestRateId;

    private BigDecimal interestRateSize;

    private String interestRateNote;

    private String interestRateSpeak;

    private String interestRateCreater;

    private Date interestRateCreatetime;

    private Date interestRateUpdatetime;

    public String getInterestRateId() {
        return interestRateId;
    }

    public void setInterestRateId(String interestRateId) {
        this.interestRateId = interestRateId == null ? null : interestRateId.trim();
    }

    public BigDecimal getInterestRateSize() {
        return interestRateSize;
    }

    public void setInterestRateSize(BigDecimal interestRateSize) {
        this.interestRateSize = interestRateSize;
    }

    public String getInterestRateNote() {
        return interestRateNote;
    }

    public void setInterestRateNote(String interestRateNote) {
        this.interestRateNote = interestRateNote == null ? null : interestRateNote.trim();
    }

    public String getInterestRateSpeak() {
        return interestRateSpeak;
    }

    public void setInterestRateSpeak(String interestRateSpeak) {
        this.interestRateSpeak = interestRateSpeak == null ? null : interestRateSpeak.trim();
    }

    public String getInterestRateCreater() {
        return interestRateCreater;
    }

    public void setInterestRateCreater(String interestRateCreater) {
        this.interestRateCreater = interestRateCreater == null ? null : interestRateCreater.trim();
    }

    public Date getInterestRateCreatetime() {
        return interestRateCreatetime;
    }

    public void setInterestRateCreatetime(Date interestRateCreatetime) {
        this.interestRateCreatetime = interestRateCreatetime;
    }

    public Date getInterestRateUpdatetime() {
        return interestRateUpdatetime;
    }

    public void setInterestRateUpdatetime(Date interestRateUpdatetime) {
        this.interestRateUpdatetime = interestRateUpdatetime;
    }
}