package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.managenursingtestallmapper.ManageNursingTestallMapper;
import com.chance.ssm.po.ManageNursingTestall;
import com.chance.ssm.po.ManageNursingTestallExample;
import com.chance.ssm.service.ManageNursingTestallService;

public class ManageNursingTestallServiceImpl implements
		ManageNursingTestallService {
	
	@Autowired
	private ManageNursingTestallMapper mNursingTestallMapper;

	@Override
	public int insertSelective(ManageNursingTestall record) throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestallMapper.insertSelective(record);
	}

	@Override
	public List<ManageNursingTestall> selectByExample(
			ManageNursingTestallExample example) throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestallMapper.selectByExample(example);
	}

	@Override
	public ManageNursingTestall selectByPrimaryKey(String manageNursingTestall)
			throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestallMapper.selectByPrimaryKey(manageNursingTestall);
	}

	@Override
	public int updateByPrimaryKeySelective(ManageNursingTestall record)
			throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestallMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String manageNursingTestall) throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestallMapper.deleteByPrimaryKey(manageNursingTestall);
	}

	@Override
	public List<ManageNursingTestall> selectTestContentByGoodsId(String goodsId)
			throws Exception {
		// TODO Auto-generated method stub
		return mNursingTestallMapper.selectTestContentByGoodsId(goodsId);
	}

}
