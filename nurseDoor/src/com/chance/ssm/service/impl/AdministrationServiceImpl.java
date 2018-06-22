package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.administrationmapper.AdministrationMapper;
import com.chance.ssm.po.Administration;
import com.chance.ssm.service.AdministrationService;

public class AdministrationServiceImpl implements AdministrationService{

	@Autowired
	private AdministrationMapper administrationMapper;
	@Override
	public List<Administration> selectAdminListInfo() throws Exception {
		// TODO Auto-generated method stub
		return administrationMapper.selectAdminListInfo();
	}
	@Override
	public List<Administration> selectKeyWordFromAdmin(String _parameter)
			throws Exception {
		// TODO Auto-generated method stub
		return administrationMapper.selectKeyWordFromAdmin(_parameter);
	}
	@Override
	public int updateByPrimaryKeySelective(Administration record)
			throws Exception {
		// TODO Auto-generated method stub
		return administrationMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int deleteByPrimaryKey(String administrationId) throws Exception {
		// TODO Auto-generated method stub
		return administrationMapper.deleteByPrimaryKey(administrationId);
	}
	@Override
	public Administration selectAdminInfoBy(String administrationName)
			throws Exception {
		// TODO Auto-generated method stub
		return administrationMapper.selectAdminInfoBy(administrationName);
	}
	@Override
	public int insertSelective(Administration record) throws Exception {
		// TODO Auto-generated method stub
		return administrationMapper.insertSelective(record);
	}
	@Override
	public Administration selectByPrimaryKey(String administrationId)
			throws Exception {
		// TODO Auto-generated method stub
		return administrationMapper.selectByPrimaryKey(administrationId);
	}

}
