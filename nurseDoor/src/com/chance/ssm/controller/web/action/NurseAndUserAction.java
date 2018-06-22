package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.CouponUser;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.Hospital;
import com.chance.ssm.po.HospitalExample;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseExample;
import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.OrderSendSpecial;
import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.ProtectedPersonExample;
import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.po.RedPacketsUserExample;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.SimpleMajorExample;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.User;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.UserExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.HospitalVO;
import com.chance.ssm.po.vo.OrderStatisVO;
import com.chance.ssm.service.CapitalNursePoolService;
import com.chance.ssm.service.CapitalUserPoolService;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.CouponService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.HospitalService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NursePaymentSettingsService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.NursingProjectService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.OrderSendSpecialService;
import com.chance.ssm.service.ProtectedAddressService;
import com.chance.ssm.service.ProtectedPersonService;
import com.chance.ssm.service.RedPacketsService;
import com.chance.ssm.service.SimpleMajorService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.Md5Encrypt;
import com.chance.ssm.utils.Pager;
import com.chance.ssm.utils.RandomUtil;
import com.chance.ssm.utils.file.FileUpload;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushPeo;

/**护士用户身份控制器**/
@Controller
//@RequestMapping("identity")
public class NurseAndUserAction {
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	@Autowired
	private RedPacketsService packetsService;
	
	@Autowired
	private HospitalService hospitalService;
	
	@Autowired
	private SimpleMajorService simpleMajorService;
	
	@Autowired
	private CapitalNursePoolService capitalNursePoolService;
	
	@Autowired
	private ProtectedPersonService protectedPersonService;
	
	@Autowired
	private ProtectedAddressService protectedAddressService;
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private OrderSendSpecialService orderSendSpecialService;
	
	@Autowired
	private OrderReceiverService orderReceiverService;
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private HospitalService hService;
	
	@Autowired
	private ManageNursingContentService mNursingContentService;
	
	@Autowired
	private NursingProjectService nursingProjectService;
	
	@Autowired
	private NursePaymentSettingsService nursePaymentSettingsService;
	
	@Autowired
	private ComplaintService complaintService;
	
	@Autowired
	private CapitalUserPoolService capitalUserPoolService;
	
	@Autowired
	private CouponService couponService;
	
	@Autowired
	private RedPacketsService redPacketsService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	
	// 护士端
	private static final String appKey = "f3df690c367e49335b6eca7b";
	private static final String masterSecret = "5fc63778c12794bf2c3cdbae";
	
	private String OverallnurseId = "";
	
	private String  OverallnursePhone = "";
	
//	//用户管理
	
	//查看所有用户
	@RequestMapping(value="selectAllUserInfo")
	public String selectAllUserInfo(Model model,Integer pageNow,HttpServletRequest request,String condition)throws Exception{

		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		int userCount=userService.selectUserCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<User> list = new ArrayList<User>();
		if(condition == "month" || "month".equals(condition)){
			list = userService.selectStatisticsUserSuccessMonth();
			userCount = list.size();
			
		}else if(condition == "year" || "year".equals(condition)){
			list = userService.selectStatisticsUserSuccessYear();
			userCount = list.size();
		}else{
			list = userService.selectAllUserInfo(params);
			request.setAttribute("pageNow", pageNow);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("start", result.get("start"));
			request.setAttribute("end", result.get("end"));
		}
		for (User user : list) {
			int i = orderSendService.selectUserSendOrderAllCount(user.getUserId());
			BigDecimal c = capitalUserPoolService.selectUserAllExpenditure(user.getUserId());
			user.setOrderCounts(i);
			user.setUserAllExpenditure(c);
		}
		model.addAttribute("list", list);
		//数据条数
		request.setAttribute("count", userCount);
		return "user-info";
	}
	//根据用户Id查询用户
	@RequestMapping(value="selectAllUserInfoByUserId", method = RequestMethod.GET)
	public String selectAllUserInfoByUserId(Model model,String userId)throws Exception{
		if(userId==null || "".equals(userId)){
			return "404";
		}
		//根据ID查询用户信息
		User user = userService.selectForUserByID(userId);
		int userCouponCount = 0;
		// 查看用户所有的优惠券
	    List<CouponUser> List = couponService.selectAllUserCouponInfo(userId);
	    if(List.size()>0){
	    	userCouponCount  = List.size();
	    }
		//根据用户ID查询用户的优惠券
		model.addAttribute("user", user);
		model.addAttribute("checkstate", 1);
		model.addAttribute("userCouponCount", userCouponCount);
		return "user-info-descripe";
	}
	//后台修改用户密码
	@RequestMapping(value="updateUserPwd", method = RequestMethod.POST)
	public void updateUserPwd(Model model,HttpServletResponse response,String userId,String pwd)throws Exception{
		PrintWriter out = response.getWriter();
		User user = new User();
		user.setUserId(userId);
		user.setUserPwd(Md5Encrypt.Bit16(pwd).toLowerCase());
		int i = userService.updateByPrimaryKeySelective(user);
		if(i>0){
			out.print(0);
		}else{
			out.print(1);
		}
	}
	//后台修改护士密码
	@RequestMapping(value="updateNursePwd", method = RequestMethod.POST)
	public void updateNursePwd(Model model,HttpServletResponse response,String nurseId,String pwd)throws Exception{
		PrintWriter out = response.getWriter();
		Nurse nurse = new Nurse();
		nurse.setNurseId(nurseId);
		nurse.setNursePwd(Md5Encrypt.Bit16(pwd).toLowerCase());
		int i =nurseService.updateByNurseId(nurse);
		if(i>0){
			out.print(0);
		}else{
			out.print(1);
		}
	}
	//根据用户ID查询患者信息
	@RequestMapping(value="selectuserForPersonalInfo")
	public String selectuserForPersonalInfo(Model model,String userId)throws Exception{
		if(userId==null || "".equals(userId)){
			return "404";
		}
		List<ProtectedPerson> list = protectedPersonService.selectPersionInfoByUserId(userId);
		model.addAttribute("count", list.size());
		model.addAttribute("list", list);
		//根据ID查询用户信息
		return "user-info-personal-list";
	}
	//去到沟通护士页面
	@RequestMapping(value="toUserCommunicate",method = RequestMethod.GET)
	public String toUserCommunicate(Model model,String nurseId,int identity,int type)throws Exception{
		Complaint complaint =  complaintService.selectComplaintByUserOrNurseTo(nurseId,identity);
		model.addAttribute("complaint", complaint);
		model.addAttribute("nurseId", nurseId);
		model.addAttribute("type", type);
		return "nurse-complaint";
	}
	//去到沟通用户页面
	@RequestMapping(value="toNurseUserCommunicate",method = RequestMethod.GET)
	public String toNurseUserCommunicate(Model model,String userId,int identity)throws Exception{
		Complaint complaint =  complaintService.selectComplaintByUserOrNurseTo(userId,identity);
		model.addAttribute("complaint", complaint);
		model.addAttribute("userId", userId);
		return "user-complaint";
	}
	//提交护士沟通内容
	@RequestMapping(value="saveUserCommunicate",method = RequestMethod.POST)
	public String saveUserCommunicate(HttpSession session,Model model,String nurseId,String content,String userSpeak,String note,int type)throws Exception{
		//处理人
		String adminUserId = (String) session.getAttribute("adminUserId");
		if(adminUserId == null || "".equals(adminUserId)){
			return "login";
		}
		//判断有没有数据
		Complaint complaint1 =  complaintService.selectComplaintByUserOrNurseTo(nurseId,1);
		int i = 0;
		if(complaint1 == null || "".equals(complaint1)){//插入
			Complaint complaint = new Complaint();
			complaint.setComplaintId(UUID.randomUUID().toString().replaceAll("-", ""));
			//投诉单号
			complaint.setComplaintNumber(RandomUtil.getRandomMath());
			complaint.setComplaintUserid(nurseId);
			complaint.setComplaintIdentity(1);
			complaint.setComplaintContent(content);//反馈内容
			complaint.setComplaintContentSpeak(userSpeak);//谈话内容
			complaint.setComplaintContentRecord(note);//备注(客服记录)
			complaint.setComplaintSpareone("3");
			complaint.setComplaintContentOver("1");
			complaint.setComplaintHandleAdminCreatetime(new Date());
			complaint.setComplaintContentCreatetime(new Date());
			complaint.setComplaintHandleAdmin(adminUserId);
			i  = complaintService.insertSelective(complaint);
		}else{//修改
			Complaint complaint = new Complaint();
			complaint.setComplaintUserid(nurseId);
			complaint.setComplaintIdentity(1);
			complaint.setComplaintContent(content);//反馈内容
			complaint.setComplaintContentSpeak(userSpeak);//谈话内容
			complaint.setComplaintContentRecord(note);//备注(客服记录)
			complaint.setComplaintContentOver("1");
			complaint.setComplaintHandleAdmin(adminUserId);
			complaint.setComplaintHandleAdminCreatetime(new Date());
			i = complaintService.updateUserOrNurseComplaintTo(complaint);
		}
		if(i>0){
			//修改用户的沟通状态
			Nurse nurse = new Nurse();
			nurse.setNurseId(nurseId);
			nurse.setNurseCommunicate(1);
			nurseService.updateByNurseId(nurse);
			model.addAttribute("state", 1);
		}else{
			model.addAttribute("state", 2);
		}
		Complaint complaint =  complaintService.selectComplaintByUserOrNurseTo(nurseId,1);
		model.addAttribute("complaint", complaint);
		model.addAttribute("nurseId", nurseId);
		model.addAttribute("type", type);
		return "nurse-complaint";
	}
	
	//提交用户沟通内容
	@RequestMapping(value="saveNUserCommunicate",method = RequestMethod.POST)
	public String saveNUserCommunicate(HttpSession session,Model model,String userId,String content,String userSpeak,String note)throws Exception{
		//处理人
		String adminUserId = (String) session.getAttribute("adminUserId");
		if(adminUserId == null || "".equals(adminUserId)){
			return "login";
		}
		
		//判断有没有数据
		Complaint complaint1 =  complaintService.selectComplaintByUserOrNurseTo(userId,0);
		int i = 0;
		if(complaint1 == null || "".equals(complaint1)){//插入
			Complaint complaint = new Complaint();
			complaint.setComplaintId(UUID.randomUUID().toString().replaceAll("-", ""));
			//投诉单号
			complaint.setComplaintNumber(RandomUtil.getRandomMath());
			complaint.setComplaintUserid(userId);
			complaint.setComplaintIdentity(0);
			complaint.setComplaintContent(content);//反馈内容
			complaint.setComplaintContentSpeak(userSpeak);//谈话内容
			complaint.setComplaintContentRecord(note);//备注(客服记录)
			complaint.setComplaintSpareone("3");
			complaint.setComplaintContentOver("1");
			complaint.setComplaintHandleAdmin(adminUserId);
			complaint.setComplaintContentCreatetime(new Date());
			complaint.setComplaintHandleAdminCreatetime(new Date());
			i  = complaintService.insertSelective(complaint);
		}else{//修改
			Complaint complaint = new Complaint();
			complaint.setComplaintUserid(userId);
			complaint.setComplaintIdentity(0);
			complaint.setComplaintContent(content);//反馈内容
			complaint.setComplaintContentSpeak(userSpeak);//谈话内容
			complaint.setComplaintContentRecord(note);//备注(客服记录)
			complaint.setComplaintContentOver("1");
			complaint.setComplaintHandleAdmin(adminUserId);
			complaint.setComplaintHandleAdminCreatetime(new Date());
			i = complaintService.updateUserOrNurseComplaintTo(complaint);
		}
		if(i>0){
			//修改用户的沟通状态
			User user = new User();
			user.setUserCommunicate(1);
			user.setUserId(userId);
			userService.updateByPrimaryKeySelective(user);
			model.addAttribute("state", 1);
		}else{
			model.addAttribute("state", 2);
		}
		Complaint complaint =  complaintService.selectComplaintByUserOrNurseTo(userId,0);
		model.addAttribute("complaint", complaint);
		model.addAttribute("userId", userId);
		return "user-complaint";
	}
	//根据用户ID查询用户的订单
	@RequestMapping(value="selectUserorderInfoNo")
	public String selectUserorderInfoNo(Model model,String userId,String orderState)throws Exception{
		if(userId==null || "".equals(userId)){
			return "404";
		}
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
				orderInfoByNurse.setNurseTruePic(truePic.substring(0, truePic.length()-1));
				orderInfoByNurse.setNurseTrueName(trueName.substring(0, trueName.length()-1));
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
			com.chance.ssm.po.ProtectedPersonExample.Criteria criteria = personExample.createCriteria();
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
							}
						}
					}
				}
			}
		}
		model.addAttribute("userId", userId);
		model.addAttribute("list", lastlist);
		if (orderState == "0" || "0".equals(orderState)) {// 为0待预约
			return "user-order-list-no";
		}
		else if (orderState == "1" || "1".equals(orderState)) {// 为1已预约
			return "user-order-list-having";
		}
		else if (orderState == "2" || "2".equals(orderState)) {// 为2正在进行中
			return "user-order-list-ing";
		}
		else {// 为3已完成(取消的订单也显示在已完成中)
			return "user-order-list-ed";
		}
		
	}
	//模糊查询查看用户
	@RequestMapping(value="selectAllUserInfoByKeyWord",method=RequestMethod.POST)
	public String selectAllUserInfoByKeyWord(Model model,String keyword)throws Exception{
		List<User> list = userService.selectKeyWordFromUser(keyword);
		model.addAttribute("list", list);
		model.addAttribute("keyWord", keyword);
		return "user-info";
	
	}
	//根据用户Id查询用户
	@RequestMapping(value="selectAllNurseInfoByNurseId", method = RequestMethod.GET)
	public String selectAllNurseInfoByNurseId(Model model,String nurseId)throws Exception{
		if(nurseId==null || "".equals(nurseId)){
			return "404";
		}
		//根据ID查询用户信息
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		//获取医院ID
		String hosId =nurse.getNurseWorkUnit();
		if(hosId!=null && !"".equals(hosId)){
		  HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
		    if(hospitalVO!=null && !"".equals(hospitalVO)){
		    	nurse.setNurseWorkUnit(hospitalVO.getHospitalName());
		    }else{
		    	nurse.setNurseWorkUnit("该护士未选定医院");
			}
		}else{
			nurse.setNurseWorkUnit("该护士未选定医院");
		}
		//获取专业ID
		String majorId = nurse.getNurseOffice();
		if(majorId != null && !"".equals(majorId)){
			SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
			if(simpleMajor!=null && !"".equals(simpleMajor)){
				nurse.setNurseOffice(simpleMajor.getSimpleMajorName());
			}else{
				nurse.setNurseOffice("该护士未选定专业");
			}
		}else{
			nurse.setNurseOffice("该护士未选定专业");
		}
		String contents = nurse.getNurseGoodservice();
		String contentGood = "";
		if(contents != null && !"".equals(contents)){
			String[] content = contents.split(",");
			for (int i = 0; i < content.length; i++) {
				//通过服务项id查询服务信息
			    ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(content[i]);
			    if(manageNursingContent != null && !"".equals(manageNursingContent)){
			    	contentGood+= manageNursingContent.getManageNursingContentName()+",";
			    }
			}
		}
		
		nurse.setNurseGoodservice(contentGood);
	
		//查询护士红包
		int nurseRedPacketsCount = 0;
		List<RedPacketsUser> list =  redPacketsService.selectRedPacketsNurseAllInfo(nurseId);
		 if(list.size()>0){
			 nurseRedPacketsCount = list.size();
		 }
		 model.addAttribute("nurseRedPacketsCount", nurseRedPacketsCount);
		model.addAttribute("nurse", nurse);
		model.addAttribute("checkstate", 1);
		return "nurse-info-show";
	}
	//模糊查询查看护士
	@RequestMapping(value="selectAllNurseInfoByKeyWord",method=RequestMethod.POST)
	public String selectAllNurseInfoByKeyWord(HttpServletRequest request,Model model,String keyword)throws Exception{
		 request.setCharacterEncoding("UTF-8");   
		List<Nurse> list = nurseService.selectKeyWordFromNurse(keyword);
		//查询护士所有服务
		for (Nurse nurse : list) {
			String serviceContent = nurse.getNurseGoodservice();
			if(serviceContent==null){
				nurse.setNurseGoodservice("暂无服务");
			}else{
				String[] services = serviceContent.split(",");
				//通过ID查询到服务
				String goodServicess="";
				for (int j = 0; j < services.length; j++) {
					ManageNursingContentWithBLOBs bloBs = manageNursingContentService.selectByPrimaryKeyBLOB(services[j]);
					if(bloBs!=null && !"".equals(bloBs)){
						goodServicess+= bloBs.getManageNursingContentName()+",";
					}
					nurse.setNurseGoodservice(goodServicess);
				}
			}
			//获取医院ID
			String hosId =nurse.getNurseWorkUnit();
		    HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
		    if(hospitalVO!=null && !"".equals(hospitalVO)){
		    	nurse.setNurseWorkUnit(hospitalVO.getHospitalName());
		    }else{
		    	nurse.setNurseWorkUnit("该护士未选定医院");
			}
			
			//获取专业ID
			String majorId = nurse.getNurseOffice();
			SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
			if(simpleMajor!=null && !"".equals(simpleMajor)){
				nurse.setNurseOffice(simpleMajor.getSimpleMajorName());
			}else{
				nurse.setNurseOffice("该护士未选定专业");
			}
		}
		
		model.addAttribute("list", list);
		model.addAttribute("keyWord", keyword);
		return "nurse-info";
	
	}
	
	//查看所有护士
	@RequestMapping(value="selectAllNurseInfo")
	public String selectAllNurseInfo(Model model,Integer pageNow,HttpServletRequest request,String condition)throws Exception{
		//分页
		List<Nurse> list = new ArrayList<Nurse>();
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		
		int nurseCount=nurseService.selectNurseCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(nurseCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		
		if(condition == "month" || "month".equals(condition)){
			list = nurseService.selectStatisticsNurseSuccessMonth();
			for (Nurse nurse : list) {
				int i = orderReceiverService.selectNurseOrderNumber(nurse.getNurseId());
				nurse.setOrderCounts(i);
			}
			nurseCount = list.size();
		}else if(condition == "year" || "year".equals(condition)){
			list = nurseService.selectStatisticsNurseSuccessYear();
			nurseCount = list.size();
			for (Nurse nurse : list) {
				int i = orderReceiverService.selectNurseOrderNumber(nurse.getNurseId());
				nurse.setOrderCounts(i);
			}
		}else{
			list = nurseService.selectAllNurseInfo(params);
			
			request.setAttribute("pageNow", pageNow);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("start", result.get("start"));
			request.setAttribute("end", result.get("end"));
		}
		
		//查询护士所有服务
		for (Nurse nurse : list) {
			String serviceContent = nurse.getNurseGoodservice();
			if(serviceContent==null){
				nurse.setNurseGoodservice("暂无服务");
			}else{
				String[] services = serviceContent.split(",");
				//通过ID查询到服务
				String goodServicess="";
				for (int j = 0; j < services.length; j++) {
					ManageNursingContentWithBLOBs bloBs = manageNursingContentService.selectByPrimaryKeyBLOB(services[j]);
					if(bloBs!=null && !"".equals(bloBs)){
						goodServicess+= bloBs.getManageNursingContentName()+",";
					}
					nurse.setNurseGoodservice(goodServicess);
				}
			}
			//获取医院ID
			String hosId =nurse.getNurseWorkUnit();
		    HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
		    if(hospitalVO!=null && !"".equals(hospitalVO)){
		    	nurse.setNurseWorkUnit(hospitalVO.getHospitalName());
		    }else{
		    	nurse.setNurseWorkUnit("该护士未选定医院");
			}
			
			//获取专业ID
			String majorId = nurse.getNurseOffice();
			SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
			if(simpleMajor!=null && !"".equals(simpleMajor)){
				nurse.setNurseOffice(simpleMajor.getSimpleMajorName());
			}else{
				nurse.setNurseOffice("该护士未选定专业");
			}
			
		}
		//查询每个护士总收入
		for (Nurse nurse : list) {
			BigDecimal allIncome = capitalNursePoolService.selectNurseAllcapitalNursePoolMoney(nurse.getNurseId());
			if(allIncome == null || "".equals(allIncome)){
				allIncome = BigDecimal.ZERO;
			} 
			nurse.setNurseAllIncome(allIncome);
		}
		
		model.addAttribute("list", list);
		//数据条数
		request.setAttribute("count", nurseCount);
		return "nurse-info";
	}
	//查看所有正在认证的护士
		@RequestMapping(value="selectAllNurseInfodistrict")
		public String selectAllNurseInfodistrict(Model model,Integer pageNow,HttpServletRequest request)throws Exception{
			//分页
			pageNow = pageNow==null ? 1 : pageNow;
			Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
			params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
			params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
			
			List<Nurse> list = nurseService.selectAllNurseInfodistrict(params);
			int nurseCount=nurseService.selectAllNurseInfodistrictCount();	//查询结果的记录条数
			int totalPage=Pager.getTotalPage(nurseCount);
			Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
			
			//查询护士所有服务
			for (Nurse nurse : list) {
				//获取医院ID
				String hosId =nurse.getNurseWorkUnit();
				if(hosId!=null && !"".equals(hosId)){
				  HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
				    if(hospitalVO!=null && !"".equals(hospitalVO)){
				    	nurse.setNurseWorkUnit(hospitalVO.getHospitalName());
				    }else{
				    	nurse.setNurseWorkUnit("该护士未选定医院");
					}
				}else{
					nurse.setNurseWorkUnit("该护士未选定医院");
				}
				
				String serviceContent = nurse.getNurseGoodservice();
				if(serviceContent==null){
					nurse.setNurseGoodservice("暂无服务");
				}else{
					String[] services = serviceContent.split(",");
					//通过ID查询到服务
					String goodServicess="";
					for (int j = 0; j < services.length; j++) {
						ManageNursingContentWithBLOBs bloBs = manageNursingContentService.selectByPrimaryKeyBLOB(services[j]);
						if(bloBs!=null && !"".equals(bloBs)){
							goodServicess+= bloBs.getManageNursingContentName()+",";
						}
						nurse.setNurseGoodservice(goodServicess);
					}
				}
			}
			
			model.addAttribute("list", list);
			request.setAttribute("pageNow", pageNow);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("start", result.get("start"));
			request.setAttribute("end", result.get("end"));
			//数据条数
			request.setAttribute("count", nurseCount);
			return "nurse-info-district";
		}
	//通过认证
	@RequestMapping(value="NurseInfodistrictCheck")
	public String NurseInfodistrictCheck(Model model,Integer pageNow,HttpServletRequest request,String nurseId,String state)throws Exception{
		if(nurseId==null || state==null){
			return "404";
		}
		Date date = new Date();
		//获取护士的认证次数
		Nurse nurse1 = nurseService.selectForNurseId(nurseId);
		int number = 0;
		
		if(nurse1 == null || "".equals(nurse1)){
			return "404";
		}else{
			//得到该护士的认证次数
			String count = nurse1.getNurseInvitationlink();
			if(count!=null && !"".equals(count)){
				number = Integer.parseInt(count);
			}
		}
		if(number == 0 || "0".equals(number)){
			//第一次认证才发红包
			//认证成功发送红包
			RedPackets redPackets = packetsService.selectRedpacketsInfoByType(2);
			RedPacketsUser redPacketsUser = new RedPacketsUser();
			if(redPackets!=null && !"".equals(redPackets)){
				//如果后台设置了认证送的红包(mysql触发器自动加入余额)
				redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				redPacketsUser.setRedPacketsNurseMoney(redPackets.getRedPacketsMoney());
				redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
				redPacketsUser.setRedPacketsNurseNurseId(nurseId);
				redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
				redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
				redPacketsUser.setRedPacketsNurseCreatetime(date);
				packetsService.insertSelectiveNurseRedPackets(redPacketsUser);
				
				//资金池记录数据
				CapitalNursePool pool = new CapitalNursePool();
				pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
				pool.setCapitalNursePoolPeopleid(nurseId);
				pool.setCapitalNursePoolOrdersendid("");
				pool.setCapitalNursePoolMoney(redPackets.getRedPacketsMoney());
				pool.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
				pool.setCapitalNursePoolType(1);
				pool.setCapitalNursePoolCreatetime(date);
				capitalNursePoolService.insertSelective(pool);
				
				//将推送记录到护士站内信中
				StandInnerLetter innerLetter = new StandInnerLetter();
				innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter.setStandInnerLetterUserId(nurseId);
				innerLetter.setStandInnerLetterUserIdentity(1);
				//0订单消息/1资金消息/2系统通知
				innerLetter.setStandInnerLetterUserType(2);
				innerLetter.setStandInnerLetterTitle("系统消息");
				SimpleDateFormat format = new SimpleDateFormat();
				innerLetter.setStandInnerLetterContent("您提交的服务内容于"+format.format(new Date())+"已通过后台审核");
				innerLetter.setStandInnerLetterCreatetime(date);
				standInnerLetterService.insertSelective(innerLetter);
				
				////将红包记录到护士站内信中
				StandInnerLetter innerLetter1 = new StandInnerLetter();
				innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter1.setStandInnerLetterUserId(nurseId);                     
				innerLetter1.setStandInnerLetterUserIdentity(1);
				innerLetter1.setStandInnerLetterTitle("红包消息");
				//0订单消息/1资金消息/2系统通知
				innerLetter1.setStandInnerLetterUserType(1);
				innerLetter1.setStandInnerLetterContent("您于"+format.format(new Date())+"获得了一个¥"+redPackets.getRedPacketsMoney()+"的认证红包");
				innerLetter1.setStandInnerLetterCreatetime(date);
				standInnerLetterService.insertSelective(innerLetter1);
			}
		}
		
		Nurse nurse = new Nurse();
		nurse.setNurseId(nurseId);
		nurse.setNurseDistrict(state);
		nurse.setNurseInvitationlink(String.valueOf(number+1));
		if(state == "1" || "1".equals(state)){
			//没通过就删除掉所有删除服务
			NursingProjectExample example = new NursingProjectExample();
			com.chance.ssm.po.NursingProjectExample.Criteria criteria = example.createCriteria();
			criteria.andNursingNurseidEqualTo(nurseId);
			nursingProjectService.deleteByExample(example);
			nurse.setNurseGoodservice("(NULL)");
			
			//将推送记录到护士站内信中
			StandInnerLetter innerLetter = new StandInnerLetter();
			innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			innerLetter.setStandInnerLetterUserId(nurseId);
			innerLetter.setStandInnerLetterUserIdentity(1);
			//0订单消息/1资金消息/2系统通知
			innerLetter.setStandInnerLetterUserType(2);
			innerLetter.setStandInnerLetterTitle("系统消息");
			SimpleDateFormat format = new SimpleDateFormat();
			innerLetter.setStandInnerLetterContent("您提交的服务内容于"+format.format(date)+"未通过后台审核");
			innerLetter.setStandInnerLetterCreatetime(date);
			standInnerLetterService.insertSelective(innerLetter);
		}
		
		int i = nurseService.updateByNurseId(nurse);
		if(i==0){
			return "404";
		}
		//发推送
		OverallnurseId = nurseId;
		//根据护士ID得到护士账号(手机号)
		Nurse nurse2 = nurseService.selectForNurseId(nurseId);
		OverallnursePhone = nurse2.getNurseName();
		Thread thread = new Thread(){
			public void run() {
				//向客户端发送推送
				String TITLE = "认证通过";
				String ALERT= "您提交的认证已通过";
				String MSG_CONTENT= "您提交的认证已通过";
				//指定推送
				//JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
				//通知
				Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,OverallnurseId);
				
				//发送短信
				SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, OverallnursePhone, "【小护健康】您提交的认证已通过", null, null, "0",  null,  null,  null,  null, null,  null, null);
			};
		};
		thread.start();
		return "redirect:selectAllNurseInfodistrict.action";
	}
	//用户封号与解封
	@RequestMapping(value="userStateChange")
	public String userStateChange(Model model,Integer pageNow,HttpServletRequest request,String userId,String state)throws Exception{
		if(userId==null || state==null){
			return "404";
		}
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		User user = new User();
		user.setUserUsestate(state);
		int i = userService.updateByExampleSelective(user, example);
		if(i==0){
			return "404";
		}
		return "redirect:selectAllUserInfo.action";
	}
	//护士封号与解封
	@RequestMapping(value="nurseStateChange")
	public String nurseStateChange(Model model,Integer pageNow,HttpServletRequest request,String nurseId,Integer state)throws Exception{
		if(nurseId==null || state==null){
			return "404";
		}
		Nurse nurse = new Nurse();
		nurse.setNurseUsestate(state);
		nurse.setNurseId(nurseId);
		int i = nurseService.updateByNurseId(nurse);
		if(i==0){
			return "404";
		}
		return "redirect:selectAllNurseInfo.action";
	}
	//查询所有医院及科室
	@RequestMapping(value="selectHospitalAndMajor")
	public String selectHospitalAndMajor(Model model)throws Exception{
		//查询所有的医院
		HospitalExample hExample = new HospitalExample();
		List<Hospital> hospitals = hService.selectByExample(hExample);
		
		//查询所有专业
		SimpleMajorExample majorExample = new SimpleMajorExample();
		List<SimpleMajor> simpleMajors = simpleMajorService.selectByExample(majorExample);
		
		if(hospitals.size() == 0 || "".equals(hospitals)){
			simpleMajors = null;
		}
		
		//查询所有服务
		ManageNursingContentExample example = new ManageNursingContentExample();
		List<ManageNursingContent> NursingContent =  mNursingContentService.selectByExample(example);
		
		model.addAttribute("hospitals", hospitals);
		model.addAttribute("simpleMajors", simpleMajors);
		model.addAttribute("NursingContent", NursingContent);
		return "NurseRegister";
	}
	
	
	//客服帮用户注册
	@RequestMapping(value="KefuHelpNurseInfoSubmit", method = RequestMethod.POST)
	public String KefuHelpNurseInfoSubmit(Model model,Integer pageNow,HttpServletRequest request,MultipartRequest multipartRequest,
			String account,String pass1,String nick,String truename,String sex,String card,String phone,String adree,String language,String emile,
			String unit,String major,String zuce,String good,String nurseJob
			)throws Exception{
		Nurse nurse = new Nurse();
		//查询所有的医院
		HospitalExample hExample = new HospitalExample();
		List<Hospital> hospitals = hService.selectByExample(hExample);
		
		//查询所有专业
		SimpleMajorExample majorExample = new SimpleMajorExample();
		List<SimpleMajor> simpleMajors = simpleMajorService.selectByExample(majorExample);
		
		if(hospitals.size() == 0 || "".equals(hospitals)){
			simpleMajors = null;
		}
		
		//查询所有服务
		ManageNursingContentExample example = new ManageNursingContentExample();
		List<ManageNursingContent> NursingContent =  mNursingContentService.selectByExample(example);
		
		
		// 判断该账号有没有被注册
		Nurse nurse1 = nurseService.selectForNurseName(account);
		
		if (nurse1 != null) {
			model.addAttribute("hospitals", hospitals);
			model.addAttribute("simpleMajors", simpleMajors);
			model.addAttribute("NursingContent", NursingContent);
			model.addAttribute("Registerstate", 1);
			return "NurseRegister";
		}
		
		
		String nurseId = UUID.randomUUID().toString().replaceAll("-", "");
		//护士真实照片(用户看的)(还没插入)
		FileUpload fileUpload = new FileUpload();
		MultipartFile truepic = multipartRequest.getFile("pics3");
		String truefile = "";
		if(truepic!=null && !"".equals(truepic)){
			truefile =  fileUpload.uploadIcon(request, truepic, "NurseTruePic");
		}
		//真实照片保存到nurse_payment_settings表中
		//判断该护士有没有绑定过支付账号和密码
		NursePaymentSettings settings =	nursePaymentSettingsService.selectByPrimaryKey(nurseId);
		
		if(truefile!=null && !"".equals(truefile) && truefile!=""){
			if(settings==null || "".equals(settings)){//插入
				NursePaymentSettings settings2 = new NursePaymentSettings();
				settings2.setNursePaymentSettingsNurseId(nurseId);
				if(truefile!=null && !"".equals(truefile)){
					settings2.setNursePaymentSettingsOverone(truefile);
				}
				nursePaymentSettingsService.insertSelective(settings2);
			}else{//更新
				NursePaymentSettings settings3 = new NursePaymentSettings();
				settings3.setNursePaymentSettingsNurseId(nurseId);
				if(truefile!=null && !"".equals(truefile)){
					settings3.setNursePaymentSettingsOverone(nurseId);
				}
				nursePaymentSettingsService.updateByPrimaryKeySelective(settings3);
			}
		}
		
		//身份证件照
		MultipartFile cardpic = multipartRequest.getFile("pics2");
		String cardfile ="";
		if(cardpic!=null && !"".equals(cardpic)){
			cardfile =  fileUpload.uploadIcon(request, cardpic, "NurseCardPic");
		}
		//选择的服务
		String[] service = request.getParameterValues("layout");//检测数据
		if(service!=null && !"".equals(service)){
			String services = "";
			for (int i = 0; i < service.length; i++) {
				services+=service[i]+","+services;
			}
			String[] contents = services.split(",");
			for (int i = 0; i < contents.length; i++) {
				NursingProject nursingProject = new NursingProject();
				nursingProject.setNursingProjectId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingProject.setNursingNurseid(nurseId);
				nursingProject.setNursingProjectMacontent(contents[i]);
				nursingProject.setNursingProjectCreatetime(new Date());
				nursingProjectService.insertSelective(nursingProject);
			}
			nurse.setNurseGoodservice(services.substring(0, services.length()-1));
		}
		
		
		
		//护士职业照,工作照,执业证书照片
		List<MultipartFile> jobpic = multipartRequest.getFiles("pics1");
		String jobfiles = "";
		for (MultipartFile multipartFile : jobpic) {
			String jobfile =  fileUpload.uploadIcon(request, multipartFile, "NurseCardPic");
			jobfiles+=jobfile+","+jobfiles;
		}
		
		nurse.setNurseId(nurseId);
		nurse.setNurseName(account);
		nurse.setNursePwd(Md5Encrypt.Bit16(pass1).toLowerCase());
		nurse.setNurseNick(nick);
		nurse.setNurseTruename(truename);
		nurse.setNurseSex(sex);
		nurse.setNurseCard(card);
		nurse.setNursePhone(phone);
		nurse.setNurseAddress(adree);
		nurse.setNurseLanguage(language);
		nurse.setNurseEmail(emile);
		nurse.setNurseWorkUnit(unit);
		nurse.setNurseOffice(major);
		nurse.setNurseJob(nurseJob);
		
		nurse.setNurseNumber(zuce);
		nurse.setNurseDistrict("0");
		nurse.setNurseNote(good);
		nurse.setNurseCardpic(cardfile);
		nurse.setNurseNurseLicensepic(jobfiles);
		int i = nurseService.insertSelective(nurse);
		
		if(i>0){
			model.addAttribute("Registerstate", 2);
		}else{
			model.addAttribute("Registerstate", 3);
		}
		//return "redirect:selectHospitalAndMajor.action";
		model.addAttribute("hospitals", hospitals);
		model.addAttribute("simpleMajors", simpleMajors);
		model.addAttribute("NursingContent", NursingContent);
		
		return "NurseRegister";
	}
	//用户统计
	@RequestMapping(value="userStatistics")
	public String userStatistics(Integer type, Model model) throws Exception{
		Map<String,String> data = new HashMap<String,String>();
		
		switch (type) {
			case 1:		//用户数量	
				data.put("xTitle", "用户数量统计");
				data.put("subTitle", "用户总数,本月新增,本周新增,今日新增");
				data.put("ytitle", "用户数量");
				data.put("series", "[{name: '数量',colorByPoint: true,data: [{name: '用户总数',y: "+userService.selectUserCount()+"}, {name: '本月新增',y: "+userService.selectUserCountOnMonth()+"}, {name: '本周新增',y: "+userService.selectUserCountOnWeek()+"}, {name: '今日新增',y: "+userService.selectUserCountOnDay()+"}]}]");
				break;
	
			case 2:		//用户签到
				data.put("xTitle", "用户签到统计");
				data.put("subTitle", "今日签到,本周签到,本月签到");
				data.put("ytitle", "签到数量");
				data.put("series", "[{name: '数量',colorByPoint: true,data: [{name: '今日签到',y: "+userService.selectUserSigninCountOnDay()+"}, {name: '本周签到',y: "+userService.selectUserSigninCountOnWeek()+"}, {name: '本月签到',y: "+userService.selectUserSigninCountOnMonth()+"}]}]");
				break;
				
			case 3:		//护士数量
				data.put("xTitle", "护士数量统计");
				data.put("subTitle", "护士总数,本月新增,本周新增,今日新增");
				data.put("ytitle", "用户数量");
				data.put("series", "[{name: '数量',colorByPoint: true,data: [{name: '护士总数',y: "+nurseService.selectNurseCount()+"}, {name: '本月新增',y: "+nurseService.selectNurseCountOnMonth()+"}, {name: '本周新增',y: "+nurseService.selectNurseCountOnWeek()+"}, {name: '今日新增',y: "+nurseService.selectNurseCountOnDay()+"}]}]");
				break;
				
			case 4:		//护士签到
				data.put("xTitle", "护士签到统计");
				data.put("subTitle", "今日签到,本周签到,本月签到");
				data.put("ytitle", "用户数量");
				data.put("series", "[{name: '数量',colorByPoint: true,data: [{name: '今日签到',y: "+nurseService.selectNurseSigninCountOnDay()+"}, {name: '本周签到',y: "+nurseService.selectNurseSigninCountOnWeek()+"}, {name: '本月签到',y: "+nurseService.selectNurseSigninCountOnMonth()+"}]}]");
				break;
		}
		
		model.addAttribute("data", data);
		model.addAttribute("type", type);
		return "user-statis";
	}
	
}
