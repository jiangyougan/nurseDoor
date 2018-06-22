package com.chance.ssm.mapper.postreplymapper;

import com.chance.ssm.po.PostReply;
import com.chance.ssm.po.PostReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostReplyMapper {
    int countByExample(PostReplyExample example);

    int deleteByExample(PostReplyExample example);

    int deleteByPrimaryKey(String postReplyId);

    int insert(PostReply record);

    //添加回复
    int insertSelective(PostReply record);

    List<PostReply> selectByExample(PostReplyExample example);

    PostReply selectByPrimaryKey(String postReplyId);

    int updateByExampleSelective(@Param("record") PostReply record, @Param("example") PostReplyExample example);

    int updateByExample(@Param("record") PostReply record, @Param("example") PostReplyExample example);

    int updateByPrimaryKeySelective(PostReply record);

    int updateByPrimaryKey(PostReply record);
    
    //根据三级帖子id查询所有回复
    List<PostReply>selectPostReplyByThreePsotId(String postReplyPostThreeId);
    
    //查看我是不是第一次回复该帖子
    PostReply selectPostReplyForNurse(@Param("postReplyReplyToPeople")String postReplyReplyToPeople,@Param("postReplyPostThreeId")String postReplyPostThreeId);
    
    //获取最大的帖子标识
    PostReply selectMaxPostNote(String postReplyPostThreeId);
}