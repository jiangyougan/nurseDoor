package com.chance.ssm.service;

import java.util.List;
import java.util.Map;

import com.chance.ssm.po.PostNursefFocus;
import com.chance.ssm.po.PostOneLevel;
import com.chance.ssm.po.PostOneLevelExample;
import com.chance.ssm.po.PostRollPic;
import com.chance.ssm.po.PostRollPicExample;
import com.chance.ssm.po.PostThreeLevelDetails;
import com.chance.ssm.po.PostTwoLevel;
import com.chance.ssm.po.PostTwoLevelExample;

public interface PostService {

   //查询所有一级学术圈
   public List<PostOneLevel> selectByExample(PostOneLevelExample example)throws Exception;
   
   //添加一级
   public int insertSelective(PostOneLevel record)throws Exception;
   
   //查询所有二级学术圈的数据
   public List<PostTwoLevel> selectPostTwoLevelByExample(PostTwoLevelExample example)throws Exception;
   
   //根据一级学术圈Id查询所有二级学术圈的数据
   public List<PostTwoLevel> selectPostTwoLevelInfoByPostOneId(String postOneLevelId)throws Exception;
   
   //添加二级学术圈
   public int insertPostTwoLevelSelective(PostTwoLevel record)throws Exception;
   
   //发帖子
   public int insertPostThreeLevelDetailsSelective(PostThreeLevelDetails record)throws Exception;
   
   //查询精品帖子
   public List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfo()throws Exception;
   
   //查询护士关注的二级学术圈 
   public List<PostTwoLevel> selectPostNursefFocus(String nurseId)throws Exception;
   
   //添加护士关注
   public int insertPostnursefocusSelective(PostNursefFocus record)throws Exception;
   
   //根据护士Id删除护士关注
   public int deletePostNursefFocusByNurseId(String postNursefFocusNurseId)throws Exception;
   
   //根据二级学术圈Idc查询帖子详情 
   public List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfoByPostTwoId(String postTwoLevelId)throws Exception;
   
   //查看帖子详情
   public PostThreeLevelDetails selectpostthreeleveldetailsByPrimaryKey(String postThreeLevelDetailsId)throws Exception;
   
   //根据二级学术圈id查询二级学术圈内容
   public  PostTwoLevel selectInfoByPostTwoId(String postTwoLevelId)throws Exception;
   
   //查询学术圈所有轮播图
   public List<PostRollPic> selectpostrollpicByExample(PostRollPicExample example)throws Exception;
   
   //添加学术圈轮播图
   public int insertPostRollPicSelective(PostRollPic record)throws Exception;
   
   //修改学术圈轮播图信息
   public int updatePostRollPicByPrimaryKeySelective(PostRollPic record)throws Exception;
   
   //查询所有帖子
   public List<PostThreeLevelDetails> selectPostThreeLevelDetailsAllInfo(Map<String, Integer> map)throws Exception;
   
   //查询所有帖子数量
   public int selectPostThreeLevelDetailsAllInfoCount()throws Exception;
   
   //查询所有精品帖子(分页)
   public List<PostThreeLevelDetails> selectPostThreeLevelDetailsManageInfo(Map<String,Integer> params)throws Exception;
   
   //根据二级学术圈Id查询所有帖子
   public List<PostThreeLevelDetails> selectPostThreeLevelDetailsInfoManageByPostTwoId(String postTwoLevelId,Integer start,Integer rows)throws Exception;
   
   //修改帖子
   public int updateByPrimaryKeySelective(PostThreeLevelDetails record)throws Exception;
   
   //删除三级帖子
   public int deleteByPrimaryKey(String postThreeLevelDetailsId)throws Exception;
   
   //模糊查询帖子
   public List<PostThreeLevelDetails> selectKeyWordFromPostThree(String _parameter)throws Exception;
   
   //删除一级学术圈
   public int deletePostOneLevelByPrimaryKey(String postOneLevelId)throws Exception;
   
   //根据一级学术圈ID删除下属的二级
   public int deletePostTwoLevelByOneIdByPrimaryKey(String postOneLevelId)throws Exception;
   
}
