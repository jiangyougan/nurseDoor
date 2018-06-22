package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.StandInnerLetter;

public interface StandInnerLetterService {
	 //添加站内信
    public int insertSelective(StandInnerLetter record)throws Exception;
    
    //查询护士的站内信
    public List<StandInnerLetter>selectStandInnerLetterNurseId(String standInnerLetterUserId)throws Exception;
    
    //查询护士的站内信
    public  List<StandInnerLetter>selectStandInnerLetterUserId(String standInnerLetterUserId)throws Exception;
    
    //根据用户或护士ID,站内信类型查询 
    List<StandInnerLetter>selectStandInnerLetteInfo(String roleId,int identity,int type);
    
    //根据用户或护士ID,站内信全部查询 
    List<StandInnerLetter>selectStandInnerLetteInfoAll(String roleId,int identity);
    
    //根据用户或护士ID删除全部站内信
    int deleteByPrimaryKeyByUserIdOrNurseId(String roleId,int identity);
    
    // 根据用户或护士ID和类型删除站内信
    int deleteByPrimaryKeyByUserIdOrNurseIdAndType(String roleId,int identity,int type);
}
