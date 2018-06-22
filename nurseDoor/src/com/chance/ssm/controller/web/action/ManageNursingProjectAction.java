package com.chance.ssm.controller.web.action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.Major;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentExample.Criteria;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.ManageNursingProjectExample;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.MajorService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.ManageNursingProjectService;

/**
 * 后台一级护理服务管理控制类
 * 
 * @author Administrator
 * 
 */
@Controller
public class ManageNursingProjectAction {

	@Autowired
	private ManageNursingProjectService manageNursingProjectService;

	@Autowired
	private MajorService majorService;

	@Autowired
	private ManageNursingContentService mNursingContentService;

	@Autowired
	private GoodsService goodsService;
	
	/**
	 * 一级菜单向下移动一位
	 * @param projectId 一级菜单ID
	 * @param order 菜单所在的位置
	 * @return
	 */
	@RequestMapping(value="downone")
	public String DownOne(String projectId, String order){
		Integer orderint = Integer.parseInt(order);
		//统计一共有多少个数据
		ManageNursingProjectExample mNursingProjectExample2 = new ManageNursingProjectExample();
		int countNumber = 0;
		try {
			countNumber = manageNursingProjectService
					.countByExample(mNursingProjectExample2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//判断数据是不是最后一位
		if (orderint >= countNumber) {
			return "redirect:SelectProjectAll.action?";
		} else {
			try {
				// 查询下一位的信息
				List<ManageNursingProject> mNursingProjects = new ArrayList<ManageNursingProject>();
				ManageNursingProjectExample mNursingProjectExample = new ManageNursingProjectExample();
				com.chance.ssm.po.ManageNursingProjectExample.Criteria criteria = mNursingProjectExample
						.createCriteria();
				criteria.andProjectOrderEqualTo(orderint + 1);
				mNursingProjects = manageNursingProjectService
						.selectByExample(mNursingProjectExample);
				// 向上移动一位
				ManageNursingProject manageNursingProject = new ManageNursingProject();
				manageNursingProject.setProjectOrder(orderint + 1);
				manageNursingProject.setManageNursingProjectId(projectId);
				// 修改数据库
				int i = manageNursingProjectService
						.updateByPrimaryKeySelective(manageNursingProject);
				if (i > 0) {
					if (mNursingProjects.size() > 0) {
						ManageNursingProject manageNursingProject2 = new ManageNursingProject();
						manageNursingProject2.setProjectOrder(orderint);
						manageNursingProject2.setManageNursingProjectUpdatetime(new Date());
						manageNursingProject2
								.setManageNursingProjectId(mNursingProjects
										.get(0).getManageNursingProjectId());
						manageNursingProjectService
								.updateByPrimaryKeySelective(manageNursingProject2);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return "redirect:SelectProjectAll.action?";
		
	}
	
	/**
	 * 一级菜单向上移动一位
	 * @param projectId 一级菜单ID
	 * @param order 菜单所在的位置
	 * @return
	 */
	@RequestMapping(value="upwardone")
	public String UpwardOne(String projectId, String order){
		Integer orderint = Integer.parseInt(order);
		//判断数据是不是第一位
		if (orderint <= 1) {
			return "redirect:SelectProjectAll.action?";
		} else {
			try {
				// 查询上一位的信息
				List<ManageNursingProject> mNursingProjects = new ArrayList<ManageNursingProject>();
				ManageNursingProjectExample mNursingProjectExample = new ManageNursingProjectExample();
				com.chance.ssm.po.ManageNursingProjectExample.Criteria criteria = mNursingProjectExample
						.createCriteria();
				criteria.andProjectOrderEqualTo(orderint - 1);
				mNursingProjects = manageNursingProjectService
						.selectByExample(mNursingProjectExample);
				// 向上移动一位
				ManageNursingProject manageNursingProject = new ManageNursingProject();
				manageNursingProject.setProjectOrder(orderint - 1);
				manageNursingProject.setManageNursingProjectUpdatetime(new Date());
				manageNursingProject.setManageNursingProjectId(projectId);
				// 修改数据库
				int i = manageNursingProjectService
						.updateByPrimaryKeySelective(manageNursingProject);
				if (i > 0) {
					if (mNursingProjects.size() > 0) {
						ManageNursingProject manageNursingProject2 = new ManageNursingProject();
						manageNursingProject2.setProjectOrder(orderint);
						manageNursingProject2
								.setManageNursingProjectUpdatetime(new Date());
						manageNursingProject2
								.setManageNursingProjectId(mNursingProjects
										.get(0).getManageNursingProjectId());
						manageNursingProjectService
								.updateByPrimaryKeySelective(manageNursingProject2);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "redirect:SelectProjectAll.action?";
		
	}

	/**
	 * todo 护理服务(一级列表)
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/SelectProjectAll", method = RequestMethod.GET)
	public String SelectProjectAll(Model model) throws Exception {
		ManageNursingProjectExample example = new ManageNursingProjectExample();
		example.createCriteria().andManageNursingProjectIdIsNotNull();
		example.setOrderByClause("project_order asc, manage_nursing_project_updatetime desc, manage_nursing_project_createtime desc");
		List<ManageNursingProject> list = manageNursingProjectService
				.selectByExample(example);
		model.addAttribute("list", list);
		model.addAttribute("count", list.size());
		return "project-list";
	}

	// todo 删除护理服务 完成
	@RequestMapping(value = "/delNursingProject", method = RequestMethod.GET)
	public String delNursingProject(HttpSession session,
			HttpServletRequest request, HttpServletResponse response, String id)
			throws Exception {
		ManageNursingProject manageNursingProject = manageNursingProjectService
				.selectByPrimaryKey(id);
		String webPath = null;
		if(manageNursingProject != null){
			String ProjectImg = manageNursingProject.getProjectImgurl();
			// 得到系统路径
			 webPath = request.getSession().getServletContext()
					.getRealPath("");
			String newwebPath = webPath.substring(0, webPath.length() - 9);
			new File(newwebPath + ProjectImg).delete();
		}
		int i = manageNursingProjectService.deleteByPrimaryKey(id);
		List<String> contentidlist = new ArrayList<String>();
		if (i > 0) {
			// 获取一级菜单下的二级菜单
			List<ManageNursingContentWithBLOBs> mNursingContents = new ArrayList<ManageNursingContentWithBLOBs>();
			ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
			Criteria criteria = mNursingContentExample.createCriteria();
			criteria.andManageNursingContentMaprojectEqualTo(id);
			mNursingContents = mNursingContentService
					.selectByExampleWithBLOBs(mNursingContentExample);

			// 删除二级菜单的图片
			for (int j = 0; j < mNursingContents.size(); j++) {
				// 获取二级菜单的ID
				contentidlist.add(mNursingContents.get(j)
						.getManageNursingContentId());
				String imgurl = mNursingContents.get(j).getContentImgurl();
				if (imgurl != null) {

					String[] imgurls = imgurl.split(",");
					// 得到系统路径
					String webPath2 = request.getSession().getServletContext()
							.getRealPath("");
					String newwebPath2 = webPath.substring(0,
							webPath.length() - 9);
					for (int n = 0; n < imgurls.length; n++) {
						new File(newwebPath2 + imgurls[n]).delete();
					}
				}
			}
			mNursingContentService.deleteByExample(mNursingContentExample);
			// 删除三级菜单
			if (contentidlist.size() > 0) {
				GoodsExample goodsExample = new GoodsExample();
				com.chance.ssm.po.GoodsExample.Criteria criteria2 = goodsExample
						.createCriteria();
				criteria2.andGoodsContentIn(contentidlist);
				goodsService.deleteByExample(goodsExample);
			}

		}
		return "redirect:SelectProjectAll.action";
	}

	// 修改护理服务
	@RequestMapping(value = "/upNursingProject", method = RequestMethod.POST)
	public String upNursingProject() throws Exception {

		return "redirect:/selectNursingProjectById.action";
	}

	// 跳转到添加服务的页面 (带上专业)
	@RequestMapping(value = "/NursingProjectAndMajor", method = RequestMethod.GET)
	public String NursingProjectAndMajor(Model model, HttpSession session,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// 查询所有不重名的专业
		List<Major> list = majorService.selectMajorInfoByName();
		model.addAttribute("list", list);
		return "project-add";
	}

	// 添加一级护理服务内容
	@RequestMapping(value = "/NursingProjectAdd", method = RequestMethod.POST)
	public @ResponseBody
	void NursingProjectAdd(HttpServletResponse response,
			HttpServletRequest request,
			MultipartHttpServletRequest multipartRequest) throws Exception {
		String fileName = null;
		String newfilname = null;
		String finalPath = null;
		String uploadpath = null;
		Calendar c = Calendar.getInstance();
		// 获取上传的文件
		MultipartFile projectpic = multipartRequest.getFile("projectpic");

		String projectName = request.getParameter("contentName");
		//获取专业
//		String projectMajor = request.getParameter("select");

		if (!projectpic.isEmpty()) {
			// 得到文件名
			String uploadfileName = projectpic.getOriginalFilename();
			// 得到文件后缀
			int position = uploadfileName.lastIndexOf(".");
			String suffix = uploadfileName.substring(position);
			// 文件重命名
			fileName = "" + c.get(Calendar.YEAR) + (c.get(Calendar.MONTH) + 1)
					+ c.get(Calendar.DAY_OF_MONTH)
					+ c.get(Calendar.HOUR_OF_DAY) + c.get(Calendar.MINUTE)
					+ c.get(Calendar.SECOND) + suffix;
			uploadpath = request.getSession().getServletContext()
					.getRealPath("/NurseImg"+"/"+"ProjectIcon"+"/");// 上传路径
			File f = new File(uploadpath);
			if (!f.exists()) {
				f.mkdirs();
			}

			// 开始上传
			byte[] bytes = projectpic.getBytes();

			FileOutputStream fos = new FileOutputStream(uploadpath
					+ File.separator + fileName);// 上传到上传路径

			// 获取完整路径加文件名
			newfilname = uploadpath + File.separator + fileName;
			finalPath = newfilname.substring(newfilname.indexOf("nurseDoor"));
			fos.write(bytes);// 写入文件
			fos.flush();
			fos.close();// 关闭IO
		}
		
		//统计数据库中有多少数据
		ManageNursingProjectExample mNursingProjectExample = new ManageNursingProjectExample();
		int countNumber = manageNursingProjectService.countByExample(mNursingProjectExample);
		
		// insertSelective
		ManageNursingProject manageNursingProject = new ManageNursingProject();

		String ProjectId = java.util.UUID.randomUUID().toString()
				.replaceAll("-", "");
		// id
		manageNursingProject.setManageNursingProjectId(ProjectId);
		// 护理服务名
		manageNursingProject.setManageNursingProjectNameId(projectName);
		// 所属专业
		//manageNursingProject.setManageNursingProjectMajor(projectMajor);
		// 图片地址
		manageNursingProject.setManageNursingProjectPic(finalPath);
		// 创建时间
		manageNursingProject.setManageNursingProjectCreatetime(new Date());
		//所在位置
		manageNursingProject.setProjectOrder(countNumber+1);
		// 插入数据库
		manageNursingProjectService.insertSelective(manageNursingProject);

		// 重定向到添加二级服务项页面
		response.sendRedirect("webcontentadd.action?projectid=" + ProjectId);
	}

	// 去一级修改页面
	@RequestMapping(value = "/GotoEdiProject", method = RequestMethod.GET)
	public String GotoEdiProject(Model model, HttpServletRequest request)
			throws Exception {
		String projectid = request.getParameter("projectid");
		// 根据一级列表id查询信息
		ManageNursingProject manageNursingProject = manageNursingProjectService
				.selectByPrimaryKey(projectid);
		String projectName = manageNursingProject
				.getManageNursingProjectNameId();
		String projectMajor = manageNursingProject
				.getManageNursingProjectMajor();
		String projectpic = manageNursingProject.getManageNursingProjectPic();
		// 查询所有不重名的专业
		List<Major> list = majorService.selectMajorInfoByName();
		model.addAttribute("list", list);
		model.addAttribute("projectid", projectid);
		model.addAttribute("projectName", projectName);
		model.addAttribute("projectMajor", projectMajor);
		model.addAttribute("projectpicold", projectpic);
		return "project-edt";
	}

	// 去一级修改页面
	@RequestMapping(value = "/updateProjectInfo", method = RequestMethod.POST)
	public void updateProjectInfo(HttpServletResponse response, Model model,
			HttpServletRequest request,
			MultipartHttpServletRequest multipartRequest) throws Exception {
		String fileName = null;
		String newfilname = null;
		String finalPath = null;
		String uploadpath = null;
		Calendar c = Calendar.getInstance();
		// 获取上传的文件
		MultipartFile projectpic = multipartRequest.getFile("projectpic");

		String projectName = request.getParameter("contentName");
		String projectMajor = request.getParameter("select");
		String projectid = request.getParameter("projectid");
		// 获取旧图片
		String oldprojectpic = request.getParameter("projectpicold");
		if (!projectpic.isEmpty()) {// 吐过不为空说明重新上传了图片
			// 删除旧图片
			String webPath = request.getSession().getServletContext()
					.getRealPath("");
			String newwebPath = webPath.substring(0, webPath.length() - 9);
			new File(newwebPath + oldprojectpic).delete();

			// 得到文件名
			String uploadfileName = projectpic.getOriginalFilename();
			// 得到文件后缀
			int position = uploadfileName.lastIndexOf(".");
			String suffix = uploadfileName.substring(position);
			// 文件重命名
			fileName = "" + c.get(Calendar.YEAR) + (c.get(Calendar.MONTH) + 1)
					+ c.get(Calendar.DAY_OF_MONTH)
					+ c.get(Calendar.HOUR_OF_DAY) + c.get(Calendar.MINUTE)
					+ c.get(Calendar.SECOND) + suffix;
			uploadpath = request.getSession().getServletContext()
					.getRealPath("/NurseImg/ProjectIcon");// 上传路径
			File f = new File(uploadpath);
			if (!f.exists()) {
				f.mkdirs();
			}

			// 开始上传
			byte[] bytes = projectpic.getBytes();

			FileOutputStream fos = new FileOutputStream(uploadpath
					+ File.separator + fileName);// 上传到上传路径

			// 获取完整路径加文件名
			newfilname = uploadpath + File.separator + fileName;
			finalPath = newfilname.substring(newfilname.indexOf("nurseDoor"));
			fos.write(bytes);// 写入文件
			fos.flush();
			fos.close();// 关闭IO
		}
		// insertSelective
		ManageNursingProject manageNursingProject = new ManageNursingProject();
		// id
		manageNursingProject.setManageNursingProjectId(projectid);
		// 护理服务名
		manageNursingProject.setManageNursingProjectNameId(projectName);
		// 所属专业
		manageNursingProject.setManageNursingProjectMajor(projectMajor);
		// 图片地址
		manageNursingProject.setManageNursingProjectPic(finalPath);
		// 创建时间
		manageNursingProject.setManageNursingProjectCreatetime(new Date());

		manageNursingProjectService
				.updateByPrimaryKeySelective(manageNursingProject);

		response.sendRedirect("SelectProjectAll.action");
	}
}
