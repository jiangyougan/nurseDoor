package com.chance.ssm.mapper.ordersendspecialmapper;

import com.chance.ssm.po.OrderSendSpecial;
import com.chance.ssm.po.OrderSendSpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSendSpecialMapper {
    int countByExample(OrderSendSpecialExample example);

    int deleteByExample(OrderSendSpecialExample example);

    int insert(OrderSendSpecial record);

    //插入
    int insertSelectiveSpecial(OrderSendSpecial record);

    List<OrderSendSpecial> selectByExample(OrderSendSpecialExample example);

    int updateByExampleSelective(@Param("record") OrderSendSpecial record, @Param("example") OrderSendSpecialExample example);

    int updateByExample(@Param("record") OrderSendSpecial record, @Param("example") OrderSendSpecialExample example);
    
    //根据订单ID查询护士ID 
    List<OrderSendSpecial> selectNurseIdByOrderIdforSpecial(String orderSendSpecialId);
}