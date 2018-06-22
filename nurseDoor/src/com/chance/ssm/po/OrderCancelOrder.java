package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class OrderCancelOrder {
    private String orderCancelOrderSendId;

    private Integer orderCancalOrderState;

    private Integer orderCancalNurseAgree;

    private Date orderCancalNurseCancelTime;

    private Date orderCancalNurseAgreeTime;

    private Integer orderCancalUserAgree;

    private Date orderCancalUserCancelTime;

    private Date orderCancalUserAgreeTime;

    private String orderCancalHandlePeople;

    private Integer orderCancalWhetherRefund;

    private BigDecimal orderCancalRefundMoney;

    private String orderCancalHandleResult;

    private String orderCancelOrderNote;

    private String orderCancelOrderSpeak;

    private Date orderCancalHandleResultTime;

    public String getOrderCancelOrderSendId() {
        return orderCancelOrderSendId;
    }

    public void setOrderCancelOrderSendId(String orderCancelOrderSendId) {
        this.orderCancelOrderSendId = orderCancelOrderSendId == null ? null : orderCancelOrderSendId.trim();
    }

    public Integer getOrderCancalOrderState() {
        return orderCancalOrderState;
    }

    public void setOrderCancalOrderState(Integer orderCancalOrderState) {
        this.orderCancalOrderState = orderCancalOrderState;
    }

    public Integer getOrderCancalNurseAgree() {
        return orderCancalNurseAgree;
    }

    public void setOrderCancalNurseAgree(Integer orderCancalNurseAgree) {
        this.orderCancalNurseAgree = orderCancalNurseAgree;
    }

    public Date getOrderCancalNurseCancelTime() {
        return orderCancalNurseCancelTime;
    }

    public void setOrderCancalNurseCancelTime(Date orderCancalNurseCancelTime) {
        this.orderCancalNurseCancelTime = orderCancalNurseCancelTime;
    }

    public Date getOrderCancalNurseAgreeTime() {
        return orderCancalNurseAgreeTime;
    }

    public void setOrderCancalNurseAgreeTime(Date orderCancalNurseAgreeTime) {
        this.orderCancalNurseAgreeTime = orderCancalNurseAgreeTime;
    }

    public Integer getOrderCancalUserAgree() {
        return orderCancalUserAgree;
    }

    public void setOrderCancalUserAgree(Integer orderCancalUserAgree) {
        this.orderCancalUserAgree = orderCancalUserAgree;
    }

    public Date getOrderCancalUserCancelTime() {
        return orderCancalUserCancelTime;
    }

    public void setOrderCancalUserCancelTime(Date orderCancalUserCancelTime) {
        this.orderCancalUserCancelTime = orderCancalUserCancelTime;
    }

    public Date getOrderCancalUserAgreeTime() {
        return orderCancalUserAgreeTime;
    }

    public void setOrderCancalUserAgreeTime(Date orderCancalUserAgreeTime) {
        this.orderCancalUserAgreeTime = orderCancalUserAgreeTime;
    }

    public String getOrderCancalHandlePeople() {
        return orderCancalHandlePeople;
    }

    public void setOrderCancalHandlePeople(String orderCancalHandlePeople) {
        this.orderCancalHandlePeople = orderCancalHandlePeople == null ? null : orderCancalHandlePeople.trim();
    }

    public Integer getOrderCancalWhetherRefund() {
        return orderCancalWhetherRefund;
    }

    public void setOrderCancalWhetherRefund(Integer orderCancalWhetherRefund) {
        this.orderCancalWhetherRefund = orderCancalWhetherRefund;
    }

    public BigDecimal getOrderCancalRefundMoney() {
        return orderCancalRefundMoney;
    }

    public void setOrderCancalRefundMoney(BigDecimal orderCancalRefundMoney) {
        this.orderCancalRefundMoney = orderCancalRefundMoney;
    }

    public String getOrderCancalHandleResult() {
        return orderCancalHandleResult;
    }

    public void setOrderCancalHandleResult(String orderCancalHandleResult) {
        this.orderCancalHandleResult = orderCancalHandleResult == null ? null : orderCancalHandleResult.trim();
    }

    public String getOrderCancelOrderNote() {
        return orderCancelOrderNote;
    }

    public void setOrderCancelOrderNote(String orderCancelOrderNote) {
        this.orderCancelOrderNote = orderCancelOrderNote == null ? null : orderCancelOrderNote.trim();
    }

    public String getOrderCancelOrderSpeak() {
        return orderCancelOrderSpeak;
    }

    public void setOrderCancelOrderSpeak(String orderCancelOrderSpeak) {
        this.orderCancelOrderSpeak = orderCancelOrderSpeak == null ? null : orderCancelOrderSpeak.trim();
    }

    public Date getOrderCancalHandleResultTime() {
        return orderCancalHandleResultTime;
    }

    public void setOrderCancalHandleResultTime(Date orderCancalHandleResultTime) {
        this.orderCancalHandleResultTime = orderCancalHandleResultTime;
    }
}