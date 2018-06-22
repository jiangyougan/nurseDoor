package com.chance.ssm.po;

import java.util.Date;

public class GoodServiceRecommend {
    private String goodServiceRecommendId;

    private String goodServiceRecommendContentId;

    private String goodServiceRecommendContentPic;

    private String goodServiceRecommendNote;

    private String goodServiceRecommendSpeak;

    private String goodServiceRecommendCreateter;

    private Date goodServiceRecommendCreatetime;

    public String getGoodServiceRecommendId() {
        return goodServiceRecommendId;
    }

    public void setGoodServiceRecommendId(String goodServiceRecommendId) {
        this.goodServiceRecommendId = goodServiceRecommendId == null ? null : goodServiceRecommendId.trim();
    }

    public String getGoodServiceRecommendContentId() {
        return goodServiceRecommendContentId;
    }

    public void setGoodServiceRecommendContentId(String goodServiceRecommendContentId) {
        this.goodServiceRecommendContentId = goodServiceRecommendContentId == null ? null : goodServiceRecommendContentId.trim();
    }

    public String getGoodServiceRecommendContentPic() {
        return goodServiceRecommendContentPic;
    }

    public void setGoodServiceRecommendContentPic(String goodServiceRecommendContentPic) {
        this.goodServiceRecommendContentPic = goodServiceRecommendContentPic == null ? null : goodServiceRecommendContentPic.trim();
    }

    public String getGoodServiceRecommendNote() {
        return goodServiceRecommendNote;
    }

    public void setGoodServiceRecommendNote(String goodServiceRecommendNote) {
        this.goodServiceRecommendNote = goodServiceRecommendNote == null ? null : goodServiceRecommendNote.trim();
    }

    public String getGoodServiceRecommendSpeak() {
        return goodServiceRecommendSpeak;
    }

    public void setGoodServiceRecommendSpeak(String goodServiceRecommendSpeak) {
        this.goodServiceRecommendSpeak = goodServiceRecommendSpeak == null ? null : goodServiceRecommendSpeak.trim();
    }

    public String getGoodServiceRecommendCreateter() {
        return goodServiceRecommendCreateter;
    }

    public void setGoodServiceRecommendCreateter(String goodServiceRecommendCreateter) {
        this.goodServiceRecommendCreateter = goodServiceRecommendCreateter == null ? null : goodServiceRecommendCreateter.trim();
    }

    public Date getGoodServiceRecommendCreatetime() {
        return goodServiceRecommendCreatetime;
    }

    public void setGoodServiceRecommendCreatetime(Date goodServiceRecommendCreatetime) {
        this.goodServiceRecommendCreatetime = goodServiceRecommendCreatetime;
    }
}