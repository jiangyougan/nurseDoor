package com.chance.ssm.service;

import java.math.BigDecimal;
import java.util.List;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.CapitalNursePoolExample;

public interface CapitalNursePoolService {
	 //插入记录
    public int insertSelective(CapitalNursePool record)throws Exception;
    
    //护士资金池
    public List<CapitalNursePool> selectCapitalInfoByNurseId(String capitalNursePoolPeopleid)throws Exception;

    //护士资金明细
    public List<CapitalNursePool> selectByExample(CapitalNursePoolExample example)throws Exception;
    
    List<CapitalNursePool> selectStatisticsMonth();
    
    //查询护士的订单收入
    BigDecimal selectNurseAllcapitalNursePoolMoney(String nurseId);
}
