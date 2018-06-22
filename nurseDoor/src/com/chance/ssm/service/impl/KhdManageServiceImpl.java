package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.goodservicerecommendmapper.GoodServiceRecommendMapper;
import com.chance.ssm.mapper.postrollpicmapper.PostRollPicMapper;
import com.chance.ssm.mapper.rollpicmapper.RollPicMapper;
import com.chance.ssm.po.GoodServiceRecommend;
import com.chance.ssm.po.GoodServiceRecommendExample;
import com.chance.ssm.po.RollPic;
import com.chance.ssm.service.KhdManageService;

public class KhdManageServiceImpl implements KhdManageService{

	@Autowired
	private RollPicMapper rollPicMapper;
	
	@Autowired 
	private PostRollPicMapper postRollPicMapper;
	
	@Autowired
	private GoodServiceRecommendMapper goodServiceRecommendMapper;

	@Override
	public List<RollPic> selectAllRollPic() throws Exception {
		// TODO Auto-generated method stub
		return rollPicMapper.selectAllRollPic();
	}

	@Override
	public int insertSelective(RollPic record) throws Exception {
		// TODO Auto-generated method stub
		return rollPicMapper.insertSelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String rollPicId) {
		// TODO Auto-generated method stub
		return rollPicMapper.deleteByPrimaryKey(rollPicId);
	}

	@Override
	public List<GoodServiceRecommend> selectByExample(
			GoodServiceRecommendExample example) throws Exception {
		// TODO Auto-generated method stub
		return goodServiceRecommendMapper.selectByExample(example);
	}

	@Override
	public int insertSelectiveGoodServiceRecommend(GoodServiceRecommend record) throws Exception {
		// TODO Auto-generated method stub
		return goodServiceRecommendMapper.insertSelectiveGoodServiceRecommend(record);
	}

	@Override
	public int deleteByPrimaryKeyGoodService(String goodServiceRecommendId) {
		// TODO Auto-generated method stub
		return goodServiceRecommendMapper.deleteByPrimaryKeyGoodService(goodServiceRecommendId);
	}

	@Override
	public int updateByPrimaryKeySelective(RollPic record) {
		// TODO Auto-generated method stub
		return rollPicMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeySelectiveGoodService(
			GoodServiceRecommend record) {
		// TODO Auto-generated method stub
		return goodServiceRecommendMapper.updateByPrimaryKeySelectiveGoodService(record);
	}

	@Override
	public int deletePostEollpicByPrimaryKey(String rollPicId) throws Exception {
		// TODO Auto-generated method stub
		return postRollPicMapper.deletePostEollpicByPrimaryKey(rollPicId);
	}
	

}
