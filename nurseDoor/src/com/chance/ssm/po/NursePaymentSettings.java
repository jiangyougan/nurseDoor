package com.chance.ssm.po;

import java.util.Date;

public class NursePaymentSettings extends Nurse {
    private String nursePaymentSettingsNurseId;

    private String nursePaymentSettingsPwd;

    private String nursePaymentSettingsAccount;

    private String nursePaymentSettingsOverone;

    private String nursePaymentSettingsOvertwo;

    private Date nursePaymentSettingsCreatetime;

    public String getNursePaymentSettingsNurseId() {
        return nursePaymentSettingsNurseId;
    }

    public void setNursePaymentSettingsNurseId(String nursePaymentSettingsNurseId) {
        this.nursePaymentSettingsNurseId = nursePaymentSettingsNurseId == null ? null : nursePaymentSettingsNurseId.trim();
    }

    public String getNursePaymentSettingsPwd() {
        return nursePaymentSettingsPwd;
    }

    public void setNursePaymentSettingsPwd(String nursePaymentSettingsPwd) {
        this.nursePaymentSettingsPwd = nursePaymentSettingsPwd == null ? null : nursePaymentSettingsPwd.trim();
    }

    public String getNursePaymentSettingsAccount() {
        return nursePaymentSettingsAccount;
    }

    public void setNursePaymentSettingsAccount(String nursePaymentSettingsAccount) {
        this.nursePaymentSettingsAccount = nursePaymentSettingsAccount == null ? null : nursePaymentSettingsAccount.trim();
    }

    public String getNursePaymentSettingsOverone() {
        return nursePaymentSettingsOverone;
    }

    public void setNursePaymentSettingsOverone(String nursePaymentSettingsOverone) {
        this.nursePaymentSettingsOverone = nursePaymentSettingsOverone == null ? null : nursePaymentSettingsOverone.trim();
    }

    public String getNursePaymentSettingsOvertwo() {
        return nursePaymentSettingsOvertwo;
    }

    public void setNursePaymentSettingsOvertwo(String nursePaymentSettingsOvertwo) {
        this.nursePaymentSettingsOvertwo = nursePaymentSettingsOvertwo == null ? null : nursePaymentSettingsOvertwo.trim();
    }

    public Date getNursePaymentSettingsCreatetime() {
        return nursePaymentSettingsCreatetime;
    }

    public void setNursePaymentSettingsCreatetime(Date nursePaymentSettingsCreatetime) {
        this.nursePaymentSettingsCreatetime = nursePaymentSettingsCreatetime;
    }
}