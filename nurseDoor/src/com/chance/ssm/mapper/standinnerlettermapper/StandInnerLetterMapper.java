package com.chance.ssm.mapper.standinnerlettermapper;

import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.StandInnerLetterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StandInnerLetterMapper {
    int countByExample(StandInnerLetterExample example);

    int deleteByExample(StandInnerLetterExample example);

    int insert(StandInnerLetter record);

    //添加站内信
    int insertSelective(StandInnerLetter record);

    List<StandInnerLetter> selectByExample(StandInnerLetterExample example);

    int updateByExampleSelective(@Param("record") StandInnerLetter record, @Param("example") StandInnerLetterExample example);

    int updateByExample(@Param("record") StandInnerLetter record, @Param("example") StandInnerLetterExample example);
    
    
    //查询护士的站内信
    List<StandInnerLetter>selectStandInnerLetterNurseId(String standInnerLetterUserId);
    
    //查询护士的站内信
    List<StandInnerLetter>selectStandInnerLetterUserId(String standInnerLetterUserId);
    
    //根据用户或护士ID,站内信类型查询 
    List<StandInnerLetter>selectStandInnerLetteInfo(String roleId,int identity,int type);
    
    //根据用户或护士ID,站内信全部查询 
    List<StandInnerLetter>selectStandInnerLetteInfoAll(String roleId,int identity);
    
    //根据用户或护士ID删除全部站内信
    int deleteByPrimaryKeyByUserIdOrNurseId(String roleId,int identity);
    
    // 根据用户或护士ID和类型删除站内信
    int deleteByPrimaryKeyByUserIdOrNurseIdAndType(String roleId,int identity,int type);
}