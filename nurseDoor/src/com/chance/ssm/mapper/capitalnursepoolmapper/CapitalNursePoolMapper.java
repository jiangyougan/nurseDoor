package com.chance.ssm.mapper.capitalnursepoolmapper;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.CapitalNursePoolExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalNursePoolMapper {
    int countByExample(CapitalNursePoolExample example);

    int deleteByExample(CapitalNursePoolExample example);

    int deleteByPrimaryKey(String capitalNursePoolId);

    int insert(CapitalNursePool record);

    
    //插入记录
    int insertSelective(CapitalNursePool record);

    //护士资金明细
    List<CapitalNursePool> selectByExample(CapitalNursePoolExample example);

    CapitalNursePool selectByPrimaryKey(String capitalNursePoolId);

    int updateByExampleSelective(@Param("record") CapitalNursePool record, @Param("example") CapitalNursePoolExample example);

    int updateByExample(@Param("record") CapitalNursePool record, @Param("example") CapitalNursePoolExample example);

    int updateByPrimaryKeySelective(CapitalNursePool record);

    int updateByPrimaryKey(CapitalNursePool record);
    
    //护士资金池
    List<CapitalNursePool> selectCapitalInfoByNurseId(String capitalNursePoolPeopleid);
    
    List<CapitalNursePool> selectStatisticsMonth();
    
    //查询护士的订单收入
    BigDecimal selectNurseAllcapitalNursePoolMoney(String nurseId);
}