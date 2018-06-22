package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.Administration;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.User;
import com.chance.ssm.po.vo.ComplaintUserAndNurseVo;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.UserComplaintVo;
import com.chance.ssm.service.AdministrationService;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.Pager;
import com.chance.ssm.utils.RandomUtil;

/**
 * 反馈投诉控制器
 * **/
@Controller
public class ComplaintAction {
	@Autowired
	private ComplaintService complaintService;
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private AdministrationService administrationService;
	
	//查看护士对平台的投诉
	@RequestMapping(value="complaintNurselook")
	public String complaintNurselook(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		int userCount=complaintService.selectCompatilByNurseCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<UserComplaintVo> list = complaintService.selectCompatilByNurse(params);
		for (UserComplaintVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}
			
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		return "complait-nurse-list";
	}
	//关键字查看护士对平台的投诉
	@RequestMapping(value="complaintNurselookKeWord",method = RequestMethod.POST)
	public String complaintNurselookKeWord(Model model,HttpServletRequest request)throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		Date minTime = null;
		Date maxTime = null;
		//最小时间
		String minT = request.getParameter("logmin");
		String maxT = request.getParameter("logmax");
		if(minT == null || "".equals(minT)){
			minTime = sdf.parse("2012-12-06");  
		}else{
			minTime = sdf.parse(minT);
		}
		if(maxT == null || "".equals(maxT)){
			maxTime = new Date(); 
		}else{
			maxTime = sdf.parse(maxT);
		}
		//关键字
		String keyWord = request.getParameter("number");
		//最大时间
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		
		complaintVagueVo.minTime = sdf.format(minTime);
		complaintVagueVo.maxTime = sdf.format(maxTime);
		complaintVagueVo.parameter = keyWord;
		
		List<UserComplaintVo> list = complaintService.selectCompatilByNurseKeyWord(complaintVagueVo);
		for (UserComplaintVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}
		
		model.addAttribute("list", list);
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("number", keyWord);
		return "complait-nurse-list";
	}
	
	//查看护士对用户的投诉
	@RequestMapping(value="complaintNurselookToUser")
	public String complaintNurselookToUser(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		//Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		String dateString = "2012-12-06";  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = sdf.parse(dateString);  
		complaintVagueVo.minTime = sdf.format(date);
		complaintVagueVo.maxTime = sdf.format(new Date());
		complaintVagueVo.start = (pageNow-1) * Pager.pageSize;
		complaintVagueVo.rows = Pager.pageSize;
		int userCount=complaintService.selectCompatilByNurseToUserCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<ComplaintUserAndNurseVo> list = complaintService.selectCompatilByNurseToUser(complaintVagueVo);
		for (ComplaintUserAndNurseVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}	
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		return "complait-nursetouser-list";
	}
	//关键字查看护士对用户的投诉
	@RequestMapping(value="complaintNurselookToUserKeyWord",method = RequestMethod.POST)
	public String complaintNurselookToUserKeyWord(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		Date minTime = null;
		Date maxTime = null;
		//最小时间
		String minT = request.getParameter("logmin");
		String maxT = request.getParameter("logmax");
		if(minT == null || "".equals(minT)){
			minTime = sdf.parse("2012-12-06");  
		}else{
			minTime = sdf.parse(minT);
		}
		if(maxT == null || "".equals(maxT)){
			maxTime = new Date(); 
		}else{
			maxTime = sdf.parse(maxT);
		}
		//关键字
		String keyWord = request.getParameter("number");
		
		//最大时间
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		
		complaintVagueVo.minTime = sdf.format(minTime);
		complaintVagueVo.maxTime = sdf.format(maxTime);
		complaintVagueVo.start = 0;
		complaintVagueVo.rows = 1000000000;
		complaintVagueVo.parameter = keyWord;
		
		List<ComplaintUserAndNurseVo> list = complaintService.selectCompatilByNurseToUser(complaintVagueVo);
		for (ComplaintUserAndNurseVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}		
		
		model.addAttribute("list", list);
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("number", keyWord);
		
		return "complait-nursetouser-list";
	}
	
	//待预约订单沟通
	@RequestMapping(value="paymentCommunication")
	public String paymentCommunication(HttpSession session,Model model,HttpServletRequest request,String orderSendId,String content,String userSpeak,String checkstate)throws Exception{
		OrderSend orderSend2 = orderSendService
				.selectOrderSendInfoById(orderSendId);
		SimpleDateFormat sdf = new SimpleDateFormat();
		//处理人
		String adminUserId = (String) session.getAttribute("adminUserId");
		if(adminUserId == null || "".equals(adminUserId)){
			return "login";
		}
		//判断有没有提交过
		Complaint complaint1 = complaintService.selectComplaintByUserToGoutong(orderSendId,sdf.format(orderSend2.getOrderSendCreatetime()));
		if(checkstate == "1" || "1".equals(checkstate)){
			model.addAttribute("complaint", complaint1);
		}else{
			int i = 0;
			if(complaint1 != null && !"".equals(complaint1)){//修改
				Complaint complaint = new Complaint();
				complaint.setComplaintId(complaint1.getComplaintId());
				//订单ID
				complaint.setComplaintContent(content);//客户反馈内容
				complaint.setComplaintContentSpeak(userSpeak);//谈话内容
				//订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
				complaint.setComplaintSparefive(sdf.format(orderSend2.getOrderSendCreatetime()));
				complaint.setComplaintHandleAdmin(adminUserId);
				complaint.setComplaintHandleAdminCreatetime(new Date());
				complaint.setComplaintContentCreatetime(new Date());
				i = complaintService.updateByPrimaryKeySelective(complaint);
				
			}else{//添加新的
				Complaint complaint = new Complaint();
				complaint.setComplaintId(UUID.randomUUID().toString().replace("-",""));
				complaint.setComplaintNumber(RandomUtil.getRandomMath());
				complaint.setComplaintIdentity(0);
				complaint.setComplaintUserid(orderSend2.getOrderSendUserid());
				//订单ID
				complaint.setComplaintContentNote(orderSendId);
				complaint.setComplaintContent(content);//客户反馈内容
				complaint.setComplaintContentSpeak(userSpeak);//谈话内容
				complaint.setComplaintContentOver("1");
				//订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
				complaint.setComplaintSpareone("0");
				complaint.setComplaintHandleAdmin(adminUserId);
				complaint.setComplaintSparefive(sdf.format(orderSend2.getOrderSendCreatetime()));
				complaint.setComplaintContentCreatetime(new Date());
				i = complaintService.insertSelective(complaint);
				
			}
			//修改订单的反馈状态
			if(i>0){
				//修改订单的反馈状态
				OrderSend orderSend = new OrderSend();
				orderSend.setOrderSendOverone("1");
				orderSend.setOrderSendId(orderSendId);
				orderSendService.updateByOrderSendId(orderSend);
				model.addAttribute("state", 1);
				//根据订单Id和订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
				
				Complaint complaint2 = complaintService.selectComplaintByUserToGoutong(orderSendId,sdf.format(orderSend2.getOrderSendCreatetime()));
				
				model.addAttribute("complaint", complaint2);
				model.addAttribute("state", 0);
			}else{
				model.addAttribute("state", 1);
			}
		}
		return "order-communicate-add";
	}
	
	
	//查看用户对平台的投诉
	@RequestMapping(value="complaintUserlook")
	public String complaintUserlook(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		int userCount=complaintService.selectCompatilByUserCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<UserComplaintVo> list = complaintService.selectCompatilByUser(params);
		for (UserComplaintVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}	
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		return "complait-user-list";
	}
	//关键字查看查看用户对平台的投诉
	@RequestMapping(value="complaintUserlookKeyWord",method = RequestMethod.POST)
	public String complaintUserlookKeyWord(Model model,HttpServletRequest request)throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		Date minTime = null;
		Date maxTime = null;
		//最小时间
		String minT = request.getParameter("logmin");
		String maxT = request.getParameter("logmax");
		if(minT == null || "".equals(minT)){
			minTime = sdf.parse("2012-12-06");  
		}else{
			minTime = sdf.parse(minT);
		}
		if(maxT == null || "".equals(maxT)){
			maxTime = new Date(); 
		}else{
			maxTime = sdf.parse(maxT);
		}
		//关键字
		String keyWord = request.getParameter("number");
		
		//最大时间
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		
		complaintVagueVo.minTime = sdf.format(minTime);
		complaintVagueVo.maxTime = sdf.format(maxTime);
		complaintVagueVo.start = 0;
		complaintVagueVo.rows = 1000000000;
		complaintVagueVo.parameter = keyWord;
		
		List<UserComplaintVo> list = complaintService.selectCompatilByUserKeyWord(complaintVagueVo);
		for (UserComplaintVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}	
		model.addAttribute("list", list);
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("number", keyWord);
		return "complait-user-list";
	}
	//查看用户对护士的投诉
	@RequestMapping(value="complaintUserlookToNurse")
	public String complaintUserlookToNurse(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		//Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		String dateString = "2012-12-06";  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = sdf.parse(dateString);  
	    complaintVagueVo.minTime = sdf.format(date);
		complaintVagueVo.maxTime = sdf.format(new Date());
		complaintVagueVo.start = (pageNow-1) * Pager.pageSize;
		complaintVagueVo.rows = Pager.pageSize;
		int userCount=complaintService.selectCompatilByUserToNurseCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<ComplaintUserAndNurseVo> list = complaintService.selectCompatilByUserToNurse(complaintVagueVo);
		for (ComplaintUserAndNurseVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}	
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		return "complait-usertonurse-list";
	}
	//关键字查看用户对护士的投诉
	@RequestMapping(value="complaintUserlookToNurseKeyWord",method = RequestMethod.POST)
	public String complaintUserlookToNurse(Model model,HttpServletRequest request)throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		Date minTime = null;
		Date maxTime = null;
		//最小时间
		String minT = request.getParameter("logmin");
		String maxT = request.getParameter("logmax");
		if(minT == null || "".equals(minT)){
			minTime = sdf.parse("2012-12-06");  
		}else{
			minTime = sdf.parse(minT);
		}
		if(maxT == null || "".equals(maxT)){
			maxTime = new Date(); 
		}else{
			maxTime = sdf.parse(maxT);
		}
		//关键字
		String keyWord = request.getParameter("number");
		
		//最大时间
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		
		complaintVagueVo.minTime = sdf.format(minTime);
		complaintVagueVo.maxTime = sdf.format(maxTime);
		complaintVagueVo.start = 0;
		complaintVagueVo.rows = 1000000000;
		complaintVagueVo.parameter = keyWord;
		
		List<ComplaintUserAndNurseVo> list = complaintService.selectCompatilByUserToNurse(complaintVagueVo);
		for (ComplaintUserAndNurseVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}	
		model.addAttribute("list", list);
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("number", keyWord);
		return "complait-usertonurse-list";
	}
	//查看护士对订单的反馈投诉
	@RequestMapping(value="selectComplaintByUserTo")
	public String selectComplaintByUserTo(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		//Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		String dateString = "2012-12-06";  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = sdf.parse(dateString);  
	    complaintVagueVo.minTime = sdf.format(date);
		complaintVagueVo.maxTime = sdf.format(new Date());
		complaintVagueVo.start = (pageNow-1) * Pager.pageSize;
		complaintVagueVo.rows = Pager.pageSize;
		int userCount=complaintService.selectComplaintByUserToCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<ComplaintUserAndNurseVo> list = complaintService.selectComplaintByUserTo(complaintVagueVo);
		for (ComplaintUserAndNurseVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}	
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		return "complait-usertoorder-list";
	}
	//关键字查看护士对订单的投诉
	@RequestMapping(value="selectComplaintByUserToKeyWord",method = RequestMethod.POST)
	public String selectComplaintByUserToKeyWord(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		Date minTime = null;
		Date maxTime = null;
		//最小时间
		String minT = request.getParameter("logmin");
		String maxT = request.getParameter("logmax");
		if(minT == null || "".equals(minT)){
			minTime = sdf.parse("2012-12-06");  
		}else{
			minTime = sdf.parse(minT);
		}
		if(maxT == null || "".equals(maxT)){
			maxTime = new Date(); 
		}else{
			maxTime = sdf.parse(maxT);
		}
		//关键字
		String keyWord = request.getParameter("number");
		
		//最大时间
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		
		complaintVagueVo.minTime = sdf.format(minTime);
		complaintVagueVo.maxTime = sdf.format(maxTime);
		complaintVagueVo.start = 0;
		complaintVagueVo.rows = 1000000000;
		complaintVagueVo.parameter = keyWord;
		
		List<ComplaintUserAndNurseVo> list = complaintService.selectComplaintByUserTo(complaintVagueVo);
		for (ComplaintUserAndNurseVo userComplaintVo : list) {
			//处理人
			 Administration administration =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintHandleAdmin());
			 //审批人
			 Administration administration1 =  administrationService.selectByPrimaryKey(userComplaintVo.getComplaintApprovalAdmin());
			 if(administration == null || "".equals(administration)){
				 userComplaintVo.setComplaintHandleAdmin("该处理人不存在");
			 }else{
				 userComplaintVo.setComplaintHandleAdmin(administration.getAdministrationNick());
			 }
			 if(administration1 == null || "".equals(administration1)){
				 userComplaintVo.setComplaintApprovalAdmin("该审批人不存在");
			 }else{
				 userComplaintVo.setComplaintApprovalAdmin(administration.getAdministrationNick());
			 }
		}	
			
		model.addAttribute("list", list);
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("number", keyWord);
		return "complait-usertoorder-list";
	}
	
	//处理投诉订单
	@RequestMapping(value="HandleComplaintOrder",method = RequestMethod.POST)
	public void HandleComplaintOrder(HttpSession session,Model model,String complaintId,HttpServletRequest request,HttpServletResponse response)throws Exception{
		PrintWriter out = response.getWriter();
		//处理人
		String adminUserId = (String) session.getAttribute("adminUserId");
		if(adminUserId == null || "".equals(adminUserId)){
			out.print(1);
		}else{
			Complaint complaint = new Complaint();
			complaint.setComplaintId(complaintId);
			complaint.setComplaintContentOver("2");
			//审核的管理员ID
			complaint.setComplaintApprovalAdmin(adminUserId);
			complaint.setComplaintApprovalAdminCreatetime(new Date());
			int i= complaintService.updateByPrimaryKeySelective(complaint);
			//得到订单ID
			Complaint complaint1 = complaintService.selectByPrimaryKey(complaintId);
			//订单ID
			String orderSendId = complaint1.getComplaintContentNote();
			//修改订单的反馈状态
			OrderSend orderSend = new OrderSend();
			orderSend.setOrderSendOvertwo("1");
			orderSend.setOrderSendId(orderSendId);
			orderSendService.updateByOrderSendId(orderSend);
			if(i>0){
				out.print(0);
			}else{
				out.print(1);
			}
		}
	}
	//去到修改取消订单反馈信息页面
	@RequestMapping(value="TocancelOrdenComplaint",method = RequestMethod.GET)
	public String TocancelOrdenComplaint(Model model,String orderSendId,String complaintSparetwo,String state, HttpServletRequest request,HttpServletResponse response)throws Exception{
		//根据订单Id和订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
		OrderSend orderSend = orderSendService
				.selectOrderSendInfoById(orderSendId);
		SimpleDateFormat sdf = new SimpleDateFormat();
		Complaint complaint = complaintService.selectComplaintByOrderSendIDAndSpare(orderSendId, complaintSparetwo,sdf.format(orderSend.getOrderSendCreatetime()));
		model.addAttribute("complaint", complaint);
		model.addAttribute("state", state);
		return "orden-complaint-update";
	}
	
	//客服填写取消订单和完成订单的反馈
	@RequestMapping(value="UpdatecancelOrdenComplaint",method = RequestMethod.POST)
	public String UpdatecancelOrdenComplaint(HttpSession session,Model model,String orderSendId,String userId,String userSpeak,String content,String note,String complaintSparetwo,String demo1, HttpServletRequest request,HttpServletResponse response)throws Exception{
		OrderSend orderSend2 = orderSendService
				.selectOrderSendInfoById(orderSendId);
		//处理人
		String adminUserId = (String) session.getAttribute("adminUserId");
		if(adminUserId == null || "".equals(adminUserId)){
				return "login";
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		Complaint complaint = new Complaint();
		//订单ID
		complaint.setComplaintContentNote(orderSendId);
		complaint.setComplaintContent(content);//客户反馈内容
		complaint.setComplaintContentSpeak(userSpeak);//谈话内容
		complaint.setComplaintContentRecord(note);//备注(客服记录)
		if(complaintSparetwo == "0" || "0".equals(complaintSparetwo)){
			//0退款/1换护士/2原人处理
			if(demo1==null || "".equals(demo1)){
				complaint.setComplaintHandleMode(2);
			}else{
				complaint.setComplaintHandleMode(Integer.parseInt(demo1));
			}
		}
		complaint.setComplaintContentOver("1");
		complaint.setComplaintContentRecord(note);
		//订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
		complaint.setComplaintSparetwo(complaintSparetwo);
		complaint.setComplaintSparefive(sdf.format(orderSend2.getOrderSendCreatetime()));
		complaint.setComplaintContentCreatetime(new Date());
		complaint.setComplaintHandleAdmin(adminUserId);
		int i = complaintService.updateCancelOrderComplaint(complaint);
		//修改订单的反馈状态
		if(i>0){
			//修改订单的反馈状态
			OrderSend orderSend = new OrderSend();
			orderSend.setOrderSendOvertwo("1");
			orderSend.setOrderSendId(orderSendId);
			orderSendService.updateByOrderSendId(orderSend);
			model.addAttribute("state", 1);
			//根据订单Id和订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
			
			Complaint complaint1 = complaintService.selectComplaintByOrderSendIDAndSpare(orderSendId, complaintSparetwo,sdf.format(orderSend2.getOrderSendCreatetime()));
			
			model.addAttribute("complaint", complaint1);
		}else{
			model.addAttribute("state", 2);
		}
		return "orden-complaint-update";
	}
	//去到修改取消订单反馈信息页面
	@RequestMapping(value="ToNurseCommunicationPlatform",method = RequestMethod.GET)
	public String ToNurseCommunicationPlatform(Model model,String complaintId, HttpServletRequest request,HttpServletResponse response)throws Exception{
		//根据订单Id和订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
		Complaint complaint = complaintService.selectByPrimaryKey(complaintId);
		model.addAttribute("complaint", complaint);
		return "complaint-use-add";
	}
	
	//客服处理护士投诉平台反馈
	@RequestMapping(value="nurseCommunicationPlatform",method = RequestMethod.POST)
	public String nurseCommunicationPlatform(HttpSession session,Model model,String complaintId,String userSpeak,String content,String note,String complaintSparetwo,String demo1, HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		//处理人
		String adminUserId = (String) session.getAttribute("adminUserId");
		if(adminUserId == null || "".equals(adminUserId)){
			return "login";
		}
		Complaint complaint = new Complaint();
		complaint.setComplaintId(complaintId);
		complaint.setComplaintContent(content);//反馈内容
		complaint.setComplaintContentSpeak(userSpeak);//谈话内容
		complaint.setComplaintContentRecord(note);//备注(客服记录)
		complaint.setComplaintContentOver("1");
		//订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
		complaint.setComplaintSparetwo(complaintSparetwo);
		complaint.setComplaintHandleAdmin(adminUserId);
		complaint.setComplaintHandleAdminCreatetime(new Date());
		int i = complaintService.updateByPrimaryKeySelective(complaint);
		//修改订单的反馈状态
		if(i>0){
			model.addAttribute("state", 1);
			Complaint complaint1 = complaintService.selectByPrimaryKey(complaintId);
			model.addAttribute("complaint", complaint1);
			//根据订单Id和订单状态(0取消/1完成)(只有反馈状态的订单才有这个值)
		}else{
			model.addAttribute("state", 2);
		}
		return "complaint-use-add";
	}
	//客服新建投诉
	@RequestMapping(value="complaintNewCustomerService",method = RequestMethod.POST)
	public void complaintNewCustomerService(HttpSession session,Model model,String complaintAccount,String becomplaintAccount,String orderNumber,String userSpeak,String content,String demo1,String note, HttpServletRequest request,HttpServletResponse response)throws Exception{
		//处理人
		PrintWriter out = response.getWriter();
		String adminUserId = (String) session.getAttribute("adminUserId");
		if(adminUserId == null || "".equals(adminUserId)){
			out.print(2);
		}else{
			int check = 0;
			//投诉人
			String userId = null;
			//被投诉人
			String beUserId = null;
			//订单id
			String orderSendId = null;
			
			Complaint complaint = new Complaint();
			complaint.setComplaintId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			//投诉单号
			complaint.setComplaintNumber(RandomUtil.getRandomMath());
			//判断投诉类型
			if(demo1 == "0" || "0".equals(demo1)){//用户投诉平台
				//根据投诉账号得到用户ID
				User user = userService.selectForUserName(complaintAccount);
				if(user == null || "".equals(user)){
					check=3;
					out.print(check);
				}else{
					userId = user.getUserId();
					//投诉人身份
					complaint.setComplaintIdentity(0);
				}
			}
			//判断投诉类型
			else	if(demo1 == "1" || "1".equals(demo1)){//护士投诉平台
				//根据投诉账号得到用户ID
				 Nurse nurse = nurseService.selectForNurseName(complaintAccount);
				if(nurse == null || "".equals(nurse)){
					check=4;
					out.print(check);
				}else{
					userId = nurse.getNurseId();
					//投诉人身份
					complaint.setComplaintIdentity(1);
				}
			}
			//判断投诉类型
			else	if(demo1 == "2" || "2".equals(demo1)){//用户对护士
				//根据投诉账号得到用户ID
				User user = userService.selectForUserName(complaintAccount);
				if(user == null || "".equals(user)){
					check=3;
					out.print(check);
				}else{
					userId = user.getUserId();
					//投诉人身份
					complaint.setComplaintIdentity(0);
					//被投诉人
					Nurse nurse = nurseService.selectForNurseName(becomplaintAccount);
					if(nurse == null || "".equals(nurse)){
						check=4;
						out.print(check);
					}else{
						//被投诉人
						beUserId =  nurse.getNurseId();
						complaint.setComplaintSparefour(beUserId);
					}
				}
				
			}
			//判断投诉类型
			else	if(demo1 == "3" || "3".equals(demo1)){//护士对用户
				//根据投诉账号得到护士ID
				Nurse nurse = nurseService.selectForNurseName(complaintAccount);
				if(nurse == null || "".equals(nurse)){
					check=4;
					out.print(check);
				}else{
					userId =  nurse.getNurseId();
					//投诉人身份
					complaint.setComplaintIdentity(1);
					//被投诉人用户
					User user = userService.selectForUserName(becomplaintAccount);
					if(user == null || "".equals(user)){
						check=3;
						out.print(check);
					}else{
						beUserId = user.getUserId();
						complaint.setComplaintSparefour(beUserId);
					}
				}
				
			}
			//判断投诉类型
			else	if(demo1 == "4" || "4".equals(demo1)){//护士投诉订单
				//根据投诉账号得到护士ID
				Nurse nurse = nurseService.selectForNurseName(complaintAccount);
				if(nurse == null || "".equals(nurse)){
					check=4;
					out.print(check);
				}else{
					userId =  nurse.getNurseId();
					//投诉人身份
					complaint.setComplaintIdentity(1);
					//根据单号得到订单ID
					OrderSend orderSend = orderSendService.selectOrderInfoByOrderNumber(orderNumber);
					if(orderSend == null || "".equals(orderSend)){
						check=5;
						out.print(check);
					}else{
						orderSendId = orderSend.getOrderSendId();
						String orderuserId = orderSend.getOrderSendUserid();
						complaint.setComplaintContentNote(orderSendId);
						complaint.setComplaintSparefour(orderuserId);
					}
				}
			}
			if(check == 0){
				//投诉内容
				complaint.setComplaintContent(content);
				//谈话内容
				complaint.setComplaintContentSpeak(userSpeak);
				//客服备注
				complaint.setComplaintContentRecord(note);
				//已处理
				complaint.setComplaintContentOver("1");
				//投诉
				complaint.setComplaintSpareone("1");
				//投诉人
				complaint.setComplaintUserid(userId);
				//
				complaint.setComplaintSparethree(demo1);
				//订单ID
				complaint.setComplaintContentNote(orderSendId);
				
				complaint.setComplaintHandleAdmin(adminUserId);
				complaint.setComplaintHandleAdminCreatetime(new Date());
				complaint.setComplaintContentCreatetime(new Date());
				int i  = complaintService.insertSelective(complaint);
				if(i>0){
					out.print(1);
				}else{
					out.print(2);
				}
			}	
		}
	}
}
