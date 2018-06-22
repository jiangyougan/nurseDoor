package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.NursingTestingContent;

public interface NursingTestingContentService {
	
	//根据订单id查询检测项
    public List<NursingTestingContent> selectTestingContentByOrderId(String nursingOrderid)throws Exception;
    
    //添加检测项
    public int insertSelective(NursingTestingContent record)throws Exception;

}
