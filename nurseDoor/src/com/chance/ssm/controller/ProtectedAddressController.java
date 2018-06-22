package com.chance.ssm.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedAddressExample;
import com.chance.ssm.po.ProtectedAddressExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.ProtectedAddressService;

/**
 * 受护人地址控制类 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("address")
public class ProtectedAddressController {
	
	@Autowired
	private ProtectedAddressService protectedAddressService;
	
	
	/**
	 * 根据ID删除受护人地址 
	 * @param addressid 受护人地址ID
	 * @return
	 */
	@RequestMapping(value="deladdressbyid",method = RequestMethod.POST)
	public @ResponseBody NetState  DelAddressById(String addressid){
		NetState netState = new NetState();
		if(addressid == null || "".equals(addressid)){
			netState.setData("地址ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			try {
				int i = protectedAddressService.deleteByPrimaryKey(addressid);
				if(i > 0){
					netState.setData("删除成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("删除失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
		
	}
	
	/**
	 * 修改受护人地址信息
	 * @param position_x 经度
	 * @param position_y 纬度
	 * @param address 详细地址
	 * @param addressid 地址ID
	 * @return
	 */
	@RequestMapping(value="updateaddress",method = RequestMethod.POST)
	public @ResponseBody
	NetState UpdateAddress(Double position_x, Double position_y, String address, String addressid){
		NetState netState = new NetState();
		if(position_x == null || "".equals(position_x)){
			netState.setData("经度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(position_y == null || "".equals(position_y)){
			netState.setData("纬度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(address == null || "".equals(address)){
			netState.setData("详细地址错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(addressid == null || "".equals(addressid)){
			netState.setData("地址ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			ProtectedAddress protectedAddress = new ProtectedAddress();
			protectedAddress.setProtectedAddressPositionX(position_x);
			protectedAddress.setProtectedAddressPositionY(position_y);
			protectedAddress.setProtectedAddressAddress(address);
			
			ProtectedAddressExample pAddressExample = new ProtectedAddressExample();
			Criteria criteria = pAddressExample.createCriteria();
			criteria.andProtectedAddressIdEqualTo(addressid);
			
			try {
				int i = protectedAddressService.updateByExampleSelective(protectedAddress, pAddressExample);
				if(i > 0){
					netState.setData("修改成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("修改失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
		
	}
	
	
	/**
	 * 添加受护人地址
	 * @param userid 用户ID
	 * @param position_x 经度
	 * @param position_y 纬度
	 * @param address 详细地址
	 * @return
	 */
	@RequestMapping(value="addaddress",method = RequestMethod.POST)
	public @ResponseBody
	NetState AddAddress(String userid, Double position_x, Double position_y, String address){
		NetState netState = new NetState();
		if(userid == null || "".equals(userid)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(position_x == null || "".equals(position_x)){
			netState.setData("经度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(position_y == null || "".equals(position_y)){
			netState.setData("纬度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(address == null || "".equals(address)){
			netState.setData("详细地址错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			ProtectedAddress protectedAddress = new ProtectedAddress();
			protectedAddress.setProtectedAddressId(java.util.UUID.randomUUID().toString().replaceAll("-", ""));
			protectedAddress.setProtectedAddressUserid(userid);
			protectedAddress.setProtectedAddressPositionX(position_x);
			protectedAddress.setProtectedAddressPositionY(position_y);
			protectedAddress.setProtectedAddressAddress(address);
			protectedAddress.setProtectedAddressCreatetime(new Date());
			
			try {
				int i = protectedAddressService.insertSelective(protectedAddress);
				if(i > 0){
					netState.setData("添加成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("添加失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
		
	}
	
	
}
