package com.chance.ssm.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.DrawMoney;
import com.chance.ssm.po.DrawMoneyExample;
import com.chance.ssm.po.vo.ComplaintVagueVo;

public interface DrawMoneyService {
	
	//用户或护士提现
	public int insertSelective(DrawMoney record)throws Exception;
	
	//查询用户正在申请提现的数据
	public List<DrawMoney> selectUserDrawMoneyNow(ComplaintVagueVo complaintVagueVo)throws Exception;
	
	 //查询用户提现过的数据
	public List<DrawMoney> selectUserDrawMoneyNed(ComplaintVagueVo complaintVagueVo)throws Exception;
    
    //查询护士正在申请提现的数据
	public List<DrawMoney> selectNurseDrawMoneyNow(ComplaintVagueVo complaintVagueVo)throws Exception;
	
	  //查询护士提现过的数据
	public List<DrawMoney> selectNurseDrawMoneyNed(ComplaintVagueVo complaintVagueVo)throws Exception;
	
	//查询用户正在申请提现的数据的数量
	public int selectUserDrawMoneyNowCount()throws Exception;
    
    //查询用户提现过的数据的数量
	public int selectUserDrawMoneyNedCount()throws Exception;
    
    //查询护士正在申请提现的数据的数量 
	public int selectNurseDrawMoneyNowCount()throws Exception;
    
    //查询护士提现过的数据的数量
	public int selectNurseDrawMoneyNedCount()throws Exception;
	
	//修改状态
	public  int updateByExampleSelective(@Param("record") DrawMoney record, @Param("example") DrawMoneyExample example)throws Exception;
}
