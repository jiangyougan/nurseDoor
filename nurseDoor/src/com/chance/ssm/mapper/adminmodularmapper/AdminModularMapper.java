package com.chance.ssm.mapper.adminmodularmapper;

import com.chance.ssm.po.AdminModular;
import com.chance.ssm.po.AdminModularExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminModularMapper {
    int countByExample(AdminModularExample example);

    int deleteByExample(AdminModularExample example);

    int deleteByPrimaryKey(String modularId);

    int insert(AdminModular record);

    int insertSelective(AdminModular record);

    List<AdminModular> selectByExample(AdminModularExample example);

    AdminModular selectByPrimaryKey(String modularId);

    int updateByExampleSelective(@Param("record") AdminModular record, @Param("example") AdminModularExample example);

    int updateByExample(@Param("record") AdminModular record, @Param("example") AdminModularExample example);

    int updateByPrimaryKeySelective(AdminModular record);

    int updateByPrimaryKey(AdminModular record);
}