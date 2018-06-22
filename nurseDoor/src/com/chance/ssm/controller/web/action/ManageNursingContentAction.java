package com.chance.ssm.controller.web.action;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentExample.Criteria;
import com.chance.ssm.po.Major;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.Note;
import com.chance.ssm.po.NoteExample;
import com.chance.ssm.po.Package;
import com.chance.ssm.po.PackageExample;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.ManageNursingContentVO;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.MajorService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.ManageNursingProjectService;
import com.chance.ssm.service.NoteService;
import com.chance.ssm.service.PackageService;
import com.chance.ssm.utils.FileUtil;
import com.chance.ssm.utils.RandomUtil;
import com.chance.ssm.utils.file.FileUpload;

/**
 * 二级后台护理服务项管理控制类
 * 
 * @author Administrator
 * 
 */
@Controller
public class ManageNursingContentAction {

	@Autowired
	private ManageNursingProjectService mNursingProjectService;

	@Autowired
	private ManageNursingContentService mNursingContentService;

	@Autowired
	private PackageService packageService;

	@Autowired
	private NoteService noteService;

	@Autowired
	private GoodsService goodsService;

	@Autowired
	private MajorService majorService;

	@RequestMapping(value = "selectcontentbypage")
	public String SelectContentByPage() {
		return null;

	}
	/**
	 * 二级菜单向下移动一位
	 * 把这条数据的位置和下一条数据的位置进行交换
	 * @param contentid 二级菜单ID
	 * @param order 所在位置
	 * @param projectid 一级菜单ID
	 * @return
	 */
	@RequestMapping(value="contentdownone")
	public String ContentDownOne(String contentid, String order, String projectid){
		Integer orderint = Integer.parseInt(order);
		//统计数据库中有多少条数据
		ManageNursingContentExample mNursingContentExample2 = new ManageNursingContentExample();
		int countNumber = 0;
		try {
			 countNumber = mNursingContentService.countByExample(mNursingContentExample2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(orderint >= countNumber){
			return "redirect:selectcontentall.action?id=" + projectid;
		}else{
			
			try {
				//查询上一位信息
				List<ManageNursingContent> mNursingContents = new ArrayList<ManageNursingContent>();
				ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
				Criteria criteria = mNursingContentExample.createCriteria();
				criteria.andManageNursingContentMaprojectEqualTo(projectid);
				criteria.andContentOrderGreaterThan(orderint);
				mNursingContentExample.setOrderByClause("content_order asc");
				mNursingContents = mNursingContentService.selectByExample(mNursingContentExample);
				
				//获取下一位的排序
				int orderdown = mNursingContents.get(0).getContentOrder();
				//向下移动一位
				ManageNursingContentWithBLOBs mNursingContent = new ManageNursingContentWithBLOBs();
				mNursingContent.setContentOrder(orderdown);
				mNursingContent.setManageNursingContentUpdatetime(new Date());
				mNursingContent.setManageNursingContentId(contentid);
				
				//修改数据库
				int i = mNursingContentService.updateByPrimaryKeySelective(mNursingContent);
				if(i > 0){
					if(mNursingContents.size() > 0){
						ManageNursingContentWithBLOBs mNursingContent2 = new ManageNursingContentWithBLOBs();
						mNursingContent2.setContentOrder(orderint);
						mNursingContent2.setManageNursingContentUpdatetime(new Date());
						mNursingContent2.setManageNursingContentId(mNursingContents.get(0).getManageNursingContentId());
						mNursingContentService.updateByPrimaryKeySelective(mNursingContent2);
					}
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "redirect:selectcontentall.action?id=" + projectid;
		
	}
	
	/**
	 * 二级菜单向上移动一位
	 * 把这条数据和上一条数据的位置进行交换
	 * @param contentid 二级菜单ID
	 * @param order 所在位置
	 * @param projectid 一级菜单ID
	 * @return
	 */
	@RequestMapping(value="contentupwardone")
	public String ContentUpwardOne(String contentid, String order, String projectid){
		Integer orderint = Integer.parseInt(order);
		if(orderint <= 1){
			return "redirect:selectcontentall.action?id=" + projectid;
		}else{
			
			try {
				//查询上一位信息
				List<ManageNursingContent> mNursingContents = new ArrayList<ManageNursingContent>();
				ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
				Criteria criteria = mNursingContentExample.createCriteria();
				criteria.andManageNursingContentMaprojectEqualTo(projectid);
				//content_order < orderint
				criteria.andContentOrderLessThan(orderint);
				mNursingContentExample.setOrderByClause("content_order asc");
				mNursingContents = mNursingContentService.selectByExample(mNursingContentExample);
				
				//获取上一位的排序
				int orderup = mNursingContents.get(mNursingContents.size()-1).getContentOrder();
				//向上移动一位
				ManageNursingContentWithBLOBs mNursingContent = new ManageNursingContentWithBLOBs();
				mNursingContent.setContentOrder(orderup);
				mNursingContent.setManageNursingContentUpdatetime(new Date());
				mNursingContent.setManageNursingContentId(contentid);
				
				//修改数据库
				int i = mNursingContentService.updateByPrimaryKeySelective(mNursingContent);
				if(i > 0){
					if(mNursingContents.size() > 0){
						ManageNursingContentWithBLOBs mNursingContent2 = new ManageNursingContentWithBLOBs();
						mNursingContent2.setContentOrder(orderint);
						mNursingContent2.setManageNursingContentUpdatetime(new Date());
						mNursingContent2.setManageNursingContentId(mNursingContents.get(mNursingContents.size()-1).getManageNursingContentId());
						mNursingContentService.updateByPrimaryKeySelective(mNursingContent2);
					}
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "redirect:selectcontentall.action?id=" + projectid;
		
	}
	
	/**
	 * 根据ID删除数据
	 * 
	 * @param contentid
	 *            二级菜单ID
	 * @param projectid
	 *            一级菜单ID
	 * @return
	 */
	@RequestMapping(value = "delectcontentbyid")
	public String DelectContentById(String contentid, String projectid,
			HttpServletRequest request) {
		int i = 0;
		int j = 0;
		//截取富文本图片的正则表达式
		String pattern = "/ueditor(.*?)((.jpg)|(.jpeg)|(.png)|(.gif)|(.bmp))";
		try {
			
			// 删除服务器图片
			ManageNursingContentWithBLOBs mContentWithBLOBs = mNursingContentService
					.selectByPrimaryKeyBLOB(contentid);
			//获取图片路径
			String imgurl = mContentWithBLOBs.getContentImgurl();
			//获取使用人群富文本内容
			String forpeople = mContentWithBLOBs.getManageNursingContentForpeople();
			//获取注意事项富文本内容 
			String look = mContentWithBLOBs.getManageNursingContentLook();
			
			
			if(forpeople!=null){
				Pattern r = Pattern.compile(pattern);
				
				Matcher m = r.matcher(forpeople);
				while(m.find()){
					// 得到系统路径
					String webPath = request.getSession().getServletContext()
							.getRealPath("");
					File file = new File(webPath + m.group());
					if(file.exists() == true){
						file.delete();
					}
				}
			}
			
			if (look != null) {
				Pattern r2 = Pattern.compile(pattern);
				Matcher m2 = r2.matcher(look);
				while(m2.find()){
					// 得到系统路径
					String webPath = request.getSession().getServletContext()
							.getRealPath("");
					File file = new File(webPath + m2.group());
					if(file.exists() == true){
						file.delete();
					}
				}
			}
			
		

			if (imgurl != null) {
				String[] imgurls = imgurl.split(",");
				// 得到系统路径
				String webPath = request.getSession().getServletContext()
						.getRealPath("");
				String newwebPath = webPath.substring(0, webPath.length() - 9);
				for (int n = 0; n < imgurls.length; n++) {
					new File(newwebPath + imgurls[n]).delete();
				}
			}
			// 删除数据库记录
			i = mNursingContentService.deleteByPrimaryKey(contentid);
			if (i > 0) {
				// 删除三级菜单产品记录
				GoodsExample goodsExample = new GoodsExample();
				com.chance.ssm.po.GoodsExample.Criteria criteria = goodsExample
						.createCriteria();
				criteria.andGoodsContentEqualTo(contentid);
				j = goodsService.deleteByExample(goodsExample);
				
				//根据二级菜单查询套餐
				List<Package> packages = new ArrayList<Package>();
				PackageExample packageExample = new PackageExample();
				com.chance.ssm.po.PackageExample.Criteria criteria2 = packageExample.createCriteria();
				criteria2.andPackageManursingContentEqualTo(contentid);
				packages = packageService.selectByExampleWithBLOBs(packageExample);
				//如果有套餐则删除富文本里面的图片资源
				if(packages.size() > 0){
					//获取富文本内容
					String describe = packages.get(0).getPackage1Describe();
					if(describe!=null){
						Pattern r = Pattern.compile(pattern);
						Matcher m = r.matcher(describe);
						while(m.find()){
							// 得到系统路径
							String webPath = request.getSession().getServletContext()
									.getRealPath("");
							File file = new File(webPath + m.group());
							if(file.exists() == true){
								file.delete();
							}
						}
					}
				}
				//删除数据库记录
				packageService.deleteByExample(packageExample);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i > 0) {

			return "redirect:selectcontentall.action?id=" + projectid;
		} else {
			return "404";
		}

	}

	/**
	 * 套餐修改
	 * 
	 * @param ueditor
	 *            修改数据
	 * @param contentid
	 *            二级菜单ID
	 * @param projectid
	 *            一级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "packageupdate")
	public String packageupdate(String ueditor, String contentid,
			String projectid, Model model)throws Exception {
		int i = 0;
		if (ueditor == null) {
			return "redirect:contentmodify.action?contentid=" + contentid
					+ "&projectid=" + projectid;
		} else {
			//判断有没有添加过套餐
			Package package2 = packageService.selectPackageByContentId(contentid);
			if(package2!=null && !"".equals(package2)){//修改
				Package package1 = new Package();
				package1.setPackage1Describe(ueditor);
				PackageExample packageExample = new PackageExample();
				com.chance.ssm.po.PackageExample.Criteria criteria = packageExample
						.createCriteria();
				criteria.andPackageManursingContentEqualTo(contentid);
					i = packageService.updateByExampleSelective(package1,
							packageExample);
			}else{//插入
				Package package1 = new Package();
				package1.setPackageId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				package1.setPackageManursingContent(contentid);
				package1.setPackage1Describe(ueditor);
				package1.setPackageCreatetime(new Date());
				i = packageService.insertSelective(package1);
			}
		}
		if (i > 0) {
			return "redirect:contentmodify.action?contentid=" + contentid
					+ "&projectid=" + projectid;
		} else {
			return "404";
		}

	}

	/**
	 * 查找需要修改的套餐内容
	 * 
	 * @param contentid
	 *            一级菜单ID
	 * @param projectid
	 *            二级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "packagemodify")
	public String PackageModify(String contentid, String projectid, Model model) {
		Package package1 = new Package();
		List<Package> packages = new ArrayList<Package>();
		PackageExample packageExample = new PackageExample();
		com.chance.ssm.po.PackageExample.Criteria criteria = packageExample
				.createCriteria();
		// 查询套餐的条件
		criteria.andPackageManursingContentEqualTo(contentid);
		try {
			packages = packageService.selectByExampleWithBLOBs(packageExample);

			if (packages.size() > 0) {
				package1 = packages.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("packages", package1);
		model.addAttribute("contentid", contentid);
		model.addAttribute("projectid", projectid);
		return "package-update";

	}

	/**
	 * 修改注意事项
	 * 
	 * @param ueditor
	 *            修改内容
	 * @param contentid
	 *            二级菜单ID
	 * @param projectid
	 *            一级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "attentionsupdate", method = RequestMethod.POST)
	public String AttentionsUpdate(String ueditor, String contentid,
			String projectid, Model model) {
		int i = 0;
		if (ueditor == null) {
			return "redirect:contentmodify.action?contentid=" + contentid
					+ "&projectid=" + projectid;
		} else {
			ManageNursingContentWithBLOBs mNursingContentWithBLOBs = new ManageNursingContentWithBLOBs();
			mNursingContentWithBLOBs.setManageNursingContentLook(ueditor);
			mNursingContentWithBLOBs.setManageNursingContentId(contentid);
			try {
				i = mNursingContentService
						.updateByPrimaryKeySelective(mNursingContentWithBLOBs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return "redirect:contentmodify.action?contentid=" + contentid
					+ "&projectid=" + projectid;
		} else {
			return "404";
		}

	}

	/**
	 * 查找需要修改的注意事项的信息
	 * 
	 * @param contentid
	 *            二级菜单ID
	 * @param projectid
	 *            一级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "attentionsmodify")
	public String AttentionsModify(String contentid, String projectid,
			Model model) {
		ManageNursingContentWithBLOBs mNursingContentWithBLOBs = new ManageNursingContentWithBLOBs();

		try {
			mNursingContentWithBLOBs = mNursingContentService
					.selectByPrimaryKeyBLOB(contentid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("mNursingContentWithBLOBs", mNursingContentWithBLOBs);
		model.addAttribute("contentid", contentid);
		model.addAttribute("projectid", projectid);
		return "attentions-update";

	}

	/**
	 * 修改适用人群
	 * 
	 * @param contentid
	 *            二级菜单ID
	 * @param projectid
	 *            一级菜单ID ueditor 修改内容
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "peopleupdate", method = RequestMethod.POST)
	public String PeopleUpdate(String ueditor, String contentid,
			String projectid, Model model) {
		int i = 0;
		if (ueditor == null) {
			return "redirect:contentmodify.action?contentid=" + contentid
					+ "&projectid=" + projectid;
		} else {
			ManageNursingContentWithBLOBs mNursingContentWithBLOBs = new ManageNursingContentWithBLOBs();
			mNursingContentWithBLOBs.setManageNursingContentForpeople(ueditor);
			mNursingContentWithBLOBs.setManageNursingContentId(contentid);
			try {
				i = mNursingContentService
						.updateByPrimaryKeySelective(mNursingContentWithBLOBs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return "redirect:contentmodify.action?contentid=" + contentid
					+ "&projectid=" + projectid;
		} else {
			return "404";
		}

	}

	/**
	 * 查询需要修改的适用人群信息
	 * 
	 * @param contentid
	 *            二级菜单ID
	 * @param projectid
	 *            一级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "peoplemodify")
	public String PeopleModify(String contentid, String projectid, Model model) {
		// 查询需要修改的适用人群信息
		ManageNursingContentWithBLOBs mNursingContentWithBLOBs = new ManageNursingContentWithBLOBs();
		// ManageNursingContentExample mNursingContentExample = new
		// ManageNursingContentExample();
		// Criteria criteria = mNursingContentExample.createCriteria();
		try {
			mNursingContentWithBLOBs = mNursingContentService
					.selectByPrimaryKeyBLOB(contentid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("mNursingContentWithBLOBs", mNursingContentWithBLOBs);
		model.addAttribute("contentid", contentid);
		model.addAttribute("projectid", projectid);
		return "people-update";
	}

	/**
	 * 修改数据
	 * 
	 * @param contentName
	 *            服务名称
	 * 
	 * @param projectid
	 *            所属分类
	 * @param required
	 *            是否必选
	 * @param contentInfo
	 *            服务内容
	 * @param contentMoney
	 *            该项护理费用
	 * @param suppliesMoney
	 *            护理耗材费用
	 * @param imgurl
	 *            图片上传
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "contentupdate", method = RequestMethod.POST)
	public String PeopleModeify(String contentName, String contentid,
			String projectid,
			// String required,
			String contentInfo,
			// String contentMoney, String suppliesMoney,
			Model model, HttpServletRequest request, HttpSession session) {
		int i = 0;

		// 获取session中的值
		String imgurl = (String) session.getAttribute("imgurl");
		// 清空session
		session.removeAttribute("imgurl");

		// 获取复选按钮的值
		String noteid = "";

		String[] noteidlist = request.getParameterValues("noteid");
		if (noteidlist != null) {
			for (int j = 0; j < noteidlist.length; j++) {
				noteid += noteidlist[j] + ",";
			}
			// 去除字符串最后一个逗号
			noteid = noteid.substring(0, noteid.length() - 1);
		}

		// 将数据保存到实体类中

		ManageNursingContentWithBLOBs mNursingContent = new ManageNursingContentWithBLOBs();

		if (contentName != null && !"".equals(contentName)) {
			mNursingContent.setManageNursingContentName(contentName);
		}
		if (contentInfo != null && !"".equals(contentInfo)) {
			mNursingContent.setManageNursingContentContent(contentInfo);
		}
		if (noteid != null && !"".equals(noteid)) {
			mNursingContent.setContentNote(noteid);
		}
		// if (!"".equals(contentMoney) || contentMoney != null) {
		// mNursingContent.setManageNursingContentCost(new BigDecimal(
		// contentMoney));
		// }
		// if (suppliesMoney != null || !("".equals(suppliesMoney))) {
		// mNursingContent.setManageNursingContentSupplies(new BigDecimal(
		// suppliesMoney));
		// }
		// if ("on".equals(required)) {
		// mNursingContent.setContentRequired(1);
		// } else if (required == null) {
		// mNursingContent.setContentRequired(0);
		// }
		if (imgurl != null) {
			mNursingContent.setContentImgurl(imgurl);
		}
		mNursingContent.setManageNursingContentUpdatetime(new Date());

		ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
		Criteria criteria = mNursingContentExample.createCriteria();
		criteria.andManageNursingContentIdEqualTo(contentid);

		try {
			i = mNursingContentService.updateByExampleSelective(
					mNursingContent, mNursingContentExample);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (i > 0) {
			return "redirect:selectcontentall.action?id=" + projectid;
		} else {
			return "404";
		}

	}

	/**
	 * 查询要修改数据的信息
	 * 
	 * @param contentid
	 *            服务ID（二级菜单）
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "contentmodify")
	public String ContentModify(String contentid, String projectid, Model model) {
		try {
			// 查询二级菜单信息
			ManageNursingContentWithBLOBs manageNursingContentWithBLOBs = new ManageNursingContentWithBLOBs();
			manageNursingContentWithBLOBs = mNursingContentService
					.selectByPrimaryKeyBLOB(contentid);
			// 把查询的数据添加到model中
			model.addAttribute("manageNursingContentWithBLOBs",
					manageNursingContentWithBLOBs);
			// 截取可以使用的备注ID
			String[] noteid = null;
			if (manageNursingContentWithBLOBs != null) {
				if (manageNursingContentWithBLOBs.getContentNote() != null) {
					noteid = manageNursingContentWithBLOBs.getContentNote()
							.split(",");
				}
			}
			List<String> noteidList = new ArrayList<String>();
			for (int i = 0; i < noteid.length; i++) {
				noteidList.add(noteid[i]);
			}

			// 根据得到的备注ID查询备注
			List<Note> notes = new ArrayList<Note>();
			NoteExample noteExample = new NoteExample();
			// com.chance.ssm.po.NoteExample.Criteria criteria = noteExample
			// .createCriteria();
			// criteria.andNoteIdIn(noteidList);
			notes = noteService.selectByExample(noteExample);

			// 查询套餐
			List<Package> packages = new ArrayList<Package>();
			PackageExample packageExample = new PackageExample();
			com.chance.ssm.po.PackageExample.Criteria criteria2 = packageExample
					.createCriteria();
			criteria2.andPackageManursingContentEqualTo(contentid);
			packages = packageService.selectByExampleWithBLOBs(packageExample);

			for (int i = 0; i < packages.size(); i++) {
			}

			model.addAttribute("packages", packages);

			model.addAttribute("notes", notes);

			model.addAttribute("id", projectid);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "content-update";

	}

	/**
	 * 查询所有的护理服务
	 * 
	 * @return
	 */
	@RequestMapping(value = "selectcontentall")
	public String SelectContentAll(String id, Model model,
			HttpServletRequest request) {

		try {
			// 查询所有一级菜单下的二级菜单
			List<ManageNursingContentVO> mNursingContents = new ArrayList<ManageNursingContentVO>();
			ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
			Criteria criteria = mNursingContentExample.createCriteria();
			criteria.andManageNursingContentMaprojectEqualTo(id);
			mNursingContentExample.setOrderByClause("content_order asc,manage_nursing_content_updatetime desc, manage_nursing_content_createtime desc");
			mNursingContents = mNursingContentService
					.selectByExampleRuVO(mNursingContentExample);
			
			model.addAttribute("id", id);
			model.addAttribute("list", mNursingContents);
			model.addAttribute("count", mNursingContents.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "content-list";

	}

	/**
	 * 根据ID查询二级菜单信息
	 * 
	 * @param contentid
	 *            二级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "selectcontentbyid")
	public String SelectContentById(String contentId, Model model) {
		// 查询二级菜单信息
		ManageNursingContentWithBLOBs manageNursingContentWithBLOBs = new ManageNursingContentWithBLOBs();
		try {
			manageNursingContentWithBLOBs = mNursingContentService
					.selectByPrimaryKeyBLOB(contentId);
			// 截取可以使用的备注ID
			String[] noteid = null;
			if(manageNursingContentWithBLOBs!=null){
			if (manageNursingContentWithBLOBs.getContentNote() != null) {
				noteid = manageNursingContentWithBLOBs.getContentNote().split(
						",");
			}
			}
			List<String> noteidList = new ArrayList<String>();
			for (int i = 0; i < noteid.length; i++) {
				noteidList.add(noteid[i]);
			}
			model.addAttribute("manageNursingContent",
					manageNursingContentWithBLOBs);
			// 根据得到的备注ID查询备注
			List<Note> notes = new ArrayList<Note>();
			NoteExample noteExample = new NoteExample();
			com.chance.ssm.po.NoteExample.Criteria criteria = noteExample
					.createCriteria();
			criteria.andNoteIdIn(noteidList);
			notes = noteService.selectByExample(noteExample);

			// 查询套餐
			List<Package> packages = new ArrayList<Package>();
			PackageExample packageExample = new PackageExample();
			com.chance.ssm.po.PackageExample.Criteria criteria2 = packageExample
					.createCriteria();
			criteria2.andPackageManursingContentEqualTo(contentId);
			packages = packageService.selectByExampleWithBLOBs(packageExample);


			model.addAttribute("packages", packages);

			model.addAttribute("notes", notes);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "content-info";

	}

	/**
	 * 添加服务内容
	 * 
	 * @param contentName
	 *            服务名称
	 * 
	 * @param projectid
	 *            所属分类
	 * @param required
	 *            是否必选
	 * @param contentInfo
	 *            服务内容
	 * @param contentMoney
	 *            该项护理费用
	 * @param suppliesMoney
	 *            护理耗材费用
	 * @param imgurl
	 *            图片上传
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "webaddcontent", method = RequestMethod.POST)
	public String WebAddContent(String contentName, String projectid,// String
																		// required,
			String contentInfo, // String contentMoney, String suppliesMoney,
			Model model, HttpServletRequest request, HttpSession session) {
		int i = 0;
		String contentid = null;

		String imgurl = (String) session.getAttribute("imgurl");
		session.removeAttribute("imgurl");
		// 获取复选按钮的值
		String noteid = "";
		String[] noteidlist = request.getParameterValues("noteid");
		String major = request.getParameter("select");
		if (noteidlist != null) {
			for (int j = 0; j < noteidlist.length; j++) {
				noteid += noteidlist[j] + ",";
			}
			// 去除字符串最后一个逗号
			noteid = noteid.substring(0, noteid.length() - 1);
		}
		// // 根据服务ID查询专业
		ManageNursingProject mNursingProject = new ManageNursingProject();
		try {
			mNursingProject = mNursingProjectService
					.selectByPrimaryKey(projectid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//统计数据库中有多少数据
		int countNumber = 0;
		ManageNursingContentExample mExample = new ManageNursingContentExample();
		try {
			 countNumber = mNursingContentService.countByExample(mExample);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 将数据保存到实体类中
		contentid = java.util.UUID.randomUUID().toString().replaceAll("-", "");
		ManageNursingContentWithBLOBs mNursingContent = new ManageNursingContentWithBLOBs();
		mNursingContent.setManageNursingContentId(contentid);
		mNursingContent.setManageNursingContentMaproject(projectid);
		// mNursingContent.setManageNursingContentMajor(mNursingProject
		// .getManageNursingProjectMajor());major
		mNursingContent.setManageNursingContentMajor(major);
		mNursingContent.setManageNursingContentName(contentName);
		mNursingContent.setManageNursingContentContent(contentInfo);
		mNursingContent.setContentNote(noteid);
		// if (!"".equals(contentMoney) && contentMoney != null) {
		// mNursingContent.setManageNursingContentCost(new BigDecimal(
		// contentMoney));
		// }
		// if (suppliesMoney != null && !("".equals(suppliesMoney))) {
		// mNursingContent.setManageNursingContentSupplies(new BigDecimal(
		// suppliesMoney));
		// }
		// if ("on".equals(required)) {
		// mNursingContent.setContentRequired(1);
		// } else if (required == null) {
		// mNursingContent.setContentRequired(0);
		// }
		mNursingContent.setContentImgurl(imgurl);
		mNursingContent.setManageNursingContentCreatetime(new Date());
		mNursingContent.setContentOrder(countNumber+1);
		// mNursingContent.setManageNursingContentCreateter(session.getAttribute("username").toString());

		try {
			i = mNursingContentService.insertSelective(mNursingContent);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		session.setAttribute("projectid", projectid);
		session.setAttribute("contentid", contentid);
		model.addAttribute("projectid", projectid);
		model.addAttribute("contentid", contentid);
		if (i > 0) {
			return "people-add";
		} else {
			return "404";
		}

	}

	/**
	 * 添加使用人群
	 * 
	 * @param ueditor
	 *            富文本编辑内容
	 * @param contentid
	 *            服务ID
	 * @return
	 */
	@RequestMapping(value = "webaddpeople", method = RequestMethod.POST)
	public String webaddpeople(String ueditor, String contentid,
			String projectid, Model model) {
		int i = 0;
		ManageNursingContentWithBLOBs mContentWithBLOBs = new ManageNursingContentWithBLOBs();
		if (ueditor == null) {
			return "attentions";
		} else {
			mContentWithBLOBs.setManageNursingContentForpeople(ueditor);
			ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
			Criteria criteria = mNursingContentExample.createCriteria();

			criteria.andManageNursingContentIdEqualTo(contentid);

			try {
				i = mNursingContentService.updateByExampleSelective(
						mContentWithBLOBs, mNursingContentExample);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("projectid", projectid);
			model.addAttribute("contentid", contentid);
			if (i > 0) {
				return "attentions";
			} else {
				return "404";
			}
		}

	}

	/**
	 * 添加注意事项
	 * 
	 * @param ueditor
	 *            富文本编辑内容
	 * @param contentid
	 *            服务ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "webaddattentions", method = RequestMethod.POST)
	public String WebAddAttentions(String ueditor, String contentid,
			String projectid, Model model) {
		int i = 0;
		ManageNursingContentWithBLOBs mContentWithBLOBs = new ManageNursingContentWithBLOBs();

		if (ueditor == null) {
			return "package-add";
		} else {
			mContentWithBLOBs.setManageNursingContentLook(ueditor);

			ManageNursingContentExample mNursingContentExample = new ManageNursingContentExample();
			Criteria criteria = mNursingContentExample.createCriteria();
			criteria.andManageNursingContentIdEqualTo(contentid);

			try {
				i = mNursingContentService.updateByExampleSelective(
						mContentWithBLOBs, mNursingContentExample);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("projectid", projectid);
			model.addAttribute("contentid", contentid);
			if (i > 0) {
				return "package-add";
			} else {
				return "404";
			}
		}

	}

	/**
	 * 添加套餐
	 * 
	 * @param ueditor
	 *            富文本编辑内容
	 * @param contentid
	 *            服务ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "webaddpackage", method = RequestMethod.POST)
	public String WebAddPackage(String ueditor, String contentid,
			String projectid, Model model) {

		if (ueditor == null) {
			return "redirect:selectcontentall.action?id=" + projectid;
		} else {

			Package package1 = new Package();
			package1.setPackageId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
			package1.setPackageManursingContent(contentid);
			package1.setPackage1Describe(ueditor);
			package1.setPackageCreatetime(new Date());
			int i = 0;
			try {
				i = packageService.insertSelective(package1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i > 0) {
				return "redirect:selectcontentall.action?id=" + projectid;
			} else {
				return "404";
			}
		}

	}

	/**
	 * 跳转到二级菜单添加页面
	 * 
	 * @param projectid
	 *            一级菜单ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "webcontentadd", method = RequestMethod.GET)
	public String WebContentAdd(String projectid, Model model) throws Exception {
		if (projectid != null) {
			model.addAttribute("projectid", projectid);
		}
		// 查询所有的备注信息
		List<Note> notes = new ArrayList<Note>();
		NoteExample noteExample = new NoteExample();

		// 查询所有不重名的专业
		List<Major> list = majorService.selectMajorInfoByName();

		try {
			notes = noteService.selectByExample(noteExample);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("list", list);
		model.addAttribute("notes", notes);
		return "content-add";

	}

}
