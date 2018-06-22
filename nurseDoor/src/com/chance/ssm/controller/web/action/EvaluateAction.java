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

import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.EvaluateExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.EvaluateUserAndNurseVO;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.po.vo.UserComplaintVo;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.utils.Pager;

@SuppressWarnings("unused")
@Controller
public class EvaluateAction {
	
	@Autowired
	private EvaluateService evaluateService;

	//分页查询好评
	@RequestMapping(value="selectGoodEvaluateInfoOfKeyWord", method = RequestMethod.GET)
	private String selectGoodEvaluateInfoOfKeyWord(String mark,Integer pageNow,HttpServletRequest request,Model model)throws Exception{
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
		int userCount=evaluateService.selectGoodEvaluateInfoOfKeyWordCount(complaintVagueVo);	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<EvaluateUserAndNurseVO> list = evaluateService.selectGoodEvaluateInfoOfKeyWord(complaintVagueVo);
			
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		
		return "evaluate-good-list";
	}
	//关键字查询好评
		@RequestMapping(value="selectGoodEvaluateInfoOfKeyWordGood",method = RequestMethod.POST)
		public String selectGoodEvaluateInfoOfKeyWordGood(Model model,HttpServletRequest request)throws Exception{
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
			complaintVagueVo.rows = 1000;
			complaintVagueVo.parameter = keyWord;
			
			List<EvaluateUserAndNurseVO> list = evaluateService.selectGoodEvaluateInfoOfKeyWord(complaintVagueVo);
			model.addAttribute("list", list);
			model.addAttribute("datemin", minT);
			model.addAttribute("datemax", maxT);
			model.addAttribute("number", keyWord);
			return "evaluate-good-list";
	}
	
	
	//分页查询中评
	@RequestMapping(value="selectMiddleEvaluateInfoOfKeyWord", method = RequestMethod.GET)
	private String selectMiddleEvaluateInfoOfKeyWord(String mark,Integer pageNow,HttpServletRequest request,Model model)throws Exception{
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
		int userCount=evaluateService.selectMiddleEvaluateInfoOfKeyWordCount(complaintVagueVo);	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<EvaluateUserAndNurseVO> list = evaluateService.selectMiddleEvaluateInfoOfKeyWord(complaintVagueVo);
			
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		
		return "evaluate-middle-list";
	}
	//关键字查询中评
	@RequestMapping(value="selectMiddleEvaluateInfoOfKeyWordMiddle",method = RequestMethod.POST)
	public String selectMiddleEvaluateInfoOfKeyWordMiddle(Model model,HttpServletRequest request)throws Exception{
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
		complaintVagueVo.rows = 1000;
		complaintVagueVo.parameter = keyWord;
		
		List<EvaluateUserAndNurseVO> list = evaluateService.selectMiddleEvaluateInfoOfKeyWord(complaintVagueVo);
		model.addAttribute("list", list);
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("number", keyWord);
		return "evaluate-middle-list";
	}
	//分页查询差评
	@RequestMapping(value="selectBadEvaluateInfoOfKeyWord", method = RequestMethod.GET)
	private String selectBadEvaluateInfoOfKeyWord(String mark,Integer pageNow,HttpServletRequest request,Model model)throws Exception{
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
		int userCount=evaluateService.selectBadEvaluateInfoOfKeyWordCOUNT(complaintVagueVo);	//查询结果的记录条数
		int totalPage=Pager.getTotalPage(userCount);
		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		List<EvaluateUserAndNurseVO> list = evaluateService.selectBadEvaluateInfoOfKeyWord(complaintVagueVo);
			
		model.addAttribute("list", list);
		request.setAttribute("count", userCount);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("start", result.get("start"));
		request.setAttribute("end", result.get("end"));
		
		return "evaluate-bad-list";
	}
	//关键字查询差评
	@RequestMapping(value="selectBadEvaluateInfoOfKeyWordBad",method = RequestMethod.POST)
	public String selectBadEvaluateInfoOfKeyWordBad(Model model,HttpServletRequest request)throws Exception{
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
		complaintVagueVo.rows = 1000;
		complaintVagueVo.parameter = keyWord;
		
		List<EvaluateUserAndNurseVO> list = evaluateService.selectBadEvaluateInfoOfKeyWord(complaintVagueVo);
		model.addAttribute("list", list);
		model.addAttribute("datemin", minT);
		model.addAttribute("datemax", maxT);
		model.addAttribute("number", keyWord);
		return "evaluate-bad-list";
	}
	
	//修改评价
	@RequestMapping(value="updateEevaluateById", method = RequestMethod.POST)
	private String updateEevaluateById(BigDecimal mark,String evaluateId,String content,HttpServletRequest request,Model model)throws Exception{
		//修改评价
		Evaluate evaluate = new Evaluate();
		evaluate.setEvaluateId(evaluateId);
		evaluate.setEvaluateMark(mark);
		evaluate.setEvaluateContent(content);
		int i = evaluateService.updateByPrimaryKeySelective(evaluate);
		if(i>0){
			model.addAttribute("state", 4);
			model.addAttribute("evaluateContent", content);
		}else{
			model.addAttribute("state", 3);
		}
		return "evaluate-update";
	}
	
	@RequestMapping(value="evaluateAllinfoByType", method = RequestMethod.GET)
	private String evaluateAllinfoByType(String mark)throws Exception{
		//初始化评价实体类的list
		List<EvaluateVO> evaluateList = new ArrayList<EvaluateVO>();
		EvaluateExample evaluateExample = new EvaluateExample();
		Criteria criteria = evaluateExample.createCriteria();
		//criteria.andEvaluateNurseidEqualTo(nurseId);
		if(mark.equals("1")){
			criteria.andEvaluateMarkGreaterThan((long)3);
		}
		if(mark.equals("2")){
			criteria.andEvaluateMarkEqualTo((long)3);
		}
		if(mark.equals("3")){
			criteria.andEvaluateMarkLessThan((long)3);
		}
		evaluateList = evaluateService.selectByExampleRuVO(evaluateExample);
		
		return "";
	}
}
