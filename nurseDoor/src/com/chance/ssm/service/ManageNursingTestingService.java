package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.ManageNursingTesting;
import com.chance.ssm.po.ManageNursingTestingExample;
import com.chance.ssm.po.vo.ManageNursingTestingVO;

public interface ManageNursingTestingService {
	//添加记录
	 public int insertSelective(ManageNursingTesting record)throws Exception;
	 
	 //根据条件查询数据
	 public List<ManageNursingTesting> selectByExample(ManageNursingTestingExample example)throws Exception;
	 
	    //和testall表关联查询
	 public  List<ManageNursingTestingVO> selectByExampleAndTestAllselectByExample(ManageNursingTestingExample example)throws Exception;
	 
	 //根据ID删除数据
	 public int deleteByPrimaryKey(String manageNursingTestingId)throws Exception;

}
