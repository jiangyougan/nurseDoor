package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.PostReply;

public interface PostReplyService {
	
	//根据三级帖子id查询所有回复
    public  List<PostReply>selectPostReplyByThreePsotId(String postReplyPostThreeId)throws Exception;
    
    //添加回复
    public int insertSelective(PostReply record)throws Exception;
    
    //查看我是不是第一次回复
    public PostReply selectPostReplyForNurse(String postReplyReplyToPeople,String postReplyPostThreeId)throws Exception;
    
    //获取最大的帖子标识
    public PostReply selectMaxPostNote(String postReplyPostThreeId)throws Exception;

}
