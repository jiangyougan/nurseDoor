package com.chance.ssm.po;

import java.util.Date;

public class OrderSendSpecial extends OrderSend{
    private String orderSendSpecialId;

    private String orderSendSpecialOrdersendid;

    private String orderSendSpecialNurseid;

    private Date orderSendSpecialCreatetime;

    public String getOrderSendSpecialId() {
        return orderSendSpecialId;
    }

    public void setOrderSendSpecialId(String orderSendSpecialId) {
        this.orderSendSpecialId = orderSendSpecialId == null ? null : orderSendSpecialId.trim();
    }

    public String getOrderSendSpecialOrdersendid() {
        return orderSendSpecialOrdersendid;
    }

    public void setOrderSendSpecialOrdersendid(String orderSendSpecialOrdersendid) {
        this.orderSendSpecialOrdersendid = orderSendSpecialOrdersendid == null ? null : orderSendSpecialOrdersendid.trim();
    }

    public String getOrderSendSpecialNurseid() {
        return orderSendSpecialNurseid;
    }

    public void setOrderSendSpecialNurseid(String orderSendSpecialNurseid) {
        this.orderSendSpecialNurseid = orderSendSpecialNurseid == null ? null : orderSendSpecialNurseid.trim();
    }

    public Date getOrderSendSpecialCreatetime() {
        return orderSendSpecialCreatetime;
    }

    public void setOrderSendSpecialCreatetime(Date orderSendSpecialCreatetime) {
        this.orderSendSpecialCreatetime = orderSendSpecialCreatetime;
    }
}