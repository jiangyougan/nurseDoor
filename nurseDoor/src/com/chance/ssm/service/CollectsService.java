package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Collects;
import com.chance.ssm.po.CollectsExample;
import com.chance.ssm.po.vo.CollectsVO;

public interface CollectsService {
	
	//添加收藏
	 public int insertSelective(Collects record)throws Exception;
	 
	 //查询所收藏的信息
	 public List<Collects> selectByExample(CollectsExample example)throws Exception;
	 
	 //根据传入的条件查询数据，并返回VO扩展类
	 public List<CollectsVO> selectByExampleRuVO(CollectsExample example)throws Exception;
	 
	 //根据ID取消收藏
	 public int deleteByPrimaryKey(String collectionId)throws Exception;

}
