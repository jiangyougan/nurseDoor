package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.chance.ssm.po.PostOneLevel;
import com.chance.ssm.po.PostOneLevelExample;
import com.chance.ssm.po.PostOneLevelExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.PostGiveFabulous;
import com.chance.ssm.po.PostGiveFabulousExample;
import com.chance.ssm.po.PostReply;
import com.chance.ssm.po.PostRollPic;
import com.chance.ssm.po.PostRollPicExample;
import com.chance.ssm.po.PostThreeLevelDetails;
import com.chance.ssm.po.PostTwoLevel;
import com.chance.ssm.po.PostTwoLevelExample;
import com.chance.ssm.po.RollPic;
import com.chance.ssm.po.User;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.PostGiveFabulousService;
import com.chance.ssm.service.PostReplyService;
import com.chance.ssm.service.PostService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.Pager;
import com.chance.ssm.utils.RandomUtil;
import com.chance.ssm.utils.file.FileUpload;

@Controller
public class PostAction {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private PostReplyService postReplyService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private PostGiveFabulousService postGiveFabulousService;

	//查询一级学术圈数据
	@RequestMapping(value="selectOnePostInfo")
	public String DelectTestingById(Model model)throws Exception{
		PostOneLevelExample example = new PostOneLevelExample();
		List<PostOneLevel> list = postService.selectByExample(example);
		model.addAttribute("list", list);
		return "post-one-list";
	}
	//删除一级学术圈
	@RequestMapping(value="postOneListDel",method = RequestMethod.POST)
	public void postOneListDel(Model model,HttpServletResponse response,String rollPicId)throws Exception{
		int i = postService.deletePostOneLevelByPrimaryKey(rollPicId);
		postService.deletePostTwoLevelByOneIdByPrimaryKey(rollPicId);
		PrintWriter put =  response.getWriter();
		if(i>0){
			put.print(0);
		}else{
			put.print(0);
		}
		 
	}
	
	//添加一级
	@RequestMapping(value="postOneLevelAdd",method = RequestMethod.POST)
	public void postOneLevelAdd(Model model,String postOneName,String postOneNote,HttpServletResponse response)throws Exception{
		
		PostOneLevel postOneLevel = new PostOneLevel();
		postOneLevel.setPostOneLevelId(java.util.UUID.randomUUID().toString()
				.replaceAll("-", ""));
		postOneLevel.setPostOneLevelName(postOneName);
		postOneLevel.setPostOneLevelNote(postOneNote);
		int i  = postService.insertSelective(postOneLevel);
		PrintWriter out = response.getWriter();
		if(i>0){
			out.print(0);
		}else{
			out.print(1);
		}
	}
	//查询二级学术圈数据
	@RequestMapping(value="postTwoLevelInfo")
	public String postTwoLevelInfo(Model model,String postOneLevelId)throws Exception{
		List<PostTwoLevel> list = postService.selectPostTwoLevelInfoByPostOneId(postOneLevelId);
		model.addAttribute("list", list);
		//一级学术圈Id
		model.addAttribute("postOneLevelId", postOneLevelId);
		return "post-two-list";
	}
	
	//添加二级
	@RequestMapping(value="postTwoLevelAdd",method = RequestMethod.POST)
	public void postTwoLevelAdd(Model model,String postTwoName,String postTwoNote,String postOneLevelId, HttpServletResponse response)throws Exception{
		PostTwoLevel postTwoLevel = new PostTwoLevel();
		postTwoLevel.setPostTwoLevelId(java.util.UUID.randomUUID().toString()
				.replaceAll("-", ""));
		postTwoLevel.setPostTwoLevelName(postTwoName);
		postTwoLevel.setPostOneLevelId(postOneLevelId);
		postTwoLevel.setPostTwoLevelNote(postTwoNote);
		int i  = postService.insertPostTwoLevelSelective(postTwoLevel);
		PrintWriter out = response.getWriter();
		if(i>0){
			out.print(0);
		}else{
			out.print(1);
		}
	}
	//去发帖子页面
	@RequestMapping(value="gotosendPostInfo",method = RequestMethod.GET)
	public String gotosendPostInfo(Model model,HttpServletResponse response)throws Exception{
		//查询所有二级学术圈
		PostTwoLevelExample example = new PostTwoLevelExample();
		
		List<PostTwoLevel> list = postService.selectPostTwoLevelByExample(example);
		
		model.addAttribute("list", list);
		return "post-send";
	}
	
	//发帖
	@RequestMapping(value="sendPostInfo",method = RequestMethod.POST)
	public String sendPostInfo(Model model,HttpServletRequest request,MultipartRequest multipartRequest)throws Exception{
		//获取帖子标题
		String title = request.getParameter("title");
		//获取帖子的描述
		String speak = request.getParameter("message");
		//获取帖子关联的二级学术圈ID
		String posttwolevelid = request.getParameter("postTwoName");
		//获取帖子的内容
		String content = request.getParameter("ueditor");
		//是否加精
		String jing = request.getParameter("jiajin");
		
		if("0".equals(jing) || jing=="0"){
			if(posttwolevelid == null && "".equals(posttwolevelid==null)){
				model.addAttribute("poststate", 4);
				return "post-send";
			}
		}
		
		if("1".equals(jing) || jing == "1" ){
			if(posttwolevelid!=null && !"".equals(posttwolevelid)){
				model.addAttribute("poststate", 1);
				return "post-send";
			}
		}
		
		
		//文件
		FileUpload fileUpload = new FileUpload();
		MultipartFile pic = multipartRequest.getFile("filepic");
		String file = "";
		if(pic!=null && !"".equals(pic)){
			file = fileUpload.uploadIcon(request, pic, "Postfile");
		}
		//插入到数据库
		PostThreeLevelDetails postThreeLevelDetails = new PostThreeLevelDetails();
		postThreeLevelDetails.setPostThreeLevelDetailsId(java.util.UUID.randomUUID().toString()
				.replaceAll("-", ""));
		
		postThreeLevelDetails.setPostThreeLevelDetailsTitle(title);
		postThreeLevelDetails.setPostThreeLevelDetailsSpeak(speak);
		postThreeLevelDetails.setPostThreeLevelDetailsContent(content);
		
		//加精了就不添加二级学术圈ID
		if(jing=="1" || "1".equals(jing)){
			postThreeLevelDetails.setPostThreeLevelDetailsAdd(Integer.parseInt(jing));
		}else{
			postThreeLevelDetails.setPostTwoLevelId(posttwolevelid);
		}
		
		
		postThreeLevelDetails.setPostThreeLevelDetailsLink(file);
		postThreeLevelDetails.setPostThreeLevelDetailsCreatetime(new Date());
		int i = postService.insertPostThreeLevelDetailsSelective(postThreeLevelDetails);
		if(i>0){
			model.addAttribute("poststate", 2);
		}else{
			model.addAttribute("poststate", 3);
		}
		return "post-send";
	}
	
	//查看帖子详情(web页面)
	@RequestMapping(value="sendPostThreeInfoByThreeId",method = RequestMethod.GET)
	public String sendPostThreeInfoByThreeId(Model model,HttpServletRequest request,String postThreeLevelDetailsId,String nurseId)throws Exception{
		if(postThreeLevelDetailsId == null || "".equals(postThreeLevelDetailsId)){
			return "404";
		}
		//根据帖子Id查看帖子详情
		PostThreeLevelDetails details = postService.selectpostthreeleveldetailsByPrimaryKey(postThreeLevelDetailsId);
		
		if(details==null || "".equals(details)){
			return "404";
		}
		//来自哪个
		String postTwoLevelId = details.getPostTwoLevelId();
		
		if(postTwoLevelId!=null && !"".equals(postTwoLevelId)){//非加精
			//根据Id得到二级学术圈名称
			PostTwoLevel postTwoLevel = postService.selectInfoByPostTwoId(postTwoLevelId);
			if(postTwoLevel!=null && !"".equals(postTwoLevel)){
				String detailInfo = postTwoLevel.getPostTwoLevelName();
				model.addAttribute("detailInfo", detailInfo);
			}else{
				model.addAttribute("detailInfo", "学术圈");
			}
		}else{//加精
			model.addAttribute("detailInfo","精品帖子" );
		}
		//查看帖子回复
		//根据三级帖子id查询所有回复
	    List<PostReply> list = postReplyService.selectPostReplyByThreePsotId(postThreeLevelDetailsId);
	    List<PostReply> listreply = new ArrayList<PostReply>();
	    for (PostReply postReply : list) {
	    	//得到回复人的身份
	    	String state = postReply.getPostReplySpeak();
	    	String NurseId = "";
	    	if(state == "1" || "1".equals(state)){//用户回复的
	    		//得到回复人ID(护士ID)
	    		NurseId = postReply.getPostReplyReplyToPeople();
	    	}else{//客服回复的 
	    		//得到被回复人ID(护士ID)
	    		NurseId = postReply.getPostReplyBeReplyToPeople();
	    	}
	    	//根据userId得到用户信息
	    	Nurse nurse =  nurseService.selectForNurseId(NurseId);
	    	if(nurse != null && !"".equals(nurse)){
	    		postReply.setNurseId(nurse.getNurseId());
	    		postReply.setNurseHeader(nurse.getNurseHeader());
	    		postReply.setNurseNick(nurse.getNurseNick());
	    		postReply.setNurseName(nurse.getNurseName());
	    	}
	    	listreply.add(postReply);
		}
		
	    //回复list
	    model.addAttribute("list", listreply);
		model.addAttribute("details", details);
		//护士ID
		model.addAttribute("nurseId", nurseId);
		//帖子ID
		model.addAttribute("postThreeLevelDetailsId", postThreeLevelDetailsId);
		return "post-details";
	}
	//护士回复帖子
	@RequestMapping(value="ReplyToCustomerService",method = RequestMethod.POST)
	public void ReplyToCustomerService(Model model,HttpServletRequest request,HttpServletResponse response,String postThreeLevelDetailsId,String nurseId,String content)throws Exception{
		 PrintWriter out = response.getWriter();
		
		if(nurseId == null || "".equals(nurseId)){
			 out.print(1);
		}
		if(postThreeLevelDetailsId == null || "".equals(postThreeLevelDetailsId)){
			 out.print(1);
		}
		//判断有没有对该帖子的回复
		//根据三级帖子id查询所有回复
	    List<PostReply> list = postReplyService.selectPostReplyByThreePsotId(postThreeLevelDetailsId);
	    if(list.size()==0 || "".equals(list)){
	    	//说明我是对这个帖子的第一个回复人
	    	//添加回复
	    	PostReply postReply = new PostReply();
	    	postReply.setPostReplyId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
	    	postReply.setPostReplyReplyToPeople(nurseId);
	    	postReply.setPostReplyPostThreeId(postThreeLevelDetailsId);
	    	postReply.setPostReplyContent(content);
	    	postReply.setPostReplyNote("1");//分组标识从1开始
	    	postReply.setPostReplySpeak("1");
	    	postReply.setPostReplyCreatetime(new Date());
	    	postReplyService.insertSelective(postReply);
	    	out.print(0);
	    }else{//如果有回复
	    	//根据帖子Id获取回复的最大标识
	    	PostReply postReply1 = postReplyService.selectMaxPostNote(postThreeLevelDetailsId);
	    	String note = postReply1.getPostReplyNote();
	    	//查看我是不是对这个帖子第一次回复
	    	PostReply postReply  = postReplyService.selectPostReplyForNurse(nurseId,postThreeLevelDetailsId);
	    	if(postReply == null || "".equals(postReply)){//第一次回复
	    		PostReply postReply2 = new PostReply();
	    		postReply2.setPostReplyId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
	    		postReply2.setPostReplyReplyToPeople(nurseId);
	    		postReply2.setPostReplyPostThreeId(postThreeLevelDetailsId);
	    		postReply2.setPostReplyContent(content);
	    		postReply2.setPostReplyNote(String.valueOf((Integer.parseInt(note)+1)));//分组标识最大值加1
	    		postReply2.setPostReplySpeak("1");
	    		postReply2.setPostReplyCreatetime(new Date());
	    		postReplyService.insertSelective(postReply2);
	    		out.print(0);
	    	}else{//第二次回复
	    		/*out.print(3);*/
	    		//获取我回复的最大标识
	    		String note1 = postReply.getPostReplyNote();
	    		PostReply postReply2 = new PostReply();
	    		postReply2.setPostReplyId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
	    		postReply2.setPostReplyReplyToPeople(nurseId);
	    		postReply2.setPostReplyBeReplyToPeople("1");
	    		postReply2.setPostReplyPostThreeId(postThreeLevelDetailsId);
	    		postReply2.setPostReplyContent(content);
	    		postReply2.setPostReplyNote(note1);//分组标识最大值加1
	    		postReply2.setPostReplySpeak("1");
	    		postReply2.setPostReplyCreatetime(new Date());
	    		postReplyService.insertSelective(postReply2);
	    		out.print(0);
	    	}
	    }
		//return "redirect:sendPostThreeInfoByThreeId.action?postThreeLevelDetailsId="+postThreeLevelDetailsId+"&nurseId="+nurseId+"";
	}
	//点赞
	@RequestMapping(value="PostGiveFabulous",method = RequestMethod.POST)
	public void PostGiveFabulous(Model model,HttpServletRequest request,HttpServletResponse response,String postThreeLevelDetailsId,String nurseId,String content)throws Exception{
		 PrintWriter out = response.getWriter();
		//int count=  postGiveFabulousService.selectpostgivefabulousToday(nurseId, postThreeLevelDetailsId);
		 
		 //List<PostGiveFabulous> count=  postGiveFabulousService.selectpostgivefabulousForMeto(nurseId, postThreeLevelDetailsId);
		 
		 PostGiveFabulousExample example = new PostGiveFabulousExample();
		 com.chance.ssm.po.PostGiveFabulousExample.Criteria criteria = example.createCriteria();
		 criteria.andPostGiveFabulousNurseIdEqualTo(nurseId);
		 criteria.andPostGiveFabulousPostThreeIdEqualTo(postThreeLevelDetailsId);
		 int number = postGiveFabulousService.countByExample(example);
		 if(number>0){
			 out.print(1);
		 }else{
			 com.chance.ssm.po.PostGiveFabulous postGiveFabulous = new com.chance.ssm.po.PostGiveFabulous();
			 postGiveFabulous.setPostGiveFabulousNurseId(nurseId);
			 postGiveFabulous.setPostGiveFabulousPostThreeId(postThreeLevelDetailsId);
			 postGiveFabulous.setPostGiveFabulousCreatetime(new Date());
			 postGiveFabulousService.insertSelective(postGiveFabulous);
			
			//根据帖子Id查看帖子详情
			 PostThreeLevelDetails details = postService.selectpostthreeleveldetailsByPrimaryKey(postThreeLevelDetailsId);
			 //得到点赞次数
			 int thingNumber = details.getPostThreeLevelDetailsThingNumber();
			 out.print(thingNumber);
		 }
		
	} 
	
	/****************客户端学术圈轮播图后台管理**************************/
	//查询所有轮播图
		@RequestMapping(value="/PostroolPicLook", method = RequestMethod.GET) 
		 public String roolPicLook(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
			PostRollPicExample postRollPicExample = new PostRollPicExample();
			postRollPicExample.setOrderByClause("post_roll_pic_rank asc");
			
			List<PostRollPic> list = postService.selectpostrollpicByExample(postRollPicExample);
			
			model.addAttribute("count", list.size());
			
			model.addAttribute("list", list);
			
			return "post-khd-rollpic";
		}
		//上传轮播图
		 @RequestMapping(value="/PostroolPicUpdload", method = RequestMethod.POST) 
		 public String roolPicUpdload(Model model,HttpServletRequest request,HttpServletResponse response,MultipartRequest multipartRequest)throws Exception{
			 	//服务信息图片
				String webpath = request.getSession().getServletContext().getRealPath("");
				String uploadpath = webpath+"/NurseImg/PostRollPic/";//上传路径
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
					newpath = "nurseDoor/NurseImg/PostRollPic/"+fileName;
					// 将内存中的数据写入磁盘
					pic.get(i).transferTo(newFile);
					if (i == 0) {
						picth = newpath;
					} else {
						picth = picth + "," + newpath;
					}
				}
				
				PostRollPicExample postRollPicExample = new PostRollPicExample();
				postRollPicExample.setOrderByClause("post_roll_pic_rank asc");
				
				List<PostRollPic> list = postService.selectpostrollpicByExample(postRollPicExample);
			// List<RollPic> list = khdManageService.selectAllRollPic();	
			 PostRollPic postRollPic = new PostRollPic();
			 postRollPic.setPostRollPicId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
			 postRollPic.setPostRollPicUrl(picth);
			 if(contentId!=null && !"".equals(contentId)){//如果两个都填,只setId
				 postRollPic.setPostRollPicAddress(contentId);
			 }else{
				 postRollPic.setPostRollPicNote(hrefUrl);
			 }
			 Integer count = 0;
			// Integer count = list.size()+1;
			 if(list.size() >0){
				 count = Integer.parseInt(list.get(list.size()-1).getPostRollPicRank())+1;
			 }
			  
			 postRollPic.setPostRollPicRank(count.toString());
			 postRollPic.setPostRollPicCreatetime(new Date());
			 int i = postService.insertPostRollPicSelective(postRollPic);
				if(i==0){
					return "404";
				}else{
					 return "redirect:PostroolPicLook.action";
				}
		 }
		 
		 /**
		 * //上移轮播图
		 * @param rollPicId 当前ID
		 * @param order 当前排名
		 * @param index 当前索引
		 * @return
		 */
		@RequestMapping(value="postRollPicupwardone")
		public String RollPicupwardone(String rollPicId, String order,String index)throws Exception{
			Integer rollindex = Integer.parseInt(index);
			//查询当前上一位的排名
			PostRollPicExample postRollPicExample = new PostRollPicExample();
			postRollPicExample.setOrderByClause("post_roll_pic_rank asc");
			
			List<PostRollPic> list = postService.selectpostrollpicByExample(postRollPicExample);
			String rank = "";//上一位排名
			String rollIdBrfore = "";//上一位ID
			if(list.size()>0){
				rank = list.get(rollindex-1).getPostRollPicRank();
				rollIdBrfore = list.get(rollindex-1).getPostRollPicId();
			}
			//相互交换
			PostRollPic rollPic1 = new PostRollPic();
			rollPic1.setPostRollPicId(rollPicId);
			rollPic1.setPostRollPicRank(rank);
			int i = postService.updatePostRollPicByPrimaryKeySelective(rollPic1);
			
			PostRollPic rollPic2 = new PostRollPic();
			rollPic2.setPostRollPicId(rollIdBrfore);
			rollPic2.setPostRollPicRank(order);
			int c = postService.updatePostRollPicByPrimaryKeySelective(rollPic2);
			
			if(i==0 || c==0){
				return "404";
			}
			
			return "redirect:PostroolPicLook.action";
			
		}
		 //返回到轮播管理页面
		 @RequestMapping(value="/PostgoBackdRollpicadd", method = RequestMethod.GET) 
		 public String goBackdRollpicadd(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
			//ManageNursingContentExample example = new ManageNursingContentExample();
			//Criteria criteria = example.createCriteria();
			//查询所有二级服务
			//List<ManageNursingContentWithBLOBs> list = manageNursingContentService.selectByExampleWithBLOBs(example);
			//model.addAttribute("list", list);
			return "post-khd-rollpic-add";
		 }
		 
		 
		//去帖子详情列表页面
		 @RequestMapping(value="/goToPostInfoList", method = RequestMethod.GET) 
		 public String goToPostInfoList(Model model,HttpServletRequest request,HttpServletResponse response,Integer pageNow)throws Exception{
			//查询所有二级学术圈
			 PostTwoLevelExample example = new PostTwoLevelExample();
			List<PostTwoLevel> list = postService.selectPostTwoLevelByExample(example);
			//查询所有帖子
			//查询所有三级帖子
			 //分页
	  		pageNow = pageNow==null ? 1 : pageNow;
	  		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
	  		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
	  		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
	  		List<PostThreeLevelDetails> PostThreeLevelDetailslist = postService.selectPostThreeLevelDetailsAllInfo(params);
	  		int userCount=postService.selectPostThreeLevelDetailsAllInfoCount();
	  		int totalPage=Pager.getTotalPage(userCount);
	  		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
			 
			
	  		model.addAttribute("list", PostThreeLevelDetailslist);
	        model.addAttribute("count", userCount);
	        request.setAttribute("pageNow", pageNow);
	  		request.setAttribute("totalPage", totalPage);
	  		request.setAttribute("start", result.get("start"));
	  		request.setAttribute("end", result.get("end"));
			model.addAttribute("PostTwolist", list);
			 
			 return "post-list-info";
		 }
	//根据二级帖子ID查询所有帖子
	 @RequestMapping(value="/selectPostInfoListByPostTwoId", method = RequestMethod.GET) 
	 public String selectPostInfoListByPostTwoId(Model model,HttpServletRequest request,HttpServletResponse response,String postTwoLevelId,Integer pageNow)throws Exception{
		 //分页
	  		pageNow = pageNow==null ? 1 : pageNow;
	  		Map<String, Integer> params =new HashMap<String, Integer>();//这个map是数据库分页查询的范围,也就是SQL语句里的limit ?,? 条件
	  		params.put("start", (pageNow-1) * Pager.pageSize);		//start指从第几条数据开始,
	  		params.put("rows", Pager.pageSize);						//rows指要查多少条记录,
	  		List<PostThreeLevelDetails> list = new ArrayList<PostThreeLevelDetails>();
	  		int userCount = 0;
		 if(postTwoLevelId == "9" || "9".equals(postTwoLevelId)){//所有帖子
			//查询所有三级帖子
			 userCount =postService.selectPostThreeLevelDetailsAllInfoCount();
			 list = postService.selectPostThreeLevelDetailsAllInfo(params);
			 
		 }else if(postTwoLevelId == "0" || "0".equals(postTwoLevelId)){//精华帖子
			 
			 list = postService.selectPostThreeLevelDetailsManageInfo(params);
			 userCount = list.size();
		 }else{//普通帖子
			 Integer start = (pageNow-1) * Pager.pageSize;
			 Integer rows = Pager.pageSize;
			 list = postService.selectPostThreeLevelDetailsInfoManageByPostTwoId(postTwoLevelId,start,rows);
			 userCount = list.size();
		 }
			//查询所有二级学术圈
		 PostTwoLevelExample example = new PostTwoLevelExample();
		List<PostTwoLevel> listpostTwo = postService.selectPostTwoLevelByExample(example);
		model.addAttribute("PostTwolist", listpostTwo);
  		
  		int totalPage=Pager.getTotalPage(userCount);
  		Map<String, Integer> result=Pager.paging(pageNow, totalPage);//这个map是分页按钮的范围 如 start=1,end=5就是 1 2 3 4 5这五个按钮
		 
		
  		model.addAttribute("list", list);
        model.addAttribute("count", userCount);
        request.setAttribute("pageNow", pageNow);
  		request.setAttribute("totalPage", totalPage);
  		request.setAttribute("start", result.get("start"));
  		request.setAttribute("end", result.get("end"));
  		//选项
  		model.addAttribute("postTwoLevelId", postTwoLevelId);
		 
		 return "post-list-info";
	 }
	 //去到修改三级帖子页面
	 @RequestMapping(value="/gotoPostThreeUpdateInfo", method = RequestMethod.GET) 
	 public String gotoPostThreeUpdateInfo(Model model,HttpServletRequest request,HttpServletResponse response,String postThreeLevelDetailsId)throws Exception{
		PostThreeLevelDetails threeLevelDetails = postService.selectpostthreeleveldetailsByPrimaryKey(postThreeLevelDetailsId);
	 	//查询所有二级学术圈
		PostTwoLevelExample example = new PostTwoLevelExample();
		
		List<PostTwoLevel> list = postService.selectPostTwoLevelByExample(example);
			
		model.addAttribute("list", list);
		model.addAttribute("threeLevelDetails", threeLevelDetails);
		return "post-edit";
	 }
	 //修改帖子
	 @RequestMapping(value="/updatePostThreeInfo", method = RequestMethod.POST) 
	 public String updatePostThreeInfo(Model model,HttpServletRequest request,HttpServletResponse response,String postThreeLevelDetailsId,MultipartRequest multipartRequest)throws Exception{
		//获取帖子标题
			String title = request.getParameter("title");
			//获取帖子的描述
			String speak = request.getParameter("message");
			//获取帖子关联的二级学术圈ID
			String posttwolevelid = request.getParameter("postTwoName");
			//获取帖子的内容
			String content = request.getParameter("ueditor");
			//是否加精
			String jing = request.getParameter("jiajin");
			
			if("0".equals(jing) || jing=="0"){
				if(posttwolevelid == null && "".equals(posttwolevelid==null)){
					model.addAttribute("poststate", 4);
					return "post-send";
				}
			}
			
			if("1".equals(jing) || jing == "1" ){
				if(posttwolevelid!=null && !"".equals(posttwolevelid)){
					model.addAttribute("poststate", 1);
					return "post-send";
				}
			}
			
			
			//文件
			FileUpload fileUpload = new FileUpload();
			MultipartFile pic = multipartRequest.getFile("filepic");
			String file = "";
			if(pic!=null && !"".equals(pic)){
				file = fileUpload.uploadIcon(request, pic, "Postfile");
			}
			//插入到数据库
			PostThreeLevelDetails postThreeLevelDetails = new PostThreeLevelDetails();
			postThreeLevelDetails.setPostThreeLevelDetailsId(postThreeLevelDetailsId);
			
			postThreeLevelDetails.setPostThreeLevelDetailsTitle(title);
			postThreeLevelDetails.setPostThreeLevelDetailsSpeak(speak);
			postThreeLevelDetails.setPostThreeLevelDetailsContent(content);
			
			//加精了就不添加二级学术圈ID
			if(jing=="1" || "1".equals(jing)){
				postThreeLevelDetails.setPostThreeLevelDetailsAdd(Integer.parseInt(jing));
			}else{
				postThreeLevelDetails.setPostTwoLevelId(posttwolevelid);
			}
			
			
			postThreeLevelDetails.setPostThreeLevelDetailsLink(file);
			postThreeLevelDetails.setPostThreeLevelDetailsCreatetime(new Date());
			int i = postService.updateByPrimaryKeySelective(postThreeLevelDetails);
			if(i>0){
				model.addAttribute("poststate", 2);
			}else{
				model.addAttribute("poststate", 3);
			}
		 
		 return "post-edit";
	 }
	 //删除帖子
	 @RequestMapping(value="/postThreeDel", method = RequestMethod.GET) 
	 public String postThreeDel(Model model,HttpServletRequest request,HttpServletResponse response,String postThreeLevelDetailsId,String postTwoLevelId)throws Exception{
		 
		 postService.deleteByPrimaryKey(postThreeLevelDetailsId);
		 
		 return "redirect:selectPostInfoListByPostTwoId.action?postTwoLevelId="+postTwoLevelId;
	 }
	 //模糊搜索帖子
	 @RequestMapping(value="/postThreeInfoByKeyWord", method = RequestMethod.POST) 
	 public String postThreeInfoByKeyWord(Model model,HttpServletRequest request,HttpServletResponse response,String keyword)throws Exception{
		List<PostThreeLevelDetails> list =  postService.selectKeyWordFromPostThree(keyword);
		model.addAttribute("list", list);
		return "post-list-info";
	 }
}
