package com.aliyunSms;


/**
 * 阿里云短信模版
 *
 */
public enum SmsEnum {
	
	Login_confirmation("SMS_137790130", "登录确认验证码"),
	User_registration("SMS_137790128", "用户注册验证码"),
	Modify_password("SMS_137790127", "修改密码验证码"),
	Bind_password("SMS_137658611", "用户绑定支付提现密码验证码"),
	;
	
	SmsEnum(String modeCode, String desc){
		this.modeCode = modeCode;
		this.desc = desc;
	}
	
	private String modeCode;
	
	private String desc;

	public String getModeCode() {
		return modeCode;
	}

	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
