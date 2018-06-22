package com.chance.ssm.mapper.interestratemapper;

import com.chance.ssm.po.InterestRate;
import com.chance.ssm.po.InterestRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestRateMapper {
    int countByExample(InterestRateExample example);

    int deleteByExample(InterestRateExample example);

    int insert(InterestRate record);

    //插入利率
    int insertSelective(InterestRate record);

    //修改利率
    int updateByExampleSelective(@Param("record") InterestRate record, @Param("example") InterestRateExample example);
    
    //查询利率
    List<InterestRate> selectByExample(InterestRateExample example);

  

    int updateByExample(@Param("record") InterestRate record, @Param("example") InterestRateExample example);
}