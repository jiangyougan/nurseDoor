package com.chance.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.ordercancelordermapper.OrderCancelOrderMapper;
import com.chance.ssm.po.NurseNofreeShift;
import com.chance.ssm.po.OrderCancelOrder;
import com.chance.ssm.po.vo.OrderSendCancalVo;
import com.chance.ssm.service.OrderCancelOrderService;

public class OrderCancelOrderServiceImpl implements OrderCancelOrderService{
	
	@Autowired
	private OrderCancelOrderMapper cancelOrderMapper;

	@Override
	public OrderCancelOrder selectByPrimaryKey(String orderCancelOrderSendId)
			throws Exception {
		// TODO Auto-generated method stub
		return cancelOrderMapper.selectByPrimaryKey(orderCancelOrderSendId);
	}

	@Override
	public int insertSelective(OrderCancelOrder record) throws Exception {
		// TODO Auto-generated method stub
		return cancelOrderMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderCancelOrder record)
			throws Exception {
		// TODO Auto-generated method stub
		return cancelOrderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public OrderCancelOrder selectCancalBeforeState(String orderSendId) {
		// TODO Auto-generated method stub
		return cancelOrderMapper.selectCancalBeforeState(orderSendId);
	}

	@Override
	public OrderSendCancalVo selectOrderAndCancaByOrderId(String orderSendId) {
		// TODO Auto-generated method stub
		return cancelOrderMapper.selectOrderAndCancaByOrderId(orderSendId);
	}

	@Override
	public int deleteByPrimaryKey(String orderCancelOrderSendId)
			throws Exception {
		// TODO Auto-generated method stub
		return cancelOrderMapper.deleteByPrimaryKey(orderCancelOrderSendId);
	}

}
