package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.math.BigDecimal;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.chance.ssm.po.GoodServiceRecommend;
import com.chance.ssm.po.GoodServiceRecommendExample;
import com.chance.ssm.po.InterestRate;
import com.chance.ssm.po.InterestRateExample;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.ManageNursingProjectExample;
import com.chance.ssm.po.PostRollPic;
import com.chance.ssm.po.PostRollPicExample;
import com.chance.ssm.po.Save;
import com.chance.ssm.po.SaveExample;
import com.chance.ssm.po.Traffic;
import com.chance.ssm.po.ManageNursingContentExample.Criteria;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.RollPic;
import com.chance.ssm.po.TrafficExample;
import com.chance.ssm.service.InterestRateService;
import com.chance.ssm.service.KhdManageService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.PostService;
import com.chance.ssm.service.SaveService;
import com.chance.ssm.utils.RandomUtil;
import com.chance.ssm.utils.file.FileUpload;

//客户端控制器(轮播、精品服务推荐)
@Controller
public class khdAction {
	
	@Autowired
	private KhdManageService khdManageService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private SaveService saveService;
	
	@Autowired
	private InterestRateService interestRateService;
	
	@Autowired
	private PostService postService;

	//查询所有轮播图
	@RequestMapping(value="/roolPicLook", method = RequestMethod.GET) 
	 public String roolPicLook(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		List<RollPic> list = khdManageService.selectAllRollPic();
		
		model.addAttribute("count", list.size());
		
		model.addAttribute("list", list);
		
		return "khd-rollpic";
	}
	//上传轮播图
	 @RequestMapping(value="/roolPicUpdload", method = RequestMethod.POST) 
	 public String roolPicUpdload(Model model,HttpServletRequest request,HttpServletResponse response,MultipartRequest multipartRequest)throws Exception{
		 	//服务信息图片
			String webpath = request.getSession().getServletContext().getRealPath("");
			String uploadpath = webpath+"/NurseImg/RollPic/";//上传路径
			String fileName = null;
			
			//获取服务ID
			String contentId = request.getParameter("brandclass");
			//获取链接
			String hrefUrl = request.getParameter("hrefUrl");
			
			// 原始名称
			List<MultipartFile> pic = multipartRequest.getFiles("pics");
			String picth = "";
			String newpath = "";
			for (int i = 0; i < pic.size(); i++) {
				String originalFilename = pic.get(i).getOriginalFilename();
				if(null == originalFilename || "".equals(originalFilename)){
					continue;
				}
				// 新的图片名称
				String newFileName =RandomUtil.generateNumber2() 
						+ originalFilename.substring(originalFilename
								.lastIndexOf("."));
				// 新图片
				java.io.File newFile = new java.io.File(uploadpath + newFileName);
				fileName = newFileName;
				newpath = "nurseDoor/NurseImg/RollPic/"+fileName;
				// 将内存中的数据写入磁盘
				pic.get(i).transferTo(newFile);
				if (i == 0) {
					picth = newpath;
				} else {
					picth = picth + "," + newpath;
				}
			}
		 List<RollPic> list = khdManageService.selectAllRollPic();	
		 RollPic rollPic = new RollPic();
		 rollPic.setRollPicId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
		 rollPic.setRollPicUrl(picth);
		 if(contentId!=null && !"".equals(contentId)){//如果两个都填,只setId
			 rollPic.setRollPicAddress(contentId);
		 }else{
			 rollPic.setRollPicNote(hrefUrl);
		 }
		 //得到List最大的那个排名加一
		 Integer count = 0;
		 if(list.size()>0){
			 count =  Integer.parseInt(list.get(list.size()-1).getRollPicSpeak())+1;
		 }
		 
		 rollPic.setRollPicSpeak(count.toString());
		 rollPic.setRollPicCreatetime(new Date());
		 int i = khdManageService.insertSelective(rollPic);
			if(i==0){
				return "404";
			}else{
				 return "redirect:roolPicLook.action";
			}
	 }
	 
	 /**
		 * //上移轮播图
		 * @param rollPicId 当前ID
		 * @param order 当前排名
		 * @param index 当前索引
		 * @return
		 */
		@RequestMapping(value="RollPicupwardone")
		public String RollPicupwardone(String rollPicId, String order,String index)throws Exception{
			Integer rollindex = Integer.parseInt(index);
			//查询当前上一位的排名
			List<RollPic> list = khdManageService.selectAllRollPic();
			String rank = "";//上一位排名
			String rollIdBrfore = "";//上一位ID
			if(list.size()>0){
				rank = list.get(rollindex-1).getRollPicSpeak();
				rollIdBrfore = list.get(rollindex-1).getRollPicId();
			}
			//相互交换
			RollPic rollPic1 = new RollPic();
			rollPic1.setRollPicId(rollPicId);
			rollPic1.setRollPicSpeak(rank);
			int i = khdManageService.updateByPrimaryKeySelective(rollPic1);
			
			RollPic rollPic2 = new RollPic();
			rollPic2.setRollPicId(rollIdBrfore);
			rollPic2.setRollPicSpeak(order);
			int c = khdManageService.updateByPrimaryKeySelective(rollPic2);
			
			if(i==0 || c==0){
				return "404";
			}
			
			return "redirect:roolPicLook.action";
			
		}
		
		 /**
		 * //上移精品服务
		 * @param rollPicId 当前ID
		 * @param order 当前排名
		 * @param index 当前索引
		 * @return
		 */
		@RequestMapping(value="GoodServiceupwardone")
		public String GoodServiceupwardone(String goodId, String order,String index)throws Exception{
			Integer rollindex = Integer.parseInt(index);
			//查询当前上一位的排名
			GoodServiceRecommendExample example = new GoodServiceRecommendExample();
			example.setOrderByClause("good_service_recommend_speak ASC ");
			List<GoodServiceRecommend> list = khdManageService.selectByExample(example);
			String rank = "";//上一位排名
			String goodIdBrfore = "";//上一位ID
			if(list.size()>0){
				rank = list.get(rollindex-1).getGoodServiceRecommendSpeak();
				goodIdBrfore = list.get(rollindex-1).getGoodServiceRecommendId();
			}
			//相互交换
			GoodServiceRecommend serviceRecommend1 = new GoodServiceRecommend();
			serviceRecommend1.setGoodServiceRecommendId(goodId);
			serviceRecommend1.setGoodServiceRecommendSpeak(rank);
			int i = khdManageService.updateByPrimaryKeySelectiveGoodService(serviceRecommend1);
			
			GoodServiceRecommend serviceRecommend2 = new GoodServiceRecommend();
			serviceRecommend2.setGoodServiceRecommendId(goodIdBrfore);
			serviceRecommend2.setGoodServiceRecommendSpeak(order);
			int c = khdManageService.updateByPrimaryKeySelectiveGoodService(serviceRecommend2);
			
			if(i==0 || c==0){
				return "404";
			}
			
			return "redirect:goodServiceRecommendLook.action";
			
		}
		
		
	//删除学术圈轮播图
	 @RequestMapping(value="/roolPicdel", method = RequestMethod.GET) 
	 public String roolPicdel(Model model,HttpServletRequest request,HttpServletResponse response,String rollPicId )throws Exception{
		 	//服务信息图片
		 if(rollPicId==null || "".equals(rollPicId)){
			 return "404";
		 }
		 int i = khdManageService.deletePostEollpicByPrimaryKey(rollPicId);
		 if(i==0){
				return "404";
			}else{
				int rank = 1;
				PostRollPicExample postRollPicExample = new PostRollPicExample();
				postRollPicExample.setOrderByClause("post_roll_pic_rank asc");
				List<PostRollPic> list = postService.selectpostrollpicByExample(postRollPicExample);
				//重新排名
				for (PostRollPic postRollPic : list) {
					PostRollPic rollPic = new PostRollPic();
					rollPic.setPostRollPicId(postRollPic.getPostRollPicId());
					rollPic.setPostRollPicRank(String.valueOf(rank));
					postService.updatePostRollPicByPrimaryKeySelective(rollPic);
					rank++;
				}
				 return "redirect:PostroolPicLook.action";
			}
	 }
	 
	//删除首页轮播图
		 @RequestMapping(value="/khdroolPicdel", method = RequestMethod.GET) 
		 public String khdroolPicdel(Model model,HttpServletRequest request,HttpServletResponse response,String rollPicId )throws Exception{
			 	//服务信息图片
			 if(rollPicId==null || "".equals(rollPicId)){
				 return "404";
			 }
			 int i = khdManageService.deleteByPrimaryKey(rollPicId);
			 if(i==0){
					return "404";
				}else{
					//将轮播图的排名重新排序
					int rank = 1;
				    List<RollPic> list =khdManageService.selectAllRollPic();
				    for (RollPic rollPic : list) {
				    	RollPic pic = new RollPic();
				    	pic.setRollPicId(rollPic.getRollPicId());
				    	pic.setRollPicSpeak(String.valueOf(rank));
				    	khdManageService.updateByPrimaryKeySelective(pic);
				    	rank++;
					}
					 return "redirect:roolPicLook.action";
				}
		 }
	//查看所有精品服务推荐
	 @RequestMapping(value="/goodServiceRecommendLook", method = RequestMethod.GET) 
	 public String goodServiceRecommendLook(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		GoodServiceRecommendExample example = new GoodServiceRecommendExample();
		example.setOrderByClause("good_service_recommend_speak ASC ");
		List<GoodServiceRecommend> list = khdManageService.selectByExample(example);
		model.addAttribute("list", list);
		return "khd-goodservice";
	 }
	 //修改精品服务的图片
	 @RequestMapping(value="/updateGoodServicePic", method = RequestMethod.POST) 
	 public String updateGoodServicePic(Model model,HttpServletRequest request,HttpServletResponse response,MultipartFile pics)throws Exception{
		 String goodId = request.getParameter("goodId");
		 //得到图片
		 FileUpload fileUpload = new FileUpload();
		 String pic = fileUpload.uploadIcon(request, pics, "GoodServicePic");
		 GoodServiceRecommend serviceRecommend1 = new GoodServiceRecommend();
		 serviceRecommend1.setGoodServiceRecommendId(goodId);
		 serviceRecommend1.setGoodServiceRecommendContentPic(pic);
		 khdManageService.updateByPrimaryKeySelectiveGoodService(serviceRecommend1);
		 model.addAttribute("state", 1);
		 return "khd-goodservice-picadd";
	 }
	 
	 
	 
	 //查询所有二级服务
	 @RequestMapping(value="/AllContentServiceLook", method = RequestMethod.GET) 
	 public String AllContentServiceLook(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		List<ManageNursingContentWithBLOBs> listnew = new ArrayList<ManageNursingContentWithBLOBs>();
		ManageNursingContentExample example = new ManageNursingContentExample();
		//Criteria criteria = example.createCriteria();
		//查询所有二级服务
		List<ManageNursingContentWithBLOBs> list = manageNursingContentService.selectByExampleWithBLOBs(example);
		//查询已经加精的服务
		GoodServiceRecommendExample example1 = new GoodServiceRecommendExample();
		List<GoodServiceRecommend> list1 = khdManageService.selectByExample(example1);
		
		if(list1.size()==0){
			model.addAttribute("list", list);
			return "khd-goodservice-add";
		}
			for (int i = 0; i < list.size(); i++) {// 遍历list1  
				ManageNursingContentWithBLOBs bloBs = list.get(i);
				String ManageNursingContentId = list.get(i).getManageNursingContentId();
			    boolean isExist = false;  
			    for (int j = 0; j < list1.size(); j++) {  
			    	String GoodServiceRecommendContentId= list1.get(j).getGoodServiceRecommendContentId();
			     if (ManageNursingContentId.equals(GoodServiceRecommendContentId)) {  
			      isExist = true;// 找到相同项，跳出本层循环  
			      break;  
			     }  
			    }  
			    if (!isExist) {// 不相同，加入list3中  
			    	listnew.add(bloBs);  
			    }  
			}
			
			model.addAttribute("list", listnew);
		return "khd-goodservice-add";
	 }
	 //获取选中的精品服务添加到服务器
	 @RequestMapping(value="/AllContentServiceCheckk", method = RequestMethod.POST) 
	 public String AllContentServiceCheckk(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		String[] name = request.getParameterValues("checkbox");
		
		GoodServiceRecommendExample example = new GoodServiceRecommendExample();
		example.setOrderByClause("good_service_recommend_speak ASC ");
		List<GoodServiceRecommend> list = khdManageService.selectByExample(example);
		//得到最大的排名
		String rank = list.get(list.size()-1).getGoodServiceRecommendSpeak();
		int ran = Integer.parseInt(rank);
		//得到原先的精品服务
		//图片
		String imageUrl = "";
		GoodServiceRecommend goodServiceRecommend = new GoodServiceRecommend();
		for (int i = 0; i < name.length; i++) {
			//根据二级服务id查询服务内容
			ManageNursingContentWithBLOBs bloBs=manageNursingContentService.selectByPrimaryKeyBLOB(name[i]);
			if(bloBs!=null && !"".equals(bloBs)){
				//得到服务项的第一张图片
				String pic = bloBs.getContentImgurl();
				if(pic!=null && !"".equals(pic)){
					String[] pics = pic.split(",");
					for (int j = 0; j < pics.length; j++) {
						imageUrl = pics[1];
					}
				}	
					//转换斜杠
					String imageUrls = imageUrl.replaceAll("\\\\", "/");
					
					goodServiceRecommend.setGoodServiceRecommendId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					goodServiceRecommend.setGoodServiceRecommendContentId(bloBs.getManageNursingContentId());
					goodServiceRecommend.setGoodServiceRecommendNote(bloBs.getManageNursingContentName());
					goodServiceRecommend.setGoodServiceRecommendContentPic(imageUrls);
					goodServiceRecommend.setGoodServiceRecommendSpeak(String.valueOf(ran+1));
					goodServiceRecommend.setGoodServiceRecommendCreatetime(new Date());
					int c = khdManageService.insertSelectiveGoodServiceRecommend(goodServiceRecommend);
					if(c==0){
						return "404";
					}
			}
			ran++;
		}
		return "redirect:goodServiceRecommendLook.action";
	 }
	 //删除精品服务项
	 @RequestMapping(value="/ContentServicedel", method = RequestMethod.GET) 
	 public String ContentServicedel(Model model,HttpServletRequest request,HttpServletResponse response,String goodServiceRecommendId)throws Exception{
		if(goodServiceRecommendId==null || "".equals(goodServiceRecommendId)){
			return "404";
		}
		int i = khdManageService.deleteByPrimaryKeyGoodService(goodServiceRecommendId);
		if(i==0){
			return "404";
		}
		//重新排名
		int rank  = 1;
		GoodServiceRecommendExample example = new GoodServiceRecommendExample();
		example.setOrderByClause("good_service_recommend_speak ASC ");
		List<GoodServiceRecommend> list = khdManageService.selectByExample(example);
		for (GoodServiceRecommend goodServiceRecommend : list) {
			GoodServiceRecommend recommend = new GoodServiceRecommend();
			recommend.setGoodServiceRecommendId(goodServiceRecommend.getGoodServiceRecommendId());
			recommend.setGoodServiceRecommendSpeak(String.valueOf(rank));
			khdManageService.updateByPrimaryKeySelectiveGoodService(recommend);
			rank++;
		}
		return "redirect:goodServiceRecommendLook.action";
	 }
	 //查询所有二级服务返回到轮播管理页面
	 @RequestMapping(value="/goBackdRollpicadd", method = RequestMethod.GET) 
	 public String goBackdRollpicadd(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		ManageNursingContentExample example = new ManageNursingContentExample();
		//Criteria criteria = example.createCriteria();
		//查询所有二级服务
		List<ManageNursingContentWithBLOBs> list = manageNursingContentService.selectByExampleWithBLOBs(example);
		model.addAttribute("list", list);
		return "khd-rollpic-add";
	 }
	 //查询交通费
	 @RequestMapping(value="/selectcostTraffic", method = RequestMethod.GET) 
	 public String selectcostTraffic(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		// 查询交通费
		Traffic traffic = new Traffic();
		traffic = orderSendService.SelectTrafficInfo();
		BigDecimal costTraffic = BigDecimal.ZERO;
		if(traffic != null){
			costTraffic = traffic.getTrafficCost();
		}
		model.addAttribute("costtraffic", costTraffic);
		return "cost-traffic";
	 }
	 
	 //查询保险费
	 @RequestMapping(value="/seletecostSace", method = RequestMethod.GET) 
	 public String seletecostSace(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		// 查询保险信息
		SaveExample sExample = new SaveExample();
		List<Save> sList = new ArrayList<Save>();
		sList = saveService.selectByExample(sExample);
		BigDecimal costSace = BigDecimal.ZERO;
		String costInfo = "";
		if(sList.size()>0){
			costSace = sList.get(0).getSaveCost();
			costInfo = sList.get(0).getSaveInfo();
		}
		model.addAttribute("costSace", costSace);
		model.addAttribute("costInfo", costInfo);
		return "cost-save";
	 }
	 
	 //查询利率
	 @RequestMapping(value="/selectinterest", method = RequestMethod.GET) 
	 public String selectinterest(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		 InterestRateExample example = new InterestRateExample();
		 List<InterestRate> interestRates = interestRateService.selectByExample(example);
		 BigDecimal costInterest = BigDecimal.ZERO;
		 if(interestRates.size()>0){
			 costInterest = interestRates.get(0).getInterestRateSize().multiply(new BigDecimal(100));
		 }
		 model.addAttribute("costInterest", costInterest);
		 return "cost-interest";
	 }
	 
	 //修改交通费
	 @RequestMapping(value="/updatecostTraffic", method = RequestMethod.POST) 
	 public void updatecostTraffic(Model model,HttpServletRequest request,HttpServletResponse response,BigDecimal costTraffic)throws Exception{
		 	// 查询交通费
			Traffic traffic = new Traffic();
			traffic = orderSendService.SelectTrafficInfo();
			
			if(traffic == null || "".equals(traffic)){//没有设置过
				Traffic traffic1 = new Traffic();
				traffic1.setTrafficId(UUID.randomUUID().toString().replaceAll("-", ""));
				traffic1.setTrafficCost(costTraffic);
				traffic1.setTrafficUpdatetime(new Date());
				saveService.insertSelective(traffic1);
			}else{
				TrafficExample example = new TrafficExample();
				com.chance.ssm.po.TrafficExample.Criteria criteria = example.createCriteria();
				Traffic traffic1 = new Traffic();
				traffic1.setTrafficCost(costTraffic);
				criteria.andTrafficIdEqualTo(traffic.getTrafficId());
				saveService.updateByExampleSelective(traffic1, example);
			}
			PrintWriter out = response.getWriter();
			out.print(0);
			
		 
	 }
	 
	 //修改保险费
	 @RequestMapping(value="/updatecostSace", method = RequestMethod.POST) 
	 public void updatecostSace(Model model,HttpServletRequest request,HttpServletResponse response,BigDecimal costSace,String costSaceInfo)throws Exception{
		// 查询保险信息
			SaveExample sExample = new SaveExample();
			List<Save> sList = new ArrayList<Save>();
			sList = saveService.selectByExample(sExample);
			if (sList.size() > 0) {
				//修改
				SaveExample example = new SaveExample();
				com.chance.ssm.po.SaveExample.Criteria criteria = example.createCriteria();
				Save save = new Save();
				save.setSaveCost(costSace);
				save.setSaveInfo(costSaceInfo);
				criteria.andSaveIdEqualTo(sList.get(0).getSaveId());
				saveService.updateSaveByExampleSelective(save, example);
			}else{
				//添加
				Save save = new Save();
				save.setSaveId(UUID.randomUUID().toString().replaceAll("-", ""));
				save.setSaveCost(costSace);
				save.setSaveInfo(costSaceInfo);
				saveService.insertSaveSelective(save);
			}
			PrintWriter out = response.getWriter();
			out.print(0);
	 }
	 //修改利率
	 @RequestMapping(value="/updateinterest", method = RequestMethod.POST) 
	 public void updateinterest(Model model,HttpServletRequest request,HttpServletResponse response,BigDecimal costInterest)throws Exception{
		 
		 InterestRateExample example = new InterestRateExample();
		 List<InterestRate> interestRates = interestRateService.selectByExample(example);
		 if(interestRates.size()>0){
			 //修改
			 BigDecimal size = costInterest.divide(new BigDecimal(100));
			 InterestRateExample example1 = new InterestRateExample();
			 com.chance.ssm.po.InterestRateExample.Criteria criteria = example1.createCriteria();
			 InterestRate interestRate = new InterestRate();
			 criteria.andInterestRateIdEqualTo(interestRates.get(0).getInterestRateId());
			 interestRate.setInterestRateSize(size);
			 interestRateService.updateByExampleSelective(interestRate, example1);
			 
		 }else{
			 //插入
			 InterestRate interestRate = new InterestRate();
			 interestRate.setInterestRateId(UUID.randomUUID().toString().replaceAll("-", ""));
			 interestRate.setInterestRateSize(costInterest.divide(new BigDecimal(100)));
			 interestRateService.insertSelective(interestRate);
		 }
		 PrintWriter out = response.getWriter();
		out.print(0);
	 }
}
