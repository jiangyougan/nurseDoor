package com.chance.ssm.mapper.usermapper;

import com.chance.ssm.po.User;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.vo.SelectUserThreeInfoVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    //用户注册
    int insertSelective(User record);
    
    //通过账号查询用户
    User selectForUserName(String userName);
    
    //通过ID查询用户
    User selectForUserByID(String userId);

    //查询用户
    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
    
    //修改用户信息
    int updateByPrimaryKeySelective(User record);

    
    /**查询用户数*/
    int selectUserCount();
    
    /**新增用户统计	当日*/
    int selectUserCountOnDay();
    
    /**新增用户统计	当周*/
    int selectUserCountOnWeek();
    
    /**新增用户统计	当月*/
    int selectUserCountOnMonth();
    
    //通过邀请码查看用户
    User selectUserForInvitationcode(String userInvitationcode);
    
    //查看我邀请的人
    List<User> selectMyInvitationUserInfo(String userId);
    
    //查询所有用户
    List<User>selectAllUserInfo(Map<String,Integer> params);
    
    //根据用户账号，昵称，真实姓名，手机号，邀请码,支付宝账号查找用户
    List<User> selectKeyWordFromUser(String _parameter);
    
    // 查询用户余额及支付宝账号和密码 
    SelectUserThreeInfoVo selectUserThreeInfo(String userId);
    
    List<User> selectStatisticsUserSuccessMonth();
    
    List<User> selectStatisticsUserSuccessYear();
}