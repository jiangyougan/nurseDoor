package com.chance.ssm.service;

import com.chance.ssm.po.Recharge;

public interface RechargeService {

   //添加充值记录
   public int insertSelective(Recharge record)throws Exception;
   
   //根据订单id查询充值信息
   public Recharge selectByPrimaryKey(String rechargeId)throws Exception;
   
   //更新充值记录
   public int updateByPrimaryKeySelective(Recharge record)throws Exception;
}
