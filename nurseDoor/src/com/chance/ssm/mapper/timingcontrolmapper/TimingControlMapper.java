package com.chance.ssm.mapper.timingcontrolmapper;

import com.chance.ssm.po.TimingControl;
import com.chance.ssm.po.TimingControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimingControlMapper {
    int countByExample(TimingControlExample example);

    int deleteByExample(TimingControlExample example);

    int insert(TimingControl record);

    //添加查看客服待处理订单时间控制
    int insertSelective(TimingControl record);

    List<TimingControl> selectByExample(TimingControlExample example);

    
    int updateByExampleSelective(@Param("record") TimingControl record, @Param("example") TimingControlExample example);

    int updateByExample(@Param("record") TimingControl record, @Param("example") TimingControlExample example);
    
    //修改客服待处理订单时间控制
    int updateTiming(Integer timingControl);
    
    //查询发布的订单标记时间
    TimingControl selectTimingControl();
}