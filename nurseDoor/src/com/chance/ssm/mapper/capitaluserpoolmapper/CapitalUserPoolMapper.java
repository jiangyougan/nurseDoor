package com.chance.ssm.mapper.capitaluserpoolmapper;

import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.CapitalUserPoolExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalUserPoolMapper {
    int countByExample(CapitalUserPoolExample example);

    int deleteByExample(CapitalUserPoolExample example);

    int deleteByPrimaryKey(String capitalUserPoolId);

    int insert(CapitalUserPool record);

    //用户添加资金池
    int insertSelective(CapitalUserPool record);

    //用户资金明细
    List<CapitalUserPool> selectByExample(CapitalUserPoolExample example);

    CapitalUserPool selectByPrimaryKey(String capitalUserPoolId);

    int updateByExampleSelective(@Param("record") CapitalUserPool record, @Param("example") CapitalUserPoolExample example);

    int updateByExample(@Param("record") CapitalUserPool record, @Param("example") CapitalUserPoolExample example);

    int updateByPrimaryKeySelective(CapitalUserPool record);

    int updateByPrimaryKey(CapitalUserPool record);
    
    //查询用户明细
    List<CapitalUserPool> selectCapitalUserPoolInfo(String capitalUserPoolPeopleid);
    
    //查询用户总支出
    BigDecimal selectUserAllExpenditure(String userId);
}