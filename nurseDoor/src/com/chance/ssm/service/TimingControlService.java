package com.chance.ssm.service;


import com.chance.ssm.po.TimingControl;
import com.chance.ssm.po.TimingControlExample;

public interface TimingControlService {

	//查询发布的订单标记时间
    TimingControl selectTimingControl();
    
    //添加查看客服待处理订单时间控制
    int insertSelective(TimingControl record);
    
    //修改客服待处理订单时间控制
    int updateByExampleSelective(TimingControl record,TimingControlExample example);
    
    //修改客服待处理订单时间控制
    int updateTiming(Integer timingControl);
}
