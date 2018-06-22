package com.chance.ssm.po;

import java.util.Date;

public class OrderReceiver {
    private String orderReceiveId;

    private String orderNurseid;

    private String orderOrdersendid;

    private String orderReceivestate;

    private Date orderCreatetime;

    public String getOrderReceiveId() {
        return orderReceiveId;
    }

    public void setOrderReceiveId(String orderReceiveId) {
        this.orderReceiveId = orderReceiveId == null ? null : orderReceiveId.trim();
    }

    public String getOrderNurseid() {
        return orderNurseid;
    }

    public void setOrderNurseid(String orderNurseid) {
        this.orderNurseid = orderNurseid == null ? null : orderNurseid.trim();
    }

    public String getOrderOrdersendid() {
        return orderOrdersendid;
    }

    public void setOrderOrdersendid(String orderOrdersendid) {
        this.orderOrdersendid = orderOrdersendid == null ? null : orderOrdersendid.trim();
    }

    public String getOrderReceivestate() {
        return orderReceivestate;
    }

    public void setOrderReceivestate(String orderReceivestate) {
        this.orderReceivestate = orderReceivestate == null ? null : orderReceivestate.trim();
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }
}