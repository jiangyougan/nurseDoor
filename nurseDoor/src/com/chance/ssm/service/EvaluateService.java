package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.EvaluateUserAndNurseVO;
import com.chance.ssm.po.vo.EvaluateVO;

public interface EvaluateService {
	//根据不同的条件统计记录数量
	  public int countByExample(EvaluateExample example)throws Exception;
	  //根据不同的条件查询记录
	 public  List<Evaluate> selectByExample(EvaluateExample example) throws Exception;

	 //根据订单id查询评价内容
	 public  Evaluate selectEvaluateInfoByOrderid(String evaluateOrderSendId) throws Exception;
	 
	 //添加评价
	 public int insertSelective(Evaluate record)throws Exception;
	 
	 //根据条件查询数据，返回VO扩展类
	 public List<EvaluateVO> selectByExampleRuVO(EvaluateExample example)throws Exception;
	 
	 //根据二级服务ID查询对该服务所有的评价 
	 public  List<EvaluateVO> selectEvaluateByContentId(String contentId)throws Exception;
	 
	 //查询用户有没有对订单进行评价
	 public   List<EvaluateVO> selectRvaluateIsNo(String userId,String orderSendId);
	 
	 //查询好评(包括模糊查询)
    List<EvaluateUserAndNurseVO> selectGoodEvaluateInfoOfKeyWord(ComplaintVagueVo complaintVagueVo);
    
    //查询中评(包括模糊查询)
    List<EvaluateUserAndNurseVO> selectMiddleEvaluateInfoOfKeyWord(ComplaintVagueVo complaintVagueVo);
    
    //查询差评(包括模糊查询)
    List<EvaluateUserAndNurseVO> selectBadEvaluateInfoOfKeyWord(ComplaintVagueVo complaintVagueVo);
    
    int selectGoodEvaluateInfoOfKeyWordCount(ComplaintVagueVo complaintVagueVo);
    
    int selectMiddleEvaluateInfoOfKeyWordCount(ComplaintVagueVo complaintVagueVo);
    
    int selectBadEvaluateInfoOfKeyWordCOUNT(ComplaintVagueVo complaintVagueVo);
    
    //修改评价
    int updateByPrimaryKeySelective(Evaluate evaluate);
}
