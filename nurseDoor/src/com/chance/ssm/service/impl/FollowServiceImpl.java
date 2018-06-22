package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.followmapper.FollowMapper;
import com.chance.ssm.po.Follow;
import com.chance.ssm.po.FollowExample;
import com.chance.ssm.po.vo.FollowUserVo;
import com.chance.ssm.po.vo.FollowVO;
import com.chance.ssm.service.FollowService;

public class FollowServiceImpl implements FollowService {
	@Autowired
	private FollowMapper followMapper;

	@Override
	public int countByExample(FollowExample example) throws Exception {
		// TODO Auto-generated method stub
		return followMapper.countByExample(example);
	}

	@Override
	public int insertSelective(Follow record) throws Exception {
		// TODO Auto-generated method stub
		return followMapper.insertSelective(record);
	}

	@Override
	public List<Follow> selectByExample(FollowExample example) throws Exception {
		// TODO Auto-generated method stub
		return followMapper.selectByExample(example);
	}

	@Override
	public List<FollowVO> selectByExampleRuVO(FollowExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return followMapper.selectByExampleRuVO(example);
	}

	@Override
	public int deleteByPrimaryKey(String followId) throws Exception {
		// TODO Auto-generated method stub
		return followMapper.deleteByPrimaryKey(followId);
	}

	@Override
	public List<FollowVO> selectByExampleRuVO2(FollowExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return followMapper.selectByExampleRuVO2(example);
	}

	@Override
	public List<FollowUserVo> selectFollowNurseForUser(String nurseId) {
		// TODO Auto-generated method stub
		return followMapper.selectFollowNurseForUser(nurseId);
	}

}
