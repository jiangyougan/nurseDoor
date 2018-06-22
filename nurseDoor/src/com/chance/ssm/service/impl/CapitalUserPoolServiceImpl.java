package com.chance.ssm.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.capitaluserpoolmapper.CapitalUserPoolMapper;
import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.CapitalUserPoolExample;
import com.chance.ssm.service.CapitalUserPoolService;

public class CapitalUserPoolServiceImpl implements CapitalUserPoolService{

	@Autowired
	private CapitalUserPoolMapper capitalUserPoolMapper;
	@Override
	public int insertSelective(CapitalUserPool record) throws Exception {
		// TODO Auto-generated method stub
		return capitalUserPoolMapper.insertSelective(record);
	}
	@Override
	public List<CapitalUserPool> selectCapitalUserPoolInfo(
			String capitalUserPoolPeopleid) throws Exception {
		// TODO Auto-generated method stub
		return capitalUserPoolMapper.selectCapitalUserPoolInfo(capitalUserPoolPeopleid);
	}
	@Override
	public List<CapitalUserPool> selectByExample(CapitalUserPoolExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return capitalUserPoolMapper.selectByExample(example);
	}
	@Override
	public BigDecimal selectUserAllExpenditure(String userId) {
		// TODO Auto-generated method stub
		return capitalUserPoolMapper.selectUserAllExpenditure(userId);
	}

}
