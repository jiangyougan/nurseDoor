package com.chance.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.rechargemapper.RechargeMapper;
import com.chance.ssm.po.Recharge;
import com.chance.ssm.service.RechargeService;

public class RechargeServiceImpl implements RechargeService{

	@Autowired
	private RechargeMapper rechargeMapper;
	
	@Override
	public int insertSelective(Recharge record) throws Exception {
		// TODO Auto-generated method stub
		return rechargeMapper.insertSelective(record);
	}

	@Override
	public Recharge selectByPrimaryKey(String rechargeId) throws Exception {
		// TODO Auto-generated method stub
		return rechargeMapper.selectByPrimaryKey(rechargeId);
	}

	@Override
	public int updateByPrimaryKeySelective(Recharge record) throws Exception {
		// TODO Auto-generated method stub
		return rechargeMapper.updateByPrimaryKeySelective(record);
	}

}
