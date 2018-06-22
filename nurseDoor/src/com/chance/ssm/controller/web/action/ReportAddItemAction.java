package com.chance.ssm.controller.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.ManageNursingTestall;
import com.chance.ssm.po.ManageNursingTestallExample;
import com.chance.ssm.po.ManageNursingTesting;
import com.chance.ssm.po.ManageNursingTestingExample;
import com.chance.ssm.po.ManageNursingTestingExample.Criteria;
import com.chance.ssm.po.vo.ManageNursingTestingVO;
import com.chance.ssm.service.ManageNursingTestallService;
import com.chance.ssm.service.ManageNursingTestingService;

@Controller
public class ReportAddItemAction {
	@Autowired	
	private ManageNursingTestallService mNursingTestallService;
	
	@Autowired
	private ManageNursingTestingService mTestingService;
	
	/**
	 * 根据ID删除检测项
	 * @param goodsId 三级菜单ID
	 * @param testingId 检测项ID
	 * @return
	 */
	@RequestMapping(value="delecttestingbyid")
	public String DelectTestingById(String goodsId, String testingId){
		if(goodsId == null || "".equals(goodsId)){
			return "error";
		}else if(testingId == null || "".equals(testingId)){
			return "redirect:selectreportbygoodsId.action?goodsId="+goodsId;
		}else{
			int i = 0;
			try {
				i = mTestingService.deleteByPrimaryKey(testingId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i > 0){
				return "redirect:selectreportbygoodsId.action?goodsId="+goodsId;
			}else{
				return "error";
			}
		}
	}
	
	/**
	 * 查询三级菜单所能使用的所有填写项
	 * @param goodsId 三级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "selectreportbygoodsId")
	public String SelectReportByGoodsId(String goodsId, Model model){
		if(goodsId == null){
			return "error";
		}else{
			//初始化一个实体类bean的list，用于保存从数据库中查出来的数据
			List<ManageNursingTestingVO> mNursingTestings = new ArrayList<ManageNursingTestingVO>();
			ManageNursingTestingExample mNursingTestingExample = new ManageNursingTestingExample();
			Criteria criteria = mNursingTestingExample.createCriteria();
			//把三级菜单的ID导入
			criteria.andManageNursingTestingMacontentEqualTo(goodsId);
			mNursingTestingExample.setOrderByClause("manage_nursing_testing_createter desc");
			try {
				mNursingTestings = mTestingService.selectByExampleAndTestAllselectByExample(mNursingTestingExample);
				model.addAttribute("mNursingTestings", mNursingTestings);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		model.addAttribute("goodsId", goodsId);
		return "nursingreport-goods-list";
		
	}
	
	/**
	 * 查询所有的填写项
	 * @param goodsId三级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selectreportallgoods")
	public String SelectReportAllGoods(String goodsId,Model model){
		//创建一个list,存放查出来的数据
		List<ManageNursingTestall> testallList = new ArrayList<ManageNursingTestall>();
		ManageNursingTestallExample mNursingTestallExample = new ManageNursingTestallExample();
		mNursingTestallExample.setOrderByClause("manage_nursing_testall_createtime desc");
		try {
			testallList = mNursingTestallService.selectByExample(mNursingTestallExample);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("testallList", testallList);
		model.addAttribute("goodsId", goodsId);
		return "nursingreport-goods";
		
	}
	
	/**
	 * 获取三级菜单所使用的服务项
	 * @param goodsId三级菜单ID
	 * @param request
	 * @return
	 */
	@RequestMapping(value="selecttestall")
	public String SelectTestAll(String goodsId,HttpServletRequest request, HttpSession session){
		String[] testingIds = request.getParameterValues("ifAll");//返回一个数组
		ManageNursingTesting mNursingTesting = new ManageNursingTesting();
		// 生成ID
		
		int j = 0;
		for(int i = 0; i < testingIds.length; i++){
			String testingId = java.util.UUID.randomUUID().toString()
							.replaceAll("-", "");
			mNursingTesting.setManageNursingTestingMacontent(goodsId);
			mNursingTesting.setManageNursingTestingId(testingId);
			mNursingTesting.setManageNursingTestingName(testingIds[i]);
			mNursingTesting.setManageNursingTestingCreateter(new Date());
//			mNursingTesting.setManageNursingTestingCreatetime(session.getAttribute("").toString());
			j = 0;
			try {
				//插入数据库中
				j = mTestingService.insertSelective(mNursingTesting);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(j > 0){
			return "redirect:selectreportbygoodsId.action?goodsId="+goodsId;
		}else{
			return "error";
		}
	
		
	}
	
	/**
	 * 根据ID删除数据
	 * @param reportId ID
	 * @return
	 */
	@RequestMapping(value="delectreportbyid")
	public String DelectReportById(String reportId){
		if(reportId == null){
			return "redirect:selectreportall.action";
		}else{
			int i = 0;
			try {
				i = mNursingTestallService.deleteByPrimaryKey(reportId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i > 0){
				return "redirect:selectreportall.action";
			}else{
				return "error";
			}
		}
		
		
	}
	
	/**
	 * 修改添加项
	 * @param name 名称
	 * @param PCS 单位
	 * @param reportId ID 
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updatereport", method = RequestMethod.POST)
	public String UpdateReport(String name, String PCS, String reportId, Model model, HttpSession session){
		// 创建一个实体类bean
		ManageNursingTestall mNursingTestall = new ManageNursingTestall();
		// 生成ID
		String testallId = java.util.UUID.randomUUID().toString()
				.replaceAll("-", "");
		// 把数据添加到实体类中
		mNursingTestall.setManageNursingTestall(testallId);
		if (name != null && !"".equals(name)) {
			mNursingTestall.setManageNursingTestallName(name);
		}
		if (PCS != null && !"".equals(PCS)) {
			mNursingTestall.setManageNursingTestallUnit(PCS);
		}
		if(reportId != null && !"".equals(reportId)){
			mNursingTestall.setManageNursingTestall(reportId);
		}
		// 创建人
		// mNursingTestall.setManageNursingTestallCreaterid(session.getAttribute("").toString());
		int i = 0;
		try {
			i = mNursingTestallService.updateByPrimaryKeySelective(mNursingTestall);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			return "redirect:selectreportall.action";
		}else{
			return "error";
		}
		
	}
	
	/**
	 * 查询需要修改的添加项
	 * @param reportId 添加项ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selectreportbyid")
	public String SelectReportById(String reportId, Model model){
		if(reportId == null){
			return "redirect:selectreportall.action";
		}else{
			//创建一个实体类
			ManageNursingTestall mNursingTestall = new ManageNursingTestall();
			try {
				mNursingTestall = mNursingTestallService.selectByPrimaryKey(reportId);
				model.addAttribute("mNursingTestall", mNursingTestall);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "nursingreport-edit";
		
	}
	
	/**
	 * 查询所有的填写项
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selectreportall")
	public String SelectReportAll(Model model){
		//创建一个list,存放查出来的数据
		List<ManageNursingTestall> testallList = new ArrayList<ManageNursingTestall>();
		ManageNursingTestallExample mNursingTestallExample = new ManageNursingTestallExample();
		mNursingTestallExample.setOrderByClause("manage_nursing_testall_createtime asc");
		try {
			testallList = mNursingTestallService.selectByExample(mNursingTestallExample);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("testallList", testallList);
		return "nursingreport-list";
		
	}

	/**
	 * 添加需要填写项
	 * @param name 填写项名称
	 * @param PCS 填写项单位
	 * @param model
	 * @return
	 */
	@RequestMapping(value="reportadd", method = RequestMethod.POST)
	public String ReportAdd(String name, String PCS, Model model, HttpSession session){
		//创建一个实体类bean
		ManageNursingTestall mNursingTestall = new ManageNursingTestall();
		//生成ID
		String testallId = java.util.UUID.randomUUID().toString().replaceAll("-", "");
		//把数据添加到实体类中 
		mNursingTestall.setManageNursingTestall(testallId);
		if(name != null && !"".equals(name)){
			mNursingTestall.setManageNursingTestallName(name);
		}
		if(PCS != null && !"".equals(PCS)){
			mNursingTestall.setManageNursingTestallUnit(PCS);
		}
		//创建人
//		mNursingTestall.setManageNursingTestallCreaterid(session.getAttribute("").toString());
		mNursingTestall.setManageNursingTestallCreatetime(new Date());
		int i = 0;
		try {
			 i = mNursingTestallService.insertSelective(mNursingTestall);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			return "redirect:selectreportall.action";
		}else{
			return "error";
		}
		
		
	}
}
