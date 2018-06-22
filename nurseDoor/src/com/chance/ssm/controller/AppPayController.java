package com.chance.ssm.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.domain.ExtendParams;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.json.JSONWriter;
import com.alipay.config.ServiceEnvConstants;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.utils.CalendarUtil;

/**
 * APP支付
 * @author Administrator
 * @date 2018-06-22 10:11:28
 */
@Controller
@RequestMapping("alipay")
public class AppPayController {

	private static Logger logger = LoggerFactory.getLogger(AppPayController.class);
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Value("${notifyUrl}")
	private String notifyUrl;
	
	
	@RequestMapping(value = { "/getOrderInfo" })
	@ResponseBody
	public NetState getOrderInfo(String orderSendNumber) {
		NetState netState = new NetState();
		try {
			OrderSend os = orderSendService.selectOrderInfoByOrderNumber(orderSendNumber);
			if(os==null){
				netState.setData("订单不存在");
				netState.setErrorCode(NetState.SERVER_ERROR);
				return netState;
			}
			if("1".equals(os.getOrderSendIspayment())){
				netState.setData("订单已支付");
				netState.setErrorCode(NetState.SERVER_ERROR);
				return netState;
			}
			//封装业务参数
			AlipayTradeAppPayModel alipayTradeAppPayModel = new AlipayTradeAppPayModel();
	//		alipayTradeAppPayModel.setBody("");
			alipayTradeAppPayModel.setSubject("医护云-支付");
			alipayTradeAppPayModel.setOutTradeNo(os.getOrderSendNumbers());
			alipayTradeAppPayModel.setTimeExpire("1m");
			alipayTradeAppPayModel.setTotalAmount(os.getOrderSendTotalmoney());
			alipayTradeAppPayModel.setProductCode("QUICK_MSECURITY_PAY");
	//		alipayTradeAppPayModel.setGoodsType("");   //商品主类型：0—虚拟类商品，1—实物类商品   注：虚拟类商品不支持使用花呗渠道
			ExtendParams extendParams = new ExtendParams();
			extendParams.setSysServiceProviderId(ServiceEnvConstants.PARTNER);
			alipayTradeAppPayModel.setExtendParams(extendParams);
			StringBuffer orderInfo = new StringBuffer();
			orderInfo.append("app_id="+ServiceEnvConstants.APP_ID);
			orderInfo.append("&biz_content="+new JSONWriter().write(alipayTradeAppPayModel));
			orderInfo.append("&charset=utf-8&format=json&method=alipay.trade.app.pay");
			orderInfo.append("&notify_url="+notifyUrl);
			orderInfo.append("&sign_type=RSA2");
			orderInfo.append("&timestamp="+getTimestamp());
			orderInfo.append("&version=1.0");
		
			//生成签名
			String sign = AlipaySignature.rsaSign(orderInfo.toString(), ServiceEnvConstants.PRIVATE_KEY, 
					ServiceEnvConstants.CHARSET, ServiceEnvConstants.SIGN_TYPE);
			orderInfo.append("&sign="+sign);
			String result = URLEncoder.encode(orderInfo.toString(), "UTF-8");
			netState.setData("请求处理成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(result);
		} catch (AlipayApiException e) {
			logger.info("签名异常");
			e.printStackTrace();
			netState.setData("签名异常");
			netState.setErrorCode(NetState.SERVER_ERROR);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			netState.setData("UnsupportedEncodingException");
			netState.setErrorCode(NetState.SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			netState.setData("Exception");
			netState.setErrorCode(NetState.SERVER_ERROR);
		}
		return netState;
	}
	
	/**
	 * 获取当前时间timestamp
	 */
	private static String getTimestamp() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		return format.format(date);
	}

	/**
	 * 生成商户订单号，该值在商户端应保持唯一（可自定义格式规范）
	 * 
	 */
	private static String getOutTradeNo() {
		String fore = CalendarUtil.format2yyyyMMddHHmmss(new Date());
        long rand = 0L;
        while(rand<10000){
            rand = (long)(Math.random() * 100000);
        }
        String base = System.currentTimeMillis() + "" + rand;
        long base1 = Long.valueOf(base)>>2;
        String base2 = String.format("%0" + 13 + "d", (Long.valueOf(base))^base1);
        String tradeNo = fore + base2;
        return tradeNo;
	}
	
	/**
	 * app支付宝支付异步通知接口 修改订单状态
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = { "/orderSendPayNotify" })
	@ResponseBody
	public String receiveNotify(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String paramName = (String) iter.next();
			String paramValue = ((String[]) requestParams.get(paramName))[0];
			logger.info("支付异步通知收到参数：" + paramName + " = " + paramValue);
			params.put(paramName, paramValue);
		}

		try {
			// 1.验签
			boolean flag = AlipaySignature.rsaCheckV1(params, ServiceEnvConstants.ALIPAY_PUBLIC_KEY, 
					params.containsKey("charset") ? params.get("charset"): ServiceEnvConstants.CHARSET, params.get("sign_type"));
			if (!flag) {
				logger.error("订单号[{}]，验签失败！", params.get("out_trade_no"));
				return "sign fail";
			}
			// 2.根据支付宝通知外部订单号查询订单信息
			OrderSend os = orderSendService.selectOrderInfoByOrderNumber(params.get("out_trade_no"));
			// 判断支付状态 （0未支付，1已支付）
			if ("0".equals(os.getOrderSendIspayment())) {
				os.setOrderSendIspayment("1");
				orderSendService.updateByOrderSendId(os);
				logger.error("订单号[{}]，订单状态修改成功！", params.get("out_trade_no"));
			}
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("订单号[{}]，异步通知处理异常！", params.get("out_trade_no"));
			return "exception";
		}
	}
}
