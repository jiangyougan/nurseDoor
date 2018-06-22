package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Administration;

public interface AdministrationService{
	//查询所有管理
   public  List<Administration> selectAdminListInfo()throws Exception;
   
    //根据管理员账号，昵称，真实姓名，部门，性别查找管理员
   public List<Administration> selectKeyWordFromAdmin(String _parameter)throws Exception;
   
   //修改管理员信息
   public int updateByPrimaryKeySelective(Administration record)throws Exception;
   
   //删除管理员
   public int deleteByPrimaryKey(String administrationId)throws Exception;
   
   //根据管理员账号查询信息
   public Administration selectAdminInfoBy(String administrationName)throws Exception;
   
   //添加管理员
   public int insertSelective(Administration record)throws Exception;
   
   //根据管理员ID查询信息
   public Administration selectByPrimaryKey(String administrationId)throws Exception;

}
