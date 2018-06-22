package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.CustomerServicePhone;
import com.chance.ssm.po.CustomerServicePhoneExample;

public interface CustomerServicePhoneService {
	
	//查询所有客服电话
   public  List<CustomerServicePhone> selectByExample(CustomerServicePhoneExample example)throws Exception;
   
   //添加客服电话
   public int insertSelective(CustomerServicePhone record)throws Exception;
   
   //修改客服电话信息
   public int updateByPrimaryKeySelective(CustomerServicePhone record)throws Exception;
   
   //修改所有的数据未非默认
   public int updateServicePhoneDefault()throws Exception;
   
   //删除客服电话
   public int deleteByPrimaryKey(String customerServicePhoneId)throws Exception;

}
