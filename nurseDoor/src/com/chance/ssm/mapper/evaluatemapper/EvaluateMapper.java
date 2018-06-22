package com.chance.ssm.mapper.evaluatemapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.EvaluateUserAndNurseVO;
import com.chance.ssm.po.vo.EvaluateVO;

public interface EvaluateMapper {
    int countByExample(EvaluateExample example);

    int deleteByExample(EvaluateExample example);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    List<Evaluate> selectByExample(EvaluateExample example);

    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);
    
    //修改评价
    int updateByPrimaryKeySelective(Evaluate evaluate);

    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);
    
    //根据订单id查询评价内容
    Evaluate selectEvaluateInfoByOrderid(String evaluateOrderSendId);
    
    //根据条件查询数据，返回VO扩展类
    List<EvaluateVO> selectByExampleRuVO(EvaluateExample example);
    
    //根据二级服务ID查询对该服务所有的评价 
    List<EvaluateVO> selectEvaluateByContentId(String contentId);
    
    //查询用户有没有对订单进行评价
    List<EvaluateVO> selectRvaluateIsNo(String userId,String orderSendId);
    
    //查询好评(包括模糊查询)
    List<EvaluateUserAndNurseVO> selectGoodEvaluateInfoOfKeyWord(ComplaintVagueVo complaintVagueVo);
    
    //查询中评(包括模糊查询)
    List<EvaluateUserAndNurseVO> selectMiddleEvaluateInfoOfKeyWord(ComplaintVagueVo complaintVagueVo);
    
    //查询差评(包括模糊查询)
    List<EvaluateUserAndNurseVO> selectBadEvaluateInfoOfKeyWord(ComplaintVagueVo complaintVagueVo);
    
    int selectGoodEvaluateInfoOfKeyWordCount(ComplaintVagueVo complaintVagueVo);
    
    int selectMiddleEvaluateInfoOfKeyWordCount(ComplaintVagueVo complaintVagueVo);
    
    int selectBadEvaluateInfoOfKeyWordCOUNT(ComplaintVagueVo complaintVagueVo);
}