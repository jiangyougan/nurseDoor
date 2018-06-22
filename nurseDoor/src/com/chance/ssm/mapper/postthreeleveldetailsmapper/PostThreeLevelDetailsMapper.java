package com.chance.ssm.mapper.postthreeleveldetailsmapper;

import com.chance.ssm.po.PostThreeLevelDetails;
import com.chance.ssm.po.PostThreeLevelDetailsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PostThreeLevelDetailsMapper {
    int countByExample(PostThreeLevelDetailsExample example);

    int deleteByExample(PostThreeLevelDetailsExample example);

    //删除三级帖子
    int deleteByPrimaryKey(String postThreeLevelDetailsId);

    int insert(PostThreeLevelDetails record);

    //发帖子
    int insertPostThreeLevelDetailsSelective(PostThreeLevelDetails record);

    List<PostThreeLevelDetails> selectByExampleWithBLOBs(PostThreeLevelDetailsExample example);

    List<PostThreeLevelDetails> selectByExample(PostThreeLevelDetailsExample example);

    //查看帖子详情
    PostThreeLevelDetails selectpostthreeleveldetailsByPrimaryKey(String postThreeLevelDetailsId);

    int updateByExampleSelective(@Param("record") PostThreeLevelDetails record, @Param("example") PostThreeLevelDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") PostThreeLevelDetails record, @Param("example") PostThreeLevelDetailsExample example);

    int updateByExample(@Param("record") PostThreeLevelDetails record, @Param("example") PostThreeLevelDetailsExample example);

    //修改帖子
    int updateByPrimaryKeySelective(PostThreeLevelDetails record);

    int updateByPrimaryKeyWithBLOBs(PostThreeLevelDetails record);

    int updateByPrimaryKey(PostThreeLevelDetails record);
    
    //查询精品帖子
    List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfo();
    
    //根据二级学术圈Idc查询帖子详情 
    List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfoByPostTwoId(String postTwoLevelId);
    
    //查询所有帖子
    List<PostThreeLevelDetails> selectPostThreeLevelDetailsAllInfo(Map<String,Integer> params);
    
    //查询所有帖子数量
    int selectPostThreeLevelDetailsAllInfoCount();
    
    //查询所有精品帖子(分页)
    List<PostThreeLevelDetails> selectPostThreeLevelDetailsManageInfo(Map<String,Integer> params);
    
    //根据二级学术圈Id查询所有帖子
    List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfoManageByPostTwoId(String postTwoLevelId,Integer start,Integer rows);
    
    //模糊查询帖子
    List<PostThreeLevelDetails> selectKeyWordFromPostThree(String _parameter);
}