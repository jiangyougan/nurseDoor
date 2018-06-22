package com.chance.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.timingcontrolmapper.TimingControlMapper;
import com.chance.ssm.po.TimingControl;
import com.chance.ssm.po.TimingControlExample;
import com.chance.ssm.service.TimingControlService;

public class TimingControlServiceImpl implements TimingControlService{
	
	@Autowired
	private TimingControlMapper timingControlMapper;

	@Override
	public TimingControl selectTimingControl() {
		// TODO Auto-generated method stub
		return timingControlMapper.selectTimingControl();
	}

	@Override
	public int insertSelective(TimingControl record) {
		// TODO Auto-generated method stub
		return timingControlMapper.insertSelective(record);
	}

	@Override
	public int updateByExampleSelective(TimingControl record,
			TimingControlExample example) {
		// TODO Auto-generated method stub
		return timingControlMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateTiming(Integer timingControl) {
		// TODO Auto-generated method stub
		return timingControlMapper.updateTiming(timingControl);
	}
}
