package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class RedPacketsUser {
    private String redPacketsNurseId;

    private String redPacketsNursePic;

    private BigDecimal redPacketsNurseMoney;

    private String redPacketsNurseNurseId;

    private String redPacketsNurseNote;

    private String redPacketsNurseSpeak;

    private String redPacketsNurseCreater;

    private Date redPacketsNurseCreatetime;

    public String getRedPacketsNurseId() {
        return redPacketsNurseId;
    }

    public void setRedPacketsNurseId(String redPacketsNurseId) {
        this.redPacketsNurseId = redPacketsNurseId == null ? null : redPacketsNurseId.trim();
    }

    public String getRedPacketsNursePic() {
        return redPacketsNursePic;
    }

    public void setRedPacketsNursePic(String redPacketsNursePic) {
        this.redPacketsNursePic = redPacketsNursePic == null ? null : redPacketsNursePic.trim();
    }

    public BigDecimal getRedPacketsNurseMoney() {
        return redPacketsNurseMoney;
    }

    public void setRedPacketsNurseMoney(BigDecimal redPacketsNurseMoney) {
        this.redPacketsNurseMoney = redPacketsNurseMoney;
    }

    public String getRedPacketsNurseNurseId() {
        return redPacketsNurseNurseId;
    }

    public void setRedPacketsNurseNurseId(String redPacketsNurseNurseId) {
        this.redPacketsNurseNurseId = redPacketsNurseNurseId == null ? null : redPacketsNurseNurseId.trim();
    }

    public String getRedPacketsNurseNote() {
        return redPacketsNurseNote;
    }

    public void setRedPacketsNurseNote(String redPacketsNurseNote) {
        this.redPacketsNurseNote = redPacketsNurseNote == null ? null : redPacketsNurseNote.trim();
    }

    public String getRedPacketsNurseSpeak() {
        return redPacketsNurseSpeak;
    }

    public void setRedPacketsNurseSpeak(String redPacketsNurseSpeak) {
        this.redPacketsNurseSpeak = redPacketsNurseSpeak == null ? null : redPacketsNurseSpeak.trim();
    }

    public String getRedPacketsNurseCreater() {
        return redPacketsNurseCreater;
    }

    public void setRedPacketsNurseCreater(String redPacketsNurseCreater) {
        this.redPacketsNurseCreater = redPacketsNurseCreater == null ? null : redPacketsNurseCreater.trim();
    }

    public Date getRedPacketsNurseCreatetime() {
        return redPacketsNurseCreatetime;
    }

    public void setRedPacketsNurseCreatetime(Date redPacketsNurseCreatetime) {
        this.redPacketsNurseCreatetime = redPacketsNurseCreatetime;
    }
}