package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsExample;
import com.chance.ssm.po.RedPacketsUser;

public interface RedPacketsService {
	
	//查询所有红包
   public  List<RedPackets> selectByExample(RedPacketsExample example)throws Exception;

   //判断有没有添加过该类别的红包
   public RedPackets selectRedpacketsInfoByType(Integer redPacketsType)throws Exception;
   
   //添加红包
   public int insertSelective(RedPackets record)throws Exception;
   
   //通过ID查看红包
   public RedPackets selectByPrimaryKeyByResPacketsId(String redPackets)throws Exception;
   
   //修改红包
   public int updateByPrimaryKeySelective(RedPackets record)throws Exception;
   
   //发红包
   public  int insertSelectiveNurseRedPackets(RedPacketsUser record)throws Exception;
   
   //根据护士ID查询所有红包
   List<RedPacketsUser> selectRedPacketsNurseAllInfo(String nurseId);
}
