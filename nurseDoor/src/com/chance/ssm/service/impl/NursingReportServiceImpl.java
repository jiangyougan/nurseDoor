package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.caselablemapper.CaseLableMapper;
import com.chance.ssm.mapper.nursingreportmapper.NursingReportMapper;
import com.chance.ssm.po.CaseLable;
import com.chance.ssm.po.NursingReport;
import com.chance.ssm.po.NursingReportExample;
import com.chance.ssm.po.vo.NursingReportKeyWordVO;
import com.chance.ssm.po.vo.NursingUserAndNurseVO;
import com.chance.ssm.po.vo.ReportVO;
import com.chance.ssm.service.NursingReportService;

public class NursingReportServiceImpl implements NursingReportService{

	@Autowired
	private NursingReportMapper nursingReportMapper;
	
	@Autowired
	private CaseLableMapper caseLableMapper;
	
	@Override
	public List<ReportVO> selectReportByUserId(String orderSendUserid) {
		// TODO Auto-generated method stub
		return nursingReportMapper.selectReportByUserId(orderSendUserid);
	}

	@Override
	public List<ReportVO> selectReportByUserIdAndPersonCard(ReportVO reportVO) {
		// TODO Auto-generated method stub
		return nursingReportMapper.selectReportByUserIdAndPersonCard(reportVO);
	}

	@Override
	public NursingReport selectReportByOrderId(String nursingReportOrderid)
			throws Exception {
		// TODO Auto-generated method stub
		return nursingReportMapper.selectReportByOrderId(nursingReportOrderid);
	}

	@Override
	public List<CaseLable> selectAllLableInfo() throws Exception {
		// TODO Auto-generated method stub
		return caseLableMapper.selectAllLableInfo();
	}

	@Override
	public int insertSelective(NursingReport record) throws Exception {
		// TODO Auto-generated method stub
		return nursingReportMapper.insertSelective(record);
	}

	@Override
	public List<ReportVO> selectReportByUserIdAndPersonCardByNurseId(
			String nurseId) {
		// TODO Auto-generated method stub
		return nursingReportMapper.selectReportByUserIdAndPersonCardByNurseId(nurseId);
	}

	@Override
	public List<NursingReport> selectByExample(NursingReportExample example) {
		// TODO Auto-generated method stub
		return nursingReportMapper.selectByExample(example);
	}

	@Override
	public List<NursingUserAndNurseVO> selectAllNursingReportAndkeyWord(
			NursingReportKeyWordVO nursingReportKeyWordVO) {
		// TODO Auto-generated method stub
		return nursingReportMapper.selectAllNursingReportAndkeyWord(nursingReportKeyWordVO);
	}

	@Override
	public int selectAllNursingReportAndkeyWordCount(NursingReportKeyWordVO nursingReportKeyWordVO) {
		// TODO Auto-generated method stub
		return nursingReportMapper.selectAllNursingReportAndkeyWordCount(nursingReportKeyWordVO);
	}

}
