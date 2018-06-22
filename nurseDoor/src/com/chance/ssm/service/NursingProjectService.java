package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.vo.NurseProjectVo;

public interface NursingProjectService {

	//根据条件查询数据
	 public List<NursingProject> selectByExample(NursingProjectExample example)throws Exception;
	 
	 
	 //添加数据
	 public int insertSelective(NursingProject record)throws Exception;
	 
	 public int deleteByExample(NursingProjectExample example)throws Exception;
	 
	 //根据服务ID查询匹配的护士ID
	 List<NursingProject> selectNurseIdByContentIdFor(String manageNursingContentId);
	    
	 //根据服务ID查询匹配的护士ID(根据距离排序)
	 List<NursingProject> selectNurseIdByContentIdForOrderDricts(NurseProjectVo nurseProjectVo);
}
