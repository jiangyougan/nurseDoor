package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class OrderSend {
    private String orderSendId;

    private String orderSendNumbers;

    private String orderSendUserid;

    private String orderSendServicecontent;

    private String orderSendUsername;

    private String orderSendCard;

    private String orderSendSex;

    private String orderSendAge;

    private String orderSendAddree;

    private String orderSendUserpic;

    private String orderSendNote;

    private String orderSendCoupon;

    private BigDecimal orderSendTrafficmoney;

    private BigDecimal orderSendSavemoney;

    private BigDecimal orderSendCostmoney;

    private String orderSendIspayment;

    private String orderSendTotalmoney;

    private String orderSendIssafe;

    private String orderSendType;

    private String orderSendState;

    private Date orderSendBegintime;

    private Integer orderSendStoptime;//取消人身份

    private Date orderSendGetOrderTime;

    private Date orderSendFinishOrderTime;

    private Date orderSendCreatetime;
    
    private Integer orderSendCompiaintState;//订单投诉处理(0未处理/1已处理)

    private String orderSendOverone;

    private String orderSendOvertwo;

    private String orderSendOverthree;

    private String orderSendOverfour;

    private String orderSendOverfive;
    
    private String userNickNew;//昵称
    
    private String userNameNew;//手机号
    
    private String protectedPersonNexus;//关系
    
    private Double protectedPersonHeight;//身高
    
    private Double protectedPersonWeight;//体重
    
    private String detailedAddress; //详细地址(几单元)
    
    

    public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public Integer getOrderSendCompiaintState() {
		return orderSendCompiaintState;
	}

	public void setOrderSendCompiaintState(Integer orderSendCompiaintState) {
		this.orderSendCompiaintState = orderSendCompiaintState;
	}

	public String getOrderSendOverone() {
		return orderSendOverone;
	}

	public void setOrderSendOverone(String orderSendOverone) {
		this.orderSendOverone = orderSendOverone;
	}

	public String getOrderSendOvertwo() {
		return orderSendOvertwo;
	}

	public void setOrderSendOvertwo(String orderSendOvertwo) {
		this.orderSendOvertwo = orderSendOvertwo;
	}

	public String getOrderSendOverthree() {
		return orderSendOverthree;
	}

	public void setOrderSendOverthree(String orderSendOverthree) {
		this.orderSendOverthree = orderSendOverthree;
	}

	public String getOrderSendOverfour() {
		return orderSendOverfour;
	}

	public void setOrderSendOverfour(String orderSendOverfour) {
		this.orderSendOverfour = orderSendOverfour;
	}

	public String getOrderSendOverfive() {
		return orderSendOverfive;
	}

	public void setOrderSendOverfive(String orderSendOverfive) {
		this.orderSendOverfive = orderSendOverfive;
	}

	public String getProtectedPersonNexus() {
		return protectedPersonNexus;
	}

	public void setProtectedPersonNexus(String protectedPersonNexus) {
		this.protectedPersonNexus = protectedPersonNexus;
	}


	public String getUserNickNew() {
		return userNickNew;
	}

	public void setUserNickNew(String userNickNew) {
		this.userNickNew = userNickNew;
	}

	public String getUserNameNew() {
		return userNameNew;
	}

	public void setUserNameNew(String userNameNew) {
		this.userNameNew = userNameNew;
	}

	public Double getProtectedPersonHeight() {
		return protectedPersonHeight;
	}

	public void setProtectedPersonHeight(Double protectedPersonHeight) {
		this.protectedPersonHeight = protectedPersonHeight;
	}

	public Double getProtectedPersonWeight() {
		return protectedPersonWeight;
	}

	public void setProtectedPersonWeight(Double protectedPersonWeight) {
		this.protectedPersonWeight = protectedPersonWeight;
	}

	public String getOrderSendId() {
        return orderSendId;
    }

    public void setOrderSendId(String orderSendId) {
        this.orderSendId = orderSendId == null ? null : orderSendId.trim();
    }

    public String getOrderSendNumbers() {
        return orderSendNumbers;
    }

    public void setOrderSendNumbers(String orderSendNumbers) {
        this.orderSendNumbers = orderSendNumbers == null ? null : orderSendNumbers.trim();
    }

    public String getOrderSendUserid() {
        return orderSendUserid;
    }

    public void setOrderSendUserid(String orderSendUserid) {
        this.orderSendUserid = orderSendUserid == null ? null : orderSendUserid.trim();
    }

    public String getOrderSendServicecontent() {
        return orderSendServicecontent;
    }

    public void setOrderSendServicecontent(String orderSendServicecontent) {
        this.orderSendServicecontent = orderSendServicecontent == null ? null : orderSendServicecontent.trim();
    }

    public String getOrderSendUsername() {
        return orderSendUsername;
    }

    public void setOrderSendUsername(String orderSendUsername) {
        this.orderSendUsername = orderSendUsername == null ? null : orderSendUsername.trim();
    }

    public String getOrderSendCard() {
        return orderSendCard;
    }

    public void setOrderSendCard(String orderSendCard) {
        this.orderSendCard = orderSendCard == null ? null : orderSendCard.trim();
    }

    public String getOrderSendSex() {
        return orderSendSex;
    }

    public void setOrderSendSex(String orderSendSex) {
        this.orderSendSex = orderSendSex == null ? null : orderSendSex.trim();
    }

    public String getOrderSendAge() {
        return orderSendAge;
    }

    public void setOrderSendAge(String orderSendAge) {
        this.orderSendAge = orderSendAge == null ? null : orderSendAge.trim();
    }

    public String getOrderSendAddree() {
        return orderSendAddree;
    }

    public void setOrderSendAddree(String orderSendAddree) {
        this.orderSendAddree = orderSendAddree == null ? null : orderSendAddree.trim();
    }

    public String getOrderSendUserpic() {
        return orderSendUserpic;
    }

    public void setOrderSendUserpic(String orderSendUserpic) {
        this.orderSendUserpic = orderSendUserpic == null ? null : orderSendUserpic.trim();
    }

    public String getOrderSendNote() {
        return orderSendNote;
    }

    public void setOrderSendNote(String orderSendNote) {
        this.orderSendNote = orderSendNote == null ? null : orderSendNote.trim();
    }

    public String getOrderSendCoupon() {
        return orderSendCoupon;
    }

    public void setOrderSendCoupon(String orderSendCoupon) {
        this.orderSendCoupon = orderSendCoupon == null ? null : orderSendCoupon.trim();
    }

    public BigDecimal getOrderSendTrafficmoney() {
        return orderSendTrafficmoney;
    }

    public void setOrderSendTrafficmoney(BigDecimal orderSendTrafficmoney) {
        this.orderSendTrafficmoney = orderSendTrafficmoney;
    }

    public BigDecimal getOrderSendSavemoney() {
        return orderSendSavemoney;
    }

    public void setOrderSendSavemoney(BigDecimal orderSendSavemoney) {
        this.orderSendSavemoney = orderSendSavemoney;
    }

    public BigDecimal getOrderSendCostmoney() {
        return orderSendCostmoney;
    }

    public void setOrderSendCostmoney(BigDecimal orderSendCostmoney) {
        this.orderSendCostmoney = orderSendCostmoney;
    }

    public String getOrderSendIspayment() {
        return orderSendIspayment;
    }

    public void setOrderSendIspayment(String orderSendIspayment) {
        this.orderSendIspayment = orderSendIspayment == null ? null : orderSendIspayment.trim();
    }

    public String getOrderSendTotalmoney() {
        return orderSendTotalmoney;
    }

    public void setOrderSendTotalmoney(String orderSendTotalmoney) {
        this.orderSendTotalmoney = orderSendTotalmoney == null ? null : orderSendTotalmoney.trim();
    }

    public String getOrderSendIssafe() {
        return orderSendIssafe;
    }

    public void setOrderSendIssafe(String orderSendIssafe) {
        this.orderSendIssafe = orderSendIssafe == null ? null : orderSendIssafe.trim();
    }

    public String getOrderSendType() {
        return orderSendType;
    }

    public void setOrderSendType(String orderSendType) {
        this.orderSendType = orderSendType == null ? null : orderSendType.trim();
    }

    public String getOrderSendState() {
        return orderSendState;
    }

    public void setOrderSendState(String orderSendState) {
        this.orderSendState = orderSendState == null ? null : orderSendState.trim();
    }

    public Date getOrderSendBegintime() {
        return orderSendBegintime;
    }

    public void setOrderSendBegintime(Date orderSendBegintime) {
        this.orderSendBegintime = orderSendBegintime;
    }

    
    
    public Integer getOrderSendStoptime() {
		return orderSendStoptime;
	}

	public void setOrderSendStoptime(Integer orderSendStoptime) {
		this.orderSendStoptime = orderSendStoptime;
	}

	public Date getOrderSendGetOrderTime() {
        return orderSendGetOrderTime;
    }

    public void setOrderSendGetOrderTime(Date orderSendGetOrderTime) {
        this.orderSendGetOrderTime = orderSendGetOrderTime;
    }

    public Date getOrderSendFinishOrderTime() {
        return orderSendFinishOrderTime;
    }

    public void setOrderSendFinishOrderTime(Date orderSendFinishOrderTime) {
        this.orderSendFinishOrderTime = orderSendFinishOrderTime;
    }

    public Date getOrderSendCreatetime() {
        return orderSendCreatetime;
    }

    public void setOrderSendCreatetime(Date orderSendCreatetime) {
        this.orderSendCreatetime = orderSendCreatetime;
    }
}