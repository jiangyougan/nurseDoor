package com.chance.ssm.mapper.capitalplatformmapper;

import com.chance.ssm.po.CapitalPlatform;
import com.chance.ssm.po.CapitalPlatformExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalPlatformMapper {
    int countByExample(CapitalPlatformExample example);

    int deleteByExample(CapitalPlatformExample example);

    int deleteByPrimaryKey(Integer capitalPlatformId);

    int insert(CapitalPlatform record);

    //加入平台资金池
    int insertSelective(CapitalPlatform record);

    //平台资金明细
    List<CapitalPlatform> selectByExample(CapitalPlatformExample example);

    CapitalPlatform selectByPrimaryKey(Integer capitalPlatformId);

    int updateByExampleSelective(@Param("record") CapitalPlatform record, @Param("example") CapitalPlatformExample example);

    int updateByExample(@Param("record") CapitalPlatform record, @Param("example") CapitalPlatformExample example);

    int updateByPrimaryKeySelective(CapitalPlatform record);

    int updateByPrimaryKey(CapitalPlatform record);
    
    
    //本日资金池
    BigDecimal SelCapitalSumMoney();
    
    //本月资金池
    BigDecimal SelCapitalSumMoneyMonth();
    
    //本年资金池
    BigDecimal SelCapitalSumMoneyYear();
}