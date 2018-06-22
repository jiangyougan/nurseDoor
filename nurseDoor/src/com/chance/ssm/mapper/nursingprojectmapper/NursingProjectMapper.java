package com.chance.ssm.mapper.nursingprojectmapper;

import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.vo.NurseProjectVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NursingProjectMapper {
	//根据传入的条件不同统计数据
    int countByExample(NursingProjectExample example);
    //根据传入的条件删除数据
    int deleteByExample(NursingProjectExample example);

    int insert(NursingProject record);

    int insertSelective(NursingProject record);

    List<NursingProject> selectByExample(NursingProjectExample example);

    int updateByExampleSelective(@Param("record") NursingProject record, @Param("example") NursingProjectExample example);

    int updateByExample(@Param("record") NursingProject record, @Param("example") NursingProjectExample example);
    
    //根据服务ID查询匹配的护士ID
    List<NursingProject> selectNurseIdByContentIdFor(String manageNursingContentId);
    
    //根据服务ID查询匹配的护士ID(根据距离排序)
    List<NursingProject> selectNurseIdByContentIdForOrderDricts(NurseProjectVo nurseProjectVo);
}