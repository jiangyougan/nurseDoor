package com.chance.ssm.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.CustomerServicePhoneExample;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseEvaluate;
import com.chance.ssm.po.OrderCancelOrder;
import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderReceiverExample;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.OrderSendExample.Criteria;
import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.Statistics;
import com.chance.ssm.po.User;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.NurseNoFreeVo;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;
import com.chance.ssm.po.vo.OrderSendCancalVo;
import com.chance.ssm.service.CustomerServicePhoneService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NurseEvaluateService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderCancelOrderService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.ProtectedAddressService;
import com.chance.ssm.service.ProtectedPersonService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.StatisticsService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.DateUtil;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushPeo;
/**
 * 接订单控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/orderReceiver")
public class OrderReceiverController {

	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private OrderReceiverService orderReceiverService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	@Autowired
	private StatisticsService statisticsService;
	
	@Autowired
	private ProtectedPersonService protectedPersonService;
	
	@Autowired
	private ProtectedAddressService protectedAddressService;
	
	@Autowired
	private NurseEvaluateService nurseEvaluateService;
	
	@Autowired
	private OrderCancelOrderService orderCancelOrderService;
	
	@Autowired
	private CustomerServicePhoneService customerServicePhoneService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	//用户端
	private static final String appKey ="8121db7759363542b25159b8";
	private static final String masterSecret = "c20fa080107794c1337065f9";
	
	private String userId="";
	
	//用户账号(手机号)
	private String userPhone = "";
	
	//查询能接取的订单(根据我的排班表)
	@RequestMapping(value="/orderLookReceiver",method=RequestMethod.POST)
	public @ResponseBody NetState orderLookReceiver(HttpServletRequest request,String nurseId,Integer pageNum
			)throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time  = sdf.parse(sdf.format(400000)); //日期格式
		NetState netState = new NetState();
		if("".equals(nurseId)|| nurseId==null){
			netState.setData("参数1错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}else if("".equals(pageNum) || pageNum==null){
			netState.setData("参数2错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		String newcontentid ="";
		String goodsName = "";
		//String newgoosName = "";
		Goods goods = null;
		//得到详细地址描述
		String addressString = "";
		//得到受护人id
		String orderSendUserName = "";
		//通过受护id查询经纬度
		Double addressPositionX = null;
		Double addressPositionY = null;
		//服务产品信息
		String[] contentid =null;
		//二级服务名
		String contentname="";
		
		//得到受护人的名字、性别可年龄
		String neworderSendUserName = "";
		
		ManageNursingContent manageNursingContent = new ManageNursingContent();
		
		ProtectedPerson protectedPerson = new ProtectedPerson();
		
		ProtectedAddress protectedAddress = new ProtectedAddress();
		//新建专属单list
		List<OrderSend> spelist = new ArrayList<OrderSend>();
		//新建所有订单list
		List<OrderSend> ordlist = new ArrayList<OrderSend>();
		//总list
		List<OrderSend> newlist = new ArrayList<OrderSend>();
		//获取护士的空闲时间
		List<NurseNoFreeVo> freelist = nurseService.selectNurseFreeInfo(nurseId);
		if(freelist==null || "".equals(freelist) || freelist.size()==0){
			//判断有没有我的专属单
			spelist = orderSendService.selectSpecialOrderInfo(nurseId);
			//获取所有可接订单
			ordlist = orderSendService.selectCanAccessAllOrder();
			//变成一个list
			newlist.addAll(spelist);
			newlist.addAll(ordlist);
			int size = newlist.size();
			
			for(int i=0;i<size;i++){
				//根据用户ID得到用户的昵称和手机号
				User user = userService.selectForUserByID(newlist.get(i).getOrderSendUserid());
				if(user == null || "".equals(user)){
					continue;
				}
				newlist.get(i).setUserNickNew(user.getUserNick());
				newlist.get(i).setUserNameNew(user.getUserPhone());
				String newgoosName="";
				contentid= newlist.get(i).getOrderSendServicecontent().split(",");
				for(int c =0; c<contentid.length;c++){
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						contentname = manageNursingContent.getManageNursingContentName();
    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
    					newlist.get(i).setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						newlist.get(i).setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
				orderSendUserName = newlist.get(i).getOrderSendUsername();
				if(orderSendUserName!=null && !"".equals(orderSendUserName)){
					//通过受护人id得到受护人信息
					protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserName);
					if(protectedPerson == null || "".equals(protectedPerson)){
						newlist.get(i).setOrderSendUsername("没有该受护人信息");
					}else{
						//得到受护人的名字、性别可年龄、关系、身高、体重 /2017.3.13新增 详细地址 detailedAddress
						neworderSendUserName = orderSendUserName+","+protectedPerson.getProtectedPersonName();
						newlist.get(i).setOrderSendUsername(neworderSendUserName);
						newlist.get(i).setOrderSendSex(protectedPerson.getProtectedPersonSex());
						newlist.get(i).setOrderSendAge(protectedPerson.getProtectedPersonAge());
						newlist.get(i).setProtectedPersonNexus(protectedPerson.getProtectedPersonNexus());
						newlist.get(i).setProtectedPersonHeight(protectedPerson.getProtectedPersonHeight());
						newlist.get(i).setProtectedPersonWeight(protectedPerson.getProtectedPersonWeight());
						//详细地址
						newlist.get(i).setDetailedAddress(protectedPerson.getProtectedPersonOverone());
						//通过受护人地址id得到受护人地址信息
						protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
						if(protectedAddress==null || "".equals(protectedAddress)){
							newlist.get(i).setOrderSendAddree("经纬度为空");
						}else{
							addressString = protectedAddress.getProtectedAddressAddress();
							//通过受护id查询经纬度
							addressPositionX = protectedAddress.getProtectedAddressPositionX();
							addressPositionY = protectedAddress.getProtectedAddressPositionY();
							newlist.get(i).setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
						}
					}
				}else{
					newlist.get(i).setOrderSendUsername("受护人信息为空");
				}
			}
		}else{
			int freesize = freelist.size();
			SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for (int i = 0; i < freesize; i++) {
				//得到该排班的日期
				Date nofreetime = freelist.get(i).getNurseNofreeDate();
				//date转String
		    	String startTime = sdff.format(nofreetime);
		    	
		    	String begintime = startTime+" "+freelist.get(i).getNurseNofreeShiftBegintime();
		    	String stoptime = startTime+" "+freelist.get(i).getNurseNofreeShiftStoptime();
		    	//String 转date
		    	DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				Date freebeginTime = fmt.parse(begintime);
				Date freestopTime = fmt.parse(stoptime);
				//判断有没有我的专属单
				spelist = orderSendService.selectSpecialOrderInfo(nurseId);
						//,freestopTime);
				//获取所有可接订单
				ordlist = orderSendService.selectCanAccess(freebeginTime,freestopTime);
						//freestopTime);
				//获取受护人的经纬度
			}
			//将两个list变成一个list
			newlist.addAll(spelist);
			newlist.addAll(ordlist);
			int size = newlist.size();
			for(int i=0;i<size;i++){
				//根据用户ID得到用户的昵称和手机号
				User user = userService.selectForUserByID(newlist.get(i).getOrderSendUserid());
				if(user == null || "".equals(user)){
					continue;
				}
				newlist.get(i).setUserNickNew(user.getUserNick());
				newlist.get(i).setUserNameNew(user.getUserPhone());
				//服务产品信息
				String newgoosName="";
            	contentid = newlist.get(i).getOrderSendServicecontent().split(",");
//			
				for(int c =0; c<contentid.length;c++){
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						contentname =manageNursingContent.getManageNursingContentName();
    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
    					newlist.get(i).setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						newlist.get(i).setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
				//得到受护人id
				orderSendUserName = newlist.get(i).getOrderSendUsername();
				if(orderSendUserName!=null && !"".equals(orderSendUserName)){
					//通过受护人id得到受护人信息
					protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserName);
					if(protectedPerson == null && "".equals(protectedPerson)){
						newlist.get(i).setOrderSendUsername("没有该受护人信息");
					}else{
						//得到受护人的名字、性别、关系、年龄、身高、体重
						neworderSendUserName = orderSendUserName+","+protectedPerson.getProtectedPersonName();
						newlist.get(i).setOrderSendUsername(neworderSendUserName);
						newlist.get(i).setOrderSendSex(protectedPerson.getProtectedPersonSex());
						newlist.get(i).setOrderSendAge(protectedPerson.getProtectedPersonAge());
						newlist.get(i).setProtectedPersonNexus(protectedPerson.getProtectedPersonNexus());
						newlist.get(i).setProtectedPersonHeight(protectedPerson.getProtectedPersonHeight());
						newlist.get(i).setProtectedPersonWeight(protectedPerson.getProtectedPersonWeight());
						//通过受护人地址id得到受护人地址信息
						protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
						if(protectedAddress==null || "".equals(protectedAddress)){
							newlist.get(i).setOrderSendAddree("经纬度为空");
						}else{
							//得到详细地址描述
							addressString = protectedAddress.getProtectedAddressAddress();
							//通过受护id查询经纬度
							addressPositionX = protectedAddress.getProtectedAddressPositionX();
							addressPositionY = protectedAddress.getProtectedAddressPositionY();
							newlist.get(i).setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
						}
					}
				}else{ 
					newlist.get(i).setOrderSendUsername("受护人信息为空");
				}
			}
		}
			// 每页多少条
		int num = 5;
		List<OrderSend> paging = new ArrayList<OrderSend>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有订单了");
			netState.setErrorCode(NetState.SUCCESS);
			return netState;

		} else if ((newlist.size() - (pageNum * num)) < 0) {
			netState.setData("超出范围");
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		} else {
			// 分页操作
			// 判断是否是最后一页
			if ((newlist.size() - pageNum * num) < num) {
				for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
					paging.add(newlist.get(i + pageNum * num));
				}
			} else {
				for (int i = 0; i < num; i++) {
					paging.add(newlist.get(i + pageNum * num));
					
				}
			}
		}
		if(paging.size()==0 || "".equals(paging)){
			netState.setData("没有可接取的订单");
			netState.setJson(paging);
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setJson(paging);
			netState.setErrorCode(NetState.SUCCESS);
		}
		
	return netState;
	}
	
	
	//获取当前接单状态（可接/不可接）
	@RequestMapping(value="/orderReceiverState",method=RequestMethod.POST)
	public @ResponseBody NetState orderReceiverState(String nurseId)throws Exception{
		NetState netState =new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该护士存不存在
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		if(nurse==null || "".equals(nurse)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//得到护士当前的接单状态
		String nurseReceiverState = nurse.getNurseCity();
		netState.setData("当前接单状态");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(nurseReceiverState);
		return netState;
}
	//修改当前接单状态
	@RequestMapping(value="/UpdateorderReceiverState",method=RequestMethod.POST)
	public @ResponseBody NetState UpdateorderReceiverState(String nurseId,String nurseReceiverState)throws Exception{
			NetState netState =new NetState();
			if(nurseId==null || "".equals(nurseId)){
				netState.setData("参数1错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else if(nurseReceiverState==null || "".equals(nurseReceiverState)){
				netState.setData("参数2错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			//判断该护士存不存在
			Nurse nurse = nurseService.selectForNurseId(nurseId);
			if(nurse==null || "".equals(nurse)){
				netState.setData("该护士不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			//修改当前接单状态
			Nurse nurse2 = new Nurse();
			nurse2.setNurseCity(nurseReceiverState);
			nurse2.setNurseId(nurseId);
			int i = nurseService.updateByNurseId(nurse2);
			if(i>0){
				netState.setData("修改成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("修改失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
			return netState;
		}
	
	
	
	//接取订单
	@RequestMapping(value="/orderReceiver",method=RequestMethod.POST)
	public @ResponseBody NetState orderReceiver(HttpServletRequest request,String nurseId,String orderSendId
			)throws Exception{
		NetState netState = new NetState();
		if("".equals(nurseId)|| nurseId==null){
			netState.setData("参数1错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}else if("".equals(orderSendId) || orderSendId==null){
			netState.setData("参数2错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		final OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
		if(orderSend == null || "".equals(orderSend)){
			netState.setData("该订单不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		userId = orderSend.getOrderSendUserid();
		
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		//判断该订单存不存在
		if(orderSend==null || "".equals(orderSend)){
			netState.setData("该订单不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该护士存不存在
		if(nurse==null || "".equals(nurse)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该护士认证状态 如果未认证提示不能接取
		if(nurse.getNurseDistrict() != "0" && !"0".equals(nurse.getNurseDistrict())){
			netState.setData("请认证之后再接单");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该护士的接单状态是不是开启
		if(nurse.getNurseCity() =="1" ||"1".equals(nurse.getNurseCity())){
			netState.setData("请开启接单开关再接取订单");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		final SimpleDateFormat format = new SimpleDateFormat();
		//查看该订单有没有被接取
		if(!"0".equals(orderSend.getOrderSendState())){//该订单已被接取
			netState.setData("该订单已经被人接取");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{//该订单未被接取
			//修改该订单状态为接取并增加接单时间
			OrderSend orderSend2 = new OrderSend();
			orderSend2.setOrderSendState("1");
			orderSend2.setOrderSendGetOrderTime(new Date());
			orderSend2.setOrderSendId(orderSendId);
			int i = orderSendService.updateByOrderSendId(orderSend2);
			if(i>0){
				//根据用户ID得到用户的账号(手机号)
				User user = userService.selectForUserByID(userId);
				userPhone =  user.getUserName();
				
				Thread thread = new Thread(){
					public void run() {
						//根据赛区id获取赛区发布人的id
						//向客户端发送推送
						String TITLE = "订单接取";
						String ALERT= "感谢您使用安心护平台，您的护士已接受您的预约，她将与您联系";
						String MSG_CONTENT= "感谢您使用安心护平台，您的护士已接受您的预约，她将与您联系";
					//指定推送
					JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
					//全部推送	
					Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
						//发送短信
						SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】感谢您使用安心护平台，您的护士已接受您的预约，她将与您联系", null, null, "0",  null,  null,  null,  null, null,  null, null);
				
						////将推送记录到用户站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(userId);                              
						innerLetter.setStandInnerLetterUserIdentity(0);
						innerLetter.setStandInnerLetterTitle("订单接取");
						//0订单消息/1资金消息/2系统通知
						
						innerLetter.setStandInnerLetterUserType(0);
						innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，您的护士于"+format.format(new Date())+"已接受您预付款¥"+orderSend.getOrderSendTotalmoney()+",单号为"+orderSend.getOrderSendNumbers()+"的订单，她将与您联系");
						innerLetter.setStandInnerLetterCreatetime(new Date());
						try {
							standInnerLetterService.insertSelective(innerLetter);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
					
				};
				thread.start();
				
				
				netState.setData("修改接取状态成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("修改接取状态失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			//将订单id和护士id插入到接单表中
			OrderReceiver orderReceiver = new OrderReceiver();
			String orderReceiverId =  java.util.UUID.randomUUID().toString()
					.replaceAll("-", "");
			orderReceiver.setOrderReceiveId(orderReceiverId);
			orderReceiver.setOrderNurseid(nurseId);
			orderReceiver.setOrderOrdersendid(orderSendId);
			orderReceiver.setOrderReceivestate("0");
			orderReceiver.setOrderCreatetime(new Date());
			int c = orderReceiverService.insertSelectiveForOrderReceiver(orderReceiver);
			if(c>0){
				Date date = new Date();
				////将推送记录到护士站内信中
				StandInnerLetter innerLetter = new StandInnerLetter();
				innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter.setStandInnerLetterUserId(nurseId);                              
				innerLetter.setStandInnerLetterUserIdentity(1);
				innerLetter.setStandInnerLetterTitle("订单接取");
				//0订单消息/1资金消息/2系统通知
				innerLetter.setStandInnerLetterUserType(0);
				
				//判断该订单是不是专属单
				String orderSendType = orderSend.getOrderSendType();
				BigDecimal income = orderSend.getOrderSendTrafficmoney().add(orderSend.getOrderSendCostmoney());
				
				if(orderSendType == "0" || "0".equals(orderSendType)){
					innerLetter.setStandInnerLetterContent("您于"+format.format(date)+"接取了一条单号为"+orderSend.getOrderSendNumbers()+"的订单,预计收入"+income+"扣除客服费用");
				}else{
					innerLetter.setStandInnerLetterContent("(专属)您于"+format.format(date)+"接取了一条单号为"+orderSend.getOrderSendNumbers()+"的订单,预计收入"+income+"扣除客服费用");
				}
				innerLetter.setStandInnerLetterCreatetime(date);
				try {
					standInnerLetterService.insertSelective(innerLetter);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				netState.setData("接单成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				OrderSend orderSend3 = new OrderSend();
				orderSend3.setOrderSendState("0");
				orderSend3.setOrderSendId(orderSendId);
				int e = orderSendService.updateByOrderSendId(orderSend3);
				if(e>0){
					netState.setData("回滚接取状态成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("回滚接取状态失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
			}
		}
		return netState;
	}
	
	//修改接单状态和订单状态
	@RequestMapping(value="/updateOrderState",method=RequestMethod.POST)
	public @ResponseBody NetState updateOrderState(HttpServletRequest request,String nurseId,String orderSendId,String orderReceiverState
			)throws Exception{
		NetState netState = new NetState();
		if("".equals(nurseId)|| nurseId==null){
			netState.setData("参数1错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}else if("".equals(orderSendId)|| orderSendId==null){
			netState.setData("参数2错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		//判断该订单存不存在
		if(orderSend==null || "".equals(orderSend)){
			netState.setData("该订单不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该订单的状态,如果是取消状态(不允许操作)
		if(orderSend.getOrderSendState()=="4" || "4".equals(orderSend.getOrderSendState())){
			netState.setData("该订单已被取消");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该护士存不存在
		if(nurse==null || "".equals(nurse)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断订单的状态
		if(orderSend.getOrderSendState() == "4" || "4".equals(orderSend.getOrderSendState())){
			netState.setData("该订单为取消状态,不能进行下一步");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//修改该订单状态为接取
		OrderSend orderSend2 = new OrderSend();
		if(orderReceiverState=="1" || "1".equals(orderReceiverState)){//沟通
			orderSend2.setOrderSendState("1");
		}else if(orderReceiverState=="2" || "2".equals(orderReceiverState)){//已出发
			orderSend2.setOrderSendState("1");
		}else if(orderReceiverState=="3" || "3".equals(orderReceiverState)){//开始服务
			orderSend2.setOrderSendState("2");
		}else if(orderReceiverState=="4" || "4".equals(orderReceiverState)){//完成 并修改完成订单时间
			orderSend2.setOrderSendState("3");
			orderSend2.setOrderSendFinishOrderTime(new Date());
			//并将完成的服务加入到统计表
			//服务产品信息
			//三级产品
			String goodsidOld = orderSend.getOrderSendServicecontent();
        	String[] goodsid = goodsidOld.split(",");
			String contentid ="";
			Goods goods = new Goods();
			for(int i =0; i<goodsid.length;i++){
				goods = goodsService.selectByPrimaryKey(goodsid[i]);
				if(goods!=null){
					//得到二级服务项的id
					contentid = goods.getGoodsContent();
				}
			}
			if(contentid!= null || !"".equals(contentid)){
				ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(contentid);
				if(manageNursingContent!=null){
					//得到一级服务的id
					String projectid =manageNursingContent.getManageNursingContentMaproject();
					String countName = manageNursingContent.getManageNursingContentName();
					
					Statistics statistics = new Statistics();//insertSelective
					String countId = java.util.UUID.randomUUID().toString()
							.replaceAll("-", "");
					statistics.setCountId(countId);
					statistics.setCountProjectId(projectid);
					statistics.setCountContentId(contentid);
					statistics.setCountGoodsId(goodsidOld);
					statistics.setCountNurseId(nurseId);
					statistics.setContentName(countName);
					statistics.setCountNurseCreatetime(new Date());
					//将服务记录插入到数据库
					int i =statisticsService.insertSelective(statistics);
					if(i>0){
						System.out.println("添加记录成功");
					}else{
						System.out.println("添加记录失败");
					}
				}else{
					System.out.println("该服务项不存在");;
				}
			}
		}
		orderSend2.setOrderSendId(orderSendId);
		int i = orderSendService.updateByOrderSendId(orderSend2);
		if(i>0){
			netState.setData("修改接取状态成功");
			netState.setErrorCode(NetState.SUCCESS);
			//修改接单表状态
			OrderReceiver orderReceiver = new OrderReceiver();
			orderReceiver.setOrderReceivestate(orderReceiverState);
			orderReceiver.setOrderNurseid(nurseId);
			orderReceiver.setOrderOrdersendid(orderSendId);
			int e = orderReceiverService.updateOrderReceiverState(orderReceiver);
			if(e>0){
				netState.setData("修改接单状态成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("修改接取状态失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		}else{
			netState.setData("修改接取状态失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
	return netState;
	}
	
	
	/**
	 * 正在进行中的订单 SelectOrderStateAccess
	 * **/
	/**
	 * 正在进行中的订单
	 * @param nurseId 护士ID
	 * @param pageNow 分页数
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/OrderStateAccessNow",method=RequestMethod.POST)
	public @ResponseBody NetState OrderStateAccessNow(String nurseId,Integer pageNow
			)throws Exception{
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("护士参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//获取订单ID
			List<OrderReceiver> orderReceivers = new ArrayList<OrderReceiver>();
			OrderReceiverExample orderReceiverExample = new OrderReceiverExample();
			com.chance.ssm.po.OrderReceiverExample.Criteria criteria = orderReceiverExample.createCriteria();
			criteria.andOrderNurseidEqualTo(nurseId);
			orderReceivers = orderReceiverService.selectByExample(orderReceiverExample);
			List<String> orderids = new ArrayList<String>();
			for(int i = 0; i < orderReceivers.size(); i++){
				orderids.add(orderReceivers.get(i).getOrderOrdersendid());
			}
			if(orderReceivers.size()==0){
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);
				return netState;
			}

			// 分页
			//int num = 5;
			List<OrderReceiverAndOrderVO> newlist = new ArrayList<OrderReceiverAndOrderVO>();
			
			pageNow = pageNow == null ? 0 : pageNow;
			
			//正在进行中的的状态
			List<String> state = new ArrayList<String>();
			state.add("1");
			state.add("2");
			
			OrderSendExample orderSendExample = new OrderSendExample();
			Criteria criteria2 = orderSendExample.createCriteria();
			criteria2.andOrderSendStateIn(state);
			if(orderids.size() > 0){
				criteria2.andOrderSendIdIn(orderids);
			}
			orderSendExample.setOrderByClause("order_createtime desc");
			//统计正在进行中的有多少条记录
//			OrderReceiverExample orderReceiverExample = new OrderReceiverExample();
//			com.chance.ssm.po.OrderReceiverExample.Criteria criteria = orderReceiverExample.createCriteria();
//			criteria.andOrderReceivestateIn(state);

//			orderReceiverExample.setOrderByClause("order_createtime desc");
			//新建一个list
			List<OrderReceiverAndOrderVO> orderListIng = new ArrayList<OrderReceiverAndOrderVO>();
			//查询数据
			List<OrderReceiverAndOrderVO> orderVOs = new ArrayList<OrderReceiverAndOrderVO>();
			orderVOs = orderReceiverService.selectByExampleBystate2(orderSendExample);
			
			for(OrderReceiverAndOrderVO orderReceiverAndOrderVO : orderVOs){
				//根据用户ID得到用户的昵称和手机号
				User user1 = userService.selectForUserByID(orderReceiverAndOrderVO.getOrderSendUserid());
				if(user1 == null || "".equals(user1)){
					continue;
				}
				orderReceiverAndOrderVO.setUserNickNew(user1.getUserNick());
				orderReceiverAndOrderVO.setUserNameNew(user1.getUserPhone());
				//服务产品信息
            	String[] contentid = orderReceiverAndOrderVO.getOrderSendServicecontent().split(",");
				String newcontentid ="";
				String goodsName = "";
				String newgoosName = "";
				Goods goods = null;
				for(int i =0; i<contentid.length;i++){
					goods = goodsService.selectByPrimaryKey(contentid[i]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						String contentname =manageNursingContent.getManageNursingContentName();
    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
    					orderReceiverAndOrderVO.setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						orderReceiverAndOrderVO.setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
				//得到受护人id
				String orderSendUserName = orderReceiverAndOrderVO.getOrderSendUsername();
				if(orderSendUserName!=null && !"".equals(orderSendUserName)){
					//通过受护人id得到受护人信息
					ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserName);
					if(protectedPerson == null){
						orderReceiverAndOrderVO.setOrderSendUsername("没有该受护人信息");
					}else{
						//得到受护人的名字、性别可年龄
						orderReceiverAndOrderVO.setPersonId(protectedPerson.getProtectedPersonId());
						orderReceiverAndOrderVO.setOrderSendUsername(protectedPerson.getProtectedPersonName());
						orderReceiverAndOrderVO.setOrderSendSex(protectedPerson.getProtectedPersonSex());
						orderReceiverAndOrderVO.setOrderSendAge(protectedPerson.getProtectedPersonAge());
						orderReceiverAndOrderVO.setProtectedPersonNexus(protectedPerson.getProtectedPersonNexus());
						orderReceiverAndOrderVO.setProtectedPersonHeight(protectedPerson.getProtectedPersonHeight());
						orderReceiverAndOrderVO.setProtectedPersonWeight(protectedPerson.getProtectedPersonWeight());
						//详细地址
						orderReceiverAndOrderVO.setDetailedAddress(protectedPerson.getProtectedPersonOverone());
						//通过受护人地址id得到受护人地址信息
						ProtectedAddress protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
						if(protectedAddress==null || "".equals(protectedAddress)){
							orderReceiverAndOrderVO.setOrderSendAddree("经纬度为空");
						}else{
							//得到详细地址描述
							String addressString = protectedAddress.getProtectedAddressAddress();
							//通过受护id查询经纬度
							Double addressPositionX = protectedAddress.getProtectedAddressPositionX();
							Double addressPositionY = protectedAddress.getProtectedAddressPositionY();
							orderReceiverAndOrderVO.setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
						}
					}
				}else{
					orderReceiverAndOrderVO.setOrderSendUsername("受护人信息为空");
				}
				//通过用户ID查询用户信息
				User user = userService.selectForUserByID(orderReceiverAndOrderVO.getOrderSendUserid());
				if(user != null && !"".equals(user)){
					orderReceiverAndOrderVO.setUserName(user.getUserPhone());
				}
				
				orderListIng.add(orderReceiverAndOrderVO);
			}
			newlist.addAll(orderListIng);
			if (newlist == null || newlist.size()<=0 ) {
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);

			} else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(newlist);
			}
		}
		return netState; 
	}

	
	/**
	 * 查询已完成的订单
	 * @param nurseId 护士ID
	 * @param pageNow 分页数
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/OrderStateAccessSuccess",method=RequestMethod.POST)
	public @ResponseBody NetState OrderStateAccessSuccess(String nurseId,Integer pageNow
			)throws Exception{
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("护士参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//获取订单ID
			List<OrderReceiver> orderReceivers = new ArrayList<OrderReceiver>();
			OrderReceiverExample orderReceiverExample = new OrderReceiverExample();
			com.chance.ssm.po.OrderReceiverExample.Criteria criteria = orderReceiverExample.createCriteria();
			criteria.andOrderNurseidEqualTo(nurseId);
			orderReceivers = orderReceiverService.selectByExample(orderReceiverExample);
			
			if(orderReceivers.size()==0){
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);
				return netState;
			}
			
			List<String> orderids = new ArrayList<String>();
			for(int i = 0; i < orderReceivers.size(); i++){
				orderids.add(orderReceivers.get(i).getOrderOrdersendid());
			}
			
			// 分页
			int num = 5;
			List<OrderReceiverAndOrderVO> paging = new ArrayList<OrderReceiverAndOrderVO>();
			List<OrderReceiverAndOrderVO> newlist = new ArrayList<OrderReceiverAndOrderVO>();
			
			pageNow = pageNow == null ? 0 : pageNow;
			
			//正在已完成
			List<String> state = new ArrayList<String>();
			state.add("3");//已完成
			state.add("4");//取消(也显示在已完成中)
			
			OrderSendExample orderSendExample = new OrderSendExample();
			Criteria criteria2 = orderSendExample.createCriteria();
			criteria2.andOrderSendStateIn(state);
			criteria2.andOrderSendFinishOrderTimeBetween(DateUtil.getDatePoor(), new Date());
			if(orderids.size() > 0){
				criteria2.andOrderSendIdIn(orderids);
			}
			orderSendExample.setOrderByClause("order_send_finish_order_time desc");
			

			//新建一个list
			List<OrderReceiverAndOrderVO> orderListIng = new ArrayList<OrderReceiverAndOrderVO>();
			//查询数据
			List<OrderReceiverAndOrderVO> orderVOs = new ArrayList<OrderReceiverAndOrderVO>();
			orderVOs = orderReceiverService.selectByExampleBystate2(orderSendExample);
			for(OrderReceiverAndOrderVO orderReceiverAndOrderVO : orderVOs){
				//根据订单id查出评价信息
				NurseEvaluate evaluate = nurseEvaluateService.selectEvaluateInfoByOrderid(orderReceiverAndOrderVO.getOrderSendId());
				//查询用户对我的评价
				Evaluate evaluate2 = evaluateService.selectEvaluateInfoByOrderid(orderReceiverAndOrderVO.getOrderOrdersendid());
				
				//根据评价人id查询头像和昵称
				User user =new User();
				if(evaluate!= null && !"".equals(evaluate)){
					user = userService.selectForUserByID(evaluate.getEvaluteUserId());
				}
				if(user==null || "".equals(user)){
					orderReceiverAndOrderVO.setUserid("");
					orderReceiverAndOrderVO.setUserName("");
					orderReceiverAndOrderVO.setUserNick("");
					orderReceiverAndOrderVO.setUserHeader("");
				}else{
					orderReceiverAndOrderVO.setUserid(user.getUserId());
					orderReceiverAndOrderVO.setUserName(user.getUserPhone());
					orderReceiverAndOrderVO.setUserNick(user.getUserNick());
					orderReceiverAndOrderVO.setUserHeader(user.getUserHeader());
					// 将评价信息set到实体类中
					// 无评价
//					NurseEvaluateExample nurseEvaluateExample = new NurseEvaluateExample();
//					com.chance.ssm.po.NurseEvaluateExample.Criteria criteria5 = nurseEvaluateExample.createCriteria();
//					criteria5.andEvaluteSendIdEqualTo(orderReceiverAndOrderVO.getOrderSendId());
//					List<NurseEvaluate> nurseEvaluate = nurseEvaluateService.selectByExample(nurseEvaluateExample);
					List<NurseEvaluate> nurseEvaluate = nurseEvaluateService.selectNurseToUserEvaluate(orderReceiverAndOrderVO.getOrderSendId());
					
					if(nurseEvaluate.size() > 0){//已评价
						orderReceiverAndOrderVO.setIsEvaluate(1);
					}else{//未评价
						orderReceiverAndOrderVO.setIsEvaluate(0);
					}
					if (evaluate == null || "".equals(evaluate)) {
						orderReceiverAndOrderVO.setEvaluateContent("");
						orderReceiverAndOrderVO.setEvaluateMark(null);
						
					} else {
						if(evaluate2!=null && !"".equals(evaluate2)){
							orderReceiverAndOrderVO.setEvaluateContent(evaluate2.getEvaluateContent());
						}
						
						orderReceiverAndOrderVO.setEvaluateMark(new BigDecimal(evaluate.getEvaluteMark()));
						
					}
				}
				//根据用户ID得到用户的昵称和手机号
				User user1 = userService.selectForUserByID(orderReceiverAndOrderVO.getOrderSendUserid());
				if(user1 == null || "".equals(user1)){
					continue;
				}
				orderReceiverAndOrderVO.setUserNickNew(user1.getUserNick());
				orderReceiverAndOrderVO.setUserNameNew(user1.getUserPhone());
				orderReceiverAndOrderVO.setUserHeader(user1.getUserHeader());
				//服务产品信息
            	String[] contentid = orderReceiverAndOrderVO.getOrderSendServicecontent().split(",");
				String newcontentid ="";
				String goodsName = "";
				String newgoosName = "";
				Goods goods = null;
				for(int i =0; i<contentid.length;i++){
					goods = goodsService.selectByPrimaryKey(contentid[i]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						String contentname =manageNursingContent.getManageNursingContentName();
    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
    					orderReceiverAndOrderVO.setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						orderReceiverAndOrderVO.setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
				//得到受护人id
				String orderSendUserName = orderReceiverAndOrderVO.getOrderSendUsername();
				if(orderSendUserName!=null && !"".equals(orderSendUserName)){
					//通过受护人id得到受护人信息
					ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserName);
					if(protectedPerson == null){
						orderReceiverAndOrderVO.setOrderSendUsername("没有该受护人信息");
					}else{
						//得到受护人的名字、性别可年龄
						orderReceiverAndOrderVO.setPersonId(protectedPerson.getProtectedPersonId());
						orderReceiverAndOrderVO.setOrderSendUsername(protectedPerson.getProtectedPersonName());
						orderReceiverAndOrderVO.setOrderSendSex(protectedPerson.getProtectedPersonSex());
						orderReceiverAndOrderVO.setOrderSendAge(protectedPerson.getProtectedPersonAge());
						orderReceiverAndOrderVO.setProtectedPersonNexus(protectedPerson.getProtectedPersonNexus());
						orderReceiverAndOrderVO.setProtectedPersonHeight(protectedPerson.getProtectedPersonHeight());
						orderReceiverAndOrderVO.setProtectedPersonWeight(protectedPerson.getProtectedPersonWeight());
						//详细地址
						orderReceiverAndOrderVO.setDetailedAddress(protectedPerson.getProtectedPersonOverone());
						//通过受护人地址id得到受护人地址信息
						ProtectedAddress protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
						if(protectedAddress==null || "".equals(protectedAddress)){
							orderReceiverAndOrderVO.setOrderSendAddree("经纬度为空");
						}else{
							//得到详细地址描述
							String addressString = protectedAddress.getProtectedAddressAddress();
							//通过受护id查询经纬度
							Double addressPositionX = protectedAddress.getProtectedAddressPositionX();
							Double addressPositionY = protectedAddress.getProtectedAddressPositionY();
							orderReceiverAndOrderVO.setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
						}
					}
				}else{
					orderReceiverAndOrderVO.setOrderSendUsername("受护人信息为空");
				}
				orderListIng.add(orderReceiverAndOrderVO);
			}
			newlist.addAll(orderListIng);
			if (newlist == null || newlist.size()<=0 ) {
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);

			} else if ((newlist.size() - (pageNow * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((newlist.size() - pageNow * num) < num) {
					for (int i = 0; i < (newlist.size() - (pageNow * num)); i++) {
						paging.add(newlist.get(i + pageNow * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(newlist.get(i + pageNow * num));
					}
				}
			}
			
			//如果这个订单的状态是取消的  判断是(已退款/待协商/待退款)
			for (OrderReceiverAndOrderVO orderReceiverAndOrderVO2 : paging) {
				String orderSendState = orderReceiverAndOrderVO2.getOrderSendState();
				
				if(orderSendState == "4" || "4".equals(orderSendState)){//取消状态的订单
					 //查询取消订单的信息
				    OrderSendCancalVo orderSendCancalVo =  orderCancelOrderService.selectOrderAndCancaByOrderId(orderReceiverAndOrderVO2.getOrderSendId());
				    //是否退款
				    Integer whetherRefund = orderSendCancalVo.getOrderCancalWhetherRefund();
					//得到是用户还是护士取消的
					Integer identity = orderReceiverAndOrderVO2.getOrderSendStoptime();
					if(identity == 0 || "0".equals(identity)){//用户取消
						if(whetherRefund == 0 || "0".equals(whetherRefund)) {
							orderReceiverAndOrderVO2.setOrderSpeakByCancel("已退款");
						}else{
							orderReceiverAndOrderVO2.setOrderSpeakByCancel("待退款");
						}
						
					}else{//护士取消
						Integer userAgree = orderSendCancalVo.getOrderCancalUserAgree();
						if(userAgree == 0 || "0".equals(userAgree)){//用户同意
							if(whetherRefund == 0 || "0".equals(whetherRefund)) {
								orderReceiverAndOrderVO2.setOrderSpeakByCancel("已退款");
							}else{
								orderReceiverAndOrderVO2.setOrderSpeakByCancel("待退款");
							}
						}else{
							if(whetherRefund == 0 || "0".equals(whetherRefund)) {
								orderReceiverAndOrderVO2.setOrderSpeakByCancel("已退款");
							}else{
								orderReceiverAndOrderVO2.setOrderSpeakByCancel("待客服介入");
							}
						}
					}
				}
			}
			
			
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(paging);
		}
		return netState; 
	}
	/****
	 * //查询订单详情（护士）
	 */
		@RequestMapping(value="/OrderSendDescriptionByNurse",method=RequestMethod.POST)
		public @ResponseBody NetState OrderSendDescriptionByNurse(String orderSendId)throws Exception{
			NetState netState = new NetState();
			OrderReceiverAndOrderVO orderReceiverAndOrderVO = new OrderReceiverAndOrderVO();
			if(orderSendId==null || "".equals(orderSendId)){
				netState.setData("参数错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
				//通过订单ID查询订单详情
				OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
				
				if(orderSend==null || "".equals(orderSend)){
					netState.setData("查询订单详情为空");
					netState.setErrorCode(NetState.DATA_NOT_FOUND);
					return netState;
				}
				//服务产品信息
            	String[] contentid = orderSend.getOrderSendServicecontent().split(",");
				String newcontentid ="";
				String goodsName = "";
				String newgoosName = "";
				Goods goods = null;
				for(int c =0; c<contentid.length;c++){
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				
				String ordersendstate =orderSend.getOrderSendState(); 
				if(ordersendstate=="0" || "0".equals(ordersendstate)){
					//根据用户ID得到用户的昵称和手机号
					User user1 = userService.selectForUserByID(orderSend.getOrderSendUserid());
					orderSend.setUserNickNew(user1.getUserNick());
					orderSend.setUserNameNew(user1.getUserPhone());
					if(newcontentid!= null || !"".equals(newcontentid)){
						ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
						if(manageNursingContent!=null){
							String contentname =manageNursingContent.getManageNursingContentName();
	    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
	    					orderSend.setOrderSendServicecontent(contentname+":"+newgoosName);
						}else{
							orderSend.setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
						}
					}
					//通过受护人id得到受护人信息
					ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSend.getOrderSendUsername());
					if(protectedPerson == null){
						orderSend.setOrderSendUsername("没有该受护人信息");
					}else{
						//得到受护人的名字、性别可年龄
						orderSend.setOrderSendUsername(protectedPerson.getProtectedPersonName()+","+orderSend.getOrderSendUsername());
						orderSend.setOrderSendSex(protectedPerson.getProtectedPersonSex());
						orderSend.setOrderSendAge(protectedPerson.getProtectedPersonAge());
						orderSend.setProtectedPersonNexus(protectedPerson.getProtectedPersonNexus());
						orderSend.setProtectedPersonHeight(protectedPerson.getProtectedPersonHeight());
						orderSend.setProtectedPersonWeight(protectedPerson.getProtectedPersonWeight());
						//通过受护人地址id得到受护人地址信息
						ProtectedAddress protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
						if(protectedAddress==null || "".equals(protectedAddress)){
							orderSend.setOrderSendAddree("经纬度为空");
						}else{
							//得到详细地址描述
							String addressString = protectedAddress.getProtectedAddressAddress();
							//通过受护id查询经纬度
							Double addressPositionX = protectedAddress.getProtectedAddressPositionX();
							Double addressPositionY = protectedAddress.getProtectedAddressPositionY();
							orderSend.setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
						}
					}
					netState.setData("查询订单详情成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(orderSend);
				}else{
					orderReceiverAndOrderVO = orderReceiverService.selectStateNurseOrderInfoByid(orderSendId);
					
					if(orderReceiverAndOrderVO==null && "".equals(orderReceiverAndOrderVO)){
						netState.setData("查询订单详情为空");
						netState.setErrorCode(NetState.DATA_NOT_FOUND);
						netState.setJson(orderReceiverAndOrderVO);
					}else{
						//根据用户ID得到用户的昵称和手机号
						User user1 = userService.selectForUserByID(orderReceiverAndOrderVO.getOrderSendUserid());
						orderReceiverAndOrderVO.setUserNickNew(user1.getUserNick());
						orderReceiverAndOrderVO.setUserNameNew(user1.getUserPhone());
						if(newcontentid!= null && !"".equals(newcontentid)){
							ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
							if(manageNursingContent!=null){
								String contentname =manageNursingContent.getManageNursingContentName();
		    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
		    					orderReceiverAndOrderVO.setOrderSendServicecontent(contentname+":"+newgoosName);
							}else{
								orderReceiverAndOrderVO.setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
							}
						}
						//通过受护人id得到受护人信息
						ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSend.getOrderSendUsername());
						if(protectedPerson == null){
							orderReceiverAndOrderVO.setOrderSendUsername("没有该受护人信息");
						}else{
							//得到受护人的名字、性别可年龄
							orderReceiverAndOrderVO.setPersonId(orderSend.getOrderSendUsername());
							orderReceiverAndOrderVO.setOrderSendUsername(protectedPerson.getProtectedPersonName());
							orderReceiverAndOrderVO.setOrderSendSex(protectedPerson.getProtectedPersonSex());
							orderReceiverAndOrderVO.setOrderSendAge(protectedPerson.getProtectedPersonAge());
							orderReceiverAndOrderVO.setProtectedPersonNexus(protectedPerson.getProtectedPersonNexus());
							orderReceiverAndOrderVO.setProtectedPersonHeight(protectedPerson.getProtectedPersonHeight());
							orderReceiverAndOrderVO.setProtectedPersonWeight(protectedPerson.getProtectedPersonWeight());
							//详细地址
							orderReceiverAndOrderVO.setDetailedAddress(protectedPerson.getProtectedPersonOverone());
//							orderReceiverAndOrderVO.setOrderSendAddree(protectedPerson.getProtectedAddress());
							//通过受护人地址id得到受护人地址信息
							ProtectedAddress protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
							if(protectedAddress==null || "".equals(protectedAddress)){
								orderReceiverAndOrderVO.setOrderSendAddree("经纬度为空");
							}else{
								//得到详细地址描述
								String addressString = protectedAddress.getProtectedAddressAddress();
								//通过受护id查询经纬度
								Double addressPositionX = protectedAddress.getProtectedAddressPositionX();
								Double addressPositionY = protectedAddress.getProtectedAddressPositionY();
								orderReceiverAndOrderVO.setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
							}
						}
						//通过用户ID查询用户信息
						User user = userService.selectForUserByID(orderReceiverAndOrderVO.getOrderSendUserid());
						if(user != null && !"".equals(user)){
							orderReceiverAndOrderVO.setUserName(user.getUserPhone());
							orderReceiverAndOrderVO.setUserNick(user.getUserNick());
							orderReceiverAndOrderVO.setUserHeader(user.getUserHeader());
						}
						List<NurseEvaluate> nurseEvaluate = nurseEvaluateService.selectNurseToUserEvaluate(orderReceiverAndOrderVO.getOrderSendId());
						
						if(nurseEvaluate.size() > 0){//已评价
							orderReceiverAndOrderVO.setIsEvaluate(1);
						}else{//未评价
							orderReceiverAndOrderVO.setIsEvaluate(0);
						}
						netState.setData("查询订单详情成功");
						netState.setErrorCode(NetState.SUCCESS);
						netState.setJson(orderReceiverAndOrderVO);
					}
				}
			return netState;
		}
	//护士取消专属订单(正接单取消)
	@RequestMapping(value="/giveUpExclusiveOrder",method=RequestMethod.POST)
	public @ResponseBody NetState giveUpExclusiveOrder(String orderSendId,String nurseId)throws Exception{
		NetState netState = new NetState();
		if(null == orderSendId ||"".equals(orderSendId)){
			netState.setData("订单Id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该订单第几次取消
		OrderCancelOrder orderCancelOrder = orderCancelOrderService.selectByPrimaryKey(orderSendId);
		
		if(null == orderCancelOrder || "".equals(orderCancelOrder)){
			//将订单变成取消状态
			OrderSend orderSend2 = new OrderSend();
			orderSend2.setOrderSendId(orderSendId);
			orderSend2.setOrderSendState("4");
			//取消人的身份0用户1护士
			orderSend2.setOrderSendStoptime(1);
			//取消时间
			orderSend2.setOrderSendFinishOrderTime(new Date());
			//将订单的状态修改成取消
			orderSendService.updateByOrderSendId(orderSend2);
			
			
			Date nowTime = new Date();
			OrderCancelOrder orderCancelOrder2 = new OrderCancelOrder();
			orderCancelOrder2.setOrderCancelOrderSendId(orderSendId);//订单ID
			//护士取消 
			orderCancelOrder2.setOrderCancalNurseAgree(0);//0同意1不同意
			orderCancelOrder2.setOrderCancalNurseCancelTime(nowTime);//取消的时间
			orderCancelOrder2.setOrderCancalNurseAgreeTime(nowTime);//确认时间
			orderCancelOrder2.setOrderCancelOrderNote("1");
			orderCancelOrder2.setOrderCancelOrderSpeak("1");
			int i = orderCancelOrderService.insertSelective(orderCancelOrder2);
			if(i>0){
				netState.setData("取消成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("取消失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		}else{
			int number = 0;
			number = Integer.parseInt(orderCancelOrder.getOrderCancelOrderSpeak());
			
			//修改次数
			OrderCancelOrder orderCancelOrder3 = new OrderCancelOrder();
			orderCancelOrder3.setOrderCancelOrderSendId(orderSendId);
			//如果已经取消过
			//取消的次数
			orderCancelOrder3.setOrderCancelOrderSpeak(String.valueOf(number+1));
			int i = orderCancelOrderService.updateByPrimaryKeySelective(orderCancelOrder3);
			if(i>0){
				netState.setData("取消成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("取消失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		}
		return netState;
			
		}
	//查询客服电话
	@RequestMapping(value="/selectUseCustomerServicePhone",method=RequestMethod.POST)
	public @ResponseBody NetState selectUseCustomerServicePhone()throws Exception{
		NetState netState = new NetState();
		//查询可用的客服电话(默认并启用)
		CustomerServicePhoneExample example = new CustomerServicePhoneExample();
		com.chance.ssm.po.CustomerServicePhoneExample.Criteria criteria = example.createCriteria();
		criteria.andCustomerServicePhoneDefaultEqualTo(1);
		criteria.andCustomerServicePhoneIsuseEqualTo(0);
		List<com.chance.ssm.po.CustomerServicePhone> list =  customerServicePhoneService.selectByExample(example);
		
		if(list.size()==0){
			netState.setData("暂未设置客服电话");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(list.get(0));
		}
		return netState;
	}
}
