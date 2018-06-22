package com.chance.ssm.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.NurseEvaluate;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.NurseEvaluateService;
/**
 * 护士对用户的评价控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="nurseevaluate")
public class NurseEvaluateController {

	@Autowired
	private NurseEvaluateService nurseEvaluateService;
	
	/**
	 * 添加护士的评价
	 * @param nurseId 评价人（护士ID）
	 * @param userId 被评价人（用户ID）
	 * @param sendId 订单ID
	 * @param info 评价内容
	 * @param mark 评价分数
	 * @return
	 */
	@RequestMapping(value="addnurseevaluate", method = RequestMethod.POST)
	public @ResponseBody NetState AddNurseEvaluate(String nurseId, String userId, String sendId, String info, String mark){
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(userId == null || "".equals(userId)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(sendId == null || "".equals(sendId)){
			netState.setData("订单ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(info == null || "".equals(info)){
			netState.setData("评价内容错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(mark == null || "".equals(mark)){
			netState.setData("分数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//初始化实体类
			NurseEvaluate nurseEvaluate = new NurseEvaluate();
			String nurseEvaluateId = java.util.UUID.randomUUID().toString().replace("-", "");
			nurseEvaluate.setNurseEvaluateId(nurseEvaluateId);
			nurseEvaluate.setEvaluateNurseId(nurseId);
			nurseEvaluate.setEvaluteInfo(info);
			nurseEvaluate.setEvaluteMark(Integer.parseInt(mark));
			nurseEvaluate.setEvaluteCrtetime(new Date());
			nurseEvaluate.setEvaluteSendId(sendId);
			nurseEvaluate.setEvaluteUserId(userId);
			int i = 0;
			try {
				i = nurseEvaluateService.insertSelective(nurseEvaluate);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i > 0){
				netState.setData("添加成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("添加失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		}
		return netState;
	}
	
}
