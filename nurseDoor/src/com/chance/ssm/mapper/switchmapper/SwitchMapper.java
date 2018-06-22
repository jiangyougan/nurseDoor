package com.chance.ssm.mapper.switchmapper;

import com.chance.ssm.po.Switch;
import com.chance.ssm.po.SwitchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwitchMapper {
    int countByExample(SwitchExample example);

    int deleteByExample(SwitchExample example);

    int insert(Switch record);

    int insertSelective(Switch record);

    List<Switch> selectByExample(SwitchExample example);

    
    //修改订单需不需要客服手动分发
    int updateByExampleSelectiveSwitch(@Param("record") Switch record, @Param("example") SwitchExample example);

    int updateByExample(@Param("record") Switch record, @Param("example") SwitchExample example);
    
    //查询开关状态
    Switch  selectSwhtchState();
    
}