package com.chance.ssm.service;

import java.util.List;
import java.util.Map;

import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.ManageNursingProjectExample;

public interface ManageNursingProjectService {
    //根据条件插入记录
    public int insertSelective(ManageNursingProject record) throws Exception;

    //通过传入的条件查询数据
    public ManageNursingProject selectByPrimaryKey(String manageNursingProjectId) throws Exception;

    //根据传入的条件查询数据
    public List<ManageNursingProject> selectByExample(
            ManageNursingProjectExample example) throws Exception;

    //统计根据传入的条件统计数量
    public int countByExample(ManageNursingProjectExample example) throws Exception;


    public int deleteByPrimaryKey(String manageNursingProjectId)throws Exception;
    
    //修改护理服务
    public  int updateByPrimaryKeySelective(ManageNursingProject record)throws Exception;
	
}
