package com.chance.ssm.mapper.trafficmapper;

import com.chance.ssm.po.Traffic;
import com.chance.ssm.po.TrafficExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrafficMapper {
    int countByExample(TrafficExample example);

    int deleteByExample(TrafficExample example);

    int insert(Traffic record);

    //添加交通费信息
    int insertSelective(Traffic record);

    List<Traffic> selectByExample(TrafficExample example);

    //修改交通信息费用
    int updateByExampleSelective(@Param("record") Traffic record, @Param("example") TrafficExample example);

    int updateByExample(@Param("record") Traffic record, @Param("example") TrafficExample example);
    
    Traffic SelectTrafficInfo();
}