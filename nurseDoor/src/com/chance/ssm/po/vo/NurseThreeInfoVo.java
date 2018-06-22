package com.chance.ssm.po.vo;

import java.math.BigDecimal;

public class NurseThreeInfoVo {
	
	private String nursePaymentSettingsPwd;

    private String nursePaymentSettingsAccount;
    
    private BigDecimal nurseBalance;

	public String getNursePaymentSettingsPwd() {
		return nursePaymentSettingsPwd;
	}

	public void setNursePaymentSettingsPwd(String nursePaymentSettingsPwd) {
		this.nursePaymentSettingsPwd = nursePaymentSettingsPwd;
	}

	public String getNursePaymentSettingsAccount() {
		return nursePaymentSettingsAccount;
	}

	public void setNursePaymentSettingsAccount(String nursePaymentSettingsAccount) {
		this.nursePaymentSettingsAccount = nursePaymentSettingsAccount;
	}

	public BigDecimal getNurseBalance() {
		return nurseBalance;
	}

	public void setNurseBalance(BigDecimal nurseBalance) {
		this.nurseBalance = nurseBalance;
	}
    
    
}
