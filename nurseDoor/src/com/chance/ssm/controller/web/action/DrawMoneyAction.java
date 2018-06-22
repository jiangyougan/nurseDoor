package com.chance.ssm.controller.web.action;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.DrawMoney;
import com.chance.ssm.po.DrawMoneyExample;
import com.chance.ssm.po.DrawMoneyExample.Criteria;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.User;
import com.chance.ssm.service.DrawMoneyService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.Pager;

/**提现管理**/
@Controller
public class DrawMoneyAction {
	
	@Autowired
	private DrawMoneyService drawMoneyService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private NurseService nurseService;
	
	//查询用户正在申请提现的数据
	@RequestMapping(value = "/selectUserDrawMoneyNow", method = RequestMethod.GET)
	public String selectUserDrawMoneyNow(HttpServletRequest request,Model model,Integer pageNow)throws Exception {
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		int userCount=drawMoneyService.selectUserDrawMoneyNowCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		complaintVagueVo.start = (pageNow-1) * Pager.pageSize;
		complaintVagueVo.rows = Pager.pageSize;
		SimpleDateFormat sdf = new SimpleDateFormat();
		complaintVagueVo.minTime = "2012-12-06";
		complaintVagueVo.maxTime = sdf.format(new Date());
		List<DrawMoney> drawMoney = drawMoneyService.selectUserDrawMoneyNow(complaintVagueVo);
		
		model.addAttribute("list", drawMoney);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		
		model.addAttribute("list", drawMoney);
		return "drawMoneyUsering";
	}
	//查询用户已经提现的数据
	@RequestMapping(value = "/selectUserDrawMoneyNed", method = RequestMethod.GET)
	public String selectUserDrawMoneyNed(HttpServletRequest request,Model model,Integer pageNow)throws Exception {
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		int userCount=drawMoneyService.selectUserDrawMoneyNedCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		complaintVagueVo.start = (pageNow-1) * Pager.pageSize;
		complaintVagueVo.rows = Pager.pageSize;
		SimpleDateFormat sdf = new SimpleDateFormat();
		complaintVagueVo.minTime = "2012-12-06";
		complaintVagueVo.maxTime = sdf.format(new Date());
		List<DrawMoney> drawMoney = drawMoneyService.selectUserDrawMoneyNed(complaintVagueVo);
		
		model.addAttribute("list", drawMoney);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		
		model.addAttribute("list", drawMoney);
		return "drawMoneyUsered";
	}
	//驳回用户申请
	@RequestMapping(value = "/delDrawMoneyById", method = RequestMethod.GET)
	public String delDrawMoneyById(HttpServletRequest request,Model model,String drawMoneyId,BigDecimal drawMoneySize,String userId)throws Exception {
		//将该提现记录变成失败状态
		DrawMoneyExample example = new DrawMoneyExample();
		Criteria criteria = example.createCriteria();
		criteria.andDrawMoneyIdEqualTo(drawMoneyId);
		DrawMoney drawMoney = new DrawMoney();
		drawMoney.setDrawMoneyState(2);
		drawMoney.setDrawMoneyHandletime(new Date());
		drawMoneyService.updateByExampleSelective(drawMoney, example);
		
		//得到用户的余额
		User user = userService.selectForUserByID(userId);
		BigDecimal userBalance = user.getUserBalance();
		//将钱添加到用户余额中
		User user1 = new User();
		user1.setUserId(userId);
		user1.setUserBalance(userBalance.add(drawMoneySize));
		userService.updateByPrimaryKeySelective(user1);
		return "redirect:selectUserDrawMoneyNow.action";
	}
	//同意用户申请
	@RequestMapping(value = "/giveMoney", method = RequestMethod.GET)
	public String giveMoney(HttpServletRequest request,Model model,String drawMoneyId,BigDecimal drawMoneySize,String userId)throws Exception {
		//将该提现记录变成成功状态状态
		DrawMoneyExample example = new DrawMoneyExample();
		Criteria criteria = example.createCriteria();
		criteria.andDrawMoneyIdEqualTo(drawMoneyId);
		DrawMoney drawMoney = new DrawMoney();
		drawMoney.setDrawMoneyState(1);
		drawMoney.setDrawMoneyHandletime(new Date());
		drawMoneyService.updateByExampleSelective(drawMoney, example);
		
		return "redirect:selectUserDrawMoneyNow.action";
	}
	//查询护士正在申请提现的数据
	@RequestMapping(value = "/selectNurseDrawMoneyNow", method = RequestMethod.GET)
	public String selectNurseDrawMoneyNow(HttpServletRequest request,Model model,Integer pageNow)throws Exception {
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		int userCount=drawMoneyService.selectNurseDrawMoneyNowCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		complaintVagueVo.start = (pageNow-1) * Pager.pageSize;
		complaintVagueVo.rows = Pager.pageSize;
		SimpleDateFormat sdf = new SimpleDateFormat();
		complaintVagueVo.minTime = "2012-12-06";
		complaintVagueVo.maxTime = sdf.format(new Date());
		List<DrawMoney> drawMoney = drawMoneyService.selectNurseDrawMoneyNow(complaintVagueVo);
		
		model.addAttribute("list", drawMoney);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		
		model.addAttribute("list", drawMoney);
		return "drawMoneyNurseing";
	}
	//查询护士已经提现的数据
	@RequestMapping(value = "/selectNurseDrawMoneyNed", method = RequestMethod.GET)
	public String selectNurseDrawMoneyNed(HttpServletRequest request,Model model,Integer pageNow)throws Exception {
		//分页
		pageNow = pageNow==null ? 1 : pageNow;
		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
		int userCount=drawMoneyService.selectNurseDrawMoneyNedCount();	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		complaintVagueVo.start = (pageNow-1) * Pager.pageSize;
		complaintVagueVo.rows = Pager.pageSize;
		SimpleDateFormat sdf = new SimpleDateFormat();
		complaintVagueVo.minTime = "2012-12-06";
		complaintVagueVo.maxTime = sdf.format(new Date());
		List<DrawMoney> drawMoney = drawMoneyService.selectNurseDrawMoneyNed(complaintVagueVo);
		
		model.addAttribute("list", drawMoney);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		
		
		
		model.addAttribute("list", drawMoney);
		return "drawMoneyNurseed";
	}
	//同意护士申请
	@RequestMapping(value = "/giveNurseMoney", method = RequestMethod.GET)
	public String giveNurseMoney(HttpServletRequest request,Model model,String drawMoneyId,BigDecimal drawMoneySize)throws Exception {
		//将该提现记录变成成功状态状态
		DrawMoneyExample example = new DrawMoneyExample();
		Criteria criteria = example.createCriteria();
		criteria.andDrawMoneyIdEqualTo(drawMoneyId);
		DrawMoney drawMoney = new DrawMoney();
		drawMoney.setDrawMoneyState(1);
		drawMoney.setDrawMoneyHandletime(new Date());
		drawMoneyService.updateByExampleSelective(drawMoney, example);
		
		return "redirect:selectNurseDrawMoneyNow.action";
	}
	//驳回护士申请
	@RequestMapping(value = "/delDrawMoneyByNurseId", method = RequestMethod.GET)
	public String delDrawMoneyByNurseId(HttpServletRequest request,Model model,String drawMoneyId,BigDecimal drawMoneySize,String nurseId)throws Exception {
		//将该提现记录变成失败状态
		DrawMoneyExample example = new DrawMoneyExample();
		Criteria criteria = example.createCriteria();
		criteria.andDrawMoneyIdEqualTo(drawMoneyId);
		DrawMoney drawMoney = new DrawMoney();
		drawMoney.setDrawMoneyState(2);
		drawMoney.setDrawMoneyHandletime(new Date());
		drawMoneyService.updateByExampleSelective(drawMoney, example);
		
		//得到护士的余额
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		BigDecimal userBalance = nurse.getNurseBalance();
		//将钱添加到护士余额中
		Nurse nurse1 = new Nurse();
		nurse1.setNurseId(nurseId);
		nurse1.setNurseBalance(userBalance.add(drawMoneySize));
		nurseService.updateByNurseId(nurse1);
		return "redirect:selectNurseDrawMoneyNow.action";
	}
	
	//模糊查询提现数据
	/**
	 * 
	 * @param model
	 * @param request
	 * @param identity 0用户1护士
	 * @param drawState 0提现中1提现过
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="DrawMoneyActionKeWord",method = RequestMethod.POST)
	public String DrawMoneyActionKeWord(Model model,HttpServletRequest request,String identity,String drawState)throws Exception{
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
		//最大时间
		ComplaintVagueVo complaintVagueVo = new ComplaintVagueVo();
		
		complaintVagueVo.minTime = sdf.format(minTime);
		complaintVagueVo.maxTime = sdf.format(maxTime);
		complaintVagueVo.start=0;
		complaintVagueVo.rows=100000;
		List<DrawMoney> drawMoney = new ArrayList<DrawMoney>();
		if(identity == "0" || "0".equals(identity)){//用户提现
			if(drawState == "0" || "0".equals(drawState)){//用户提现中
				drawMoney = drawMoneyService.selectUserDrawMoneyNow(complaintVagueVo);
				model.addAttribute("list", drawMoney);
				model.addAttribute("datemin", minT);
				model.addAttribute("datemax", maxT);
				return "drawMoneyUsering";
			}else{//用户提现过
				drawMoney = drawMoneyService.selectUserDrawMoneyNed(complaintVagueVo);
				
				model.addAttribute("list", drawMoney);
				model.addAttribute("datemin", minT);
				model.addAttribute("datemax", maxT);
				return "drawMoneyUsered";
			}
		}else{
			if(drawState == "0" || "0".equals(drawState)){//护士提现中
				drawMoney = drawMoneyService.selectNurseDrawMoneyNow(complaintVagueVo);
				
				model.addAttribute("list", drawMoney);
				model.addAttribute("datemin", minT);
				model.addAttribute("datemax", maxT);
				return "drawMoneyNurseing";
			}else{//护士提现过
				drawMoney = drawMoneyService.selectNurseDrawMoneyNed(complaintVagueVo);
				
				model.addAttribute("list", drawMoney);
				model.addAttribute("datemin", minT);
				model.addAttribute("datemax", maxT);
				return "drawMoneyNurseed";
			}
			
		}
	}
}
