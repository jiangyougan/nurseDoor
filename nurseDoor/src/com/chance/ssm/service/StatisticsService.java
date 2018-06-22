package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Statistics;
import com.chance.ssm.po.StatisticsExample;
import com.chance.ssm.po.vo.StatisticsVO;

public interface StatisticsService {

	// 添加服务统计记录
	public int insertSelective(Statistics record) throws Exception;
	
	//分类统计
	public List<StatisticsVO> countByExamplegroup(StatisticsExample example)throws Exception;
	
	//统计
    int countByExample(StatisticsExample example);

}
