package com.chance.ssm.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.capitalplatformmapper.CapitalPlatformMapper;
import com.chance.ssm.po.CapitalPlatform;
import com.chance.ssm.po.CapitalPlatformExample;
import com.chance.ssm.service.CapitalPlatformService;

public class CapitalPlatformServiceImpl implements CapitalPlatformService{
	
	@Autowired
	private CapitalPlatformMapper capitalPlatformMapper;
	

	@Override
	public int insertSelective(CapitalPlatform record) throws Exception {
		// TODO Auto-generated method stub
		return capitalPlatformMapper.insertSelective(record);
	}


	@Override
	public BigDecimal SelCapitalSumMoney() throws Exception {
		// TODO Auto-generated method stub
		return capitalPlatformMapper.SelCapitalSumMoney();
	}


	@Override
	public BigDecimal SelCapitalSumMoneyMonth() throws Exception {
		// TODO Auto-generated method stub
		return capitalPlatformMapper.SelCapitalSumMoneyMonth();
	}


	@Override
	public BigDecimal SelCapitalSumMoneyYear() throws Exception {
		// TODO Auto-generated method stub
		return capitalPlatformMapper.SelCapitalSumMoneyYear();
	}


	@Override
	public List<CapitalPlatform> selectByExample(CapitalPlatformExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return capitalPlatformMapper.selectByExample(example);
	}

}
