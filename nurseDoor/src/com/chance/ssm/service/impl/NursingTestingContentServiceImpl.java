package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.nursingtestingcontentmapper.NursingTestingContentMapper;
import com.chance.ssm.po.NursingTestingContent;
import com.chance.ssm.service.NursingTestingContentService;

public class NursingTestingContentServiceImpl implements NursingTestingContentService {

	@Autowired
	private NursingTestingContentMapper testingContentMapper;
	
	@Override
	public List<NursingTestingContent> selectTestingContentByOrderId(
			String nursingOrderid) throws Exception {
		// TODO Auto-generated method stub
		return testingContentMapper.selectTestingContentByOrderId(nursingOrderid);
	}

	@Override
	public int insertSelective(NursingTestingContent record) throws Exception {
		// TODO Auto-generated method stub
		return testingContentMapper.insertSelective(record);
	}

}
