package com.chance.ssm.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.SigninSet;
import com.chance.ssm.po.User;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.vo.SelectUserThreeInfoVo;

public interface UserService {

	// 用户注册
	public int insertSelective(User record) throws Exception;

	// 通过账号查询用户
	public User selectForUserName(String userName) throws Exception;
	
	//查询用户
	public List<User> selectByExample(UserExample example)throws Exception;
	
	 //修改用户信息
	public int updateByPrimaryKeySelective(User record)throws Exception;
	
	 //查询所有用户
	public List<User>selectAllUserInfo(Map<String,Integer> params)throws Exception;

	// 查询所有服务
	public List<ManageNursingProject> SelectManageNursingProjectInfo()
			throws Exception;

	// 通过服务id查询包含多少小项
	public List<ManageNursingContent> SelectByManageNursingContentMaproject(
			String manageNursingContentMaproject) throws Exception;

	// 通过ID查询用户
	public User selectForUserByID(String userId) throws Exception;
	
	//根据传入的值不同更新用户信息
	public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) throws Exception;

	 //通过id查询用户当天是否已签到
    public int selectUserSignin(String userId)throws Exception;
    
    //用户去签到
    public int userToSignin(String userId)throws Exception;
    
    /**查询用户数*/
    public int selectUserCount()throws Exception;
    
    /**新增用户统计	当日*/
    public int selectUserCountOnDay()throws Exception;
    
    /**新增用户统计	当周*/
    public int selectUserCountOnWeek()throws Exception;
    
    /**新增用户统计	当月*/
    public int selectUserCountOnMonth()throws Exception;
    
    /**用户签到统计 当日*/
    public int selectUserSigninCountOnDay()throws Exception;
    
    /**用户签到统计 当周*/
    public int selectUserSigninCountOnWeek()throws Exception;
    
    /**用户签到统计 当月*/
    public int selectUserSigninCountOnMonth()throws Exception;
    
    //通过邀请码查看用户
    public User selectUserForInvitationcode(String userInvitationcode)throws Exception;
    
    //用户注册赠送的积分
    public SigninSet selectUserRegistermark()throws Exception;
    
    //查看我邀请的人
    public List<User> selectMyInvitationUserInfo(String userId)throws Exception;
    
    //根据用户账号，昵称，真实姓名，手机号，邀请码,支付宝账号查找用户
    public List<User> selectKeyWordFromUser(String _parameter)throws Exception;
    
    // 查询用户余额及支付宝账号和密码 
    public SelectUserThreeInfoVo selectUserThreeInfo(String userId)throws Exception;
    
    List<User> selectStatisticsUserSuccessMonth();
    
    List<User> selectStatisticsUserSuccessYear();
    
}
