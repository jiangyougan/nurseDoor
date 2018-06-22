package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.ordersendspecialmapper.OrderSendSpecialMapper;
import com.chance.ssm.po.OrderSendSpecial;
import com.chance.ssm.po.OrderSendSpecialExample;
import com.chance.ssm.service.OrderSendSpecialService;

public class OrderSendSpecialServiceImpl implements OrderSendSpecialService {
	@Autowired
	private OrderSendSpecialMapper oSendSpecialMapper;

	@Override
	public List<OrderSendSpecial> selectByExample(
			OrderSendSpecialExample example) throws Exception {
		// TODO Auto-generated method stub
		return oSendSpecialMapper.selectByExample(example);
	}

	@Override
	public List<OrderSendSpecial> selectNurseIdByOrderIdforSpecial(
			String orderSendSpecialId) throws Exception {
		// TODO Auto-generated method stub
		return oSendSpecialMapper.selectNurseIdByOrderIdforSpecial(orderSendSpecialId);
	}
	
}
