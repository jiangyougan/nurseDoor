package com.chance.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.ProtectedPersonExample;
import com.chance.ssm.po.vo.ProtectedPersonVO;

public interface ProtectedPersonService {
	
	//根据条件查询不同的记录,返回VO扩展类
	public ProtectedPersonVO selectByExampleRuVO(ProtectedPersonExample example)throws Exception;
	
	//添加受护人记录
	public int insertSelective(ProtectedPerson record)throws Exception;
	
	
	//根据条件更新数据
	public int updateByExampleSelective(@Param("record") ProtectedPerson record, @Param("example") ProtectedPersonExample example)throws Exception;

	//根据ID删除数据
	public int deleteByPrimaryKey(String protectedPersonId) throws Exception;
	
	//根据ID查询受护人信息
	public ProtectedPerson selectByPrimaryKey(String protectedPersonId) throws Exception;
	
	//根据条件查询不同的记录
	public List<ProtectedPerson> selectByExample(ProtectedPersonExample example)throws Exception;
	
	//根据条件统计数量
	public int countByExample(ProtectedPersonExample example)throws Exception;
	
	//根据ID更新数据
	public int updateByPrimaryKeySelective(ProtectedPerson record) throws Exception;
	
	 //根据订单id和受护人id得到该订单的受护人详细信息
	public ProtectedPerson selectProtectedPersonDetails(String orderSendUsername,String orderSendId)throws Exception;
	
	 //根据身份证号查询有没有相同的
	public int selectPersonCountByCard(String protectedPersonCard)throws Exception;
	
	 //根据用户ID查询患者信息
	public List<ProtectedPerson> selectPersionInfoByUserId(String protectedUserId)throws Exception;
}
