package com.chance.ssm.mapper.managenursingprojectmapper;

import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.ManageNursingProjectExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ManageNursingProjectMapper {
    int countByExample(ManageNursingProjectExample example);

    int deleteByExample(ManageNursingProjectExample example);

    int deleteByPrimaryKey(String manageNursingProjectId);

    int insert(ManageNursingProject record);

    //添加一级护理服务项
    int insertSelective(ManageNursingProject record);

    List<ManageNursingProject> selectByExample(
            ManageNursingProjectExample example);

    //根据护理服务id查询信息
    ManageNursingProject selectByPrimaryKey(String manageNursingProjectId);

    int updateByExampleSelective(@Param("record") ManageNursingProject record,
                                 @Param("example") ManageNursingProjectExample example);

    int updateByExample(@Param("record") ManageNursingProject record,
                        @Param("example") ManageNursingProjectExample example);

    //修改护理服务
    int updateByPrimaryKeySelective(ManageNursingProject record);

    int updateByPrimaryKey(ManageNursingProject record);

    // 查询所有服务
    List<ManageNursingProject> SelectManageNursingProjectInfo();

}