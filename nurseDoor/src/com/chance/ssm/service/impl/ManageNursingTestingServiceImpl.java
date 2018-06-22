package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.managenursingtestingmapper.ManageNursingTestingMapper;
import com.chance.ssm.po.ManageNursingTesting;
import com.chance.ssm.po.ManageNursingTestingExample;
import com.chance.ssm.po.vo.ManageNursingTestingVO;
import com.chance.ssm.service.ManageNursingTestingService;

public class ManageNursingTestingServiceImpl implements
		ManageNursingTestingService {
	
	@Autowired
	private ManageNursingTestingMapper mNursingTestingMapper;

	@Override
	public int insertSelective(ManageNursingTesting record) throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestingMapper.insertSelective(record);
	}

	@Override
	public List<ManageNursingTesting> selectByExample(
			ManageNursingTestingExample example) throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestingMapper.selectByExample(example);
	}

	@Override
	public List<ManageNursingTestingVO> selectByExampleAndTestAllselectByExample(
			ManageNursingTestingExample example) throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestingMapper.selectByExampleAndTestAll(example);
	}

	@Override
	public int deleteByPrimaryKey(String manageNursingTestingId)
			throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestingMapper.deleteByPrimaryKey(manageNursingTestingId);
	}

}
