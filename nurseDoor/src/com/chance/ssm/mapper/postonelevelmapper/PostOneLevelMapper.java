package com.chance.ssm.mapper.postonelevelmapper;

import com.chance.ssm.po.PostOneLevel;
import com.chance.ssm.po.PostOneLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostOneLevelMapper {
    int countByExample(PostOneLevelExample example);

    int deleteByExample(PostOneLevelExample example);

    //删除一级学术圈
    int deletePostOneLevelByPrimaryKey(String postOneLevelId);

    int insert(PostOneLevel record);

    //添加一级
    int insertSelective(PostOneLevel record);

    //查询所有一级学术圈
    List<PostOneLevel> selectByExample(PostOneLevelExample example);

    PostOneLevel selectByPrimaryKey(String postOneLevelId);

    int updateByExampleSelective(@Param("record") PostOneLevel record, @Param("example") PostOneLevelExample example);

    int updateByExample(@Param("record") PostOneLevel record, @Param("example") PostOneLevelExample example);

    int updateByPrimaryKeySelective(PostOneLevel record);

    int updateByPrimaryKey(PostOneLevel record);
}