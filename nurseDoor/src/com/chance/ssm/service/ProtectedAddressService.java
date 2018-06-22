package com.chance.ssm.service;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedAddressExample;

public interface ProtectedAddressService {
	//添加受护人地址
	public int insertSelective(ProtectedAddress record)throws Exception;
	
	//根据不同的条件更新不同的数据
	public int updateByExampleSelective(@Param("record") ProtectedAddress record, @Param("example") ProtectedAddressExample example)throws Exception;

	//根据ID删除数据
	public int deleteByPrimaryKey(String protectedAddressId) throws Exception;

	 //通过守护人地址id查询信息
	public ProtectedAddress selectByPrimaryKey(String protectedAddressId)throws Exception;
}
