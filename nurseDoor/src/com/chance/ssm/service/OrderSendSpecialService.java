package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.OrderSendSpecial;
import com.chance.ssm.po.OrderSendSpecialExample;

public interface OrderSendSpecialService {
	public List<OrderSendSpecial> selectByExample(OrderSendSpecialExample example)throws Exception;

	//根据订单ID查询护士ID 
	public List<OrderSendSpecial> selectNurseIdByOrderIdforSpecial(String orderSendSpecialId)throws Exception;
}
