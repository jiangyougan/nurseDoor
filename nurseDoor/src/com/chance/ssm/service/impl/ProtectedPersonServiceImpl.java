package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.protectedpersonmapper.ProtectedPersonMapper;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.ProtectedPersonExample;
import com.chance.ssm.po.vo.ProtectedPersonVO;
import com.chance.ssm.service.ProtectedPersonService;

public class ProtectedPersonServiceImpl implements ProtectedPersonService{
	
	@Autowired
	private ProtectedPersonMapper personMapper;

	@Override
	public ProtectedPersonVO selectByExampleRuVO(ProtectedPersonExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return personMapper.selectByExampleRuVO(example);
	}

	@Override
	public int insertSelective(ProtectedPerson record) throws Exception {
		// TODO Auto-generated method stub
		return personMapper.insertSelective(record);
	}

	@Override
	public int updateByExampleSelective(ProtectedPerson record,
			ProtectedPersonExample example) throws Exception {
		// TODO Auto-generated method stub
		return personMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int deleteByPrimaryKey(String protectedPersonId) throws Exception {
		// TODO Auto-generated method stub
		return personMapper.deleteByPrimaryKey(protectedPersonId);
	}

	@Override
	public ProtectedPerson selectByPrimaryKey(String protectedPersonId)
			throws Exception {
		// TODO Auto-generated method stub
		return personMapper.selectByPrimaryKey(protectedPersonId);
	}

	@Override
	public List<ProtectedPerson> selectByExample(ProtectedPersonExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return personMapper.selectByExample(example);
	}

	@Override
	public int countByExample(ProtectedPersonExample example) throws Exception {
		// TODO Auto-generated method stub
		return personMapper.countByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(ProtectedPerson record)
			throws Exception {
		// TODO Auto-generated method stub
		return personMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public ProtectedPerson selectProtectedPersonDetails(String orderSendUsername,String orderSendId)
			throws Exception {
		// TODO Auto-generated method stub
		return personMapper.selectProtectedPersonDetails(orderSendUsername,orderSendId);
	}

	@Override
	public int selectPersonCountByCard(String protectedPersonCard) throws Exception {
		// TODO Auto-generated method stub
		return personMapper.selectPersonCountByCard(protectedPersonCard);
	}

	@Override
	public List<ProtectedPerson> selectPersionInfoByUserId(
			String protectedUserId) throws Exception {
		// TODO Auto-generated method stub
		return personMapper.selectPersionInfoByUserId(protectedUserId);
	}

}
