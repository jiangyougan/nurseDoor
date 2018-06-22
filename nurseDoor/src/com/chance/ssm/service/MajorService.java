package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Major;
import com.chance.ssm.po.MajorExample;

public interface MajorService {
	//根据传入的值不同查询不同的数据
	public List<Major> selectByExample(MajorExample example)throws Exception;
	
	 //查询所有不重名的专业
	public List<Major> selectMajorInfoByName()throws Exception;
	
	 //通过医院查专业
	public  List<Major> selectMajorBuHbtId(String majorDetails)throws Exception;
	
	  //查询所有不重复的专业
	public List<Major> selectMajorGroupById()throws Exception;
	
	//添加医院和专业的关联
	public int insertSelective(Major record)throws Exception;
	
	//根据传入的条件删除数据
	public int deleteByExample(MajorExample example)throws Exception;

}
