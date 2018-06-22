package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.Coupon;
import com.chance.ssm.po.CouponExample;
import com.chance.ssm.po.CouponUser;
import com.chance.ssm.po.RedPacketsExample;
import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.RedPacketsExample.Criteria;
import com.chance.ssm.service.CapitalNursePoolService;
import com.chance.ssm.service.CouponService;
import com.chance.ssm.service.RedPacketsService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.utils.DateUtil;
import com.chance.ssm.utils.file.FileUpload;

/**
 * **优惠券和红包控制类
 * @author Administrator
 *
 */
@Controller
public class CouponAction {

	@Autowired
	private CouponService couponService;
	
	@Autowired
	private RedPacketsService redPacketsService;
	
	@Autowired
	private CapitalNursePoolService capitalNursePoolService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	//查看所有优惠券
	@RequestMapping(value="couponAllInfo")
	public String addcoupon(Model model)throws Exception{
		CouponExample example = new CouponExample();
		example.setOrderByClause("coupon_type ASC");
		List<Coupon> list = couponService.selectByExample(example);
		
		model.addAttribute("list", list);
		model.addAttribute("count", list.size());
		return "coupon-list";
		
	}
	//添加优惠券
	@RequestMapping(value="/addcouponInfoadd" , method=RequestMethod.POST)
	public String addcouponInfo(Model model,HttpServletRequest request,MultipartFile filepic)throws Exception{
		String money = request.getParameter("money");
		String fullgive = request.getParameter("fullgive");
		String expirationtime =  request.getParameter("expirationtime");
		String speak = request.getParameter("speak");
		FileUpload fileUpload = new FileUpload();
		String pic = fileUpload.uploadIcon(request,filepic, "CouponPic");
		String note = request.getParameter("note");
		//优惠券类别
		String type = request.getParameter("demo1");
		
		//根据类别判断有没有添加过注册送的优惠券和推荐送的优惠券
		if(type=="1" || "1".equals(type)){
			//判断有没有添加过注册送的优惠券
			Coupon coupon = couponService.selectCountTypeByType(Integer.parseInt(type));
			if(coupon!=null && !"".equals(coupon)){
				model.addAttribute("state", 3);
				return 	"coupon-add";
			}
		}
		if(type=="2" || "2".equals(type)){
			//判断有没有添加过推荐送的优惠券
			Coupon coupon = couponService.selectCountTypeByType(Integer.parseInt(type));
			if(coupon!=null && !"".equals(coupon)){
				model.addAttribute("state", 4);
				return 	"coupon-add";
			}
		}
		if(type=="3" || "3".equals(type)){
			//判断有没有添加过推荐送的优惠券
			Coupon coupon = couponService.selectCountTypeByType(Integer.parseInt(type));
			if(coupon!=null && !"".equals(coupon)){
				model.addAttribute("state", 4);
				return 	"coupon-add";
			}
		}
		
		Coupon coupon = new Coupon();
		coupon.setCouponId(java.util.UUID.randomUUID().toString()
				.replaceAll("-", ""));
		coupon.setCouponPic(pic);
		if(money!=null && !"".equals(money)){
			coupon.setCouponMoney(new BigDecimal(money));
		}
		if(fullgive!=null && !"".equals(fullgive)){
			coupon.setCouponFullGive(new BigDecimal(fullgive));
		}
		
		if(expirationtime!=null && !"".equals(expirationtime)){
			coupon.setCouponExpirationTime(Integer.parseInt(expirationtime));
		}
		coupon.setCouponNote(note);
		if(type==null || "".equals(type)){
			coupon.setCouponType(0);
		}else{
			coupon.setCouponType(Integer.parseInt(type));
		}
		coupon.setCouponSpeak(speak);
		coupon.setCouponCreatetime(new Date());
		
		int i = couponService.insertSelective(coupon);
		
		if(i==0){
			model.addAttribute("state", 2);
		}else{
			model.addAttribute("state", 1);	
		}
		
		return 	"coupon-add";
	}
	//查看优惠券
	@RequestMapping(value="/couponInfoLook" , method=RequestMethod.GET)
	public String couponInfoLook(Model model,HttpServletRequest request,String couponId)throws Exception{
		Coupon coupon = couponService.selectByPrimaryKey(couponId);
		model.addAttribute("coupon", coupon);
		model.addAttribute("h", 510);
		return "coupon-update";
	}
		//修改优惠券
		@RequestMapping(value="/updatecouponInfoLook" , method=RequestMethod.POST)
		public String updatecouponInfoLook(Model model,HttpServletRequest request,String couponId,MultipartFile filepic)throws Exception{
			String money = request.getParameter("money");
			String fullgive = request.getParameter("fullgive");
			String expirationtime =  request.getParameter("expirationtime");
			String note = request.getParameter("note");
			String speak = request.getParameter("speak");
			Coupon coupon = new Coupon();
			
			if(filepic!=null){//如果图片不为空
				FileUpload fileUpload = new FileUpload();
				String pic = fileUpload.uploadIcon(request,filepic, "CouponPic");
				coupon.setCouponPic(pic);
			}
			coupon.setCouponId(couponId);
			if(money!=null && !"".equals(money)){
				coupon.setCouponMoney(new BigDecimal(money));
			}
			if(fullgive!=null && !"".equals(fullgive)){
				coupon.setCouponFullGive(new BigDecimal(fullgive));
			}else{
				coupon.setCouponFullGive(BigDecimal.ZERO);
			}
			
			if(expirationtime!=null && !"".equals(expirationtime)){
				coupon.setCouponExpirationTime(Integer.parseInt(expirationtime));
			}else{
				coupon.setCouponExpirationTime(0);
			}
			coupon.setCouponSpeak(speak);
			coupon.setCouponNote(note);
			
			int i = couponService.updateByPrimaryKeySelective(coupon);
			if(i==0){
				model.addAttribute("state", 2);
			}else{
				model.addAttribute("state", 1);	
			}
			//return "redirect:couponInfoLook.action?couponId="+couponId;
			return "redirect:couponAllInfo.action";
		}
	//删除优惠券
	 @RequestMapping(value="/delcouponInfoLook", method = RequestMethod.GET) 
	 public String delcouponInfoLook(Model model,HttpServletRequest request,HttpServletResponse response,String couponId )throws Exception{
		 	//服务信息图片
		 if(couponId==null || "".equals(couponId)){
			 return "404";
		 }
		 int i = couponService.deleteByPrimaryKey(couponId);
		 if(i==0){
				return "404";
			}else{
				return "redirect:couponAllInfo.action";
		}
	 }
	//查看所有红包	 
	 @RequestMapping(value="/redPacketsInfo", method = RequestMethod.GET) 
	 public String redPacketsInfoLook(Model model )throws Exception{
		 RedPacketsExample example = new RedPacketsExample();
		 List<RedPackets> list = redPacketsService.selectByExample(example);
		 
		 model.addAttribute("list", list);
		 return "redpackets-list";
	 }
	//添加红包
	@RequestMapping(value="/addredpacketsadd" , method=RequestMethod.POST)
	public String addredpacketsadd(Model model,HttpServletRequest request,MultipartFile filepic)throws Exception{
		String money = request.getParameter("redPacketsmoney");
		String speak = request.getParameter("redPacketsspeak");
		FileUpload fileUpload = new FileUpload();
		String pic = fileUpload.uploadIcon(request,filepic, "CouponPic");
		String note = request.getParameter("redPacketsnote");
		//优惠券类别
		String type = request.getParameter("demo1");
		
		//根据类别判断有没有添加过该类别红包
			//判断有没有添加过注册红包
		RedPackets  packets = redPacketsService.selectRedpacketsInfoByType(Integer.parseInt(type));
		if(packets!=null && !"".equals(packets)){
			model.addAttribute("state", 3);
		}else{
			RedPackets redPackets = new RedPackets();
			redPackets.setRedPackets(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			redPackets.setRedPacketsPic(pic);
			redPackets.setRedPacketsMoney(new BigDecimal(money));
			
			
			redPackets.setRedPacketsType(Integer.parseInt(type));
			if(type=="4"||type=="5"||"4".equals(type) || "5".equals(type)){
				redPackets.setRedPacketsNote("%");
			}
			redPackets.setRedPacketsSpeak(speak);
			redPackets.setRedPacketsCreatetime(new Date());
			
			int i = redPacketsService.insertSelective(redPackets);
			
			if(i==0){
				model.addAttribute("state", 2);
			}else{
				model.addAttribute("state", 1);	
			}
		}
		return 	"redpackets-add";
	}
	//查看红包
	@RequestMapping(value="/redpacketsInfoLook" , method=RequestMethod.GET)
	public String redpacketsInfoLook(Model model,HttpServletRequest request,String redpacketsId)throws Exception{
		RedPackets redPackets= redPacketsService.selectByPrimaryKeyByResPacketsId(redpacketsId);
		model.addAttribute("RedPackets", redPackets);
		return "redpackets-update";
	}
	//修改红包
	@RequestMapping(value="/updateredpackets" , method=RequestMethod.POST)
	public String updateredpackets(Model model,HttpServletRequest request,MultipartFile filepic,String redPacketsId)throws Exception{
		String money = request.getParameter("redPacketsmoney");
		String speak = request.getParameter("redPacketsspeak");
		FileUpload fileUpload = new FileUpload();
		String pic = fileUpload.uploadIcon(request,filepic, "CouponPic");
		String note = request.getParameter("redPacketsnote");
		
		RedPackets redPackets = new RedPackets();
		redPackets.setRedPackets(redPacketsId);
		redPackets.setRedPacketsPic(pic);
		redPackets.setRedPacketsMoney(new BigDecimal(money));
		
		redPackets.setRedPacketsNote(note);
		redPackets.setRedPacketsSpeak(speak);
		redPackets.setRedPacketsCreatetime(new Date());
		
		int i = redPacketsService.updateByPrimaryKeySelective(redPackets);
		
		if(i==0){
			model.addAttribute("state", 2);
		}else{
			model.addAttribute("state", 1);	
		}
		
		return 	"redirect:redPacketsInfo.action";
	}
	
	//给查看普通优惠券优惠券
	@RequestMapping(value="/sendCouponForUser" , method=RequestMethod.GET)
	public String sendCouponForUser(Model model,HttpServletRequest request,String userId)throws Exception{
		List<Coupon> list  = couponService.selectPutongCouponInfo();
		
		model.addAttribute("list", list);
		model.addAttribute("count", list.size());
		model.addAttribute("userId", userId);
		return "coupon-list";
	}
	//给查看普通优惠券优惠券
	@RequestMapping(value="/sendCouponForUserOver" , method=RequestMethod.POST)
	public void sendCouponForUserOver(Model model,HttpServletRequest request,HttpServletResponse response,String userId,String couponId)throws Exception{
		//根据优惠券ID查询优惠券信息
		Coupon coupony = couponService.selectByPrimaryKey(couponId);
		if(coupony!=null && !"".equals(coupony)){//说明后台设置了注册送的优惠券
			//将优惠券发给用户
			CouponUser couponUser = new CouponUser();
			couponUser.setCouponUserId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
			couponUser.setCouponUserUserId(userId);
			couponUser.setCouponUserMoney(coupony.getCouponMoney());
			couponUser.setCouponUserPic(coupony.getCouponPic());
			couponUser.setCouponUserFullGive(coupony.getCouponFullGive());
			//得到过期天数
			int time = coupony.getCouponExpirationTime();
			if(!"".equals(time) && time!=0){//如果设置了过期时间
				//将当前时间加上过期的天数
				String date =DateUtil.getAfterafewdays(coupony.getCouponExpirationTime());
				DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				couponUser.setCouponUserExpirationTime(fmt.parse(date));
			}
			couponUser.setCouponUserIstouse(1);
			couponUser.setCouponUserSperak(coupony.getCouponSpeak());
			couponUser.setCouponUserCreatetime(new Date());
			couponService.insertSelectiveCouponUser(couponUser);
		}
		PrintWriter printWriter = response.getWriter();
		printWriter.print(0);
	}
	
	//查看所有普通红包	 
	 @RequestMapping(value="/puTredPacketsInfo", method = RequestMethod.GET) 
	 public String puTredPacketsInfo(Model model,String nurseId)throws Exception{
		 RedPacketsExample example = new RedPacketsExample();
		 Criteria criteria = example.createCriteria();
		 criteria.andRedPacketsTypeEqualTo(7);
		 List<RedPackets> list = redPacketsService.selectByExample(example);
		 
		 model.addAttribute("nurseId", nurseId);
		 model.addAttribute("list", list);
		 return "redpackets-list";
	 }
	//查看所有普通红包	 
	 @RequestMapping(value="/sendRedPacketsForNurseOver", method = RequestMethod.POST) 
	 public void sendRedPacketsForNurseOver(Model model,String nurseId,String redPacketsId,HttpServletResponse response )throws Exception{
		 
		 PrintWriter out = response.getWriter();
		//注册成功发送红包
			RedPackets redPackets = redPacketsService.selectByPrimaryKeyByResPacketsId(redPacketsId);
			RedPacketsUser redPacketsUser = new RedPacketsUser();
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat();
			if(redPackets!=null && !"".equals(redPackets)){
				//如果后台设置了注册送的红包(mysql触发器自动加入余额)
				redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				redPacketsUser.setRedPacketsNurseMoney(redPackets.getRedPacketsMoney());
				redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
				redPacketsUser.setRedPacketsNurseNurseId(nurseId);
				redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
				redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
				redPacketsUser.setRedPacketsNurseCreatetime(new Date());
				redPacketsService.insertSelectiveNurseRedPackets(redPacketsUser);
				
				//资金池记录数据
				CapitalNursePool pool = new CapitalNursePool();
				pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
				pool.setCapitalNursePoolPeopleid(nurseId);
				pool.setCapitalNursePoolOrdersendid("");
				pool.setCapitalNursePoolMoney(redPackets.getRedPacketsMoney());
				pool.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
				pool.setCapitalNursePoolType(0);
				pool.setCapitalNursePoolCreatetime(new Date());
				capitalNursePoolService.insertSelective(pool);
				
				////将推送记录到护士站内信中
				StandInnerLetter innerLetter = new StandInnerLetter();
				innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter.setStandInnerLetterUserId(nurseId);                     
				innerLetter.setStandInnerLetterUserIdentity(1);
				innerLetter.setStandInnerLetterTitle("订单评价");
				//0订单消息/1资金消息/2系统通知
				innerLetter.setStandInnerLetterUserType(1);
				innerLetter.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPackets.getRedPacketsMoney()+"的平台红包");
				innerLetter.setStandInnerLetterCreatetime(date);
				standInnerLetterService.insertSelective(innerLetter);
				
				out.print(0);
			}else{
				out.print(5);
			}
	 }
	 
}
