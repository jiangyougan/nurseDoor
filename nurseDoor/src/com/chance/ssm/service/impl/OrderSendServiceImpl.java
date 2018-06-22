package com.chance.ssm.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.ordersendmapper.OrderSendMapper;
import com.chance.ssm.mapper.ordersendspecialmapper.OrderSendSpecialMapper;
import com.chance.ssm.mapper.savemapper.SaveMapper;
import com.chance.ssm.mapper.switchmapper.SwitchMapper;
import com.chance.ssm.mapper.trafficmapper.TrafficMapper;
import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.OrderSendSpecial;
import com.chance.ssm.po.Save;
import com.chance.ssm.po.Switch;
import com.chance.ssm.po.SwitchExample;
import com.chance.ssm.po.Traffic;
import com.chance.ssm.po.vo.OrderKeyWordVO;
import com.chance.ssm.po.vo.OrderSendVO;
import com.chance.ssm.po.vo.OrderStatisVO;
import com.chance.ssm.po.vo.UserAndOrderSend;
import com.chance.ssm.service.OrderSendService;

public class OrderSendServiceImpl implements OrderSendService{

	@Autowired
	private OrderSendMapper orderSendMapper;
	
	@Autowired
	private TrafficMapper trafficMapper;
	
	@Autowired
	private OrderSendSpecialMapper orderSendSpecialMapper;
	
	@Autowired
	private SaveMapper saveMapper;
	
	@Autowired
	private SwitchMapper switchMapper;
	
	@Override
	public Traffic SelectTrafficInfo() throws Exception {
		
		return trafficMapper.SelectTrafficInfo();
	}
	@Override
	public Save selectSaveInfo() throws Exception {
		
		return saveMapper.selectSaveInfo();
	}
	@Override
	public int insertSelective(OrderSend record) throws Exception {
		
		return orderSendMapper.insertSelective(record);
	}
	@Override
	public int insertSelectiveSpecial(OrderSendSpecial record) throws Exception {
		
		return orderSendSpecialMapper.insertSelectiveSpecial(record);
	}
	@Override
	public List<OrderSend> selectCanAccess(Date minTime,Date maxtime) throws Exception {//,Date shopTime
		
		return orderSendMapper.selectCanAccess(minTime,maxtime);
				//,shopTime);
	}
	@Override
	public List<OrderSend> selectSpecialOrderInfo(String orderSendSpecialNurseid)
			//Date shopTime)
			throws Exception {
		
		return orderSendMapper.selectSpecialOrderInfo(orderSendSpecialNurseid);
				//,shopTime);
	}
	@Override
	public OrderSend selectOrderSendInfoById(String orderSendId)
			throws Exception {
		
		return orderSendMapper.selectOrderSendInfoById(orderSendId);
	}
	@Override
	public int updateByOrderSendId(OrderSend orderSend) throws Exception {
		
		return orderSendMapper.updateByOrderSendId(orderSend);
	}
	@Override
	public List<OrderInfoByNurse> selectOrderSendInfoByUserId(String orderSendUserid)
			throws Exception {
		
		return orderSendMapper.selectOrderSendInfoByUserId(orderSendUserid);
	}
	@Override
	public List<OrderSendVO> countNurseProjectNumber(String orderNurseid)
			throws Exception {
		
		return orderSendMapper.countNurseProjectNumber(orderNurseid);
	}
	@Override
	public List<UserAndOrderSend> selectAllOrderNow(Map<String,Integer> params) throws Exception {
		
		return orderSendMapper.selectAllOrderNow(params);
	}
	@Override
	public List<UserAndOrderSend> selectAllorderInfo(Map<String,Integer> params) throws Exception {
		
		return orderSendMapper.selectAllorderInfo(params);
	}
	@Override
	public List<UserAndOrderSend> selectKeyWordByOrderInfo(
			String number) throws Exception {
		
		return orderSendMapper.selectKeyWordByOrderInfo(number);
	}
	@Override
	public OrderInfoByNurse selectOrderSendInfoByIdVo(String orderSendId)
			throws Exception {
		
		return orderSendMapper.selectOrderSendInfoByIdVo(orderSendId);
	}
	@Override
	public UserAndOrderSend selectOrderSendInfoByIdByMap(String orderSendId) {
		
		return orderSendMapper.selectOrderSendInfoByIdByMap(orderSendId);
	}
	@Override
	public List<OrderStatisVO> selectOrderCountOnMonth(String year)
			throws Exception {
		
		return orderSendMapper.selectOrderCountOnMonth(year);
	}
	@Override
	public List<OrderStatisVO> selectOrderPriceOnMonth(String year)
			throws Exception {
		
		return orderSendMapper.selectOrderPriceOnMonth(year);
	}
	@Override
	public List<OrderStatisVO> selectOrderCountDetailByDay(String year)
			throws Exception {
		
		return orderSendMapper.selectOrderCountDetailByDay(year);
	}
	@Override
	public List<OrderStatisVO> selectOrderPriceDetailByDay(String year)
			throws Exception {
		
		return orderSendMapper.selectOrderPriceDetailByDay(year);
	}
	@Override
	public int deleteByExample(OrderSendExample example) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.deleteByExample(example);
	}
	@Override
	public List<OrderInfoByNurse> seleteUserHostoryOrder(String orderSendUserid)
			throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.seleteUserHostoryOrder(orderSendUserid);
	}
	@Override
	public List<UserAndOrderSend> selectAllOrderWait(Map<String,Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectAllOrderWait(params);
	}
	@Override
	public List<UserAndOrderSend> selectAllOrderHaving(Map<String,Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectAllOrderHaving(params);
	}
	@Override
	public List<UserAndOrderSend> selectAllOrderSuccessed(Map<String,Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectAllOrderSuccessed(params);
	}
	@Override
	public List<UserAndOrderSend> selectAllOrderError(Map<String,Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectAllOrderError(params);
	}
	@Override
	public int selectCountAllOrderInfo() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountAllOrderInfo();
	}
	@Override
	public int selectCountAllOrderInfoNow() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountAllOrderInfoNow();
	}
	@Override
	public int selectCountAllOrderInfoWait() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountAllOrderInfoWait();
	}
	@Override
	public int selectCountAllOrderInfoHaving() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountAllOrderInfoHaving();
	}
	@Override
	public int selectCountAllOrderInfoSuccessed() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountAllOrderInfoSuccessed();
	}
	@Override
	public int selectCountAllOrderInfoError() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountAllOrderInfoSuccessed();
	}
	@Override
	public List<UserAndOrderSend> selectOrderSendInfoButNotEvaluate(Map<String,Integer> params)
			throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderSendInfoButNotEvaluate(params);
	}
	@Override
	public int selectCountOrderSendInfoButNotEvaluate() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountOrderSendInfoButNotEvaluate();
	}
	@Override
	public List<UserAndOrderSend> selectOrderSentNotRebate(
			Map<String, Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderSentNotRebate(params);
	}
	@Override
	public int selectCountOrderSentNotRebate() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountOrderSentNotRebate();
	}
	@Override
	public List<OrderSend> selectCanAccessAllOrder() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCanAccessAllOrder();
	}
	@Override
	public List<UserAndOrderSend> selectOrderSendWaitServiceSure(
			Map<String, Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderSendWaitServiceSure(params);
	}
	@Override
	public int selectCountOrderSendWaitServiceSure() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectCountOrderSendWaitServiceSure();
	}
	@Override
	public List<UserAndOrderSend> selectOrderSendWaitServiceSureAllInfo()
			throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderSendWaitServiceSureAllInfo();
	}
	@Override
	public int updateByExampleSelectiveSwitch(Switch record,
			SwitchExample example) throws Exception {
		// TODO Auto-generated method stub
		return switchMapper.updateByExampleSelectiveSwitch(record, example);
	}
	@Override
	public Switch selectSwhtchState() throws Exception {
		// TODO Auto-generated method stub
		return switchMapper.selectSwhtchState();
	}
	@Override
	public List<OrderSend> selectOrderInfoOfNotHandleBecancel(
			String orderSendUserid) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderInfoOfNotHandleBecancel(orderSendUserid);
	}
	@Override
	public List<UserAndOrderSend> selectKeyWordByOrderInfo2(
			OrderKeyWordVO keyWordVO) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectKeyWordByOrderInfo2(keyWordVO);
	}
	@Override
	public List<UserAndOrderSend> selectAllOrderErrorUserNotAgree(
			Map<String, Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectAllOrderErrorUserNotAgree(params);
	}
	@Override
	public List<OrderSend> selectStatisticsOrderSuccessMonth() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectStatisticsOrderSuccessMonth();
	}
	@Override
	public List<OrderSend> selectStatisticsOrderSuccessYear() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectStatisticsOrderSuccessYear();
	}
	@Override
	public List<UserAndOrderSend> selectAllOrderErrorUserHasRefund(
			Map<String, Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectAllOrderErrorUserHasRefund(params);
	}
	@Override
	public int selectAllOrderErrorUserHasRefundCount() throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectAllOrderErrorUserHasRefundCount();
	}
	@Override
	public OrderSend selectOrderInfoByOrderNumber(String orderSendNumber)
			throws Exception {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderInfoByOrderNumber(orderSendNumber);
	}
	@Override
	public List<OrderSend> selectOrderInfoByOrderHavingMonth() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderInfoByOrderHavingMonth();
	}
	@Override
	public List<OrderSend> selectOrderInfoByOrderHavingYear() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderInfoByOrderHavingYear();
	}
	@Override
	public List<OrderSend> selectOrderInfoByOrderCancleMonth() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderInfoByOrderCancleMonth();
	}
	@Override
	public List<OrderSend> selectOrderInfoByOrderCancleYear() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderInfoByOrderCancleYear();
	}
	@Override
	public List<OrderSend> selectOrderMoneyStatisticsMonth() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderMoneyStatisticsMonth();
	}
	@Override
	public String selectOrderAverageCustomerPrice() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderAverageCustomerPrice();
	}
	@Override
	public List<OrderSend> selectOrderMoneyStatisticsToDay() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderMoneyStatisticsToDay();
	}
	@Override
	public int selectUserSendOrderAllCount(String userId) {
		// TODO Auto-generated method stub
		return orderSendMapper.selectUserSendOrderAllCount(userId);
	}
	@Override
	public List<UserAndOrderSend> selectOrderSendInfoButNotEvaluateSevenDay() {
		// TODO Auto-generated method stub
		return orderSendMapper.selectOrderSendInfoButNotEvaluateSevenDay();
	}

}
