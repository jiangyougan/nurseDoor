package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.ProtectedPersonExample;
import com.chance.ssm.po.ProtectedPersonExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.service.ProtectedAddressService;
import com.chance.ssm.service.ProtectedPersonService;

/**
 * 受护人控制类
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("protected")
public class ProtectedPersonController {

	@Autowired
	private ProtectedPersonService personService;
	
	@Autowired
	private ProtectedAddressService pAddressService;
	
	
	/**
	 * 根据用户的ID查询所有的受护人信息
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="selectprotectedbyuserid",method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectProtectedbyuserid(String userid)throws Exception{
		NetState netState = new NetState();
		if(userid == null || "".equals(userid)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			ProtectedPersonExample personExample = new ProtectedPersonExample();
			Criteria criteria = personExample.createCriteria();
			criteria.andProtectedUserIdEqualTo(userid);
			List<ProtectedPerson> personList = new ArrayList<ProtectedPerson>();
			personList = personService.selectByExample(personExample);
			for (ProtectedPerson protectedPerson : personList) {
				ProtectedAddress protectedAddress = new ProtectedAddress();
				protectedAddress = pAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
				String address = protectedAddress.getProtectedAddressAddress();
				if(protectedAddress != null){
					//获取经纬度
					protectedPerson.setProtectedAddress(address);
				}
			}
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(personList);
		}
		return netState;
		
	}
	/**
	 * 根据受护人ID查询受护人信息
	 * @param personId 受护人ID
	 * @return
	 */
	@RequestMapping(value="selectprotectedbyid",method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectProtectedById(String personId){
		NetState netState = new NetState();
		if(personId == null || "".equals(personId)){
			netState.setData("受护人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			ProtectedPerson protectedPerson = new ProtectedPerson();
			try {
				protectedPerson = personService.selectByPrimaryKey(personId);
				if(protectedPerson != null){
					String addressid = protectedPerson.getProtectedAddressId();
					
					ProtectedAddress protectedAddress = new ProtectedAddress();
					protectedAddress = pAddressService.selectByPrimaryKey(addressid);
					String address = protectedAddress.getProtectedAddressAddress();
					if(protectedAddress != null){
						//获取经纬度
						String longitude = protectedAddress.getProtectedAddressPositionX().toString();
						String latitude = protectedAddress.getProtectedAddressPositionY().toString();
						String newaddress = longitude+","+latitude+","+address;
						protectedPerson.setProtectedAddress(newaddress);
					}
				}
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(protectedPerson);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
		
	}
	
	/**
	 * 根据受护人ID删除受护人信息
	 * @param personId 受护人ID
	 * @param userId 用户ID
	 * @return
	 */
	@RequestMapping(value="delprotectedbyid",method = RequestMethod.POST)
	public @ResponseBody
	NetState DelProtectedById(String personId, String userId){
		NetState netState = new NetState();
		if(personId == null || "".equals(personId)){
			netState.setData("受护人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			try {
				//根据受护人ID删除数据
				int i = personService.deleteByPrimaryKey(personId);
				
				if(i > 0){
					//如果删除成功，则查询查询用户还有没有默认受护人
					List<ProtectedPerson> protectedPerson = new ArrayList<ProtectedPerson>();
					ProtectedPersonExample personExample = new ProtectedPersonExample();
					Criteria criteria = personExample.createCriteria();
					criteria.andProtectedUserIdEqualTo(userId);
					criteria.andProtectedDefaultEqualTo(1);
					protectedPerson = personService.selectByExample(personExample);
					if (protectedPerson.size() > 0) {
						netState.setData("删除成功");
						netState.setErrorCode(NetState.SUCCESS);
					}else{
						List<ProtectedPerson> protectedPerson2 = new ArrayList<ProtectedPerson>();
						ProtectedPersonExample personExample2 = new ProtectedPersonExample();
						Criteria criteria2 = personExample2.createCriteria();
						criteria2.andProtectedUserIdEqualTo(userId);
						protectedPerson2 = personService.selectByExample(personExample2);
						
						ProtectedPerson person = new ProtectedPerson();
						person.setProtectedAddress(protectedPerson2.get(0).getProtectedAddress());
						person.setProtectedAddressId(protectedPerson2.get(0).getProtectedAddressId());
						person.setProtectedDefault(1);
						person.setProtectedPersonAge(protectedPerson2.get(0).getProtectedPersonAge());
						person.setProtectedPersonCard(protectedPerson2.get(0).getProtectedPersonCard());
						person.setProtectedPersonGuardian(protectedPerson2.get(0).getProtectedPersonGuardian());
						person.setProtectedPersonId(protectedPerson2.get(0).getProtectedPersonId());
						person.setProtectedPersonName(protectedPerson2.get(0).getProtectedPersonName());
						person.setProtectedPersonNexus(protectedPerson2.get(0).getProtectedPersonNexus());
						person.setProtectedPersonNote(protectedPerson2.get(0).getProtectedPersonNote());
						person.setProtectedPersonPhone(protectedPerson2.get(0).getProtectedPersonPhone());
						person.setProtectedPersonSex(protectedPerson2.get(0).getProtectedPersonSex());
						person.setProtectedUserId(protectedPerson2.get(0).getProtectedUserId());
						int j = personService.updateByPrimaryKeySelective(person);
						if(j > 0){
							netState.setData("删除成功");
							netState.setErrorCode(NetState.SUCCESS);
						}
					}
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
	 * 修改默认受护人
	 * @param userId
	 * @param personId
	 * @param isdefault
	 * @return
	 */
	@RequestMapping(value="personisdefault", method = RequestMethod.POST)
	public @ResponseBody
	NetState PersonIsDefault(String userId,String personId, String isdefault){
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(personId == null || "".equals(personId)){
			netState.setData("受护人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(isdefault == null || "".equals(isdefault)){
			netState.setData("默认值错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			List<ProtectedPerson> persons = new ArrayList<ProtectedPerson>();
			if(Integer.parseInt(isdefault)==1){
				
				ProtectedPersonExample personExample = new ProtectedPersonExample();
				Criteria criteria = personExample.createCriteria();
				criteria.andProtectedDefaultEqualTo(1);
				criteria.andProtectedUserIdEqualTo(userId);
				try {
					persons = personService.selectByExample(personExample);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(persons.size() > 0){
				try {
					ProtectedPerson protectedPerson2 = new ProtectedPerson();
					protectedPerson2.setProtectedDefault(0);
					ProtectedPersonExample personExample2 = new ProtectedPersonExample();
					Criteria criteria2 = personExample2.createCriteria();
					criteria2.andProtectedUserIdEqualTo(persons.get(0)
							.getProtectedUserId());
					personService.updateByExampleSelective(
							protectedPerson2, personExample2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			ProtectedPerson protectedPerson = new ProtectedPerson();
			protectedPerson.setProtectedDefault(Integer.parseInt(isdefault));
			ProtectedPersonExample personExample = new ProtectedPersonExample();
			Criteria criteria = personExample.createCriteria();
			criteria.andProtectedPersonIdEqualTo(personId);
			try {
				int i = personService.updateByExampleSelective(protectedPerson, personExample);
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
	 * 根据受护人ID修改受护人信息
	 * 
	 * @param userId 用户ID
	 * 
	 * @param personId
	 *            受护人ID
	 * @param personName
	 *            受护人名字
	 * @param personSex
	 *            受护人性别（1男，2女）
	 * @param personCard
	 *            身份证号码
	 * @param personAge
	 *            年龄
	 * @param personGuardian
	 *            监护人
	 * @param personPhone
	 *            手机
	 * @param personnexus
	 *            关系
	 * @param addressId
	 *            关联受护地址id
	 * @param personNote
	 *            病例备注
	 * @param address
	 *            详细地址
	 * @param isdefault
	 *            是否默认（0否，1是）
	 * @return
	 */
	@RequestMapping(value="updateprotectedbyid",method = RequestMethod.POST)
	public @ResponseBody
	NetState UpdateProtectedById(String userId, String personId,String personName, String personSex,
			String personCard, String personAge, String personGuardian,Double personHeight,Double personWeight,
			String personPhone, String personnexus, String addressId,
			String personNote, String address, String isdefault, Double longitude, Double latitude,String detailedAddress )throws Exception{
		NetState netState = new NetState();
		if(personId == null || "".equals(personId)){
			netState.setData("受护人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(userId == null || "".equals(userId)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			String newaddressid = java.util.UUID.randomUUID()
					.toString().replaceAll("-", "");
			//如果没有关联地址ID则生成一个地址
			if(addressId == null || "".equals(addressId)){
				ProtectedAddress protectedAddress = new ProtectedAddress();
				protectedAddress.setProtectedAddressAddress(address);
				protectedAddress.setProtectedAddressCreatetime(new Date());
				protectedAddress.setProtectedAddressId(newaddressid);
				protectedAddress.setProtectedAddressPositionX(longitude);
				protectedAddress.setProtectedAddressPositionY(latitude);
				protectedAddress.setProtectedAddressUserid(userId);
					int i = pAddressService.insertSelective(protectedAddress);
					//插入数据库成功则更新受护人信息
					if(i > 0){
						ProtectedPerson protectedPerson = new ProtectedPerson();
					
						if (personName != null && !"".equals(personName)) {
							protectedPerson.setProtectedPersonName(personName);
						}
						if (personSex != null && !"".equals(personSex)) {
							protectedPerson.setProtectedPersonSex(personSex);
						}
						if (personCard != null && !"".equals(personCard)) {
							protectedPerson.setProtectedPersonCard(personCard);
						}
						if (personAge != null && !"".equals(personAge)) {
							protectedPerson.setProtectedPersonAge(personAge);
						}
						if (personGuardian != null && !"".equals(personGuardian)) {
							protectedPerson.setProtectedPersonGuardian(personGuardian);
						}
						if (personPhone != null && !"".equals(personPhone)) {
							protectedPerson.setProtectedPersonPhone(personPhone);
						}
						if (personnexus != null && !"".equals(personnexus)) {
							protectedPerson.setProtectedPersonNexus(personnexus);
						}
						
						protectedPerson.setProtectedAddressId(newaddressid);
						
						if (personNote != null && !"".equals(personNote)) {
							protectedPerson.setProtectedPersonNote(personNote);
						}
						if (address != null && !"".equals(address)) {
							protectedPerson.setProtectedAddress(address);
						}
						if (isdefault != null && !"".equals(isdefault)) {
							protectedPerson.setProtectedDefault(Integer.parseInt(isdefault));
						}
						if(detailedAddress!=null && !"".equals(detailedAddress)){
							protectedPerson.setProtectedPersonOverone(detailedAddress);
						}
						ProtectedPersonExample personExample = new ProtectedPersonExample();
						Criteria criteria = personExample.createCriteria();
						criteria.andProtectedPersonIdEqualTo(personId);
						int j = personService.updateByExampleSelective(protectedPerson, personExample);
						if(j > 0){
							netState.setData("修改成功");
							netState.setErrorCode(NetState.SUCCESS);
						}else{
							netState.setData("修改失败");
							netState.setErrorCode(NetState.PARAMS_ERROR);
						}
					}
			} else {
				//根据受护地址ID查询
				ProtectedAddress protectedAddress = pAddressService.selectByPrimaryKey(addressId);
				//如果有关联地址则不需要新建关联地址
				List<ProtectedPerson> persons = new ArrayList<ProtectedPerson>();
				if (isdefault != null && !"".equals(isdefault)) {
					if (Integer.parseInt(isdefault) == 1) {
						//如果是默认的则把以前的默认值去掉
						ProtectedPersonExample personExample = new ProtectedPersonExample();
						Criteria criteria = personExample.createCriteria();
						criteria.andProtectedDefaultEqualTo(1);
						criteria.andProtectedUserIdEqualTo(userId);
						try {
							persons = personService
									.selectByExample(personExample);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if (persons.size() > 0) {
						ProtectedPerson protectedPerson2 = new ProtectedPerson();
						protectedPerson2.setProtectedDefault(0);
						ProtectedPersonExample personExample2 = new ProtectedPersonExample();
						Criteria criteria2 = personExample2.createCriteria();
						criteria2.andProtectedUserIdEqualTo(persons.get(0)
								.getProtectedUserId());
						personService.updateByExampleSelective(
								protectedPerson2, personExample2);
				}
				// 把修改的数据插入实体类中
				ProtectedPerson protectedPerson = new ProtectedPerson();
				if (personName != null && !"".equals(personName)) {
					protectedPerson.setProtectedPersonName(personName);
				}
				if (personSex != null && !"".equals(personSex)) {
					protectedPerson.setProtectedPersonSex(personSex);
				}
				if (personCard != null && !"".equals(personCard)) {
					protectedPerson.setProtectedPersonCard(personCard);
				}
				if (personAge != null && !"".equals(personAge)) {
					protectedPerson.setProtectedPersonAge(personAge);
				}
				if (personGuardian != null && !"".equals(personGuardian)) {
					protectedPerson.setProtectedPersonGuardian(personGuardian);
				}
				if (personPhone != null && !"".equals(personPhone)) {
					protectedPerson.setProtectedPersonPhone(personPhone);
				}
				if (personnexus != null && !"".equals(personnexus)) {
					protectedPerson.setProtectedPersonNexus(personnexus);
				}
				if (addressId != null && !"".equals(addressId)) {
					protectedPerson.setProtectedAddressId(addressId);
				}
				if (personNote != null && !"".equals(personNote)) {
					protectedPerson.setProtectedPersonNote(personNote);
				}
				if (address != null && !"".equals(address)) {
					protectedPerson.setProtectedAddress(address);
				}
				if (isdefault != null && !"".equals(isdefault)) {
					protectedPerson.setProtectedDefault(Integer
							.parseInt(isdefault));
				}
				if(detailedAddress!=null && !"".equals(detailedAddress)){
					protectedPerson.setProtectedPersonOverone(detailedAddress);
				}
				protectedPerson.setProtectedAddress(protectedAddress.getProtectedAddressAddress());
				protectedPerson.setProtectedPersonHeight(personHeight);
				protectedPerson.setProtectedPersonWeight(personWeight);
				//修改数据库
				ProtectedPersonExample personExample = new ProtectedPersonExample();
				Criteria criteria = personExample.createCriteria();
				criteria.andProtectedPersonIdEqualTo(personId);

					int i = personService.updateByExampleSelective(
							protectedPerson, personExample);
					if (i > 0) {

						netState.setData("修改成功");
						netState.setErrorCode(NetState.SUCCESS);

					} else {
						netState.setData("修改失败");
						netState.setErrorCode(NetState.PARAMS_ERROR);
					}
			}
		}
		return netState;
		
	}

	/**
	 * 添加受护人信息
	 * 
	 * @param personName
	 *            受护人名字
	 * @param personSex
	 *            受护人性别（1男，2女）
	 * @param personCard
	 *            身份证号码
	 * @param personAge
	 *            年龄
	 * @param personGuardian
	 *            监护人
	 * @param personHeight 身高(cm)
	 *    
	 * @param personWeight 体重(kg)
	 *    
	 * @param personPhone
	 *            手机
	 * @param personnexus
	 *            关系
	 * @param addressId
	 *            关联受护地址id
	 * @param personNote
	 *            病例备注
	 * @param address
	 *            详细地址
	 * @param isdefault
	 *            是否默认（0否，1是）
	 * @param userId
	 *            用户ID
	 * @return
	 */
	@RequestMapping(value = "addprotected", method = RequestMethod.POST)
	public @ResponseBody
	NetState AddProtected( String personName, String personSex,
			String personCard, String personAge, String personGuardian,Double personHeight,Double personWeight,
			String personPhone, String personnexus, String addressId,
			String personNote, String address, String isdefault, String userId, Double longitude, Double latitude,String detailedAddress)throws Exception {
		NetState netState = new NetState();
		if (personName == null || "".equals(personName)) {
			netState.setData("受护人名字错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (personSex == null || "".equals(personSex)) {
			netState.setData("受护人性别错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}  else if (personAge == null || "".equals(personAge)) {
			netState.setData("年龄错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (personHeight == null || "".equals(personHeight)) {
			netState.setData("身高错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (personWeight == null || "".equals(personWeight)) {
			netState.setData("体重错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (personCard == null || "".equals(personCard)) {
			netState.setData("身份证号错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} 
		/*else if (personPhone == null || "".equals(personPhone)) {
			netState.setData("手机号码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} */
		else if (personnexus == null || "".equals(personnexus)) {
			netState.setData("关系错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);		 
		} 
		/*else if (personNote == null || "".equals(personNote)) {
			netState.setData("病例备注错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} */
		/*else if (address == null || "".equals(address)) {
			netState.setData("详细地址错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} */
		else if (userId == null || "".equals(userId)) {
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		/*else if (detailedAddress == null || "".equals(detailedAddress)) {
			netState.setData("请输入详细地址");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}*/
		
		else {
			//判断有没有同名的身份号
			int count = 0;
			count = personService.selectPersonCountByCard(personCard);
			if(count>0){
				netState.setData("该身份证号已绑定,请添加其他身份证号");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			String newaddressid = java.util.UUID.randomUUID()
					.toString().replaceAll("-", "");
			//统计用户现在已经有了多少个受护人
			ProtectedPersonExample personExample = new ProtectedPersonExample();
			Criteria criteria = personExample.createCriteria();
			criteria.andProtectedUserIdEqualTo(userId);
			int countNumber = 0;
			try {
				 countNumber = personService.countByExample(personExample);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if(addressId==null ||"".equals(addressId)){
				//如果传入的关联地址ID为空则新建一个关联地址
				ProtectedAddress protectedAddress = new ProtectedAddress();
				protectedAddress.setProtectedAddressAddress(address);
				protectedAddress.setProtectedAddressCreatetime(new Date());
				protectedAddress.setProtectedAddressId(newaddressid);
				if(longitude != null && !"".equals(longitude)){
					protectedAddress.setProtectedAddressPositionX(longitude);
				}else{
				}
				if(latitude != null && !"".equals(latitude)){
					protectedAddress.setProtectedAddressPositionY(latitude);
				}else{
				}
				protectedAddress.setProtectedAddressUserid(userId);
				try {
					int i = pAddressService.insertSelective(protectedAddress);
					if(i > 0){
						//如果关联地址新建成功则更新受护人信息
						ProtectedPerson protectedPerson = new ProtectedPerson();
						protectedPerson.setProtectedPersonId(java.util.UUID.randomUUID()
								.toString().replaceAll("-", ""));
						protectedPerson.setProtectedPersonName(personName);
						protectedPerson.setProtectedPersonSex(personSex);
						if (personCard != null && !"".equals(personCard)) {
							protectedPerson.setProtectedPersonCard(personCard);
						}
						protectedPerson.setProtectedPersonAge(personAge);
						protectedPerson.setProtectedPersonHeight(personHeight);
						protectedPerson.setProtectedPersonWeight(personWeight);
//						protectedPerson.setProtectedPersonGuardian(personGuardian);
						protectedPerson.setProtectedPersonPhone(personPhone);
						protectedPerson.setProtectedPersonNexus(personnexus);
						protectedPerson.setProtectedAddressId(newaddressid);
						protectedPerson.setProtectedPersonNote(personNote);
						protectedPerson.setProtectedAddress(address);
						//详细地址
						protectedPerson.setProtectedPersonOverone(detailedAddress);
						if(countNumber == 0){
							protectedPerson.setProtectedDefault(1);
						}else if (isdefault != null && !"".equals(isdefault)) {
							protectedPerson.setProtectedDefault(Integer
									.parseInt(isdefault));
						}
						protectedPerson.setProtectedUserId(userId);
						
						int j = personService.insertSelective(protectedPerson);
						if(j > 0){
							netState.setData("添加成功");
							netState.setErrorCode(NetState.SUCCESS);
						}else{
							netState.setData("添加失败");
							netState.setErrorCode(NetState.PARAMS_ERROR);
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				//根据受护地址ID查询
				ProtectedAddress protectedAddress = pAddressService.selectByPrimaryKey(addressId);
				//传入的关联地址不为空
				ProtectedPerson protectedPerson = new ProtectedPerson();
				protectedPerson.setProtectedPersonId(java.util.UUID
						.randomUUID().toString().replaceAll("-", ""));
				protectedPerson.setProtectedPersonName(personName);
				protectedPerson.setProtectedPersonSex(personSex);
				protectedPerson.setProtectedPersonCard(personCard);
				protectedPerson.setProtectedPersonAge(personAge);
				protectedPerson.setProtectedPersonHeight(personHeight);
				protectedPerson.setProtectedPersonWeight(personWeight);
				protectedPerson.setProtectedPersonGuardian(personGuardian);
				protectedPerson.setProtectedPersonPhone(personPhone);
				protectedPerson.setProtectedPersonNexus(personnexus);
				protectedPerson.setProtectedAddressId(addressId);
				protectedPerson.setProtectedAddress(protectedAddress.getProtectedAddressAddress());
				protectedPerson.setProtectedPersonNote(personNote);
				protectedPerson.setProtectedAddress(address);
				//详细地址
				protectedPerson.setProtectedPersonOverone(detailedAddress);
				if(countNumber == 0){
					protectedPerson.setProtectedDefault(1);
				}else if (isdefault != null && !"".equals(isdefault)) { 
					protectedPerson.setProtectedDefault(Integer
							.parseInt(isdefault));
				}
				protectedPerson.setProtectedUserId(userId);

				try {
					//插入数据库中
					int i = personService.insertSelective(protectedPerson);
					if (i > 0) {
						netState.setData("添加成功");
						netState.setErrorCode(NetState.SUCCESS);
					} else {
						netState.setData("添加失败");
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
