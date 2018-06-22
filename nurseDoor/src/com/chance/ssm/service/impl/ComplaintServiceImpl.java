package com.chance.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.complaintmapper.ComplaintMapper;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.vo.ComplaintUserAndNurseVo;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.UserComplaintVo;
import com.chance.ssm.service.ComplaintService;

public class ComplaintServiceImpl implements ComplaintService{

	@Autowired
	private ComplaintMapper complaintMapper;
	@Override
	public int insertSelective(Complaint record) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.insertSelective(record);
	}
	@Override
	public List<UserComplaintVo> selectCompatilByNurse(Map<String,Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByNurse(params);
	}
	@Override
	public List<UserComplaintVo> selectCompatilByUser(Map<String,Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByUser(params);
	}
	@Override
	public int selectCompatilByNurseCount() throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByNurseCount();
	}
	@Override
	public int selectCompatilByUserCount() throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByUserCount();
	}
	@Override
	public List<ComplaintUserAndNurseVo> selectComplaintByUserTo(
			ComplaintVagueVo complaintVagueVo) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectComplaintByUserTo(complaintVagueVo);
	}
	@Override
	public int selectComplaintByUserToCount() throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectComplaintByUserToCount();
	}
	@Override
	public int updateByPrimaryKeySelective(Complaint record) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int updateCancelOrderComplaint(Complaint record) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.updateCancelOrderComplaint(record);
	}
	@Override
	public Complaint selectComplaintByOrderSendIDAndSpare(
			String orderSendId, String complaintSparetwo,String orderCreatetime) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectComplaintByOrderSendIDAndSpare(orderSendId, complaintSparetwo,orderCreatetime);
	}
	@Override
	public Complaint selectByPrimaryKey(String complaintId) throws Exception {
		// TODO Auto-generated method stub
		return complaintMapper.selectByPrimaryKey(complaintId);
	}
	@Override
	public List<ComplaintUserAndNurseVo> selectCompatilByNurseToUser(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByNurseToUser(complaintVagueVo);
	}
	@Override
	public int selectCompatilByNurseToUserCount() {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByNurseToUserCount();
	}
	@Override
	public List<ComplaintUserAndNurseVo> selectCompatilByUserToNurse(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByUserToNurse(complaintVagueVo);
	}
	@Override
	public int selectCompatilByUserToNurseCount() {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByUserToNurseCount();
	}
	@Override
	public List<UserComplaintVo> selectCompatilByNurseKeyWord(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByNurseKeyWord(complaintVagueVo);
	}
	@Override
	public List<UserComplaintVo> selectCompatilByUserKeyWord(
			ComplaintVagueVo complaintVagueVo) {
		// TODO Auto-generated method stub
		return complaintMapper.selectCompatilByUserKeyWord(complaintVagueVo);
	}
	@Override
	public Complaint selectComplaintByUserOrNurseTo(String userId, int identity) {
		// TODO Auto-generated method stub
		return complaintMapper.selectComplaintByUserOrNurseTo(userId, identity);
	}
	@Override
	public int updateUserOrNurseComplaintTo(Complaint record) {
		// TODO Auto-generated method stub
		return complaintMapper.updateUserOrNurseComplaintTo(record);
	}
	@Override
	public List<Complaint> selectcomplaintByType(String type) {
		// TODO Auto-generated method stub
		return complaintMapper.selectcomplaintByType(type);
	}
	@Override
	public Complaint selectComplaintByUserToGoutong(String orderSendId,
			String orderCreatetime) {
		// TODO Auto-generated method stub
		return complaintMapper.selectComplaintByUserToGoutong(orderSendId, orderCreatetime);
	}

}
