package com.chance.ssm.mapper.followmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Follow;
import com.chance.ssm.po.FollowExample;
import com.chance.ssm.po.vo.FollowUserVo;
import com.chance.ssm.po.vo.FollowVO;

public interface FollowMapper {
    int countByExample(FollowExample example);

    int deleteByExample(FollowExample example);

    int deleteByPrimaryKey(String followId);

    int insert(Follow record);

    int insertSelective(Follow record);

    List<Follow> selectByExample(FollowExample example);

    Follow selectByPrimaryKey(String followId);

    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
    
    //根据传入的条件查询数据，返回VO扩展类
    List<FollowVO> selectByExampleRuVO(FollowExample example);
    
    List<FollowVO> selectByExampleRuVO2(FollowExample example);
    
    //查询关注护士的用户
    List<FollowUserVo> selectFollowNurseForUser(String nurseId);
}