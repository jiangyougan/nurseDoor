package com.chance.ssm.service;

import java.util.List;
import java.util.Map;

import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.vo.ComplaintUserAndNurseVo;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.po.vo.UserComplaintVo;

public interface ComplaintService {
	
	//添加投诉
	public  int insertSelective(Complaint record)throws Exception;
	
	//查询护士的所有评论与反馈
	public List<UserComplaintVo>selectCompatilByNurse(Map<String,Integer> params)throws Exception;
    
    //查询护士的所有评论与反馈
	public List<UserComplaintVo>selectCompatilByUser(Map<String,Integer> params)throws Exception;
	
	 //查询护士的所有评论与反馈数量
	public int selectCompatilByNurseCount()throws Exception;
    
    //查询用户的所有评论与反馈数量
	public int selectCompatilByUserCount()throws Exception;

	 // 查询对订单的投诉
	public List<ComplaintUserAndNurseVo> selectComplaintByUserTo(ComplaintVagueVo complaintVagueVo)throws Exception;
	
	//查询对订单的投诉的数量
	public int selectComplaintByUserToCount()throws Exception;
	
	 //修改
	public int updateByPrimaryKeySelective(Complaint record)throws Exception;
	
	 //取消的订单反馈修改
	public int updateCancelOrderComplaint(Complaint record)throws Exception;
	
	//根据订单ID和反馈的状态(取消和完成)查询反馈信息
	public Complaint selectComplaintByOrderSendIDAndSpare(String orderSendId,String complaintSparetwo,String orderCreatetime)throws Exception;
	
	 //查询投诉信息
	public Complaint selectByPrimaryKey(String complaintId)throws Exception;
	
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
    
    //用户或护士沟通反馈修改
    int updateUserOrNurseComplaintTo(Complaint record);
    
    //评价统计
    List<Complaint> selectcomplaintByType(String type);
    
    //查询沟通用户待付款订单
    Complaint selectComplaintByUserToGoutong(String orderSendId,String orderCreatetime);
}
