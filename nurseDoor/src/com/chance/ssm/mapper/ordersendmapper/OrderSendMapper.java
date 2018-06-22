package com.chance.ssm.mapper.ordersendmapper;

import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.vo.OrderKeyWordVO;
import com.chance.ssm.po.vo.OrderSendVO;
import com.chance.ssm.po.vo.OrderStatisVO;
import com.chance.ssm.po.vo.UserAndOrderSend;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.apache.ibatis.annotations.Param;

public interface OrderSendMapper {
    int countByExample(OrderSendExample example);

    //删除订单
    int deleteByExample(OrderSendExample example);

    int insert(OrderSend record);

    //订单插入
    int insertSelective(OrderSend record);

    //可以接取的订单(全发)(算入排班表)
    List<OrderSend> selectCanAccess(Date minTime,Date maxtime);
    		//,Date shopTime);

    //所有可以接取的订单
    List<OrderSend> selectCanAccessAllOrder();
    
    //通过订单id查询订单信息
    OrderSend selectOrderSendInfoById(String orderSendId);
    
    //拓展类通过订单id查询订单信息
    OrderInfoByNurse  selectOrderSendInfoByIdVo(String orderSendId);
    //通过订单id修改订单信息
    int updateByOrderSendId(OrderSend orderSend);

    //专属订单
    List<OrderSend>selectSpecialOrderInfo(String orderSendSpecialNurseid);
    		//Date shopTime);

    List<OrderSend> selectByExample(OrderSendExample example);

    int updateByExampleSelective(@Param("record") OrderSend record, @Param("example") OrderSendExample example);

    int updateByExample(@Param("record") OrderSend record, @Param("example") OrderSendExample example);

    //通过用户id查询订单详情
    List<OrderInfoByNurse> selectOrderSendInfoByUserId(String orderSendUserid);
    
    //通过订单id查询订单信息 和拓展的护士信息
    UserAndOrderSend selectOrderSendInfoByIdByMap(String orderSendId);

    //统计护士每个服务项服务的次数
    List<OrderSendVO> countNurseProjectNumber(String orderNurseid);
    
    //*******************后台接口****************//
    //正在发布的订单
    List<UserAndOrderSend>selectAllOrderNow(Map<String,Integer> params);
    //所有订单
    List<UserAndOrderSend> selectAllorderInfo(Map<String,Integer> params);
    //待预约
    List<UserAndOrderSend> selectAllOrderWait(Map<String,Integer> params);
    //进行中
    List<UserAndOrderSend> selectAllOrderHaving(Map<String,Integer> params);
    //已完成
    List<UserAndOrderSend> selectAllOrderSuccessed(Map<String,Integer> params);
    //被取消(用户同意的)
    List<UserAndOrderSend> selectAllOrderError(Map<String,Integer> params);
    
    //被取消 (用户不同意的)
    List<UserAndOrderSend>  selectAllOrderErrorUserNotAgree(Map<String,Integer> params);
    
    //得到所有未评价但是已完成的订单的用户和护士信息
    List<UserAndOrderSend>selectOrderSendInfoButNotEvaluate(Map<String,Integer> params);
    
    //查询订单已完成已评价但是未返利的订单
    List<UserAndOrderSend>selectOrderSentNotRebate(Map<String,Integer> params);
    
    //查询等待客服确认的订单
    List<UserAndOrderSend> selectOrderSendWaitServiceSure(Map<String,Integer> params);
    
    //查询所有等待客服确认的订单(每次处理50条) 
    List<UserAndOrderSend> selectOrderSendWaitServiceSureAllInfo();
    
    //已退款的订单
    List<UserAndOrderSend> selectAllOrderErrorUserHasRefund(Map<String,Integer> params);
    
    //被取消的订单（已退款）订单数量
    int selectAllOrderErrorUserHasRefundCount();
    
    //查询等待客服确认的订单数量
    int selectCountOrderSendWaitServiceSure();
    
    //查询订单已完成已评价但是未返利的订单数量
    int selectCountOrderSentNotRebate();
    
    //查询所有订单数量
    int selectCountAllOrderInfo();
    
    //正发布
    int selectCountAllOrderInfoNow();
    
    //待预约
    int selectCountAllOrderInfoWait();
    
    //进行中
    int selectCountAllOrderInfoHaving();
    
    //已完成
    int selectCountAllOrderInfoSuccessed();
    
    //被取消
    int selectCountAllOrderInfoError();
    
    //得到所有未评价但是已完成的订单的数量
    int selectCountOrderSendInfoButNotEvaluate();
    
    //根据时间范围，订单单号，发布人账号查找订单@Param("logminTime")Date logminTime,@Param("logmaxTime")Date logmaxTime,
    List<UserAndOrderSend> selectKeyWordByOrderInfo(String _parameter);
    
    
    //根据时间范围，订单单号，发布人账号查找订单new
    List<UserAndOrderSend> selectKeyWordByOrderInfo2(OrderKeyWordVO keyWordVO);
    
    /**根据年份查询每月订单数量*/
    List<OrderStatisVO> selectOrderCountOnMonth(String year);
    
    /**根据年份查询每月订单金额*/
    List<OrderStatisVO> selectOrderPriceOnMonth(String year);
    
    /**根据年份和月份查询每日订单数量*/
    List<OrderStatisVO> selectOrderCountDetailByDay(String year);
    
    /**根据年份月份查询每日订单金额*/
    List<OrderStatisVO> selectOrderPriceDetailByDay(String year);
    
    //查询我的所有订单(如果被接取查询护士的信息)
    List<OrderInfoByNurse> seleteUserHostoryOrder(String orderSendUserid);
    
    //根据用户ID查询未处理的取消订单
    List<OrderSend> selectOrderInfoOfNotHandleBecancel(String orderSendUserid);
    
    //当月已完成的订单
    List<OrderSend> selectStatisticsOrderSuccessMonth();
    
    //当年已完成的订单
    List<OrderSend> selectStatisticsOrderSuccessYear();
    
    //根据订单单号查询订单信息
    OrderSend selectOrderInfoByOrderNumber(String orderSendNumber);
    
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