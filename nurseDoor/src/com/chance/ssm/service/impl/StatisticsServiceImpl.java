package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.statisticsmapper.StatisticsMapper;
import com.chance.ssm.po.Statistics;
import com.chance.ssm.po.StatisticsExample;
import com.chance.ssm.po.vo.StatisticsVO;
import com.chance.ssm.service.StatisticsService;

public class StatisticsServiceImpl implements StatisticsService {
	
	@Autowired
	private StatisticsMapper statisticsMapper;

	@Override
	public int insertSelective(Statistics record) throws Exception {
		// TODO Auto-generated method stub
		return statisticsMapper.insertSelective(record);
	}

	@Override
	public List<StatisticsVO> countByExamplegroup(StatisticsExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return statisticsMapper.countByExamplegroup(example);
	}

	@Override
	public int countByExample(StatisticsExample example) {
		// TODO Auto-generated method stub
		return statisticsMapper.countByExample(example);
	}

	

}
