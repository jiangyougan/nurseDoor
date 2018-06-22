package com.chance.ssm.mapper.managenursingtestingmapper;

import com.chance.ssm.po.ManageNursingTesting;
import com.chance.ssm.po.ManageNursingTestingExample;
import com.chance.ssm.po.vo.ManageNursingTestingVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageNursingTestingMapper {
	int countByExample(ManageNursingTestingExample example);

    int deleteByExample(ManageNursingTestingExample example);

    int deleteByPrimaryKey(String manageNursingTestingId);

    int insert(ManageNursingTesting record);

    int insertSelective(ManageNursingTesting record);

    List<ManageNursingTesting> selectByExample(ManageNursingTestingExample example);

    ManageNursingTesting selectByPrimaryKey(String manageNursingTestingId);

    int updateByExampleSelective(@Param("record") ManageNursingTesting record, @Param("example") ManageNursingTestingExample example);

    int updateByExample(@Param("record") ManageNursingTesting record, @Param("example") ManageNursingTestingExample example);

    int updateByPrimaryKeySelective(ManageNursingTesting record);

    int updateByPrimaryKey(ManageNursingTesting record);
    
    //和testall表关联查询
    List<ManageNursingTestingVO> selectByExampleAndTestAll(ManageNursingTestingExample example);
}