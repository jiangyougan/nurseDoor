package com.chance.ssm.controller;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.config.AlipayConfig;
import com.alipay.util.AlipayNotify;
import com.alipay.util.OrderInfoUtil2_0;
import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.CouponUser;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.OrderSendSpecial;
import com.chance.ssm.po.OrderSendSpecialExample;
import com.chance.ssm.po.Recharge;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.User;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.CapitalUserPoolService;
import com.chance.ssm.service.CouponService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.OrderSendSpecialService;
import com.chance.ssm.service.RechargeService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.UserService;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushPeo;

//支付宝支付控制器
@Controller
@Scope("prototype")
@RequestMapping("alipay")
public class AliPayController {

	@Autowired
	private UserService userService;

	@Autowired
	private GoodsService goodsService;

	@Autowired
	private RechargeService rechargeService;

	@Autowired
	private CapitalUserPoolService capitalUserPoolService;

	@Autowired
	private OrderSendService orderSendService;

	@Autowired
	private CouponService couponService;

	@Autowired
	private StandInnerLetterService standInnerLetterService;

	@Autowired
	private OrderSendSpecialService oSpecialService;

	@Autowired
	private NurseService nurseService;

	private String payType = "";

	private String orderSendId = "";

	private String ordercouponId = "";

	private String orderuserId = "";

	private String orderSendnurseId = "";

	private String nursePhone = "";

	// 护士端
	private static final String appKey = "f3df690c367e49335b6eca7b";
	private static final String masterSecret = "5fc63778c12794bf2c3cdbae";

	// 用户端
	private static final String userappKey = "8121db7759363542b25159b8";
	private static final String usermasterSecret = "c20fa080107794c1337065f9";

	/**
	 * 签名 payType 1充值 2直接支付
	 */
	@RequestMapping(value = "signProve", method = RequestMethod.POST)
	public @ResponseBody NetState signProve(String userId, String money,
			String Type, String orderId, String couponId) throws Exception {
		NetState netState = new NetState();
		if (userId == null || "".equals(userId)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (userService.selectForUserByID(userId) == null
				|| "".equals(userService.selectForUserByID(userId))) {
			netState.setData("查无此人");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
			return netState;
		}
		if (money == null || "".equals(money)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (Type == null || "".equals(Type)) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (orderId == null || "".equals(orderId)) {
			if (Type == "2" || "2".equals(Type)) {
				netState.setData("直接支付请带上订单号");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
		}
		// OrderInfoUtil2_0 orderInfoUtil = new OrderInfoUtil2_0();
		payType = Type;
		orderSendId = orderId;
		// 优惠券ID
		ordercouponId = couponId;
		String orderInfo = null;
		String outTradeNo = OrderInfoUtil2_0.getOutTradeNo();

		if (Type == "1" || "1".equals(Type)) {
			Map<String, String> params = OrderInfoUtil2_0.buildOrderParamMap(
					money, "安心护充值", outTradeNo);
			String orderParam = OrderInfoUtil2_0.buildOrderParam(params);
			String sign = OrderInfoUtil2_0.getSign(params,
					AlipayConfig.private_key);
			orderInfo = orderParam + "&" + sign;

		} else {
			Map<String, String> params = OrderInfoUtil2_0.buildOrderParamMap(
					money, "直接支付", outTradeNo);
			String orderParam = OrderInfoUtil2_0.buildOrderParam(params);
			String sign = OrderInfoUtil2_0.getSign(params,
					AlipayConfig.private_key);
			orderInfo = orderParam + "&" + sign;
		}

		if ("".equals(orderInfo)) {// 签名失败
			netState.setData("签名后的最终订单");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			netState.setJson(orderInfo);
		} else {
			// 充值待支付记录
			Recharge recharge = new Recharge();
			recharge.setRechargeId(outTradeNo);
			recharge.setRechargeState(0);
			recharge.setRechargeUser(userId);
			recharge.setRechargeMoney(new BigDecimal(money));
			recharge.setRechargeTime(new Date());
			rechargeService.insertSelective(recharge);

			netState.setData("签名后的最终订单");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(orderInfo);
		}
		return netState;
	}

	/** 支付宝支付完门锁订单后的逻辑（安装门锁） */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = ("/lockOrderPayNotifyByAli"), method = RequestMethod.POST)
	public void lockOrderPayNotify(HttpServletRequest request, Model model,
			HttpServletResponse response) throws Exception {// 获取支付宝POST过来反馈信息
		// 获取支付宝POST过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			params.put(name, valueStr);
		}

		// 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no")
				.getBytes("ISO-8859-1"), "UTF-8");

		// 交易状态
		String trade_status = new String(request.getParameter("trade_status")
				.getBytes("ISO-8859-1"), "UTF-8");

		// 异步通知ID
		String notify_id = request.getParameter("notify_id");

		// sign
		String sign = request.getParameter("sign");
		// 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//

		PrintWriter out = response.getWriter();
		if (notify_id != "" && notify_id != null) {// //判断接受的post通知中有无notify_id，如果有则是异步通知。
			if (AlipayNotify.verifyResponse(notify_id).equals("true"))// 判断成功之后使用getResponse方法判断是否是支付宝发来的异步通知。
			{
				if (AlipayNotify.getSignVeryfy(params, sign))// 使用支付宝公钥验签
				{
					// ——请根据您的业务逻辑来编写程序（以下代码仅作参考）——
					if (trade_status.equals("TRADE_FINISHED")) {
						// 判断该笔订单是否在商户网站中已经做过处理
						// 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
						// 如果有做过处理，不执行商户的业务程序
						// 注意：
						// 退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
						// 请务必判断请求时的total_fee、seller_id与通知时获取的total_fee、seller_id为一致的
					} else if (trade_status.equals("TRADE_SUCCESS")) {
						// 判断该笔订单是否在商户网站中已经做过处理
						// 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
						// 如果有做过处理，不执行商户的业务程序
						// 注意：
						// 付款完成后，支付宝系统发送该交易状态通知
						// 请务必判断请求时的total_fee、seller_id与通知时获取的total_fee、seller_id为一致的
						// 将充值记录更新为已支付
						// 充值
						tongji(out_trade_no);
					}
					// ——请根据您的业务逻辑来编写程序（以上代码仅作参考）——
					// 请不要修改或删除
					out.print("success");
					// 调试打印log
					// AlipayCore.logResult("notify_url success!","notify_url");

				} else// 验证签名失败
				{
					out.print("sign fail");
				}
			} else// 验证是否来自支付宝的通知失败
			{
				out.print("response fail");
			}
		} else {
			out.print("no notify message");
		}
	}

	public void tongji(String out_trade_no) throws Exception {// 获取支付宝POST过来反馈信息
		// 根据订单id查询用户id
		Recharge recharge = new Recharge();
		recharge = rechargeService.selectByPrimaryKey(out_trade_no);
		// 得到该用户的id
		String userId = recharge.getRechargeUser();
		// 冲的钱
		BigDecimal money = recharge.getRechargeMoney();
		// 充值记录更新为支付
		Recharge recharge1 = new Recharge();
		recharge1.setRechargeState(1);
		recharge1.setRechargeId(out_trade_no);
		rechargeService.updateByPrimaryKeySelective(recharge1);
		if (payType == "2" || "2".equals(payType)) {// 直接支付
			// 生成一条资金表数据
			CapitalUserPool capitalUserPool = new CapitalUserPool();
			capitalUserPool.setCapitalUserPoolId(java.util.UUID.randomUUID()
					.toString().replaceAll("-", ""));
			capitalUserPool.setCapitalUserPoolPeopleid(userId);
			capitalUserPool.setCapitalUserPoolOrdersendid(orderSendId);
			capitalUserPool.setCapitalUserPoolPeopleIdentity(0);
			capitalUserPool.setCapitalUserPoolMoney(money);
			capitalUserPool.setCapitalUserPoolSpeak("发布订单");
			capitalUserPool.setCapitalUserPoolCreatetime(new Date());
			capitalUserPoolService.insertSelective(capitalUserPool);
			// 修改支付状态 并将订单变成正在发布中
			OrderSend orderSend2 = new OrderSend();
			orderSend2.setOrderSendId(orderSendId);
			orderSend2.setOrderSendIspayment("1");
			// 加入优惠券ID
			orderSend2.setOrderSendCoupon(ordercouponId);
			// 最后实际付的钱
			orderSend2.setOrderSendTotalmoney(money.toString());
			orderSend2.setOrderSendState("0");
			orderSendService.updateByOrderSendId(orderSend2);

			// 如果订单ID和优惠券都不为空说明使用了优惠券
			// 根据订单Id得到优惠券信息
			if (orderSendId != null && !"".equals(orderSendId)) {
				if (ordercouponId != null && !"".equals(ordercouponId)) {
					// 将优惠券修改成使用过
					CouponUser couponUser = new CouponUser();
					couponUser.setCouponUserId(ordercouponId);
					couponUser.setCouponUserIstouse(0);
					couponService
							.updateUCouponUserByPrimaryKeySelective(couponUser);
				}
			}
			// 推送
			// 根据用户ID得到用户账号(手机号)
			User user = new User();
			user = userService.selectForUserByID(userId);
			String userPhone = user.getUserName();
			orderuserId = userId;
			// 给用户
			Thread thread1 = new Thread() {
				// 给用户推送
				public void run() {
					// 向客户端发送推送
					String TITLE = "发订单";
					String ALERT = "感谢您使用安心护平台，已收到您的订单，我们将尽快为您安排";
					String MSG_CONTENT = "感谢您使用安心护平台，已收到您的订单，我们将尽快为您安排";
					// 指定推送
					JdpushPeo.testSendPush(userappKey, usermasterSecret, TITLE,
							ALERT, MSG_CONTENT, orderuserId);
					// 通知
					Jdpush.testSendPush(userappKey, usermasterSecret, TITLE,
							ALERT, MSG_CONTENT, orderuserId);

				};
			};
			thread1.start();
			// 给用户发一条短信
			SmsClientSend.sendSms(Test.url, Test.userid, Test.account,
					Test.password, userPhone,
					"【小护健康】感谢您使用安心护平台，已收到您的订单，我们将尽快为您安排", null, null, "0",
					null, null, null, null, null, null, null);
			// 通过订单ID得到订单信息
			OrderSend orderSend = orderSendService
					.selectOrderSendInfoById(orderSendId);

			// 判断该订单是否专属单
			// 将推送记录到用户站内信中
			StandInnerLetter innerLetter = new StandInnerLetter();
			innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID()
					.toString().replaceAll("-", ""));
			innerLetter.setStandInnerLetterUserId(userId);
			innerLetter.setStandInnerLetterUserIdentity(0);
			innerLetter.setStandInnerLetterTitle("发订单");
			// 0订单消息/1资金消息/2系统通知
			SimpleDateFormat format = new SimpleDateFormat();
			innerLetter.setStandInnerLetterUserType(0);
			if (orderSend.getOrderSendType() == "1"
					|| "1".equals(orderSend.getOrderSendType())) {
				innerLetter.setStandInnerLetterContent("(专属)感谢您使用安心护平台，"
						+ format.format(new Date()) + "已收到您预付款¥"
						+ orderSend.getOrderSendTotalmoney() + ",单号为"
						+ orderSend.getOrderSendNumbers() + "订单，我们将尽快为您安排");
			} else {
				innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，"
						+ format.format(new Date()) + "已收到您预付款¥"
						+ orderSend.getOrderSendTotalmoney() + ",单号为"
						+ orderSend.getOrderSendNumbers() + "订单，我们将尽快为您安排");
			}
			innerLetter.setStandInnerLetterCreatetime(new Date());
			standInnerLetterService.insertSelective(innerLetter);

			if (orderSend != null && !"".equals(orderSend)) {
				if (orderSend.getOrderSendType() == "1"
						|| "1".equals(orderSend.getOrderSendType())) {// 如果订单状态是指定
					// 通过订单id查询专属护士
					List<OrderSendSpecial> orderSendSpecials = new ArrayList<OrderSendSpecial>();
					OrderSendSpecialExample oSendSpecialExample = new OrderSendSpecialExample();
					com.chance.ssm.po.OrderSendSpecialExample.Criteria criteria = oSendSpecialExample
							.createCriteria();
					criteria.andOrderSendSpecialOrdersendidEqualTo(orderSendId);
					oSendSpecialExample
							.setOrderByClause("order_send_special_createtime desc");
					orderSendSpecials = oSpecialService
							.selectByExample(oSendSpecialExample);
					int orderSendSpecialsize = orderSendSpecials.size();
					for (int j = 0; j < orderSendSpecialsize; j++) {
						orderSendnurseId = orderSendSpecials.get(j)
								.getOrderSendSpecialNurseid();
						// 根据护士ID得到护士账号(手机号)
						Nurse nurse2 = nurseService
								.selectForNurseId(orderSendnurseId);
						nursePhone = nurse2.getNurseName();
						Thread thread = new Thread() {
							public void run() {
								// 向客户端发送推送
								String TITLE = "专属订单";
								String ALERT = "亲，有一条您的专属单，请不要让您的病人等太久哦";
								String MSG_CONTENT = "亲，有一条您的专属单，请不要让您的病人等太久哦";
								/*
								 * // 指定推送 JdpushPeo.testSendPush(appKey,
								 * masterSecret, TITLE, ALERT, MSG_CONTENT,
								 * orderSendnurseId);
								 */
								// 通知
								Jdpush.testSendPush(appKey, masterSecret,
										TITLE, ALERT, MSG_CONTENT,
										orderSendnurseId);

								// 发送短信
								SmsClientSend.sendSms(Test.url, Test.userid,
										Test.account, Test.password,
										nursePhone,
										"【小护健康】亲，有一条您的专属单，请不要让您的病人等太久哦", null,
										null, "0", null, null, null, null,
										null, null, null);

								// 将推送记录到护士站内信中
								StandInnerLetter innerLetter = new StandInnerLetter();
								innerLetter
										.setStandInnerLetterId(java.util.UUID
												.randomUUID().toString()
												.replaceAll("-", ""));
								innerLetter
										.setStandInnerLetterUserId(orderSendnurseId);
								innerLetter.setStandInnerLetterUserIdentity(1);
								// 0订单消息/1资金消息/2系统通知
								innerLetter.setStandInnerLetterUserType(0);
								innerLetter.setStandInnerLetterTitle("专属订单");
								innerLetter
										.setStandInnerLetterContent("亲，有一条您的专属单，请不要让您的病人等太久哦");
								innerLetter
										.setStandInnerLetterCreatetime(new Date());
								try {
									standInnerLetterService
											.insertSelective(innerLetter);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							};
						};
						thread.start();
					}
				}
			}

		} else {// 充值到用户余额
			chongzhi(userId, money);
		}

	}

	public void chongzhi(String userId, BigDecimal money) throws Exception {
		// 得到该用户充值的金额
		BigDecimal userBalance = userService.selectForUserByID(userId)
				.getUserBalance();
		if (userBalance == null) {
			userBalance = new BigDecimal("0.00");
		}
		// 将充值的金额添加到余额 中
		BigDecimal updateBalance = userBalance.add(money);
		// 将钱插入到余额updateRecharge
		User ub = new User();
		ub.setUserBalance(updateBalance);
		ub.setUserId(userId);
		// UserExample userExample = new UserExample();
		// Criteria criteria = userExample.createCriteria();
		// criteria.andUserIdenstateEqualTo(userId);
		// userService.updateByExampleSelective(ub, userExample);
		userService.updateByPrimaryKeySelective(ub);
		// 将推送记录到用户站内信中
		StandInnerLetter innerLetter = new StandInnerLetter();
		innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID()
				.toString().replaceAll("-", ""));
		innerLetter.setStandInnerLetterUserId(userId);
		innerLetter.setStandInnerLetterUserIdentity(0);
		innerLetter.setStandInnerLetterTitle("充值");
		// 0订单消息/1资金消息/2系统通知
		innerLetter.setStandInnerLetterUserType(1);
		SimpleDateFormat format = new SimpleDateFormat();
		innerLetter.setStandInnerLetterContent("您于" + format.format(new Date())
				+ "充值了¥" + money);
		innerLetter.setStandInnerLetterCreatetime(new Date());
		standInnerLetterService.insertSelective(innerLetter);
	}

}
