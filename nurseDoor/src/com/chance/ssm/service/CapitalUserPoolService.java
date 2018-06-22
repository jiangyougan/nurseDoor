package com.chance.ssm.service;

import java.math.BigDecimal;
import java.util.List;

import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.CapitalUserPoolExample;

public interface CapitalUserPoolService {
	
	 //用户添加资金池
    public int insertSelective(CapitalUserPool record)throws Exception;

    //查询用户明细
    public List<CapitalUserPool> selectCapitalUserPoolInfo(String capitalUserPoolPeopleid)throws Exception;
    
    //用户资金明细
    public List<CapitalUserPool> selectByExample(CapitalUserPoolExample example)throws Exception;
    
    //查询用户总支出
    BigDecimal selectUserAllExpenditure(String userId);
}
