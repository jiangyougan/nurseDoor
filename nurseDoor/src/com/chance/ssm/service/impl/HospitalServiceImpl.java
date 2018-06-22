package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.hospitalmapper.HospitalMapper;
import com.chance.ssm.po.Hospital;
import com.chance.ssm.po.HospitalExample;
import com.chance.ssm.po.vo.HospitalVO;
import com.chance.ssm.service.HospitalService;

public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalMapper hospitalMapper;

	@Override
	public List<Hospital> selectByExample(HospitalExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.selectByExample(example);
	}

	@Override
	public List<Hospital> selectByExampleAndMajor(HospitalExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.selectByExampleAndMajor(example);
	}

	@Override
	public int insertSelective(Hospital record) throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.insertSelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String hospitalId) throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.deleteByPrimaryKey(hospitalId);
	}

	@Override
	public int updateByPrimaryKeySelective(Hospital record) throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Hospital> selectHbtByMajorId(String majorId) throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.selectHbtByMajorId(majorId);
	}

	@Override
	public HospitalVO selectByPrimaryKeyAndMajor(String hospitalId)
			throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.selectByPrimaryKeyAndMajor(hospitalId);
	}

	@Override
	public Hospital selectByPrimaryKey(String hospitalId) throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.selectByPrimaryKey(hospitalId);
	}

}
