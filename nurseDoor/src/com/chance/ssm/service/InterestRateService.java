package com.chance.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.InterestRate;
import com.chance.ssm.po.InterestRateExample;

public interface InterestRateService {

	//查询利率
    public List<InterestRate> selectByExample(InterestRateExample example)throws Exception;
    
    //插入利率
    public int insertSelective(InterestRate record)throws Exception;

    //修改利率
    public int updateByExampleSelective(@Param("record") InterestRate record, @Param("example") InterestRateExample example)throws Exception;
}
