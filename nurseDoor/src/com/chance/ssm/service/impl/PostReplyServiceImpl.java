package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.postreplymapper.PostReplyMapper;
import com.chance.ssm.po.PostReply;
import com.chance.ssm.service.PostReplyService;

public class PostReplyServiceImpl implements PostReplyService{
	
	@Autowired
	private PostReplyMapper postReplyMapper;

	@Override
	public List<PostReply> selectPostReplyByThreePsotId(
			String postReplyPostThreeId) throws Exception {
		// TODO Auto-generated method stub
		return postReplyMapper.selectPostReplyByThreePsotId(postReplyPostThreeId);
	}

	@Override
	public int insertSelective(PostReply record) throws Exception {
		// TODO Auto-generated method stub
		return postReplyMapper.insertSelective(record);
	}

	@Override
	public PostReply selectPostReplyForNurse(String postReplyReplyToPeople,String postReplyPostThreeId)
			throws Exception {
		// TODO Auto-generated method stub
		return postReplyMapper.selectPostReplyForNurse(postReplyReplyToPeople,postReplyPostThreeId);
	}

	@Override
	public PostReply selectMaxPostNote(String postReplyPostThreeId)
			throws Exception {
		// TODO Auto-generated method stub
		return postReplyMapper.selectMaxPostNote(postReplyPostThreeId);
	}

}
