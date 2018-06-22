package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.evaluatemapper.EvaluateMapper;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.EvaluateUserAndNurseVO;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.service.EvaluateService;

public class EvaluateServiceImpl implements EvaluateService {
	@Autowired
	private EvaluateMapper evaluateMapper;

	@Override
	public int countByExample(EvaluateExample example) throws Exception {
		// TODO Auto-generated method stub
		return evaluateMapper.countByExample(example);
	}

	@Override
	public List<Evaluate> selectByExample(EvaluateExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return evaluateMapper.selectByExample(example);
	}

	@Override
	public Evaluate selectEvaluateInfoByOrderid(String evaluateOrderSendId)
			throws Exception {
		// TODO Auto-generated method stub
		return evaluateMapper.selectEvaluateInfoByOrderid(evaluateOrderSendId);
	}

	@Override
	public int insertSelective(Evaluate record) throws Exception {
		// TODO Auto-generated method stub
		return evaluateMapper.insertSelective(record);
	}

	@Override
	public List<EvaluateVO> selectByExampleRuVO(EvaluateExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return evaluateMapper.selectByExampleRuVO(example);
	}

	@Override
	public List<EvaluateVO> selectEvaluateByContentId(String contentId)
			throws Exception {
		// TODO Auto-generated method stub
		return evaluateMapper.selectEvaluateByContentId(contentId);
	}

	@Override
	public List<EvaluateVO> selectRvaluateIsNo(String userId, String orderSendId) {
		// TODO Auto-generated method stub
		return evaluateMapper.selectRvaluateIsNo(userId, orderSendId);
	}

	@Override
	public List<EvaluateUserAndNurseVO> selectGoodEvaluateInfoOfKeyWord(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return evaluateMapper.selectGoodEvaluateInfoOfKeyWord(complaintVagueVo);
	}

	@Override
	public List<EvaluateUserAndNurseVO> selectMiddleEvaluateInfoOfKeyWord(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return evaluateMapper.selectMiddleEvaluateInfoOfKeyWord(complaintVagueVo);
	}

	@Override
	public List<EvaluateUserAndNurseVO> selectBadEvaluateInfoOfKeyWord(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return evaluateMapper.selectBadEvaluateInfoOfKeyWord(complaintVagueVo);
	}

	@Override
	public int selectGoodEvaluateInfoOfKeyWordCount(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return evaluateMapper.selectGoodEvaluateInfoOfKeyWordCount(complaintVagueVo);
	}

	@Override
	public int selectMiddleEvaluateInfoOfKeyWordCount(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return evaluateMapper.selectMiddleEvaluateInfoOfKeyWordCount(complaintVagueVo);
	}

	@Override
	public int selectBadEvaluateInfoOfKeyWordCOUNT(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return evaluateMapper.selectBadEvaluateInfoOfKeyWordCOUNT(complaintVagueVo);
	}

	@Override
	public int updateByPrimaryKeySelective(Evaluate evaluate) {
		// TODO Auto-generated method stub
		return evaluateMapper.updateByPrimaryKeySelective(evaluate);
	}

}
