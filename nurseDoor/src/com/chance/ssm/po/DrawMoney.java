package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class DrawMoney {
	private String userName;
	
	private String userNick;
	
	private String userHeader;
	
	private String aliPayAccount;
	
    private String drawMoneyId;

    private BigDecimal drawMoneySize;

    private String drawMoneyUsersId;

    private Integer drawMoneyUsersIdentity;

    private String drawMoneyHandleter;

    private String drawMoneyNote;

    private String drawMoneySpeak;

    private String drawMoneyOver;

    private Integer drawMoneyState;

    private Date drawMoneyCreatetime;

    private Date drawMoneyHandletime;

    
    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserHeader() {
		return userHeader;
	}

	public void setUserHeader(String userHeader) {
		this.userHeader = userHeader;
	}

	
	public String getAliPayAccount() {
		return aliPayAccount;
	}

	public void setAliPayAccount(String aliPayAccount) {
		this.aliPayAccount = aliPayAccount;
	}

	public String getDrawMoneyId() {
        return drawMoneyId;
    }

    public void setDrawMoneyId(String drawMoneyId) {
        this.drawMoneyId = drawMoneyId == null ? null : drawMoneyId.trim();
    }

    public BigDecimal getDrawMoneySize() {
        return drawMoneySize;
    }

    public void setDrawMoneySize(BigDecimal drawMoneySize) {
        this.drawMoneySize = drawMoneySize;
    }

    public String getDrawMoneyUsersId() {
        return drawMoneyUsersId;
    }

    public void setDrawMoneyUsersId(String drawMoneyUsersId) {
        this.drawMoneyUsersId = drawMoneyUsersId == null ? null : drawMoneyUsersId.trim();
    }

    public Integer getDrawMoneyUsersIdentity() {
        return drawMoneyUsersIdentity;
    }

    public void setDrawMoneyUsersIdentity(Integer drawMoneyUsersIdentity) {
        this.drawMoneyUsersIdentity = drawMoneyUsersIdentity;
    }

    public String getDrawMoneyHandleter() {
        return drawMoneyHandleter;
    }

    public void setDrawMoneyHandleter(String drawMoneyHandleter) {
        this.drawMoneyHandleter = drawMoneyHandleter == null ? null : drawMoneyHandleter.trim();
    }

    public String getDrawMoneyNote() {
        return drawMoneyNote;
    }

    public void setDrawMoneyNote(String drawMoneyNote) {
        this.drawMoneyNote = drawMoneyNote == null ? null : drawMoneyNote.trim();
    }

    public String getDrawMoneySpeak() {
        return drawMoneySpeak;
    }

    public void setDrawMoneySpeak(String drawMoneySpeak) {
        this.drawMoneySpeak = drawMoneySpeak == null ? null : drawMoneySpeak.trim();
    }

    public String getDrawMoneyOver() {
        return drawMoneyOver;
    }

    public void setDrawMoneyOver(String drawMoneyOver) {
        this.drawMoneyOver = drawMoneyOver == null ? null : drawMoneyOver.trim();
    }

    public Integer getDrawMoneyState() {
        return drawMoneyState;
    }

    public void setDrawMoneyState(Integer drawMoneyState) {
        this.drawMoneyState = drawMoneyState;
    }

    public Date getDrawMoneyCreatetime() {
        return drawMoneyCreatetime;
    }

    public void setDrawMoneyCreatetime(Date drawMoneyCreatetime) {
        this.drawMoneyCreatetime = drawMoneyCreatetime;
    }

    public Date getDrawMoneyHandletime() {
        return drawMoneyHandletime;
    }

    public void setDrawMoneyHandletime(Date drawMoneyHandletime) {
        this.drawMoneyHandletime = drawMoneyHandletime;
    }
}