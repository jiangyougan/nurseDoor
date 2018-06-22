package com.chance.ssm.mapper.administrationmapper;

import com.chance.ssm.po.Administration;
import com.chance.ssm.po.AdministrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministrationMapper {
    int countByExample(AdministrationExample example);

    int deleteByExample(AdministrationExample example);

    //删除管理员
    int deleteByPrimaryKey(String administrationId);

    int insert(Administration record);

    //添加管理员
    int insertSelective(Administration record);

    List<Administration> selectByExample(AdministrationExample example);

    //根据管理员ID查询信息
    Administration selectByPrimaryKey(String administrationId);

    int updateByExampleSelective(@Param("record") Administration record, @Param("example") AdministrationExample example);

    int updateByExample(@Param("record") Administration record, @Param("example") AdministrationExample example);

    //修改管理员信息
    int updateByPrimaryKeySelective(Administration record);

    int updateByPrimaryKey(Administration record);
    
    //*****************后台**************************//
    //查询所有管理
    List<Administration> selectAdminListInfo();
    
    //根据管理员账号查询信息
    Administration selectAdminInfoBy(String administrationName);
    
    //根据管理员账号，昵称，真实姓名，部门，性别查找管理员
    List<Administration> selectKeyWordFromAdmin(String _parameter);
}