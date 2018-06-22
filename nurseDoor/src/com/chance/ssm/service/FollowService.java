package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Follow;
import com.chance.ssm.po.FollowExample;
import com.chance.ssm.po.vo.FollowUserVo;
import com.chance.ssm.po.vo.FollowVO;

public interface FollowService {

	// 根据传入的条件统计数据量
	public int countByExample(FollowExample example) throws Exception;
	
	//添加关注数据
	public int insertSelective(Follow record)throws Exception;
	
	//查询数据
	public List<Follow> selectByExample(FollowExample example)throws Exception;
	
	//根据传入的条件查询数据，返回VO扩展类
    public List<FollowVO> selectByExampleRuVO(FollowExample example)throws Exception;
    
    public List<FollowVO> selectByExampleRuVO2(FollowExample example)throws Exception;
    
    //根据ID取消关注
    public int deleteByPrimaryKey(String followId)throws Exception;
    
    //查询关注护士的用户
    List<FollowUserVo> selectFollowNurseForUser(String nurseId);
}
