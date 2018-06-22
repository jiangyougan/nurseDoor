package com.chance.ssm.mapper.nursepaymentsettingsmapper;

import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.NursePaymentSettingsExample;
import com.chance.ssm.po.vo.NurseThreeInfoVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NursePaymentSettingsMapper {
    int countByExample(NursePaymentSettingsExample example);

    int deleteByExample(NursePaymentSettingsExample example);

    int deleteByPrimaryKey(String nursePaymentSettingsNurseId);

    int insert(NursePaymentSettings record);

    
    //插入
    int insertSelective(NursePaymentSettings record);

    List<NursePaymentSettings> selectByExample(NursePaymentSettingsExample example);

    //根据护士ID查询记录
    NursePaymentSettings selectByPrimaryKey(String nursePaymentSettingsNurseId);

    int updateByExampleSelective(@Param("record") NursePaymentSettings record, @Param("example") NursePaymentSettingsExample example);

    int updateByExample(@Param("record") NursePaymentSettings record, @Param("example") NursePaymentSettingsExample example);

    int updateByPrimaryKeySelective(NursePaymentSettings record);

    int updateByPrimaryKey(NursePaymentSettings record);
    
    //根据护士ID查询护士支付宝账号余额密码
    NurseThreeInfoVo selectNurseThreeInfoByNurseId(String nurseId);
}