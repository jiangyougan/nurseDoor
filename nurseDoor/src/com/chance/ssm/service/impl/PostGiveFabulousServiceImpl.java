package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.postgivefabulousmapper.PostGiveFabulousMapper;
import com.chance.ssm.po.PostGiveFabulous;
import com.chance.ssm.po.PostGiveFabulousExample;
import com.chance.ssm.service.PostGiveFabulousService;

public class PostGiveFabulousServiceImpl implements PostGiveFabulousService{

	@Autowired
	private PostGiveFabulousMapper postGiveFabulousMapper;
	
	@Override
	public int insertSelective(PostGiveFabulous record) throws Exception {
		// TODO Auto-generated method stub
		return postGiveFabulousMapper.insertSelective(record);
	}

	@Override
	public int selectpostgivefabulousToday(
			String postGiveFabulousNurseId, String postGiveFabulousPostThreeId)
			throws Exception {
		// TODO Auto-generated method stub
		return postGiveFabulousMapper.selectpostgivefabulousToday(postGiveFabulousNurseId, postGiveFabulousPostThreeId);
	}

	@Override
	public List<PostGiveFabulous> selectpostgivefabulousForMeto(
			String postGiveFabulousNurseId, String postGiveFabulousPostThreeId)
			throws Exception {
		// TODO Auto-generated method stub
		return postGiveFabulousMapper.selectpostgivefabulousForMeto(postGiveFabulousNurseId, postGiveFabulousPostThreeId);
	}

	@Override
	public int countByExample(PostGiveFabulousExample example) throws Exception {
		// TODO Auto-generated method stub
		return postGiveFabulousMapper.countByExample(example);
	}


}
