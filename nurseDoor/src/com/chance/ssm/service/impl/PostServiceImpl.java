package com.chance.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.postnursefocusmapper.PostNursefFocusMapper;
import com.chance.ssm.mapper.postonelevelmapper.PostOneLevelMapper;
import com.chance.ssm.mapper.postrollpicmapper.PostRollPicMapper;
import com.chance.ssm.mapper.postthreeleveldetailsmapper.PostThreeLevelDetailsMapper;
import com.chance.ssm.mapper.posttwolevelmapper.PostTwoLevelMapper;
import com.chance.ssm.po.PostNursefFocus;
import com.chance.ssm.po.PostOneLevel;
import com.chance.ssm.po.PostOneLevelExample;
import com.chance.ssm.po.PostRollPic;
import com.chance.ssm.po.PostRollPicExample;
import com.chance.ssm.po.PostThreeLevelDetails;
import com.chance.ssm.po.PostTwoLevel;
import com.chance.ssm.po.PostTwoLevelExample;
import com.chance.ssm.service.PostService;

public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostOneLevelMapper postOneLevelMapper;
	
	@Autowired
	private PostTwoLevelMapper postTwoLevelMapper;
	
	@Autowired
	private PostThreeLevelDetailsMapper postThreeLevelDetailsMapper;
	
	@Autowired
	private PostNursefFocusMapper postNursefFocusMapper;
	
	@Autowired
	private PostRollPicMapper postRollPicMapper;

	@Override
	public List<PostOneLevel> selectByExample(PostOneLevelExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return postOneLevelMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(PostOneLevel record) throws Exception {
		// TODO Auto-generated method stub
		return postOneLevelMapper.insertSelective(record);
	}

	@Override
	public List<PostTwoLevel> selectPostTwoLevelByExample(
			PostTwoLevelExample example) {
		// TODO Auto-generated method stub
		return postTwoLevelMapper.selectPostTwoLevelByExample(example);
	}

	@Override
	public List<PostTwoLevel> selectPostTwoLevelInfoByPostOneId(
			String postOneLevelId) throws Exception {
		// TODO Auto-generated method stub
		return postTwoLevelMapper.selectPostTwoLevelInfoByPostOneId(postOneLevelId);
	}

	@Override
	public int insertPostTwoLevelSelective(PostTwoLevel record) {
		// TODO Auto-generated method stub
		return postTwoLevelMapper.insertPostTwoLevelSelective(record);
	}

	@Override
	public int insertPostThreeLevelDetailsSelective(PostThreeLevelDetails record)
			throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.insertPostThreeLevelDetailsSelective(record);
	}

	@Override
	public List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfo()
			throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectPostThreeLevelDetailsInfo();
	}

	@Override
	public List<PostTwoLevel> selectPostNursefFocus(String nurseId)
			throws Exception {
		// TODO Auto-generated method stub
		return postTwoLevelMapper.selectPostNursefFocus(nurseId);
	}

	@Override
	public int insertPostnursefocusSelective(PostNursefFocus record) {
		// TODO Auto-generated method stub
		return postNursefFocusMapper.insertPostnursefocusSelective(record);
	}

	@Override
	public int deletePostNursefFocusByNurseId(String postNursefFocusNurseId) {
		// TODO Auto-generated method stub
		return postNursefFocusMapper.deletePostNursefFocusByNurseId(postNursefFocusNurseId);
	}

	@Override
	public List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfoByPostTwoId(
			String postTwoLevelId) throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectPostThreeLevelDetailsInfoByPostTwoId(postTwoLevelId);
	}

	@Override
	public PostThreeLevelDetails selectpostthreeleveldetailsByPrimaryKey(
			String postThreeLevelDetailsId) throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectpostthreeleveldetailsByPrimaryKey(postThreeLevelDetailsId);
	}

	@Override
	public PostTwoLevel selectInfoByPostTwoId(String postTwoLevelId)
			throws Exception {
		// TODO Auto-generated method stub
		return postTwoLevelMapper.selectInfoByPostTwoId(postTwoLevelId);
	}

	@Override
	public List<PostRollPic> selectpostrollpicByExample(
			PostRollPicExample example) throws Exception {
		// TODO Auto-generated method stub
		return postRollPicMapper.selectpostrollpicByExample(example);
	}

	@Override
	public int insertPostRollPicSelective(PostRollPic record) throws Exception {
		// TODO Auto-generated method stub
		return postRollPicMapper.insertPostRollPicSelective(record);
	}

	@Override
	public int updatePostRollPicByPrimaryKeySelective(PostRollPic record)
			throws Exception {
		// TODO Auto-generated method stub
		return postRollPicMapper.updatePostRollPicByPrimaryKeySelective(record);
	}

	@Override
	public List<PostThreeLevelDetails> selectPostThreeLevelDetailsAllInfo(
			Map<String, Integer> map) throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectPostThreeLevelDetailsAllInfo(map);
	}

	@Override
	public int selectPostThreeLevelDetailsAllInfoCount() {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectPostThreeLevelDetailsAllInfoCount();
	}

	@Override
	public List<PostThreeLevelDetails> selectPostThreeLevelDetailsManageInfo(
			Map<String, Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectPostThreeLevelDetailsManageInfo(params);
	}

	@Override
	public List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfoManageByPostTwoId(
			String postTwoLevelId,Integer start,Integer rows)
			throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectPostThreeLevelDetailsInfoManageByPostTwoId(postTwoLevelId, start,rows);
	}

	@Override
	public int updateByPrimaryKeySelective(PostThreeLevelDetails record)
			throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String postThreeLevelDetailsId)
			throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.deleteByPrimaryKey(postThreeLevelDetailsId);
	}

	@Override
	public List<PostThreeLevelDetails> selectKeyWordFromPostThree(
			String _parameter) throws Exception {
		// TODO Auto-generated method stub
		return postThreeLevelDetailsMapper.selectKeyWordFromPostThree(_parameter);
	}

	@Override
	public int deletePostOneLevelByPrimaryKey(String postOneLevelId)
			throws Exception {
		// TODO Auto-generated method stub
		return postOneLevelMapper.deletePostOneLevelByPrimaryKey(postOneLevelId);
	}

	@Override
	public int deletePostTwoLevelByOneIdByPrimaryKey(String postOneLevelId)
			throws Exception {
		// TODO Auto-generated method stub
		return postTwoLevelMapper.deletePostTwoLevelByOneIdByPrimaryKey(postOneLevelId);
	}
	
	

}
