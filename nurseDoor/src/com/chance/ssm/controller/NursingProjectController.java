package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentExample.Criteria;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.ManageNursingProjectExample;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.ManageNursingProjectService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.GsonUtil;
import com.chance.ssm.utils.file.FileUpload;
/**
 * 一级服务项控制类
 * @author Administrator
 *
 */
@Controller
public class NursingProjectController {
	@Autowired
	private NurseService nurseService;
	@Autowired
	private UserService userService;
	@Autowired
	private ManageNursingProjectService mProjectService;

	@Autowired
	private ManageNursingContentService mContentService;
	
	@Autowired
	private GoodsService goodsService;

	/**
	 * 询所有服务及保护的服务项
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/NursingReport", method = RequestMethod.POST)
	public @ResponseBody
	NetState NursingReport(HttpServletRequest request) throws Exception {
		NetState netState = new NetState();
		// 查询所有一级菜单
		List<ManageNursingProject> manageNursingProjects = new ArrayList<ManageNursingProject>();
		ManageNursingProjectExample mProjectExample = new ManageNursingProjectExample();
		mProjectExample.setOrderByClause("project_order asc, manage_nursing_project_updatetime desc, manage_nursing_project_createtime desc");
		manageNursingProjects = mProjectService
				.selectByExample(mProjectExample);

		// 把“\”替换成“/”
		for (int i = 0; i < manageNursingProjects.size(); i++) {
			if (manageNursingProjects.get(i).getManageNursingProjectPic() != null) {
				String zhuanye = manageNursingProjects.get(i)
						.getManageNursingProjectPic().replaceAll("\\\\", "/");
				manageNursingProjects.get(i)
						.setManageNursingProjectPic(zhuanye);
			}
		}
		// 查询所有二级菜单

		for (int i = 0; i < manageNursingProjects.size(); i++) {
			// 查询一级菜单下的二级菜单
			List<ManageNursingContentWithBLOBs> mNursingContents = new ArrayList<ManageNursingContentWithBLOBs>();
			ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
			mNursingContentExample.setOrderByClause("content_order asc");
			
			Criteria criteria = mNursingContentExample.createCriteria();
			criteria.andManageNursingContentMaprojectEqualTo(manageNursingProjects
					.get(i).getManageNursingProjectId());
			mNursingContents = mContentService
					.selectByExampleWithBLOBs(mNursingContentExample);
			// for(int j = 0; j < mNursingContents.size(); j++){
			// String zhuanye =
			// mNursingContents.get(j).getContentImgurl().replaceAll("\\\\",
			// "/");
			// mNursingContents.get(j).setContentImgurl(zhuanye);
			// }
			// 把二级菜单转成json
			JSONArray json = new JSONArray();
			for (ManageNursingContentWithBLOBs a : mNursingContents) {
				JSONObject jo = new JSONObject();
				jo.put("contentid", a.getManageNursingContentId());
				jo.put("contentname", a.getManageNursingContentName());
				json.put(jo);
			}
			String jsonString = json.toString();
			manageNursingProjects.get(i).setUndel(jsonString);

		}
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(manageNursingProjects);
		return netState;
	}
	//判断二级下面有没有产品 
	@RequestMapping(value = "/selectContentIsNotNull", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectContentIsNotNull(HttpServletRequest request,String contentId) throws Exception {
		NetState netState = new NetState();
		if(contentId == null || "".equals(contentId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<Goods> list =  goodsService.selectGoodsIsCanUse(contentId);
		if(list.size()>0){
			netState.setData("有产品");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson("yes");
		}else{
			netState.setData("敬请期待");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
			netState.setJson("no");
		}
		return netState;
	}
}
