package com.chance.ssm.mapper.posttwolevelmapper;

import com.chance.ssm.po.PostTwoLevel;
import com.chance.ssm.po.PostTwoLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostTwoLevelMapper {
    int countByExample(PostTwoLevelExample example);

    int deleteByExample(PostTwoLevelExample example);

    int deleteByPrimaryKey(String postTwoLevelId);

    int insert(PostTwoLevel record);

    //添加二级学术圈
    int insertPostTwoLevelSelective(PostTwoLevel record);
    
    //根据一级学术圈ID删除下属的二级
    int deletePostTwoLevelByOneIdByPrimaryKey(String postOneLevelId);

    //查询所有二级学术圈的数据
    List<PostTwoLevel> selectPostTwoLevelByExample(PostTwoLevelExample example);

    PostTwoLevel selectByPrimaryKey(String postTwoLevelId);

    int updateByExampleSelective(@Param("record") PostTwoLevel record, @Param("example") PostTwoLevelExample example);

    int updateByExample(@Param("record") PostTwoLevel record, @Param("example") PostTwoLevelExample example);

    int updateByPrimaryKeySelective(PostTwoLevel record);

    int updateByPrimaryKey(PostTwoLevel record);
   
    //根据一级学术圈Id查询所有二级学术圈的数据
    List<PostTwoLevel> selectPostTwoLevelInfoByPostOneId(String postOneLevelId);
    
    //查询护士关注的二级学术圈 
    List<PostTwoLevel> selectPostNursefFocus(String nurseId);
    
    //根据二级学术圈id查询二级学术圈内容
    PostTwoLevel selectInfoByPostTwoId(String postTwoLevelId);
}