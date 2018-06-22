package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.NurseRankingVO;
import com.chance.ssm.service.NurseService;

//积分和关注控制器
@Controller
@RequestMapping("mark")
public class MarkController {
	
	@Autowired
	private NurseService nurseService;
	
	//护士积分排行总榜
	@RequestMapping(value = "/nurseMarkDesc", method = RequestMethod.POST)
	public @ResponseBody
	NetState nurseMarkDesc(HttpServletRequest request,Integer pageNum)
			throws Exception {
		NetState netState = new NetState();
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<NurseRankingVO> list = new ArrayList<NurseRankingVO>();
		
		list = nurseService.selectNurseMarkDesc();
		
		if(list==null || "".equals(list) || list.size()==0){
			netState.setData("暂无护士");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			// 每页多少条
			int num = 10;
			List<NurseRankingVO> paging = new ArrayList<NurseRankingVO>();
			if (list == null || list.size()<=0 ) {
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);

			} else if ((list.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((list.size() - pageNum * num) < num) {
					for (int i = 0; i < (list.size() - (pageNum * num)); i++) {
						paging.add(list.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(list.get(i + pageNum * num));
						
					}
				}
			}
			if(paging.size()==0 || "".equals(paging)){
				netState.setData("没有符合的数据");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			}
		}
		return netState;
	}
	//近一月护士积分排行总榜
	@RequestMapping(value = "/nurseMarkThirtyDayDesc", method = RequestMethod.POST)
	public @ResponseBody
	NetState nurseMarkThirtyDayDesc(HttpServletRequest request,Integer pageNum)
			throws Exception {
		NetState netState = new NetState();
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<NurseRankingVO> list = new ArrayList<NurseRankingVO>();
		
		list = nurseService.selectNurseThirtyDayRanking();
		
		if(list==null || "".equals(list) || list.size()==0){
			netState.setData("暂无护士");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			// 每页多少条
			int num = 10;
			List<NurseRankingVO> paging = new ArrayList<NurseRankingVO>();
			if (list == null || list.size()<=0 ) {
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);

			} else if ((list.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((list.size() - pageNum * num) < num) {
					for (int i = 0; i < (list.size() - (pageNum * num)); i++) {
						paging.add(list.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(list.get(i + pageNum * num));
					}
				}
			}
			if(paging.size()==0 || "".equals(paging)){
				netState.setData("没有符合的数据");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			}
		}
		return netState;
	}
	
	
	//查询护士积分排行榜
	@RequestMapping(value = "/nurseMarkRanking", method = RequestMethod.POST)
	public @ResponseBody
	NetState nurseMarkRanking(HttpServletRequest request,String nurseId)
			throws Exception {
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		NurseRankingVO nurseRankingVO = nurseService.selectNurseRanking(nurseId);
		if(nurseRankingVO == null || "".equals(nurseRankingVO)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(nurseRankingVO);
		}
		return netState;
	}
	//查询护士近一月积分排行榜
	@RequestMapping(value = "/nurseMarkThirtyDayRanking", method = RequestMethod.POST)
	public @ResponseBody
	NetState nurseMarkThirtyDayRanking(HttpServletRequest request,String nurseId)
			throws Exception {
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		NurseRankingVO nurseRankingVO = nurseService.selectNurseThirtyDayRankingByNurseId(nurseId);
		//查询近一月排行总榜
		List<NurseRankingVO> list = new ArrayList<NurseRankingVO>();
		list = nurseService.selectNurseThirtyDayRanking();
		int rank = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getNurseId() == nurseRankingVO.getNurseId() || list.get(i).getNurseId().equals(nurseRankingVO.getNurseId())){
				rank = i+1;
			}
		}
		nurseRankingVO.setRanks(String.valueOf(rank));
		
		if(nurseRankingVO == null || "".equals(nurseRankingVO)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(nurseRankingVO);
		}
		return netState;
	}
	
	//近一周护士积分排行总榜
	@RequestMapping(value = "/nurseMarkSevenDayDesc", method = RequestMethod.POST)
	public @ResponseBody
	NetState nurseMarkSevenDayDesc(HttpServletRequest request,Integer pageNum)
			throws Exception {
		NetState netState = new NetState();
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<NurseRankingVO> list = new ArrayList<NurseRankingVO>();
		
		list = nurseService.selectNurseSevenDayRanking();
		
		if(list==null || "".equals(list) || list.size()==0){
			netState.setData("暂无护士");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			// 每页多少条
			int num = 10;
			List<NurseRankingVO> paging = new ArrayList<NurseRankingVO>();
			if (list == null || list.size()<=0 ) {
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);

			} else if ((list.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((list.size() - pageNum * num) < num) {
					for (int i = 0; i < (list.size() - (pageNum * num)); i++) {
						paging.add(list.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(list.get(i + pageNum * num));
					}
				}
			}
			if(paging.size()==0 || "".equals(paging)){
				netState.setData("没有符合的数据");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			}
		}
		return netState;
	}
	//查询护士近一周积分排行榜
	@RequestMapping(value = "/nurseMarkSevenDayRanking", method = RequestMethod.POST)
	public @ResponseBody
	NetState nurseMarkSevenDayRanking(HttpServletRequest request,String nurseId)
			throws Exception {
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		NurseRankingVO nurseRankingVO = nurseService.selectNurseSevenDayRankingByNurseId(nurseId);
		//查询近一月排行总榜
		List<NurseRankingVO> list = new ArrayList<NurseRankingVO>();
		list = nurseService.selectNurseSevenDayRanking();
		int rank = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getNurseId() == nurseRankingVO.getNurseId() || list.get(i).getNurseId().equals(nurseRankingVO.getNurseId())){
				rank = i+1;
			}
		}
		nurseRankingVO.setRanks(String.valueOf(rank));
		
		if(nurseRankingVO == null || "".equals(nurseRankingVO)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(nurseRankingVO);
		}
		return netState;
	}
	/***************关注排行榜**********************/
	//护士关注排行总榜
	@RequestMapping(value = "/nurseFollow", method = RequestMethod.POST)
	public @ResponseBody
	NetState nursegz(HttpServletRequest request,Integer pageNum)
			throws Exception {
		NetState netState = new NetState();
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<NurseRankingVO> list = nurseService.selectNurseForFollow();
		if(list==null || "".equals(list) || list.size()==0){
			netState.setData("暂无护士");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			// 每页多少条
			int num = 10;
			List<NurseRankingVO> paging = new ArrayList<NurseRankingVO>();
			if (list == null || list.size()<=0 ) {
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);

			} else if ((list.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((list.size() - pageNum * num) < num) {
					for (int i = 0; i < (list.size() - (pageNum * num)); i++) {
						paging.add(list.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(list.get(i + pageNum * num));
						
					}
				}
			}
			if(paging.size()==0 || "".equals(paging)){
				netState.setData("没有符合的数据");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			}
		}
		return netState;
	}
	
}
