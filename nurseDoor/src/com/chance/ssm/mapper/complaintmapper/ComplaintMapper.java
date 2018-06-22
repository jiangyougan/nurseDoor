package com.chance.ssm.mapper.complaintmapper;

import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.ComplaintExample;
import com.chance.ssm.po.vo.ComplaintUserAndNurseVo;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.UserComplaintVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ComplaintMapper {
    int countByExample(ComplaintExample example);

    int deleteByExample(ComplaintExample example);

    int deleteByPrimaryKey(String complaintId);

    int insert(Complaint record);

    //添加投诉
    int insertSelective(Complaint record);

    List<Complaint> selectByExample(ComplaintExample example);

    //查询投诉信息
    Complaint selectByPrimaryKey(String complaintId);

    int updateByExampleSelective(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    //修改
    int updateByPrimaryKeySelective(Complaint record);
    
    //取消的订单反馈修改
    int updateCancelOrderComplaint(Complaint record);
    
    //用户或护士沟通反馈修改
    int updateUserOrNurseComplaintTo(Complaint record);

    int updateByPrimaryKey(Complaint record);
    
    //查询护士的所有评论与反馈
    List<UserComplaintVo>selectCompatilByNurse(Map<String,Integer> params);
    
    //查询用户的所有评论与反馈
    List<UserComplaintVo>selectCompatilByUser(Map<String,Integer> params);
    
    //查询护士的所有评论与反馈数量
    int selectCompatilByNurseCount();
    
    //查询用户的所有评论与反馈数量
    int selectCompatilByUserCount();
    
    //查询对订单的投诉的数量
    int selectComplaintByUserToCount();
    
    // 查询对订单的投诉
    List<ComplaintUserAndNurseVo> selectComplaintByUserTo(ComplaintVagueVo complaintVagueVo);
    
    //根据订单ID和反馈的状态(取消和完成)查询反馈信息
    Complaint selectComplaintByOrderSendIDAndSpare(String orderSendId,String complaintSparetwo,String orderCreatetime);
    
    //查询护士对用户的投诉(包括模糊查询)
    List<ComplaintUserAndNurseVo> selectCompatilByNurseToUser(ComplaintVagueVo complaintVagueVo);
    
    //查询护士对用户的投诉数量
    int selectCompatilByNurseToUserCount();
    
    //查询用户对护士的投诉(包括模糊查询)
    List<ComplaintUserAndNurseVo> selectCompatilByUserToNurse(ComplaintVagueVo complaintVagueVo);
    
    //查询用户对护士的投诉数量
    int selectCompatilByUserToNurseCount();
    
    //关键字查询护士对平台的投诉
    List<UserComplaintVo>selectCompatilByNurseKeyWord(ComplaintVagueVo complaintVagueVo);
    
    //关键字查询查询用户的对平台的投诉
    List<UserComplaintVo>selectCompatilByUserKeyWord(ComplaintVagueVo complaintVagueVo);
    
    //查询用户或护士沟通
    Complaint selectComplaintByUserOrNurseTo(String userId,int identity);
    
    //评价统计
    List<Complaint> selectcomplaintByType(String type);
    
    //查询沟通用户待付款订单
    Complaint selectComplaintByUserToGoutong(String orderSendId,String orderCreatetime);
    
}