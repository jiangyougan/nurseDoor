package com.chance.ssm.mapper.postrollpicmapper;

import com.chance.ssm.po.PostRollPic;
import com.chance.ssm.po.PostRollPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostRollPicMapper {
    int countByExample(PostRollPicExample example);

    int deleteByExample(PostRollPicExample example);

    int deletePostEollpicByPrimaryKey(String postRollPicId);

    int insert(PostRollPic record);

    //添加轮播图
    int insertPostRollPicSelective(PostRollPic record);

    //查询所有轮播图
    List<PostRollPic> selectpostrollpicByExample(PostRollPicExample example);

    PostRollPic selectByPrimaryKey(String postRollPicId);

    int updateByExampleSelective(@Param("record") PostRollPic record, @Param("example") PostRollPicExample example);

    int updateByExample(@Param("record") PostRollPic record, @Param("example") PostRollPicExample example);

    //修改轮播图信息
    int updatePostRollPicByPrimaryKeySelective(PostRollPic record);

    int updateByPrimaryKey(PostRollPic record);

}