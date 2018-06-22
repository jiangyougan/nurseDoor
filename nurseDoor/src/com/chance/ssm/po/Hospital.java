package com.chance.ssm.po;

import java.util.Date;

public class Hospital {
    private String hospitalId;

    private String hospitalName;

    private String hospitalProvince;

    private String hospitalCity;

    private String hospitalDistrict;

    private String hospitalAddress;

    private String hospitalPhone;

    private String hospitalCreateter;

    private Date hospitalCreatetime;
    
    private String maj;//专业
    
    

    public String getMaj() {
		return maj;
	}

	public void setMaj(String maj) {
		this.maj = maj;
	}

	public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalProvince() {
        return hospitalProvince;
    }

    public void setHospitalProvince(String hospitalProvince) {
        this.hospitalProvince = hospitalProvince == null ? null : hospitalProvince.trim();
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity == null ? null : hospitalCity.trim();
    }

    public String getHospitalDistrict() {
        return hospitalDistrict;
    }

    public void setHospitalDistrict(String hospitalDistrict) {
        this.hospitalDistrict = hospitalDistrict == null ? null : hospitalDistrict.trim();
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress == null ? null : hospitalAddress.trim();
    }

    public String getHospitalPhone() {
        return hospitalPhone;
    }

    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone == null ? null : hospitalPhone.trim();
    }

    public String getHospitalCreateter() {
        return hospitalCreateter;
    }

    public void setHospitalCreateter(String hospitalCreateter) {
        this.hospitalCreateter = hospitalCreateter == null ? null : hospitalCreateter.trim();
    }

    public Date getHospitalCreatetime() {
        return hospitalCreatetime;
    }

    public void setHospitalCreatetime(Date hospitalCreatetime) {
        this.hospitalCreatetime = hospitalCreatetime;
    }
}