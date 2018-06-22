package com.chance.ssm.controller.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.SimpleMajorExample;
import com.chance.ssm.po.SimpleMajorExample.Criteria;
import com.chance.ssm.service.SimpleMajorService;
/**
 * 专业控制类
 * @author Administrator
 *
 */
@Controller
public class SimpleMajorAction {
	@Autowired
	private SimpleMajorService simpleMajorService;
	
	/**
	 * 根据专业名称模糊查询专业信息 
	 * @param simpleMajorName 专业名称
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selectsimplemajoronebyname")
	public String SelectSimpleMajorOneByName(String simpleMajorName, Model model){
		if(simpleMajorName == null || "".equals(simpleMajorName)){
			return "error";
		}else{
			//初始化一个对象的list
			List<SimpleMajor> simpleMajors = new ArrayList<SimpleMajor>();
			SimpleMajorExample simpleMajorExample = new SimpleMajorExample();
			Criteria criteria = simpleMajorExample.createCriteria();
			criteria.andSimpleMajorNameLike("%"+simpleMajorName+"%");
			try {
				simpleMajors = simpleMajorService.selectByExample(simpleMajorExample);
				model.addAttribute("simpleMajorList", simpleMajors);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "simplemajor-list";
		
	}
	
	/**
	 * 根据ID删除专业信息
	 * @param simpleMajorId 专业ID
	 * @return
	 */
	@RequestMapping(value="delectsimplemajorbyid")
	public String DelectSimpleMajorById(String simpleMajorId){
		if(simpleMajorId == null || "".equals(simpleMajorId)){
			return "error";
		}else{
			int i = 0;
			try {
				i = simpleMajorService.deleteByPrimaryKey(simpleMajorId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i > 0){
				return "redirect:selectsimplemajorall.action";
			}else{
				return "error";
			}
		}
		
		
	}
	
	/**
	 * 修改专业信息
	 * @param simpleMajorId 专业ID
	 * @param simpleMajorName 专业名称
	 * @param simpleMajorNote 专业备注
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="updatesimplemajorbyidweb")
	public String updatesimplemajorbyidweb(String simpleMajorId, String simpleMajorName, String simpleMajorNote, HttpSession session, Model model){
		SimpleMajor simpleMajor = new SimpleMajor();
		if(simpleMajorId != null && !"".equals(simpleMajorId)){
			simpleMajor.setSimpleMajorId(simpleMajorId);
		}
		if(simpleMajorName != null && !"".equals(simpleMajorName)){
			simpleMajor.setSimpleMajorName(simpleMajorName);
		}
		if(simpleMajorNote != null && !"".equals(simpleMajorNote)){
			simpleMajor.setSimpleMajorNote(simpleMajorNote);
		}
		simpleMajor.setSimpleMajorUpdatetime(new Date());
		int i = 0;
		try {
			i = simpleMajorService.updateByPrimaryKeySelective(simpleMajor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			return "redirect:selectsimplemajorall.action";
		}else{
			return "error";
		}
		
		
	}
	
	/**
	 * 查询需要修改的专业信息
	 * @param simpleMajorId 专业ID
	 * @param model
	 * @return
	 * @throws  
	 */
	@RequestMapping(value="selectsimplemajorbyidweb")
	public String SelectSimpleMajorByIdWeb(String simpleMajorId, Model model)  {
		SimpleMajor simpleMajor = new SimpleMajor();
		try {
			simpleMajor = simpleMajorService.selectByPrimaryKey(simpleMajorId);
			model.addAttribute("simpleMajor", simpleMajor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "simplemajor-update";
		
	}
	
	/**
	 * 查询所有的专业
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selectsimplemajorall")
	public String SelectSimpleMajorAll(Model model){
		//新建专业对象的list
		List<SimpleMajor> simpleMajorList = new ArrayList<SimpleMajor>();
		SimpleMajorExample simpleMajorExample = new SimpleMajorExample();
		simpleMajorExample.setOrderByClause("simple_major_createtime desc");
		try {
			//查询所有的专业
			simpleMajorList = simpleMajorService.selectByExample(simpleMajorExample);
			model.addAttribute("simpleMajorList", simpleMajorList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "simplemajor-list";
		
	}
	
	/**
	 * 添加新的专业
	 * @param simpleMajorName 专业名称
	 * @param simpleMajorNote 专业备注
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="addsimplemajor", method = RequestMethod.POST)
	public String AddSimpleMajor(String simpleMajorName, String simpleMajorNote, HttpSession session, Model model){
		//新建一个bean实体类
		SimpleMajor simpleMajor = new SimpleMajor();
		//生成ID
		String simpleMajorId = java.util.UUID.randomUUID().toString().replaceAll("-", "");
		simpleMajor.setSimpleMajorId(simpleMajorId);
		if(simpleMajorName != null && !"".equals(simpleMajorName)){
			simpleMajor.setSimpleMajorName(simpleMajorName);
		}
		if(simpleMajorNote != null && !"".equals(simpleMajorNote)){
			simpleMajor.setSimpleMajorNote(simpleMajorNote);
		}
		//从session中获取操作人员的ID，暂时没有
//		simpleMajor.setSimpleMajorCreater(session.getAttribute("").toString());
		simpleMajor.setSimpleMajorCreatetime(new Date());
		int i = 0; 
		try {
			i = simpleMajorService.insertSelective(simpleMajor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			return "redirect:selectsimplemajorall.action";
		}else{
			return "error";
		}
		
		
	}
}
