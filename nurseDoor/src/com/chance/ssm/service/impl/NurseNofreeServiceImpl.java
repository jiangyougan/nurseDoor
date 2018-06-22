package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.nursenofreemapper.NurseNofreeMapper;
import com.chance.ssm.mapper.nursenofreeshiftmapper.NurseNofreeShiftMapper;
import com.chance.ssm.po.NurseNofree;
import com.chance.ssm.po.NurseNofreeExample;
import com.chance.ssm.po.NurseNofreeShift;
import com.chance.ssm.po.NurseNofreeShiftExample;
import com.chance.ssm.po.vo.NurseNoFreeVo;
import com.chance.ssm.service.NurseNofreeService;

public class NurseNofreeServiceImpl implements NurseNofreeService {
	
	@Autowired
	private NurseNofreeMapper nofreeMapper;
	
	@Autowired
	private NurseNofreeShiftMapper nofreeShiftMapper;

	@Override
	public List<NurseNofree> selectByExample(NurseNofreeExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(NurseNofree record) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.insertSelective(record);
	}

	@Override
	public NurseNoFreeVo selectByExampleOne(String nurseNofreeNurseid)
			throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.selectByExampleOne(nurseNofreeNurseid);
	}

	@Override
	public int updateByPrimaryKeySelective(NurseNofree record) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String nurseNofreeId) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.deleteByPrimaryKey(nurseNofreeId);
	}

	@Override
	public List<NurseNoFreeVo> selectNurseNotFreeTimeThirdWeed(
			String nurseNofreeNurseid) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.selectNurseNotFreeTimeThirdWeed(nurseNofreeNurseid);
	}

	@Override
	public List<NurseNoFreeVo> selectNurseNoFreeTimeForSomeOneDay(
			String nurseNofreeNurseid, String date) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.selectNurseNoFreeTimeForSomeOneDay(nurseNofreeNurseid, date);
	}

	@Override
	public int deleteByNurseIdANdDateAdnShiftId(String date, String nurseId,
			String noFreeshiftId) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.deleteByNurseIdANdDateAdnShiftId(date, nurseId, noFreeshiftId);
	}

	@Override
	public int updateByExampleSelective(NurseNofree record,
			NurseNofreeExample example) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByNurseIdANdDateAdnShiftId(String note, String date,
			String nurseId, String noFreeshiftId) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.updateByNurseIdANdDateAdnShiftId(note, date, nurseId, noFreeshiftId);
	}

	@Override
	public List<NurseNofree> selectCommonNoFreeInfo(String nurseNofreeShiftId,
			String nofreeDate) throws Exception {
		// TODO Auto-generated method stub
		return nofreeMapper.selectCommonNoFreeInfo(nurseNofreeShiftId, nofreeDate);
	}

	@Override
	public int insertSelectiveShift(NurseNofreeShift record) throws Exception {
		// TODO Auto-generated method stub
		return nofreeShiftMapper.insertSelectiveShift(record);
	}

	@Override
	public int selectNurseNofreeShiftByName(String nurseNofreeShiftName,String nurseNofreeShiftNurseId)
			throws Exception {
		// TODO Auto-generated method stub
		return nofreeShiftMapper.selectNurseNofreeShiftByName(nurseNofreeShiftName,nurseNofreeShiftNurseId);
	}

	@Override
	public NurseNofreeShift selectByPrimaryKeyByShiftId(
			String nurseNofreeShiftId) throws Exception {
		// TODO Auto-generated method stub
		return nofreeShiftMapper.selectByPrimaryKeyByShiftId(nurseNofreeShiftId);
	}

	@Override
	public int updateByPrimaryKeySelectiveNofreeShiftId(NurseNofreeShift record) {
		// TODO Auto-generated method stub
		return nofreeShiftMapper.updateByPrimaryKeySelectiveNofreeShiftId(record);
	}

	@Override
	public List<NurseNofreeShift> selectByExampleShift(
			NurseNofreeShiftExample example) throws Exception {
		// TODO Auto-generated method stub
		return nofreeShiftMapper.selectByExampleShift(example);
	}

}
