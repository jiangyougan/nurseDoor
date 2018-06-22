package com.chance.ssm.mapper.rechargemapper;

import com.chance.ssm.po.Recharge;
import com.chance.ssm.po.RechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeMapper {
    int countByExample(RechargeExample example);

    int deleteByExample(RechargeExample example);

    int deleteByPrimaryKey(String rechargeId);

    int insert(Recharge record);

    //添加充值记录
    int insertSelective(Recharge record);

    List<Recharge> selectByExample(RechargeExample example);

    //根据订单id查询充值信息
    Recharge selectByPrimaryKey(String rechargeId);

    int updateByExampleSelective(@Param("record") Recharge record, @Param("example") RechargeExample example);

    int updateByExample(@Param("record") Recharge record, @Param("example") RechargeExample example);

    //更新充值记录
    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);
}