package com.chance.ssm.po;

import java.util.Date;

public class Invitation {
    private String invitationId;

    private String invitationUserId;

    private String invitationBeuserId;

    private Integer invitationIdentity;

    private Integer invitationGetmark;

    private Date invitationCreatetime;

    public String getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId == null ? null : invitationId.trim();
    }

    public String getInvitationUserId() {
        return invitationUserId;
    }

    public void setInvitationUserId(String invitationUserId) {
        this.invitationUserId = invitationUserId == null ? null : invitationUserId.trim();
    }

    public String getInvitationBeuserId() {
        return invitationBeuserId;
    }

    public void setInvitationBeuserId(String invitationBeuserId) {
        this.invitationBeuserId = invitationBeuserId == null ? null : invitationBeuserId.trim();
    }

    public Integer getInvitationIdentity() {
        return invitationIdentity;
    }

    public void setInvitationIdentity(Integer invitationIdentity) {
        this.invitationIdentity = invitationIdentity;
    }

    public Integer getInvitationGetmark() {
        return invitationGetmark;
    }

    public void setInvitationGetmark(Integer invitationGetmark) {
        this.invitationGetmark = invitationGetmark;
    }

    public Date getInvitationCreatetime() {
        return invitationCreatetime;
    }

    public void setInvitationCreatetime(Date invitationCreatetime) {
        this.invitationCreatetime = invitationCreatetime;
    }
}