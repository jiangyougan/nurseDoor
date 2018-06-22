package com.chance.ssm.mapper.usersigninmapper;

import com.chance.ssm.po.UserSignin;
import com.chance.ssm.po.UserSigninExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSigninMapper {
    int countByExample(UserSigninExample example);

    int deleteByExample(UserSigninExample example);

    int insert(UserSignin record);

    int insertSelective(UserSignin record);

    List<UserSignin> selectByExample(UserSigninExample example);

    int updateByExampleSelective(@Param("record") UserSignin record, @Param("example") UserSigninExample example);

    int updateByExample(@Param("record") UserSignin record, @Param("example") UserSigninExample example);
    
    /**用户登入判断当天有无签到*/
    int selectUserSignin(String userId);
    
    /**用户去签到*/
    int userToSignin(String userId);
    
    /**用户签到统计 当日*/
    int selectUserSigninCountOnDay();
    
    /**用户签到统计 当周*/
    int selectUserSigninCountOnWeek();
    
    /**用户签到统计 当月*/
    int selectUserSigninCountOnMonth();
}