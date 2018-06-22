package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.simplemajormapper.SimpleMajorMapper;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.SimpleMajorExample;
import com.chance.ssm.po.vo.SimpleMajorVO;
import com.chance.ssm.service.SimpleMajorService;

public class SimpleMajorServiceImpl implements SimpleMajorService {
	@Autowired
	private SimpleMajorMapper simpleMajorMapper;

	@Override
	public int insertSelective(SimpleMajor record) throws Exception {
		// TODO Auto-generated method stub
		return simpleMajorMapper.insertSelective(record);
	}

	@Override
	public List<SimpleMajor> selectByExample(SimpleMajorExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return simpleMajorMapper.selectByExample(example);
	}

	@Override
	public SimpleMajor selectByPrimaryKey(String simpleMajorId)
			throws Exception {
		// TODO Auto-generated method stub
		return simpleMajorMapper.selectByPrimaryKey(simpleMajorId);
	}

	@Override
	public int updateByPrimaryKeySelective(SimpleMajor record) throws Exception {
		// TODO Auto-generated method stub
		return simpleMajorMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String simpleMajorId) throws Exception {
		// TODO Auto-generated method stub
		return simpleMajorMapper.deleteByPrimaryKey(simpleMajorId);
	}

	@Override
	public List<SimpleMajorVO> selectByExampleRuVO(SimpleMajorExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return simpleMajorMapper.selectByExampleRuVO(example);
	}

}
