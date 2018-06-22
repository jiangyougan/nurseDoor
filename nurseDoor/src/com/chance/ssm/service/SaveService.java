package com.chance.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Save;
import com.chance.ssm.po.SaveExample;
import com.chance.ssm.po.Traffic;
import com.chance.ssm.po.TrafficExample;

public interface SaveService {
	
	public List<Save> selectByExample(SaveExample example)throws Exception;
	
	//添加交通费信息
	public int insertSelective(Traffic record)throws Exception;
	
	 //修改交通信息费用
	public int updateByExampleSelective(Traffic record,TrafficExample example)throws Exception;
	
	 //添加保险费
	public  int insertSaveSelective(Save record)throws Exception;
    
    //修改保险费
	public  int updateSaveByExampleSelective(Save record,SaveExample example)throws Exception;


}
