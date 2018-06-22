package com.chance.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseExample;
import com.chance.ssm.po.NurseExample.Criteria;
import com.chance.ssm.po.User;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.UserService;

/**
 * 更新经纬度控制类
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("latitude")
public class LatitudeAndLongitudeController {
	// 护士service
	@Autowired
	private NurseService nurseService;
	

	// 用户Service
	@Autowired
	private UserService userService;

	/**
	 * 更新护士端的经纬度
	 * 
	 * @param nurseid
	 *            护士ID
	 * @param latitude
	 *            经度
	 * @param longitude
	 *            纬度
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "nurselatiude", method = RequestMethod.POST)
	public @ResponseBody
	NetState NurseLatiude(String nurseid, Double latitude, Double longitude,
			HttpServletRequest request) {
		NetState netState = new NetState();
		if (nurseid == null || nurseid.equals("")) {
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (latitude == null || latitude.equals("")) {
			netState.setData("经度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (longitude == null || longitude.equals("")) {
			netState.setData("纬度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			//初始化护士实体类
			Nurse nurse2 = new Nurse();
			try {
				//根据ID查出来数据复制给护士实体类
				nurse2 = nurseService.selectForNurseId(nurseid);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//如果没有数据
			if (nurse2 == null) {
				netState.setData("没有此用户");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			} else {
				
				NurseExample nExample = new NurseExample();
				Criteria criteria = nExample.createCriteria();
				criteria.andNurseIdEqualTo(nurseid);
				Nurse nurse = new Nurse();
				nurse.setNursePositionX(latitude);
				nurse.setNursePositionY(longitude);
				try {
					int i = nurseService.updateByExampleSelective(nurse,
							nExample);
					if (i > 0) {
						netState.setData("更新成功");
						netState.setErrorCode(NetState.SUCCESS);
					} else {
						netState.setData("更新失败");
						netState.setErrorCode(NetState.PARAMS_ERROR);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}
		}
		return netState;

	}

	/**
	 * 更新用户端经纬度
	 * 
	 * @param userid
	 *            用户ID
	 * @param latitude
	 *            经度
	 * @param longitude
	 *            纬度
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "userlatiude", method = RequestMethod.POST)
	public @ResponseBody
	NetState UserLatiude(String userid, Double latitude, Double longitude,
			HttpServletRequest request) throws Exception{
		NetState netState = new NetState();
		if (userid == null || userid.equals("")) {
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (latitude == null || latitude.equals("")) {
			netState.setData("经度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (longitude == null || longitude.equals("")) {
			netState.setData("纬度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
				User user = new User();
				user = userService.selectForUserByID(userid);
			if (user == null || "".equals(user)) {
				netState.setData("没有此用户");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			} else {
				UserExample uExample = new UserExample();
				com.chance.ssm.po.UserExample.Criteria criteria = uExample
						.createCriteria();
				criteria.andUserIdEqualTo(userid);
				User user2 = new User();
				user2.setUserPositionX(latitude);
				user2.setUserPositionY(longitude);
				try {
					int i = userService.updateByExampleSelective(user2,
							uExample);
					if (i > 0) {
						netState.setData("更新成功");
						netState.setErrorCode(NetState.SUCCESS);
					} else {
						netState.setData("更新失败");
						netState.setErrorCode(NetState.PARAMS_ERROR);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return netState;

	}
}
