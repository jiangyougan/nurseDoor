package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.ManageNursingTestall;
import com.chance.ssm.po.ManageNursingTestallExample;

public interface ManageNursingTestallService {
	
	//添加数据
	public int insertSelective(ManageNursingTestall record)throws Exception;
	
	//根据传入的条件查询数据
	public List<ManageNursingTestall> selectByExample(ManageNursingTestallExample example)throws Exception; 
	
	//根据ID查询数据
	public ManageNursingTestall selectByPrimaryKey(String manageNursingTestall)throws Exception;
	
	//根据ID更新数据
	public int updateByPrimaryKeySelective(ManageNursingTestall record)throws Exception;
	
	//根据ID删除数据
	public int deleteByPrimaryKey(String manageNursingTestall)throws Exception;

	  //根据产品id得到检测项
	public List<ManageNursingTestall> selectTestContentByGoodsId(String goodsId)throws Exception;
}
