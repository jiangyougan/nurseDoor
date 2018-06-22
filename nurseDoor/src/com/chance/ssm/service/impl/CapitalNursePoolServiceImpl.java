package com.chance.ssm.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.capitalnursepoolmapper.CapitalNursePoolMapper;
import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.CapitalNursePoolExample;
import com.chance.ssm.service.CapitalNursePoolService;

public class CapitalNursePoolServiceImpl  implements CapitalNursePoolService{
	
	@Autowired
	CapitalNursePoolMapper capitalNursePoolMapper;

	@Override
	public int insertSelective(CapitalNursePool record) {
		// TODO Auto-generated method stub
		return capitalNursePoolMapper.insertSelective(record);
	}

	@Override
	public List<CapitalNursePool> selectCapitalInfoByNurseId(
			String capitalNursePoolPeopleid) {
		// TODO Auto-generated method stub
		return capitalNursePoolMapper.selectCapitalInfoByNurseId(capitalNursePoolPeopleid);
	}

	@Override
	public List<CapitalNursePool> selectByExample(
			CapitalNursePoolExample example) throws Exception {
		// TODO Auto-generated method stub
		return capitalNursePoolMapper.selectByExample(example);
	}

	@Override
	public List<CapitalNursePool> selectStatisticsMonth() {
		// TODO Auto-generated method stub
		return capitalNursePoolMapper.selectStatisticsMonth();
	}

	@Override
	public BigDecimal selectNurseAllcapitalNursePoolMoney(String nurseId) {
		// TODO Auto-generated method stub
		return capitalNursePoolMapper.selectNurseAllcapitalNursePoolMoney(nurseId);
	}

}
