package com.chance.ssm.service;

import com.chance.ssm.po.Invitation;

public interface InvitationService {
	//插入邀请记录
    public int insertSelective(Invitation record)throws Exception;

    //查询邀请我的人
    public Invitation selectinvitationMe(String invitationBeuserId)throws Exception;
}
