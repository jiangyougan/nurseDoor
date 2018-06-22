package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.User;
import com.chance.ssm.po.EvaluateExample.Criteria;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.service.CapitalNursePoolService;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.DateUtil;

@Controller
public class StatisticsAction {

	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private CapitalNursePoolService capitalNursePoolService;
	
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private ComplaintService complaintService;
	
	//用户统计当月注册数
	@RequestMapping(value="userStatisticsLine", method = RequestMethod.POST)
  	public void userStatisticsLine(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		List<User> list = userService.selectStatisticsUserSuccessMonth();
		int t =DateUtil.getCurrentMonthDay();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < t+1; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getUserCreatetime();
			//取出每个人是几号的
			Calendar cal = Calendar.getInstance();
			cal.setTime(dat);
			int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(datetime), jsonObject.getInt(String.valueOf(datetime))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//查询当前年份注册的用户
	@RequestMapping(value="userStatisticsLineYear", method = RequestMethod.POST)
  	public void userStatisticsLineYear(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		List<User> list = userService.selectStatisticsUserSuccessYear();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < 13; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getUserCreatetime();
			SimpleDateFormat format = new SimpleDateFormat();
			String da = format.format(dat);
			//取出每个人是几月的
			 int month=Integer.parseInt(da.substring(3, 4));//获取月份 
			//int month = cal.get(Calendar.MONTH); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(month), jsonObject.getInt(String.valueOf(month))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//护士统计当月注册数
	@RequestMapping(value="nurseStatisticsLine", method = RequestMethod.POST)
  	public void nurseStatisticsLine(HttpServletResponse response) throws Exception{
		//查询当前月份已完成的订单
		PrintWriter out = response.getWriter();
		List<Nurse> list = nurseService.selectStatisticsNurseSuccessMonth();
		int t =DateUtil.getCurrentMonthDay();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < t+1; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getNurseCreatetime();
			//取出每个人是几号的
			Calendar cal = Calendar.getInstance();
			cal.setTime(dat);
			int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(datetime), jsonObject.getInt(String.valueOf(datetime))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//护士统计当年注册数
	@RequestMapping(value="nurseStatisticsLineYear", method = RequestMethod.POST)
  	public void nurseStatisticsLineYear(HttpServletResponse response) throws Exception{
		//查询当前月份已完成的订单
		PrintWriter out = response.getWriter();
		List<Nurse> list = nurseService.selectStatisticsNurseSuccessYear();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < 13; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getNurseCreatetime();
			SimpleDateFormat format = new SimpleDateFormat();
			String da = format.format(dat);
			//取出每个人是几月的
			 int month=Integer.parseInt(da.substring(3, 4));//获取月份 
			//int month = cal.get(Calendar.MONTH); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(month), jsonObject.getInt(String.valueOf(month))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	
	//订单统计当前月份(已完成)
	@RequestMapping(value="orderStatisticsLineSuccess1", method = RequestMethod.POST)
  	public void orderStatisticsLineSuccess(HttpServletResponse response) throws Exception{
		//查询当前月份已完成的订单
		PrintWriter out = response.getWriter();
		List<OrderSend> list = orderSendService.selectStatisticsOrderSuccessMonth();
		int t =DateUtil.getCurrentMonthDay();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < t+1; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getOrderSendFinishOrderTime();
			//取出每个人是几号的
			Calendar cal = Calendar.getInstance();
			cal.setTime(dat);
			int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(datetime), jsonObject.getInt(String.valueOf(datetime))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//查询当前年份已完成的订单
	@RequestMapping(value="orderStatisticsLineSuccessYear", method = RequestMethod.POST)
  	public void orderStatisticsLineSuccessYear(HttpServletResponse response) throws Exception{
		//查询当前月份已完成的订单
		PrintWriter out = response.getWriter();
		List<OrderSend> list = orderSendService.selectStatisticsOrderSuccessYear();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < 13; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getOrderSendFinishOrderTime();
			SimpleDateFormat format = new SimpleDateFormat();
			String da = format.format(dat);
			//取出每个人是几月的
			 int month=Integer.parseInt(da.substring(3, 4));//获取月份 
			//int month = cal.get(Calendar.MONTH); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(month), jsonObject.getInt(String.valueOf(month))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//订单统计当前月份(进行中)
	@RequestMapping(value="orderStatisticsLineHavingMonth", method = RequestMethod.POST)
  	public void orderStatisticsLineHavingMonth(HttpServletResponse response) throws Exception{
		//查询当前月份已完成的订单
		PrintWriter out = response.getWriter();
		List<OrderSend> list = orderSendService.selectOrderInfoByOrderHavingMonth();
		int t =DateUtil.getCurrentMonthDay();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < t+1; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getOrderSendCreatetime();
			//取出每个人是几号的
			Calendar cal = Calendar.getInstance();
			cal.setTime(dat);
			int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(datetime), jsonObject.getInt(String.valueOf(datetime))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//查询当前年份进行中的订单
	@RequestMapping(value="orderStatisticsLineHavingYear", method = RequestMethod.POST)
  	public void orderStatisticsLineHavingYear(HttpServletResponse response) throws Exception{
		//查询当前月份已完成的订单
		PrintWriter out = response.getWriter();
		List<OrderSend> list = orderSendService.selectOrderInfoByOrderHavingYear();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < 13; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getOrderSendCreatetime();
			SimpleDateFormat format = new SimpleDateFormat();
			String da = format.format(dat);
			//取出每个人是几月的
			 int month=Integer.parseInt(da.substring(3, 4));//获取月份 
			//int month = cal.get(Calendar.MONTH); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(month), jsonObject.getInt(String.valueOf(month))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
		
	//订单统计当前月份(已取消)
	@RequestMapping(value="orderStatisticsLineCancleMonth", method = RequestMethod.POST)
  	public void orderStatisticsLineCancleMonth(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		List<OrderSend> list = orderSendService.selectOrderInfoByOrderCancleMonth();
		int t =DateUtil.getCurrentMonthDay();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < t+1; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getOrderSendFinishOrderTime();
			//取出每个人是几号的
			Calendar cal = Calendar.getInstance();
			cal.setTime(dat);
			int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(datetime), jsonObject.getInt(String.valueOf(datetime))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//查询当前年份已取消的订单
	@RequestMapping(value="orderStatisticsLineCancleYear", method = RequestMethod.POST)
  	public void orderStatisticsLineCancleYear(HttpServletResponse response) throws Exception{
		//查询当前月份已完成的订单
		PrintWriter out = response.getWriter();
		List<OrderSend> list = orderSendService.selectOrderInfoByOrderCancleYear();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < 13; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getOrderSendFinishOrderTime();
			SimpleDateFormat format = new SimpleDateFormat();
			String da = format.format(dat);
			//取出每个人是几月的
			 int month=Integer.parseInt(da.substring(3, 4));//获取月份 
			//int month = cal.get(Calendar.MONTH); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(month), jsonObject.getInt(String.valueOf(month))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	
	//金额统计
	@RequestMapping(value="moneyStatisticsMonth", method = RequestMethod.POST)
  	public void moneyStatisticsMonth(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		List<OrderSend> list = orderSendService.selectOrderMoneyStatisticsMonth();
		int t =DateUtil.getCurrentMonthDay();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < t+1; i++) {
			jsonObject.put(String.valueOf(i), 0.00);
		}
		Double money  = null;
		String oneMoney =null;
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getOrderSendFinishOrderTime();
			//取出每个人是几号的
			Calendar cal = Calendar.getInstance();
			cal.setTime(dat);
			int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
			//得到他的钱
			money = Double.valueOf((list.get(c).getOrderSendTotalmoney()));
			//该索引的钱
			//根据月份得到索引的钱
			oneMoney = jsonObject.optString(String.valueOf(datetime));
			double finalMoney = Double.valueOf(oneMoney)+money;
			jsonObject.put(String.valueOf(datetime),finalMoney);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	//查看护士评价
	@RequestMapping(value="evaluateStatisticsLineMonth", method = RequestMethod.POST)
  	public void evaluateStatisticsLineMonth(HttpServletResponse response,String type) throws Exception{
		PrintWriter out = response.getWriter();
		EvaluateExample evaluateExample = new EvaluateExample();
		Criteria criteria = evaluateExample.createCriteria();

		if ("0".equals(type)) {
		} else if ("1".equals(type)) {//好评
			criteria.andEvaluateMarkGreaterThan((long) 3);
		} else if ("2".equals(type)) {//中评
			criteria.andEvaluateMarkEqualTo((long)3);
		} else if ("3".equals(type)) {//差评
			criteria.andEvaluateMarkLessThan((long)3);
		}
		evaluateExample.setOrderByClause("evaluate_createtime desc");
		List<EvaluateVO> list = new ArrayList<EvaluateVO>();
		list = evaluateService.selectByExampleRuVO(evaluateExample);
		int t =DateUtil.getCurrentMonthDay();
		JSONObject jsonObject = new JSONObject();  
		JSONArray a = new JSONArray(); 
		for (int i = 1; i < t+1; i++) {
			jsonObject.put(String.valueOf(i), 0);
		}
		for (int c = 0; c < list.size(); c++) {
			Date dat = list.get(c).getEvaluateCreatetime();
			//取出每个人是几号的
			Calendar cal = Calendar.getInstance();
			cal.setTime(dat);
			int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
			jsonObject.put(String.valueOf(datetime), jsonObject.getInt(String.valueOf(datetime))+1);
		}
		a.put(jsonObject);
		String json = a.toString();
		String j1 = json.substring(1, json.length()-1);
		out.print(j1);
	}
	
/*****************    评价统计          ********************/	
	//用户评价平台
	//查看护士评价
		@RequestMapping(value="complaintStatisticsLineMonth", method = RequestMethod.POST)
	  	public void complaintStatisticsLineMonth(HttpServletResponse response,String type) throws Exception{
			PrintWriter out = response.getWriter();
			List<Complaint> list = complaintService.selectcomplaintByType(type);
			int t =DateUtil.getCurrentMonthDay();
			JSONObject jsonObject = new JSONObject();  
			JSONArray a = new JSONArray(); 
			for (int i = 1; i < t+1; i++) {
				jsonObject.put(String.valueOf(i), 0);
			}
			for (int c = 0; c < list.size(); c++) {
				Date dat = list.get(c).getComplaintContentCreatetime();
				//取出每个人是几号的
				Calendar cal = Calendar.getInstance();
				cal.setTime(dat);
				int datetime = cal.get(Calendar.DATE); //注意月份是从0开始的,比如当前7月，获得的month为6
				jsonObject.put(String.valueOf(datetime), jsonObject.getInt(String.valueOf(datetime))+1);
			}
			a.put(jsonObject);
			String json = a.toString();
			String j1 = json.substring(1, json.length()-1);
			out.print(j1);
		}
}