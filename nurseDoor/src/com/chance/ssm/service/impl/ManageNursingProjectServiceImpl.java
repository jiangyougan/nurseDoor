package com.chance.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.managenursingprojectmapper.ManageNursingProjectMapper;
import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.ManageNursingProjectExample;
import com.chance.ssm.service.ManageNursingProjectService;

public class ManageNursingProjectServiceImpl implements
		ManageNursingProjectService {

	@Autowired
	private ManageNursingProjectMapper mNursingProjectMapper;

	@Override
	public int insertSelective(ManageNursingProject record) throws Exception {
		return mNursingProjectMapper.insertSelective(record);
	}

	@Override
	public ManageNursingProject selectByPrimaryKey(String manageNursingProjectId)
			throws Exception {
		// TODO Auto-generated method stub
		return mNursingProjectMapper.selectByPrimaryKey(manageNursingProjectId);
	}

	@Override
	public int deleteByPrimaryKey(String manageNursingProjectId) throws Exception {
		return mNursingProjectMapper.deleteByPrimaryKey(manageNursingProjectId);
	}

	@Override
	public List<ManageNursingProject> selectByExample(
			ManageNursingProjectExample example) throws Exception {
		// TODO Auto-generated method stub
		return mNursingProjectMapper.selectByExample(example);
	}

	@Override
	public int countByExample(ManageNursingProjectExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return mNursingProjectMapper.countByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(ManageNursingProject record)
			throws Exception {
		// TODO Auto-generated method stub
		return mNursingProjectMapper.updateByPrimaryKeySelective(record);
	}

}
