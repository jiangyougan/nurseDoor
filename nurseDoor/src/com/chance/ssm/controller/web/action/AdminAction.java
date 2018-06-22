package com.chance.ssm.controller.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import com.chance.ssm.service.AdministrationService;
import com.chance.ssm.utils.Md5Encrypt;

@Controller
//后台管理控制器
public class AdminAction {
	
	@Autowired
	private AdministrationService administrationService;
	
	//查询所有管理
	 @RequestMapping(value="/AdminList", method = RequestMethod.GET) 
	 public String AdminList(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		 //查询所有管理
		 String adminUserId = (String)session.getAttribute("adminUserId");
		 String handle = request.getParameter("handle");
		 List<Administration> list = administrationService.selectAdminListInfo();
		 List<Administration> listTwo = new ArrayList<Administration>();
		 Administration administration = new Administration();
		 Integer adminUsergrade = (Integer)session.getAttribute("adminUsergrade");
		 if(adminUsergrade == 0){
			 
		 }else if(adminUsergrade == 1){
			 for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getAdministrationGrade() != 0){
					listTwo.add(list.get(i));
				}
			}
			 list = listTwo;
		 }
		 
		 model.addAttribute("list", list);
		 model.addAttribute("count", list.size());
		 model.addAttribute("handle", handle);
		 return "admin-list";
	 }
	 //关键字查询管理selectKeyWordFromAdmin
	 @RequestMapping(value="/AdminListKeyWordFrom", method = RequestMethod.POST) 
	 public String AdminListKeyWordFrom(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		 //查询所有管理
		 String keyword = request.getParameter("keyword");
		 List<Administration> list = administrationService.selectKeyWordFromAdmin(keyword);
		 model.addAttribute("list", list);
		 model.addAttribute("count", list.size());
		 model.addAttribute("keyword", keyword);
		 return "admin-list";
	 }
	 //管理员停用启用AdminState
	 @RequestMapping(value="/AdminState", method = RequestMethod.GET) 
	 public String AdminState(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		 String id = request.getParameter("id");
		 String State = request.getParameter("state");
		 Administration administration = new Administration();
		 administration.setAdministrationState(Integer.parseInt(State));
		 administration.setAdministrationId(id);
		 int i = administrationService.updateByPrimaryKeySelective(administration);
		 int handle = 0; 
		 if(i>0){
			 handle = 200;
		 }else{
			 handle = 400;
		 }
		 return "redirect:AdminList.action?handle="+handle;
	 }
	 //删除管理员
	 @RequestMapping(value="/AdminDelete", method = RequestMethod.GET) 
	 public String AdminDelete(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		 String id = request.getParameter("id");
		 administrationService.deleteByPrimaryKey(id);
		 return "redirect:AdminList.action";
	 }
	 //添加管理员
	 @RequestMapping(value="/addAdmin", method = RequestMethod.POST) 
	 public String addAdmin(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,
			 String adminUserId,String username,String newpassword,String nick,String admingrade,String note
			 )throws Exception{
		 //判断该账号有没有注册过
		 String adminstate = "";
		 Administration list =administrationService.selectAdminInfoBy(username);
		 if(list != null && !"".equals(list)){
			 model.addAttribute("adminstate", 0);
			 return "admin-add";
		 }
		 Administration administration = new Administration();
		 administration.setAdministrationId(UUID.randomUUID().toString().replaceAll("-", ""));
		 administration.setAdministrationName(username);
		 administration.setAdministrationPwd(Md5Encrypt.Bit16(newpassword).toLowerCase());
		 administration.setAdministrationNick(nick);
		 //获取性别
		 String sex = request.getParameter("sex");
		 if(sex == "on" || "on".equals(sex)){
			 administration.setAdministrationSex(2);
		 }else{
			 administration.setAdministrationSex(Integer.parseInt(sex));
		 }
		 administration.setAdministrationGrade(Integer.parseInt(admingrade));
		 administration.setAdministrationState(0);
		 administration.setAdministrationCreatetime(new Date());
		 administration.setAdministrationCreateter(adminUserId);
		 administration.setAdministrationAddress(note);
		 administrationService.insertSelective(administration);
		 model.addAttribute("adminstate", 1);
		 return "admin-add";
	 }
	 //根据管理员ID查询管理员信息
	 @RequestMapping(value="/selectAdminuserInfo", method = RequestMethod.GET) 
	 public String selectAdminuserInfo(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,
			 String administrationId
			 )throws Exception{
		 Administration administration = administrationService.selectByPrimaryKey(administrationId);
		 model.addAttribute("administration", administration);
		 return "admin-edt";
	 }
	 
	 //修改管理员
	 @RequestMapping(value="/updateAdmin", method = RequestMethod.POST) 
	 public String updateAdmin(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,
			 String adminUserId,String administrationId,String newpassword,String nick,String admingrade,String note
			 )throws Exception{
		 Administration administration1 = administrationService.selectByPrimaryKey(administrationId);
		 //得到启用状态
		 int state = administration1.getAdministrationState();
		 
		 Administration administration = new Administration();
		 administration.setAdministrationId(administrationId);
		 administration.setAdministrationPwd(Md5Encrypt.Bit16(newpassword).toLowerCase());
		 administration.setAdministrationNick(nick);
		 //获取性别
		 String sex = request.getParameter("sex");
		 if(sex == "on" || "on".equals(sex)){
			 administration.setAdministrationSex(2);
		 }else{
			 administration.setAdministrationSex(Integer.parseInt(sex));
		 }
		 administration.setAdministrationGrade(Integer.parseInt(admingrade));
		 administration.setAdministrationState(state);
		 administration.setAdministrationCreatetime(new Date());
		 administration.setAdministrationCreateter(adminUserId);
		 administration.setAdministrationAddress(note);
		 int i = administrationService.updateByPrimaryKeySelective(administration);
		 if(i>0){
			 model.addAttribute("adminstate", 1);
		 }else{
			 model.addAttribute("adminstate", 0);
		 }
		 return "redirect:selectAdminuserInfo.action?administrationId="+administrationId;
	 }
}
