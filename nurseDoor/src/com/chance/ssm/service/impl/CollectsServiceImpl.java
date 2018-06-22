package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.collectsmapper.CollectsMapper;
import com.chance.ssm.po.Collects;
import com.chance.ssm.po.CollectsExample;
import com.chance.ssm.po.vo.CollectsVO;
import com.chance.ssm.service.CollectsService;

public class CollectsServiceImpl implements CollectsService {
	
	@Autowired
	private CollectsMapper collectsMapper;

	@Override
	public int insertSelective(Collects record) throws Exception {
		// TODO Auto-generated method stub
		return collectsMapper.insertSelective(record);
	}

	@Override
	public List<Collects> selectByExample(CollectsExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return collectsMapper.selectByExample(example);
	}

	@Override
	public List<CollectsVO> selectByExampleRuVO(CollectsExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return collectsMapper.selectByExampleRuVO(example);
	}

	@Override
	public int deleteByPrimaryKey(String collectionId) throws Exception {
		// TODO Auto-generated method stub
		return collectsMapper.deleteByPrimaryKey(collectionId);
	}
}
