package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.Goods;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.ReportVO;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NursingReportService;
import com.chance.ssm.service.SimpleMajorService;
/**
 * 护理报告控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("report")
public class NursingReportController {

	@Autowired
	private NursingReportService nursingReportService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	@Autowired
	private SimpleMajorService simpleMajorService;
	
	//通过用户id得到护理报告受护人名字和次数  selectReportByUserId
	@RequestMapping(value="/selectReportByUserId",method=RequestMethod.POST)
	public @ResponseBody NetState selectReportByUserId(String userId)throws Exception{
		NetState netState = new NetState();
		if(null == userId || "".equals(userId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<ReportVO> listReport = nursingReportService.selectReportByUserId(userId);
		
		if(null == listReport || "".equals(listReport) || listReport.size()==0){
			netState.setData("没有关于您的护理报告");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			if(listReport==null || listReport.size()==0){
				netState.setData("查询结果为空");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
				netState.setJson(listReport);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(listReport);
			}
		}
		return netState;
	}
	
	//通过用户id和受护人身份证号码得到护理报告服务项和护士等信息  
	@RequestMapping(value="/selectReportByUserIdAndPersonCard",method=RequestMethod.POST)
	public @ResponseBody NetState selectReportByUserIdAndPersonCard(String userId,String personCard)throws Exception{
		NetState netState = new NetState();
		if(null == userId || "".equals(userId)){
			netState.setData("用户id参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}else if(null == personCard || "".equals(personCard)){
			netState.setData("受护人身份证号参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		ReportVO reportVO = new ReportVO();
		reportVO.setOrderSendUserid(userId);
		reportVO.setProtectedPersonCard(personCard);
		
		List<ReportVO> listReport = nursingReportService.selectReportByUserIdAndPersonCard(reportVO);
		//将护理报告的服务id变成服务名
		int reportSize = listReport.size();
		//服务产品信息
		String[] contentid =null;
		//二级服务名
		String contentname="";
		String newcontentid ="";
		String goodsName = "";
		//String newgoosName = "";
		Goods goods = new Goods();
		ManageNursingContent manageNursingContent = new ManageNursingContent();
		for (int i = 0; i < reportSize; i++) {
			//将科室id变成专业名
			String majorId = listReport.get(i).getNurseOffice();
			SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
			if(simpleMajor!=null){
			listReport.get(i).setNurseOffice(simpleMajor.getSimpleMajorName());
			}
			
			String newgoosName="";
			contentid= listReport.get(i).getOrderSendServicecontent().split(",");
			for(int c =0; c<contentid.length;c++){
				goods = goodsService.selectByPrimaryKey(contentid[c]);
				if(goods!=null){
					newcontentid = goods.getGoodsContent();
					goodsName = goods.getGoodsName();
					newgoosName+=goodsName+",";
				}
			}
			if(newcontentid!= null || !"".equals(newcontentid)){
				manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
				if(manageNursingContent!=null){
					contentname = manageNursingContent.getManageNursingContentName();
					if(newgoosName!=null && !"".equals(newgoosName)){
						newgoosName = newgoosName.substring(0, newgoosName.length()-1);
					}
					listReport.get(i).setOrderSendServicecontent(contentname+":"+newgoosName);
				}else{
					listReport.get(i).setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
				}
			}
		}
		if(null == listReport || "".equals(listReport) || listReport.size()==0){
			netState.setData("没有关于您的护理报告");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			if(listReport.size() == 0 || "".equals(listReport)){
				netState.setData("查询结果为空");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
				netState.setJson(listReport);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(listReport);
			}
			
		}
		return netState;
	}
	//护士查询自己填写过的护理报告
	@RequestMapping(value="/selectReportByUserIdAndPersonCardByNurseId",method=RequestMethod.POST)
	public @ResponseBody NetState selectReportByUserIdAndPersonCardByNurseId(String nurseId,Integer pageNum)throws Exception{
		NetState netState = new NetState();
		if(null == nurseId || "".equals(nurseId)){
			netState.setData("护士id参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}else if(null == pageNum || "".equals(pageNum)){
			netState.setData("分页参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<ReportVO> newlist =  nursingReportService.selectReportByUserIdAndPersonCardByNurseId(nurseId);
		// 每页多少条
		int num = 10;
		List<ReportVO> paging = new ArrayList<ReportVO>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有订单了");
			netState.setErrorCode(NetState.SUCCESS);
			return netState;

		} else if ((newlist.size() - (pageNum * num)) < 0) {
			netState.setData("超出范围");
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		} else {
			// 分页操作
			// 判断是否是最后一页
			if ((newlist.size() - pageNum * num) < num) {
				for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
					paging.add(newlist.get(i + pageNum * num));
				}
			} else {
				for (int i = 0; i < num; i++) {
					paging.add(newlist.get(i + pageNum * num));
				}
			}
		}
		if(paging==null || "".equals(paging)){
			netState.setData("暂无订单信息");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			//服务产品信息
			String[] contentid =null;
			//二级服务名
			String contentname="";
			String newcontentid ="";
			String goodsName = "";
			Goods goods = new Goods();
			ManageNursingContent manageNursingContent = new ManageNursingContent();
			for (ReportVO reportVO : paging) {
				String newgoosName="";
				contentid= reportVO.getOrderSendServicecontent().split(",");
				for(int c =0; c<contentid.length;c++){
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						contentname = manageNursingContent.getManageNursingContentName();
						if(newgoosName!=null && !"".equals(newgoosName)){
							newgoosName = newgoosName.substring(0, newgoosName.length()-1);
						}
						reportVO.setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						reportVO.setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
			}
			netState.setData("获取成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(paging);
		}
		return netState;
	}
}
