package com.chance.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.protectedaddressmapper.ProtectedAddressMapper;
import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedAddressExample;
import com.chance.ssm.service.ProtectedAddressService;

public class ProtectedAddressServiceImpl implements ProtectedAddressService {
	
	@Autowired
	private ProtectedAddressMapper pAddressMapper;

	@Override
	public int insertSelective(ProtectedAddress record) throws Exception {
		// TODO Auto-generated method stub
		return pAddressMapper.insertSelective(record);
	}

	@Override
	public int updateByExampleSelective(ProtectedAddress record,
			ProtectedAddressExample example) throws Exception {
		// TODO Auto-generated method stub
		return pAddressMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int deleteByPrimaryKey(String protectedAddressId) throws Exception {
		// TODO Auto-generated method stub
		return pAddressMapper.deleteByPrimaryKey(protectedAddressId);
	}

	@Override
	public ProtectedAddress selectByPrimaryKey(String protectedAddressId)
			throws Exception {
		// TODO Auto-generated method stub
		return pAddressMapper.selectByPrimaryKey(protectedAddressId);
	}

}
