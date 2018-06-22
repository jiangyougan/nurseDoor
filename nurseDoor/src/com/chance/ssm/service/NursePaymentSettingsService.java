package com.chance.ssm.service;

import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.vo.NurseThreeInfoVo;

public interface NursePaymentSettingsService {

	//根据护士ID查询记录
   public NursePaymentSettings selectByPrimaryKey(String nursePaymentSettingsNurseId)throws Exception;
    
   //插入
   public int insertSelective(NursePaymentSettings record)throws Exception;
   
   public int updateByPrimaryKeySelective(NursePaymentSettings record)throws Exception;
   
   //根据护士ID查询护士支付宝账号余额密码
   public NurseThreeInfoVo selectNurseThreeInfoByNurseId(String nurseId)throws Exception;
}
