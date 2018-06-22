package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class RedPackets {
    private String redPackets;

    private String redPacketsPic;

    private BigDecimal redPacketsMoney;

    private String redPacketsNote;

    private String redPacketsSpeak;

    private Integer redPacketsType;

    private Date redPacketsCreatetime;

    public String getRedPackets() {
        return redPackets;
    }

    public void setRedPackets(String redPackets) {
        this.redPackets = redPackets == null ? null : redPackets.trim();
    }

    public String getRedPacketsPic() {
        return redPacketsPic;
    }

    public void setRedPacketsPic(String redPacketsPic) {
        this.redPacketsPic = redPacketsPic == null ? null : redPacketsPic.trim();
    }

    public BigDecimal getRedPacketsMoney() {
        return redPacketsMoney;
    }

    public void setRedPacketsMoney(BigDecimal redPacketsMoney) {
        this.redPacketsMoney = redPacketsMoney;
    }

    public String getRedPacketsNote() {
        return redPacketsNote;
    }

    public void setRedPacketsNote(String redPacketsNote) {
        this.redPacketsNote = redPacketsNote == null ? null : redPacketsNote.trim();
    }

    public String getRedPacketsSpeak() {
        return redPacketsSpeak;
    }

    public void setRedPacketsSpeak(String redPacketsSpeak) {
        this.redPacketsSpeak = redPacketsSpeak == null ? null : redPacketsSpeak.trim();
    }

    public Integer getRedPacketsType() {
        return redPacketsType;
    }

    public void setRedPacketsType(Integer redPacketsType) {
        this.redPacketsType = redPacketsType;
    }

    public Date getRedPacketsCreatetime() {
        return redPacketsCreatetime;
    }

    public void setRedPacketsCreatetime(Date redPacketsCreatetime) {
        this.redPacketsCreatetime = redPacketsCreatetime;
    }
}