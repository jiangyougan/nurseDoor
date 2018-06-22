package com.chance.ssm.controller;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.Cost;
import com.chance.ssm.po.Coupon;
import com.chance.ssm.po.CouponUser;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.OrderCancelOrder;
import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.OrderSendSpecial;
import com.chance.ssm.po.OrderSendSpecialExample;
import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.ProtectedPersonExample;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.ProtectedPersonExample.Criteria;
import com.chance.ssm.po.Save;
import com.chance.ssm.po.Traffic;
import com.chance.ssm.po.User;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.po.vo.HospitalVO;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;
import com.chance.ssm.po.vo.OrderSendCancalVo;
import com.chance.ssm.service.CapitalUserPoolService;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.CouponService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.HospitalService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderCancelOrderService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.OrderSendSpecialService;
import com.chance.ssm.service.ProtectedAddressService;
import com.chance.ssm.service.ProtectedPersonService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.LzhUtils;
import com.chance.ssm.utils.RandomUtil;
import com.chance.ssm.utils.SavePic;
import com.chance.ssm.utils.StringInfo;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushIOS;
import com.weiwend.jdpush.JdpushPeo;

/**
 * 发订单控制类
 * 
 * @author Administrator
 * 
 */
@Controller
@Scope("prototype")
@RequestMapping("/orderSend")
public class OrderSendController {

	@Autowired
	private OrderSendService orderSendService;

	@Autowired
	private NurseService nurseService;

	@Autowired
	private GoodsService goodsService;

	@Autowired
	private ManageNursingContentService manageNursingContentService;

	@Autowired
	private OrderReceiverService orderReceiverService;

	@Autowired
	private ProtectedPersonService protectedPersonService;

	@Autowired
	private ProtectedAddressService protectedAddressService;
	
	@Autowired 
	private OrderSendSpecialService oSpecialService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CapitalUserPoolService capitalUserPoolService;
	
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	@Autowired
	private OrderCancelOrderService orderCancelOrderService;
	
	@Autowired
	private OrderSendSpecialService orderSendSpecialService;
	
	@Autowired
	private CouponService couponService;
	
	@Autowired
	private ComplaintService complaintService;
	
	@Autowired
	private HospitalService hospitalService;
	
	

	//护士端
	private static final String appKey = "f3df690c367e49335b6eca7b";
	private static final String masterSecret = "5fc63778c12794bf2c3cdbae";
	
	//用户端

	private static final String userappKey ="8121db7759363542b25159b8";
	private static final String usermasterSecret = "c20fa080107794c1337065f9";
		
	private String nurseId = "";
	
	private String orderuserId = "";
	
	private String cancalNurseId = "";
	
	private String cancalUserId = "";
	
	private String  nursePhone = "";
	
	private String userPhone = "";
	/**
	 * //发订单
	 * 
	 * @param request
	 * @param userId
	 *            当前用户id
	 * @param specifyNurseId
	 *            指定的护士id
	 * @param orderSendServicecontent
	 *            服务项目 改成 goodId 三级产品id
	 * @param personId
	 *            守护人ID
	 * @param orderSendCard
	 *            身份证号 *
	 * @param orderSendSex
	 *            服务对象性别 1男2女 *
	 * @param orderSendAge
	 *            服务对象年龄 *
	 * @param orderSendAddree
	 *            服务对象地址 *
	 * @param orderSendUserpic
	 *            服务对象图片
	 * @param orderSendNote
	 *            订单备注
	 * @param orderSendCoupon
	 *            订单优惠券(关联优惠券id)
	 * @param orderSendTrafficmoney
	 *            订单交通费
	 * @param orderSendSavemoney
	 *            订单保险费用
	 * @param orderSendIspayment
	 *            是否支付0未支付1已支付
	 * @param orderSendTotalmoney
	 *            支付总金额 *
	 * @param orderSendIssafe
	 *            是否购买保险0未买1已买
	 * @param orderSendBegintime
	 *            开始时间
	 * @param order_send_stoptime
	 *            结束时间
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/orderSend",method=RequestMethod.POST)
		public @ResponseBody NetState orderSend(HttpServletRequest request,String userId,String specifyNurseId,
				String goodId,String personId,
				String orderSendUserpic,String orderSendNote,
				String orderSendCoupon,String orderSendTrafficmoney,String orderSendSavemoney,String orderSendIspayment,
				String orderSendIssafe,String orderSendBegintime,
				String orderSendStoptime
				)throws Exception{
			//当前时间戳
			Long NowTime = new Date().getTime();
			NetState netState = new NetState();
			if("".equals(goodId) || goodId==null){
				netState.setData("产品收费项不能为空");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else if("".equals(personId) || personId==null){
				netState.setData("服务对象Id不能为空");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
			else if("".equals(goodId) || goodId==null){
				netState.setData("产品id不能为空");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
//			else if("".equals(orderSendNote) || orderSendNote==null){
//				netState.setData("服务备注不能为空");
//				netState.setErrorCode(NetState.PARAMS_ERROR);
//			}
			else if("".equals(userId)){
				netState.setData("用户id不能为空不能为空");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
			else if(Long.parseLong(orderSendBegintime) < NowTime){
				netState.setData("开始时间不能小于当前时间");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		/*	else if(Long.parseLong(orderSendBegintime)>Long.parseLong(orderSendStoptime)){
				netState.setData("开始时间不能大于结束时间");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}*/
			else{
				OrderSend orderSend = new OrderSend();
				SavePic savePic = new SavePic();
				String orderId = java.util.UUID.randomUUID().toString().replaceAll("-", "");
				String orderNumber = RandomUtil.getRandomMath();
				orderSend.setOrderSendId(orderId);
				orderSend.setOrderSendNumbers(orderNumber);
				orderSend.setOrderSendUserid(userId);
				
//				//存服务受护人ID
				orderSend.setOrderSendUsername(personId);
				
				//根据对象id查出受护人信息
				ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(personId);
				if(protectedPerson!=null || !"".equals(protectedPerson)){
					//身份证号
					orderSend.setOrderSendCard(protectedPerson.getProtectedPersonCard());
					//性别
					orderSend.setOrderSendSex(protectedPerson.getProtectedPersonSex());
					//年龄
					orderSend.setOrderSendAge(protectedPerson.getProtectedPersonAge());
					//受护地址 selectByPrimaryKey
					ProtectedAddress protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
					if(protectedAddress!= null){
						orderSend.setOrderSendAddree(protectedAddress.getProtectedAddressAddress());
					}
				}
				//多张图片处理
				if(orderSendUserpic!=null && !"".equals(orderSendUserpic)){
					String userpic = savePic.manyImgPathAdd(request,orderId,  "OrderSendPic", orderSendUserpic);
					orderSend.setOrderSendUserpic(userpic);
				}
				orderSend.setOrderSendNote(orderSendNote);
				
				orderSend.setOrderSendTrafficmoney(new BigDecimal(orderSendTrafficmoney));
				orderSend.setOrderSendSavemoney(new BigDecimal(orderSendSavemoney));
				
				String[] goodIds = goodId.split(",");
				Goods goods = new Goods();
				BigDecimal goodsMoney = BigDecimal.ZERO;
				for(int i =0; i<goodIds.length;i++){
					goods = goodsService.selectByPrimaryKey(goodIds[i]);
					if(goods!=null || "".equals(goods)){
						goodsMoney = goodsMoney.add(goods.getGoodsMoney());
					}
				}
				//产品收费项id
				orderSend.setOrderSendServicecontent(goodId);
				
				//通过产品id计算出订单服务费用
				orderSend.setOrderSendCostmoney(goodsMoney);
				
				orderSend.setOrderSendCoupon(orderSendCoupon);
				//如果优惠券不为空
				BigDecimal total=BigDecimal.ZERO;
				if(orderSendCoupon!=null && !"".equals(orderSendCoupon)){
					//通过ID查看优惠券
					 CouponUser couponuser = couponService.selectByPrimaryKeyByCouponUserId(orderSendCoupon);
				    if(couponuser!=null){
				    	if(couponuser.getCouponUserExpirationTime().compareTo(new Date())>0 || couponuser.getCouponUserExpirationTime() == null){//优惠券过期时间大于当前时间获取无限制
				    	//获取优惠券的面额
				    	BigDecimal couponmoney = couponuser.getCouponUserMoney();
				    	//总的费用减去优惠券面额	
			    		//总的费用
						total = new BigDecimal(orderSendTrafficmoney).add(new BigDecimal(orderSendSavemoney)).add(goodsMoney).subtract(couponmoney);
				    	}
				    }
				}else{
					//总的费用
					total = new BigDecimal(orderSendTrafficmoney).add(new BigDecimal(orderSendSavemoney)).add(goodsMoney);
				}
				
				orderSend.setOrderSendTotalmoney(total.toString());
				orderSend.setOrderSendIssafe(orderSendIssafe);
				
				//如果未支付该订单为待预约状态(为空待预约)
				if(orderSendIspayment=="0" || "0".equals(orderSendIspayment)){
				}else{//否则正在发布状态
					orderSend.setOrderSendState("0");
					//扣除余额
					//获取用户的余额
					User user = new User();
					user = userService.selectForUserByID(userId);
					//获取余额
					BigDecimal userBalance = user.getUserBalance();
					if(total.compareTo(userBalance)==1){
						netState.setData("余额不足，请充值");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}
					//生成一天资金表数据
					CapitalUserPool capitalUserPool = new CapitalUserPool();
					capitalUserPool.setCapitalUserPoolId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					capitalUserPool.setCapitalUserPoolPeopleid(userId);
					capitalUserPool.setCapitalUserPoolOrdersendid(orderId);
					capitalUserPool.setCapitalUserPoolPeopleIdentity(0);
					capitalUserPool.setCapitalUserPoolMoney(total);
					capitalUserPool.setCapitalUserPoolSpeak("发布订单");
					capitalUserPool.setCapitalUserPoolCreatetime(new Date());
					int i = capitalUserPoolService.insertSelective(capitalUserPool);
					if(i==0){
						netState.setData("资金记录生成失败，请重试");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}
					//扣除服务费之后剩下的余额
					BigDecimal FinUserBalance = userBalance.subtract(total);
					//将余额更新到用户
					User user2 = new User();
					user2.setUserBalance(FinUserBalance);
					UserExample userExample = new UserExample();
					com.chance.ssm.po.UserExample.Criteria criteria = userExample.createCriteria();
					criteria.andUserIdenstateEqualTo(userId);
					int c = userService.updateByExampleSelective(user2, userExample);
					if(c==0){
						netState.setData("支付失败，请重新支付");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}
				}
				
				orderSend.setOrderSendIspayment(orderSendIspayment);
				
				//开始时间（时间戳转化Date）
				Long timeLongBegin = Long.parseLong(orderSendBegintime);
				//结束时间
				//Long timeLongStop = Long.parseLong(orderSendStoptime);
		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        Date dateBegin = sdf.parse(sdf.format(timeLongBegin)); //日期格式
		      //  Date dateStop = sdf.parse(sdf.format(timeLongStop)); //日期格式
		        
		        
				orderSend.setOrderSendBegintime(dateBegin);
				//orderSend.setOrderSendStoptime(dateStop);
				orderSend.setOrderSendCreatetime(new Date());
				
				if(specifyNurseId==null||"".equals(specifyNurseId)){//如果指定护士为空就是全发订单
					//全发
					orderSend.setOrderSendType("0");
					int i = orderSendService.insertSelective(orderSend);
					if(i>0){
						netState.setData("订单生成成功");
						netState.setJson(orderId);
						netState.setErrorCode(NetState.SUCCESS);
					}else{
						netState.setData("订单生成失败");
						netState.setErrorCode(NetState.PARAMS_ERROR);
					}
				}else{//否则就是专属订单
					//指定
					orderSend.setOrderSendType("1");
					int i = orderSendService.insertSelective(orderSend);
					if(i>0){
						//将指定的护士插入到专属订单表
						String[] specifyNurseIds = specifyNurseId.split(",");
						OrderSendSpecial orderSendSpecial = new OrderSendSpecial();
						for(int c=0;c<specifyNurseIds.length;c++){
							//判断数据库中有没有该护士
							Nurse nurse = nurseService.selectForNurseId(specifyNurseIds[c]);
							if(nurse == null){
							}else{
								final String orderSendSpecialId = java.util.UUID.randomUUID().toString()
										.replaceAll("-", "");
//								orderSendSpecialIdretu = orderSendSpecialId;
								orderSendSpecial.setOrderSendSpecialId(orderSendSpecialId);
								orderSendSpecial.setOrderSendSpecialOrdersendid(orderId);
								orderSendSpecial.setOrderSendSpecialNurseid(specifyNurseIds[c]);
								orderSendSpecial.setOrderSendSpecialCreatetime(new Date());
								int e = orderSendService.insertSelectiveSpecial(orderSendSpecial);
								if(e>0){
									if(orderSendIspayment=="1" || "1".equals(orderSendIspayment)){
										nurseId = specifyNurseIds[c];
										//根据护士ID得到护士账号(手机号)
										Nurse nurse2 = nurseService.selectForNurseId(specifyNurseIds[c]);
										nursePhone = nurse2.getNurseName();
										Thread thread = new Thread(){
											public void run() {
												//向客户端发送推送
												String TITLE = "专属订单";
												String ALERT= "您有一条专属订单";
												String MSG_CONTENT= "您有一条专属订单:"+orderSendSpecialId;
												//指定推送
												JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
												//通知
												Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
												
												//发送短信
												SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nursePhone, "【小护健康】您有一条专属订单", null, null, "0",  null,  null,  null,  null, null,  null, null);
											};
										};
										thread.start();
									}
								}
							}
						}
						netState.setData("订单生成成功");
						netState.setJson(orderId);
						netState.setErrorCode(NetState.SUCCESS);
					}else{
						netState.setData("订单生成失败");
						netState.setErrorCode(NetState.PARAMS_ERROR);
					}
					
				}
			}
			return netState;
		}
	
	//修改订单信息
	/**
	 * 
	 * @param request
	 * @param orderSendId 订单ID
	 * @param orderSendBegintime 订单开始时间
	 * @param personId 守护人ID
	 * @param goodId 三级产品ID
	 * @param orderSendTrafficmoney 交通费用
	 * @param orderSendSavemoney 保险费用
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "updateOrderInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState updateOrderInfo(String orderSendId,String orderSendBegintime,String personId,String goodId,String orderSendTrafficmoney,String orderSendSavemoney)
			throws Exception {
		NetState netState = new NetState();
		if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("订单id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断该订单当前的状态
		OrderSend orderSend1 = orderSendService
				.selectOrderSendInfoById(orderSendId);
		String orderState = orderSend1.getOrderSendState();
		if(orderState != null && !"".equals(orderState)){
			netState.setData("该订单不在待预约状态,无法修改");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		OrderSend orderSend = new OrderSend();
		orderSend.setOrderSendId(orderSendId);
		if(orderSendBegintime!=null && !"".equals(orderSendBegintime)){
			Long NowTime = new Date().getTime();
			if(Long.parseLong(orderSendBegintime) < NowTime){
				netState.setData("开始时间不能小于当前时间");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				//开始时间（时间戳转化Date）
				Long timeLongBegin = Long.parseLong(orderSendBegintime);
				//结束时间
				//Long timeLongStop = Long.parseLong(orderSendStoptime);
		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        Date dateBegin = sdf.parse(sdf.format(timeLongBegin)); //日期格式
				orderSend.setOrderSendBegintime(dateBegin);
			}
		}
		if(personId!=null && !"".equals(personId)){//受护人不为空
			
			//存服务受护人ID
			orderSend.setOrderSendUsername(personId);
			//根据对象id查出受护人信息
			ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(personId);
			if(protectedPerson!=null || !"".equals(protectedPerson)){
				//身份证号
				orderSend.setOrderSendCard(protectedPerson.getProtectedPersonCard());
				//性别
				orderSend.setOrderSendSex(protectedPerson.getProtectedPersonSex());
				//年龄
				orderSend.setOrderSendAge(protectedPerson.getProtectedPersonAge());
				//受护地址 selectByPrimaryKey
				ProtectedAddress protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
				if(protectedAddress!= null){
					orderSend.setOrderSendAddree(protectedAddress.getProtectedAddressAddress());
				}
			}
		}
		BigDecimal goodsMoney = BigDecimal.ZERO;
		BigDecimal total = BigDecimal.ZERO;
		if(goodId!=null && !"".equals(goodId)){
			if(orderSendTrafficmoney==null || orderSendSavemoney==null){
				netState.setData("修改产品需要带上交通费和保险费参数");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			String[] goodIds = goodId.split(",");
			Goods goods = new Goods();
			
			for(int i =0; i<goodIds.length;i++){
				goods = goodsService.selectByPrimaryKey(goodIds[i]);
				if(goods!=null || "".equals(goods)){
					goodsMoney = goodsMoney.add(goods.getGoodsMoney());
				}else{
					netState.setData("不存在该服务,请重新选择");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
			}
			//产品收费项id
			orderSend.setOrderSendServicecontent(goodId);
			//通过产品id计算出订单服务费用
			orderSend.setOrderSendCostmoney(goodsMoney);
			//总的费用
			total = new BigDecimal(orderSendTrafficmoney).add(new BigDecimal(orderSendSavemoney)).add(goodsMoney);
			orderSend.setOrderSendTotalmoney(total.toString());
		}else{
			//如果没修改
			goodsMoney = orderSend1.getOrderSendCostmoney();
			total = new BigDecimal(orderSend1.getOrderSendTotalmoney());
		}
		int i = orderSendService.updateByOrderSendId(orderSend);
		if(i==0){
			netState.setData("修改失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			JSONObject jsonObject = new JSONObject();
			JSONArray array = new JSONArray();
			jsonObject.put("goodsMoney", goodsMoney);
			jsonObject.put("total", total);
			array.put(jsonObject);
			netState.setData("修改成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(array.toString());
		}
		return netState;
	}
	

	// 获取订单图片
	@RequestMapping(value = "GetOederPic", method = RequestMethod.POST)
	public @ResponseBody
	NetState GetOederPic(HttpServletRequest request, String orderSendId)
			throws Exception {
		NetState netState = new NetState();
		if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("订单id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		// 根据订单id查询图片地址
		String orderSendUserPic = "";
		OrderSend orderSend = orderSendService
				.selectOrderSendInfoById(orderSendId);
		// 如果有该条订单的记录
		if (orderSend != null && !"".equals(orderSend)) {
			orderSendUserPic = orderSend.getOrderSendUserpic();
		}
		if (orderSendUserPic != null && !"".equals(orderSendUserPic)) {
			netState.setData("订单图片获取成功");
			netState.setJson(orderSendUserPic);
			netState.setErrorCode(NetState.SUCCESS);
		} else {
			netState.setData("订单图片为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		return netState;
	}

	// 订单上传图片
	@RequestMapping(value = "uploadOederPic", method = RequestMethod.POST)
	public @ResponseBody
	NetState uploadOederPic(HttpServletRequest request, String orderSendId,
			String uploadPic) throws Exception {
		NetState netState = new NetState();
		if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("订单id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (uploadPic == null || "".equals(uploadPic)) {
			netState.setData("图片参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		SavePic savePic = new SavePic();
		// 根据订单id查询图片地址
		OrderSend orderSend1 = orderSendService
				.selectOrderSendInfoById(orderSendId);
		String orderSendUserPic = orderSend1.getOrderSendUserpic();

		// 上传的图片地址
		String userpic = "";
		// 更新到数据库的图片地址
		String newRemnantPic = "";
		// 多张图片处理
		if (uploadPic != null || !"".equals(uploadPic)) {
			userpic = savePic.manyImgPathAdd(request, orderSendId,
					"OrderSendPic", uploadPic);
		}
		// 将剩下的图片路径加上现在的图片路径保存到数据库
		if (orderSendUserPic != null && !"".equals(orderSendUserPic)) {
			newRemnantPic = orderSendUserPic + "," + userpic;
		} else {
			newRemnantPic = userpic;
		}
		// 将新地址填写到数据库
		OrderSend orderSend = new OrderSend();
		orderSend.setOrderSendId(orderSendId);
		orderSend.setOrderSendUserpic(newRemnantPic);
		int i = orderSendService.updateByOrderSendId(orderSend);

		if (i > 0) {
			netState.setData("上传成功");
			netState.setErrorCode(NetState.SUCCESS);
		} else {
			netState.setData("上传失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		return netState;
	}

	/****
	 * //订单删除图片
	 * 
	 * @param delPic
	 *            要删除的文件名字
	 * @param remnantPic
	 *            剩下的图片名字
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "delOederPic", method = RequestMethod.POST)
	public @ResponseBody
	NetState delOederPic(HttpServletRequest request, String orderSendId,
			String delPic) throws Exception {
		NetState netState = new NetState();
		if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("订单id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} else if (delPic == null || "".equals(delPic)) {
			netState.setData("图片1参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		OrderSend orderSend1 = orderSendService
				.selectOrderSendInfoById(orderSendId);

		// 得到数据库中的订单图片
		String orderSendPic = orderSend1.getOrderSendUserpic();
		String[] pic = orderSendPic.split(",");
		List<String> pictest = Arrays.asList(pic);
		// 排除后剩下的图片
		String string = "";
		// 裁剪后最后一位
		String finalPic = "";
		for (String remnantPic : pictest) {
			if (!remnantPic.equals(delPic)) {
				string += remnantPic + ",";
			}
		}
		if (string != null && !"".equals(string)) {
			finalPic = string.substring(0, string.length() - 1);
		}
		// 得到系统路径
		String webPath = request.getSession().getServletContext()
				.getRealPath("");
		String newwebPath = webPath.substring(0, webPath.length() - 9);

		// 删除文件夹图片
		new File(newwebPath + delPic).delete();
		// 将剩下图片保存到数据库
		OrderSend orderSend = new OrderSend();
		orderSend.setOrderSendId(orderSendId);
		orderSend.setOrderSendUserpic(finalPic);
		int i = orderSendService.updateByOrderSendId(orderSend);
		if (i > 0) {
			netState.setData("订单图片删除成功");
			netState.setErrorCode(NetState.SUCCESS);
		} else {
			netState.setData("订单图片删除失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		return netState;
	}

	/**
	 * 交通费和保险费
	 * **/
	@RequestMapping(value = "/otherCost", method = RequestMethod.POST)
	public @ResponseBody
	NetState otherCost() throws Exception {
		NetState netState = new NetState();
		// 交通费
		Traffic traffic = orderSendService.SelectTrafficInfo();
		// 保险费
		Save save = orderSendService.selectSaveInfo();
		Cost cost = new Cost();

		if (traffic == null && save != null) {
			// cost.setTrafficMoney(traffic.getTrafficCost());
			cost.setSaveCost(save.getSaveCost());
			netState.setData("查询成功（交通费为空）");
			netState.setJson(cost);
			netState.setErrorCode(NetState.SUCCESS);
		} else if (traffic != null && save == null) {
			cost.setTrafficMoney(traffic.getTrafficCost());
			// cost.setSaveCost(save.getSaveCost());
			netState.setData("查询成功（保险费为空）");
			netState.setJson(cost);
			netState.setErrorCode(NetState.SUCCESS);
		} else if (traffic == null && save == null) {
			netState.setData("交通费和保险费未设置");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			cost.setTrafficMoney(traffic.getTrafficCost());
			cost.setSaveCost(save.getSaveCost());
			netState.setData("查询成功");
			netState.setJson(cost);
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;

	}

	/****
	 * 查询我的订单详情（用户）
	 */
	@RequestMapping(value = "/OrderSendDescription", method = RequestMethod.POST)
	public @ResponseBody
	NetState OrderSendDescription(String userId, String orderState)
			throws Exception {
		NetState netState = new NetState();
		if (userId == null || "".equals(userId)) {
			netState.setData("id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			
			// 通过用户id查询所有订单
			List<OrderInfoByNurse> newlist = new ArrayList<OrderInfoByNurse>();
			List<OrderInfoByNurse> lastlist = new ArrayList<OrderInfoByNurse>();
			List<OrderInfoByNurse> list = orderSendService.selectOrderSendInfoByUserId(userId);

			// 获取订单受护人ID 
			
			List<String> personids = new ArrayList<String>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getOrderSendUsername() != null) {
					personids.add(list.get(i).getOrderSendUsername());
				
				}
			}
			// 根据订单状态查看接取人信息
			for (OrderInfoByNurse orderInfoByNurse : list) {
				// 服务产品信息
				String[] contentid = orderInfoByNurse
						.getOrderSendServicecontent().split(",");
				String newcontentid = "";
				String goodsName = "";
				String newgoosName = "";
				Goods goods = null;
				for (int c = 0; c < contentid.length; c++) {
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if (goods != null) {
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName += goodsName + ",";
					}
				}
				if (newcontentid != null || !"".equals(newcontentid)) {
					ManageNursingContent manageNursingContent = manageNursingContentService
							.selectmanageNursingContentById(newcontentid);
					if (manageNursingContent != null) {
						String contentname = manageNursingContent
								.getManageNursingContentName();
						newgoosName = newgoosName.substring(0,
								newgoosName.length() - 1);
						orderInfoByNurse.setOrderSendServicecontent(contentname
								+ ":" + newgoosName);
					} else {
						orderInfoByNurse.setOrderSendServicecontent("该服务不存在"
								+ ":" + newgoosName);
					}
				}
				//如果是专属订单能看到护士真实照片和名字
				//根据护士ID查询真实照片和名字
				
				if(orderInfoByNurse.getOrderSendType() == "1" || "1".equals(orderInfoByNurse.getOrderSendType())){
					String trueName = "";
					String truePic = "";
					//根据订单ID得到专属的护士ID
					List<OrderSendSpecial> orderSendSpecial =orderSendSpecialService.selectNurseIdByOrderIdforSpecial(orderInfoByNurse.getOrderSendId());
					//根据护士ID查询	真实照片和名字
					for(OrderSendSpecial orderSendSpecial2 : orderSendSpecial){
						NursePaymentSettings nursePaymentSettings = nurseService.selectNurseInfoAndNursePaymentSettings(orderSendSpecial2.getOrderSendSpecialNurseid());
						if(nursePaymentSettings!=null &&!"".equals(nursePaymentSettings)){
							trueName+= nursePaymentSettings.getNurseTruename()+","+trueName;
							truePic+=nursePaymentSettings.getNursePaymentSettingsOverone()+","+truePic;
						}
					}
					if(truePic!=null && !"".equals(truePic)){
						orderInfoByNurse.setNurseTruePic(truePic.substring(0, truePic.length()-1));
					}
					if(trueName!=null && !"".equals(trueName)){
						orderInfoByNurse.setNurseTrueName(trueName.substring(0, trueName.length()-1));
					}
					
				}

				// 如果不为0 订单就有人接
				if (orderInfoByNurse.getOrderSendState() != "0"
						&& !"0".equals(orderInfoByNurse.getOrderSendState())) {
					// 通过订单id查询护士信息
					Nurse nurse = nurseService
							.selectNurseInfoByOrder(orderInfoByNurse
									.getOrderSendId());
					// 将护士信息的参数填充到OrderInfoByNurse实体类中
					if (nurse == null || "".equals(nurse)) {

					} else {
						orderInfoByNurse.setNurseId(nurse.getNurseId());
						// 如果该服务在进行中可以看到护士的真实姓名
						if ("-1".equals(orderInfoByNurse.getOrderSendState())
								|| "2".equals(orderInfoByNurse
										.getOrderSendState())) {
							orderInfoByNurse.setNurseNick(nurse
									.getNurseTruename());
						} else {// 否则只能看到昵称
							orderInfoByNurse.setNurseNick(nurse.getNurseNick());
						}
						orderInfoByNurse.setNursePhone(nurse.getNursePhone());
						orderInfoByNurse.setNurseSex(nurse.getNurseSex());
						orderInfoByNurse.setNurseAge(nurse.getNurseAge());
						// 护士职称
						orderInfoByNurse.setNurseJob(nurse.getNurseJob());
						// 将接单的状态set orderReceivestate
						orderInfoByNurse
								.setOrderReceivestate(orderReceiverService
										.selectStateNurseOrderInfoByid(
												orderInfoByNurse
														.getOrderSendId())
										.getOrderReceivestate());
					}
				}
				newlist.add(orderInfoByNurse);
			}
			// 通过传过来的状态筛选订单状态
			for (OrderInfoByNurse orderInfoByNurse2 : newlist) {
				String state = orderInfoByNurse2.getOrderSendState();
				if (orderState == "0" || "0".equals(orderState)) {// 为0待预约
					if ("".equals(state) || state == null) {
						lastlist.add(orderInfoByNurse2);
					}
				}
				if (orderState == "1" || "1".equals(orderState)) {// 为1已预约
					if ("0".equals(state) || state == "0" || "8".equals(state) || state=="8" ) {//(等待客服处理的订单)
						lastlist.add(orderInfoByNurse2);
					}
				}
				if (orderState == "2" || "2".equals(orderState)) {// 为2正在进行中
					if ("2".equals(state) || state == "2" || "1".equals(state)
							|| state == "1") {
						lastlist.add(orderInfoByNurse2);
					}
				}
				if (orderState == "3" || "3".equals(orderState)) {// 为3已完成(取消的订单也显示在已完成中)
					if ("3".equals(state) || state == "3" || "4".equals(state) || state=="4") {
						lastlist.add(orderInfoByNurse2);
					}
				}
			}
			List<String> orderIds = new ArrayList<String>();
			for(int i = 0; i < lastlist.size(); i++){
				orderIds.add(lastlist.get(i).getOrderSendId());
			}
			List<Evaluate> evaluates = new ArrayList<Evaluate>();
			EvaluateExample example = new EvaluateExample();
			com.chance.ssm.po.EvaluateExample.Criteria criteria3 = example.createCriteria();
			if(orderIds.size()>0){
			criteria3.andEvaluateOrderSendIdIn(orderIds);
			}
			evaluates = evaluateService.selectByExample(example);
				for(int i = 0; i < evaluates.size(); i++){
					for(int j = 0; j < lastlist.size(); j++){
						if(lastlist.get(j).getOrderSendId().equals(evaluates.get(i).getEvaluateOrderSendId())){
							lastlist.get(j).setIsEvaluate(1);
						}
					}
				}
			// 获取受护人信息
			if (personids.size() > 0) {
				List<ProtectedPerson> personList = new ArrayList<ProtectedPerson>();
				ProtectedPersonExample personExample = new ProtectedPersonExample();
				Criteria criteria = personExample.createCriteria();
				criteria.andProtectedPersonIdIn(personids);
				personList = protectedPersonService
						.selectByExample(personExample);
				// 如果有值则把受护人姓名加上去
				if (personList.size() > 0) {
					List<String> personIdList = new ArrayList<String>();
					for (int n = 0; n < lastlist.size(); n++) {
						personIdList
								.add(lastlist.get(n).getOrderSendUsername());
					}
					for (int i = 0; i < lastlist.size(); i++) {
						
						for (int j = 0; j < personList.size(); j++) {
							
							if (personList.get(j).getProtectedPersonId()
									.equals(personIdList.get(i))) {
								String personId = personIdList.get(i);
								String personName = personList.get(j).getProtectedPersonName();
								//通过受护人地址id得到受护人地址信息
								ProtectedAddress protectedAddress = protectedAddressService.selectByPrimaryKey(personList.get(j).getProtectedAddressId());
								if(protectedAddress==null || "".equals(protectedAddress)){
									lastlist.get(i).setOrderSendAddree("经纬度为空");
								}else{
									//通过受护id查询经纬度
									Double addressPositionX = protectedAddress.getProtectedAddressPositionX();
									Double addressPositionY = protectedAddress.getProtectedAddressPositionY();
									String address = personList.get(j).getProtectedAddress();
									String personIdAndName = personId + ","	+ personName;
									lastlist.get(i).setOrderSendUsername(personIdAndName);
									lastlist.get(i).setOrderSendAddree(addressPositionX+","+addressPositionY+","+address);
									lastlist.get(i).setProtectedPersonNexus(personList.get(j).getProtectedPersonNexus());
									lastlist.get(i).setProtectedPersonHeight(personList.get(j).getProtectedPersonHeight());
									lastlist.get(i).setProtectedPersonWeight(personList.get(j).getProtectedPersonWeight());
									//详细地址
									lastlist.get(i).setDetailedAddress(personList.get(j).getProtectedPersonOverone());
								}
							}
						}
					}
				}
			}
			if (lastlist.size() == 0) {
				netState.setData("暂无该记录订单");
				netState.setJson(lastlist);
				netState.setErrorCode(NetState.SUCCESS);
				return netState;
			}
			for (OrderInfoByNurse orderInfoByNurse : lastlist) {
				
				String orderSendState = orderInfoByNurse.getOrderSendState();
				
				if(orderSendState == "4" || "4".equals(orderSendState)){//取消状态的订单
					 //查询取消订单的信息
				    OrderSendCancalVo orderSendCancalVo =  orderCancelOrderService.selectOrderAndCancaByOrderId(orderInfoByNurse.getOrderSendId());
				    //是否退款
				    Integer whetherRefund = orderSendCancalVo.getOrderCancalWhetherRefund();
					//得到是用户还是护士取消的
					Integer identity = orderInfoByNurse.getOrderSendStoptime();
					if(identity == 0 || "0".equals(identity)){//用户取消
						if(whetherRefund == 0 || "0".equals(whetherRefund)) {
							orderInfoByNurse.setOrderSpeakByCancel("已退款");
						}else{
							orderInfoByNurse.setOrderSpeakByCancel("待退款");
						}
						
					}else{//护士取消
						Integer userAgree = orderSendCancalVo.getOrderCancalUserAgree();
						if(userAgree == 0 || "0".equals(userAgree)){//用户同意
							if(whetherRefund == 0 || "0".equals(whetherRefund)) {
								orderInfoByNurse.setOrderSpeakByCancel("已退款");
							}else{
								orderInfoByNurse.setOrderSpeakByCancel("待退款");
							}
						}else{
							if(whetherRefund == 0 || "0".equals(whetherRefund)) {
								orderInfoByNurse.setOrderSpeakByCancel("已退款");
							}else{
								orderInfoByNurse.setOrderSpeakByCancel("待客服介入");
							}
						}
					}
				}
			}
			
			
			netState.setData("查询成功");
			netState.setJson(lastlist);
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}

	// 根据id查询订单详情（用户）
	@RequestMapping(value = "/OrderSendDescriptionById", method = RequestMethod.POST)
	public @ResponseBody
	NetState OrderSendDescriptionById(String userId, String orderSendId,
			Double latitude, Double longitude) throws Exception {
		NetState netState = new NetState();
		if (userId == null || "".equals(userId)) {
			netState.setData("用户id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("订单id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if ("".equals(latitude) || "".equals(longitude)) {
			netState.setData("经纬度错误错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			// 通过订单id查询订单详情
			OrderInfoByNurse orderInfoByNurse = orderSendService
					.selectOrderSendInfoByIdVo(orderSendId);
			if (orderInfoByNurse == null || "".equals(orderInfoByNurse)) {
				netState.setData("没有该订单的信息");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			} else {
				// 三级产品名
				String[] contentid = orderInfoByNurse
						.getOrderSendServicecontent().split(",");
				String newcontentid = "";
				String goodsName = "";
				String newgoosName = "";
				Goods goods = null;
				for (int i = 0; i < contentid.length; i++) {
					goods = goodsService.selectByPrimaryKey(contentid[i]);
					if (goods != null) {
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName += goodsName + ",";
					}
				}
				if (newcontentid != null || !"".equals(newcontentid)) {
					ManageNursingContent manageNursingContent = manageNursingContentService
							.selectmanageNursingContentById(newcontentid);
					if (manageNursingContent != null) {
						//二级服务ID
						String contentId = manageNursingContent.getManageNursingContentId();
						//二级服务名
						String contentname = manageNursingContent
								.getManageNursingContentName();
						newgoosName = newgoosName.substring(0,
								newgoosName.length() - 1);
						orderInfoByNurse.setOrderSendServicecontent(contentname
								+ ":" + newgoosName);
						orderInfoByNurse.setContentId(contentId);
					} else {
						orderInfoByNurse.setOrderSendServicecontent("该服务不存在"
								+ ":" + newgoosName);
					}
				}
				// 得到受护人id
				String orderSendUserName = orderInfoByNurse
						.getOrderSendUsername();
				if (orderSendUserName != null && !"".equals(orderSendUserName)) {
					// 通过受护人id得到受护人信息
					ProtectedPerson protectedPerson = protectedPersonService
							.selectByPrimaryKey(orderSendUserName);
					if (protectedPerson == null) {
						orderInfoByNurse.setOrderSendUsername("没有该受护人信息");
					} else {
						// 得到受护人的名字、性别可年龄
						String neworderSendUserName = orderSendUserName + ","
								+ protectedPerson.getProtectedPersonName();
						orderInfoByNurse
								.setOrderSendUsername(neworderSendUserName);
						orderInfoByNurse.setOrderSendSex(protectedPerson
								.getProtectedPersonSex());
						orderInfoByNurse.setOrderSendAge(protectedPerson
								.getProtectedPersonAge());

						// 通过受护人地址id得到受护人地址信息
						ProtectedAddress protectedAddress = protectedAddressService
								.selectByPrimaryKey(protectedPerson
										.getProtectedAddressId());
						if (protectedAddress == null
								|| "".equals(protectedAddress)) {
							orderInfoByNurse.setOrderSendAddree("经纬度为空");
						} else {
							// 得到详细地址描述
							String addressString = protectedAddress
									.getProtectedAddressAddress();
							// 通过受护id查询经纬度
							Double addressPositionX = protectedAddress
									.getProtectedAddressPositionX();
							Double addressPositionY = protectedAddress
									.getProtectedAddressPositionY();
							orderInfoByNurse
									.setOrderSendAddree(addressPositionX + ","
											+ addressPositionY + ","
											+ addressString);
							orderInfoByNurse.setProtectedPersonNexus(protectedPerson.getProtectedPersonNexus());
							orderInfoByNurse.setProtectedPersonHeight(protectedPerson.getProtectedPersonHeight());
							orderInfoByNurse.setProtectedPersonWeight(protectedPerson.getProtectedPersonWeight());
							//详细地址
							orderInfoByNurse.setDetailedAddress(protectedPerson.getProtectedPersonOverone());
						}
					}
				} else {
					orderInfoByNurse.setOrderSendUsername("受护人信息为空");
				}
			}
			// 服务产品信息
			//如果是专属订单能看到护士真实照片和名字
			//根据护士ID查询真实照片和名字
			
			if(orderInfoByNurse.getOrderSendType() == "1" || "1".equals(orderInfoByNurse.getOrderSendType())){
				String trueName = "";
				String truePic = "";
				//根据订单ID得到专属的护士ID
				List<OrderSendSpecial> orderSendSpecial =orderSendSpecialService.selectNurseIdByOrderIdforSpecial(orderInfoByNurse.getOrderSendId());
				//根据护士ID查询	真实照片和名字
				for(OrderSendSpecial orderSendSpecial2 : orderSendSpecial){
					NursePaymentSettings nursePaymentSettings = nurseService.selectNurseInfoAndNursePaymentSettings(orderSendSpecial2.getOrderSendSpecialNurseid());
					if(nursePaymentSettings!=null &&!"".equals(nursePaymentSettings)){
						trueName+= nursePaymentSettings.getNurseTruename()+","+trueName;
						truePic+=nursePaymentSettings.getNursePaymentSettingsOverone()+","+truePic;
					}
				}
				orderInfoByNurse.setNurseTruePic(truePic.substring(0, truePic.length()-1));
				orderInfoByNurse.setNurseTrueName(trueName.substring(0, trueName.length()-1));
			}
			
			// 如果不为0 订单就有人接/
			if (orderInfoByNurse.getOrderSendState() != "0"
					|| !"0".equals(orderInfoByNurse.getOrderSendState())) {
				// 通过订单id查询护士信息
				Nurse nurse = nurseService
						.selectNurseInfoByOrder(orderInfoByNurse
								.getOrderSendId());
				// 将护士信息的参数填充到OrderInfoByNurse实体类中
				if (nurse == null || "".equals(nurse)) {

				} else {
					//根据护士ID查询真实照片和名字
					/*NursePaymentSettings nursePaymentSettings = nurseService.selectNurseInfoAndNursePaymentSettings(nurse.getNurseId());
					String truePic = nursePaymentSettings.getNursePaymentSettingsOverone();
					String trueName = nursePaymentSettings.getNurseTruename();
					System.out.println("真实照片="+truePic+",真实姓名="+trueName);*/
					
					
					orderInfoByNurse.setNurseId(nurse.getNurseId());
					// 如果该服务在进行中可以看到护士的真实姓名
					if ("-1".equals(orderInfoByNurse.getOrderSendState())
							|| "2".equals(orderInfoByNurse.getOrderSendState())) {
						orderInfoByNurse.setNurseNick(nurse.getNurseTruename());
					} else {// 否则只能看到昵称
						orderInfoByNurse.setNurseNick(nurse.getNurseNick());
					}
					orderInfoByNurse.setNursePhone(nurse.getNursePhone());
					orderInfoByNurse.setNurseSex(nurse.getNurseSex());
					orderInfoByNurse.setNurseAge(nurse.getNurseAge());
					orderInfoByNurse.setNurseHeader(nurse.getNurseHeader());
					orderInfoByNurse.setNurseWorkNnit(nurse.getNurseWorkUnit());
					orderInfoByNurse.setNurseNote(nurse.getNurseNote());
					// 护士职称
					orderInfoByNurse.setNurseJob(nurse.getNurseJob());

					//获取医院ID
					String hosId =  nurse.getNurseWorkUnit();
					
					if(hosId!=null && !"".equals(hosId)){
					  HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
					    if(hospitalVO!=null && !"".equals(hospitalVO)){
					    	orderInfoByNurse.setNurseWorkNnit(hospitalVO.getHospitalName());
					    }else{
					    	orderInfoByNurse.setNurseWorkNnit("该护士未选定医院");
						}
					}else{
						orderInfoByNurse.setNurseWorkNnit("其它医院");
					}
					
					
					// 将接单的状态set orderReceivestate
					orderInfoByNurse.setOrderReceivestate(orderReceiverService
							.selectStateNurseOrderInfoByid(
									orderInfoByNurse.getOrderSendId())
							.getOrderReceivestate());

					if (!"".equals(nurse.getNursePositionX())
							&& !"".equals(nurse.getNursePositionY())) {
						orderInfoByNurse.setDistance(LzhUtils.LantitudeLongitudeDist(nurse.getNursePositionX(),nurse.getNursePositionY(), latitude,longitude));
					}
				}
			}
			//判断订单有没有被评价
			List<EvaluateVO> evaluate = evaluateService.selectRvaluateIsNo(userId, orderSendId);
			if(evaluate.size()>0){//已评价
				orderInfoByNurse.setIsEvaluate(1);
			}else{
				orderInfoByNurse.setIsEvaluate(0);
			}
			netState.setData("查询成功");
			netState.setJson(orderInfoByNurse);
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}

	/**
	 * 修改支付状态并将订单变成等待客服发放订单状态
	 * **/
	@RequestMapping(value = "/UpdateIsPayState", method = RequestMethod.POST)
	public @ResponseBody
	NetState UpdateIsPayState(String orderSendId,BigDecimal finalyMoney,String userCouponId) throws Exception {
		NetState netState = new NetState();
		
		if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(finalyMoney == null || "".equals(finalyMoney)){
			netState.setData("请输入您最终订单的金额");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		// 判断该订单有没有过期p
		final OrderSend orderSend = orderSendService
				.selectOrderSendInfoById(orderSendId);
		if(null ==orderSend || "".equals(orderSend)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		// 得到订单开始时间
		Date beginTime = orderSend.getOrderSendBegintime();
		int i = beginTime.compareTo(new Date());
		if (i < 0) {// 订单时间小于当前时间
			netState.setData("该订单已过期");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//扣除余额
		//获取用户的余额
		String userId = orderSend.getOrderSendUserid();
		////得到订单的总额
		//BigDecimal total =new BigDecimal(orderSend.getOrderSendTotalmoney());
		User user = new User();
		user = userService.selectForUserByID(userId);
		//获取余额
		BigDecimal userBalance = user.getUserBalance();
		if(finalyMoney.compareTo(userBalance)==1){
			netState.setData("余额不足，请充值");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//生成一条资金表数据
		CapitalUserPool capitalUserPool = new CapitalUserPool();
		capitalUserPool.setCapitalUserPoolId(java.util.UUID.randomUUID().toString()
				.replaceAll("-", ""));
		capitalUserPool.setCapitalUserPoolPeopleid(userId);
		capitalUserPool.setCapitalUserPoolOrdersendid(orderSendId);
		capitalUserPool.setCapitalUserPoolPeopleIdentity(0);
		capitalUserPool.setCapitalUserPoolMoney(finalyMoney);
		capitalUserPool.setCapitalUserPoolSpeak("发布订单");
		capitalUserPool.setCapitalUserPoolCreatetime(new Date());
		int e = capitalUserPoolService.insertSelective(capitalUserPool);
		if(e==0){
			netState.setData("资金记录生成失败，请重试");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//扣除服务费之后剩下的余额
		BigDecimal FinUserBalance = userBalance.subtract(finalyMoney);
		//将余额更新到用户
		User user2 = new User();
		user2.setUserBalance(FinUserBalance);
		UserExample userExample = new UserExample();
		com.chance.ssm.po.UserExample.Criteria criteria1 = userExample.createCriteria();
		criteria1.andUserIdEqualTo(userId);
		int i1 = userService.updateByExampleSelective(user2, userExample);
		if(i1==0){
			netState.setData("支付失败，请重新支付");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		// 修改支付状态(专属单，不通过客服，直接发送给护士,普通单客服介入) 
		OrderSend orderSend2 = new OrderSend();
		orderSend2.setOrderSendId(orderSendId);
		orderSend2.setOrderSendIspayment("1");
		if(orderSend.getOrderSendType()=="1" || "1".equals(orderSend.getOrderSendType())){//全发
			orderSend2.setOrderSendState("0");
		}else{
			orderSend2.setOrderSendState("8");
		}
		//加入优惠券ID
		orderSend2.setOrderSendCoupon(userCouponId);
		//最后实际付的钱
		orderSend2.setOrderSendTotalmoney(finalyMoney.toString());
		
		int c = orderSendService.updateByOrderSendId(orderSend2);
		//如果订单ID和优惠券都不为空说明使用了优惠券
		//根据订单Id得到优惠券信息
		if(orderSendId!=null && !"".equals(orderSendId)){
			if(userCouponId!=null && !"".equals(userCouponId)){
				//将优惠券修改成使用过
				CouponUser couponUser = new CouponUser();
				couponUser.setCouponUserId(userCouponId);
				couponUser.setCouponUserIstouse(0);
				couponService.updateUCouponUserByPrimaryKeySelective(couponUser);
			}
		}
		//根据用户ID得到用户账号(手机号)
		String userPhone = user.getUserName();
		orderuserId = user.getUserId();
		//给用户
		Thread thread1 = new Thread(){
			//给用户推送
			public void run() {
				//向客户端发送推送
				String TITLE = "发订单";
				String ALERT= "感谢您使用安心护平台，已收到您的订单，我们将尽快为您安排";
				String MSG_CONTENT= "感谢您使用安心护平台，已收到您的订单，我们将尽快为您安排";
				//指定推送
				JdpushPeo.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,orderuserId);
				//通知
				Jdpush.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,orderuserId);
				
				//判断该订单是否专属单
				//将推送记录到用户站内信中
				StandInnerLetter innerLetter = new StandInnerLetter();
				innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter.setStandInnerLetterUserId(orderuserId);
				innerLetter.setStandInnerLetterUserIdentity(0);
				innerLetter.setStandInnerLetterTitle("发订单");
				//0订单消息/1资金消息/2系统通知
				innerLetter.setStandInnerLetterUserType(0);
				SimpleDateFormat format = new SimpleDateFormat();
				if(orderSend.getOrderSendType() == "1" || "1".equals(orderSend.getOrderSendType())){
					innerLetter.setStandInnerLetterContent("(专属)感谢您使用安心护平台，"+format.format(new Date())+"已收到您预付款¥"+orderSend.getOrderSendTotalmoney()+",单号为"+orderSend.getOrderSendNumbers()+"订单，我们将尽快为您安排");
				}else{
					innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，"+format.format(new Date())+"已收到您预付款¥"+orderSend.getOrderSendTotalmoney()+",单号为"+orderSend.getOrderSendNumbers()+"订单，我们将尽快为您安排");
				}
				innerLetter.setStandInnerLetterCreatetime(new Date());
				try {
					standInnerLetterService.insertSelective(innerLetter);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		};
		thread1.start();
		//给用户发一条短信
		SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, user2.getUserName(), "【小护健康】感谢您使用安心护平台，已收到您的订单，我们将尽快为您安排", null, null, "0",  null,  null,  null,  null, null,  null, null);
		if (c > 0) {
			if(orderSend.getOrderSendType() == "1" || "1".equals(orderSend.getOrderSendType())){//如果订单状态是指定
				//通过订单id查询专属护士
				List<OrderSendSpecial> orderSendSpecials = new ArrayList<OrderSendSpecial>();
				OrderSendSpecialExample oSendSpecialExample = new OrderSendSpecialExample();
				com.chance.ssm.po.OrderSendSpecialExample.Criteria criteria = oSendSpecialExample.createCriteria();
				criteria.andOrderSendSpecialOrdersendidEqualTo(orderSendId);
				oSendSpecialExample.setOrderByClause("order_send_special_createtime desc");
				orderSendSpecials = oSpecialService.selectByExample(oSendSpecialExample);
				int orderSendSpecialsize = orderSendSpecials.size();
				for (int j = 0; j < orderSendSpecialsize; j++) {
					nurseId = orderSendSpecials.get(j).getOrderSendSpecialNurseid();
					//根据护士ID得到护士账号(手机号)
					Nurse nurse2 = nurseService.selectForNurseId(nurseId);
					nursePhone = nurse2.getNurseName();
					Thread thread = new Thread() {
						public void run() {
							// 向客户端发送推送
							String TITLE = "专属订单";
							String ALERT = "亲，有一条您的专属单，请不要让您的病人等太久哦";
							String MSG_CONTENT = "亲，有一条您的专属单，请不要让您的病人等太久哦";
							// 指定推送
							JdpushPeo.testSendPush(appKey, masterSecret, TITLE,
									ALERT, MSG_CONTENT, nurseId);
							//通知
							Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
							
							//发送短信
							SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nursePhone, "【小护健康】亲，有一条您的专属单，请不要让您的病人等太久哦", null, null, "0",  null,  null,  null,  null, null,  null, null);
							
							//将推送记录到护士站内信中
							StandInnerLetter innerLetter = new StandInnerLetter();
							innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							innerLetter.setStandInnerLetterUserId(nurseId);
							innerLetter.setStandInnerLetterUserIdentity(1);
							//0订单消息/1资金消息/2系统通知
							innerLetter.setStandInnerLetterUserType(0);
							innerLetter.setStandInnerLetterTitle("专属订单");
							innerLetter.setStandInnerLetterContent("亲，有一条您的专属单，请不要让您的病人等太久哦");
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
					////将推送记录到用户站内信中
				}
			}
			netState.setData("支付成功");
			netState.setErrorCode(NetState.SUCCESS);
		} else {
			netState.setData("支付失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		return netState;
	}
	/**
	 * 取消订单(用户取消不需要护士确认,护士取消需要用户确认)
	 * @param identity 0用户1护士
	 * **/
	@RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
	public @ResponseBody
	NetState cancelOrder(String orderSendId,String userId,Integer identity) throws Exception {
		NetState netState = new NetState();
		if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (userId == null || "".equals(userId)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (identity == null || "".equals(identity)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//查看该订单是否已被取消中
		OrderCancelOrder orderCancelOrder = orderCancelOrderService.selectByPrimaryKey(orderSendId);
		final SimpleDateFormat format = new SimpleDateFormat();
		//判断订单
		final OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
		String orderSendState =orderSend.getOrderSendState();
		
		if(orderSend==null || "".equals(orderSend)){
			netState.setData("该订单不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		final Date nowTime = new Date();
		
		//接单表
		final OrderReceiverAndOrderVO orderReceiver= orderReceiverService.selectStateNurseOrderInfoByid(orderSendId);
		//如果是用户,判断该订单是不是该用户发布的
		if(identity==0){
			if(userId!=orderSend.getOrderSendUserid() && !userId.equals(orderSend.getOrderSendUserid())){
				netState.setData("该订单不是该用户发布");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
		}else{//判断该订单是不是该护士接取的
			
			if(orderCancelOrder!=null&&!"".equals(orderCancelOrder)){
				netState.setData("请勿重复取消该订单,等候用户确认");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			if(orderReceiver==null){
				netState.setData("数据异常,该订单没有被接取");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				if(!userId.equals(orderReceiver.getOrderNurseid())){
					netState.setData("该订单不是该护士接取的");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
			} 
		}
		
		OrderCancelOrder orderCancelOrder2 = new OrderCancelOrder();
		orderCancelOrder2.setOrderCancelOrderSendId(orderSendId);//订单ID
		if(orderSendState=="0"||"0".equals(orderSendState) || orderSendState=="8"||"8".equals(orderSendState)){//如果该订单是发布中的状态或者是等待客服发放的状态
			if(identity==1){
				netState.setData("数据异常,不存在正在发布的订单被护士取消的情况");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			
			orderCancelOrder2.setOrderCancalOrderState(5);//订单状态
			//用户取消
			orderCancelOrder2.setOrderCancalUserAgree(0);//0同意1不同意
			orderCancelOrder2.setOrderCancalUserCancelTime(nowTime);//取消的时间
			orderCancelOrder2.setOrderCancalUserAgreeTime(nowTime);//确认时间
			
			//修改订单状态
			OrderSend orderSend2 = new OrderSend();
			orderSend2.setOrderSendId(orderSendId);
			orderSend2.setOrderSendState("4");
			//取消人的身份0用户1护士
			orderSend2.setOrderSendStoptime(0);
			//将订单的状态修改成取消
			orderSendService.updateByOrderSendId(orderSend2);
			
			//取消时系统自动生成一条反馈(反馈工单号+订单号)，
			//客服处理（标准话术+退款/换护士/原人处理）
			Complaint complaint = new Complaint();
			complaint.setComplaintId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			complaint.setComplaintUserid(userId);
			//订单ID
			complaint.setComplaintContentNote(orderSendId);
			complaint.setComplaintIdentity(0);
			//投诉单号
			complaint.setComplaintNumber(RandomUtil.getRandomMath());
			complaint.setComplaintHandleMode(0);
			complaint.setComplaintSpareone("2");
			complaint.setComplaintSparetwo("0");
			
			/*complaint.setComplaintContentOvertow(orderReceiver.getOrderNurseid());*/
			
			complaint.setComplaintContentCreatetime(new Date());
			//得到订单的创建时间
			Date OrdercreateTime = orderSend.getOrderSendCreatetime();
			SimpleDateFormat sdf = new SimpleDateFormat();
			complaint.setComplaintSparefive(sdf.format(OrdercreateTime));
			complaintService.insertSelective(complaint);
		}else{
			if(orderReceiver==null || "".equals(orderReceiver)){ 
				netState.setData("数据异常,不存在已被接取的订单不存在的记录");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			//取消订单表的状态  0已接单1已沟通2已出发3开始服务4已完成5发布中
			//接单表的状态  0已接单1已沟通2已出发3开始服务4已完成
			orderCancelOrder2.setOrderCancalOrderState(Integer.parseInt(orderReceiver.getOrderReceivestate()));//订单状态
			// 服务产品信息
			String[] contentid = orderSend.getOrderSendServicecontent().split(",");
			String goodsName = "";
			String newgoosName = "";
			Goods goods = null;
			for (int c = 0; c < contentid.length; c++) {
				goods = goodsService.selectByPrimaryKey(contentid[c]);
				if (goods != null) {
					goodsName = goods.getGoodsName();
					newgoosName += goodsName + ",";
				}
			}
			final JSONArray array = new JSONArray();
			JSONObject dami = new JSONObject();
			dami.put("orderSendId", orderSendId);
			dami.put("contentName", newgoosName);
			dami.put("beginTime", orderSend.getOrderSendBegintime().getTime());
			array.put(dami);
			//修改订单状态
			OrderSend orderSend2 = new OrderSend();
			orderSend2.setOrderSendId(orderSendId);
			orderSend2.setOrderSendState("4");
			if(identity==0||"0".equals(identity)){
				//用户取消
				orderCancelOrder2.setOrderCancalUserAgree(0);//0同意1不同意
				orderCancelOrder2.setOrderCancalUserCancelTime(nowTime);//取消的时间
				orderCancelOrder2.setOrderCancalUserAgreeTime(nowTime);//确认时间
				
				//取消人的身份0用户1护士
				orderSend2.setOrderSendStoptime(0);
				//取消时间
				orderSend2.setOrderSendFinishOrderTime(nowTime);
				
				//修改接单表状态
				OrderReceiver orderReceiver3 = new OrderReceiver();
				orderReceiver3.setOrderReceivestate("5");
				orderReceiver3.setOrderNurseid(userId);
				orderReceiver3.setOrderOrdersendid(orderSendId);
				orderReceiverService.updateOrderReceiverState(orderReceiver3);
				
				//根据用户ID得到用户账号(手机号)
				User user = userService.selectForUserByID(orderSend.getOrderSendUserid());
				String userPhone = user.getUserName();
				orderuserId = user.getUserId();
				//给用户
				SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】感谢您使用安心护平台，您的订单已取消，你的预付款我们将按规定退回，希望再次为您服务", null, null, "0",  null,  null,  null,  null, null,  null, null);
				Thread thread = new Thread(){
					//给用户推送
					public void run() {
						//向客户端发送推送
						String TITLE = "取消订单";
						String ALERT= "感谢您使用安心护平台，您的订单已取消，你的预付款我们将按规定退回，希望再次为您服务";
						String MSG_CONTENT= "感谢您使用安心护平台，您的订单已取消，你的预付款我们将按规定退回，希望再次为您服务";
						//指定推送
						JdpushPeo.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,orderuserId);
						//通知
						Jdpush.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,orderuserId);
						
						
						////将推送记录到用户站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(orderuserId);                      
						innerLetter.setStandInnerLetterUserIdentity(0);
						innerLetter.setStandInnerLetterTitle("订单取消");
						//0订单消息/1资金消息/2系统通知
						innerLetter.setStandInnerLetterUserType(0);
						
						//得到订单类型
						String orderSendType = orderSend.getOrderSendType();
						if(orderSendType == "1" || "1".equals(orderSendType)){
							innerLetter.setStandInnerLetterContent("(专属)感谢您使用安心护平台，您的单号为"+orderSend.getOrderSendNumbers()+"订单于"+format.format(nowTime)+"已被您取消，你的预付款我们将按规定退回，希望再次为您服务");
						}else{
							innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，您的单号为"+orderSend.getOrderSendNumbers()+"订单于"+format.format(nowTime)+"已被您取消，你的预付款我们将按规定退回，希望再次为您服务");
						}
						innerLetter.setStandInnerLetterCreatetime(nowTime);
						try {
							standInnerLetterService.insertSelective(innerLetter);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
				};
				thread.start();
				//给护士发
				//根据订单ID得到护士新
				OrderReceiverAndOrderVO orderReceiverAndOrderVO = orderReceiverService.selectStateNurseOrderInfoByid(orderSendId);
				Nurse nurse = nurseService.selectForNurseId(orderReceiverAndOrderVO.getOrderNurseid());
				String nursePhone = "";
				if(orderReceiverAndOrderVO!=null && !"".equals(orderReceiverAndOrderVO)){
					if(nurse!=null &&!"".equals(nurse)){
						nursePhone = nurse.getNurseName();
						nurseId = nurse.getNurseId();
					}
				}
				SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nursePhone, "【小护健康】亲，您的一个订单已被病人取消，希望再次为您提供机会", null, null, "0",  null,  null,  null,  null, null,  null, null);
				Thread thread1 = new Thread(){
					//给护士推送
					public void run() {
						//向客户端发送推送
						String TITLE = "取消订单";
						String ALERT= "亲，您的一个订单已被病人取消，希望再次为您提供机会";
						String MSG_CONTENT= "亲，您的一个订单已被病人取消，希望再次为您提供机会";
						//指定推送
						JdpushPeo.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
						//通知
						Jdpush.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
						
						////将推送记录到护士站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(nurseId);                              
						innerLetter.setStandInnerLetterUserIdentity(1);
						innerLetter.setStandInnerLetterTitle("订单取消");
						//0订单消息/1资金消息/2系统通知
						innerLetter.setStandInnerLetterUserType(0);
						innerLetter.setStandInnerLetterContent("亲，您于"+format.format(orderReceiver.getOrderCreatetime())+"接取单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(nowTime)+"已被病人取消，希望再次为您提供机会");
						innerLetter.setStandInnerLetterCreatetime(nowTime);
						try {
							standInnerLetterService.insertSelective(innerLetter);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
				};
				thread1.start();
				
				//取消时系统自动生成一条反馈(反馈工单号+订单号)，
				//客服处理（标准话术+退款/换护士/原人处理）
				Complaint complaint = new Complaint();
				complaint.setComplaintId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				complaint.setComplaintUserid(userId);
				//订单ID
				complaint.setComplaintContentNote(orderSendId);
				complaint.setComplaintIdentity(0);
				//投诉单号
				complaint.setComplaintNumber(RandomUtil.getRandomMath());
				complaint.setComplaintContentOvertow(nurseId);
				complaint.setComplaintHandleMode(0);
				complaint.setComplaintSpareone("2");
				complaint.setComplaintSparetwo("0");
				complaint.setComplaintContentCreatetime(new Date());
				//得到订单的创建时间
				Date OrdercreateTime = orderSend.getOrderSendCreatetime();
				SimpleDateFormat sdf = new SimpleDateFormat();
				complaint.setComplaintContentOvertow(orderReceiver.getOrderNurseid());
				complaint.setComplaintSparefive(sdf.format(OrdercreateTime));
				complaintService.insertSelective(complaint);
				
			}else{
				nurseId = userId;
				
				//护士取消
				orderSend2.setOrderSendStoptime(1);
				//护士取消 
				orderCancelOrder2.setOrderCancalNurseAgree(0);//0同意1不同意
				orderCancelOrder2.setOrderCancalNurseCancelTime(nowTime);//取消的时间
				orderCancelOrder2.setOrderCancalNurseAgreeTime(nowTime);//确认时间
				
				cancalUserId = orderSend.getOrderSendUserid();
				
				
				//根据用户ID得到用户账号(手机号)
				User user = userService.selectForUserByID(orderSend.getOrderSendUserid());
				String userPhone = user.getUserName();
				
				//给用户发送短信
				SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】感谢您使用安心护平台，您有一个订单申请取消，请您确认，或联系客服", null, null, "0",  null,  null,  null,  null, null,  null, null);
				Thread thread = new Thread(){
					//给用户推送
					public void run() {
						//向客户端发送推送
						String TITLE = "护士取消订单";
						String ALERT= "感谢您使用安心护平台，您有一个订单申请取消，请您确认，或联系客服";
						//String MSG_CONTENT= array.toString();
						String MSG_CONTENT= "感谢您使用安心护平台，您有一个订单申请取消，请您确认，或联系客服";
						//指定推送
						JdpushPeo.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,cancalUserId);
						//通知
						//Jdpush.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,cancalUserId);
						//值通知IOS
						JdpushIOS.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,cancalUserId);
						
						////将推送记录到用户站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(cancalUserId);                              
						innerLetter.setStandInnerLetterUserIdentity(0);
						innerLetter.setStandInnerLetterTitle("订单取消");
						//0订单消息/1资金消息/2系统通知
						innerLetter.setStandInnerLetterUserType(0);
						innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，您的单号为"+orderSend.getOrderSendNumbers()+"订单已取消，你的预付款我们将按规定退回，希望再次为您服务");
						//得到订单类型
						String orderSendType = orderSend.getOrderSendType();
						if(orderSendType == "1" || "1".equals(orderSendType)){
							innerLetter.setStandInnerLetterContent("(专属)感谢您使用安心护平台，您的单号为"+orderSend.getOrderSendNumbers()+"订单于"+format.format(nowTime)+"已被护士取消，你的预付款我们将按规定退回，希望再次为您服务");
						}else{
							innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，您的单号为"+orderSend.getOrderSendNumbers()+"订单于"+format.format(nowTime)+"已被护士取消，你的预付款我们将按规定退回，希望再次为您服务");
						}
						innerLetter.setStandInnerLetterCreatetime(new Date());
						try {
							standInnerLetterService.insertSelective(innerLetter);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						////将推送记录到护士站内信中
						StandInnerLetter innerLetter1 = new StandInnerLetter();
						innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter1.setStandInnerLetterUserId(nurseId);                              
						innerLetter1.setStandInnerLetterUserIdentity(1);
						innerLetter1.setStandInnerLetterTitle("订单取消");
						//0订单消息/1资金消息/2系统通知
						innerLetter1.setStandInnerLetterUserType(0);
						innerLetter1.setStandInnerLetterContent("亲，您于"+format.format(orderReceiver.getOrderCreatetime())+"接取单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(nowTime)+"已被您取消，希望再次为您提供机会");
						innerLetter1.setStandInnerLetterCreatetime(nowTime);
						try {
							standInnerLetterService.insertSelective(innerLetter1);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					};
				};
				thread.start();
			}
			//将订单的状态修改成取消
			orderSendService.updateByOrderSendId(orderSend2);
		}
		if(orderCancelOrder!=null && !"".equals(orderCancelOrder)){
		}else{
			orderCancelOrderService.insertSelective(orderCancelOrder2);
		}
		
		netState.setData("取消成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	
	/**
	 * //用户确认
	 * @param orderSendId
	 * @param userId 用户Id
	 * @param agreeState 0同意1不同意
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/agreecancelOrder", method = RequestMethod.POST)
	public @ResponseBody
	NetState agreecancelOrder(String orderSendId,String userId,Integer agreeState) throws Exception {
		NetState netState = new NetState();
		if (orderSendId == null || "".equals(orderSendId)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (userId == null || "".equals(userId)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (agreeState == null || "".equals(agreeState)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		OrderCancelOrder orderCancelOrder = orderCancelOrderService.selectByPrimaryKey(orderSendId);
		if(orderCancelOrder==null || "".equals(orderCancelOrder)){
			netState.setData("不存在该订单");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断订单
		final OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
		if(orderCancelOrder.getOrderCancalUserAgree()!=null && orderCancelOrder.getOrderCancalNurseAgree()!=null){
			netState.setData("请勿重复确认");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//用户同意或不同意
		OrderCancelOrder orderCancelOrder2 = new OrderCancelOrder();
		orderCancelOrder2.setOrderCancelOrderSendId(orderSendId);
		orderCancelOrder2.setOrderCancalUserAgree(agreeState);//0同意1不同意
		orderCancelOrder2.setOrderCancalUserCancelTime(new Date());//取消的时间
		orderCancelOrder2.setOrderCancalUserAgreeTime(new Date());//确认时间
		orderCancelOrderService.updateByPrimaryKeySelective(orderCancelOrder2);
		
		//修改订单状态
		OrderSend orderSend2 = new OrderSend();
		orderSend2.setOrderSendId(orderSendId);
		orderSend2.setOrderSendState("4");
		//取消人的身份0用户1护士
		orderSend2.setOrderSendStoptime(1);
		//取消时间
		orderSend2.setOrderSendFinishOrderTime(new Date());
		//将订单的状态修改成取消
		orderSendService.updateByOrderSendId(orderSend2);
		
		//修改接单表状态
		OrderReceiver orderReceiver3 = new OrderReceiver();
		orderReceiver3.setOrderReceivestate("5");
		orderReceiver3.setOrderNurseid(userId);
		orderReceiver3.setOrderOrdersendid(orderSendId);
		orderReceiverService.updateOrderReceiverState(orderReceiver3);
		
		final SimpleDateFormat format = new SimpleDateFormat();
			if(agreeState == 0 || "0".equals(agreeState)){
				//给用户发短信
				//根据用户ID得到用户账号(手机号)
				User user = userService.selectForUserByID(userId);
				String userPhone ="";
				if(user!=null && !"".equals(userId)){
					userPhone = user.getUserName();
					orderuserId = user.getUserId();
					SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】感谢您使用安心护平台，您的订单已取消，你的预付款我们将按规定退回，希望再次为您服务", null, null, "0",  null,  null,  null,  null, null,  null, null);
				}
				
				Thread thread = new Thread(){
					//给用户推送
					public void run() {
						//向客户端发送推送
						String TITLE = "取消订单";
						String ALERT= "感谢您使用安心护平台，您的订单已取消，你的预付款我们将按规定退回，希望再次为您服务";
						String MSG_CONTENT= "感谢您使用安心护平台，您的订单已取消，你的预付款我们将按规定退回，希望再次为您服务";
						//指定推送
						JdpushPeo.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,orderuserId);
						//通知
						Jdpush.testSendPush(userappKey,usermasterSecret,TITLE,ALERT,MSG_CONTENT,orderuserId);
						////将推送记录到用户站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(orderuserId);                              
						innerLetter.setStandInnerLetterUserIdentity(0);
						innerLetter.setStandInnerLetterTitle("订单取消");
						//0订单消息/1资金消息/2系统通知
						innerLetter.setStandInnerLetterUserType(0);
						innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，您的订单已取消，你的预付款我们将按规定退回，希望再次为您服务");
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
				
				//给护士发短信
				//根据订单ID得到护士新
				OrderReceiverAndOrderVO orderReceiverAndOrderVO = orderReceiverService.selectStateNurseOrderInfoByid(orderSendId);
				Nurse nurse = nurseService.selectForNurseId(orderReceiverAndOrderVO.getOrderNurseid());
				String nursePhone = "";
				if(orderReceiverAndOrderVO!=null && !"".equals(orderReceiverAndOrderVO)){
					if(nurse!=null &&!"".equals(nurse)){
						nursePhone = nurse.getNurseName();
						nurseId = nurse.getNurseId();
						SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nursePhone, "【小护健康】亲，您的一个订单已取消，希望再次为您提供机会", null, null, "0",  null,  null,  null,  null, null,  null, null);
					}
				}
				
				Thread thread1 = new Thread(){
					//给护士推送
					public void run() {
						//向客户端发送推送
						String TITLE = "订单取消";
						String ALERT= "亲，您的一个订单已被病人取消，希望再次为您提供机会";
						String MSG_CONTENT= "亲，您的一个订单已被病人取消，希望再次为您提供机会";
						//指定推送
						JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
						//通知
						Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
						////将推送记录到护士站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(nurseId);                              
						innerLetter.setStandInnerLetterUserIdentity(1);
						innerLetter.setStandInnerLetterTitle("订单取消");
						//0订单消息/1资金消息/2系统通知
						innerLetter.setStandInnerLetterUserType(0);
						innerLetter.setStandInnerLetterContent("亲，您的订单单号为"+orderSend.getOrderSendNumbers()+"订单于"+format.format(new Date())+"已被病人取消，希望再次为您提供机会");
						innerLetter.setStandInnerLetterCreatetime(new Date());
						try {
							standInnerLetterService.insertSelective(innerLetter);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
				};
				thread1.start();
			}
			//取消时系统自动生成一条反馈(反馈工单号+订单号)，
			//客服处理（标准话术+退款/换护士/原人处理）
			Complaint complaint = new Complaint();
			complaint.setComplaintId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			complaint.setComplaintUserid(userId);
			//订单ID
			complaint.setComplaintContentNote(orderSendId);
			complaint.setComplaintIdentity(0);
			//投诉单号
			complaint.setComplaintHandleMode(0);
			complaint.setComplaintNumber(RandomUtil.getRandomMath());
			complaint.setComplaintSpareone("2");
			complaint.setComplaintSparetwo("0");
			complaint.setComplaintContentOvertow(nurseId);
			complaint.setComplaintContentCreatetime(new Date());
			//得到订单的创建时间
			Date OrdercreateTime = orderSend.getOrderSendCreatetime();
			SimpleDateFormat sdf = new SimpleDateFormat();
			complaint.setComplaintSparefive(sdf.format(OrdercreateTime));
			complaintService.insertSelective(complaint);
			
			netState.setData("确认成功");
			netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	
	//删除订单
		@RequestMapping(value = "/delOrderSend", method = RequestMethod.POST)
		public @ResponseBody
		NetState delOrderSend(String orderSendId) throws Exception {
			NetState netState = new NetState();
			if(orderSendId==null || "".equals(orderSendId)){
				netState.setData("参数错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			//判断订单状态 只有未预约的订单才能删除(未支付且未被接单)
			OrderSend orderSend = orderSendService
					.selectOrderSendInfoById(orderSendId);
			
			if(orderSend==null || "".equals(orderSend)){
				netState.setData("该订单不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			String orderState = orderSend.getOrderSendState();
			if(orderState!=null && !"".equals(orderState)){
				netState.setData("该订单已经支付,请勿取消");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			OrderSendExample example = new OrderSendExample();
			com.chance.ssm.po.OrderSendExample.Criteria criterion = example.createCriteria();
			criterion.andOrderSendIdEqualTo(orderSendId);
			int i = orderSendService.deleteByExample(example);
			
			if(i==0){
				netState.setData("删除失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				netState.setData("删除成功");
				netState.setErrorCode(NetState.SUCCESS);
			}
			return netState;
		}
	//我的历史订单
	@RequestMapping(value = "/OrderSendHostory", method = RequestMethod.POST)
	public @ResponseBody
	NetState OrderSendHostory(String userId,Integer pageNum) throws Exception {
		NetState netState = new NetState();
		if(userId==null || "".equals(userId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("参数2错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<OrderInfoByNurse> newlist = orderSendService.seleteUserHostoryOrder(userId);
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
		
		int size = newlist.size();
		for(int i=0;i<size;i++){
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
					if(newgoosName!=null && !"".equals(newgoosName)){
						newgoosName = newgoosName.substring(0, newgoosName.length()-1);
					}
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
					//得到受护人的名字、性别可年龄
					neworderSendUserName = orderSendUserName+","+protectedPerson.getProtectedPersonName();
					newlist.get(i).setOrderSendUsername(neworderSendUserName);
					newlist.get(i).setOrderSendSex(protectedPerson.getProtectedPersonSex());
					newlist.get(i).setOrderSendAge(protectedPerson.getProtectedPersonAge());
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
		// 每页多少条
		int num = 10;
		List<OrderInfoByNurse> paging = new ArrayList<OrderInfoByNurse>();
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
		if(paging==null || "".equals(paging)){
			netState.setData("暂无订单信息");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("获取成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(paging);
		}
		return netState;
	}
	//根据用户ID查询未处理的取消订单
	@RequestMapping(value = "/selectOrderInfoOfNotHandleBecancel", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectOrderInfoOfNotHandleBecancel(String userId,Integer pageNum) throws Exception {
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("用户Id参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		List<OrderSend> newlist = orderSendService.selectOrderInfoOfNotHandleBecancel(userId);
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
		int size = newlist.size();
		for(int i=0;i<size;i++){
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
					if(newgoosName!=null && !"".equals(newgoosName)){
						newgoosName = newgoosName.substring(0, newgoosName.length()-1);
					}
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
					//得到受护人的名字、性别可年龄
					neworderSendUserName = orderSendUserName+","+protectedPerson.getProtectedPersonName();
					newlist.get(i).setOrderSendUsername(neworderSendUserName);
					newlist.get(i).setOrderSendSex(protectedPerson.getProtectedPersonSex());
					newlist.get(i).setOrderSendAge(protectedPerson.getProtectedPersonAge());
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
		if(newlist==null || "".equals(newlist)){
			netState.setData("暂无订单信息");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("获取成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(newlist);
		}
		return netState;
	}

}
