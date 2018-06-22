package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.nurseevaluatemapper.NurseEvaluateMapper;
import com.chance.ssm.po.NurseEvaluate;
import com.chance.ssm.po.NurseEvaluateExample;
import com.chance.ssm.service.NurseEvaluateService;

public class NurseEvaluateServiceImpl implements NurseEvaluateService {
	
	@Autowired
	private NurseEvaluateMapper nurseEvaluateMapper;

	@Override
	public int insertSelective(NurseEvaluate record) throws Exception {
		// TODO Auto-generated method stub
		return nurseEvaluateMapper.insertSelective(record);
	}

	@Override
	public List<NurseEvaluate> selectByExample(NurseEvaluateExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseEvaluateMapper.selectByExample(example);
	}

	@Override
	public List<NurseEvaluate> selectNurseToUserEvaluate(String evaluteSendId)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseEvaluateMapper.selectNurseToUserEvaluate(evaluteSendId);
	}

	@Override
	public NurseEvaluate selectEvaluateInfoByOrderid(String evaluteSendId)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseEvaluateMapper.selectEvaluateInfoByOrderid(evaluteSendId);
	}

}
