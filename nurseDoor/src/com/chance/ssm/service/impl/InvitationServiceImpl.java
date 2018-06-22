package com.chance.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.invitationmapper.InvitationMapper;
import com.chance.ssm.po.Invitation;
import com.chance.ssm.service.InvitationService;

public class InvitationServiceImpl implements InvitationService{
	
	@Autowired
	private InvitationMapper invitationMapper;

	@Override
	public int insertSelective(Invitation record) throws Exception {
		// TODO Auto-generated method stub
		return invitationMapper.insertSelective(record);
	}

	@Override
	public Invitation selectinvitationMe(String invitationBeuserId)
			throws Exception {
		// TODO Auto-generated method stub
		return invitationMapper.selectinvitationMe(invitationBeuserId);
	}

}
