package com.chance.ssm.service;

import java.util.List;
import java.util.Map;

import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderReceiverExample;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;

public interface OrderReceiverService {
	
	  //删除记录
	public int deleteByExample(OrderReceiverExample example)throws Exception;

	 //接取订单
    public int insertSelectiveForOrderReceiver(OrderReceiver record)throws Exception;
	
    //根据订单id和护士id修改接单状态
    public int updateOrderReceiverState(OrderReceiver record)throws Exception;
    
    //根据传入的条件统计数据
    public int countByExample(OrderReceiverExample example)throws Exception;
    
    public List<OrderReceiverAndOrderVO> SelectOrderStateAccess(String orderNurseid)throws Exception;
    
    public List<OrderReceiverAndOrderVO> selectByExampleBystate(OrderReceiverExample example)throws Exception;
    
  //护士端根据id获取订单详情
    public OrderReceiverAndOrderVO selectStateNurseOrderInfoByid(String orderOrdersendid)throws Exception;
    
  //查询不同接单状态的订单2
    public List<OrderReceiverAndOrderVO> selectByExampleBystate2(OrderSendExample example)throws Exception;
    
    public  List<OrderReceiver> selectByExample(OrderReceiverExample example)throws Exception;
    
    /**查询订单年份范围*/
    public List<String> selectOrderTimeRange() throws Exception;
    
    //判断护士完成的是不是首单 
    public OrderReceiver selectOrderIsNotFirstOrder(String orderNurseid)throws Exception;
    
    //查询护士正在进行中的订单数量
    int selectOrderSendIngNumber(String orderNurseid);
    
    //查询护士订单完成数
    int selectNurseOrderNumber(String nurseId);
}
