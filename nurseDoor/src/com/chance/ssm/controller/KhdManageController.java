package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.GoodServiceRecommend;
import com.chance.ssm.po.GoodServiceRecommendExample;
import com.chance.ssm.po.RollPic;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.KhdManageService;

@Controller
@RequestMapping(value="khdManage")
public class KhdManageController {
	
	@Autowired
	private KhdManageService khdManageService;

	//首页轮播
	@RequestMapping(value = "rollPicList", method = RequestMethod.POST)
	public @ResponseBody
	NetState rollPicList()throws Exception {
		NetState netState = new NetState();
		
		List<RollPic> list = khdManageService.selectAllRollPic();
		if(list==null || "".equals(list)){
			netState.setData("没有符合的数据");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
		}
		netState.setJson(list);
		return netState;
	}
	//精品服务推荐
	@RequestMapping(value = "goodServiceRecommendList", method = RequestMethod.POST)
	public @ResponseBody
	NetState goodServiceRecommendList(Integer pageNum)throws Exception {
		NetState netState = new NetState();
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("请带上分页参数pageNum,1页10条");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		GoodServiceRecommendExample example = new GoodServiceRecommendExample();
		//Criteria criteria = example.createCriteria();
		//查询所有精品推荐
		List<GoodServiceRecommend> newlist = khdManageService.selectByExample(example);
		if(newlist==null || "".equals(newlist)){
			netState.setData("没有符合的数据");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
		}
		// 每页多少条
		int num = 10;
		List<GoodServiceRecommend> paging = new ArrayList<GoodServiceRecommend>();
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
		
		netState.setJson(paging);
		return netState;
	}
}
