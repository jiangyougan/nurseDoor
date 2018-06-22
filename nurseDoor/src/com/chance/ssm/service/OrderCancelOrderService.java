package com.chance.ssm.service;

import com.chance.ssm.po.NurseNofreeShift;
import com.chance.ssm.po.OrderCancelOrder;
import com.chance.ssm.po.vo.OrderSendCancalVo;

public interface OrderCancelOrderService {

	//查询被取消的订单
    public OrderCancelOrder selectByPrimaryKey(String orderCancelOrderSendId)throws Exception;
    
    //取消订单
    public int insertSelective(OrderCancelOrder record)throws Exception;
    
    //同意或取消订单
    public int updateByPrimaryKeySelective(OrderCancelOrder record)throws Exception;
    
    //根据取消的订单ID查询取消前的状态
    public OrderCancelOrder selectCancalBeforeState(String orderSendId)throws Exception;
    
    //查询取消订单的信息
    public OrderSendCancalVo selectOrderAndCancaByOrderId(String orderSendId)throws Exception;
    
    //根据订单ID删除记录
    public int deleteByPrimaryKey(String orderCancelOrderSendId)throws Exception;
}
