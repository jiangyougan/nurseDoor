package com.chance.ssm.mapper.nursesigninmapper;

import com.chance.ssm.po.NurseSignin;
import com.chance.ssm.po.NurseSigninExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseSigninMapper {
    int countByExample(NurseSigninExample example);

    int deleteByExample(NurseSigninExample example);
    
    int insert(NurseSignin record);

    int insertSelective(NurseSignin record);

    List<NurseSignin> selectByExample(NurseSigninExample example);

    int updateByExampleSelective(@Param("record") NurseSignin record, @Param("example") NurseSigninExample example);

    int updateByExample(@Param("record") NurseSignin record, @Param("example") NurseSigninExample example);
    
    /**护士登入判断当天有无签到*/
    int selectNurseSignin(String nurseId);
    
    /**护士去签到*/
    int nurseToSignin(String nurseId);
    
    /**护士签到统计 当日*/
    int selectNurseSigninCountOnDay();
    
    /**护士签到统计 当周*/
    int selectNurseSigninCountOnWeek();
    
    /**护士签到统计 当月*/
    int selectNurseSigninCountOnMonth();
}