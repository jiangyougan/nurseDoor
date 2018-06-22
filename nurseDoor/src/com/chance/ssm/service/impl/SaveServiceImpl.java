package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.SavepointManager;

import com.chance.ssm.mapper.savemapper.SaveMapper;
import com.chance.ssm.mapper.trafficmapper.TrafficMapper;
import com.chance.ssm.po.Save;
import com.chance.ssm.po.SaveExample;
import com.chance.ssm.po.Traffic;
import com.chance.ssm.po.TrafficExample;
import com.chance.ssm.service.SaveService;

public class SaveServiceImpl implements SaveService {
	
	@Autowired
	private SaveMapper sManager;
	
	@Autowired
	private TrafficMapper trafficMapper;

	@Override
	public List<Save> selectByExample(SaveExample example) throws Exception {
		// TODO Auto-generated method stub
		return sManager.selectByExample(example);
	}

	@Override
	public int insertSelective(Traffic record) throws Exception {
		// TODO Auto-generated method stub
		return trafficMapper.insertSelective(record);
	}

	@Override
	public int updateByExampleSelective(Traffic record, TrafficExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return trafficMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int insertSaveSelective(Save record) throws Exception {
		// TODO Auto-generated method stub
		return sManager.insertSaveSelective(record);
	}

	@Override
	public int updateSaveByExampleSelective(Save record, SaveExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return sManager.updateSaveByExampleSelective(record, example);
	}
	
	

}
