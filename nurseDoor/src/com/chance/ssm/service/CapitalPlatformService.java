package com.chance.ssm.service;

import java.math.BigDecimal;
import java.util.List;

import com.chance.ssm.po.CapitalPlatform;
import com.chance.ssm.po.CapitalPlatformExample;

public interface CapitalPlatformService {
	
	//加入平台资金池
   public  int insertSelective(CapitalPlatform record)throws Exception;

   //本日资金池
   public BigDecimal SelCapitalSumMoney()throws Exception;
   
   //本月资金池
   public BigDecimal SelCapitalSumMoneyMonth()throws Exception;
   
   //本年资金池
   public BigDecimal SelCapitalSumMoneyYear()throws Exception;
   
   //平台资金明细
   public List<CapitalPlatform> selectByExample(CapitalPlatformExample example)throws Exception;
}
