package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.majormapper.MajorMapper;
import com.chance.ssm.po.Major;
import com.chance.ssm.po.MajorExample;
import com.chance.ssm.service.MajorService;

public class MajorServiceImpl implements MajorService{
	
	@Autowired
	private MajorMapper majorMapper;

	@Override
	public List<Major> selectByExample(MajorExample example) throws Exception {
		// TODO Auto-generated method stub
		return majorMapper.selectByExample(example);
	}

	@Override
	public List<Major> selectMajorInfoByName() throws Exception {
		// TODO Auto-generated method stub
		return majorMapper.selectMajorInfoByName();
	}

	@Override
	public List<Major> selectMajorBuHbtId(String majorDetails) throws Exception {
		// TODO Auto-generated method stub
		return majorMapper.selectMajorBuHbtId(majorDetails);
	}

	@Override
	public List<Major> selectMajorGroupById() throws Exception {
		// TODO Auto-generated method stub
		return majorMapper.selectMajorGroupById();
	}

	@Override
	public int insertSelective(Major record) throws Exception {
		// TODO Auto-generated method stub
		return majorMapper.insertSelective(record);
	}

	@Override
	public int deleteByExample(MajorExample example) throws Exception {
		// TODO Auto-generated method stub
		return majorMapper.deleteByExample(example);
	}

}
