package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Nurse {
    private String nurseId;

    private String nurseHeader;

    private String nurseNick;

    private String nurseName;

    private String nursePwd;

    private String nursePhone;

    private String nurseAddress;

    private String nurseInvitationcode;

    private String nurseInvitationlink;

    private String nurseSex;

    private String nurseAge;

    private String nurseLanguage;

    private String nurseWorkUnit;

    private String nurseJob;

    private String nurseOffice;

    private String nurseNumber;

    private String nurseYearsofservice;

    private String nurseNote;

    private String nursePlace;

    private String nurseGoodservice;

    private String nurseNurseLicensepic;

    private String nurseEmail;

    private String nurseTruename;

    private String nurseCardpic;

    private String nurseCard;

    private String nurseProvince;

    private String nurseCity;

    private String nurseDistrict;

    private String nurseSign;

    private Double nursePositionX;

    private Double nursePositionY;

    private BigDecimal nurseBalance;

    private Integer nurseUsestate;
    
    private Integer nurseCommunicate;//是否沟通

    private Long nurseMark;

    private Date nurseCreatetime;
    
    private Integer OrderNumberIng;//正在进行的订单个数
    
    
    private String pwd;//支付宝账号
    
    private String account;//支付宝密码
    
    private Integer orderCounts;//订单数(后台用)
    
    private BigDecimal nurseAllIncome;
    
    

    
    
	public BigDecimal getNurseAllIncome() {
		return nurseAllIncome;
	}

	public void setNurseAllIncome(BigDecimal nurseAllIncome) {
		this.nurseAllIncome = nurseAllIncome;
	}

	public Integer getOrderCounts() {
		return orderCounts;
	}

	public void setOrderCounts(Integer orderCounts) {
		this.orderCounts = orderCounts;
	}

	public Integer getNurseCommunicate() {
		return nurseCommunicate;
	}

	public void setNurseCommunicate(Integer nurseCommunicate) {
		this.nurseCommunicate = nurseCommunicate;
	}

	public Integer getOrderNumberIng() {
		return OrderNumberIng;
	}

	public void setOrderNumberIng(Integer orderNumberIng) {
		OrderNumberIng = orderNumberIng;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId == null ? null : nurseId.trim();
    }

    public String getNurseHeader() {
        return nurseHeader;
    }

    public void setNurseHeader(String nurseHeader) {
        this.nurseHeader = nurseHeader == null ? null : nurseHeader.trim();
    }

    public String getNurseNick() {
        return nurseNick;
    }

    public void setNurseNick(String nurseNick) {
        this.nurseNick = nurseNick == null ? null : nurseNick.trim();
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName == null ? null : nurseName.trim();
    }

    public String getNursePwd() {
        return nursePwd;
    }

    public void setNursePwd(String nursePwd) {
        this.nursePwd = nursePwd == null ? null : nursePwd.trim();
    }

    public String getNursePhone() {
        return nursePhone;
    }

    public void setNursePhone(String nursePhone) {
        this.nursePhone = nursePhone == null ? null : nursePhone.trim();
    }

    public String getNurseAddress() {
        return nurseAddress;
    }

    public void setNurseAddress(String nurseAddress) {
        this.nurseAddress = nurseAddress == null ? null : nurseAddress.trim();
    }

    public String getNurseInvitationcode() {
        return nurseInvitationcode;
    }

    public void setNurseInvitationcode(String nurseInvitationcode) {
        this.nurseInvitationcode = nurseInvitationcode == null ? null : nurseInvitationcode.trim();
    }

    public String getNurseInvitationlink() {
        return nurseInvitationlink;
    }

    public void setNurseInvitationlink(String nurseInvitationlink) {
        this.nurseInvitationlink = nurseInvitationlink == null ? null : nurseInvitationlink.trim();
    }

    public String getNurseSex() {
        return nurseSex;
    }

    public void setNurseSex(String nurseSex) {
        this.nurseSex = nurseSex == null ? null : nurseSex.trim();
    }

    public String getNurseAge() {
        return nurseAge;
    }

    public void setNurseAge(String nurseAge) {
        this.nurseAge = nurseAge == null ? null : nurseAge.trim();
    }

    public String getNurseLanguage() {
        return nurseLanguage;
    }

    public void setNurseLanguage(String nurseLanguage) {
        this.nurseLanguage = nurseLanguage == null ? null : nurseLanguage.trim();
    }

    public String getNurseWorkUnit() {
        return nurseWorkUnit;
    }

    public void setNurseWorkUnit(String nurseWorkUnit) {
        this.nurseWorkUnit = nurseWorkUnit == null ? null : nurseWorkUnit.trim();
    }

    public String getNurseJob() {
        return nurseJob;
    }

    public void setNurseJob(String nurseJob) {
        this.nurseJob = nurseJob == null ? null : nurseJob.trim();
    }

    public String getNurseOffice() {
        return nurseOffice;
    }

    public void setNurseOffice(String nurseOffice) {
        this.nurseOffice = nurseOffice == null ? null : nurseOffice.trim();
    }

    public String getNurseNumber() {
        return nurseNumber;
    }

    public void setNurseNumber(String nurseNumber) {
        this.nurseNumber = nurseNumber == null ? null : nurseNumber.trim();
    }

    public String getNurseYearsofservice() {
        return nurseYearsofservice;
    }

    public void setNurseYearsofservice(String nurseYearsofservice) {
        this.nurseYearsofservice = nurseYearsofservice == null ? null : nurseYearsofservice.trim();
    }

    public String getNurseNote() {
        return nurseNote;
    }

    public void setNurseNote(String nurseNote) {
        this.nurseNote = nurseNote == null ? null : nurseNote.trim();
    }

    public String getNursePlace() {
        return nursePlace;
    }

    public void setNursePlace(String nursePlace) {
        this.nursePlace = nursePlace == null ? null : nursePlace.trim();
    }

    public String getNurseGoodservice() {
        return nurseGoodservice;
    }

    public void setNurseGoodservice(String nurseGoodservice) {
        this.nurseGoodservice = nurseGoodservice == null ? null : nurseGoodservice.trim();
    }

    public String getNurseNurseLicensepic() {
        return nurseNurseLicensepic;
    }

    public void setNurseNurseLicensepic(String nurseNurseLicensepic) {
        this.nurseNurseLicensepic = nurseNurseLicensepic == null ? null : nurseNurseLicensepic.trim();
    }

    public String getNurseEmail() {
        return nurseEmail;
    }

    public void setNurseEmail(String nurseEmail) {
        this.nurseEmail = nurseEmail == null ? null : nurseEmail.trim();
    }

    public String getNurseTruename() {
        return nurseTruename;
    }

    public void setNurseTruename(String nurseTruename) {
        this.nurseTruename = nurseTruename == null ? null : nurseTruename.trim();
    }

    public String getNurseCardpic() {
        return nurseCardpic;
    }

    public void setNurseCardpic(String nurseCardpic) {
        this.nurseCardpic = nurseCardpic == null ? null : nurseCardpic.trim();
    }

    public String getNurseCard() {
        return nurseCard;
    }

    public void setNurseCard(String nurseCard) {
        this.nurseCard = nurseCard == null ? null : nurseCard.trim();
    }

    public String getNurseProvince() {
        return nurseProvince;
    }

    public void setNurseProvince(String nurseProvince) {
        this.nurseProvince = nurseProvince == null ? null : nurseProvince.trim();
    }

    public String getNurseCity() {
        return nurseCity;
    }

    public void setNurseCity(String nurseCity) {
        this.nurseCity = nurseCity == null ? null : nurseCity.trim();
    }

    public String getNurseDistrict() {
        return nurseDistrict;
    }

    public void setNurseDistrict(String nurseDistrict) {
        this.nurseDistrict = nurseDistrict == null ? null : nurseDistrict.trim();
    }

    public String getNurseSign() {
        return nurseSign;
    }

    public void setNurseSign(String nurseSign) {
        this.nurseSign = nurseSign == null ? null : nurseSign.trim();
    }

    public Double getNursePositionX() {
        return nursePositionX;
    }

    public void setNursePositionX(Double nursePositionX) {
        this.nursePositionX = nursePositionX;
    }

    public Double getNursePositionY() {
        return nursePositionY;
    }

    public void setNursePositionY(Double nursePositionY) {
        this.nursePositionY = nursePositionY;
    }

    public BigDecimal getNurseBalance() {
        return nurseBalance;
    }

    public void setNurseBalance(BigDecimal nurseBalance) {
        this.nurseBalance = nurseBalance;
    }

    public Integer getNurseUsestate() {
        return nurseUsestate;
    }

    public void setNurseUsestate(Integer nurseUsestate) {
        this.nurseUsestate = nurseUsestate;
    }

    public Long getNurseMark() {
        return nurseMark;
    }

    public void setNurseMark(Long nurseMark) {
        this.nurseMark = nurseMark;
    }

    public Date getNurseCreatetime() {
        return nurseCreatetime;
    }

    public void setNurseCreatetime(Date nurseCreatetime) {
        this.nurseCreatetime = nurseCreatetime;
    }
}