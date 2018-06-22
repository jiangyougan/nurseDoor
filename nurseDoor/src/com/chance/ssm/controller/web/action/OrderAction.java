package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.CapitalPlatform;
import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.InterestRate;
import com.chance.ssm.po.InterestRateExample;
import com.chance.ssm.po.Invitation;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.OrderCancelOrder;
import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderReceiverExample;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.OrderSendExample;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.Switch;
import com.chance.ssm.po.SwitchExample;
import com.chance.ssm.po.TimingControl;
import com.chance.ssm.po.TimingControlExample;
import com.chance.ssm.po.User;
import com.chance.ssm.service.ManageNursingProjectService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.EvaluateExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.HospitalVO;
import com.chance.ssm.po.vo.NurseProjectVo;
import com.chance.ssm.po.vo.OrderKeyWordVO;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;
import com.chance.ssm.po.vo.OrderSendCancalVo;
import com.chance.ssm.po.vo.OrderStatisVO;
import com.chance.ssm.po.vo.UserAndOrderSend;
import com.chance.ssm.service.CapitalNursePoolService;
import com.chance.ssm.service.CapitalPlatformService;
import com.chance.ssm.service.CapitalUserPoolService;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.HospitalService;
import com.chance.ssm.service.InterestRateService;
import com.chance.ssm.service.InvitationService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.NursingProjectService;
import com.chance.ssm.service.OrderCancelOrderService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.ProtectedPersonService;
import com.chance.ssm.service.RedPacketsService;
import com.chance.ssm.service.SimpleMajorService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.TimingControlService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.DateUtil;
import com.chance.ssm.utils.Pager;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushPeo;


//订单类控制器
@Controller
public class OrderAction {

    @Autowired
    private OrderSendService orderSendService;
    @Autowired
    private OrderReceiverService orderReceiverService;
    @Autowired
    private ManageNursingProjectService manageNursingProjectService;
    @Autowired
    private NurseService nurseService;
    @Autowired
    private ProtectedPersonService protectedPersonService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ManageNursingContentService manageNursingContentService;
    @Autowired
    private UserService userService;
    
    @Autowired
    private EvaluateService evaluateService;
    
    @Autowired
    private InterestRateService interestRateService;
    
    @Autowired
    private CapitalNursePoolService capitalNursePoolService;
    
    @Autowired
    private InvitationService invitationService;
    
    @Autowired
    private RedPacketsService packetsService;
    
    
    @Autowired
    private OrderCancelOrderService orderCancelOrderService;

    @Autowired
    private CapitalUserPoolService capitalUserPoolService;
    
    @Autowired
    private NursingProjectService nursingProjectService;
    
    @Autowired
    private HospitalService hospitalService;
    
    @Autowired
    private SimpleMajorService simpleMajorService;
    
    @Autowired
    private CapitalPlatformService capitalPlatformService;
    
    @Autowired
    private TimingControlService timingControlService;
    
    @Autowired
    private ComplaintService complaintService;
    
    @Autowired
    private StandInnerLetterService standInnerLetterService;
    
    
    //用户端
  	private static final String appKey ="8121db7759363542b25159b8";
  	private static final String masterSecret = "c20fa080107794c1337065f9";
    
  	
	// 护士端
	private static final String nurseappKey = "f3df690c367e49335b6eca7b";
	private static final String nursemasterSecret = "5fc63778c12794bf2c3cdbae";
  	
    private String userId="";
    
    private String userPhone = "";
    
	
    
    //订单详情
    @RequestMapping(value = "/OrderList", method = RequestMethod.GET)
    public String OrderList(Model model, HttpServletRequest request, HttpServletResponse response,Integer pageNow) throws Exception {
        //根据state判断（0正在发布 1正在进行时 2完成）
        String state = request.getParameter("state");
        List<UserAndOrderSend> list = new ArrayList<UserAndOrderSend>();
        //List<UserAndOrderSend> listIng = new ArrayList<UserAndOrderSend>();
        //分页
        SimpleDateFormat dateFormat = new SimpleDateFormat();
  		pageNow = pageNow==null ? 1 : pageNow;
  		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
  		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
  		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
        //总记录条数
  		int userCount=0;
  	    
        if ("".equals(state) || "9".equals(state)) {
            list = orderSendService.selectAllorderInfo(params);//查询所有订单
            model.addAttribute("state", 9);
            userCount=orderSendService.selectCountAllOrderInfo();	//查询结果的记录条数
        } else if ("0".equals(state)) {

        	list = orderSendService.selectAllOrderNow(params);//正在发布的订单
        	//获取N
        	TimingControl timingControl = timingControlService.selectTimingControl();
        	int Timing = 0;
        	if(timingControl!=null && !"".equals(timingControl)){
        		Timing = timingControl.getTimingControl();
        	}
        	model.addAttribute("Timing", Timing);
        	model.addAttribute("state", 0);
        	userCount =  orderSendService.selectCountAllOrderInfoNow();
        } else if ("1".equals(state)) {
        	list = orderSendService.selectAllOrderHaving(params);//正在进行的订单
        	model.addAttribute("state", 1);
        	userCount = orderSendService.selectCountAllOrderInfoHaving();
        }else if ("2".equals(state)) {
        	list = orderSendService.selectAllOrderSuccessed(params);//已经完成的订单
        	model.addAttribute("state", 2);
        	userCount = orderSendService.selectCountAllOrderInfoSuccessed();
        }else if ("4".equals(state)) {
        	list = orderSendService.selectAllOrderWait(params);//待预约的订单
        	model.addAttribute("state", 4);
        	userCount = orderSendService.selectCountAllOrderInfoWait();
        }else if ("5".equals(state)) {
        	list = orderSendService.selectAllOrderError(params);//被取消的订单(用户同意待退款)
        	for(int i=0; i<list.size();i++){
        		OrderCancelOrder cancelOrder = orderCancelOrderService.selectCancalBeforeState(list.get(i).getOrderSendId());
        		if(cancelOrder!=null && !"".equals(cancelOrder)){
        			list.get(i).setCancelBeforeState(cancelOrder.getOrderCancalOrderState());
        		}
    	  		Complaint complaint = complaintService.selectComplaintByOrderSendIDAndSpare(list.get(i).getOrderSendId(), "0",dateFormat.format(list.get(i).getOrderSendCreatetime()));
    	  		Integer handleMode = null;;
    	  		String complaintContentOver = null;
    	  		if(complaint != null && !"".equals(complaint)){
    	  			handleMode = complaint.getComplaintHandleMode();
    	  			complaintContentOver = complaint.getComplaintContentOver();
    	  			list.get(i).setHandleMode(handleMode);
    	  			list.get(i).setComplaintContentOver(complaintContentOver);
    	  		}
        	}
        	model.addAttribute("state", 5);
        	userCount = orderSendService.selectCountAllOrderInfoError();
        }else if ("8".equals(state)) {
        	//判断这个订单有没有做记录
        	list = orderSendService.selectAllOrderErrorUserNotAgree(params);//被取消的订单(待协商)
        	for(int i=0; i<list.size();i++){
        		OrderCancelOrder cancelOrder = orderCancelOrderService.selectCancalBeforeState(list.get(i).getOrderSendId());
        		if(cancelOrder!=null && !"".equals(cancelOrder)){
        			list.get(i).setCancelBeforeState(cancelOrder.getOrderCancalOrderState());
        			list.get(i).setOrderCancalUserAgree(cancelOrder.getOrderCancalUserAgree());
        			
        		}
        		//if(list.get(i).getOrderSendOvertwo() == "1"|| "1".equals(list.get(i).getOrderSendOvertwo())){//如果已经记录投诉了
        	  		Complaint complaint = complaintService.selectComplaintByOrderSendIDAndSpare(list.get(i).getOrderSendId(), "0",dateFormat.format(list.get(i).getOrderSendCreatetime()));
        	  		Integer handleMode = null;;
        	  		String complaintContentOver = null;
        	  		if(complaint != null && !"".equals(complaint)){
        	  			handleMode = complaint.getComplaintHandleMode();
        	  			complaintContentOver = complaint.getComplaintContentOver();
        	  			list.get(i).setHandleMode(handleMode);
        	  			list.get(i).setComplaintContentOver(complaintContentOver);
        	  		}
        		//}
        	}
        	model.addAttribute("state", 8);
        	userCount = list.size();
        }else if("6".equals(state)){//未评价
        	list = orderSendService.selectOrderSendInfoButNotEvaluate(params);
        	model.addAttribute("state", 6);
        	userCount = orderSendService.selectCountOrderSendInfoButNotEvaluate();
        }
        else if("7".equals(state)){//未返利
        	list = orderSendService.selectOrderSentNotRebate(params);
        	model.addAttribute("state", 7);
        	userCount = orderSendService.selectCountOrderSentNotRebate();
        }
        else if("10".equals(state)){//被取消已退款
        	list = orderSendService.selectAllOrderErrorUserHasRefund(params);
        	model.addAttribute("state", 10);
        	userCount = orderSendService.selectAllOrderErrorUserHasRefundCount();
        }
       
  		int totalPage=Pager.getTotalPage(userCount);
  		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
  		
        //如果有人接取 查出接取护士的信息
        for (UserAndOrderSend andOrderSend : list) {
            String OrderSendState = andOrderSend.getOrderSendState();
            //如果订单状态不为空 说明有人接取 ，查出接取护士的信息
            if (!"".equals(OrderSendState) || !"0".equals(OrderSendState)) {
                Nurse nurse = nurseService.selectNurseInfoByOrder(andOrderSend.getOrderSendId());
                //受护人id
                String orderSendUserNameId = andOrderSend.getOrderSendUsername();
                //通过受护人id查询受护人信息
                if(orderSendUserNameId!=null ||!"".equals(orderSendUserNameId)){
                	ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserNameId);
                	if(protectedPerson!=null || "".equals(protectedPerson)){
                		andOrderSend.setOrderSendUsername(protectedPerson.getProtectedPersonName());
                	}
                }
                //服务产品信息
            	String[] contentid = andOrderSend.getOrderSendServicecontent().split(",");
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
    					andOrderSend.setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						andOrderSend.setOrderSendServicecontent("该服务不存在");
					}
				}
				andOrderSend.setContentId(newcontentid);
                //将护士信息插入到UserAndOrderSend实体类中
                if (nurse != null) {
                    andOrderSend.setNurseId(nurse.getNurseId());
                    andOrderSend.setNurseName(nurse.getNurseName());
                    andOrderSend.setNurseNick(nurse.getNurseNick());
                }
            }
        }
        model.addAttribute("list", list);
        model.addAttribute("count", userCount);
        request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
        return "order-list";
    }

    //模糊查询订单selectKeyWordByOrderInfo
    @RequestMapping(value = "/OrderKeyWordList", method = RequestMethod.POST)
    public String OrderKeyWordList(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	//开始时间
    	String logmin = request.getParameter("logmin");
    	//结束时间
    	String logmax = request.getParameter("logmax");
    	//订单状态
    	//String brandclass = request.getParameter("brandclass");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String number = request.getParameter("number");
        OrderKeyWordVO keyWordVO = new OrderKeyWordVO();
        if(number!=null && !"".equals(number)){
        	 keyWordVO.parameter = number;
        }
        if(logmin!=null && !"".equals(logmin)){
        	Date datemin = sdf.parse(logmin);
        	model.addAttribute("datemin", logmin);
        	keyWordVO.logminTime = sdf.format(datemin);
        }else{
        	keyWordVO.logminTime = "2017-01-01";
        }
        if(logmax!=null && !"".equals(logmax)){
        	Date datemax = sdf.parse(logmax);
        	model.addAttribute("datemax", logmax);
        	keyWordVO.logmaxTime = sdf.format(datemax);
        }else{
        	keyWordVO.logmaxTime = sdf.format(new Date());
        }
        List<UserAndOrderSend> list = new ArrayList<UserAndOrderSend>();
        if((logmin==null && logmax == null && number == null)
        	||("".equals(logmin)&&"".equals(logmax)&&"".equals(number))	){
        	list = orderSendService.selectKeyWordByOrderInfo(number);
        }else{
        	list = orderSendService.selectKeyWordByOrderInfo2(keyWordVO);
        }
       
        //将有被接取的订单加入接取人信息
        for (UserAndOrderSend andOrderSend : list) {
            String OrderSendState = andOrderSend.getOrderSendState();
            
          //受护人id
            String orderSendUserNameId = andOrderSend.getOrderSendUsername();
            //通过受护人id查询受护人信息
            if(orderSendUserNameId!=null && !"".equals(orderSendUserNameId)){
            	ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserNameId);
            	if(protectedPerson!=null && !"".equals(protectedPerson)){
            		andOrderSend.setOrderSendUsername(protectedPerson.getProtectedPersonName());
            	}
            }
            //服务产品信息
        	String[] contentid = andOrderSend.getOrderSendServicecontent().split(",");
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
			if(newcontentid!= null && !"".equals(newcontentid)){
				ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
				if(manageNursingContent!=null){
					String contentname =manageNursingContent.getManageNursingContentName();
					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
					andOrderSend.setOrderSendServicecontent(contentname+":"+newgoosName);
				}else{
					andOrderSend.setOrderSendServicecontent("该服务不存在");
				}
			}
            
            //如果订单状态不为空 说明有人接取 ，查出接取护士的信息
            if (!"".equals(OrderSendState) && !"0".equals(OrderSendState)) {
                Nurse nurse = nurseService.selectNurseInfoByOrder(andOrderSend.getOrderSendId());
                //将护士信息插入到UserAndOrderSend实体类中
                if (nurse != null) {
                    andOrderSend.setNurseId(nurse.getNurseId());
                    andOrderSend.setNurseName(nurse.getNurseName());
                    andOrderSend.setNurseNick(nurse.getNurseNick());
                }
            }
        }
        model.addAttribute("list", list);
        model.addAttribute("number", number);
        model.addAttribute("count", list.size());
        return "order-list";
    }
   //根据订单id查询订单内容
    @RequestMapping(value = "/OrderInfoByOrderId", method = RequestMethod.GET)
    public String OrderInfoByOrderId(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	String orderSendId = request.getParameter("orderSendId");
    	String state = request.getParameter("state");
    	//通过订单id查询订单详情
    	UserAndOrderSend andOrderSend = orderSendService.selectOrderSendInfoByIdByMap(orderSendId);
    	String userId = andOrderSend.getOrderSendUserid();
    	String totalMonoy = andOrderSend.getOrderSendTotalmoney();
    	//得到创建人的id
    	String orderSendUserid = andOrderSend.getOrderSendUserid();
    	//根据订单创建人id得到创建人的账号
    	User user =userService.selectForUserByID(orderSendUserid);
    	//判断用户是否存在
    	if(user!=null  && !"".equals(user)){
    		andOrderSend.setOrderSendUserid(user.getUserName());
    	}else{
    		andOrderSend.setOrderSendUserid("该用户不存在");
    	}
    	
        String OrderSendState = andOrderSend.getOrderSendState();
            //受护人id
            String orderSendUserNameId = andOrderSend.getOrderSendUsername();
            //通过受护人id查询受护人信息
            if(orderSendUserNameId!=null && !"".equals(orderSendUserNameId)){
            	ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserNameId);
            	if(protectedPerson!=null || "".equals(protectedPerson)){
            		andOrderSend.setOrderSendUsername(protectedPerson.getProtectedPersonName());
            	}
            }
            //服务产品信息
        	String[] contentid = andOrderSend.getOrderSendServicecontent().split(",");
        	//二级服务项的id
			String newcontentid ="";
			//三级产品的名字
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
			if(newcontentid!= null && !"".equals(newcontentid)){
				ManageNursingContent manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
				if(manageNursingContent!=null){
					String contentname =manageNursingContent.getManageNursingContentName();
					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
					andOrderSend.setOrderSendServicecontent(contentname+":"+newgoosName);
				}else{
					andOrderSend.setOrderSendServicecontent("该服务不存在");
				}
			}
			andOrderSend.setContentId(newcontentid);
			//如果订单状态不为空 说明有人接取 ，查出接取护士的信息
		if (!"".equals(OrderSendState) && !"0".equals(OrderSendState)) {
		            Nurse nurse = nurseService.selectNurseInfoByOrder(andOrderSend.getOrderSendId());
            //将护士信息插入到UserAndOrderSend实体类中
            if (nurse != null) {
                andOrderSend.setNurseId(nurse.getNurseId());
                andOrderSend.setNurseName(nurse.getNurseName());
                andOrderSend.setNurseNick(nurse.getNurseNick());
            }
        }
        
		model.addAttribute("state", state);
        model.addAttribute("andOrderSend", andOrderSend);
        model.addAttribute("userId", userId);
    	return "order-infoandedt";
    }
   /* @RequestMapping(value = "/OrderList1", method = RequestMethod.GET)
    public String OrderList1(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	 //根据state判断（0正在发布 1正在进行时 2完成）
        String state = request.getParameter("state");
        List<UserAndOrderSend> list = null;
        //总记录条数
        int count = 0;
        //查询所有订单
       // list = orderSendService.selectAllorderInfo();
    	return null;
    }
    */
    @RequestMapping(value = "/keWordorderInfo", method = RequestMethod.GET)
    public String OrderList1(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	return "";
    }
    
   /* //订单统计 折线图
  	@RequestMapping(value="orderStatisticsLine", method = RequestMethod.GET)
  	public String orderStatisticsLine(String orderType, String year, Model model) throws Exception{
  		
  		if(year == null){
  			Calendar cal = Calendar.getInstance();
  			year = cal.get(Calendar.YEAR) +"";
  		}
  		System.out.println("year="+year);
  		JSONObject data = new JSONObject();
  		//订单数量统计
  		if("orderCount".equals(orderType)){
  			List<OrderStatisVO> orderCountStatis = orderSendService.selectOrderCountOnMonth(year);
  			if(orderCountStatis.size() == 0){
  				data.put("title1", year+"年订单数量统计");
  	  			data.put("categories1", 0);
  	  			data.put("value1", 0);
  	  			data.put("name1", "数量");
  	  			data.put("valueSuffix1", "单");
  			}else{
  				StringBuffer categories = new StringBuffer();
  	  			StringBuffer value = new StringBuffer();
  	  			for(OrderStatisVO os : orderCountStatis){
  	  				categories.append("'"+year+"-"+os.getOrderTime()+"',");
  	  				value.append(os.getAmount()+",");
  	  			}
  	  			String categories_ = null;
  	  			if(categories.length() != 0){
  	  				System.out.println("categories="+categories);
  	  				categories_ = categories.substring(0, categories.length()-1);
  	  			}
  	  			String value_ = value.substring(0,value.length()-1);
  	  			data.put("title1", year+"年订单数量统计");
  	  			data.put("categories1", categories_);
  	  			data.put("value1", value_);
  	  			data.put("name1", "数量");
  	  			data.put("valueSuffix1", "单");
  			}
  			
  			
  		}
  		//订单金额统计
  		if("orderPrice".equals(orderType)){
  			List<OrderStatisVO> orderPriceStatis = orderSendService.selectOrderPriceOnMonth(year);
  			if(orderPriceStatis.size() == 0){
  				data.put("title2", year+"年订单金额统计");
  	  			data.put("categories2", 0);
  	  			data.put("value2", 0);
  	  			data.put("name2", "金额");
  	  			data.put("valueSuffix2", "元");
  			}else{
  				StringBuffer categories = new StringBuffer();
  	  			StringBuffer value = new StringBuffer();
  	  			for(OrderStatisVO os : orderPriceStatis){
  	  				categories.append("'"+year+"-"+os.getOrderTime()+"',");
  	  				value.append(os.getOrderPrice()+",");
  	  			}
  	  			String categories_="";
  	  			String value_ = "";
  	  			if(categories.length() != 0){
  	  				categories_ = categories.substring(0, categories.length()-1);
  	  				value_ = value.substring(0,value.length()-1);
  	  			}
  	  			 
  	  			data.put("title2", year+"年订单金额统计");
  	  			data.put("categories2", categories_);
  	  			data.put("value2", value_);
  	  			data.put("name2", "金额");
  	  			data.put("valueSuffix2", "元");
  			}
  		}
  		List<String> years = orderReceiverService.selectOrderTimeRange();
  		model.addAttribute("years", years);
  		model.addAttribute("year", year);
  		model.addAttribute("data", data);
		model.addAttribute("orderType", orderType);
  		return "order-statis-line";
		return "welcome";
  	}*/
  	//客服帮用户提交评价
  	@RequestMapping(value="submitEevaluate", method = RequestMethod.POST)
  	public String submitEevaluate(String sendId, String nurseId,String userId, Model model,HttpServletRequest request) throws Exception{
  		String mark = request.getParameter("mark");
  		String content = request.getParameter("content");
  		
		List<Evaluate> evaluates = new ArrayList<Evaluate>();
		EvaluateExample evaluateExample = new EvaluateExample();
		Criteria criteria = evaluateExample.createCriteria();
		criteria.andEvaluateOrderSendIdEqualTo(sendId);
		evaluates = evaluateService.selectByExample(evaluateExample);
		SimpleDateFormat format = new SimpleDateFormat();
		if (evaluates.size() > 0) {
			model.addAttribute("state", 1);
		} else {
			Date date = new Date();
			// 初始化实体类
			Evaluate evaluate = new Evaluate();
			// 生成评价ID
			String evaluateId = java.util.UUID.randomUUID().toString()
					.replaceAll("-", "");
			evaluate.setEvaluateId(evaluateId);
			evaluate.setEvaluateUserid(userId);
			evaluate.setEvaluateNurseid(nurseId);
			evaluate.setEvaluateContent(content);
			evaluate.setEvaluateOrderSendId(sendId);
			evaluate.setEvaluateMark(new BigDecimal(mark));
			evaluate.setEvaluateCreatetime(date);
			int i = 0;
				i = evaluateService.insertSelective(evaluate);
			if (i > 0) {
				
				//获取平台的利率
				InterestRateExample example = new InterestRateExample();
				List<InterestRate> list = interestRateService.selectByExample(example);
				BigDecimal interes = BigDecimal.ZERO;
				if(list!=null && !"".equals(interestRateService) && list.size()!=0){
					interes = list.get(0).getInterestRateSize();
				}
				// 通过订单id查询订单详情
				OrderInfoByNurse orderInfoByNurse = orderSendService.selectOrderSendInfoByIdVo(sendId);
				if(orderInfoByNurse==null || "".equals(orderInfoByNurse)){
					model.addAttribute("state", 2);
					return "order-evaluate-go.jsp";
				}
				//获取该订单的费用
				//交通费
				BigDecimal traffic = orderInfoByNurse.getOrderSendTrafficmoney();
				//订单服务费
				BigDecimal service = orderInfoByNurse.getOrderSendCostmoney();
				
				BigDecimal finalMoney = traffic.add(service);
				
				//平台收取的费用
				BigDecimal platform = BigDecimal.ZERO;
				//平台利率收入
				if(interes.compareTo(BigDecimal.ZERO) == 0){//如果平台没有设置利率或者设置的利率为0
					
				}else{
					//平台收取的费用(只收取服务费)
					platform= service.multiply(interes);
					//平台收益
					CapitalPlatform capitalPlatform = new CapitalPlatform();
					capitalPlatform.setCapitalPlatformMoney(platform);
					capitalPlatform.setCapitalPlatformOrderSendId(sendId);
					capitalPlatform.setCapitalPlatformNote("完成订单收益");
					capitalPlatform.setCapitalPlatformCreatetime(date);
					capitalPlatformService.insertSelective(capitalPlatform);
				}
				//最终到护士的钱(交通费加服务费减去平台收益)
				BigDecimal nurseFinalMoney = finalMoney.subtract(platform);
				
				//评价成功将钱打入护士账号(触发器自动加入)
				//将记录插入到护士资金表中
				CapitalNursePool pool = new CapitalNursePool();
				pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
				pool.setCapitalNursePoolPeopleid(nurseId);
				pool.setCapitalNursePoolOrdersendid(sendId);
				pool.setCapitalNursePoolPeopleidIdentity(1);
				pool.setCapitalNursePoolMoney(nurseFinalMoney);
				pool.setCapitalNursePoolType(7);
				pool.setCapitalNursePoolSpeak("平台收取服务费"+interes.multiply(new BigDecimal(100))+"%的利率");
				pool.setCapitalNursePoolCreatetime(date);
				int c = capitalNursePoolService.insertSelective(pool);
				
				//获取护士信息
				Nurse nurse = nurseService.selectForNurseId(nurseId);

				////将推送记录到护士站内信中
				StandInnerLetter innerLetter = new StandInnerLetter();
				innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter.setStandInnerLetterUserId(nurseId);                              
				innerLetter.setStandInnerLetterUserIdentity(1);
				innerLetter.setStandInnerLetterTitle("订单评价");
				//0订单消息/1资金消息/2系统通知
				innerLetter.setStandInnerLetterUserType(0);
				innerLetter.setStandInnerLetterContent("您的单号为"+orderInfoByNurse.getOrderSendNumbers()+"订单于"+format.format(date)+"已被用户评价");
				innerLetter.setStandInnerLetterCreatetime(date);
				standInnerLetterService.insertSelective(innerLetter);
				
				////将到账信息记录到护士站内信中
				StandInnerLetter innerLetter2 = new StandInnerLetter();
				innerLetter2.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter2.setStandInnerLetterUserId(nurseId);                              
				innerLetter2.setStandInnerLetterUserIdentity(1);
				innerLetter2.setStandInnerLetterTitle("订单评价");
				//0订单消息/1资金消息/2系统通知
				innerLetter2.setStandInnerLetterUserType(1);
				innerLetter2.setStandInnerLetterContent("您的单号为"+orderInfoByNurse.getOrderSendNumbers()+"订单于"+format.format(date)+"到账¥"+nurseFinalMoney+",剩余余额¥"+nurse.getNurseBalance());
				innerLetter2.setStandInnerLetterCreatetime(date);
				standInnerLetterService.insertSelective(innerLetter2);
				
				//完成订单的红包(百分比)
				RedPackets redPackets = packetsService.selectRedpacketsInfoByType(4);
				RedPacketsUser redPacketsUser = new RedPacketsUser();
				if(redPackets!=null && !redPackets.equals(redPackets)){
					//给护士发完成订单的红包
					//如果后台设置了完成订单的红包
					redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					
					//订单的(服务费的百分比)
					//护士获得的红包
					BigDecimal money = service.multiply(redPackets.getRedPacketsMoney().divide(new BigDecimal(100)));
					redPacketsUser.setRedPacketsNurseMoney(money);
					redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
					redPacketsUser.setRedPacketsNurseNurseId(nurseId);
					redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
					redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
					redPacketsUser.setRedPacketsNurseCreatetime(date);
					packetsService.insertSelectiveNurseRedPackets(redPacketsUser);
					
					//添加到护士资金池(触发器自动加到护士月)
					CapitalNursePool pool1 = new CapitalNursePool();
					pool1.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
					pool1.setCapitalNursePoolPeopleid(nurseId);
					pool1.setCapitalNursePoolOrdersendid("");
					pool1.setCapitalNursePoolMoney(money);
					pool1.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
					pool1.setCapitalNursePoolType(3);
					pool1.setCapitalNursePoolCreatetime(date);
					capitalNursePoolService.insertSelective(pool1);
					
					////将红包记录到护士站内信中
					StandInnerLetter innerLetter1 = new StandInnerLetter();
					innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					innerLetter1.setStandInnerLetterUserId(nurseId);                     
					innerLetter1.setStandInnerLetterUserIdentity(1);
					innerLetter1.setStandInnerLetterTitle("红包消息");
					//0订单消息/1资金消息/2系统通知
					innerLetter1.setStandInnerLetterUserType(1);
					innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPackets.getRedPacketsMoney()+"的完成订单红包");
					innerLetter1.setStandInnerLetterCreatetime(date);
					standInnerLetterService.insertSelective(innerLetter1);
				}
				//判断是不是首单(固定)
				OrderReceiver orderReceiver = orderReceiverService.selectOrderIsNotFirstOrder(nurseId);
				RedPackets redPackets1 = packetsService.selectRedpacketsInfoByType(6);
				if(orderReceiver==null || "".equals(orderReceiver)){//首单
					if(redPackets1!=null && !"".equals(redPackets1)){//后台设置了首单返利
						//如果后台设置了推荐送的红包
						RedPackets redPacketsFirst = packetsService.selectRedpacketsInfoByType(3);
						RedPacketsUser redPacketsUserfirst = new RedPacketsUser();
						redPacketsUserfirst.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						redPacketsUserfirst.setRedPacketsNurseMoney(redPacketsFirst.getRedPacketsMoney());
						redPacketsUserfirst.setRedPacketsNursePic(redPacketsFirst.getRedPacketsPic());
						redPacketsUserfirst.setRedPacketsNurseNurseId(nurseId);
						redPacketsUserfirst.setRedPacketsNurseNote(redPacketsFirst.getRedPacketsNote());
						redPacketsUserfirst.setRedPacketsNurseSpeak(redPacketsFirst.getRedPacketsSpeak());
						redPacketsUserfirst.setRedPacketsNurseCreatetime(date);
						packetsService.insertSelectiveNurseRedPackets(redPacketsUserfirst);
						
						//添加到护士资金池(触发器自动加到护士月)
						CapitalNursePool poolfirst = new CapitalNursePool();
						poolfirst.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
						poolfirst.setCapitalNursePoolPeopleid(nurseId);
						poolfirst.setCapitalNursePoolOrdersendid("");
						poolfirst.setCapitalNursePoolMoney(redPacketsFirst.getRedPacketsMoney());
						poolfirst.setCapitalNursePoolSpeak(redPacketsFirst.getRedPacketsSpeak());
						poolfirst.setCapitalNursePoolType(5);
						poolfirst.setCapitalNursePoolCreatetime(date);
						capitalNursePoolService.insertSelective(poolfirst);
						
						////将推送记录到护士站内信中
						StandInnerLetter innerLetter1 = new StandInnerLetter();
						innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter1.setStandInnerLetterUserId(nurseId);                              
						innerLetter1.setStandInnerLetterUserIdentity(1);
						innerLetter1.setStandInnerLetterTitle("首单红包");
						//0订单消息/1资金消息/2系统通知
						innerLetter1.setStandInnerLetterUserType(1);
						innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPacketsFirst.getRedPacketsMoney()+"的首单红包");
						innerLetter1.setStandInnerLetterCreatetime(new Date());
						standInnerLetterService.insertSelective(innerLetter1);
					}
				}
				//判断我是不是被别人邀请来的
				//查询邀请我的人
			    Invitation invitation = invitationService.selectinvitationMe(nurseId);
			    if(invitation!=null && !"".equals(invitation)){
			    	//获取邀请我的人ID
			    	String beNurseId = invitation.getInvitationUserId();
			    	RedPackets redPacketsFirst1 = packetsService.selectRedpacketsInfoByType(5);
			    	//获取返利百分比
			    	if(redPacketsFirst1!=null && !"".equals(redPacketsFirst1)){//后台设置了返利红包
			    		//获取返利百分比
			    		BigDecimal percentage = redPacketsFirst1.getRedPacketsMoney().divide(new BigDecimal(100));
			    		//获取返利的金额(服务费X百分比)
			    		BigDecimal rebate = service.multiply(percentage);
			    		
							RedPacketsUser redPacketsUserfirst1 = new RedPacketsUser();
							redPacketsUserfirst1.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							redPacketsUserfirst1.setRedPacketsNurseMoney(rebate);
							redPacketsUserfirst1.setRedPacketsNursePic(redPacketsFirst1.getRedPacketsPic());
							redPacketsUserfirst1.setRedPacketsNurseNurseId(beNurseId);
							redPacketsUserfirst1.setRedPacketsNurseNote(redPacketsFirst1.getRedPacketsNote());
							redPacketsUserfirst1.setRedPacketsNurseSpeak(redPacketsFirst1.getRedPacketsSpeak());
							redPacketsUserfirst1.setRedPacketsNurseCreatetime(new Date());
							packetsService.insertSelectiveNurseRedPackets(redPacketsUserfirst1);
							
							//添加到护士资金池(触发器自动加到护士月)
							CapitalNursePool poolfirst = new CapitalNursePool();
							poolfirst.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
							poolfirst.setCapitalNursePoolPeopleid(beNurseId);
							poolfirst.setCapitalNursePoolOrdersendid("");
							poolfirst.setCapitalNursePoolMoney(rebate);
							poolfirst.setCapitalNursePoolSpeak(redPacketsFirst1.getRedPacketsSpeak());
							poolfirst.setCapitalNursePoolType(5);
							poolfirst.setCapitalNursePoolCreatetime(new Date());
							capitalNursePoolService.insertSelective(poolfirst);
							
							////将推送记录到护士站内信中
							StandInnerLetter innerLetter1 = new StandInnerLetter();
							innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							innerLetter1.setStandInnerLetterUserId(beNurseId);                              
							innerLetter1.setStandInnerLetterUserIdentity(1);
							innerLetter1.setStandInnerLetterTitle("返利红包");
							//0订单消息/1资金消息/2系统通知
							innerLetter1.setStandInnerLetterUserType(1);
							innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+rebate+"的返利红包");
							innerLetter1.setStandInnerLetterCreatetime(new Date());
							standInnerLetterService.insertSelective(innerLetter1);
						}
			    }
				
				if(c==0){
					model.addAttribute("state", 3);
					return "order-evaluate-go";
				}else{
					model.addAttribute("state", 4);
				}
			} else {
				return "404";
			}
		}
  		return "order-evaluate-go";
  	}
  	//客服发送返利红包给护士
	@RequestMapping(value="RebateSendl", method = RequestMethod.GET)
  	public String RebateSendl(String orderSendId, Model model) throws Exception{
		//得到开单的护士信息
		 OrderReceiverAndOrderVO andOrderVO = orderReceiverService.selectStateNurseOrderInfoByid(orderSendId);
		 
		 //得到护士的信息
		 if(andOrderVO==null || "".equals(andOrderVO)){
			 return "404";
		 }
		 //根据护士ID得到邀请人的护士ID
		 Invitation invitation = invitationService.selectinvitationMe(andOrderVO.getOrderNurseid());
		 
		if(invitation==null || "".equals(invitation)){
			return "404";
		}
		 //得到返利的奖励
		//订单服务费
		BigDecimal service = andOrderVO.getOrderSendCostmoney();
			//返利红包(百分比)
			RedPackets redPackets = packetsService.selectRedpacketsInfoByType(5);
			RedPacketsUser redPacketsUser = new RedPacketsUser();
			if(redPackets!=null && !"".equals(redPackets)){
				//护士获得的红包
				BigDecimal money = service.multiply(redPackets.getRedPacketsMoney().divide(new BigDecimal(100)));
				//如果后台设置了返利送的红包(mysql触发器自动加入余额)
				redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				redPacketsUser.setRedPacketsNurseMoney(money);
				redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
				redPacketsUser.setRedPacketsNurseNurseId(invitation.getInvitationUserId());//邀请人
				redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
				redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
				redPacketsUser.setRedPacketsNurseCreatetime(new Date());
				packetsService.insertSelectiveNurseRedPackets(redPacketsUser);
				
				CapitalNursePool pool = new CapitalNursePool();
				pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
				pool.setCapitalNursePoolPeopleid(invitation.getInvitationUserId());
				pool.setCapitalNursePoolOrdersendid(orderSendId);
				pool.setCapitalNursePoolMoney(money);
				pool.setCapitalNursePoolPeopleidIdentity(1);
				pool.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
				pool.setCapitalNursePoolType(4);
				pool.setCapitalNursePoolCreatetime(new Date());
				capitalNursePoolService.insertSelective(pool);
			}
		
			model.addAttribute("state", 7);
		return "redirect:OrderList.action?state=7";
	}
	
	
	//退款
	@RequestMapping(value="RefundMoney", method = RequestMethod.GET)
  	public void RefundMoney(HttpServletRequest request,HttpServletResponse response,Model model, String orderSendId,Integer pageNow) throws Exception{
		PrintWriter out = response.getWriter();
		if(orderSendId == null || "".equals(orderSendId)){
  			//return "404";
  			out.print("错误");
  		}
  		//根据订单判断是谁取消的
  		//如果是用户取消
  		OrderSendCancalVo orderSendCancalVo = orderCancelOrderService.selectOrderAndCancaByOrderId(orderSendId);
  		SimpleDateFormat dateFormat =  new SimpleDateFormat();
  		//判断这个订单有没有做记录
  		//得到订单信息
  		OrderSend orderSend = orderSendService
				.selectOrderSendInfoById(orderSendId);
  		if(orderSend == null || "".equals(orderSend)){//如果订单不存在
  			out.print(444);
  		}else{
  		Complaint complaint = complaintService.selectComplaintByOrderSendIDAndSpare(orderSendId, "0",dateFormat.format(orderSend.getOrderSendCreatetime()));
  		Integer handleMode = complaint.getComplaintHandleMode();
  		if(complaint == null || "".equals(complaint)){
  			 //model.addAttribute("RefundState", 555);//请对订单记录之后再做操作
  			out.print(555);
  			// model.addAttribute("state", 8);
  			// return "order-list";
  		}
  		//判断记录的操作是不是退款
  		//得到记录
  		else if(handleMode == null || "".equals(handleMode)){
  			/* model.addAttribute("RefundState", 444);//发生了不可预知的错误,请联系后台管理员(记录的取消订单没有状态)
  			 model.addAttribute("state", 8);*/
  			 //return "order-list";
  			out.print(444);
  		}
  		else if(handleMode != 0 && !"0".equals(handleMode)){
 			/* model.addAttribute("RefundState", 888);//您的记录与操作不符,请修改正确再操作
 			 model.addAttribute("state", 8);*/
 			 //return "order-list";
 			out.print(888);
 		}
  		
  		else if(orderSendCancalVo==null || "".equals(orderSendCancalVo)){
  			//return "404";
  			out.print("错误");
  		}else{
  			SimpleDateFormat format = new SimpleDateFormat();
  			//取消人的身份(0用户1护士)
  	  		int cancalIdentity = orderSendCancalVo.getOrderSendStoptime();
  	  		String userId = orderSendCancalVo.getOrderSendUserid();
  	  		//订单的服务费用
  	  		BigDecimal serverMoney = orderSendCancalVo.getOrderSendCostmoney();
  	  		//订单交通费 
  	  		BigDecimal trafficmoney = orderSend.getOrderSendTrafficmoney();
  	  		//护士应得的费用(服务费加交通费)
	  	  	BigDecimal nuserMoney = serverMoney.add(trafficmoney);
  	  		
  	  		
  	  		//该订单的总费用
  	  		BigDecimal totalMoney =orderSendCancalVo.getOrderSendTotalmoney();
  	  		//订单取消前的身份
  	  		int cancalBeforeState = orderSendCancalVo.getOrderCancalOrderState();
  	  		
  	  		if(cancalBeforeState==0 || "".equals(cancalBeforeState) ){
  	  			//return "404";
  	  		}
  	  		//获取平台的利率
			InterestRateExample example = new InterestRateExample();
			List<InterestRate> list = interestRateService.selectByExample(example);
			BigDecimal interes = BigDecimal.ZERO;
			if(list!=null && !"".equals(interestRateService) && list.size()!=0){
				interes = list.get(0).getInterestRateSize();
			}
			////将推送记录到用户站内信中
			StandInnerLetter innerLetter1 = new StandInnerLetter();
			innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			innerLetter1.setStandInnerLetterTitle("订单退款");
			//0订单消息/1资金消息/2系统通知
			innerLetter1.setStandInnerLetterUserType(1);
			innerLetter1.setStandInnerLetterCreatetime(new Date());
			
			////将推送记录到护士站内信中
			StandInnerLetter innerLetter2 = new StandInnerLetter();
			innerLetter2.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			innerLetter2.setStandInnerLetterTitle("订单退款");
			//0订单消息/1资金消息/2系统通知
			innerLetter2.setStandInnerLetterUserType(1);
			innerLetter2.setStandInnerLetterCreatetime(new Date());
  	  		
			//得到开单的护士信息
			OrderReceiverAndOrderVO andOrderVO = orderReceiverService.selectStateNurseOrderInfoByid(orderSendId);
  	  		//取消者是用户
  	  		if(cancalIdentity==0){
  	  			//退款
  				CapitalUserPool capitalUserPool = new CapitalUserPool();
  				capitalUserPool.setCapitalUserPoolId(java.util.UUID.randomUUID().toString()
  						.replaceAll("-", ""));
  				capitalUserPool.setCapitalUserPoolPeopleid(userId);
  				capitalUserPool.setCapitalUserPoolOrdersendid(orderSendId);
  				//订单取消前是发布中状态,退全款
  	  			if(cancalBeforeState==5 || "5".equals(cancalBeforeState)){
  	  				capitalUserPool.setCapitalUserPoolPeopleIdentity(1);
  	  				capitalUserPool.setCapitalUserPoolMoney(totalMoney);
  	  				capitalUserPool.setCapitalUserPoolSpeak("订单全额退款");
  	  				
  	  				//用户站内信
  	  				innerLetter1.setStandInnerLetterUserIdentity(0);
  	  				innerLetter1.setStandInnerLetterUserId(userId);  
  	  				innerLetter1.setStandInnerLetterContent("由于您在发布中取消,订单全额退款,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"退款¥"+totalMoney+"");
  	  			}else{
  	  				//如果服务距离开始时间3小时(退全款)
  	  				//订单开始的时间
  	  				Date begintime = orderSendCancalVo.getOrderSendBegintime();
  	  				//订单的取消时间
  	  				Date cancalTime = orderSendCancalVo.getOrderCancalUserCancelTime();
  	  				//得到两者时间差
  	  				Integer hour = DateUtil.getDatePoor(cancalTime,begintime);
  	  				if(hour>=180){ //开始时间3小时前取消
  	  	  				capitalUserPool.setCapitalUserPoolMoney(totalMoney);
  	  	  			    capitalUserPool.setCapitalUserPoolPeopleIdentity(1);
  	  	  				capitalUserPool.setCapitalUserPoolSpeak("您在订单开始3小时前取消,订单退全款");
  	  	  			
  	  	  				//用户站内信
  	  	  				innerLetter1.setStandInnerLetterUserIdentity(0);
  	  	  				innerLetter1.setStandInnerLetterUserId(userId);  
  	  	  				innerLetter1.setStandInnerLetterContent("由于您在订单开始3小时前取消,订单退全款,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"退款¥"+totalMoney+"");
  	  				
  	  	  				//护士站内信
    	  				innerLetter2.setStandInnerLetterUserIdentity(1);
    	  				innerLetter2.setStandInnerLetterUserId(andOrderVO.getOrderNurseid());  
    	  				innerLetter2.setStandInnerLetterContent("由于用户在订单开始3小时前取消,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"收款¥0.00");
  	  				
  	  				}else{
  	  					//服务器取消
  	  					//付款总费用的的50%(保留2位小数,不四舍五入)
  	  					DecimalFormat    df   = new DecimalFormat("######0.00"); 
  	  					BigDecimal halfMoney = new BigDecimal(df.format(totalMoney.multiply(new BigDecimal(0.5))));
  						CapitalNursePool pool = new CapitalNursePool();
  						pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
  							.replaceAll("-", ""));
  						pool.setCapitalNursePoolPeopleid(andOrderVO.getOrderNurseid());
  						pool.setCapitalNursePoolOrdersendid(orderSendId);
  	  					if(cancalBeforeState==1 || cancalBeforeState==2){//退服务费的50%
  	  						//用户资金表
  	  					    capitalUserPool.setCapitalUserPoolPeopleIdentity(1);
  	  					    //护士拿到的钱
	  	  		  	  		//护士应得的费用(服务费加交通费)的一半
	  	  		  	  		BigDecimal haflNuserMoney = new BigDecimal(df.format(nuserMoney.multiply(new BigDecimal(0.5))));
	  	  		  	  		
	  	  		  	  		//护士最终拿到的钱
	  	  		  	  		BigDecimal finalNurseMoney =  haflNuserMoney;
	  	  		  	  		
  	  					    //平台拿的钱
  	  					    BigDecimal platFormMoney = BigDecimal.ZERO;
  	  					    if(interes!=BigDecimal.ZERO && !"0".equals(interes)){
  	  					    	//平台拿的钱从护士的钱扣
  	  					    	platFormMoney =  haflNuserMoney.multiply(interes);
  	  					    	finalNurseMoney = haflNuserMoney.subtract(platFormMoney);
  	  					    }
  	  	  	  				capitalUserPool.setCapitalUserPoolMoney(halfMoney);
  	  	  	  				capitalUserPool.setCapitalUserPoolSpeak("您在服务开始前取消,扣您付款总费用的50%");
  	  	  	  				
  	  	  	  				//用户站内信
  	  	  	  				innerLetter1.setStandInnerLetterUserIdentity(0);
  	  	  	  				innerLetter1.setStandInnerLetterUserId(userId);  
  	  	  	  				innerLetter1.setStandInnerLetterContent("由于您在服务开始前取消,扣您付款总费用的50%,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"退款¥"+halfMoney+"");
  	  	  	  				
  	  	  	  				//将记录插入到护士资金表中(触发器讲钱加到护士余额中)
  	  						pool.setCapitalNursePoolMoney(finalNurseMoney);
  	  						pool.setCapitalNursePoolSpeak("由于用户在服务开始前取消,您收取当前服务费用50%扣除客服费用");
  	  						
  	  						//护士站内信
  	    	  				innerLetter2.setStandInnerLetterUserIdentity(1);
  	    	  				innerLetter2.setStandInnerLetterUserId(andOrderVO.getOrderNurseid());  
  	    	  				innerLetter2.setStandInnerLetterContent("由于用户在服务开始前取消,您收取当前服务费用50%扣除客服费用,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"收款¥"+finalNurseMoney+"");
  	  						
	  	  					//平台收益
	  	  					CapitalPlatform capitalPlatform = new CapitalPlatform();
	  	  					capitalPlatform.setCapitalPlatformMoney(platFormMoney);
	  	  					capitalPlatform.setCapitalPlatformOrderSendId(orderSendId);
	  	  					capitalPlatform.setCapitalPlatformNote("完成订单收益");
	  	  					capitalPlatform.setCapitalPlatformCreatetime(new Date());
	  	  					capitalPlatformService.insertSelective(capitalPlatform);
  	  						
  	  					}else{
  	  						//服务开始后取消，款子扣100%
  	  						capitalUserPool.setCapitalUserPoolPeopleIdentity(1);
  	  	  	  				capitalUserPool.setCapitalUserPoolMoney(new BigDecimal(0.00));
  	  	  	  				capitalUserPool.setCapitalUserPoolSpeak("您在服务开始后取消,扣服务费100%");
  	  	  	  				
  	  	  	  				//用户站内信
  	  	  	  				innerLetter1.setStandInnerLetterUserIdentity(0);
  	  	  	  				innerLetter1.setStandInnerLetterUserId(userId);  
  	  	  	  				innerLetter1.setStandInnerLetterContent("您在服务开始后取消,扣服务费100%,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"退款¥0.00");
  	  	  	  				
  	  	  	  				//将记录插入到护士资金表中(触发器讲钱加到护士余额中)
  	  	  	  				//护士拿到的钱
  	  	  	  				//平台拿的钱
  	  					    BigDecimal platFormMoney = BigDecimal.ZERO;
  	  					    
  	  					    //护士最终拿到的钱
	  	  		  	  		BigDecimal finalNurseMoney =  nuserMoney;
  	  					    if(interes!=BigDecimal.ZERO && !"0".equals(interes)){
	  					    	//平台拿的钱从护士的钱扣
	  					    	platFormMoney = nuserMoney.multiply(interes);
	  					    	finalNurseMoney = nuserMoney.subtract(platFormMoney);
	  					    }
  	  						pool.setCapitalNursePoolMoney(finalNurseMoney);
  	  						pool.setCapitalNursePoolSpeak("由于用户在服务开始后取消,您收取当前100%费用扣除客服费用");
  	  						
  	  						//护士站内信
  	    	  				innerLetter2.setStandInnerLetterUserIdentity(1);
  	    	  				innerLetter2.setStandInnerLetterUserId(andOrderVO.getOrderNurseid());  
  	    	  				innerLetter2.setStandInnerLetterContent("由于用户在服务开始后取消,您收取当前100%费用扣除客服费用,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"收款¥"+finalNurseMoney);
  	  						
  	  					    //平台收益
	  	  					CapitalPlatform capitalPlatform = new CapitalPlatform();
	  	  					capitalPlatform.setCapitalPlatformMoney(platFormMoney);
	  	  					capitalPlatform.setCapitalPlatformOrderSendId(orderSendId);
	  	  					capitalPlatform.setCapitalPlatformNote("完成订单收益");
	  	  					capitalPlatform.setCapitalPlatformCreatetime(new Date());
	  	  					capitalPlatformService.insertSelective(capitalPlatform);
  	  					}
  	  					pool.setCapitalNursePoolType(7);
  						pool.setCapitalNursePoolCreatetime(new Date());
  						capitalNursePoolService.insertSelective(pool);
  						
  						
  	  				}
  	  			}
  	  			capitalUserPool.setCapitalUserPoolCreatetime(new Date());
  				capitalUserPoolService.insertSelective(capitalUserPool);
  				//修改取消订单表为退款状态
  				OrderCancelOrder cancelOrder = new OrderCancelOrder();
  				cancelOrder.setOrderCancelOrderSendId(orderSendId);
  				cancelOrder.setOrderCancalWhetherRefund(0);
  				orderCancelOrderService.updateByPrimaryKeySelective(cancelOrder);
//  				//取消之后该删除订单
//  				OrderSendExample example = new OrderSendExample();
//  				com.chance.ssm.po.OrderSendExample.Criteria criteria = example.createCriteria();
//  				criteria.andOrderSendIdEqualTo(orderSendId);
//  				orderSendService.deleteByExample(example);
  	  		}else{
  	  			//取消者是护士,该款项100%退换给用户
  				CapitalUserPool capitalUserPool = new CapitalUserPool();
  				capitalUserPool.setCapitalUserPoolId(java.util.UUID.randomUUID().toString()
  						.replaceAll("-", ""));
  				capitalUserPool.setCapitalUserPoolPeopleid(userId);
  				capitalUserPool.setCapitalUserPoolOrdersendid(orderSendId);
  				capitalUserPool.setCapitalUserPoolPeopleIdentity(1);
  				capitalUserPool.setCapitalUserPoolMoney(totalMoney);
  	  			capitalUserPool.setCapitalUserPoolSpeak("护士取消了您的服务,订单费用100%退还");
  	  			capitalUserPool.setCapitalUserPoolCreatetime(new Date());
  				capitalUserPoolService.insertSelective(capitalUserPool);
  				
  				//用户站内信
  				innerLetter1.setStandInnerLetterUserIdentity(0);
  				innerLetter1.setStandInnerLetterUserId(userId);  
  				innerLetter1.setStandInnerLetterContent("护士取消了您的服务,订单费用100%退还,您单号为"+orderSend.getOrderSendNumbers()+"的订单于"+format.format(new Date())+"退款¥"+totalMoney);
//  		
  				//护士站内信
  				innerLetter2.setStandInnerLetterUserIdentity(1);
  				innerLetter2.setStandInnerLetterUserId(andOrderVO.getOrderNurseid());  
  				innerLetter2.setStandInnerLetterContent("您于"+format.format(new Date())+"取消了单号为"+orderSend.getOrderSendNumbers()+"的订单,收款¥0.00");
					
  				//取消之后该删除订单
//  				OrderSendExample example = new OrderSendExample();
//  				com.chance.ssm.po.OrderSendExample.Criteria criteria = example.createCriteria();
//  				criteria.andOrderSendIdEqualTo(orderSendId);
//  				orderSendService.deleteByExample(example);
  	  		}
  	  		//用户站内信
  	  		standInnerLetterService.insertSelective(innerLetter1);
  	  		//护士站内信
  	  		standInnerLetterService.insertSelective(innerLetter2);
  	  		//修改该退款订单的状态为退款状态
  	  		OrderCancelOrder cancelOrder1 = new OrderCancelOrder();
  	  		cancelOrder1.setOrderCancelOrderSendId(orderSendId);
  	  		cancelOrder1.setOrderCancalWhetherRefund(0);
  	  		int c = orderCancelOrderService.updateByPrimaryKeySelective(cancelOrder1);
  	  		if(c>0){
  	  			out.print(666);
  	  		}else{
  	  			out.print(444);
  	  		}
  	  		
  		}
  		}
	}
	
	   //等待客服发放的订单
    @RequestMapping(value = "/OrderListWaitSet", method = RequestMethod.GET)
    public String OrderListWaitSet(Model model, HttpServletRequest request, HttpServletResponse response,Integer pageNow) throws Exception {
        //根据state判断（0正在发布 1正在进行时 2完成）
        List<UserAndOrderSend> list = new ArrayList<UserAndOrderSend>();
        //List<UserAndOrderSend> listIng = new ArrayList<UserAndOrderSend>();
        //分页
  		pageNow = pageNow==null ? 1 : pageNow;
  		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
  		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
  		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
  		list = orderSendService.selectOrderSendWaitServiceSure(params);//等待客服发放的订单
  		int userCount=orderSendService.selectCountOrderSendWaitServiceSure();
  		int totalPage=Pager.getTotalPage(userCount);
  		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
  	   //如果有人接取 查出接取护士的信息
        for (UserAndOrderSend andOrderSend : list) {
            String OrderSendState = andOrderSend.getOrderSendState();
            //如果订单状态不为空 说明有人接取 ，查出接取护士的信息
            if (!"".equals(OrderSendState) || !"0".equals(OrderSendState)) {
                Nurse nurse = nurseService.selectNurseInfoByOrder(andOrderSend.getOrderSendId());
                //受护人id
                String orderSendUserNameId = andOrderSend.getOrderSendUsername();
                //通过受护人id查询受护人信息
                if(orderSendUserNameId!=null ||!"".equals(orderSendUserNameId)){
                	ProtectedPerson protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserNameId);
                	if(protectedPerson!=null || "".equals(protectedPerson)){
                		andOrderSend.setOrderSendUsername(protectedPerson.getProtectedPersonName());
                	}
                }
                //服务产品信息
            	String[] contentid = andOrderSend.getOrderSendServicecontent().split(",");
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
    					andOrderSend.setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						andOrderSend.setOrderSendServicecontent("该服务不存在");
					}
				}
                //将护士信息插入到UserAndOrderSend实体类中
                if (nurse != null) {
                    andOrderSend.setNurseId(nurse.getNurseId());
                    andOrderSend.setNurseName(nurse.getNurseName());
                    andOrderSend.setNurseNick(nurse.getNurseNick());
                }
            }
        }
      //查询开关状态
		Switch switch1 = orderSendService.selectSwhtchState();
		int switchstate = switch1.getSwitchOrderOpen();
		model.addAttribute("switchstate", switchstate);
        model.addAttribute("list", list);
        model.addAttribute("count", userCount);
        request.setAttribute("pageNow", pageNow);
 		request.setAttribute("totalPage", totalPage);
 		request.setAttribute("start", result.get("start"));
 		request.setAttribute("end", result.get("end"));
  		return "order-list-waitingset";
    }
    //客服发的订单
    @RequestMapping(value = "/OrderListWaitAgree", method = RequestMethod.GET)
    public String OrderListWaitAgree(Model model, HttpServletRequest request,String orderSendId, HttpServletResponse response,Integer pageNow) throws Exception {
    	//判断该订单的状态
    	OrderSend orderSend1 = orderSendService.selectOrderSendInfoById(orderSendId);
    	if(orderSend1 == null || "".equals(orderSend1)){
    		return "redirect:OrderListWaitSet.action?pageNow="+pageNow;
    	}else{
    		//得到订单的状态
    		String orderSendState = orderSend1.getOrderSendState();
    		if(orderSendState != "8" && !"8".equals(orderSendState)){
    			return "redirect:OrderListWaitSet.action?pageNow="+pageNow;
    		}
    	}
    	//将订单状态修改成发布中状态
    	OrderSend orderSend2 = new OrderSend();
    	orderSend2.setOrderSendId(orderSendId);
    	orderSend2.setOrderSendState("0");
    	int i = orderSendService.updateByOrderSendId(orderSend2);
    	if(i==0){
    		return "404";
    	}else{
    		//根据服务给匹配的护士发推送
	    	//根据订单ID得到产品ID
			OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
			if(orderSend != null && !"".equals(orderSend)){
				String goodsId = orderSend.getOrderSendServicecontent();
				if(goodsId != null && !"".equals(goodsId)){
					String[] goods = goodsId.split(",");
					//通过产品ID查询二级服务信息
					ManageNursingContent manageNursingContent =manageNursingContentService.selectManageNursingContenInfoByGoodsId(goods[0]);
					if(manageNursingContent!=null && !"".equals(manageNursingContent)){
						String  manageNursingContentId =  manageNursingContent.getManageNursingContentId();
						//根据服务ID查询匹配的护士ID
					    List<NursingProject> nursingProjects = nursingProjectService.selectNurseIdByContentIdFor(manageNursingContentId);
					    for (NursingProject nursingProject : nursingProjects) {
					    	//护士ID
							final String nurseId = nursingProject.getNursingNurseid();
							//根据护士ID得到护士账号
							final Nurse nurse = nurseService.selectForNurseId(nurseId);
							if(nurse != null){
								Thread thread = new Thread() {
									public void run() {
										//护士账号
										final String nurseName = nurse.getNurseName();
										// 向客户端发送推送
										String TITLE = "普通订单";
										String ALERT = "亲,发现有一条订单,请看是否合适";
										String MSG_CONTENT = "亲,发现有一条订单,请看是否合适";
										//指定推送
										JdpushPeo.testSendPush(nurseappKey,nursemasterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
										//通知
										Jdpush.testSendPush(nurseappKey,nursemasterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
										//发送短信
										SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nurseName, "【小护健康】亲,发现有一条订单,请看是否合适", null, null, "0",  null,  null,  null,  null, null,  null, null);
									};
								};
								thread.start();
							}
						}
					}
				}
			}
    		return "redirect:OrderListWaitSet.action?pageNow="+pageNow;
    	}
    }
	
	
  //订单统计 柱状图
  	@RequestMapping(value="orderStatisticsCol", method = RequestMethod.GET)
  	public String orderStatisticsCol(String orderType, String year, Model model) throws Exception{
  		if(year == null){
  			Calendar cal = Calendar.getInstance();
  			year = cal.get(Calendar.YEAR) +"";
  		}
  		JSONObject series = new JSONObject();			//一级图表
  		JSONObject series_data = new JSONObject();		//一级图表data单个
  		JSONArray series_data_arr = new JSONArray();	//一级图表data json数组
  		
  		JSONObject drilldown_series = new JSONObject(); 	//二级图表
  		JSONArray drilldown_series_arr = new JSONArray();	//二级图表的data
  		
  		String title_text_1="";
  		String title_text_2="";
  		String unit = "";
  		int decimalPoint = 0;
  		
  		if("orderCount".equals(orderType)){
  			title_text_1 = year+"年订单数量统计";
  			title_text_2 = "每月订单交易数量";
  			unit = "单";
  			
  			series.put("name", "订单统计");
  			series.put("colorByPoint", "true");
  			
  			//根据年份查询每月订单数量
  			List<OrderStatisVO> orderCountStatis = orderSendService.selectOrderCountOnMonth(year);	
  			for(OrderStatisVO os : orderCountStatis){
  				series_data.put("name", year+"-"+os.getOrderTime());		//一级图表每列名称
  	  			series_data.put("y", os.getAmount());						//一级图表每列值
  	  			series_data.put("drilldown", year+"-"+os.getOrderTime());	//一级图表每列关联二级图表每列id
  	  			series_data_arr.add(series_data);
  	  			
	  	  		drilldown_series.put("name", year+"-"+os.getOrderTime());	//二级图表每列名称
	  			drilldown_series.put("id", year+"-"+os.getOrderTime());		//二级图表每列id
	  			
	  			//根据年和月查询每日订单
	  			List<OrderStatisVO> orderCountStatis_sub = orderSendService.selectOrderCountDetailByDay(year+"-"+os.getOrderTime());
	  			
	  			StringBuffer drilldown_series_sb = new StringBuffer();
	  			for(OrderStatisVO os2 : orderCountStatis_sub){		
	  				drilldown_series_sb.append("['" + os2.getOrderTime() +"'," + os2.getAmount() + "],");
	  			}
	  			
	  			drilldown_series.put("data", "["+drilldown_series_sb.substring(0, drilldown_series_sb.length()-1)+"]");
	  			drilldown_series_arr.add(drilldown_series);
  			}
  			
  			series.put("data", series_data_arr);
  			
  		}
  		
  		if("orderPrice".equals(orderType)){
  			title_text_1 = year+"年订单金额统计";
  			title_text_2 = "每月订单交易金额";
  			unit = "元";
  			decimalPoint = 2;
  			
  			series.put("name", "订单统计");
  			series.put("colorByPoint", "true");
  			
  			//根据年份查询每月订单数量
  			List<OrderStatisVO> orderPriceStatis = orderSendService.selectOrderPriceOnMonth(year);	
  			for(OrderStatisVO os : orderPriceStatis){
  				series_data.put("name", year+"-"+os.getOrderTime());		//一级图表每列名称
  	  			series_data.put("y", os.getOrderPrice());						//一级图表每列值
  	  			series_data.put("drilldown", year+"-"+os.getOrderTime());	//一级图表每列关联二级图表每列id
  	  			series_data_arr.add(series_data);
  	  			
	  	  		drilldown_series.put("name", year+"-"+os.getOrderTime());	//二级图表每列名称
	  			drilldown_series.put("id", year+"-"+os.getOrderTime());		//二级图表每列id
	  			
	  			//根据年和月查询每日订单
	  			List<OrderStatisVO> orderPriceStatis_sub = orderSendService.selectOrderPriceDetailByDay(year+"-"+os.getOrderTime());
	  			
	  			StringBuffer drilldown_series_sb = new StringBuffer();
	  			for(OrderStatisVO os2 : orderPriceStatis_sub){		
	  				drilldown_series_sb.append("['" + os2.getOrderTime() +"'," + os2.getOrderPrice() + "],");
	  			}
	  			
	  			drilldown_series.put("data", "["+drilldown_series_sb.substring(0, drilldown_series_sb.length()-1)+"]");
	  			drilldown_series_arr.add(drilldown_series);
  			}
  			
  			series.put("data", series_data_arr);
  		
  		}
  		
  		List<String> years = orderReceiverService.selectOrderTimeRange();
  		
  		model.addAttribute("title_text_1", title_text_1);
  		model.addAttribute("title_text_2", title_text_2);
  		model.addAttribute("unit", unit);
  		model.addAttribute("years", years);
  		model.addAttribute("year", year);
  		model.addAttribute("decimalPoint", decimalPoint);
  		model.addAttribute("series", series);
		model.addAttribute("orderType", orderType);
		model.addAttribute("drilldown_series_arr", drilldown_series_arr);
		
  		return "order-statis-col";
  	}
  	//修改订单发放开关(订单需不需要客服手动分发)
	@RequestMapping(value="updateSwitchOpen", method = RequestMethod.POST)
  	public void updateSwitchOpen(String openState, Model model,HttpServletResponse response) throws Exception{
		//修改订单发放开关
		Switch switch1 = new Switch();
		SwitchExample example = new SwitchExample();
		switch1.setSwitchOrderOpen(Integer.parseInt(openState));
		int i = orderSendService.updateByExampleSelectiveSwitch(switch1, example);
		PrintWriter out = response.getWriter();
		if(i==0){
			out.print(3);
		}else{
			 //查询开关状态
			Switch switch2 = orderSendService.selectSwhtchState();
			int switchstate = switch2.getSwitchOrderOpen();
			out.print(switchstate);
		}
	}
  	
  	//根据订单的产品查询匹配的护士信息
	@RequestMapping(value="selectNurseInfoByGoodId", method = RequestMethod.GET)
  	public String selectNurseInfoByGoodId(String newcontentid,String orderSendId, Model model,HttpServletResponse response,String orderSendType) throws Exception{
		//根据订单ID得到用户的ID
		OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
		//根据用户ID得到经纬度
		User user = userService.selectForUserByID(orderSend.getOrderSendUserid());
		NurseProjectVo nurseProjectVo = new NurseProjectVo();
		nurseProjectVo.nursingProjectMacontent = newcontentid;
		nurseProjectVo.locationX = user.getUserPositionX();
		nurseProjectVo.locationY = user.getUserPositionY();
		//将匹配的护士添加到集合中
		List<Nurse> list = new ArrayList<Nurse>();
		//根据二级服务ID查询匹配的护士
		List<NursingProject> nursingProject =  nursingProjectService.selectNurseIdByContentIdForOrderDricts(nurseProjectVo);
		
		for (NursingProject nursingProject2 : nursingProject) {
			//得到护士ID
			String nurseId = nursingProject2.getNursingNurseid();
			//根据护士ID得到护士信息
			Nurse nurse = nurseService.selectForNurseId(nurseId);
			if(nurse!=null && !"".equals(nurse)){
				list.add(nurse);
			}
		}
		
		if(list.size()>0){
			//查询护士所有服务
			for (Nurse nurse : list) {
				if(nurse!=null && !"".equals(nurse)){
					String serviceContent = nurse.getNurseGoodservice();
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
			}
		}
		int setOrderState = 9;
		model.addAttribute("list", list);
		//数据条数
		model.addAttribute("count", list.size());
		model.addAttribute("setOrderState",setOrderState);
		//订单Id
		model.addAttribute("orderSendId",orderSendId);
		if(orderSendType == null || "".equals(orderSendType)){
			orderSendType = "";
		}
		model.addAttribute("orderSendType",orderSendType);
		return "nurse-info";
	}
	
	//订单分配给该护士
	@RequestMapping(value="ChoiceWhoOfNurseId", method = RequestMethod.POST)
  	public void ChoiceWhoOfNurseId(String nurseId,String orderSendId, Model model,HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		if("".equals(nurseId)|| nurseId==null){
			out.print(1);
		}else if("".equals(orderSendId) || orderSendId==null){
			out.print(1);
		}
		OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
		userId = orderSend.getOrderSendUserid();
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		//判断该订单存不存在
		if(orderSend==null || "".equals(orderSend)){
			out.print(1);
		}
		//判断该护士存不存在
		if(nurse==null || "".equals(nurse)){
			out.print(2);
		}
		//判断该护士认证状态 如果未认证提示不能接取
		if(nurse.getNurseDistrict() != "0" && !"0".equals(nurse.getNurseDistrict())){
			//netState.setData("请认证之后再接单");
			//netState.setErrorCode(NetState.PARAMS_ERROR);
			out.print(3);
		}
		/*//判断该护士的接单状态是不是开启
		if(nurse.getNurseCity() =="1" ||"1".equals(nurse.getNurseCity())){
			//netState.setData("请开启接单开关再接取订单");
			//netState.setErrorCode(NetState.PARAMS_ERROR);
			out.print(4);
		}*/
		//如果是取消状态的订单
		Integer state = null;
		if(orderSend.getOrderSendState() == "4" || "4".equals(orderSend.getOrderSendState()))
		{
			
			//修改该订单状态为接取并增加接单时间
			OrderSend orderSend2 = new OrderSend();
			orderSend2.setOrderSendState("1");
			orderSend2.setOrderSendGetOrderTime(new Date());
			orderSend2.setOrderSendId(orderSendId);
			orderSend2.setOrderSendStoptime(state);
			int i = orderSendService.updateByOrderSendId(orderSend2);
			if(i>0){
				//根据用户ID得到用户的账号(手机号)
				User user = userService.selectForUserByID(userId);
				userPhone =  user.getUserName();
				Thread thread = new Thread(){
					public void run() {
						//向客户端发送推送
						String TITLE = "订单接受";
						String ALERT= "有护士接取了您的订单";
						String MSG_CONTENT= "有护士接取了您的订单";
					//指定推送
					JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
					//通知
					Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
						//发送短信
						SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】有护士接取了您的订单", null, null, "0",  null,  null,  null,  null, null,  null, null);
					};
				};
				thread.start();
			}
			
		}else{
			//查看该订单有没有被接取
			if(!"0".equals(orderSend.getOrderSendState())){//该订单已被接取
				//netState.setData("该订单已经被人接取");
				//netState.setErrorCode(NetState.PARAMS_ERROR);
				out.print(4);
			}else{//该订单未被接取
				//修改该订单状态为接取并增加接单时间
				OrderSend orderSend2 = new OrderSend();
				orderSend2.setOrderSendState("1");
				orderSend2.setOrderSendGetOrderTime(new Date());
				orderSend2.setOrderSendId(orderSendId);
				orderSend2.setOrderSendStoptime(state);
				int i = orderSendService.updateByOrderSendId(orderSend2);
				if(i>0){
					//根据用户ID得到用户的账号(手机号)
					User user = userService.selectForUserByID(userId);
					userPhone =  user.getUserName();
					Thread thread = new Thread(){
						public void run() {
							//根据赛区id获取赛区发布人的id
							//向客户端发送推送
							String TITLE = "订单接受";
							String ALERT= "有护士接取了您的订单";
							String MSG_CONTENT= "有护士接取了您的订单";
						//指定推送
						JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
						//通知
						Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
							//发送短信
							SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】有护士接取了您的订单", null, null, "0",  null,  null,  null,  null, null,  null, null);
						};
					};
					thread.start();
				}
		}
		}
		
		//删除掉接单表的记录
		OrderReceiverExample example = new OrderReceiverExample();
		com.chance.ssm.po.OrderReceiverExample.Criteria criteria = example.createCriteria();
		criteria.andOrderOrdersendidEqualTo(orderSendId);
		orderReceiverService.deleteByExample(example);
		
		//根据订单ID删除掉订单取消表的记录
		orderCancelOrderService.deleteByPrimaryKey(orderSendId);
	
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
			out.print(0);
		}else{
			OrderSend orderSend3 = new OrderSend();
			orderSend3.setOrderSendState("0");
			orderSend3.setOrderSendId(orderSendId);
			orderSendService.updateByOrderSendId(orderSend3);
		}
		
	}
	//取消的订单(用户不同意的话)经协商还原成取消前的状态
	@RequestMapping(value="huanyuanOrderSend", method = RequestMethod.POST)
  	public void huanyuanOrderSend(String orderSendId, Model model,HttpServletResponse response) throws Exception{
		//根据订单ID得到取消前的状态
		OrderCancelOrder cancelOrder = orderCancelOrderService.selectCancalBeforeState(orderSendId);
		int cancelOrderState = cancelOrder.getOrderCancalOrderState();
		Integer state = null;
		//修改发单状态
		OrderSend orderSend3 = new OrderSend();
		if(cancelOrderState == 0 || "0".equals(cancelOrderState)){//已接单
			orderSend3.setOrderSendState("1");
		}
		if(cancelOrderState == 1 || "1".equals(cancelOrderState)){//已沟通
			orderSend3.setOrderSendState("1");
		}
		if(cancelOrderState == 2 || "2".equals(cancelOrderState)){//已出发
			orderSend3.setOrderSendState("1");
		}
		if(cancelOrderState == 3 || "3".equals(cancelOrderState)){//开始服务
			orderSend3.setOrderSendState("2");
		}
		if(cancelOrderState == 4 || "4".equals(cancelOrderState)){//已完成
			orderSend3.setOrderSendState("3");
		}
		orderSend3.setOrderSendId(orderSendId);
		orderSend3.setOrderSendStoptime(state);
		orderSendService.updateByOrderSendId(orderSend3);
		//修改接单状态
		OrderReceiver orderReceiver = new OrderReceiver();
		orderReceiver.setOrderReceivestate(String.valueOf(cancelOrderState));
		orderReceiver.setOrderOrdersendid(orderSendId);
		orderReceiverService.updateOrderReceiverState(orderReceiver);
		
		//删除取消订单表的数据
		//根据订单ID删除掉订单取消表的记录
		int i = orderCancelOrderService.deleteByPrimaryKey(orderSendId);
		PrintWriter out = response.getWriter();
		if(i>0){
			out.print(0);
		}else{
			out.print(1);
		}
	}
	
	//客服修改订单信息
	@RequestMapping(value="updateOrderSendInfoBuKefu", method = RequestMethod.POST)
  	public void updateOrderSendInfoBuKefu(String orderSendId,String choseTime, Model model,HttpServletResponse response) throws Exception{
		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date startTime = fmt.parse(choseTime);
		PrintWriter out = response.getWriter();
		
		OrderSend orderSend = new OrderSend();
		orderSend.setOrderSendId(orderSendId);
		orderSend.setOrderSendBegintime(startTime);
		
		int i = orderSendService.updateByOrderSendId(orderSend);
		if(i>0){
			out.print(0);
		}else{
			out.print(1);
		}
	}	
	//查看客服待处理订单时间控制
	@RequestMapping(value="selectTimingControl", method = RequestMethod.GET)
  	public String selectTimingControl(Model model,HttpServletResponse response) throws Exception{
		//获取N
    	TimingControl timingControl = timingControlService.selectTimingControl();
    	int Timing = 0;
    	if(timingControl!=null && !"".equals(timingControl)){
    		Timing = timingControl.getTimingControl();
    	}
    	model.addAttribute("Timing", Timing);
		return "timimg_time";
	}
	//查看客服待处理订单时间控制
	@RequestMapping(value="insertTimingControl", method = RequestMethod.POST)
  	public void insertTimingControl(Model model,HttpServletResponse response,Integer TimingControl) throws Exception{
		PrintWriter out = response.getWriter();
		//获取N
    	TimingControl timingControl = timingControlService.selectTimingControl();
    	if(timingControl!=null && !"".equals(timingControl)){
    		//修改
    		int i = timingControlService.updateTiming(TimingControl);
    		if(i>0){
    			out.print(0);
    		}else{
    			out.print(1);
    		}
    	}else{
    		//插入
    		TimingControl timingControl1 = new TimingControl();
    		timingControl1.setTimingControl(TimingControl);
    		int i = timingControlService.insertSelective(timingControl1);
    		if(i>0){
    			out.print(0);
    		}else{
    			out.print(1);
    		}
    	}
    
	}
}