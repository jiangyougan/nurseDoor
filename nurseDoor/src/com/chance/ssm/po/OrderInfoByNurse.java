package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfoByNurse{

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

    private Integer orderSendStoptime;
    
    private Date orderSendGetOrderTime;

    private Date orderSendFinishOrderTime;

    private Date orderSendCreatetime;
    
    private Integer orderSendCompiaintState;//订单投诉处理(0未处理/1已处理)

    private String orderSendOverone;

    private String orderSendOvertwo;

    private String orderSendOverthree;

    private String orderSendOverfour;

    private String orderSendOverfive;
    
    private String nurseId;
    
    private String nurseNick;
    
    private String nursePhone;
    
    private String nurseSex;
    
    private String nurseAge;
    
    private String nurseHeader;
    
    private String nurseTruePic;
    
    private String nurseTrueName;
    
    private String nurseWorkNnit; //工作单位
    
    private String nurseNote;//备注
    
    private String nurseJob;//职称
    
    private String orderReceivestate;//接单状态
    
    private double distance;// 距离
    
    private int isEvaluate;//是否评价
    
    private String contentId;//二级服务ID
    
   /* private String nurseNickNew;//昵称
    
    private String nurseNameNew;//手机号
*/    
    private String protectedPersonNexus;//关系
    
    private Double protectedPersonHeight;//身高
    
    private Double protectedPersonWeight;//体重
    
    private String detailedAddress; //详细地址(几单元)
    
    
    private String orderSpeakByCancel;
    
    
    
    
    public String getOrderSpeakByCancel() {
		return orderSpeakByCancel;
	}

	public void setOrderSpeakByCancel(String orderSpeakByCancel) {
		this.orderSpeakByCancel = orderSpeakByCancel;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	/*
	public String getNurseNickNew() {
		return nurseNickNew;
	}

	public void setNurseNickNew(String nurseNickNew) {
		this.nurseNickNew = nurseNickNew;
	}

	public String getNurseNameNew() {
		return nurseNameNew;
	}

	public void setNurseNameNew(String nurseNameNew) {
		this.nurseNameNew = nurseNameNew;
	}
*/
	public String getProtectedPersonNexus() {
		return protectedPersonNexus;
	}

	public void setProtectedPersonNexus(String protectedPersonNexus) {
		this.protectedPersonNexus = protectedPersonNexus;
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

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getNurseTruePic() {
		return nurseTruePic;
	}

	public void setNurseTruePic(String nurseTruePic) {
		this.nurseTruePic = nurseTruePic;
	}

	public String getNurseTrueName() {
		return nurseTrueName;
	}

	public void setNurseTrueName(String nurseTrueName) {
		this.nurseTrueName = nurseTrueName;
	}

	public int getIsEvaluate() {
		return isEvaluate;
	}

	public void setIsEvaluate(int isEvaluate) {
		this.isEvaluate = isEvaluate;
	}

	public String getNursePhone() {
		return nursePhone;
	}

	public void setNursePhone(String nursePhone) {
		this.nursePhone = nursePhone;
	}

	public String getOrderReceivestate() {
		return orderReceivestate;
	}

	public void setOrderReceivestate(String orderReceivestate) {
		this.orderReceivestate = orderReceivestate;
	}

	public String getNurseJob() {
		return nurseJob;
	}

	public void setNurseJob(String nurseJob) {
		this.nurseJob = nurseJob;
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

	public String getNurseHeader() {
		return nurseHeader;
	}

	public void setNurseHeader(String nurseHeader) {
		this.nurseHeader = nurseHeader;
	}

	public String getNurseWorkNnit() {
		return nurseWorkNnit;
	}

	public void setNurseWorkNnit(String nurseWorkNnit) {
		this.nurseWorkNnit = nurseWorkNnit;
	}

	public String getNurseNote() {
		return nurseNote;
	}

	public void setNurseNote(String nurseNote) {
		this.nurseNote = nurseNote;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
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

	public Date getOrderSendCreatetime() {
        return orderSendCreatetime;
    }

    public void setOrderSendCreatetime(Date orderSendCreatetime) {
        this.orderSendCreatetime = orderSendCreatetime;
    }

	public String getNurseId() {
		return nurseId;
	}

	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}

	public String getNurseNick() {
		return nurseNick;
	}

	public void setNurseNick(String nurseNick) {
		this.nurseNick = nurseNick;
	}

	public String getNurseSex() {
		return nurseSex;
	}

	public void setNurseSex(String nurseSex) {
		this.nurseSex = nurseSex;
	}

	public String getNurseAge() {
		return nurseAge;
	}

	public void setNurseAge(String nurseAge) {
		this.nurseAge = nurseAge;
	}


	
}
