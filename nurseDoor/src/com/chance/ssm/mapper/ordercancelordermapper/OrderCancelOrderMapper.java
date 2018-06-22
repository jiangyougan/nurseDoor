package com.chance.ssm.mapper.ordercancelordermapper;

import com.chance.ssm.po.NurseNofreeShift;
import com.chance.ssm.po.OrderCancelOrder;
import com.chance.ssm.po.OrderCancelOrderExample;
import com.chance.ssm.po.vo.OrderSendCancalVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCancelOrderMapper {
    int countByExample(OrderCancelOrderExample example);

    int deleteByExample(OrderCancelOrderExample example);

    //根据订单ID删除记录
    int deleteByPrimaryKey(String orderCancelOrderSendId);

    int insert(OrderCancelOrder record);

    //取消订单
    int insertSelective(OrderCancelOrder record);

    List<OrderCancelOrder> selectByExample(OrderCancelOrderExample example);

    //查询被取消的订单
    OrderCancelOrder selectByPrimaryKey(String orderCancelOrderSendId);

    int updateByExampleSelective(@Param("record") OrderCancelOrder record, @Param("example") OrderCancelOrderExample example);

    int updateByExample(@Param("record") OrderCancelOrder record, @Param("example") OrderCancelOrderExample example);

    //同意或取消订单
    int updateByPrimaryKeySelective(OrderCancelOrder record);

    int updateByPrimaryKey(OrderCancelOrder record);
    
    //根据取消的订单ID查询取消前的状态
    OrderCancelOrder selectCancalBeforeState(String orderSendId);
    
    //查询取消订单的信息
    OrderSendCancalVo selectOrderAndCancaByOrderId(String orderSendId);
}