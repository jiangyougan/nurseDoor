package com.chance.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.orderreceivermapper.OrderReceiverMapper;
import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderReceiverExample;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;
import com.chance.ssm.service.OrderReceiverService;

public class OrderReceiverServiceImpl implements OrderReceiverService{

	@Autowired
	private OrderReceiverMapper orderReceiverMapper;



	@Override
	public int insertSelectiveForOrderReceiver(OrderReceiver record)
			throws Exception {
		
		return orderReceiverMapper.insertSelectiveForOrderReceiver(record);
	}

	@Override
	public int updateOrderReceiverState(OrderReceiver record) throws Exception {
		
		return orderReceiverMapper.updateOrderReceiverState(record);
	}

	@Override
	public int countByExample(OrderReceiverExample example) throws Exception {
		
		return orderReceiverMapper.countByExample(example);
	}

	@Override
	public List<OrderReceiverAndOrderVO> selectByExampleBystate(
			OrderReceiverExample example) throws Exception {
		
		return orderReceiverMapper.selectByExampleBystate(example);
	}

	@Override
	public List<OrderReceiverAndOrderVO> SelectOrderStateAccess(
			String orderNurseid) throws Exception {
		
		return orderReceiverMapper.SelectOrderStateAccess(orderNurseid);
	}

	@Override
	public OrderReceiverAndOrderVO selectStateNurseOrderInfoByid(
			String orderOrdersendid) throws Exception {
		
		return orderReceiverMapper.selectStateNurseOrderInfoByid(orderOrdersendid);
	}

	@Override
	public List<OrderReceiverAndOrderVO> selectByExampleBystate2(
			OrderSendExample example) throws Exception {
		
		return orderReceiverMapper.selectByExampleBystate2(example);
	}

	@Override
	public List<OrderReceiver> selectByExample(OrderReceiverExample example)
			throws Exception {
		
		return orderReceiverMapper.selectByExample(example);
	}

	@Override
	public List<String> selectOrderTimeRange() throws Exception {
		
		return orderReceiverMapper.selectOrderTimeRange();
	}

	@Override
	public OrderReceiver selectOrderIsNotFirstOrder(String orderNurseid)
			throws Exception {
		// TODO Auto-generated method stub
		return orderReceiverMapper.selectOrderIsNotFirstOrder(orderNurseid);
	}

	@Override
	public int selectOrderSendIngNumber(String orderNurseid) {
		// TODO Auto-generated method stub
		return orderReceiverMapper.selectOrderSendIngNumber(orderNurseid);
	}

	@Override
	public int deleteByExample(OrderReceiverExample example) throws Exception {
		// TODO Auto-generated method stub
		return orderReceiverMapper.deleteByExample(example);
	}

	@Override
	public int selectNurseOrderNumber(String nurseId) {
		// TODO Auto-generated method stub
		return orderReceiverMapper.selectNurseOrderNumber(nurseId);
	}


}
