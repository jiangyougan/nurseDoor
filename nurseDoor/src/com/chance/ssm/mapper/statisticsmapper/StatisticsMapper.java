package com.chance.ssm.mapper.statisticsmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Statistics;
import com.chance.ssm.po.StatisticsExample;
import com.chance.ssm.po.vo.StatisticsVO;

public interface StatisticsMapper {
	
	//统计
    int countByExample(StatisticsExample example);

    int deleteByExample(StatisticsExample example);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    List<Statistics> selectByExample(StatisticsExample example);

    int updateByExampleSelective(@Param("record") Statistics record, @Param("example") StatisticsExample example);

    int updateByExample(@Param("record") Statistics record, @Param("example") StatisticsExample example);
    
    //分类统计
    List<StatisticsVO> countByExamplegroup(StatisticsExample example);
}