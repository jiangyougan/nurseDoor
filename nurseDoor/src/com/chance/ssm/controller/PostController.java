package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import net.sf.json.JSONObject;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.PostNursefFocus;
import com.chance.ssm.po.PostOneLevel;
import com.chance.ssm.po.PostOneLevelExample;
import com.chance.ssm.po.PostRollPic;
import com.chance.ssm.po.PostRollPicExample;
import com.chance.ssm.po.PostThreeLevelDetails;
import com.chance.ssm.po.PostTwoLevel;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	private PostService postService;

	//查询一级及一级的二级学术圈
	@RequestMapping(value = "selectPostInfoByOneTOTwo", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectPostInfoByOneTOTwo()throws Exception {
		NetState netState = new NetState();
		//查询所有一级学术圈
		PostOneLevelExample example = new PostOneLevelExample();
		List<PostOneLevel> postOnelist = postService.selectByExample(example);
		//查询所有二级学术圈
		//
		List<PostTwoLevel> postTwolist = new ArrayList<PostTwoLevel>();
		
		List<PostOneLevel> list = new ArrayList<PostOneLevel>();
		
		for(PostOneLevel postOneLevel : postOnelist){
			//通过一级学术圈Id查询二级
			postTwolist = postService.selectPostTwoLevelInfoByPostOneId(postOneLevel.getPostOneLevelId());
			
			JSONArray json = new JSONArray();
			for (PostTwoLevel postTwoLevel : postTwolist) {
				JSONObject jo = new JSONObject();
				jo.put("PostTwoLevelId", postTwoLevel.getPostTwoLevelId());
				jo.put("PostTwoLevelName", postTwoLevel.getPostTwoLevelName());
				json.put(jo);
			}
			String info = json.toString();
			postOneLevel.setPostTwoInfo(info);
			list.add(postOneLevel);
		}
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(list);
		return netState;
	}
	//查询精品帖子
	@RequestMapping(value = "selectPostThreeLevelDetailsInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectPostThreeLevelDetailsInfo(Integer pageNum )throws Exception {
		NetState netState = new NetState();
		if("".equals(pageNum) || pageNum==null){
			netState.setData("分页参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<PostThreeLevelDetails> newlist = postService.selectPostThreeLevelDetailsInfo();
		// 每页多少条
		int num = 10;
		List<PostThreeLevelDetails> paging = new ArrayList<PostThreeLevelDetails>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有更多的帖子了");
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
		if(paging.size()==0 || "".equals(paging)){
			netState.setData("没有更多的帖子了");
			netState.setJson(paging);
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setJson(paging);
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	//查询护士关注的二级
	@RequestMapping(value = "selectPostNursefFocus", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectPostNursefFocus(String nurseId )throws Exception {
		NetState netState = new NetState();
		if("".equals(nurseId) || nurseId==null){
			netState.setData("护士ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<PostTwoLevel> list = postService.selectPostNursefFocus(nurseId);
		
		if(list.size()==0 || "".equals(list)){
			netState.setData("没有更多的帖子了");
			netState.setJson(list);
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("查询成功");
			netState.setJson(list);
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	//添加护士关注
	/**
	 * 
	 * @param nurseId 护士Id
	 * @param nurseFocusId 护士关注的二级学术圈ID(全部提交,多个用逗号隔开)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "AddPostNursefFocus", method = RequestMethod.POST)
	public @ResponseBody
	NetState AddPostNursefFocus(String nurseId,String postTwoLevelId )throws Exception {
		NetState netState = new NetState();
		if("".equals(nurseId) || nurseId==null){
			netState.setData("护士ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		/*if("".equals(postTwoLevelId) || postTwoLevelId==null){
			netState.setData("二级学术圈ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}*/
		//添加之前删除掉之前添加的关注
		postService.deletePostNursefFocusByNurseId(nurseId);
		if(postTwoLevelId != null && !"".equals(postTwoLevelId)){
			Date now = new Date();
			//将用逗号隔开的关注用逗号切割插入到数据库
			String[] LevelId = postTwoLevelId.split(",");
			for (int i = 0; i < LevelId.length; i++) {
				PostNursefFocus postNursefFocus = new PostNursefFocus();
				postNursefFocus.setPostNursefFocusId(UUID.randomUUID().toString().replaceAll("-", ""));
				postNursefFocus.setPostNursefFocusNurseId(nurseId);
				postNursefFocus.setPostNursefPostTwoLevelId(LevelId[i]);
				postNursefFocus.setPostNursefFocusCreatetime(now);
				postService.insertPostnursefocusSelective(postNursefFocus);
			}
		}
		netState.setData("添加成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	//根据我关注的二级学术圈Id查询帖子
	@RequestMapping(value = "selectPostThreeLevelDetailsInfoByPostTwoId", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectPostThreeLevelDetailsInfoByPostTwoId(String postTwoLevelId,Integer pageNum )throws Exception {
		NetState netState = new NetState();
		if("".equals(postTwoLevelId) || postTwoLevelId==null){
			netState.setData("二级学术圈ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<PostThreeLevelDetails> newlist = postService.selectPostThreeLevelDetailsInfoByPostTwoId(postTwoLevelId);
		// 每页多少条
		int num = 10;
		List<PostThreeLevelDetails> paging = new ArrayList<PostThreeLevelDetails>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有更多的帖子了");
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
		if(paging.size()==0 || "".equals(paging)){
			netState.setData("没有更多的帖子了");
			netState.setJson(paging);
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setJson(paging);
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	//查询学术圈的轮播图
	@RequestMapping(value = "selectPostRollPicInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectPostRollPicInfo(String postTwoLevelId,Integer pageNum )throws Exception {
		NetState netState = new NetState();
		
		PostRollPicExample postRollPicExample = new PostRollPicExample();
		postRollPicExample.setOrderByClause("post_roll_pic_rank asc");
		
		List<PostRollPic> list = postService.selectpostrollpicByExample(postRollPicExample);
		
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(list);
		return netState;
	}
}
