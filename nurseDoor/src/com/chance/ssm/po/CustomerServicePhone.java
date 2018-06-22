package com.chance.ssm.po;

import java.util.Date;

public class CustomerServicePhone {
    private String customerServicePhoneId;

    private String customerServicePhone;

    private Integer customerServicePhoneDefault;

    private Integer customerServicePhoneIsuse;

    private String customerServicePhoneNote;

    private String customerServicePhoneSepak;

    private String customerServicePhoneVoer;

    private Date customerServicePhoneCreatetime;

    private Date customerServicePhoneUpdatetime;

    private String customerServicePhoneCreateter;

    public String getCustomerServicePhoneId() {
        return customerServicePhoneId;
    }

    public void setCustomerServicePhoneId(String customerServicePhoneId) {
        this.customerServicePhoneId = customerServicePhoneId == null ? null : customerServicePhoneId.trim();
    }

    public String getCustomerServicePhone() {
        return customerServicePhone;
    }

    public void setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone == null ? null : customerServicePhone.trim();
    }

    public Integer getCustomerServicePhoneDefault() {
        return customerServicePhoneDefault;
    }

    public void setCustomerServicePhoneDefault(Integer customerServicePhoneDefault) {
        this.customerServicePhoneDefault = customerServicePhoneDefault;
    }

    public Integer getCustomerServicePhoneIsuse() {
        return customerServicePhoneIsuse;
    }

    public void setCustomerServicePhoneIsuse(Integer customerServicePhoneIsuse) {
        this.customerServicePhoneIsuse = customerServicePhoneIsuse;
    }

    public String getCustomerServicePhoneNote() {
        return customerServicePhoneNote;
    }

    public void setCustomerServicePhoneNote(String customerServicePhoneNote) {
        this.customerServicePhoneNote = customerServicePhoneNote == null ? null : customerServicePhoneNote.trim();
    }

    public String getCustomerServicePhoneSepak() {
        return customerServicePhoneSepak;
    }

    public void setCustomerServicePhoneSepak(String customerServicePhoneSepak) {
        this.customerServicePhoneSepak = customerServicePhoneSepak == null ? null : customerServicePhoneSepak.trim();
    }

    public String getCustomerServicePhoneVoer() {
        return customerServicePhoneVoer;
    }

    public void setCustomerServicePhoneVoer(String customerServicePhoneVoer) {
        this.customerServicePhoneVoer = customerServicePhoneVoer == null ? null : customerServicePhoneVoer.trim();
    }

    public Date getCustomerServicePhoneCreatetime() {
        return customerServicePhoneCreatetime;
    }

    public void setCustomerServicePhoneCreatetime(Date customerServicePhoneCreatetime) {
        this.customerServicePhoneCreatetime = customerServicePhoneCreatetime;
    }

    public Date getCustomerServicePhoneUpdatetime() {
        return customerServicePhoneUpdatetime;
    }

    public void setCustomerServicePhoneUpdatetime(Date customerServicePhoneUpdatetime) {
        this.customerServicePhoneUpdatetime = customerServicePhoneUpdatetime;
    }

    public String getCustomerServicePhoneCreateter() {
        return customerServicePhoneCreateter;
    }

    public void setCustomerServicePhoneCreateter(String customerServicePhoneCreateter) {
        this.customerServicePhoneCreateter = customerServicePhoneCreateter == null ? null : customerServicePhoneCreateter.trim();
    }
}