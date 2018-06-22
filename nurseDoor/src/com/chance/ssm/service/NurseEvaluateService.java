package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.NurseEvaluate;
import com.chance.ssm.po.NurseEvaluateExample;

public interface NurseEvaluateService {
	
	//添加护士对用户的评价
	public int insertSelective(NurseEvaluate record)throws Exception;
	
	public List<NurseEvaluate> selectByExample(NurseEvaluateExample example)throws Exception;
	
	 //根据订单查看有没有评价
	public List<NurseEvaluate> selectNurseToUserEvaluate(String evaluteSendId)throws Exception;
	
	//根据订单ID查询评价
	public NurseEvaluate selectEvaluateInfoByOrderid(String evaluteSendId)throws Exception;

}
