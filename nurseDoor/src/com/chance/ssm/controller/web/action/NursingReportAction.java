package com.chance.ssm.controller.web.action;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.chance.ssm.mapper.nursingtestingcontentmapper.NursingTestingContentMapper;
import com.chance.ssm.po.CaseLable;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingTestall;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseFinishOrderSignin;
import com.chance.ssm.po.NursingReport;
import com.chance.ssm.po.NursingReportExample;
import com.chance.ssm.po.NursingReportExample.Criteria;
import com.chance.ssm.po.NursingTestingContent;
import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.SigninSet;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.Statistics;
import com.chance.ssm.po.User;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.ComplaintUserAndNurseVo;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.NursingReportKeyWordVO;
import com.chance.ssm.po.vo.NursingUserAndNurseVO;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.ManageNursingTestallService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.NursingReportService;
import com.chance.ssm.service.NursingTestingContentService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.ProtectedPersonService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.StatisticsService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.Pager;
import com.chance.ssm.utils.RandomUtil;
import com.chance.ssm.utils.listRemoval;
import com.mysql.jdbc.log.Log;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushPeo;
/**
 * 护理报告控制类
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
@Controller
public class NursingReportAction {
	
	@Autowired
	private ProtectedPersonService protectedPersonService;
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private NursingReportService nursingReportService;
	
	@Autowired
	private NursingTestingContentService nursingTestingContentService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	@Autowired
	private ManageNursingTestallService manageNursingTestallService;
	
	@Autowired
	private StatisticsService statisticsService;
	
	@Autowired
	private OrderReceiverService orderReceiverService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ComplaintService complaintService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	//用户端
  	private static final String appKey ="8121db7759363542b25159b8";
  	private static final String masterSecret = "c20fa080107794c1337065f9";
    
    private String userId="";
    
    private String userPhone = "";
	
	//查看护理报告详细信息
	@RequestMapping(value="/selectReportdetails",method=RequestMethod.GET)
	public String selectReportdetails(Model model,String orderSendId,String protectedPersonId,String repotrState)throws Exception{
		if(null == orderSendId || "".equals(orderSendId)){
			return "404";
		}else if(null == protectedPersonId || "".equals(protectedPersonId)){
			return "404";
		}
		
		//根据订单id和受护人id得到该订单的受护人详细信息
		ProtectedPerson protectedPerson = protectedPersonService.selectProtectedPersonDetails(protectedPersonId,orderSendId);
		//根据订单id得到订单详细信息()
		OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
		//将服务id变成name
		// 服务产品信息
		String newcontentid = "";
		String goodsName = "";
		String newgoosName = "";
		Goods goods = null;
		if(orderSend != null && !"".equals(orderSend)){
			String[] contentid = orderSend
					.getOrderSendServicecontent().split(",");
			for (int c = 0; c < contentid.length; c++) {
				goods = goodsService.selectByPrimaryKey(contentid[c]);
				if (goods != null) {
					newcontentid = goods.getGoodsContent();
					goodsName = goods.getGoodsName();
					newgoosName += goodsName + ",";
				}
			}
		}
		if (newcontentid != null && !"".equals(newcontentid)) {
			ManageNursingContent manageNursingContent = manageNursingContentService
					.selectmanageNursingContentById(newcontentid);
			if (manageNursingContent != null) {
				String contentname = manageNursingContent
						.getManageNursingContentName();
				newgoosName = newgoosName.substring(0,
						newgoosName.length() - 1);
				orderSend.setOrderSendServicecontent(contentname
						+ ":" + newgoosName);
			} else {
				orderSend.setOrderSendServicecontent("该服务不存在"
						+ ":" + newgoosName);
			}
		}
		//根据订单id得到护士昵称
		//将护士信息填充进去
        Nurse nurse = nurseService.selectNurseInfoByOrder(orderSendId);
        //护士昵称
        String nurseNick="";
        //护士真实姓名和职称
        String nurseTrueName="";
        String nurseJob = "";
        if (nurse != null) {
            nurseNick=nurse.getNurseNick();
            nurseTrueName = nurse.getNurseTruename();
            nurseJob = nurse.getNurseJob();
        }
        //根据订单id得到用户检测项
        List<NursingTestingContent> nursingTestingContent = nursingTestingContentService.selectTestingContentByOrderId(orderSendId);
        //根据订单id得到护理报告详细信息
        NursingReport nursingReport = nursingReportService.selectReportByOrderId(orderSendId);
        
        model.addAttribute("protectedPerson", protectedPerson);
        model.addAttribute("orderSend", orderSend);
        model.addAttribute("nurseNick", nurseNick);
        model.addAttribute("nurseTrueName", nurseTrueName);
        model.addAttribute("nurseJob", nurseJob);
        model.addAttribute("list", nursingTestingContent);
        model.addAttribute("nursingReport", nursingReport);
        model.addAttribute("repotrState", repotrState);
		return "hlbg-reader";
	}
	
	//填写护理报告
		@RequestMapping(value="/selectReportdetailsStay",method=RequestMethod.GET)
		public String selectReportdetailsStay(Model model,String orderSendId,String protectedPersonId)throws Exception{
			
			/*if(null == orderSendId || "".equals(orderSendId)){
				return "404";
			}else if(null == protectedPersonId || "".equals(protectedPersonId)){
				return "404";
			}*/
			//根据订单id和受护人id得到该订单的受护人详细信息
			ProtectedPerson protectedPerson = protectedPersonService.selectProtectedPersonDetails(protectedPersonId,orderSendId);
			//根据订单id得到订单详细信息()
			OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
			//产品检测项
			String orderSendServicecontent = null;
			if(orderSend!=null){
			 orderSendServicecontent = orderSend.getOrderSendServicecontent();
			}
			//根据产品id得到检测项
			//List<ManageNursingTestall> manageNursingTestalls = new ArrayList<ManageNursingTestall>();
			//List<ManageNursingTestall> manageNursingTestalls2 = new ArrayList<ManageNursingTestall>();
			//将服务id变成name
			// 服务产品信息
			String newcontentid = "";
			String goodsName = "";
			String newgoosName = "";
			Goods goods = null;
			if(orderSend != null && !"".equals(orderSend)){
				String[] contentid = orderSend
						.getOrderSendServicecontent().split(",");
				for (int c = 0; c < contentid.length; c++) {
					//根据产品id得到检测项
					//manageNursingTestalls = manageNursingTestallService.selectTestContentByGoodsId(contentid[c]);
					
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if (goods != null) {
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName += goodsName + ",";
					}
					//manageNursingTestalls2.addAll(manageNursingTestalls);
				}
			}
			//去除检测项中重复项manageNursingTestalls2
			/*for  ( int  i  =   0 ; i  <  manageNursingTestalls2.size()  -   1 ; i ++ )   { 
			    for  ( int  j  =  manageNursingTestalls2.size()  -   1 ; j  >  i; j -- )  
			    	{ 
				      if  (manageNursingTestalls2.get(j).getManageNursingTestall().equals(manageNursingTestalls2.get(i).getManageNursingTestall()))   { 
				    	  manageNursingTestalls2.remove(j); 
				      } 
			    	} 
			} 
			*/
			//二级产品的ID
			String contentId = "";
			
			if (newcontentid != null && !"".equals(newcontentid)) {
				ManageNursingContent manageNursingContent = manageNursingContentService
						.selectmanageNursingContentById(newcontentid);
				if (manageNursingContent != null) {
					contentId = manageNursingContent.getManageNursingContentId();
					String contentname = manageNursingContent
							.getManageNursingContentName();
					newgoosName = newgoosName.substring(0,
							newgoosName.length() - 1);
					orderSend.setOrderSendServicecontent(contentname
							+ ":" + newgoosName);
				} else {
					orderSend.setOrderSendServicecontent("该服务不存在"
							+ ":" + newgoosName);
				}
			}
			//得到所有标签
			List<CaseLable> caseLables = nursingReportService.selectAllLableInfo();
			//根据订单id得到护士昵称
			//将护士信息填充进去
	        Nurse nurse = nurseService.selectNurseInfoByOrder(orderSendId);
	        //护士昵称
	        String nurseNick="";
	        String nurseId = "";
	        //护士真实姓名和职称
	        String nurseTrueName="";
	        String nurseJob = "";
	        if (nurse != null) {
	            nurseNick=nurse.getNurseNick();
	            nurseId = nurse.getNurseId();
	            nurseTrueName = nurse.getNurseTruename();
	            nurseJob = nurse.getNurseJob();
	        }
	        model.addAttribute("protectedPerson", protectedPerson);
	        model.addAttribute("orderSend", orderSend);
	        model.addAttribute("nurseNick", nurseNick);
	        //检测项
	       // model.addAttribute("list", manageNursingTestalls2);
	        model.addAttribute("listlable", caseLables);
	        //订单id
	        model.addAttribute("orderSendId", orderSendId);
	        //护士id
	        //产品id
	        model.addAttribute("orderSendServicecontent", orderSendServicecontent);
	        model.addAttribute("nurseId", nurseId);
	        model.addAttribute("nurseTrueName", nurseTrueName);
	        model.addAttribute("nurseJob", nurseJob);
	        //二级服务ID
	        model.addAttribute("contentId", contentId);
			return "hlbg-submit";
		}
		//提交护理报告
		@RequestMapping(value="/selectReportdetailsSubmit",method=RequestMethod.POST)
		public String selectReportdetailsSubmit(Model model,HttpServletRequest request,MultipartRequest multipartRequest)throws Exception{
			//订单id
			String orderId = request.getParameter("orderSendId");
			//二级产品ID
			String contentId = request.getParameter("contentId");
			//护士id
			final String nurseId = request.getParameter("nurseId");
			//产品id
			String orderSendServicecontentId = request.getParameter("orderSendServicecontent");
			//病历标签的值
			String lableinfo = request.getParameter("lableinfo");
			//根据订单id得到订单详细信息()
			OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderId);
			//根据产品id得到检测项
			final Date nowTime = new Date();
			
			
			if(contentId == "2a64345c6f4e48358d198f7d01cf0b97" || "2a64345c6f4e48358d198f7d01cf0b97".equals(contentId)){
				/**
				 * //1 新生儿护理
				 */
				//婴儿出生体重
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("婴儿出生体重");
				String tizhong = request.getParameter("tizhong");//检测数据
				nursingTestingContent.setNursingTestingId(tizhong+"KG");
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        //出生日期
		        NursingTestingContent nursingTestingContent1 = new NursingTestingContent();
		        nursingTestingContent1.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent1.setNursingOrderid(orderId);
		        nursingTestingContent1.setNursingNurseid("出生日期");
				String date = request.getParameter("date");//检测数据
				nursingTestingContent1.setNursingTestingId(date);
				nursingTestingContent1.setNursingProjectNote("2");
				nursingTestingContent1.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent1);
		        
		        //体温
		        NursingTestingContent nursingTestingContent2 = new NursingTestingContent();
		        nursingTestingContent2.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent2.setNursingOrderid(orderId);
		        nursingTestingContent2.setNursingNurseid("体温");
				String tiwen = request.getParameter("tiwen");//检测数据
				nursingTestingContent2.setNursingTestingId(tiwen+"℃");
				nursingTestingContent2.setNursingProjectNote("3");
				nursingTestingContent2.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent2);
		        
		        //出生方式
		        NursingTestingContent nursingTestingContent3 = new NursingTestingContent();
		        nursingTestingContent3.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent3.setNursingOrderid(orderId);
		        nursingTestingContent3.setNursingNurseid("出生方式");
				String chusheng = request.getParameter("radio");//检测数据
				nursingTestingContent3.setNursingTestingId(chusheng);
				nursingTestingContent3.setNursingProjectNote("4");
				nursingTestingContent3.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent3);
		        
		        //出生状态
		        NursingTestingContent nursingTestingContent4 = new NursingTestingContent();
		        nursingTestingContent4.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent4.setNursingOrderid(orderId);
		        nursingTestingContent4.setNursingNurseid("出生状态");
				String zhuangtai = request.getParameter("radio1");//检测数据
				nursingTestingContent4.setNursingTestingId(chusheng);
				nursingTestingContent4.setNursingProjectNote("5");
				nursingTestingContent4.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent4);
		        
		        //精神状态
		        NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
		        nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent5.setNursingOrderid(orderId);
		        nursingTestingContent5.setNursingNurseid("精神状态");
				String jingshen = request.getParameter("radio2");//检测数据
				nursingTestingContent5.setNursingTestingId(jingshen);
				nursingTestingContent5.setNursingProjectNote("6");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		        
		        //外观检查
		        NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
		        nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent6.setNursingOrderid(orderId);
		        nursingTestingContent6.setNursingNurseid("外观检查");
		        String[] waiguan = request.getParameterValues("layout");//检测数据
				String waiguans = "";
				for (int i = 0; i < waiguan.length; i++) {
					waiguans+=waiguan[i]+"/";
				}
				nursingTestingContent6.setNursingTestingId(waiguans.substring(0, waiguans.length()-1));
				nursingTestingContent6.setNursingProjectNote("7");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
		        
		        //喂养
		        NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
		        nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent7.setNursingOrderid(orderId);
		        nursingTestingContent7.setNursingNurseid("喂养");
				String weiyang = request.getParameter("radio4");//检测数据
				nursingTestingContent7.setNursingTestingId(weiyang);
				nursingTestingContent7.setNursingProjectNote("8");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
		        //皮肤
		        NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
		        nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent8.setNursingOrderid(orderId);
		        nursingTestingContent8.setNursingNurseid("皮肤");
				String pifu = request.getParameter("radio5");//检测数据
				nursingTestingContent8.setNursingTestingId(pifu);
				nursingTestingContent8.setNursingProjectNote("9");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
		        //脐部
		        NursingTestingContent nursingTestingContent9 = new NursingTestingContent();
		        nursingTestingContent9.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent9.setNursingOrderid(orderId);
		        nursingTestingContent9.setNursingNurseid("皮肤");
				String qibu = request.getParameter("radio6");//检测数据
				nursingTestingContent9.setNursingTestingId(qibu);
				nursingTestingContent9.setNursingProjectNote("10");
				nursingTestingContent9.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent9);
		        
		        //眼
		        NursingTestingContent nursingTestingContent10 = new NursingTestingContent();
		        nursingTestingContent10.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent10.setNursingOrderid(orderId);
		        nursingTestingContent10.setNursingNurseid("眼");
				String yan = request.getParameter("radio7");//检测数据
				nursingTestingContent10.setNursingTestingId(yan);
				nursingTestingContent10.setNursingProjectNote("11");
				nursingTestingContent10.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent10);
		        
		        //鹅口疮
		        NursingTestingContent nursingTestingContent11 = new NursingTestingContent();
		        nursingTestingContent11.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent11.setNursingOrderid(orderId);
		        nursingTestingContent11.setNursingNurseid("鹅口疮");
				String ekouchuang = request.getParameter("radio8");//检测数据
				nursingTestingContent11.setNursingTestingId(ekouchuang);
				nursingTestingContent11.setNursingProjectNote("12");
				nursingTestingContent11.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent11);
		        
		        //大便次数
		        NursingTestingContent nursingTestingContent12 = new NursingTestingContent();
		        nursingTestingContent12.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent12.setNursingOrderid(orderId);
		        nursingTestingContent12.setNursingNurseid("大便次数");
				String number = request.getParameter("dabiannumber");//检测数据
				nursingTestingContent12.setNursingTestingId(number);
				nursingTestingContent12.setNursingProjectNote("13");
				nursingTestingContent12.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent12);
		        
		        //大便颜色
		        NursingTestingContent nursingTestingContent13 = new NursingTestingContent();
		        nursingTestingContent13.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent13.setNursingOrderid(orderId);
		        nursingTestingContent13.setNursingNurseid("大便颜色");
				String color = request.getParameter("dabiancolor");//检测数据
				nursingTestingContent13.setNursingTestingId(color);
				nursingTestingContent13.setNursingProjectNote("14");
				nursingTestingContent13.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent13);
		        
		        //大便形状
		        NursingTestingContent nursingTestingContent14 = new NursingTestingContent();
		        nursingTestingContent14.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent14.setNursingOrderid(orderId);
		        nursingTestingContent14.setNursingNurseid("大便形状");
				String shape = request.getParameter("dabianshape");//检测数据
				nursingTestingContent14.setNursingTestingId(shape);
				nursingTestingContent14.setNursingProjectNote("15");
				nursingTestingContent14.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent14);
		        
		        //哭声
		        NursingTestingContent nursingTestingContent15 = new NursingTestingContent();
		        nursingTestingContent15.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent15.setNursingOrderid(orderId);
		        nursingTestingContent15.setNursingNurseid("哭声");
				String cry = request.getParameter("dabianCry");//检测数据
				nursingTestingContent15.setNursingTestingId(cry);
				nursingTestingContent15.setNursingProjectNote("16");
				nursingTestingContent15.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent15);
			}
			else if(contentId == "0aa97632a3494c0b86e3fbf137a82bbb" || "0aa97632a3494c0b86e3fbf137a82bbb".equals(contentId)){
				/**
				 * 2 产妇护理套餐
				 */
				//婴儿出生体重
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("婴儿出生体重");
				String tizhong = request.getParameter("tizhong");//检测数据
				nursingTestingContent.setNursingTestingId(tizhong+"KG");
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        //出生方式
				NursingTestingContent nursingTestingContent1 = new NursingTestingContent();
				nursingTestingContent1.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent1.setNursingOrderid(orderId);
				nursingTestingContent1.setNursingNurseid("出生方式");
				String fangs = request.getParameter("radio");//检测数据
				nursingTestingContent1.setNursingTestingId(fangs);
				nursingTestingContent1.setNursingProjectNote("2");
				nursingTestingContent1.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent1);
		        
		        //出生状态
				NursingTestingContent nursingTestingContent2 = new NursingTestingContent();
				nursingTestingContent2.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent2.setNursingOrderid(orderId);
				nursingTestingContent2.setNursingNurseid("出生状态");
				String zhaungtai = request.getParameter("radio1");//检测数据
				nursingTestingContent2.setNursingTestingId(zhaungtai);
				nursingTestingContent2.setNursingProjectNote("3");
				nursingTestingContent2.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent2);
		        
		        //一般健康状况
				NursingTestingContent nursingTestingContent3 = new NursingTestingContent();
				nursingTestingContent3.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent3.setNursingOrderid(orderId);
				nursingTestingContent3.setNursingNurseid("一般健康状况");
				String jiankang = request.getParameter("radio2");//检测数据
				nursingTestingContent3.setNursingTestingId(jiankang);
				nursingTestingContent3.setNursingProjectNote("4");
				nursingTestingContent3.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent3);
		        
		        //一般精神状况
				NursingTestingContent nursingTestingContent4 = new NursingTestingContent();
				nursingTestingContent4.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent4.setNursingOrderid(orderId);
				nursingTestingContent4.setNursingNurseid("一般精神状况");
				String jingshen = request.getParameter("radio21");//检测数据
				nursingTestingContent4.setNursingTestingId(jingshen);
				nursingTestingContent4.setNursingProjectNote("5");
				nursingTestingContent4.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent4);
		        
		        //血压
				NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
				nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent5.setNursingOrderid(orderId);
				nursingTestingContent5.setNursingNurseid("血压");
				String xueya = request.getParameter("xueya");//检测数据
				nursingTestingContent5.setNursingTestingId(xueya+"mmHg");
				nursingTestingContent5.setNursingProjectNote("6");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		    
		        //体温
				NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
				nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent6.setNursingOrderid(orderId);
				nursingTestingContent6.setNursingNurseid("体温");
				String tiwen = request.getParameter("tiwen");//检测数据
				nursingTestingContent6.setNursingTestingId(tiwen+"℃");
				nursingTestingContent6.setNursingProjectNote("7");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
		        
		        //脉搏
				NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
				nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent7.setNursingOrderid(orderId);
				nursingTestingContent7.setNursingNurseid("脉搏");
				String number = request.getParameter("number");//检测数据
				nursingTestingContent7.setNursingTestingId(number+"次(分钟)");
				nursingTestingContent7.setNursingProjectNote("8");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
		        //乳汁
				NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
				nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent8.setNursingOrderid(orderId);
				nursingTestingContent8.setNursingNurseid("乳汁");
				String ruzhi = request.getParameter("radio4");//检测数据
				nursingTestingContent8.setNursingTestingId(ruzhi);
				nursingTestingContent8.setNursingProjectNote("9");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
		        //乳房
				NursingTestingContent nursingTestingContent9 = new NursingTestingContent();
				nursingTestingContent9.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent9.setNursingOrderid(orderId);
				nursingTestingContent9.setNursingNurseid("乳房");
				String rufang = request.getParameter("radio5");//检测数据
				nursingTestingContent9.setNursingTestingId(rufang);
				nursingTestingContent9.setNursingProjectNote("10");
				nursingTestingContent9.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent9);
		        
		        //乳胀
				NursingTestingContent nursingTestingContent10 = new NursingTestingContent();
				nursingTestingContent10.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent10.setNursingOrderid(orderId);
				nursingTestingContent10.setNursingNurseid("乳胀");
				String ruzhang = request.getParameter("radio6");//检测数据
				nursingTestingContent10.setNursingTestingId(ruzhang);
				nursingTestingContent10.setNursingProjectNote("11");
				nursingTestingContent10.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent10);
		        
		        //恶露
				NursingTestingContent nursingTestingContent11 = new NursingTestingContent();
				nursingTestingContent11.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent11.setNursingOrderid(orderId);
				nursingTestingContent11.setNursingNurseid("恶露");
				String elu = request.getParameter("radio7");//检测数据
				nursingTestingContent11.setNursingTestingId(elu);
				nursingTestingContent11.setNursingProjectNote("12");
				nursingTestingContent11.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent11);
		        
		        //伤口
				NursingTestingContent nursingTestingContent12 = new NursingTestingContent();
				nursingTestingContent12.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent12.setNursingOrderid(orderId);
				nursingTestingContent12.setNursingNurseid("伤口");
				String shangkou = request.getParameter("radio8");//检测数据
				nursingTestingContent12.setNursingTestingId(shangkou);
				nursingTestingContent12.setNursingProjectNote("13");
				nursingTestingContent12.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent12);
		        
		        //大便
				NursingTestingContent nursingTestingContent13 = new NursingTestingContent();
				nursingTestingContent13.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent13.setNursingOrderid(orderId);
				nursingTestingContent13.setNursingNurseid("大便");
				String dabian = request.getParameter("radio9");//检测数据
				nursingTestingContent13.setNursingTestingId(dabian);
				nursingTestingContent13.setNursingProjectNote("14");
				nursingTestingContent13.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent13);
		        
		        //其他分类
				NursingTestingContent nursingTestingContent14 = new NursingTestingContent();
				nursingTestingContent14.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent14.setNursingOrderid(orderId);
				nursingTestingContent14.setNursingNurseid("其他分类");
				String other = request.getParameter("radio10");//检测数据
				nursingTestingContent14.setNursingTestingId(other);
				nursingTestingContent14.setNursingProjectNote("15");
				nursingTestingContent14.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent14);
			}
			else if(contentId == "100a0c4d00264dfc816828ae54f4608e" || "100a0c4d00264dfc816828ae54f4608e".equals(contentId)){
				/**
				 * 3 催乳通乳护理
				 * 
				 */
				//一般健康状况
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("一般健康状况");
				String jiankang = request.getParameter("radio2");//检测数据
				nursingTestingContent.setNursingTestingId(jiankang);
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        //一般精神状况
				NursingTestingContent nursingTestingContent1 = new NursingTestingContent();
				nursingTestingContent1.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent1.setNursingOrderid(orderId);
				nursingTestingContent1.setNursingNurseid("一般精神状况");
				String zhuangkuang = request.getParameter("radio21");//检测数据
				nursingTestingContent1.setNursingTestingId(zhuangkuang);
				nursingTestingContent1.setNursingProjectNote("2");
				nursingTestingContent1.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent1);
		        
		        //血压
				NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
				nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent5.setNursingOrderid(orderId);
				nursingTestingContent5.setNursingNurseid("血压");
				String xueya = request.getParameter("xueya");//检测数据
				nursingTestingContent5.setNursingTestingId(xueya+"mmHg");
				nursingTestingContent5.setNursingProjectNote("3");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		    
		        //体温
				NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
				nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent6.setNursingOrderid(orderId);
				nursingTestingContent6.setNursingNurseid("体温");
				String tiwen = request.getParameter("tiwen");//检测数据
				nursingTestingContent6.setNursingTestingId(tiwen+"℃");
				nursingTestingContent6.setNursingProjectNote("4");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
		        
		        //脉搏
				NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
				nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent7.setNursingOrderid(orderId);
				nursingTestingContent7.setNursingNurseid("脉搏");
				String number = request.getParameter("number");//检测数据
				nursingTestingContent7.setNursingTestingId(number+"次(分钟)");
				nursingTestingContent7.setNursingProjectNote("5");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
		        //乳汁
				NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
				nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent8.setNursingOrderid(orderId);
				nursingTestingContent8.setNursingNurseid("乳汁");
				String ruzhi = request.getParameter("radio4");//检测数据
				nursingTestingContent8.setNursingTestingId(ruzhi);
				nursingTestingContent8.setNursingProjectNote("6");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
		        //乳房
				NursingTestingContent nursingTestingContent9 = new NursingTestingContent();
				nursingTestingContent9.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent9.setNursingOrderid(orderId);
				nursingTestingContent9.setNursingNurseid("乳房");
				String rufang = request.getParameter("radio5");//检测数据
				nursingTestingContent9.setNursingTestingId(rufang);
				nursingTestingContent9.setNursingProjectNote("7");
				nursingTestingContent9.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent9);
		        
		        //乳胀
				NursingTestingContent nursingTestingContent10 = new NursingTestingContent();
				nursingTestingContent10.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent10.setNursingOrderid(orderId);
				nursingTestingContent10.setNursingNurseid("乳胀");
				String ruzhang = request.getParameter("radio6");//检测数据
				nursingTestingContent10.setNursingTestingId(ruzhang);
				nursingTestingContent10.setNursingProjectNote("8");
				nursingTestingContent10.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent10);
		       
		        //其他分类
				NursingTestingContent nursingTestingContent14 = new NursingTestingContent();
				nursingTestingContent14.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent14.setNursingOrderid(orderId);
				nursingTestingContent14.setNursingNurseid("其他分类");
				String other = request.getParameter("radio10");//检测数据
				nursingTestingContent14.setNursingTestingId(other);
				nursingTestingContent14.setNursingProjectNote("9");
				nursingTestingContent14.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent14);
			}else if(contentId == "714cb9b62d1d49048195824529396917" || "714cb9b62d1d49048195824529396917".equals(contentId)){
				/**
				 * 4 肌肉注射
				 */
				//心理评估
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("心理评估");
				String jiankang = request.getParameter("radio2");//检测数据
				nursingTestingContent.setNursingTestingId(jiankang);
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        
		        //过敏药物及表现
				NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
				nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent5.setNursingOrderid(orderId);
				nursingTestingContent5.setNursingNurseid("过敏药物及表现");
				String guominyaowu = request.getParameter("guominyaowu");//检测数据
				nursingTestingContent5.setNursingTestingId(guominyaowu);
				nursingTestingContent5.setNursingProjectNote("2");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		    
		        //过敏食物及表现
				NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
				nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent6.setNursingOrderid(orderId);
				nursingTestingContent6.setNursingNurseid("过敏食物及表现");
				String guominfood = request.getParameter("guominfood");//检测数据
				nursingTestingContent6.setNursingTestingId(guominfood);
				nursingTestingContent6.setNursingProjectNote("3");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
		        
		        //其他过敏及表现
				NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
				nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent7.setNursingOrderid(orderId);
				nursingTestingContent7.setNursingNurseid("其他过敏及表现");
				String guominother = request.getParameter("guominother");//检测数据
				nursingTestingContent7.setNursingTestingId(guominother);
				nursingTestingContent7.setNursingProjectNote("4");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
		        //用药目的
				NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
				nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent8.setNursingOrderid(orderId);
				nursingTestingContent8.setNursingNurseid("用药目的");
				String mudi = request.getParameter("mudi");//检测数据
				nursingTestingContent8.setNursingTestingId(mudi);
				nursingTestingContent8.setNursingProjectNote("5");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
		        //药物名称
				NursingTestingContent nursingTestingContent10 = new NursingTestingContent();
				nursingTestingContent10.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent10.setNursingOrderid(orderId);
				nursingTestingContent10.setNursingNurseid("药物名称");
				String mingcheng = request.getParameter("mingcheng");//检测数据
				nursingTestingContent10.setNursingTestingId(mingcheng);
				nursingTestingContent10.setNursingProjectNote("6");
				nursingTestingContent10.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent10);
		        
		        //计量
				NursingTestingContent nursingTestingContent9 = new NursingTestingContent();
				nursingTestingContent9.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent9.setNursingOrderid(orderId);
				nursingTestingContent9.setNursingNurseid("计量");
				String jiliang = request.getParameter("jiliang");//检测数据
				nursingTestingContent9.setNursingTestingId(jiliang+"ml");
				nursingTestingContent9.setNursingProjectNote("7");
				nursingTestingContent9.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent9);
		        
		        
		        //资料来源
		        NursingTestingContent nursingTestingContent11 = new NursingTestingContent();
		        nursingTestingContent11.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent11.setNursingOrderid(orderId);
		        nursingTestingContent11.setNursingNurseid("资料来源");
				String[] chuli = request.getParameterValues("layout1");//检测数据
				String chulis = "";
				for (int i = 0; i < chuli.length; i++) {
					chulis+=chuli[i]+"/";
				}
				nursingTestingContent11.setNursingTestingId(chulis.substring(0, chulis.length()-1));
				nursingTestingContent11.setNursingProjectNote("8");
				nursingTestingContent11.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent11);
		       
			}
			else if(contentId == "d27bdc451f4c43f7bd1d11a32211f775" || "d27bdc451f4c43f7bd1d11a32211f775".equals(contentId)){
				/**
				 * 5 静脉输液
				 */
				//心理评估
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("心理评估");
				String jiankang = request.getParameter("radio2");//检测数据
				nursingTestingContent.setNursingTestingId(jiankang);
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        //过敏药物及表现
				NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
				nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent5.setNursingOrderid(orderId);
				nursingTestingContent5.setNursingNurseid("过敏药物及表现");
				String guominyaowu = request.getParameter("guominyaowu");//检测数据
				nursingTestingContent5.setNursingTestingId(guominyaowu);
				nursingTestingContent5.setNursingProjectNote("2");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		    
		        //过敏食物及表现
				NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
				nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent6.setNursingOrderid(orderId);
				nursingTestingContent6.setNursingNurseid("过敏食物及表现");
				String guominfood = request.getParameter("guominfood");//检测数据
				nursingTestingContent6.setNursingTestingId(guominfood);
				nursingTestingContent6.setNursingProjectNote("3");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
		        
		        //其他过敏及表现
				NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
				nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent7.setNursingOrderid(orderId);
				nursingTestingContent7.setNursingNurseid("其他过敏及表现");
				String guominother = request.getParameter("guominother");//检测数据
				nursingTestingContent7.setNursingTestingId(guominother);
				nursingTestingContent7.setNursingProjectNote("4");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
		        //用药目的
				NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
				nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent8.setNursingOrderid(orderId);
				nursingTestingContent8.setNursingNurseid("用药目的");
				String mudi = request.getParameter("mudi");//检测数据
				nursingTestingContent8.setNursingTestingId(mudi);
				nursingTestingContent8.setNursingProjectNote("5");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
		        //药物名称
				NursingTestingContent nursingTestingContent10 = new NursingTestingContent();
				nursingTestingContent10.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent10.setNursingOrderid(orderId);
				nursingTestingContent10.setNursingNurseid("药物名称");
				String mingcheng = request.getParameter("mingcheng");//检测数据
				nursingTestingContent10.setNursingTestingId(mingcheng);
				nursingTestingContent10.setNursingProjectNote("6");
				nursingTestingContent10.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent10);
		        
		        //注射部位
				NursingTestingContent nursingTestingContent12 = new NursingTestingContent();
				nursingTestingContent12.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent12.setNursingOrderid(orderId);
				nursingTestingContent12.setNursingNurseid("注射部位");
				String buwei = request.getParameter("buwei");//检测数据
				nursingTestingContent12.setNursingTestingId(buwei);
				nursingTestingContent12.setNursingProjectNote("7");
				nursingTestingContent12.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent12);
		        
		        //用药评估
		        NursingTestingContent nursingTestingContent13 = new NursingTestingContent();
		        nursingTestingContent13.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent13.setNursingOrderid(orderId);
		        nursingTestingContent13.setNursingNurseid("用药评估");
				String[] chuli = request.getParameterValues("layout1");//检测数据
				String chulis = "";
				for (int i = 0; i < chuli.length; i++) {
					chulis+=chuli[i]+"/";
				}
				nursingTestingContent13.setNursingTestingId(chulis.substring(0, chulis.length()-1));
				nursingTestingContent13.setNursingProjectNote("8");
				nursingTestingContent13.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent13);
		        
		        //输液后观察
				NursingTestingContent nursingTestingContent11 = new NursingTestingContent();
				nursingTestingContent11.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent11.setNursingOrderid(orderId);
				nursingTestingContent11.setNursingNurseid("输液后观察");
				String guancha = request.getParameter("guancha");//检测数据
				nursingTestingContent11.setNursingTestingId(buwei);
				nursingTestingContent11.setNursingProjectNote("9");
				nursingTestingContent11.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent11);
		        
		        //照顾人员
		        NursingTestingContent nursingTestingContent14 = new NursingTestingContent();
		        nursingTestingContent14.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent14.setNursingOrderid(orderId);
		        nursingTestingContent14.setNursingNurseid("照顾人员");
				String[] chuli1 = request.getParameterValues("layout2");//检测数据
				String chulis1 = "";
				for (int i = 0; i < chuli1.length; i++) {
					chulis1+=chuli1[i]+"/";
				}
				nursingTestingContent14.setNursingTestingId(chulis1.substring(0, chulis1.length()-1));
				nursingTestingContent14.setNursingProjectNote("10");
				nursingTestingContent14.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent14);
			}
			else if(contentId == "88d32bffff9e4704bcb89558b93a3381" || "88d32bffff9e4704bcb89558b93a3381".equals(contentId)){
				/**
				 * 6 留置PICC管道护理
				 */
				 //上次护理时间
		        NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
		        nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent8.setNursingOrderid(orderId);
		        nursingTestingContent8.setNursingNurseid("上次护理时间");
				String date = request.getParameter("date");//检测数据
				nursingTestingContent8.setNursingTestingId(date);
				nursingTestingContent8.setNursingProjectNote("2");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
		        //信息来源
		        NursingTestingContent nursingTestingContent9 = new NursingTestingContent();
		        nursingTestingContent9.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent9.setNursingOrderid(orderId);
		        nursingTestingContent9.setNursingNurseid("信息来源");
				String[] laiyuan = request.getParameterValues("layout2");//检测数据
				String laiyuans = "";
				for (int i = 0; i < laiyuan.length; i++) {
					laiyuans+=laiyuan[i]+"/";
				}
				nursingTestingContent9.setNursingTestingId(laiyuans.substring(0, laiyuans.length()-1));
				nursingTestingContent9.setNursingProjectNote("7");
				nursingTestingContent9.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent9);
				
				
				//部位
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("部位");
				String testMark = request.getParameter("radio");//检测数据
				nursingTestingContent.setNursingTestingId(testMark);
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
				//体内深度
		        NursingTestingContent nursingTestingContent1 = new NursingTestingContent();
		        nursingTestingContent1.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent1.setNursingOrderid(orderId);
		        nursingTestingContent1.setNursingNurseid("体内深度");
				String shendu = request.getParameter("tineishendu");//检测数据
				nursingTestingContent1.setNursingTestingId(shendu+"CM");
				nursingTestingContent1.setNursingProjectNote("2");
				nursingTestingContent1.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent1);
		        
		        //固定
		        NursingTestingContent nursingTestingContent2 = new NursingTestingContent();
		        nursingTestingContent2.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent2.setNursingOrderid(orderId);
		        nursingTestingContent2.setNursingNurseid("固定");
				String guding = request.getParameter("radio1");//检测数据
				nursingTestingContent2.setNursingTestingId(guding);
				nursingTestingContent2.setNursingProjectNote("3");
				nursingTestingContent2.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent2);
		        
		        //通畅
		        NursingTestingContent nursingTestingContent3 = new NursingTestingContent();
		        nursingTestingContent3.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent3.setNursingOrderid(orderId);
		        nursingTestingContent3.setNursingNurseid("通畅");
				String tongchang = request.getParameter("radio2");//检测数据
				nursingTestingContent3.setNursingTestingId(tongchang);
				nursingTestingContent3.setNursingProjectNote("4");
				nursingTestingContent3.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent3);
		        
		        //局部
		        NursingTestingContent nursingTestingContent4 = new NursingTestingContent();
		        nursingTestingContent4.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent4.setNursingOrderid(orderId);
		        nursingTestingContent4.setNursingNurseid("局部");
				String jubu = request.getParameter("radio3");//检测数据
				nursingTestingContent4.setNursingTestingId(jubu);
				nursingTestingContent4.setNursingProjectNote("5");
				nursingTestingContent4.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent4);
		        
		        //导管相关性血液感染
		        NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
		        nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent5.setNursingOrderid(orderId);
		        nursingTestingContent5.setNursingNurseid("导管相关性血液感染");
				String xueye = request.getParameter("radio4");//检测数据
				nursingTestingContent5.setNursingTestingId(xueye);
				nursingTestingContent5.setNursingProjectNote("6");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		        
		        //处理
		        NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
		        nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent6.setNursingOrderid(orderId);
		        nursingTestingContent6.setNursingNurseid("处理");
				String[] chuli = request.getParameterValues("layout");//检测数据
				String chulis = "";
				for (int i = 0; i < chuli.length; i++) {
					chulis+=chuli[i]+"/";
				}
				nursingTestingContent6.setNursingTestingId(chulis.substring(0, chulis.length()-1));
				nursingTestingContent6.setNursingProjectNote("7");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
		        
		        //拔管原因
		        NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
		        nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent7.setNursingOrderid(orderId);
		        nursingTestingContent7.setNursingNurseid("拔管原因");
				String[] baguan = request.getParameterValues("layout1");//检测数据
				
				String baguans = "";
				for (int i = 0; i < baguan.length; i++) {
					baguans+=baguan[i]+"/";
				}
				nursingTestingContent7.setNursingTestingId(baguans.substring(0, baguans.length()-1));
				nursingTestingContent7.setNursingProjectNote("8");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
			}else if(contentId == "10c8cf04196549d5bd614e13e6c32cc5" || "10c8cf04196549d5bd614e13e6c32cc5".equals(contentId)){
				/**
				 * 7 输液港护理
				 */
				//部位
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("部位");
				String testMark = request.getParameter("radio");//检测数据
				nursingTestingContent.setNursingTestingId(testMark);
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        //固定
				NursingTestingContent nursingTestingContent1 = new NursingTestingContent();
				nursingTestingContent1.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent1.setNursingOrderid(orderId);
				nursingTestingContent1.setNursingNurseid("固定");
				String guding = request.getParameter("radio1");//检测数据
				nursingTestingContent1.setNursingTestingId(guding);
				nursingTestingContent1.setNursingProjectNote("2");
				nursingTestingContent1.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent1);
		        
		        //通畅
		        NursingTestingContent nursingTestingContent3 = new NursingTestingContent();
		        nursingTestingContent3.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent3.setNursingOrderid(orderId);
		        nursingTestingContent3.setNursingNurseid("通畅");
				String tongchang = request.getParameter("radio2");//检测数据
				nursingTestingContent3.setNursingTestingId(tongchang);
				nursingTestingContent3.setNursingProjectNote("3");
				nursingTestingContent3.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent3);
		        
		        //局部
		        NursingTestingContent nursingTestingContent4 = new NursingTestingContent();
		        nursingTestingContent4.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent4.setNursingOrderid(orderId);
		        nursingTestingContent4.setNursingNurseid("局部");
				String jubu = request.getParameter("radio3");//检测数据
				nursingTestingContent4.setNursingTestingId(jubu);
				nursingTestingContent4.setNursingProjectNote("4");
				nursingTestingContent4.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent4);
		        
		        //导管相关性血液感染
		        NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
		        nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent5.setNursingOrderid(orderId);
		        nursingTestingContent5.setNursingNurseid("导管相关性血液感染");
				String xueye = request.getParameter("radio4");//检测数据
				nursingTestingContent5.setNursingTestingId(xueye);
				nursingTestingContent5.setNursingProjectNote("5");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		        
		        //处理
		        NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
		        nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent6.setNursingOrderid(orderId);
		        nursingTestingContent6.setNursingNurseid("处理");
				String[] chuli = request.getParameterValues("layout");//检测数据
				String chulis = "";
				for (int i = 0; i < chuli.length; i++) {
					chulis+=chuli[i]+"/";
				}
				nursingTestingContent6.setNursingTestingId(chulis.substring(0, chulis.length()-1));
				nursingTestingContent6.setNursingProjectNote("6");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
				
			}else if(contentId == "3f425fb5ee5c4fd490732516f79398c5" || "3f425fb5ee5c4fd490732516f79398c5".equals(contentId)){
				/**
				 * 8 胃管护理
				 */
				//精神评估
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("精神评估");
				String jiankang = request.getParameter("radio2");//检测数据
				nursingTestingContent.setNursingTestingId(jiankang);
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        //胃管深度
				NursingTestingContent nursingTestingContent11 = new NursingTestingContent();
				nursingTestingContent11.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent11.setNursingOrderid(orderId);
				nursingTestingContent11.setNursingNurseid("胃管深度");
				String shendu = request.getParameter("tineishendu");//检测数据
				nursingTestingContent11.setNursingTestingId(shendu+"CM");
				nursingTestingContent11.setNursingProjectNote("2");
				nursingTestingContent11.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent11);
		        
		        //固定
		        NursingTestingContent nursingTestingContent22 = new NursingTestingContent();
		        nursingTestingContent22.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent22.setNursingOrderid(orderId);
		        nursingTestingContent22.setNursingNurseid("固定");
				String guding = request.getParameter("radio1");//检测数据
				nursingTestingContent22.setNursingTestingId(guding);
				nursingTestingContent22.setNursingProjectNote("3");
				nursingTestingContent22.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent22);
		        
		        
		        //置管原因
				NursingTestingContent nursingTestingContent33 = new NursingTestingContent();
				nursingTestingContent33.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent33.setNursingOrderid(orderId);
				nursingTestingContent33.setNursingNurseid("置管原因");
				String zhiguan = request.getParameter("zhiguan");//检测数据
				nursingTestingContent33.setNursingTestingId(zhiguan);
				nursingTestingContent33.setNursingProjectNote("4");
				nursingTestingContent33.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent33);
		        
		        //通畅
		        NursingTestingContent nursingTestingContent44 = new NursingTestingContent();
		        nursingTestingContent44.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent44.setNursingOrderid(orderId);
		        nursingTestingContent44.setNursingNurseid("通畅");
				String tongchang = request.getParameter("radio3");//检测数据
				nursingTestingContent44.setNursingTestingId(tongchang);
				nursingTestingContent44.setNursingProjectNote("5");
				nursingTestingContent44.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent44);
		        
		        //状态
		        NursingTestingContent nursingTestingContent55 = new NursingTestingContent();
		        nursingTestingContent55.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent55.setNursingOrderid(orderId);
		        nursingTestingContent55.setNursingNurseid("状态");
				String[] zhuangtai = request.getParameterValues("radio3");//检测数据
				String zhuangtais = "";
				for (int i = 0; i < zhuangtai.length; i++) {
					zhuangtais+=zhuangtai[i]+"/";
				}
				nursingTestingContent55.setNursingTestingId(zhuangtais.substring(0, zhuangtais.length()-1));
				nursingTestingContent55.setNursingProjectNote("6");
				nursingTestingContent55.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent55);
		        
		        //处置
		        NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
		        nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent6.setNursingOrderid(orderId);
		        nursingTestingContent6.setNursingNurseid("处置");
				String[] chuli = request.getParameterValues("layout");//检测数据
				String chulis = "";
				for (int i = 0; i < chuli.length; i++) {
					chulis+=chuli[i]+"/";
				}
				nursingTestingContent6.setNursingTestingId(chulis.substring(0, chulis.length()-1));
				nursingTestingContent6.setNursingProjectNote("7");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
		        
		        //鼻饲物及量
				NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
				nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent7.setNursingOrderid(orderId);
				nursingTestingContent7.setNursingNurseid("鼻饲物及量");
				String bishiwu = request.getParameter("bishiwu");//检测数据
				nursingTestingContent7.setNursingTestingId(bishiwu);
				nursingTestingContent7.setNursingProjectNote("8");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
		        //照顾人员
		        NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
		        nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent8.setNursingOrderid(orderId);
		        nursingTestingContent8.setNursingNurseid("照顾人员");
				String[] chuli1 = request.getParameterValues("layout1");//检测数据
				String chulis1 = "";
				for (int i = 0; i < chuli1.length; i++) {
					chulis1+=chuli1[i]+"/";
				}
				nursingTestingContent8.setNursingTestingId(chulis1.substring(0, chulis1.length()-1));
				nursingTestingContent8.setNursingProjectNote("9");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
			}else if(contentId == "7001bdf1ebbb4535b8eb0bfd18f3fb70" || "7001bdf1ebbb4535b8eb0bfd18f3fb70".equals(contentId)){
				/**
				 * 9 尿管护理
				 */
				//一般健康状况
				NursingTestingContent nursingTestingContent = new NursingTestingContent();
				nursingTestingContent.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent.setNursingOrderid(orderId);
				nursingTestingContent.setNursingNurseid("一般健康状况");
				String jiankang = request.getParameter("radio2");//检测数据
				nursingTestingContent.setNursingTestingId(jiankang);
				nursingTestingContent.setNursingProjectNote("1");
				nursingTestingContent.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent);
		        
		        //一般精神状况
				NursingTestingContent nursingTestingContent1 = new NursingTestingContent();
				nursingTestingContent1.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent1.setNursingOrderid(orderId);
				nursingTestingContent1.setNursingNurseid("一般精神状况");
				String zhuangkuang = request.getParameter("radio21");//检测数据
				nursingTestingContent1.setNursingTestingId(zhuangkuang);
				nursingTestingContent1.setNursingProjectNote("2");
				nursingTestingContent1.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent1);
		        
		        //护理记录
				NursingTestingContent nursingTestingContent2 = new NursingTestingContent();
				nursingTestingContent2.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent2.setNursingOrderid(orderId);
				nursingTestingContent2.setNursingNurseid("护理记录");
				String jilv = request.getParameter("jilv");//检测数据
				nursingTestingContent2.setNursingTestingId(jilv);
				nursingTestingContent2.setNursingProjectNote("3");
				nursingTestingContent2.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent2);
		        
			}else if(contentId == "fa5a9f33891b4590b58bd51d9d1cd890" || "fa5a9f33891b4590b58bd51d9d1cd890".equals(contentId)){
				/**
				 * 10 压疮护理 
				 */
				 //部位
		        NursingTestingContent nursingTestingContent11 = new NursingTestingContent();
		        nursingTestingContent11.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent11.setNursingOrderid(orderId);
		        nursingTestingContent11.setNursingNurseid("部位");
				String[] buwei = request.getParameterValues("radio6");//检测数据
				
				String buweis = "";
				for (int i = 0; i < buwei.length; i++) {
					buweis+=buwei[i]+"/";
				}
				nursingTestingContent11.setNursingTestingId(buweis.substring(0, buweis.length()-1));
				nursingTestingContent11.setNursingProjectNote("1");
				nursingTestingContent11.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent11);
		        
		        //其他
				NursingTestingContent nursingTestingContent22 = new NursingTestingContent();
				nursingTestingContent22.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent22.setNursingOrderid(orderId);
				nursingTestingContent22.setNursingNurseid("其他");
				String other  = request.getParameter("other");//检测数据
				nursingTestingContent22.setNursingTestingId(other);
				nursingTestingContent22.setNursingProjectNote("2");
				nursingTestingContent22.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent22);
		        
		        //周围组织
		        NursingTestingContent nursingTestingContent33 = new NursingTestingContent();
		        nursingTestingContent33.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent33.setNursingOrderid(orderId);
		        nursingTestingContent33.setNursingNurseid("周围组织");
				String[] zhouwei = request.getParameterValues("layout3");//检测数据
				
				String zhouweis = "";
				for (int i = 0; i < zhouwei.length; i++) {
					zhouweis+=zhouwei[i]+"/";
				}
				nursingTestingContent33.setNursingTestingId(zhouweis.substring(0, zhouweis.length()-1));
				nursingTestingContent33.setNursingProjectNote("3");
				nursingTestingContent33.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent33);
		        
		        //渗透
		        NursingTestingContent nursingTestingContent44 = new NursingTestingContent();
		        nursingTestingContent44.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent44.setNursingOrderid(orderId);
		        nursingTestingContent44.setNursingNurseid("渗透");
				String[] shentou = request.getParameterValues("layout4");//检测数据
				
				String shentous = "";
				for (int i = 0; i < shentou.length; i++) {
					shentous+=shentou[i]+"/";
				}
				nursingTestingContent44.setNursingTestingId(shentous.substring(0, shentous.length()-1));
				nursingTestingContent44.setNursingProjectNote("4");
				nursingTestingContent44.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent44);
		        
		        //异味
				NursingTestingContent nursingTestingContent55 = new NursingTestingContent();
				nursingTestingContent55.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingTestingContent55.setNursingOrderid(orderId);
				nursingTestingContent55.setNursingNurseid("异味");
				String yiwei  = request.getParameter("radio7");//检测数据
				nursingTestingContent55.setNursingTestingId(yiwei);
				nursingTestingContent55.setNursingProjectNote("5");
				nursingTestingContent55.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent55);
		
		        
		        //皮肤护理
		        NursingTestingContent nursingTestingContent2 = new NursingTestingContent();
		        nursingTestingContent2.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent2.setNursingOrderid(orderId);
		        nursingTestingContent2.setNursingNurseid("皮肤护理");
				String[] chuli = request.getParameterValues("aradio1");//检测数据
				
				String chulis = "";
				for (int i = 0; i < chuli.length; i++) {
					chulis+=chuli[i]+"/";
				}
				nursingTestingContent2.setNursingTestingId(chulis.substring(0, chulis.length()-1));
				nursingTestingContent2.setNursingProjectNote("6");
				nursingTestingContent2.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent2);
		        
		        //体位与活动
		        NursingTestingContent nursingTestingContent3 = new NursingTestingContent();
		        nursingTestingContent3.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent3.setNursingOrderid(orderId);
		        nursingTestingContent3.setNursingNurseid("体位与活动");
				String[] activity = request.getParameterValues("layout");//检测数据
				
				String activitys = "";
				for (int i = 0; i < activity.length; i++) {
					activitys+=activity[i]+"/";
				}
				nursingTestingContent3.setNursingTestingId(activitys.substring(0, activitys.length()-1));
				nursingTestingContent3.setNursingProjectNote("7");
				nursingTestingContent3.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent3);
		        
		        //用辅助用品
		        NursingTestingContent nursingTestingContent4 = new NursingTestingContent();
		        nursingTestingContent4.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent4.setNursingOrderid(orderId);
		        nursingTestingContent4.setNursingNurseid("用辅助用品");
				String[] fuzhu = request.getParameterValues("layout1");//检测数据
				
				String fuzhus = "";
				for (int i = 0; i < fuzhu.length; i++) {
					fuzhus+=fuzhu[i]+"/";
				}
				nursingTestingContent4.setNursingTestingId(fuzhus.substring(0, fuzhus.length()-1));
				nursingTestingContent4.setNursingProjectNote("8");
				nursingTestingContent4.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent4);
		        
		        //敷料使用
		        NursingTestingContent nursingTestingContent5 = new NursingTestingContent();
		        nursingTestingContent5.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent5.setNursingOrderid(orderId);
		        nursingTestingContent5.setNursingNurseid("敷料使用");
				String[] fuliao = request.getParameterValues("layout2");//检测数据
				
				String fuliaos = "";
				for (int i = 0; i < fuliao.length; i++) {
					fuliaos+=fuliao[i]+"/";
				}
				nursingTestingContent5.setNursingTestingId(fuliaos.substring(0, fuliaos.length()-1));
				nursingTestingContent5.setNursingProjectNote("9");
				nursingTestingContent5.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent5);
		        
		        //照顾人员
		        NursingTestingContent nursingTestingContent51 = new NursingTestingContent();
		        nursingTestingContent51.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent51.setNursingOrderid(orderId);
		        nursingTestingContent51.setNursingNurseid("照顾人员");
				String[] huanzhe = request.getParameterValues("layout5");//检测数据
				
				String huanzhes = "";
				for (int i = 0; i < huanzhe.length; i++) {
					huanzhes+=huanzhe[i]+"/";
				}
				nursingTestingContent51.setNursingTestingId(huanzhes.substring(0, huanzhes.length()-1));
				nursingTestingContent51.setNursingProjectNote("10");
				nursingTestingContent51.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent51);
		        
			}
			else if(contentId == "fc3270db699f40639520aff19300fdd3" || "fc3270db699f40639520aff19300fdd3".equals(contentId)){
				/**
				 * 11 造口护理 
				 */
				 //类型
		        NursingTestingContent nursingTestingContent6 = new NursingTestingContent();
		        nursingTestingContent6.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent6.setNursingOrderid(orderId);
		        nursingTestingContent6.setNursingNurseid("类型");
				String[] leixing = request.getParameterValues("layout3");//检测数据
				
				String leixings = "";
				for (int i = 0; i < leixing.length; i++) {
					leixings+=leixing[i]+"/";
				}
				nursingTestingContent6.setNursingTestingId(leixings.substring(0, leixings.length()-1));
				nursingTestingContent6.setNursingProjectNote("1");
				nursingTestingContent6.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent6);
				
		        
		        
				//其他
		        NursingTestingContent nursingTestingContent1 = new NursingTestingContent();
		        nursingTestingContent1.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent1.setNursingOrderid(orderId);
		        nursingTestingContent1.setNursingNurseid("其他");
				String other = request.getParameter("other");//检测数据
				nursingTestingContent1.setNursingTestingId(other);
				nursingTestingContent1.setNursingProjectNote("2");
				nursingTestingContent1.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent1);
		        
		        //造口大小
		        NursingTestingContent nursingTestingContent7 = new NursingTestingContent();
		        nursingTestingContent7.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent7.setNursingOrderid(orderId);
		        nursingTestingContent7.setNursingNurseid("造口大小");
				String small = request.getParameter("small");//检测数据
				String big = request.getParameter("big");//检测数据
				nursingTestingContent7.setNursingTestingId(small+"*"+big+"CM");
				nursingTestingContent7.setNursingProjectNote("3");
				nursingTestingContent7.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent7);
		        
		        //造口缝线
		        NursingTestingContent nursingTestingContent8 = new NursingTestingContent();
		        nursingTestingContent8.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent8.setNursingOrderid(orderId);
		        nursingTestingContent8.setNursingNurseid("造口缝线");
				String fengxian = request.getParameter("radio");//检测数据
				nursingTestingContent8.setNursingTestingId(fengxian);
				nursingTestingContent8.setNursingProjectNote("4");
				nursingTestingContent8.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent8);
		        
		        //造口形状
		        NursingTestingContent nursingTestingContent9 = new NursingTestingContent();
		        nursingTestingContent9.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent9.setNursingOrderid(orderId);
		        nursingTestingContent9.setNursingNurseid("造口形状");
				String xingzhuang = request.getParameter("radio11");//检测数据
				nursingTestingContent9.setNursingTestingId(xingzhuang);
				nursingTestingContent9.setNursingProjectNote("5");
				nursingTestingContent9.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent9);
		        
		        //高度
		        NursingTestingContent nursingTestingContent10 = new NursingTestingContent();
		        nursingTestingContent10.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent10.setNursingOrderid(orderId);
		        nursingTestingContent10.setNursingNurseid("高度");
				String height = request.getParameter("radio1");//检测数据
				nursingTestingContent10.setNursingTestingId(height);
				nursingTestingContent10.setNursingProjectNote("6");
				nursingTestingContent10.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent10);
		        
		        //支架管
		        NursingTestingContent nursingTestingContent2 = new NursingTestingContent();
		        nursingTestingContent2.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent2.setNursingOrderid(orderId);
		        nursingTestingContent2.setNursingNurseid("支架管");
				String zhijiaguan = request.getParameter("radio2");//检测数据
				nursingTestingContent2.setNursingTestingId(zhijiaguan);
				nursingTestingContent2.setNursingProjectNote("7");
				nursingTestingContent2.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent2);
		        
		        //颜色
		        NursingTestingContent nursingTestingContent3 = new NursingTestingContent();
		        nursingTestingContent3.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent3.setNursingOrderid(orderId);
		        nursingTestingContent3.setNursingNurseid("颜色");
				String color = request.getParameter("radio3");//检测数据
				nursingTestingContent3.setNursingTestingId(color);
				nursingTestingContent3.setNursingProjectNote("8");
				nursingTestingContent3.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent3);
		        
		        //并发症
		        NursingTestingContent nursingTestingContent11 = new NursingTestingContent();
		        nursingTestingContent11.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent11.setNursingOrderid(orderId);
		        nursingTestingContent11.setNursingNurseid("并发症");
				String[]  bingfa= request.getParameterValues("layout");//检测数据
				String bingfas = "";
				for (int i = 0; i < bingfa.length; i++) {
					bingfas+=bingfa[i]+"/";
				}
				nursingTestingContent11.setNursingTestingId(bingfas.substring(0, bingfas.length()-1));
				nursingTestingContent11.setNursingProjectNote("9");
				nursingTestingContent11.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent11);
		        
		        //处理
		        NursingTestingContent nursingTestingContent12 = new NursingTestingContent();
		        nursingTestingContent12.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent12.setNursingOrderid(orderId);
		        nursingTestingContent12.setNursingNurseid("处理");
				String[]  chuli= request.getParameterValues("layout1");//检测数据
				String chulis = "";
				for (int i = 0; i < chuli.length; i++) {
					chulis+=chuli[i]+"/";
				}
				nursingTestingContent12.setNursingTestingId(chulis.substring(0, chulis.length()-1));
				nursingTestingContent12.setNursingProjectNote("10");
				nursingTestingContent12.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent12);
		        
		        //资料来源
		        NursingTestingContent nursingTestingContent13 = new NursingTestingContent();
		        nursingTestingContent13.setNursingTestingContentid(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		        nursingTestingContent13.setNursingOrderid(orderId);
		        nursingTestingContent13.setNursingNurseid("资料来源");
				String[] laiyuan = request.getParameterValues("layout1");//检测数据
				String laiyuans = "";
				for (int i = 0; i < laiyuan.length; i++) {
					laiyuans+=laiyuan[i]+"/";
				}
				nursingTestingContent13.setNursingTestingId(laiyuans.substring(0, laiyuans.length()-1));
				nursingTestingContent13.setNursingProjectNote("11");
				nursingTestingContent13.setNursingCreatetime(nowTime);
		        nursingTestingContentService.insertSelective(nursingTestingContent13);
			}
			
			
	        
			//服务信息图片
			String webpath = request.getSession().getServletContext().getRealPath("");
			String uploadpath = webpath+"/NurseImg/ReportImg/";//上传路径
			String fileName = null;
			// 原始名称
			
			List<MultipartFile> pic = multipartRequest.getFiles("pics");
			String picth = "";
			String newpath = "";
			for (int i = 0; i < pic.size(); i++) {
				String originalFilename = pic.get(i).getOriginalFilename();
				if(null == originalFilename || "".equals(originalFilename)){
					continue;
				}
				// 新的图片名称
				String newFileName =RandomUtil.generateNumber2() 
						+ originalFilename.substring(originalFilename
								.lastIndexOf("."));
				// 新图片
				java.io.File newFile = new java.io.File(uploadpath + newFileName);
				fileName = newFileName;
				newpath = "nurseDoor/NurseImg/ReportImg/"+fileName;
				// 将内存中的数据写入磁盘
				pic.get(i).transferTo(newFile);
				if (i == 0) {
					picth = newpath;
				} else {
					picth = picth + "," + newpath;
				}
			}
			//补充记录
			String reportaddrecords = request.getParameter("reportaddrecords");
			//添加护理报告insertSelective
			NursingReport nursingReport  = new NursingReport();
			nursingReport.setNursingReportid(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			nursingReport.setNursingReportOrderid(orderId);
			nursingReport.setNursingReportNurseid(nurseId);
			nursingReport.setNursingReportContentid(orderSendServicecontentId);
			nursingReport.setNursingReportServicepic(picth);
			nursingReport.setNursingReportAddrecords(reportaddrecords);
			//病历标签
			if(lableinfo!=null && !"".equals(lableinfo)){
				nursingReport.setNursingReportLable(lableinfo.substring(0, lableinfo.length()-1));
			}
			nursingReport.setNursingReportCreatetime(new Date());
			int i = nursingReportService.insertSelective(nursingReport);
			if(i==0){
				return "404";
			}
			
			final OrderSend orderSend1 = orderSendService.selectOrderSendInfoById(orderId);
			//根据护士ID得到护士账号(手机号)
			User user = userService.selectForUserByID(orderSend.getOrderSendUserid());
			if(user!=null && !"".equals(user)){
				userPhone = user.getUserName();
				userId = user.getUserId();
			}
			Thread thread = new Thread(){
				public void run() {
					//根据赛区id获取赛区发布人的id
					//向客户端发送推送
					String TITLE = "订单完成";
					String ALERT= "感谢您使用安心护平台，您的护士已完成服务，希望再次为您服务，如有问题可联系客服";
					String MSG_CONTENT= "感谢您使用安心护平台，您的护士已完成服务，希望再次为您服务，如有问题可联系客服";
				//指定推送
				JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
				//通知
				Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
				//全部推送	
				//Jdpush.testSendPush(appKey, masterSecret, "赛区验证", ALERT, MSG_CONTENT);
					//给用户发短信
					SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】感谢您使用安心护平台，您的护士已完成服务，希望再次为您服务，如有问题可联系客服", null, null, "0",  null,  null,  null,  null, null,  null, null);
				
					////将推送记录到用户站内信中
					StandInnerLetter innerLetter = new StandInnerLetter();
					innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					innerLetter.setStandInnerLetterUserId(userId);                              
					innerLetter.setStandInnerLetterUserIdentity(0);
					innerLetter.setStandInnerLetterTitle("订单完成");
					//0订单消息/1资金消息/2系统通知
					innerLetter.setStandInnerLetterUserType(0);
					SimpleDateFormat format = new SimpleDateFormat();
					//得到订单类型
					String orderSendType = orderSend1.getOrderSendType();
					if(orderSendType == "1" || "1".equals(orderSendType)){
						innerLetter.setStandInnerLetterContent("(专属)感谢您使用安心护平台，您的护士于"+format.format(nowTime)+"已完成您预付款¥"+orderSend1.getOrderSendTotalmoney()+"单号为"+orderSend1.getOrderSendNumbers()+"的订单，希望再次为您服务，如有问题可联系客服");
					}else{
						innerLetter.setStandInnerLetterContent("感谢您使用安心护平台，您的护士于"+format.format(nowTime)+"已完成您预付款¥"+orderSend1.getOrderSendTotalmoney()+"单号为"+orderSend1.getOrderSendNumbers()+"的订单，希望再次为您服务，如有问题可联系客服");
					}
					
					innerLetter.setStandInnerLetterCreatetime(nowTime);
					try {
						standInnerLetterService.insertSelective(innerLetter);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
				////将推送记录到护士站内信中
				StandInnerLetter innerLetter1 = new StandInnerLetter();
				innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter1.setStandInnerLetterUserId(nurseId);                              
				innerLetter1.setStandInnerLetterUserIdentity(1);
				innerLetter1.setStandInnerLetterTitle("订单完成");
				//0订单消息/1资金消息/2系统通知
				innerLetter1.setStandInnerLetterUserType(0);
				
				//得到订单类型
				innerLetter1.setStandInnerLetterContent("您于"+format.format(nowTime)+"已完成单号为"+orderSend1.getOrderSendNumbers()+"的订单，预计收入为"+orderSend1.getOrderSendTotalmoney()+"");
				innerLetter1.setStandInnerLetterCreatetime(nowTime);
				try {
					standInnerLetterService.insertSelective(innerLetter1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				};
			};
			thread.start();
			
			
			//Nurse nurse = nurseService.selectForNurseId(nurseId);
			//修改该订单状态为完成
			OrderSend orderSend2 = new OrderSend();
			//完成 并修改完成订单时间
				orderSend2.setOrderSendState("3");
				orderSend2.setOrderSendFinishOrderTime(new Date());
				//并将完成的服务加入到统计表
				//服务产品信息
				//三级产品
				String goodsidOld = orderSend1.getOrderSendServicecontent();
	        	String[] goodsid = goodsidOld.split(",");
				String contentid ="";
				Goods goods = new Goods();
				for(int i1 =0; i1<goodsid.length;i1++){
					goods = goodsService.selectByPrimaryKey(goodsid[i1]);
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
						int c =statisticsService.insertSelective(statistics);
						if(c==0){
							return "404";
						}
					}else{
						System.out.println("该服务项不存在");;
					}
				}
			orderSend2.setOrderSendId(orderId);
			int e = orderSendService.updateByOrderSendId(orderSend2);
			if(e==0){
				return "404";
			}
			if(e>0){
				//修改接单表状态
				OrderReceiver orderReceiver = new OrderReceiver();
				orderReceiver.setOrderReceivestate("4");
				orderReceiver.setOrderNurseid(nurseId);
				orderReceiver.setOrderOrdersendid(orderId);
				int f = orderReceiverService.updateOrderReceiverState(orderReceiver);
				
				//完成订单获取积分
				SigninSet signinSet = nurseService.selectMarkSetSignin();
				int signin = signinSet.getUserFinishOrderIntegeral();
				//将数据插入到订单积分表
				NurseFinishOrderSignin finishOrderSignin = new NurseFinishOrderSignin();
				finishOrderSignin.setNurseFinishOrderSignin(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				finishOrderSignin.setNurseFinishOrderNurseId(nurseId);
				finishOrderSignin.setNurseFinishOrderNurseSignin(signin);
				finishOrderSignin.setNurseFinishOrderCreatetime(new Date());
				
				int h = nurseService.insertfinishorderSignin(finishOrderSignin);
				
				//取消时系统自动生成一条反馈(反馈工单号+订单号)，
				//客服处理（标准话术+退款/换护士/原人处理）
				SimpleDateFormat format = new SimpleDateFormat();
				Complaint complaint = new Complaint();
				complaint.setComplaintId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				complaint.setComplaintUserid(userId);
				//订单ID
				complaint.setComplaintContentNote(orderId);
				complaint.setComplaintIdentity(0);
				//投诉单号
				complaint.setComplaintNumber(RandomUtil.getRandomMath());
				complaint.setComplaintSpareone("2");
				complaint.setComplaintSparetwo("1");
				complaint.setComplaintSparefive(format.format(orderSend.getOrderSendCreatetime()));
				complaint.setComplaintContentCreatetime(new Date());
				complaintService.insertSelective(complaint);
				
				if(h==0){
					return "404";
				}
				if(f==0){
					return "404";
				}
			}
			return "success";
			}
		//查看所有护理报告selectByExample
	@RequestMapping(value="selectAllNursingReport",method = RequestMethod.GET)
	public String selectAllNursingReport(HttpServletRequest request,HttpServletResponse response,Model model,Integer pageNow)throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/xml;charset=utf-8");  
		NursingReportKeyWordVO keyWordVO = new NursingReportKeyWordVO();
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
		String keyWord = request.getParameter("keyword");
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		//Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
	    keyWordVO.minTime = sdf.format(minTime);
	    keyWordVO.maxTime = sdf.format(maxTime);
	    
	    if(keyWord!=null && !"".equals(keyWord)){
	    	keyWordVO.parameter = keyWord;
	    }
	    keyWordVO.start = (pageNow-1) * Pager.pageSize;
	    keyWordVO.rows = Pager.pageSize;
		int reportCount=nursingReportService.selectAllNursingReportAndkeyWordCount(keyWordVO);	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(reportCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<NursingUserAndNurseVO> list = nursingReportService.selectAllNursingReportAndkeyWord(keyWordVO);
		
		model.addAttribute("list", list);
		request.setAttribute("count", reportCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("keyWord", keyWord);
		return "nursingReportlist";
	}	
}
