package com.chance.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.managenursingcontentmapper.ManageNursingContentMapper;
import com.chance.ssm.mapper.managenursingprojectmapper.ManageNursingProjectMapper;
import com.chance.ssm.mapper.signinsetmapper.SigninSetMapper;
import com.chance.ssm.mapper.usermapper.UserMapper;
import com.chance.ssm.mapper.usersigninmapper.UserSigninMapper;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.SigninSet;
import com.chance.ssm.po.User;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.vo.SelectUserThreeInfoVo;
import com.chance.ssm.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ManageNursingProjectMapper manageNursingProjectMapper;
	
	@Autowired
	private ManageNursingContentMapper manageNursingContentMapper;
	
	@Autowired
	private UserSigninMapper userSigninMapper;
	
	@Autowired
	private SigninSetMapper signinSetMapper;
	
	@Override
	public int insertSelective(User record) throws Exception {
		
		return userMapper.insertSelective(record);
	}
	@Override
	public User selectForUserName(String userName) throws Exception {
		
		return userMapper.selectForUserName(userName);
	}
	@Override
	public List<ManageNursingProject> SelectManageNursingProjectInfo() {
		
		return manageNursingProjectMapper.SelectManageNursingProjectInfo();
	}
	@Override
	public List<ManageNursingContent> SelectByManageNursingContentMaproject(
			String manageNursingContentMaproject) throws Exception {
		
		return manageNursingContentMapper.SelectByManageNursingContentMaproject(manageNursingContentMaproject);
	}
	@Override
	public User selectForUserByID(String userId) throws Exception {
		
		return userMapper.selectForUserByID(userId);
	}
	@Override
	public int updateByExampleSelective(User record, UserExample example)
			throws Exception {
		
		return userMapper.updateByExampleSelective(record, example);
	}
	@Override
	public int selectUserSignin(String userId) throws Exception {
		
		return userSigninMapper.selectUserSignin(userId);
	}
	@Override
	public int userToSignin(String userId) throws Exception {
		
		return userSigninMapper.userToSignin(userId);
	}
	@Override
	public int selectUserCount() throws Exception {
		
		return userMapper.selectUserCount();
	}
	@Override
	public int selectUserCountOnDay() throws Exception {
		
		return userMapper.selectUserCountOnDay();
	}
	@Override
	public int selectUserCountOnWeek() throws Exception {
		
		return userMapper.selectUserCountOnWeek();
	}
	@Override
	public int selectUserCountOnMonth() throws Exception {
		
		return userMapper.selectUserCountOnMonth();
	}
	@Override
	public int selectUserSigninCountOnDay() throws Exception {
		
		return userSigninMapper.selectUserSigninCountOnDay();
	}
	@Override
	public int selectUserSigninCountOnWeek() throws Exception {
		
		return userSigninMapper.selectUserSigninCountOnWeek();
	}
	@Override
	public int selectUserSigninCountOnMonth() throws Exception {
		
		return userSigninMapper.selectUserSigninCountOnMonth();
	}


	@Override
	public User selectUserForInvitationcode(String userInvitationcode) {
		// TODO Auto-generated method stub
		return userMapper.selectUserForInvitationcode(userInvitationcode);
	}
	@Override
	public SigninSet selectUserRegistermark() throws Exception {
		// TODO Auto-generated method stub
		return signinSetMapper.selectUserRegistermark();
	}
	@Override
	public List<User> selectMyInvitationUserInfo(String userId)
			throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectMyInvitationUserInfo(userId);
	}
	@Override
	public List<User> selectByExample(UserExample example) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(example);
	}
	@Override
	public List<User> selectAllUserInfo(Map<String,Integer> params) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectAllUserInfo(params);
	}
	@Override
	public List<User> selectKeyWordFromUser(String _parameter) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectKeyWordFromUser(_parameter);
	}
	@Override
	public int updateByPrimaryKeySelective(User record) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public SelectUserThreeInfoVo selectUserThreeInfo(String userId)
			throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectUserThreeInfo(userId);
	}
	@Override
	public List<User> selectStatisticsUserSuccessMonth() {
		// TODO Auto-generated method stub
		return userMapper.selectStatisticsUserSuccessMonth();
	}
	@Override
	public List<User> selectStatisticsUserSuccessYear() {
		// TODO Auto-generated method stub
		return userMapper.selectStatisticsUserSuccessYear();
	}
	
}
