package com.chance.ssm.mapper.adminfunctionmapper;

import com.chance.ssm.po.AdminFunction;
import com.chance.ssm.po.AdminFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminFunctionMapper {
    int countByExample(AdminFunctionExample example);

    int deleteByExample(AdminFunctionExample example);

    int deleteByPrimaryKey(String adminFunctionId);

    int insert(AdminFunction record);

    int insertSelective(AdminFunction record);

    List<AdminFunction> selectByExample(AdminFunctionExample example);

    AdminFunction selectByPrimaryKey(String adminFunctionId);

    int updateByExampleSelective(@Param("record") AdminFunction record, @Param("example") AdminFunctionExample example);

    int updateByExample(@Param("record") AdminFunction record, @Param("example") AdminFunctionExample example);

    int updateByPrimaryKeySelective(AdminFunction record);

    int updateByPrimaryKey(AdminFunction record);
}