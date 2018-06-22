package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.goodsmapper.GoodsMapper;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.vo.GoodsVO;
import com.chance.ssm.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> selectByExample(GoodsExample example) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.selectByExample(example);
	}

	@Override
	public List<GoodsVO> selectByExampleRuVO(GoodsExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.selectByExampleRuVO(example);
	}

	@Override
	public List<Goods> selectGoodInfoByContent(String goodsContent)
			throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.selectGoodInfoByContent(goodsContent);
	}

	@Override
	public Goods selectByPrimaryKey(String goodsId) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.selectByPrimaryKey(goodsId);
	}

	@Override
	public int updateByPrimaryKeySelective(Goods record) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByExample(GoodsExample example) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.deleteByExample(example);
	}

	@Override
	public int insertSelective(Goods record) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.insertSelective(record);
	}

	@Override
	public int countByExample(GoodsExample example) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.countByExample(example);
	}

	@Override
	public List<Goods> selectGoodsMoneyByOther(String goodsContent)
			throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.selectGoodsMoneyByOther(goodsContent);
	}

	@Override
	public int deleteByPrimaryKey(String goodsId) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapper.deleteByPrimaryKey(goodsId);
	}

	@Override
	public List<Goods> selectGoodsIsCanUse(String goodsContent) {
		// TODO Auto-generated method stub
		return goodsMapper.selectGoodsIsCanUse(goodsContent);
	}

}
