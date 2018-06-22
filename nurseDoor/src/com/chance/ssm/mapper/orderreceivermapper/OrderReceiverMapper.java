package com.chance.ssm.mapper.orderreceivermapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderReceiverExample;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;

public interface OrderReceiverMapper {
    int countByExample(OrderReceiverExample example);

    //删除记录
    int deleteByExample(OrderReceiverExample example);

    int insert(OrderReceiver record);

    //接取订单
    int insertSelectiveForOrderReceiver(OrderReceiver record);
    
    //根据订单id和护士id修改接单状态
    int updateOrderReceiverState(OrderReceiver record);

    List<OrderReceiver> selectByExample(OrderReceiverExample example);

    int updateByExampleSelective(@Param("record") OrderReceiver record, @Param("example") OrderReceiverExample example);

    int updateByExample(@Param("record") OrderReceiver record, @Param("example") OrderReceiverExample example);

    // 我接取的订单(进行，已完成..)
    List<OrderReceiverAndOrderVO> SelectOrderStateAccess(String orderNurseid);
    
    //查询不同接单状态的订单
    List<OrderReceiverAndOrderVO> selectByExampleBystate(OrderReceiverExample example);
    
  //查询不同接单状态的订单2
    List<OrderReceiverAndOrderVO> selectByExampleBystate2(OrderSendExample example);
    
   //护士端根据id获取订单详情
    OrderReceiverAndOrderVO selectStateNurseOrderInfoByid(String orderOrdersendid);
    
    //判断护士完成的是不是首单 
    OrderReceiver selectOrderIsNotFirstOrder(String orderNurseid);
    
    //查询护士正在进行中的订单数量
    int selectOrderSendIngNumber(String orderNurseid);
    
    /**查询订单年份范围*/
    List<String> selectOrderTimeRange();
    
    //查询护士订单完成数
    int selectNurseOrderNumber(String nurseId);
}