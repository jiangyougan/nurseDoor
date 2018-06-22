package com.chance.ssm.mapper.postnursefocusmapper;

import com.chance.ssm.po.PostNursefFocus;
import com.chance.ssm.po.PostNursefFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostNursefFocusMapper {
    int countByExample(PostNursefFocusExample example);

    int deleteByExample(PostNursefFocusExample example);

    int deleteByPrimaryKey(String postNursefFocusId);

    int insert(PostNursefFocus record);

    //添加护士关注
    int insertPostnursefocusSelective(PostNursefFocus record);
    
    //根据护士Id删除护士关注
    int deletePostNursefFocusByNurseId(String postNursefFocusNurseId);

    List<PostNursefFocus> selectByExample(PostNursefFocusExample example);

    PostNursefFocus selectByPrimaryKey(String postNursefFocusId);

    int updateByExampleSelective(@Param("record") PostNursefFocus record, @Param("example") PostNursefFocusExample example);

    int updateByExample(@Param("record") PostNursefFocus record, @Param("example") PostNursefFocusExample example);

    int updateByPrimaryKeySelective(PostNursefFocus record);

    int updateByPrimaryKey(PostNursefFocus record);
}