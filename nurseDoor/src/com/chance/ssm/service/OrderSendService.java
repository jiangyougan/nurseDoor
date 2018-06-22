package com.chance.ssm.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

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

public interface OrderSendService {

	// 交通费
	public Traffic SelectTrafficInfo() throws Exception;

	// 保险费
	public Save selectSaveInfo() throws Exception;

	// 订单插入
	public int insertSelective(OrderSend record) throws Exception;

	// 插入订单专属表
	public int insertSelectiveSpecial(OrderSendSpecial record) throws Exception;

	// 可以接取的订单(全发)
	public List<OrderSend> selectCanAccess(Date minTime,Date maxtime)
			//, Date shopTime)
			throws Exception;
	
	 //所有可以接取的订单
	public  List<OrderSend> selectCanAccessAllOrder()throws Exception;

	// 可以接取的订单(专属)
	public List<OrderSend> selectSpecialOrderInfo(
			String orderSendSpecialNurseid)
//			, Date shopTime)
			throws Exception;

	// 通过订单id查询订单信息
	public OrderSend selectOrderSendInfoById(String orderSendId)
			throws Exception;


	//拓展类通过订单id查询订单信息
	public  OrderInfoByNurse  selectOrderSendInfoByIdVo(String orderSendId)throws Exception;
	
	// 通过订单id修改订单信息
	public int updateByOrderSendId(OrderSend orderSend) throws Exception;

	// 通过用户id查询订单详情
	public List<OrderInfoByNurse> selectOrderSendInfoByUserId(
			String orderSendUserid) throws Exception;

	// 统计护士每个服务项服务的次数
	public List<OrderSendVO> countNurseProjectNumber(String orderNurseid)
			throws Exception;
	//删除订单
	public int deleteByExample(OrderSendExample example)throws Exception;
	 //*******************后台接口*******************************//
    //正在发布的订单
	public List<UserAndOrderSend>selectAllOrderNow(Map<String,Integer> params)throws Exception;
	
	//所有订单
	public List<UserAndOrderSend> selectAllorderInfo(Map<String,Integer> params)throws Exception;
	
	//待预约
	public  List<UserAndOrderSend> selectAllOrderWait(Map<String,Integer> params)throws Exception;
    //进行中
	public List<UserAndOrderSend> selectAllOrderHaving(Map<String,Integer> params)throws Exception;
    //已完成
	public List<UserAndOrderSend> selectAllOrderSuccessed(Map<String,Integer> params)throws Exception;
    //被取消(用户同意的)
	public List<UserAndOrderSend> selectAllOrderError(Map<String,Integer> params)throws Exception;
	
	//被取消 (用户不同意的)
	public List<UserAndOrderSend>  selectAllOrderErrorUserNotAgree(Map<String,Integer> params)throws Exception;
	
	//得到所有未评价但是已完成的订单的用户和护士信息
	public List<UserAndOrderSend>selectOrderSendInfoButNotEvaluate(Map<String,Integer> params)throws Exception;
	
	//查询订单已完成已评价但是未返利的订单
	public List<UserAndOrderSend>selectOrderSentNotRebate(Map<String,Integer> params)throws Exception;
	
	//查询等待客服确认的订单
	public List<UserAndOrderSend> selectOrderSendWaitServiceSure(Map<String,Integer> params)throws Exception;
	
	 //查询所有等待客服确认的订单(每次处理50条) 
	public List<UserAndOrderSend> selectOrderSendWaitServiceSureAllInfo()throws Exception;
	
	 //已退款的订单
	public List<UserAndOrderSend> selectAllOrderErrorUserHasRefund(Map<String,Integer> params)throws Exception;
    
    //被取消的订单（已退款）订单数量
	public int selectAllOrderErrorUserHasRefundCount()throws Exception;
    
    //查询等待客服确认的订单数量
	public int selectCountOrderSendWaitServiceSure()throws Exception;
	
	//查询订单已完成已评价但是未返利的订单数量
	public int selectCountOrderSentNotRebate()throws Exception;
	
	//查询所有订单数量
	public int selectCountAllOrderInfo()throws Exception;
	
    //正发布
	public int selectCountAllOrderInfoNow()throws Exception;
    
    //待预约
	public  int selectCountAllOrderInfoWait()throws Exception;
    
    //进行中
	public int selectCountAllOrderInfoHaving()throws Exception;
    
    //已完成
	public int selectCountAllOrderInfoSuccessed()throws Exception;
    
    //被取消
	public int selectCountAllOrderInfoError()throws Exception;
	
	 //得到所有未评价但是已完成的订单的数量
	public int selectCountOrderSendInfoButNotEvaluate()throws Exception;
	
	
	//通过订单id查询订单信息 和拓展的护士信息
	public UserAndOrderSend selectOrderSendInfoByIdByMap(String orderSendId)throws Exception;
	
	 //根据时间范围，订单单号，发布人账号查找订单
	public List<UserAndOrderSend> selectKeyWordByOrderInfo(String number)throws Exception;
	
	/**根据年份查询每月订单数量*/
	public List<OrderStatisVO> selectOrderCountOnMonth(String year)throws Exception;
    
    /**根据年份查询每月订单金额*/
	public List<OrderStatisVO> selectOrderPriceOnMonth(String year)throws Exception;
	
	/**根据年份和月份查询每日订单数量*/
	public List<OrderStatisVO> selectOrderCountDetailByDay(String year) throws Exception;
    
    /**根据年份月份查询每日订单金额*/
	public List<OrderStatisVO> selectOrderPriceDetailByDay(String year) throws Exception;
	
	//查询我的所有订单(如果被接取查询护士的信息)
	public List<OrderInfoByNurse> seleteUserHostoryOrder(String orderSendUserid) throws Exception;
	
	 //修改订单需不需要客服手动分发
	public int updateByExampleSelectiveSwitch(@Param("record") Switch record, @Param("example") SwitchExample example)throws Exception;
	
	 //查询开关状态
	public Switch  selectSwhtchState()throws Exception;

	 //根据用户ID查询未处理的取消订单
	public List<OrderSend> selectOrderInfoOfNotHandleBecancel(String orderSendUserid)throws Exception;
	
	//根据时间范围，订单单号，发布人账号查找订单new
	public List<UserAndOrderSend> selectKeyWordByOrderInfo2(OrderKeyWordVO keyWordVO)throws Exception;
	
	 //当月已完成的订单
	public List<OrderSend> selectStatisticsOrderSuccessMonth()throws Exception;
    
    //当年已完成的订单
	public List<OrderSend> selectStatisticsOrderSuccessYear()throws Exception;
	
	 //根据订单单号查询订单信息
	public  OrderSend selectOrderInfoByOrderNumber(String orderSendNumber)throws Exception;
	
	List<OrderSend> selectOrderInfoByOrderHavingMonth();
	    
	List<OrderSend> selectOrderInfoByOrderHavingYear();
	
	List<OrderSend>selectOrderInfoByOrderCancleMonth();
	   
	List<OrderSend>selectOrderInfoByOrderCancleYear();
	 
	List<OrderSend> selectOrderMoneyStatisticsMonth();
	
	  //平均客单价
    String selectOrderAverageCustomerPrice();
    
    //当日成交额
    List<OrderSend> selectOrderMoneyStatisticsToDay();
    
    //查询用户发的总订单数
    int selectUserSendOrderAllCount(String userId);
    
    //7天前未评价的订单
    List<UserAndOrderSend> selectOrderSendInfoButNotEvaluateSevenDay();
}
