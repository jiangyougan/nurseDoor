package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private String userId;

    private String userHeader;

    private String userNick;

    private String userName;

    private String userPwd;

    private String userPhone;
    
    private String userAddress;

    private String userInvitationcode;

    private String userSex;

    private String userAge;

    private String userEmail;

    private String userCardpic;

    private String userTruename;

    private String userCard;

    private String userProvince;

    private String userCity;

    private String userDistrict;

    private String userNote;

    private Double userPositionX;

    private Double userPositionY;

    private String userIdenstate;

    private BigDecimal userBalance;

    private String userUsestate;
    
    private Integer userCommunicate;

    private BigDecimal userMark;

    private Date userCreatetime;
    
    private int couponCount;

    private Integer orderCounts;//订单数(后台用)
    
    private BigDecimal userAllExpenditure;//用户总支出
    
    

    public Integer getOrderCounts() {
		return orderCounts;
	}

	public void setOrderCounts(Integer orderCounts) {
		this.orderCounts = orderCounts;
	}

	public BigDecimal getUserAllExpenditure() {
		return userAllExpenditure;
	}

	public void setUserAllExpenditure(BigDecimal userAllExpenditure) {
		this.userAllExpenditure = userAllExpenditure;
	}

	public Integer getUserCommunicate() {
		return userCommunicate;
	}

	public void setUserCommunicate(Integer userCommunicate) {
		this.userCommunicate = userCommunicate;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(String userHeader) {
        this.userHeader = userHeader == null ? null : userHeader.trim();
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }
    

    public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserInvitationcode() {
        return userInvitationcode;
    }

    public void setUserInvitationcode(String userInvitationcode) {
        this.userInvitationcode = userInvitationcode == null ? null : userInvitationcode.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge == null ? null : userAge.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserCardpic() {
        return userCardpic;
    }

    public void setUserCardpic(String userCardpic) {
        this.userCardpic = userCardpic == null ? null : userCardpic.trim();
    }

    public String getUserTruename() {
        return userTruename;
    }

    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename == null ? null : userTruename.trim();
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserDistrict() {
        return userDistrict;
    }

    public void setUserDistrict(String userDistrict) {
        this.userDistrict = userDistrict == null ? null : userDistrict.trim();
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote == null ? null : userNote.trim();
    }

    public Double getUserPositionX() {
        return userPositionX;
    }

    public void setUserPositionX(Double userPositionX) {
        this.userPositionX = userPositionX;
    }

    public Double getUserPositionY() {
        return userPositionY;
    }

    public void setUserPositionY(Double userPositionY) {
        this.userPositionY = userPositionY;
    }

    public String getUserIdenstate() {
        return userIdenstate;
    }

    public void setUserIdenstate(String userIdenstate) {
        this.userIdenstate = userIdenstate == null ? null : userIdenstate.trim();
    }

    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserUsestate() {
        return userUsestate;
    }

    public void setUserUsestate(String userUsestate) {
        this.userUsestate = userUsestate == null ? null : userUsestate.trim();
    }

    public BigDecimal getUserMark() {
		return userMark;
	}

	public void setUserMark(BigDecimal userMark) {
		this.userMark = userMark;
	}

	public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }
}