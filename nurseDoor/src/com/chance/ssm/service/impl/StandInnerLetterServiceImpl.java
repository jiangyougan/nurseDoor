package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.standinnerlettermapper.StandInnerLetterMapper;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.service.StandInnerLetterService;

public class StandInnerLetterServiceImpl implements StandInnerLetterService{
	
	@Autowired
	private StandInnerLetterMapper innerLetterMapper;
	
	@Override
	public int insertSelective(StandInnerLetter record) throws Exception {
		// TODO Auto-generated method stub
		return innerLetterMapper.insertSelective(record);
	}

	@Override
	public List<StandInnerLetter> selectStandInnerLetterNurseId(
			String standInnerLetterUserId) throws Exception {
		// TODO Auto-generated method stub
		return innerLetterMapper.selectStandInnerLetterNurseId(standInnerLetterUserId);
	}

	@Override
	public List<StandInnerLetter> selectStandInnerLetterUserId(
			String standInnerLetterUserId) throws Exception {
		// TODO Auto-generated method stub
		return innerLetterMapper.selectStandInnerLetterUserId(standInnerLetterUserId);
	}

	@Override
	public List<StandInnerLetter> selectStandInnerLetteInfo(String roleId,
			int identity, int type) {
		// TODO Auto-generated method stub
		return innerLetterMapper.selectStandInnerLetteInfo(roleId, identity, type);
	}

	@Override
	public List<StandInnerLetter> selectStandInnerLetteInfoAll(String roleId,
			int identity) {
		// TODO Auto-generated method stub
		return innerLetterMapper.selectStandInnerLetteInfoAll(roleId, identity);
	}

	@Override
	public int deleteByPrimaryKeyByUserIdOrNurseId(String roleId, int identity) {
		// TODO Auto-generated method stub
		return innerLetterMapper.deleteByPrimaryKeyByUserIdOrNurseId(roleId, identity);
	}

	@Override
	public int deleteByPrimaryKeyByUserIdOrNurseIdAndType(String roleId,
			int identity, int type) {
		// TODO Auto-generated method stub
		return innerLetterMapper.deleteByPrimaryKeyByUserIdOrNurseIdAndType(roleId, identity, type);
	}


}
