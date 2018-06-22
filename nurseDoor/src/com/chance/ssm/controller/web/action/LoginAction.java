package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.Administration;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.User;
import com.chance.ssm.po.EvaluateExample.Criteria;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.service.AdministrationService;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.Md5Encrypt;


//后台登录控制器
@Controller
public class LoginAction {
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private AdministrationService administrationService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private ComplaintService complaintService;
	
	//后台登录
	 @RequestMapping(value="/dologin", method = RequestMethod.POST) 
	 public void CheckAdmin(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,
			 String useracc,String userpwd
			 )throws Exception{
		String adminUserId = "";
		String userNick = "";
		int adminUsergrade=0;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		Administration list =administrationService.selectAdminInfoBy(useracc);
		if(list == null || "".equals(list)){
			out.print("1");
		}else{
			//得到启用状态
			int state = list.getAdministrationState();
			if(state == 0 || "0".equals(state)){
				out.print("1");
			}else if(Md5Encrypt.Bit16(userpwd).toLowerCase() != list.getAdministrationPwd() && !list.getAdministrationPwd().equals(Md5Encrypt.Bit16(userpwd).toLowerCase())){
				out.print("1");
			}else{
				adminUserId = list.getAdministrationId();
				userNick=list.getAdministrationNick();
				adminUsergrade = list.getAdministrationGrade();
				session.setAttribute("useracc", useracc);
				session.setAttribute("userNick", userNick);
				session.setAttribute("adminUserId", adminUserId);
				session.setAttribute("adminUsergrade", adminUsergrade);
				out.print("0");
			}
		}
		try {
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			out.flush();
			out.close();
		}
	 }
	 
	 //登录成功查询订单统计数据
	 @RequestMapping(value="/selectOrderStatisticsDataQuantity", method = RequestMethod.POST) 
	 public void  selectOrderStatisticsDataQuantity(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		 PrintWriter out = response.getWriter();
		 //待处理的订单(用户已经付款，平台发布N分钟无人接单)
		 int grantOrder = orderSendService.selectCountAllOrderInfoNow();
		 
		 //待预约的订单数
		 int waitOrder = orderSendService.selectCountAllOrderInfoWait();
		 
		 //取消的订单数
		 int cancleOrder = orderSendService.selectCountAllOrderInfoError();
		 
		 //完成的订单数
		 int successOrder = orderSendService.selectCountAllOrderInfoSuccessed();
		 
		 //总用户
		 int userCount=userService.selectUserCount();	//查询结果的记录条数
		 
		 //总护士
		 int nurseCount=nurseService.selectNurseCount();	//查询结果的记录条数
		 
		 //护士总认证数
		 int authenticationCount=nurseService.selectAllNurseInfodistrictCount();	//查询结果的记录条数
		 
		 //本月用户注册数
		 List<User> userMoneyList = userService.selectStatisticsUserSuccessMonth();
		 int userNumberMonth  = userMoneyList.size();
		 
		 //本年用户注册数
		 List<User> userYearList = userService.selectStatisticsUserSuccessYear();
		 int userNumberYear  = userYearList.size();
		 
		 //本月护士注册数
		 List<Nurse> nurseMoneyList = nurseService.selectStatisticsNurseSuccessMonth();
		 int nurseNumberMonth  = nurseMoneyList.size();
		 
		 //本年护士注册数
		 List<Nurse> nurseYearList = nurseService.selectStatisticsNurseSuccessYear();
		 int nurseNumberYear  = nurseYearList.size();
		 
		 //本月完成订单数
		 List<OrderSend> listMonth = orderSendService.selectStatisticsOrderSuccessMonth();
		 int successOrderMonth = listMonth.size();
		 
		 //本年完成订单数
		 List<OrderSend> listYear = orderSendService.selectStatisticsOrderSuccessYear();
		 int successOrderYear = listYear.size();
		 
		 //本月待完成订单数
		 List<OrderSend> listMonthHaving = orderSendService.selectOrderInfoByOrderHavingMonth();
		 int havingOrderMonth = listMonthHaving.size();
		 
		 //本年待完成订单数
		 List<OrderSend> listYearHaving = orderSendService.selectOrderInfoByOrderHavingYear();
		 int havingOrderYear = listYearHaving.size();
		 
		 //本月取消订单数
		 List<OrderSend> listMonthCancel = orderSendService.selectOrderInfoByOrderCancleMonth();
		 int CancelOrderMonth = listMonthCancel.size();
		 
		 //本年取消订单数
		 List<OrderSend> listYearCancel = orderSendService.selectOrderInfoByOrderCancleYear();
		 int CancelOrderYear = listYearCancel.size();
		 
		 //平均客单价
		 String orderAvgMoney = orderSendService.selectOrderAverageCustomerPrice();
		 if(orderAvgMoney == null || "".equals(orderAvgMoney)){
			 orderAvgMoney = "0.00";
		 }
		 //
		 List<OrderSend> list = orderSendService.selectOrderMoneyStatisticsToDay();
		 BigDecimal newMoney = BigDecimal.ZERO;
		 BigDecimal finalMoney = BigDecimal.ZERO;
		 for (int i = 0; i < list.size(); i++) {
			newMoney = new BigDecimal(list.get(i).getOrderSendTotalmoney());
			finalMoney = newMoney.add(finalMoney);
			
		}
		 //评价统计
		 //好评
		 EvaluateExample evaluateExample = new EvaluateExample();
		 Criteria criteria = evaluateExample.createCriteria();
		 criteria.andEvaluateMarkGreaterThan((long) 3);
		 evaluateExample.setOrderByClause("evaluate_createtime desc");
		 List<EvaluateVO> evaluateListGood = new ArrayList<EvaluateVO>();
		 evaluateListGood = evaluateService.selectByExampleRuVO(evaluateExample);
		 int evaluateGoodNumber = evaluateListGood.size();
		 
		 //中评
		 EvaluateExample evaluateExample1 = new EvaluateExample();
		 Criteria criteria1 = evaluateExample.createCriteria();
		 criteria1.andEvaluateMarkEqualTo((long)3);
		 evaluateExample.setOrderByClause("evaluate_createtime desc");
		 List<EvaluateVO> evaluateListMiddle = new ArrayList<EvaluateVO>();
		 evaluateListMiddle = evaluateService.selectByExampleRuVO(evaluateExample1);
		 int evaluateMiddleNumber = evaluateListMiddle.size();
		 
		 //查评
		 EvaluateExample evaluateExample2 = new EvaluateExample();
		 Criteria criteria2 = evaluateExample.createCriteria();
		 criteria2.andEvaluateMarkEqualTo((long)3);
		 evaluateExample.setOrderByClause("evaluate_createtime desc");
		 List<EvaluateVO> evaluateListBad = new ArrayList<EvaluateVO>();
		 evaluateListBad = evaluateService.selectByExampleRuVO(evaluateExample2);
		 int evaluateBadNumber = evaluateListBad.size();
		 
		 //投诉统计
		 //用户对平台
		 List<Complaint> listUsertTo = complaintService.selectcomplaintByType("0");
		 int usertToNumber = listUsertTo.size();
		 
		 //护士对平台
		 List<Complaint> listNursetTo = complaintService.selectcomplaintByType("1");
		 int nursetToNumber = listNursetTo.size();
		 
		 //用户对护士
		 List<Complaint> listUsertToNurse = complaintService.selectcomplaintByType("2");
		 int usertToNurse = listUsertToNurse.size();
		 
		 //护士对用户
		 List<Complaint> listNurseToUser = complaintService.selectcomplaintByType("3");
		 int nurseToUserNumber = listNurseToUser.size();
		 
		 //护士对订单
		 List<Complaint> listNurseToOrder = complaintService.selectcomplaintByType("4");
		 int nurseToOrderNumber = listNurseToOrder.size();
		 
		 JSONArray array = new JSONArray();
		 JSONObject jsonObject = new JSONObject();
		 jsonObject.put("grantOrder", grantOrder);
		 jsonObject.put("waitOrder", waitOrder);
		 jsonObject.put("cancleOrder", cancleOrder);
		 jsonObject.put("successOrder", successOrder);
		 
		 jsonObject.put("userCount", userCount);
		 jsonObject.put("nurseCount", nurseCount);
		 jsonObject.put("authenticationCount", authenticationCount);
		 
		 jsonObject.put("userNumberMonth", userNumberMonth);
		 jsonObject.put("userNumberYear", userNumberYear);
		 jsonObject.put("nurseNumberMonth", nurseNumberMonth);
		 jsonObject.put("nurseNumberYear", nurseNumberYear);
		 
		 jsonObject.put("successOrderMonth", successOrderMonth);
		 jsonObject.put("successOrderYear", successOrderYear);
		 
		 jsonObject.put("havingOrderMonth", havingOrderMonth);
		 jsonObject.put("havingOrderYear", havingOrderYear);
		 
		 jsonObject.put("CancelOrderMonth", CancelOrderMonth);
		 jsonObject.put("CancelOrderYear", CancelOrderYear);
		 
		 jsonObject.put("evaluateGoodNumber", evaluateGoodNumber);
		 jsonObject.put("evaluateMiddleNumber", evaluateMiddleNumber);
		 jsonObject.put("evaluateBadNumber", evaluateBadNumber);
		 
		 jsonObject.put("usertToNumber", usertToNumber);
		 jsonObject.put("nursetToNumber", nursetToNumber);
		 jsonObject.put("usertToNurse", usertToNurse);
		 jsonObject.put("nurseToUserNumber", nurseToUserNumber);
		 jsonObject.put("nurseToOrderNumber", nurseToOrderNumber);
		 
		 jsonObject.put("orderAvgMoney", orderAvgMoney);
		 jsonObject.put("finalMoney", finalMoney);
		 array.put(jsonObject);
		 /* out.print(array.toString().substring(1, array.toString().length()-1));*/
		 out.print(array);
	 }
	 
	 //退出清除session
	@SuppressWarnings("unused")
	@RequestMapping(value="/execute", method = RequestMethod.GET)
	private String  Execute(HttpSession session)throws Exception{
		session.invalidate();
		return "/login";
	}
}