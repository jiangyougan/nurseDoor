package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.nursingprojectmapper.NursingProjectMapper;
import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.vo.NurseProjectVo;
import com.chance.ssm.service.NursingProjectService;

public class NursingProjectServiceImpl implements NursingProjectService {
	
	@Autowired
	private NursingProjectMapper nursingProjectMapper;

	@Override
	public List<NursingProject> selectByExample(NursingProjectExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return nursingProjectMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(NursingProject record) throws Exception {
		// TODO Auto-generated method stub
		return nursingProjectMapper.insertSelective(record);
	}

	@Override
	public int deleteByExample(NursingProjectExample example) throws Exception {
		// TODO Auto-generated method stub
		return nursingProjectMapper.deleteByExample(example);
	}

	@Override
	public List<NursingProject> selectNurseIdByContentIdFor(
			String manageNursingContentId) {
		// TODO Auto-generated method stub
		return nursingProjectMapper.selectNurseIdByContentIdFor(manageNursingContentId);
	}

	@Override
	public List<NursingProject> selectNurseIdByContentIdForOrderDricts(
			NurseProjectVo nurseProjectVo) {
		// TODO Auto-generated method stub
		return nursingProjectMapper.selectNurseIdByContentIdForOrderDricts(nurseProjectVo);
	}


}
