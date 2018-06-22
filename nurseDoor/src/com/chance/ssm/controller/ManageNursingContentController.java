package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.Goods;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.NursingProjectExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.NursingProjectService;
import com.chance.ssm.service.StandInnerLetterService;
/**
 * 护理服务项控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("content")
public class ManageNursingContentController {
	
	@Autowired
	private ManageNursingContentService mNursingContentService;
	
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private NursingProjectService nursingProjectService;
	
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
//	/**
//	 * 通过服务ID查询产品详情
//	 * @param projectid 护理ID
//	 * @return
//	 */
//	@RequestMapping(value="selectcontentbyprojectid",method = RequestMethod.POST)
//	public @ResponseBody
//	NetState SelectContentByProjectId(String contentId){
//		NetState netState = new NetState();
//		if(contentId == null || "".equals(contentId)){
//			netState.setData("服务ID错误");
//			netState.setErrorCode(NetState.PARAMS_ERROR);
//		}else{
//			
//			
//			try {
//				//根据ID查询产品
//				GoodsExample goodsExample = new GoodsExample();
//				com.chance.ssm.po.GoodsExample.Criteria criteria = goodsExample.createCriteria();
//				criteria.andGoodsContentEqualTo(contentId);
//				List<GoodsVO> goodsVOs = new ArrayList<GoodsVO>();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		return netState;
//		
//	}
	//查询所有二级
	@RequestMapping(value="SelectContentAllinfo",method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectContentAllinfo()throws Exception{
		NetState netState = new NetState();
		
		ManageNursingContentExample example = new ManageNursingContentExample();
		List<ManageNursingContent> list =  mNursingContentService.selectByExample(example);
		// 把“\”替换成“/”
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getContentImgurl() != null) {
				String zhuanye = list.get(i)
						.getContentImgurl().replaceAll("\\\\", "/");
				list.get(i).setContentImgurl(zhuanye);
			}
		}
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(list);
		return netState;
}
	//护士选择擅长服务
	@RequestMapping(value="SelectGoodServiceForNurse",method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectGoodServiceForNurse(String nurseId,String contentId)throws Exception{
		NetState netState = new NetState();
		Nurse nurse = new Nurse();
		nurse.setNurseId(nurseId);
		if(contentId!=null &&!"".equals(contentId)){
			nurse.setNurseGoodservice(contentId);
			//删除掉之前添加的服务项
			NursingProjectExample projectExample = new NursingProjectExample();
			com.chance.ssm.po.NursingProjectExample.Criteria criteria = projectExample.createCriteria();
			criteria.andNursingNurseidEqualTo(nurseId);
			nursingProjectService.deleteByExample(projectExample);
			
			String[] contents = contentId.split(",");
			for (int i = 0; i < contents.length; i++) {
				NursingProject nursingProject = new NursingProject();
				nursingProject.setNursingProjectId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				nursingProject.setNursingNurseid(nurseId);
				nursingProject.setNursingProjectMacontent(contents[i]);
				nursingProject.setNursingProjectCreatetime(new Date());
				nursingProjectService.insertSelective(nursingProject);
			}
			//并且变成认证中状态
			nurse.setNurseDistrict("2");
		}else{
			//删除掉之前添加的服务项
			NursingProjectExample projectExample = new NursingProjectExample();
			com.chance.ssm.po.NursingProjectExample.Criteria criteria = projectExample.createCriteria();
			criteria.andNursingNurseidEqualTo(nurseId);
			nursingProjectService.deleteByExample(projectExample);
			
			nurse.setNurseGoodservice("(NULL)");
		}
		
		int i = nurseService.updateByNurseId(nurse);
		
		if(i>0){
			Date date = new Date();
			//将推送记录到护士站内信中
			StandInnerLetter innerLetter = new StandInnerLetter();
			innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			innerLetter.setStandInnerLetterUserId(nurseId);
			innerLetter.setStandInnerLetterUserIdentity(1);
			//0订单消息/1资金消息/2系统通知
			innerLetter.setStandInnerLetterUserType(2);
			innerLetter.setStandInnerLetterTitle("系统消息");
			innerLetter.setStandInnerLetterContent("您于"+date+"提交的服务内容正在交于后台审核,请耐心等待");
			innerLetter.setStandInnerLetterCreatetime(date);
			standInnerLetterService.insertSelective(innerLetter);
			
			
			netState.setData("更新成功");
			netState.setErrorCode(NetState.SUCCESS);
		}else{
			netState.setData("更新失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		return netState;
	}
	
	//根据二级服务ID查询所有该订单的评论
	@RequestMapping(value="selectEvaluateByContentId",method = RequestMethod.POST)
	public @ResponseBody
	NetState selectEvaluateByContentId(String contentId,Integer pageNum)throws Exception{
		NetState netState = new NetState();
		if(contentId==null||"".equals(contentId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(pageNum==null||"".equals(pageNum)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<EvaluateVO> newlist =  evaluateService.selectEvaluateByContentId(contentId);
		
		// 每页多少条
		int num = 10;
		List<EvaluateVO> paging = new ArrayList<EvaluateVO>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有评论了");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
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
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(paging);
		return netState;
	}
	//通过2级查询所有3级产品
	@RequestMapping(value="selectGoodInfoByContent",method = RequestMethod.POST)
	public @ResponseBody
	NetState selectGoodInfoByContent(String contentId)throws Exception{
		NetState netState = new NetState();
		if(contentId==null ||"".equals(contentId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		List<Goods> list = goodsService.selectGoodInfoByContent(contentId);
		if(list.size()==0){
			netState.setData("没有产品");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(list);
		}
		return netState;
	}
}
