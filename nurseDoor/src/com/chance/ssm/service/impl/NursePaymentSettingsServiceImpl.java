package com.chance.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.nursepaymentsettingsmapper.NursePaymentSettingsMapper;
import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.vo.NurseThreeInfoVo;
import com.chance.ssm.service.NursePaymentSettingsService;

public class NursePaymentSettingsServiceImpl implements NursePaymentSettingsService{
	
	@Autowired
	private NursePaymentSettingsMapper nursePaymentSettingsMapper;

	@Override
	public NursePaymentSettings selectByPrimaryKey(
			String nursePaymentSettingsNurseId) {
		// TODO Auto-generated method stub
		return nursePaymentSettingsMapper.selectByPrimaryKey(nursePaymentSettingsNurseId);
	}

	@Override
	public int insertSelective(NursePaymentSettings record) throws Exception {
		// TODO Auto-generated method stub
		return nursePaymentSettingsMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(NursePaymentSettings record)
			throws Exception {
		// TODO Auto-generated method stub
		return nursePaymentSettingsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public NurseThreeInfoVo selectNurseThreeInfoByNurseId(String nurseId)
			throws Exception {
		// TODO Auto-generated method stub
		return nursePaymentSettingsMapper.selectNurseThreeInfoByNurseId(nurseId);
	}

}
