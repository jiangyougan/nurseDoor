package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.SimpleMajorExample;
import com.chance.ssm.po.vo.SimpleMajorVO;

public interface SimpleMajorService {
	//添加专业
	public int insertSelective(SimpleMajor record)throws Exception;
	//查询专业
    public List<SimpleMajor> selectByExample(SimpleMajorExample example)throws Exception;
    //根据ID查询专业
    public SimpleMajor selectByPrimaryKey(String simpleMajorId)throws Exception;
    //根据ID更新专业信息
    public int updateByPrimaryKeySelective(SimpleMajor record)throws Exception;
    //根据ID删除专业信息
    public int deleteByPrimaryKey(String simpleMajorId)throws Exception;
    
    //查询专业返回VO扩展类
    public List<SimpleMajorVO> selectByExampleRuVO(SimpleMajorExample example)throws Exception;

}
