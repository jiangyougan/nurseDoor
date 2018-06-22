package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private String goodsId;

    private String goodsContent;

    private String goodsName;

    private BigDecimal goodsMoney;

    private Integer goodsIsdefault;

    private String goodsNurseid;

    private String goodsNote;

    private String goodsCreateadmin;

    private Date goodsCreatetime;

    private Date goodsUpdatime;

    private Integer goodsOrder;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent == null ? null : goodsContent.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(BigDecimal goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public Integer getGoodsIsdefault() {
        return goodsIsdefault;
    }

    public void setGoodsIsdefault(Integer goodsIsdefault) {
        this.goodsIsdefault = goodsIsdefault;
    }

    public String getGoodsNurseid() {
        return goodsNurseid;
    }

    public void setGoodsNurseid(String goodsNurseid) {
        this.goodsNurseid = goodsNurseid == null ? null : goodsNurseid.trim();
    }

    public String getGoodsNote() {
        return goodsNote;
    }

    public void setGoodsNote(String goodsNote) {
        this.goodsNote = goodsNote == null ? null : goodsNote.trim();
    }

    public String getGoodsCreateadmin() {
        return goodsCreateadmin;
    }

    public void setGoodsCreateadmin(String goodsCreateadmin) {
        this.goodsCreateadmin = goodsCreateadmin == null ? null : goodsCreateadmin.trim();
    }

    public Date getGoodsCreatetime() {
        return goodsCreatetime;
    }

    public void setGoodsCreatetime(Date goodsCreatetime) {
        this.goodsCreatetime = goodsCreatetime;
    }

    public Date getGoodsUpdatime() {
        return goodsUpdatime;
    }

    public void setGoodsUpdatime(Date goodsUpdatime) {
        this.goodsUpdatime = goodsUpdatime;
    }

    public Integer getGoodsOrder() {
        return goodsOrder;
    }

    public void setGoodsOrder(Integer goodsOrder) {
        this.goodsOrder = goodsOrder;
    }
}