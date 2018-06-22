package com.chance.ssm.mapper.invitationmapper;

import com.chance.ssm.po.Invitation;
import com.chance.ssm.po.InvitationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvitationMapper {
    int countByExample(InvitationExample example);

    int deleteByExample(InvitationExample example);

    int insert(Invitation record);

    //插入邀请记录
    int insertSelective(Invitation record);

    List<Invitation> selectByExample(InvitationExample example);

    int updateByExampleSelective(@Param("record") Invitation record, @Param("example") InvitationExample example);

    int updateByExample(@Param("record") Invitation record, @Param("example") InvitationExample example);
    
    //查询邀请我的人
    Invitation selectinvitationMe(String invitationBeuserId);
}