package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class CapitalPlatform {
    private Integer capitalPlatformId;

    private BigDecimal capitalPlatformMoney;

    private String capitalPlatformOrderSendId;

    private String capitalPlatformNote;

    private String capitalPlatformSpeak;

    private String capitalPlatformOver;

    private Date capitalPlatformCreatetime;

    public Integer getCapitalPlatformId() {
        return capitalPlatformId;
    }

    public void setCapitalPlatformId(Integer capitalPlatformId) {
        this.capitalPlatformId = capitalPlatformId;
    }

    public BigDecimal getCapitalPlatformMoney() {
        return capitalPlatformMoney;
    }

    public void setCapitalPlatformMoney(BigDecimal capitalPlatformMoney) {
        this.capitalPlatformMoney = capitalPlatformMoney;
    }

    public String getCapitalPlatformOrderSendId() {
        return capitalPlatformOrderSendId;
    }

    public void setCapitalPlatformOrderSendId(String capitalPlatformOrderSendId) {
        this.capitalPlatformOrderSendId = capitalPlatformOrderSendId == null ? null : capitalPlatformOrderSendId.trim();
    }

    public String getCapitalPlatformNote() {
        return capitalPlatformNote;
    }

    public void setCapitalPlatformNote(String capitalPlatformNote) {
        this.capitalPlatformNote = capitalPlatformNote == null ? null : capitalPlatformNote.trim();
    }

    public String getCapitalPlatformSpeak() {
        return capitalPlatformSpeak;
    }

    public void setCapitalPlatformSpeak(String capitalPlatformSpeak) {
        this.capitalPlatformSpeak = capitalPlatformSpeak == null ? null : capitalPlatformSpeak.trim();
    }

    public String getCapitalPlatformOver() {
        return capitalPlatformOver;
    }

    public void setCapitalPlatformOver(String capitalPlatformOver) {
        this.capitalPlatformOver = capitalPlatformOver == null ? null : capitalPlatformOver.trim();
    }

    public Date getCapitalPlatformCreatetime() {
        return capitalPlatformCreatetime;
    }

    public void setCapitalPlatformCreatetime(Date capitalPlatformCreatetime) {
        this.capitalPlatformCreatetime = capitalPlatformCreatetime;
    }
}