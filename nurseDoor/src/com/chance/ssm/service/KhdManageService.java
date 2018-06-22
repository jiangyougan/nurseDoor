package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.GoodServiceRecommend;
import com.chance.ssm.po.GoodServiceRecommendExample;
import com.chance.ssm.po.RollPic;

public interface KhdManageService {
	
   //查询所有轮播图
   public  List<RollPic> selectAllRollPic()throws Exception;
   
   //插入轮播图
   public int insertSelective(RollPic record)throws Exception;

   //删除首页轮播图
   public int deleteByPrimaryKey(String rollPicId)throws Exception;
   
   //删除学术圈首页轮播图
   public int deletePostEollpicByPrimaryKey(String rollPicId)throws Exception;
   
   //查询所有精品推荐服务
   public  List<GoodServiceRecommend> selectByExample(GoodServiceRecommendExample example)throws Exception;

   //添加精品新服务
   public int insertSelectiveGoodServiceRecommend(GoodServiceRecommend record)throws Exception;

   //删除精品服务
   int deleteByPrimaryKeyGoodService(String goodServiceRecommendId);
   
   //修改轮播图
   int updateByPrimaryKeySelective(RollPic record);
   
 //修改精品服务
   int updateByPrimaryKeySelectiveGoodService(GoodServiceRecommend record);
}
