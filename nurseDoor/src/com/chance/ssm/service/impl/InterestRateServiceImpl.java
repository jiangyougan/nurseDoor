package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.interestratemapper.InterestRateMapper;
import com.chance.ssm.po.InterestRate;
import com.chance.ssm.po.InterestRateExample;
import com.chance.ssm.service.InterestRateService;

public class InterestRateServiceImpl implements InterestRateService{
	
	@Autowired
	private InterestRateMapper interestRateMapper;

	@Override
	public List<InterestRate> selectByExample(InterestRateExample example) {
		// TODO Auto-generated method stub
		return interestRateMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(InterestRate record) throws Exception {
		// TODO Auto-generated method stub
		return interestRateMapper.insertSelective(record);
	}

	@Override
	public int updateByExampleSelective(InterestRate record,
			InterestRateExample example) throws Exception {
		// TODO Auto-generated method stub
		return interestRateMapper.updateByExampleSelective(record, example);
	}
	
	

}
