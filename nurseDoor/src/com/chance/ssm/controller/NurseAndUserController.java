package com.chance.ssm.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliyunSms.AliyunSmsUtil;
import com.aliyunSms.SmsEnum;
import com.chance.ssm.po.Complaint;
import com.chance.ssm.po.Coupon;
import com.chance.ssm.po.CouponUser;
import com.chance.ssm.po.DrawMoney;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.EvaluateExample.Criteria;
import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.Follow;
import com.chance.ssm.po.FollowExample;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.Hospital;
import com.chance.ssm.po.HospitalExample;
import com.chance.ssm.po.Invitation;
import com.chance.ssm.po.Major;
import com.chance.ssm.po.MajorExample;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseExample;
import com.chance.ssm.po.NurseNofree;
import com.chance.ssm.po.NurseNofreeExample;
import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.OrderReceiverExample;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.Package;
import com.chance.ssm.po.PackageExample;
import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.po.SigninSet;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.SimpleMajorExample;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.StatisticsExample;
import com.chance.ssm.po.User;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.po.vo.HospitalVO;
import com.chance.ssm.po.vo.ManageNursingContentVO;
import com.chance.ssm.po.vo.NurseBillsOrderVO;
import com.chance.ssm.po.vo.NurseBillsVO;
import com.chance.ssm.po.vo.NurseThreeInfoVo;
import com.chance.ssm.po.vo.NurseVO;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;
import com.chance.ssm.po.vo.Params;
import com.chance.ssm.po.vo.SelectUserThreeInfoVo;
import com.chance.ssm.po.vo.StatisticsVO;
import com.chance.ssm.service.CapitalNursePoolService;
import com.chance.ssm.service.CapitalUserPoolService;
import com.chance.ssm.service.ComplaintService;
import com.chance.ssm.service.CouponService;
import com.chance.ssm.service.DrawMoneyService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.FollowService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.HospitalService;
import com.chance.ssm.service.InvitationService;
import com.chance.ssm.service.MajorService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NurseNofreeService;
import com.chance.ssm.service.NursePaymentSettingsService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.NursingProjectService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.PackageService;
import com.chance.ssm.service.RedPacketsService;
import com.chance.ssm.service.SimpleMajorService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.StatisticsService;
import com.chance.ssm.service.UserService;
import com.chance.ssm.utils.DateUtil;
import com.chance.ssm.utils.LzhUtils;
import com.chance.ssm.utils.Md5Encrypt;
import com.chance.ssm.utils.PostionUtils;
import com.chance.ssm.utils.RandomUtil;
import com.chance.ssm.utils.SavePic;
import com.chance.ssm.utils.ShareCodeUtil;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;


/**
 * 护士和用户控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/nurseAnduser")
public class NurseAndUserController {

	@Autowired
	private NurseService nurseService;
	@Autowired
	private UserService userService;

	@Autowired
	private EvaluateService evaluateService;

	@Autowired
	private OrderReceiverService orderReceiverService;
	
	@Autowired
	private OrderSendService orderSendService;

	@Autowired
	private FollowService followService;

	@Autowired
	private ManageNursingContentService mNursingContentService;

	/*@Autowired
	private OrderSendService oSendService;*/

	@Autowired
	private NurseNofreeService nurseNofreeService;

	@Autowired
	private HospitalService hService;

	@Autowired
	private MajorService mService;
	
	@Autowired
	private PackageService packageService;

	@Autowired
	private NursingProjectService nursingProjectService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private StatisticsService statisticsService;
	
	@Autowired
	private SimpleMajorService simpleMajorService;
	
	@Autowired
	private InvitationService invitationService;
	
	@Autowired
	private ComplaintService complaintService;
	
	@Autowired
	private CouponService couponService;
	
	@Autowired
	private CapitalUserPoolService capitalUserPoolService;
	
	@Autowired
	private RedPacketsService packetsService;
	
	@Autowired
	private DrawMoneyService drawMoneyService;
	
	@Autowired
	private HospitalService hospitalService;
	
	@Autowired
	private CapitalNursePoolService capitalNursePoolService;
	
	@Autowired
	private NursePaymentSettingsService nursePaymentSettingsService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	

	/**
	 * --------------------------------------护士端--------------------------------
	 * -----------
	 **/
	/**
	 * 
	 * @param NurseName
	 *            账号（手机号）
	 * @param NursePwd
	 *            密码
	 * @param NurseNick
	 *            昵称
	 * @param NurseHeader
	 *            头像
	 * @return
	 * @throws Exception
	 */
	// 护士端注册
	@RequestMapping(value = "/NurseRegistered", method = RequestMethod.POST)
	public @ResponseBody
	NetState NurseRegistered(HttpServletRequest request,HttpSession session, String NurseName,
			String NursePwd, String NurseNick, String NurseHeader,String invitationcode//邀请码,
			,String code
			)
			throws Exception {
		Date date = new Date();
		//护士id
		String NurseId = java.util.UUID.randomUUID().toString()
				.replaceAll("-", "");
		NetState netState = new NetState();
		if (NurseName == null || "".equals(NurseName)) {
			netState.setData("账号错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} else if (NursePwd == null || "".equals(NursePwd)) {
			netState.setData("密码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} 
		/*else if (NurseNick == null || "".equals(NurseNick)) {
			netState.setData("昵称错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (NurseHeader == null || "".equals(NurseHeader)) {
			netState.setData("头像错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} */
		else if(code == null || "".equals(code)){
			netState.setData("验证码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}else{
			// 判断该账号有没有被注册
			Nurse nurse1 = nurseService.selectForNurseName(NurseName);
			
			if (nurse1 != null) {
				netState.setData("该账号已经注册");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			//判断短信验证码
			Integer secode = (Integer) session.getAttribute("code");
			if(String.valueOf(secode) != code && !code.equals(String.valueOf(secode))){
				netState.setData("验证码错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
		SimpleDateFormat format = new SimpleDateFormat();
			/*if (i > 0) {*/
				
				if(invitationcode!=null && !"".equals(invitationcode)){//如果邀请码不为空
					//判断邀请码的长度
					int length = invitationcode.length();
					Nurse nurse2 = new Nurse();
					if(length>6){//手机号
						nurse2 = nurseService.selectForNurseName(invitationcode);
					}else{//邀请码
						nurse2 = nurseService.selectNurseForInvitationcode(invitationcode);
					}
					
					if(nurse2==null || "".equals(nurse2)){
						netState.setData("邀请码不存在");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}else{//邀请码填写成功(触发器自动给用户增加积分)
						SavePic savePic = new SavePic();
						// 注册
						Nurse nurse = new Nurse();
						nurse.setNurseId(NurseId);
						nurse.setNurseName(NurseName);
						nurse.setNursePwd(Md5Encrypt.Bit16(NursePwd).toLowerCase());
						/*nurse.setNurseNick(NurseNick);
						String headerpath = savePic.oneImgPathAdd(request, NurseId,
								"NurseHeader", NurseHeader);
						nurse.setNurseHeader(headerpath);*/
						//手机号
						nurse.setNursePhone(NurseName);
						//昵称
						//截取手机号
						String before = NurseName.substring(0, 3);
						String last = NurseName.substring(8, NurseName.length());
						nurse.setNurseNick(before+"****"+last);
						//邀请码生成
						String value = ShareCodeUtil.toSerialNumber(6);
						nurse.setNurseInvitationcode(new String(value));
						nurse.setNurseCreatetime(new Date());
						// 头像保存到数据库并且保存到文件夹
						int i = nurseService.insertSelective(nurse);
						
						//注册成功发送红包
						RedPackets redPackets = packetsService.selectRedpacketsInfoByType(1);
						RedPacketsUser redPacketsUser = new RedPacketsUser();
						if(redPackets!=null && !"".equals(redPackets)){
							//如果后台设置了注册送的红包(mysql触发器自动加入余额)
							redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							redPacketsUser.setRedPacketsNurseMoney(redPackets.getRedPacketsMoney());
							redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
							redPacketsUser.setRedPacketsNurseNurseId(NurseId);
							redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
							redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
							redPacketsUser.setRedPacketsNurseCreatetime(new Date());
							packetsService.insertSelectiveNurseRedPackets(redPacketsUser);
							
							//资金池记录数据
							CapitalNursePool pool = new CapitalNursePool();
							pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
							pool.setCapitalNursePoolPeopleid(NurseId);
							pool.setCapitalNursePoolOrdersendid("");
							pool.setCapitalNursePoolMoney(redPackets.getRedPacketsMoney());
							pool.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
							pool.setCapitalNursePoolType(0);
							pool.setCapitalNursePoolCreatetime(new Date());
							capitalNursePoolService.insertSelective(pool);
							
							////将推送记录到护士站内信中
							StandInnerLetter innerLetter = new StandInnerLetter();
							innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							innerLetter.setStandInnerLetterUserId(NurseId);                     
							innerLetter.setStandInnerLetterUserIdentity(1);
							innerLetter.setStandInnerLetterTitle("订单评价");
							//0订单消息/1资金消息/2系统通知
							innerLetter.setStandInnerLetterUserType(1);
							innerLetter.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPackets.getRedPacketsMoney()+"的注册红包");
							innerLetter.setStandInnerLetterCreatetime(date);
							standInnerLetterService.insertSelective(innerLetter);
						}
						
						SigninSet signinSet = nurseService.selectNurseRegistermark();
						Integer nurseMark = signinSet.getNurseRegisterIntegeral();
						Invitation invitation = new Invitation();
						invitation.setInvitationId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						invitation.setInvitationUserId(nurse.getNurseId());//邀请人id
						invitation.setInvitationBeuserId(NurseId);//被邀请人
						invitation.setInvitationIdentity(1);
						invitation.setInvitationGetmark(nurseMark);
						invitation.setInvitationCreatetime(new Date());
						int  c= invitationService.insertSelective(invitation);
						if(c==0){
							netState.setData("邀请错误");
							netState.setErrorCode(NetState.PARAMS_ERROR);
							return netState;
						}else{
							
							//推荐成功发送红包给推荐人
							RedPackets redPackets1 = packetsService.selectRedpacketsInfoByType(3);
							RedPacketsUser redPacketsUser1 = new RedPacketsUser();
							if(redPackets1!=null && !"".equals(redPackets1)){
								//如果后台设置了推荐送的红包
								redPacketsUser1.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
										.replaceAll("-", ""));
								redPacketsUser1.setRedPacketsNurseMoney(redPackets1.getRedPacketsMoney());
								redPacketsUser1.setRedPacketsNursePic(redPackets1.getRedPacketsPic());
								redPacketsUser1.setRedPacketsNurseNurseId(nurse.getNurseId());
								redPacketsUser1.setRedPacketsNurseNote(redPackets1.getRedPacketsNote());
								redPacketsUser1.setRedPacketsNurseSpeak(redPackets1.getRedPacketsSpeak());
								redPacketsUser1.setRedPacketsNurseCreatetime(new Date());
								packetsService.insertSelectiveNurseRedPackets(redPacketsUser1);
								
								//添加到护士资金池(触发器自动加到护士月)
								CapitalNursePool pool = new CapitalNursePool();
								pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
								pool.setCapitalNursePoolPeopleid(nurse2.getNurseId());
								pool.setCapitalNursePoolOrdersendid("");
								pool.setCapitalNursePoolMoney(redPackets1.getRedPacketsMoney());
								pool.setCapitalNursePoolSpeak(redPackets1.getRedPacketsSpeak());
								pool.setCapitalNursePoolType(2);
								pool.setCapitalNursePoolCreatetime(new Date());
								capitalNursePoolService.insertSelective(pool);
								
								////将红包记录到护士站内信中
								StandInnerLetter innerLetter1 = new StandInnerLetter();
								innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
										.replaceAll("-", ""));
								innerLetter1.setStandInnerLetterUserId(nurse2.getNurseId());                     
								innerLetter1.setStandInnerLetterUserIdentity(1);
								innerLetter1.setStandInnerLetterTitle("红包消息");
								//0订单消息/1资金消息/2系统通知
								innerLetter1.setStandInnerLetterUserType(1);
								innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPackets1.getRedPacketsMoney()+"的推荐红包");
								innerLetter1.setStandInnerLetterCreatetime(date);
								standInnerLetterService.insertSelective(innerLetter1);
							}
						}
					}
				}else{
					SavePic savePic = new SavePic();
					// 注册
					Nurse nurse = new Nurse();
					nurse.setNurseId(NurseId);
					nurse.setNurseName(NurseName);
					nurse.setNursePwd(Md5Encrypt.Bit16(NursePwd).toLowerCase());
					/*nurse.setNurseNick(NurseNick);
					String headerpath = savePic.oneImgPathAdd(request, NurseId,
							"NurseHeader", NurseHeader);
					nurse.setNurseHeader(headerpath);*/
					//手机号
					nurse.setNursePhone(NurseName);
					//昵称
					//截取手机号
					String before = NurseName.substring(0, 3);
					String last = NurseName.substring(8, NurseName.length());
					nurse.setNurseNick(before+"****"+last);
					//邀请码生成
					String value = ShareCodeUtil.toSerialNumber(6);
					nurse.setNurseInvitationcode(new String(value));
					nurse.setNurseCreatetime(new Date());
					// 头像保存到数据库并且保存到文件夹
					int i = nurseService.insertSelective(nurse);
					
					//注册成功发送红包
					RedPackets redPackets = packetsService.selectRedpacketsInfoByType(1);
					RedPacketsUser redPacketsUser = new RedPacketsUser();
					if(redPackets!=null && !"".equals(redPackets)){
						//如果后台设置了注册送的红包(mysql触发器自动加入余额)
						redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						redPacketsUser.setRedPacketsNurseMoney(redPackets.getRedPacketsMoney());
						redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
						redPacketsUser.setRedPacketsNurseNurseId(NurseId);
						redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
						redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
						redPacketsUser.setRedPacketsNurseCreatetime(new Date());
						packetsService.insertSelectiveNurseRedPackets(redPacketsUser);
						
						//资金池记录数据
						CapitalNursePool pool = new CapitalNursePool();
						pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
						pool.setCapitalNursePoolPeopleid(NurseId);
						pool.setCapitalNursePoolOrdersendid("");
						pool.setCapitalNursePoolMoney(redPackets.getRedPacketsMoney());
						pool.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
						pool.setCapitalNursePoolType(0);
						pool.setCapitalNursePoolCreatetime(new Date());
						capitalNursePoolService.insertSelective(pool);
						
						////将红包记录到护士站内信中
						StandInnerLetter innerLetter1 = new StandInnerLetter();
						innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter1.setStandInnerLetterUserId(NurseId);                     
						innerLetter1.setStandInnerLetterUserIdentity(1);
						innerLetter1.setStandInnerLetterTitle("红包消息");
						//0订单消息/1资金消息/2系统通知
						innerLetter1.setStandInnerLetterUserType(1);
						innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPackets.getRedPacketsMoney()+"的注册红包");
						innerLetter1.setStandInnerLetterCreatetime(date);
						standInnerLetterService.insertSelective(innerLetter1);
					}
					
				}
				netState.setData("注册成功");
				netState.setJson(NurseId);
				netState.setErrorCode(NetState.SUCCESS);
			/*} else {
				netState.setData("注册错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}*/
		}
		return netState;
	}
	/**
	 * 
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @param Phone 护士或用户手机号(账号)
	 * @param Identify 身份(0用户1护士)
	 * @return
	 * @throws Exception
	 */
	//用户和护士重置密码发短信
	@RequestMapping(value = "ResetPasswordSMSVerification", method = RequestMethod.POST)
	public @ResponseBody NetState ResetPasswordSMSVerification(Model model, HttpServletRequest request,
			HttpServletResponse response,HttpSession session, String Phone,String Identify) throws Exception {
		NetState netState = new NetState();
		if(Phone == null || "".equals(Phone)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(Identify == null || "".equals(Identify)){
			netState.setData("用户或护士ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		int i = (int) ((Math.random()*9+1)*100000);
		//判断护士或用户存不存在
		if(Identify == "0" || "0".equals(Identify)){//用户
			User user = userService.selectForUserName(Phone);
			if(user == null || "".equals(user)){
				netState.setData("该账号不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				//发短信
				session.setAttribute("userPasswordcode", i);
				//发送短信
				//SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, Phone, "【小护健康】欢迎使用小护健康APP,您的重置密码验证码为"+i+"", null, null, "0",  null,  null,  null,  null, null,  null, null);
				AliyunSmsUtil.sendSms(Phone, SmsEnum.Modify_password.getModeCode(), i);
			}
		}else{//护士
			// 判断该账号存不存在
			Nurse nurse = nurseService.selectForNurseName(Phone);
			if(nurse == null || "".equals(nurse)){
				netState.setData("该账号不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				//发短信
				session.setAttribute("nursePasswordcode", i);
				//发送短信
				//SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, Phone, "【小护健康】欢迎使用小护健康APP,您的重置密码验证码为"+i+"", null, null, "0",  null,  null,  null,  null, null,  null, null);
				AliyunSmsUtil.sendSms(Phone, SmsEnum.Modify_password.getModeCode(), i);
			}
		}
		netState.setData("发送成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	
	/**
	 * 
	 * @param session
	 * @param Passwordcode 短信验证码
	 * @param Identify 0用户1护士
	 * @return
	 * @throws Exception
	 */
	//用户或护士端重置密码验证
	@RequestMapping(value = "/ResetPasswordComparison", method = RequestMethod.POST)
	public @ResponseBody
	NetState ResetPasswordNurse(HttpSession session,String Passwordcode,String Identify) throws Exception {
		NetState netState = new NetState();
		if(Identify == null || "".equals(Identify)){
			netState.setData("用户ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(Passwordcode == null || "".equals(Passwordcode)){
			netState.setData("请输入验证码");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断护士或用户存不存在
		if(Identify == "0" || "0".equals(Identify)){//用户
				//验证短信
				//判断短信验证码
				Integer secode = (Integer) session.getAttribute("userPasswordcode");
				if(String.valueOf(secode) != Passwordcode && !Passwordcode.equals(String.valueOf(secode))){
					netState.setData("验证码错误");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
			}
		}else{//护士
				//验证短信
				//判断短信验证码
				Integer secode = (Integer) session.getAttribute("nursePasswordcode");
				if(String.valueOf(secode) != Passwordcode && !Passwordcode.equals(String.valueOf(secode))){
					netState.setData("验证码错误");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
		}
		netState.setData("验证成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	/**
	 * 
	 * @param session
	 * @param userId 用户或护士ID
	 * @param passWord 需要重置的密码
	 * @param Identify 0用户1护士
	 * @return
	 * @throws Exception
	 */
	//用户或护士端重置密码
	@RequestMapping(value = "/ResetPasswordUpdate", method = RequestMethod.POST)
	public @ResponseBody
	NetState ResetPasswordUpdate(HttpSession session,String phone,String passWord,String Identify) throws Exception {
		NetState netState = new NetState();
		if(phone == null || "".equals(phone)){
			netState.setData("账号参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(Identify == null || "".equals(Identify)){
			netState.setData("密码不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断护士或用户存不存在
		if(Identify == "0" || "0".equals(Identify)){//用户
			User user = userService.selectForUserName(phone);
			
			if(user == null || "".equals(user)){
				netState.setData("该用户不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				//修改用户密码
				User user1 = new User();
				user1.setUserId(user.getUserId());
				user1.setUserPwd(Md5Encrypt.Bit16(passWord).toLowerCase());
				userService.updateByPrimaryKeySelective(user1);
			}
		}else{//护士
			// 判断该账号存不存在
			Nurse nurse = nurseService.selectForNurseName(phone);
			if(nurse == null || "".equals(nurse)){
				netState.setData("该护士不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				Nurse nurse2 = new Nurse();
				nurse2.setNurseId(nurse.getNurseId());
				nurse2.setNursePwd(Md5Encrypt.Bit16(passWord).toLowerCase());
				nurseService.updateByNurseId(nurse2);
			}
		}
		netState.setData("重置成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	
	}
	/**
	 * 
	 * @param session
	 * @param userId 用户或护士ID
	 * @param passWord 输入的密码
	 * @param Identify 0用户1护士
	 * @return
	 * @throws Exception
	 */
	//护士或用户验证登录密码
	@RequestMapping(value = "/VerificationPasswordForNurseAndUser", method = RequestMethod.POST)
	public @ResponseBody
	NetState VerificationPasswordForNurseAndUser(HttpSession session,String userId,String passWord,String Identify,String newPassWord) throws Exception {
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("用户ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(Identify == null || "".equals(Identify)){
			netState.setData("密码不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断护士或用户存不存在
		if(Identify == "0" || "0".equals(Identify)){//用户
			User user = userService.selectForUserByID(userId);
			if(user == null || "".equals(user)){
				netState.setData("该用户不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				//得到旧密码
				String oldPwd = user.getUserPwd();
				//新密码加密
				String newPwd = Md5Encrypt.Bit16(passWord).toLowerCase();
				
				if(oldPwd != newPwd && !oldPwd.equals(newPwd)){
					netState.setData("跟旧密码不符");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}else{
					//修改用户密码
					User user1 = new User();
					user1.setUserId(userId);
					user1.setUserPwd(Md5Encrypt.Bit16(newPassWord).toLowerCase());
					userService.updateByPrimaryKeySelective(user1);
				}
			}
		}else{//护士
			Nurse nurse = nurseService.selectForNurseId(userId);
			if(nurse == null || "".equals(nurse)){
				netState.setData("该护士不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				//得到旧密码
				String oldPwd = nurse.getNursePwd();
				//新密码加密
				String newPwd = Md5Encrypt.Bit16(passWord).toLowerCase();
				if(oldPwd != newPwd && !oldPwd.equals(newPwd)){
					netState.setData("跟旧密码不符");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}else{
					//修改护士密码
					Nurse nurse2 = new Nurse();
					nurse2.setNurseId(userId);
					nurse2.setNursePwd(Md5Encrypt.Bit16(newPassWord).toLowerCase());
					nurseService.updateByNurseId(nurse2);
				}
			}
		}
		netState.setData("修改");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	/*//护士或用户修改登录密码
	@RequestMapping(value = "/updatePasswordForNurseAndUser", method = RequestMethod.POST)
	public @ResponseBody
	NetState updatePasswordForNurseAndUser(HttpSession session,String userId,String passWord,String Identify) throws Exception {
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("用户ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(Identify == null || "".equals(Identify)){
			netState.setData("密码不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//判断护士或用户存不存在
		if(Identify == "0" || "0".equals(Identify)){//用户
			User user = userService.selectForUserByID(userId);
			if(user == null || "".equals(user)){
				netState.setData("该用户不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				//修改用户密码
				User user1 = new User();
				user1.setUserId(userId);
				user1.setUserPwd(Md5Encrypt.Bit16(passWord).toLowerCase());
				userService.updateByPrimaryKeySelective(user1);
			}
		}else{//护士
			Nurse nurse = nurseService.selectForNurseId(userId);
			if(nurse == null || "".equals(nurse)){
				netState.setData("该护士不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{
				Nurse nurse2 = new Nurse();
				nurse2.setNurseId(userId);
				nurse2.setNursePwd(Md5Encrypt.Bit16(passWord).toLowerCase());
				nurseService.updateByNurseId(nurse2);
			}
		}
		netState.setData("修改成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}*/
	
	
	
	
	//获取护士的认证状态
	@RequestMapping(value = "/CertificationStatus", method = RequestMethod.POST)
	public @ResponseBody
	NetState CertificationStatus(String nurseId) throws Exception {
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		
		if(nurse == null || "".equals(nurse)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setJson(nurse.getNurseDistrict());
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	// 护士端登录
	@RequestMapping(value = "/NurseLogin", method = RequestMethod.POST)
	public @ResponseBody
	NetState NurseLogin(String NurseName, String NursePwd) throws Exception {
		NetState netState = new NetState();
		if (NurseName == null || "".equals(NurseName)) {
			netState.setData("账号错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (NursePwd == null || "".equals(NursePwd)) {
			netState.setData("密码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			Nurse nurse1 = nurseService.selectForNurseName(NurseName);
			if (nurse1 == null) {// 先查看数据库有没有该账号
				netState.setData("该账号还未注册");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			} else {
				int state = nurse1.getNurseUsestate();
				if(state==1 ){
					netState.setData("该账户已被封,请找客服解封");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
				// 比较输入的密码和数据库的密码
				if (Md5Encrypt.Bit16(NursePwd).toLowerCase()
						.equals(nurse1.getNursePwd())) {
					//判断该护士有没有绑定过支付账号和密码
					NursePaymentSettings settings =	nursePaymentSettingsService.selectByPrimaryKey(nurse1.getNurseId());
					if(settings!=null && !"".equals(settings)){
						nurse1.setPwd(settings.getNursePaymentSettingsPwd());
						nurse1.setAccount(settings.getNursePaymentSettingsAccount());
					}
					//得到该护士正在进行中的订单数
					int count = 0;
					count = orderReceiverService.selectOrderSendIngNumber(nurse1.getNurseId());
					nurse1.setOrderNumberIng(count);
					
					netState.setData("登录成功");
					netState.setJson(nurse1);
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					netState.setData("密码错误");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			}
		}
		return netState;
	}

	/****
	 * //护士端 完善基本信息
	 * 
	 * @param NurseId
	 *            护士id
	 * @param Nurseheader
	 *            头像
	 * @param nurseTruename
	 *            真实姓名
	 * @param NurseSex
	 *            性别 1男2女
	 * @param NurseCard
	 *            身份证号
	 * @param NursePhone
	 *            手机号
	 * @param NurseAddress
	 *            地址
	 * @param NurseLanguage
	 *            语言
	 * @param NurseEmail
	 *            邮箱
	 * @param NurseCardpic
	 *            身份证照片
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	@RequestMapping(value = "/NurseInfoAdd", method = RequestMethod.POST)
	public @ResponseBody
	NetState NurseInfoAdd(HttpServletRequest request, String NurseId,
			String NurseTruePic, String nurseTruename, String NurseSex,
			String NurseCard, String NursePhone, String NurseAddress,
			String NurseLanguage, String NurseEmail, String NurseCardpic)
			throws Exception {
		NetState netState = new NetState();
		SavePic savePic = new SavePic();
		if (NurseId == null || "".equals(NurseId)) {
			netState.setData("id错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} 
			Nurse nurse = nurseService.selectForNurseId(NurseId);
			if (nurse == null || "".equals(nurse)) {
				netState.setData("该用户不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			// updateByNurseId
			Nurse nurse2 = new Nurse();
			nurse2.setNurseId(NurseId);
			if (nurseTruename != null && !"".equals(nurseTruename)){
				nurse2.setNurseTruename(nurseTruename);
			}
			if (NurseSex != null && !"".equals(NurseSex)){
				nurse2.setNurseSex(NurseSex);
			}
			if (NurseCard != null && !"".equals(NurseCard)){
				nurse2.setNurseCard(NurseCard);
			}
			if (NursePhone != null && !"".equals(NursePhone)){
				nurse2.setNursePhone(NursePhone);
			}
			if (NurseAddress != null && !"".equals(NurseAddress)){
				nurse2.setNurseAddress(NurseAddress);
			}
			if (NurseLanguage != null && !"".equals(NurseLanguage)){
				nurse2.setNurseLanguage(NurseLanguage);
			}
			if (NurseEmail != null && !"".equals(NurseEmail)){
				nurse2.setNurseEmail(NurseEmail);
			}
			if (NurseCardpic != null && !"".equals(NurseCardpic)){
				String NursecardPicNew = savePic.manyImgPathAdd(request, NurseId,
						"NurseCardPic", NurseCardpic);
				nurse2.setNurseCardpic(NursecardPicNew);
			}

			int i = nurseService.updateByNurseId(nurse2);
			
			//真实照片保存到nurse_payment_settings表中
			//判断该护士有没有绑定过支付账号和密码
			NursePaymentSettings settings =	nursePaymentSettingsService.selectByPrimaryKey(NurseId);
			
			String truePic = "";
			if(NurseTruePic != null && !"".equals(NurseTruePic)){
				truePic= savePic.manyImgPathAdd(request, NurseId, "NurseTruePic", NurseTruePic);
			}
			
			if(truePic!=null && !"".equals(truePic)){
				if(settings==null || "".equals(settings)){//插入
					NursePaymentSettings settings2 = new NursePaymentSettings();
					settings2.setNursePaymentSettingsNurseId(NurseId);
					if(truePic!=null && !"".equals(truePic)){
						settings2.setNursePaymentSettingsOverone(truePic);
					}
					int c = nursePaymentSettingsService.insertSelective(settings2);
					if(i==0){
						netState.setData("绑定错误");
						netState.setErrorCode(NetState.PARAMS_ERROR);
					}else{
						netState.setData("绑定成功");
						netState.setErrorCode(NetState.SUCCESS);
					}
				}else{//更新
					NursePaymentSettings settings3 = new NursePaymentSettings();
					settings3.setNursePaymentSettingsNurseId(NurseId);
					if(truePic!=null && !"".equals(truePic)){
						settings3.setNursePaymentSettingsOverone(truePic);
					}
					nursePaymentSettingsService.updateByPrimaryKeySelective(settings3);
				}
			}
			if (i > 0) {
				netState.setData("完善成功");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				netState.setData("完善失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		return netState;
		
	}
	//护士端修改个人信息
	@RequestMapping(value = "/updateNurseInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState updateNurseInfo(HttpServletRequest request, String nurseId,
			String nurseheader, String nurseNick,String nursePhone,String nurseSex,String cardCd,String nurseInfo,
			String nurseNote, String nurseAddress,String goosServices)
			throws Exception {
		NetState netState = new NetState();
		Nurse nurse1 = nurseService.selectForNurseId(nurseId);
		if (nurse1 == null || "".equals(nurse1)) {
			netState.setData("该用户不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		SavePic savePic = new SavePic();
		Nurse nurse = new Nurse();
		nurse.setNurseId(nurseId);
		if(nurseheader!=null && !"".equals(nurseheader)){//如果头像不为空
			String NurseheaderNew = savePic.oneImgPathAdd(request, nurseId,
					"NurseHeader", nurseheader);
		nurse.setNurseHeader(NurseheaderNew);
		}
		if(nurseNick!=null &&!"".equals(nurseNick)){
			nurse.setNurseNick(nurseNick);
		}
		if(nursePhone!=null &&!"".equals(nursePhone)){
			nurse.setNursePhone(nursePhone);
		}
		if(nurseSex!=null &&!"".equals(nurseSex)){
			nurse.setNurseSex(nurseSex);
		}
		if(nurseNote!=null &&!"".equals(nurseNote)){
			nurse.setNurseNote(nurseNote);
		}
		if(nurseAddress!=null &&!"".equals(nurseAddress)){
			nurse.setNurseAddress(nurseAddress);
		}
		if(cardCd!=null &&!"".equals(cardCd)){
			nurse.setNurseCard(cardCd);
		}
		if(nurseInfo!=null &&!"".equals(nurseInfo)){
			nurse.setNurseYearsofservice(nurseInfo);
		}
		int i = nurseService.updateByNurseId(nurse);
	
		if(i>0){
			netState.setData("更新成功");
			netState.setErrorCode(NetState.SUCCESS);
		}else{
			netState.setData("更新失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		return netState;
	}
	
	
	/**
	 * 修改护士的服务项
	 * @param nurseId 护士ID
	 * @param contentIds 服务项ID,(多个用逗号隔开)
	 * @return
	 */
	@RequestMapping(value="updatecontentbynurseid", method = RequestMethod.POST)
	public @ResponseBody NetState UpdateContentByNurseId(String nurseId, String contentId){
		NetState netState = new NetState();
		if(nurseId == null){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(contentId == null){
			netState.setData("服务ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			String[] contentIds = contentId.split(",");
			if(contentIds.length > 0){
				NursingProjectExample nProjectExample = new NursingProjectExample();
				com.chance.ssm.po.NursingProjectExample.Criteria criteria = nProjectExample.createCriteria();
				criteria.andNursingNurseidEqualTo(nurseId);
				try {
					int i = nursingProjectService.deleteByExample(nProjectExample);
					if(i > 0){
						NursingProject nursingProject = new NursingProject();
						for(int j = 0; j < contentIds.length; j++){
							String id = java.util.UUID.randomUUID().toString().replace("-", "");
							nursingProject.setNursingProjectId(id);
							nursingProject.setNursingNurseid(nurseId);
							nursingProject.setNursingProjectMacontent(contentIds[j]);
							nursingProject.setNursingProjectCreatetime(new Date());
							int m = nursingProjectService.insertSelective(nursingProject);
							if(m > 0){
								Nurse nurse = new Nurse();
								nurse.setNurseGoodservice(contentId);
								
								
								NurseExample nurseExample = new NurseExample();
								com.chance.ssm.po.NurseExample.Criteria criteria2 = nurseExample.createCriteria();
								criteria2.andNurseIdEqualTo(nurseId);
								int n = nurseService.updateByExampleSelective(nurse, nurseExample);
								if(n >0){
									netState.setData("修改成功");
									netState.setErrorCode(NetState.SUCCESS);
								}else{
									netState.setData("修改失败");
									netState.setErrorCode(NetState.PARAMS_ERROR);
								}
							}
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return netState;
		
	}
	
//	/**
//	 * 根据护士ID查询其服务项
//	 * @param nurseId 护士ID
//	 * @return
//	 */
/*	@RequestMapping(value="selectcontentbynurseid", method = RequestMethod.POST)
	public @ResponseBody NetState SelectContentByNurseId(String nurseId){
		NetState netState = new NetState();
		if(nurseId == null){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			List<NursingProject> nursingProjects = new ArrayList<NursingProject>();
			NursingProjectExample nProjectExample = new NursingProjectExample();
			com.chance.ssm.po.NursingProjectExample.Criteria criteria = nProjectExample.createCriteria();
			criteria.andNursingNurseidEqualTo(nurseId);
			try {
				nursingProjects = nursingProjectService.selectByExample(nProjectExample);
				if(nursingProjects.size() > 0){
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(nursingProjects);
				}else{
					netState.setData("没有数据");
					netState.setErrorCode(NetState.DATA_NOT_FOUND);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
		
	}*/
	

	/**
	 * 专业信息认证(2017/02/09更新(1.3和1.4合并))
	 * @param NurseId 护士ID
	 * @param NurseHeader 头像
	 * @param NurseNumber 护士注册号
	 * @param NurseTruePic 个人照片(真实照片)
	 * @param nurseTruename 姓名(真实名字)
	 * @param NurseSex 性别(1男2女)
	 * @param NurseAge 年龄
	 * @param NurseCard 身份证号码
	 * @param NurseCardpic 手持身份证照，身份证正面照，反面照(三合一逗号隔开)
	 * @param NurseworkuUnit  工作单位
	 * @param NurseOffice 科室(传ID 选择其它医院传文字(其它医院))
	 * @param Nursejob 职称(传ID)
	 * @param Nurseyearsofservice 职业年限
	 * @param NurseGoodservice 提供服务(传ID 逗号隔开)
	 * @param NurseNote 个人优势
	 * @param NurseNurseLicensepic 职业证书、资格证书、职称证书(三合一逗号隔开)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/NurseInfoIdentify", method = RequestMethod.POST)
	public @ResponseBody
	NetState NurseInfoIdentify(HttpServletRequest request,HttpSession session, 
			String NurseId,
			String NurseHeader,
			String NurseNumber,
			String NurseTruePic, String nurseTruename, String NurseSex,
			String NurseAge,
			String NurseCard,
			String NurseCardpic,
			String NurseworkuUnit, String NurseOffice,
			String Nursejob,
			String Nurseyearsofservice,
			String NurseGoodservice, String NurseNote,
			String NurseNurseLicensepic) throws Exception {
		NetState netState = new NetState();
		if(NurseId == null || "".equals(NurseId)){
			netState.setData("护士ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseHeader == null || "".equals(NurseHeader)){
			netState.setData("头像不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseTruePic == null || "".equals(NurseTruePic)){
			netState.setData("真实照片不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(nurseTruename == null || "".equals(nurseTruename)){
			netState.setData("真实名字不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseSex == null || "".equals(NurseSex)){
			netState.setData("性别不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseCard == null || "".equals(NurseCard)){
			netState.setData("身份证号不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseCardpic == null || "".equals(NurseCardpic)){
			netState.setData("身份证照片请全部上传");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseworkuUnit == null || "".equals(NurseworkuUnit)){
			netState.setData("工作单位不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseOffice == null || "".equals(NurseOffice)){
			netState.setData("科室不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(Nursejob == null || "".equals(Nursejob)){
			netState.setData("职称不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(Nurseyearsofservice == null || "".equals(Nurseyearsofservice)){
			netState.setData("工作年限不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseGoodservice == null || "".equals(NurseGoodservice)){
			netState.setData("擅长服务不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(NurseNote == null || "".equals(NurseNote)){
			netState.setData("个人优势不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		/*if(NurseNurseLicensepic == null || "".equals(NurseNurseLicensepic)){
			netState.setData("职业照片不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}*/
		if(NurseNurseLicensepic == null && NurseNumber == null){
			netState.setData("职业照片和护士注册号必填一项");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}	
		
			Nurse nurse1 = nurseService.selectForNurseId(NurseId);
			if (nurse1 == null || "".equals(nurse1)) {
				netState.setData("该护士不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			
			Nurse nurse = new Nurse();
			nurse.setNurseId(NurseId);
			SavePic savePic = new SavePic();
			//头像
			String headerPic = savePic.manyImgPathAdd(request, NurseId,"NurseHeader", NurseHeader);
			nurse.setNurseHeader(headerPic);
			
			//昵称(真实姓名的姓+职称)
			String nick = nurseTruename.substring(0, 1);
			nurse.setNurseNick(nick+Nursejob);
			
			//真实照片
			//真实照片保存到nurse_payment_settings表中
			//判断该护士有没有绑定过支付账号和密码
			NursePaymentSettings settings =	nursePaymentSettingsService.selectByPrimaryKey(NurseId);
			String truePic = "";
			if(NurseTruePic != null && !"".equals(NurseTruePic)){
				truePic= savePic.manyImgPathAdd(request, NurseId, "NurseTruePic", NurseTruePic);
			}
			if(truePic!=null && !"".equals(truePic)){
				if(settings==null || "".equals(settings)){//插入
					NursePaymentSettings settings2 = new NursePaymentSettings();
					settings2.setNursePaymentSettingsNurseId(NurseId);
					if(truePic!=null && !"".equals(truePic)){
						settings2.setNursePaymentSettingsOverone(truePic);
					}
					 nursePaymentSettingsService.insertSelective(settings2);
				}else{//更新
					NursePaymentSettings settings3 = new NursePaymentSettings();
					settings3.setNursePaymentSettingsNurseId(NurseId);
					if(truePic!=null && !"".equals(truePic)){
						settings3.setNursePaymentSettingsOverone(truePic);
					}
					nursePaymentSettingsService.updateByPrimaryKeySelective(settings3);
				}
			}
			//真实姓名
			nurse.setNurseTruename(nurseTruename);
			
			//性别
			nurse.setNurseSex(NurseSex);
			
			//年龄
			nurse.setNurseAge(NurseAge);
			
			//身份证号码
			nurse.setNurseCard(NurseCard);
			
			//身份证照片 ,手持身份证照，身份证正面照，反面照
			String NursecardPicNew = savePic.manyImgPathAdd(request, NurseId,"NurseCardPic", NurseCardpic);
			nurse.setNurseCardpic(NursecardPicNew);
			
			//工作单位
			if(NurseworkuUnit == "其它医院" || "其它医院".equals(NurseworkuUnit)){
			}else{
				nurse.setNurseWorkUnit(NurseworkuUnit);
			}
			
			//科室
			nurse.setNurseOffice(NurseOffice);
			
			//职称
			nurse.setNurseJob(Nursejob);
			
			//护士注册号
			nurse.setNurseNumber(NurseNumber);
			
			//职业年限
			nurse.setNurseYearsofservice(Nurseyearsofservice);
			
			//个人优势
			nurse.setNurseNote(NurseNote);
			
			//擅长服务
		    //删除掉之前添加的服务项
		    NursingProjectExample example = new NursingProjectExample();
		    com.chance.ssm.po.NursingProjectExample.Criteria criteria = example.createCriteria();
		    criteria.andNursingNurseidEqualTo(NurseId);
		    nursingProjectService.deleteByExample(example);
		   
		    if(NurseGoodservice!=null && !"".equals(NurseGoodservice)){
			   nurse.setNurseGoodservice(NurseGoodservice);
				String[] contentIds = NurseGoodservice.split(",");
				for(int i = 0; i < contentIds.length; i++){
					String id = java.util.UUID.randomUUID().toString().replace("-", "");
					NursingProject nursingProject = new NursingProject();
					nursingProject.setNursingProjectId(id);
					nursingProject.setNursingNurseid(NurseId);
					nursingProject.setNursingProjectMacontent(contentIds[i]);
					nursingProject.setNursingProjectCreatetime(new Date());
					nursingProjectService.insertSelective(nursingProject);
				}
			 }
		    //职业照片,职业证书、资格证书、职称证书(三合一逗号隔开)
		    if(NurseNurseLicensepic!=null || !"".equals(NurseNurseLicensepic)){
				String NurseNurseLicensepicNew = savePic.manyImgPathAdd(request,
						NurseId, "NurseLicensepic", NurseNurseLicensepic);
				nurse.setNurseNurseLicensepic(NurseNurseLicensepicNew);
			}
		    //认证中状态
			nurse.setNurseDistrict("2");
			
			int i = nurseService.updateByNurseId(nurse);
			if (i > 0) {
				netState.setData("认证提交成功");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				netState.setData("认证提交失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		return netState;
	}
	
	//护士资金池
	@RequestMapping(value = "/CapitalInfoByNurseId", method = RequestMethod.POST)
	public @ResponseBody
	NetState CapitalInfoByNurseId(HttpServletRequest request, String NurseId,Integer pageNum)throws Exception{
		NetState netState = new NetState();
		if(NurseId==null || "".equals(NurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("分页参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<CapitalNursePool> newlist = capitalNursePoolService.selectCapitalInfoByNurseId(NurseId);
		
		// 每页多少条
		int num = 10;
		List<CapitalNursePool> paging = new ArrayList<CapitalNursePool>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有记录了");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
			return netState;

		} else if ((newlist.size() - (pageNum * num)) < 0) {
			netState.setData("超出范围");
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		} else {
			// 分页操作
			// 判断是否是最后一页
			if ((newlist.size() - pageNum * num) < num) {
				for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
					paging.add(newlist.get(i + pageNum * num));
				}
			} else {
				for (int i = 0; i < num; i++) {
					paging.add(newlist.get(i + pageNum * num));
					
				}
			}
		}
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(paging);
		return netState;
}
	//搜护士selectKeyWordFromNurseKdh
	@RequestMapping(value = "/searchNurse", method = RequestMethod.POST)
	public @ResponseBody
	NetState searchNurse(HttpServletRequest request, String keyWord,Integer pageNum)throws Exception{
		NetState netState = new NetState();
		if(keyWord==null || "".equals(keyWord)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("分页参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<Nurse> newlist = nurseService.selectKeyWordFromNurseKdh(keyWord);
		// 每页多少条
			int num = 10;
			List<Nurse> paging = new ArrayList<Nurse>();
			if (newlist == null || newlist.size()<=0 ) {
				netState.setData("没有护士了");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
				return netState;

			} else if ((newlist.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
				return netState;
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((newlist.size() - pageNum * num) < num) {
					for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
						paging.add(newlist.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(newlist.get(i + pageNum * num));
						
					}
				}
			}
		for (Nurse nurseVO : paging) {
			//获取医院ID
			String hosId =nurseVO.getNurseWorkUnit();
			if(hosId!=null && !"".equals(hosId)){
			  HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
			    if(hospitalVO!=null && !"".equals(hospitalVO)){
			    	nurseVO.setNurseWorkUnit(hospitalVO.getHospitalName());
			    }else{
			    	nurseVO.setNurseWorkUnit("该护士未选定医院");
				}
			}else{
				nurseVO.setNurseWorkUnit("该护士未选定医院");
			}
			//获取专业ID
			String majorId = nurseVO.getNurseOffice();
			if(majorId != null && !"".equals(majorId)){
				SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
				if(simpleMajor!=null && !"".equals(simpleMajor)){
					nurseVO.setNurseOffice(simpleMajor.getSimpleMajorName());
				}else{
					nurseVO.setNurseOffice("该护士未选定专业");
				}
			}else{
				nurseVO.setNurseOffice("该护士未选定专业");
			}
		}	
			
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(paging);
		return netState;
	}
	//用户和护士验证绑定支付密码的短信验证码
	@RequestMapping(value = "/SMSVerification", method = RequestMethod.POST)
	public @ResponseBody
	NetState SMSVerification(HttpSession session,String drawcode)throws Exception{
		NetState netState = new NetState();
		//判断短信验证码
		Integer secode = (Integer) session.getAttribute("drawcode");
		if(String.valueOf(secode) != drawcode && !drawcode.equals(String.valueOf(secode))){
			netState.setData("验证码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("验证成功");
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	
		
	
	//护士绑定支付账号和密码
	@RequestMapping(value = "/BindAccountAndPassword", method = RequestMethod.POST)
	public @ResponseBody
	NetState BindAccountAndPassword(HttpSession session,String nurseId,String pwd,String account,String drawcode)throws Exception{
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
	/*	if(pwd != null && !"".equals(pwd)){
			if(drawcode == null || "".equals(drawcode)){
				netState.setData("请输入短信验证码");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
				//判断短信验证码
				Integer secode = (Integer) session.getAttribute("drawcode");
				System.out.println("secode="+secode);
				System.out.println("drawcode="+drawcode);
				if(String.valueOf(secode) != drawcode && !drawcode.equals(String.valueOf(secode))){
					netState.setData("验证码错误");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
		}*/
		
		
		//判断该护士有没有绑定过支付账号和密码
		NursePaymentSettings settings =	nursePaymentSettingsService.selectByPrimaryKey(nurseId);
		
		if(settings==null || "".equals(settings)){//插入
			NursePaymentSettings settings2 = new NursePaymentSettings();
			settings2.setNursePaymentSettingsNurseId(nurseId);
			if(pwd!=null && !"".equals(pwd)){
				settings2.setNursePaymentSettingsPwd(Md5Encrypt.Bit16(pwd).toLowerCase());
			}
			if(account!=null && !"".equals(account)){
				settings2.setNursePaymentSettingsAccount(account);
			}
		
			int i = nursePaymentSettingsService.insertSelective(settings2);
			if(i==0){
				netState.setData("绑定错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				netState.setData("绑定成功");
				netState.setErrorCode(NetState.SUCCESS);
			}
		}else{//更新
			NursePaymentSettings settings3 = new NursePaymentSettings();
			settings3.setNursePaymentSettingsNurseId(nurseId);
			if(pwd!=null && !"".equals(pwd)){
				settings3.setNursePaymentSettingsPwd(Md5Encrypt.Bit16(pwd).toLowerCase());
			}
			if(account!=null && !"".equals(account)){
				settings3.setNursePaymentSettingsAccount(account);
			}
			int i = nursePaymentSettingsService.updateByPrimaryKeySelective(settings3);
			if(i==0){
				netState.setData("更新错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				netState.setData("更新成功");
				netState.setErrorCode(NetState.SUCCESS);
			}
		}
		return netState;
	}
	
	/**
	 * --------------------------------------用户端--------------------------------
	 * -----------
	 **/
	
	/**
	 * 添加用户支付密码
	 * @param userId 用户ID
	 * @param alipayPassword 支付密码
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="AlipayPassword", method = RequestMethod.POST)
	public @ResponseBody NetState AlipayPassword(HttpSession session,String userId, String alipayPassword,String drawcode) throws Exception{
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(alipayPassword == null || "".equals(alipayPassword)){
			netState.setData("支付密码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(drawcode == null || "".equals(drawcode)){
			netState.setData("验证码不能为空");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			User user = new User();
			user.setUserDistrict(Md5Encrypt.Bit16(alipayPassword).toLowerCase());
			UserExample userExample = new UserExample();
			com.chance.ssm.po.UserExample.Criteria criteria = userExample.createCriteria();
			criteria.andUserIdEqualTo(userId);
			try {
				int i = userService.updateByExampleSelective(user, userExample);
				if(i > 0){
					netState.setData("添加成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("添加成功");
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
	 * 绑定账号
	 * @param userId 用户ID
	 * @param alipayaccount 支付账号
	 * @return
	 */
	@RequestMapping(value="bindingAlipay", method = RequestMethod.POST)
	public @ResponseBody NetState BindingAlipay(String userId, String alipayaccount){
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(alipayaccount == null || "".equals(alipayaccount)){
			netState.setData("支付账号错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			
			User user= new User();
			user.setUserCity(alipayaccount);
			UserExample userExample = new UserExample();
			com.chance.ssm.po.UserExample.Criteria criteria = userExample.createCriteria();
			criteria.andUserIdEqualTo(userId);
			try {
				int i = userService.updateByExampleSelective(user, userExample);
				if(i > 0){
					netState.setData("绑定成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("绑定失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
		
	}
	// 用户端修改个人信息
	@RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState updateUserInfo(HttpServletRequest request, String userId,
			String userHeader, String userNick, String userPhone,String userSex,String userEmail)
			throws Exception {
		NetState netState = new NetState();
		if(userId==null || "".equals(userId)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		User user1 = userService.selectForUserByID(userId);
		if(user1 == null || "".equals(user1)){
			netState.setData("用户不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		UserExample userExample = new UserExample();
		com.chance.ssm.po.UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		
		SavePic savePic = new SavePic();
		User user = new User();
		if(userHeader!=null && !"".equals(userHeader)){
		String header = savePic.oneImgPathAdd(request, userId, "UserHeader", userHeader);
		user.setUserHeader(header);
		}
		if(userNick!=null && !"".equals(userNick)){
			user.setUserNick(userNick);
		}
		if(userPhone!=null && !"".equals(userPhone)){
			user.setUserPhone(userPhone);
		}
		if(userSex!=null && !"".equals(userSex)){
			user.setUserSex(userSex);
		}
		if(userEmail!=null && !"".equals(userEmail)){
			user.setUserEmail(userEmail);
		}
		int i = userService.updateByExampleSelective(user, userExample);
		
		if (i > 0) {
			netState.setData("修改成功");
			netState.setErrorCode(NetState.SUCCESS);
		} else {
			netState.setData("修改失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		return netState;
	}

	// 用户端注册
	@RequestMapping(value = "/UserRegistered", method = RequestMethod.POST)
	public @ResponseBody
	NetState UserRegistered(HttpServletRequest request,HttpSession session, String UserName,
			String UserPwd, String UserNick, String UserHeader,String invitationcode,String code)
			throws Exception {
		NetState netState = new NetState();
		if (UserName == null || "".equals(UserName)) {
			netState.setData("账号错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (UserPwd == null || "".equals(UserPwd)) {
			netState.setData("密码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} 
		/*else if (UserNick == null || "".equals(UserNick)) {
			netState.setData("昵称错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (UserHeader == null || "".equals(UserHeader)) {
			netState.setData("头像错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}*/
		else if (code == null || "".equals(code)) {
			netState.setData("验证码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			// 判断该账号有没有被注册
			User user1 = userService.selectForUserName(UserName);
			if (user1 != null) {
				netState.setData("该账号已经注册");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			//判断短信验证码
			Integer secode = (Integer) session.getAttribute("code");
			if(String.valueOf(secode) != code && !code.equals(String.valueOf(secode))){
				netState.setData("验证码错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			SimpleDateFormat format = new SimpleDateFormat();
			String UserId = java.util.UUID.randomUUID().toString()
					.replaceAll("-", "");
			if(invitationcode!=null && !"".equals(invitationcode)){//如果邀请码不为空
				//判断验证码的长度
				int length = invitationcode.length();
				User user2  = new User();
				if(length>6){//手机号
					user2 = userService.selectForUserName(invitationcode);
				}else{//验证码
					user2 = userService.selectUserForInvitationcode(invitationcode);
				}
				if(user2==null || "".equals(user2)){
					netState.setData("邀请码不存在");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}else{//邀请码填写成功(触发器自动给用户增加积分)
					SigninSet signinSet = userService.selectUserRegistermark();
					Integer userMark = signinSet.getUserRegisterIntegeral();
					Invitation invitation = new Invitation();
					invitation.setInvitationId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					invitation.setInvitationUserId(user2.getUserId());//邀请人id
					invitation.setInvitationBeuserId(UserId);//被邀请人
					invitation.setInvitationIdentity(0);
					invitation.setInvitationGetmark(userMark);
					invitation.setInvitationCreatetime(new Date());
					int c = invitationService.insertSelective(invitation);
					if(c==0){
						netState.setData("邀请错误");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}else{
						//给这个邀请码的用户发送优惠券
						//查看邀请送的优惠券信息
						Coupon coupony = couponService.selectCountTypeByType(2);
						if(coupony!=null && !"".equals(coupony)){//说明后台设置了注册送的优惠券
							//将优惠券发给用户
							CouponUser couponUser = new CouponUser();
							couponUser.setCouponUserId(java.util.UUID.randomUUID().toString()
										.replaceAll("-", ""));
							couponUser.setCouponUserUserId(user2.getUserId());
							couponUser.setCouponUserMoney(coupony.getCouponMoney());
							couponUser.setCouponUserPic(coupony.getCouponPic());
							couponUser.setCouponUserFullGive(coupony.getCouponFullGive());
							//得到过期天数
							DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String date  = null;
							int time = coupony.getCouponExpirationTime();
							if(!"".equals(time) && time!=0){//如果设置了过期时间
								//将当前时间加上过期的天数
								date =DateUtil.getAfterafewdays(coupony.getCouponExpirationTime());
								
								couponUser.setCouponUserExpirationTime(fmt.parse(date));
							}
							couponUser.setCouponUserIstouse(1);
							couponUser.setCouponUserSperak(coupony.getCouponSpeak());
							couponUser.setCouponUserCreatetime(new Date());
							int b = couponService.insertSelectiveCouponUser(couponUser);
							
							////将优惠券记录到用户站内信中
							StandInnerLetter innerLetter1 = new StandInnerLetter();
							innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							innerLetter1.setStandInnerLetterUserId(user2.getUserId());                     
							innerLetter1.setStandInnerLetterUserIdentity(1);
							innerLetter1.setStandInnerLetterTitle("优惠券消息");
							//0订单消息/1资金消息/2系统通知
							innerLetter1.setStandInnerLetterUserType(1);
							innerLetter1.setStandInnerLetterContent("您于"+format.format(new Date())+"获得了一个¥"+coupony.getCouponMoney()+"的推荐优惠券,到"+fmt.parse(date)+"过期");
							innerLetter1.setStandInnerLetterCreatetime(new Date());
							standInnerLetterService.insertSelective(innerLetter1);
							
							if(b==0){
								netState.setData("推荐送优惠券错误");
								netState.setErrorCode(NetState.PARAMS_ERROR);
								return netState;
							}
						}
					}
				}
			}
			
			// 注册
			
			SavePic savePic = new SavePic();
			User user = new User();
			user.setUserId(UserId);
			user.setUserName(UserName);
			user.setUserPwd(Md5Encrypt.Bit16(UserPwd).toLowerCase());
			user.setUserPhone(UserName);
			/*user.setUserNick(UserNick);
			user.setUserHeader(savePic.oneImgPathAdd(request, UserId,
					"UserHeader", UserHeader));*/
			//昵称
			//截取手机号
			String before = UserName.substring(0, 3);
			String last = UserName.substring(8, UserName.length());
			user.setUserNick(before+"****"+last);
			//邀请码生成
			String value = ShareCodeUtil.toSerialNumber(6);
			user.setUserInvitationcode(new String(value));
			user.setUserCreatetime(new Date());

			// 头像保存到数据库并且保存到文件夹
			int i = userService.insertSelective(user);
			if (i > 0) {
				//注册成功送优惠券
				//查看注册送的优惠券信息
				Coupon coupon = couponService.selectCountTypeByType(1);
				if(coupon!=null && !"".equals(coupon)){//说明后台设置了注册送的优惠券
					//将优惠券发给用户
					CouponUser couponUser = new CouponUser();
					couponUser.setCouponUserId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
					couponUser.setCouponUserUserId(UserId);
					couponUser.setCouponUserMoney(coupon.getCouponMoney());
					couponUser.setCouponUserPic(coupon.getCouponPic());
					couponUser.setCouponUserFullGive(coupon.getCouponFullGive());
					//得到过期天数
					int time = coupon.getCouponExpirationTime();
					DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String date  = "";
					if(!"".equals(time) && time!=0){//如果设置了过期时间
						//将当前时间加上过期的天数
						date = DateUtil.getAfterafewdays(coupon.getCouponExpirationTime());
						
						couponUser.setCouponUserExpirationTime(fmt.parse(date));
					}
					couponUser.setCouponUserIstouse(1);
					couponUser.setCouponUserSperak(coupon.getCouponSpeak());
					couponUser.setCouponUserCreatetime(new Date());
					int c = couponService.insertSelectiveCouponUser(couponUser);
					
					////将优惠券记录到用户站内信中
					StandInnerLetter innerLetter1 = new StandInnerLetter();
					innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					innerLetter1.setStandInnerLetterUserId(UserId);                     
					innerLetter1.setStandInnerLetterUserIdentity(1);
					innerLetter1.setStandInnerLetterTitle("优惠券消息");
					//0订单消息/1资金消息/2系统通知
					innerLetter1.setStandInnerLetterUserType(1);
					innerLetter1.setStandInnerLetterContent("您于"+format.format(new Date())+"获得了一个¥"+coupon.getCouponMoney()+"的注册优惠券,到"+fmt.parse(date)+"过期");
					innerLetter1.setStandInnerLetterCreatetime(new Date());
					standInnerLetterService.insertSelective(innerLetter1);
					if(c==0){
						netState.setData("注册送优惠券错误");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}
				}
				
				
				
				netState.setData("注册成功");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				netState.setData("注册错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		}
		return netState;
	}

	// 用户端端登录
	@RequestMapping(value = "/UserLogin", method = RequestMethod.POST)
	public @ResponseBody
	NetState UserLogin(String UserName, String UserPwd) throws Exception {
		NetState netState = new NetState();
		if (UserName == null || "".equals(UserName)) {
			netState.setData("账号错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (UserPwd == null || "".equals(UserPwd)) {
			netState.setData("密码错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			User user1 = userService.selectForUserName(UserName);
			if (user1 == null) {// 先查看数据库有没有该账号
				netState.setData("该账号还未注册");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			} else {
				String state = user1.getUserUsestate();
				if(state=="1"||"1".equals(state) ){
					netState.setData("该账户已被封,请找客服解封");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
				// 比较输入的密码和数据库的密码
				if (Md5Encrypt.Bit16(UserPwd).toLowerCase()
						.equals(user1.getUserPwd())) {
					netState.setData("登录成功");
					netState.setJson(user1);
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					netState.setData("密码错误");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			}
		}
		return netState;
	}
	//用户查看所有未过期优惠券
	@RequestMapping(value = "/selectAllUserCouponInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectAllUserCouponInfo(String userId,Integer pageNum) throws Exception {
		NetState netState = new NetState();
		if(userId==null || "".equals(userId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(pageNum==null || "".equals(pageNum)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<CouponUser> newlist = couponService.selectAllUserCouponInfo(userId);
		
		// 每页多少条
		int num = 10;
		List<CouponUser> paging = new ArrayList<CouponUser>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有符合的数据");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
			return netState;

		} else if ((newlist.size() - (pageNum * num)) < 0) {
			netState.setData("超出范围");
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		} else {
			// 分页操作
			// 判断是否是最后一页
			if ((newlist.size() - pageNum * num) < num) {
				for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
					paging.add(newlist.get(i + pageNum * num));
				}
			} else {
				for (int i = 0; i < num; i++) {
					paging.add(newlist.get(i + pageNum * num));
					
				}
			}
		}
		if(paging==null || "".equals(paging)){
			netState.setData("没有符合的数据");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(paging);
		}
		return netState;
	}
	//根据护士ID查询所有红包
	@RequestMapping(value = "/selectAllNurseRedPackert", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectAllNurseRedPackert(String nuserId) throws Exception {
			NetState netState = new NetState();
			//根据护士ID查询所有红包
			List<RedPacketsUser> list =packetsService.selectRedPacketsNurseAllInfo(nuserId);
			
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(list);
			return netState;
		}
	
	
	//通过优惠券ID查询优惠券
		@RequestMapping(value = "/selectUserCouponInfoById", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectUserCouponInfoById(String couponId) throws Exception {
			NetState netState = new NetState();
			if(couponId==null || "".equals(couponId)){
				netState.setData("参数错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			CouponUser couponUser = couponService.selectByPrimaryKeyByCouponUserId(couponId);
			if(couponUser==null || "".equals(couponUser)){
				netState.setData("该订单不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(couponUser);
			}
			return netState;
		}
		//用户查看个人账单明细
		@RequestMapping(value = "/selectCapitalUserPoolInfo", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectCapitalUserPoolInfo(String userId,Integer pageNum) throws Exception {
			NetState netState = new NetState();
			if(userId=="" || "".equals(userId)){
				netState.setData("参数错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			List<CapitalUserPool> newlist = capitalUserPoolService.selectCapitalUserPoolInfo(userId);
			// 每页多少条
			int num = 10;
			List<CapitalUserPool> paging = new ArrayList<CapitalUserPool>();
			if (newlist == null || newlist.size()<=0 ) {
				netState.setData("没有符合的数据");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
				return netState;

			} else if ((newlist.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
				return netState;
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((newlist.size() - pageNum * num) < num) {
					for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
						paging.add(newlist.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(newlist.get(i + pageNum * num));
						
					}
				}
			}
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(paging);
			return netState;
		}
		
	/**
	 * 查询所有的护士，并按照距离排序
	 * 
	 * @param latitude
	 *            经度
	 * @param longitude
	 *            纬度
	 * @param pageNum
	 *            分页数
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "selectnurseall", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectNurseAll(Double latitude, Double longitude, Integer pageNum) {
		NetState netState = new NetState();
		if (latitude == null || "".equals(latitude)) {
			netState.setData("经度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (longitude == null || "".equals(longitude)) {
			netState.setData("纬度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (pageNum == null || "".equals(pageNum)) {
			netState.setData("分页错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			NurseExample nurseExample = new NurseExample();
			List<NurseVO> nurseVOs = new ArrayList<NurseVO>();
			try {

				// 统计所有护士 个数
				int nurseNumber = nurseService.countByExample(nurseExample);

				// 查询所有的护士信息

				nurseVOs = nurseService.selectByExampleRsuVO(nurseExample);
				// 根据经纬度算距离
				int nurseVosize = nurseVOs.size();
				for (int i = 0; i < nurseVosize; i++) {
					if (nurseVOs.get(i).getNursePositionX() != null	&& nurseVOs.get(i).getNursePositionY() != null) {
						nurseVOs.get(i).setDistance(
								LzhUtils.LantitudeLongitudeDist(nurseVOs.get(i)
										.getNursePositionX(), nurseVOs.get(i)
										.getNursePositionY(), latitude,
										longitude));
						nurseVOs.get(i).setNursedNumber(
								Integer.toString(nurseNumber));
					}
				}
				// 按照距离排序
				Collections.sort(nurseVOs);

				int num = 5;
				List<NurseVO> paging = new ArrayList<NurseVO>();
				if (nurseVOs == null || nurseVOs.size() <= 0) {
					netState.setData("没有订单了");
					netState.setErrorCode(NetState.SUCCESS);

				} else if ((nurseVOs.size() - (pageNum * num)) < 0) {
					netState.setData("超出范围");
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					// 分页操作
					// 判断是否是最后一页
					if ((nurseVOs.size() - pageNum * num) < num) {
						for (int i = 0; i < (nurseVOs.size() - (pageNum * num)); i++) {
							paging.add(nurseVOs.get(i + pageNum * num));
						}
					} else {
						for (int i = 0; i < num; i++) {
							paging.add(nurseVOs.get(i + pageNum * num));

						}
					}
				}
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return netState;
	}
	
	/**
	 * 通过护士ID查询服务项目
	 * @param nurseid 护士ID
	 * @return
	 */
	@RequestMapping(value="selectContentBynurseId", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectContentBynurseId(String nurseid){
		
		NetState netState = new NetState();
		if (nurseid == null || nurseid.equals("")) {
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			List<ManageNursingContentVO> mNursingContentVOs = new ArrayList<ManageNursingContentVO>();
			try {
				// 查询护士的所有的服务项
				List<NursingProject> nursingProjects = new ArrayList<NursingProject>();
				NursingProjectExample nursingProjectExample = new NursingProjectExample();
				com.chance.ssm.po.NursingProjectExample.Criteria criteria = nursingProjectExample
						.createCriteria();
				criteria.andNursingNurseidEqualTo(nurseid);
				nursingProjects = nursingProjectService
						.selectByExample(nursingProjectExample);
				// 获取所有的二级菜单ID
				List<String> contentidlist = new ArrayList<String>();
				for (int i = 0; i < nursingProjects.size(); i++) {
					if (nursingProjects.get(i).getNursingProjectMacontent() != null) {
						contentidlist.add(nursingProjects.get(i)
								.getNursingProjectMacontent());
					}
				}
				// 查询二级菜单信息
				if (contentidlist.size() > 0) {

					ManageNursingContentExample manageNursingContentExample = new ManageNursingContentExample();
					com.chance.ssm.po.ManageNursingContentExample.Criteria criteria2 = manageNursingContentExample
							.createCriteria();
					criteria2.andManageNursingContentIdIn(contentidlist);
					manageNursingContentExample.setOrderByClause("content_order asc,manage_nursing_content_updatetime desc, manage_nursing_content_createtime desc");
					mNursingContentVOs = mNursingContentService
							.selectByExampleRuVO(manageNursingContentExample);

					// 查询三级菜单信息
					List<Goods> goods = new ArrayList<Goods>();
					GoodsExample goodsExample = new GoodsExample();
					com.chance.ssm.po.GoodsExample.Criteria criteria3 = goodsExample
							.createCriteria();
					criteria3.andGoodsContentIn(contentidlist);
					criteria3.andGoodsNoteEqualTo("0");//上架
					//先按默认项进行排序，再按照金钱大小进行排序
					goodsExample.setOrderByClause("goods_isdefault asc,goods_money asc");
					goods = goodsService.selectByExample(goodsExample);
					//默认钱数List初始化
					List<BigDecimal> moneydefys = new ArrayList<BigDecimal>();
					//得到默认值的钱数
					int goodsize = goods.size();
					for(int i = 0; i < goodsize; i++){
						if(goods.get(i).getGoodsIsdefault()==0){
							moneydefys.add(goods.get(i).getGoodsMoney());
						}
					}
					//如果有默认项
					if(moneydefys.size() > 1){
						BigDecimal minmoneydefault = new BigDecimal(0);
						int mNursingContentVOsize = mNursingContentVOs.size();
						for (int i = 0; i < mNursingContentVOsize; i++) {
							for (int j = 0; j < goods.size(); j++) {
								if (mNursingContentVOs.get(i).getManageNursingContentId().equals(goods.get(j).getGoodsContent())) {
									if(goods.get(j).getGoodsIsdefault()==0){
										//把默认项的钱相加
										 minmoneydefault = minmoneydefault.add(goods.get(j).getGoodsMoney());										
									}
									//把得到的钱数加到相对应的选项实体类
									mNursingContentVOs.get(i).setMinMoney(minmoneydefault.toString());
									
								}
							}
						}
					}
					//如果没有默认项
					if (moneydefys.size() < 1) {
						// 把最低价钱加到二级菜单扩展类中
						for (int i = 0; i < mNursingContentVOs.size(); i++) {
							for (int j = 0; j < goods.size(); j++) {
								if (mNursingContentVOs.get(i).getManageNursingContentId().equals(goods.get(j).getGoodsContent())) {
									mNursingContentVOs.get(i).setMinMoney(goods.get(0).getGoodsMoney().toString());
								}
							}
						}
					}

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(mNursingContentVOs.size()>0){
				List<String> goodContentidlist = new ArrayList<String>();
				//获取二级菜单ID
				for (int i = 0; i < mNursingContentVOs.size(); i++) {
					String contentid = mNursingContentVOs.get(i).getManageNursingContentId();
					goodContentidlist.add(mNursingContentVOs.get(i).getManageNursingContentId());

				}
				
				StatisticsExample statisticsExample = new StatisticsExample();
				com.chance.ssm.po.StatisticsExample.Criteria criteria3 = statisticsExample.createCriteria();
				criteria3.andCountContentIdIn(goodContentidlist);
				List<StatisticsVO> statistics = new ArrayList<StatisticsVO>();
				try {
					statistics = statisticsService.countByExamplegroup(statisticsExample);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//循环吧统计此时赋值给mNursingContentVOs实体类
				
				for (int e = 0; e < mNursingContentVOs.size(); e++) {
					for(int i = 0; i < statistics.size(); i++){
						JSONArray json = new JSONArray();
						if(mNursingContentVOs.get(e).getManageNursingContentId().equals(statistics.get(i).getCountContentId())){
							//根据这个服务ID统计次数
							StatisticsExample statisticsExample1 = new StatisticsExample();
							com.chance.ssm.po.StatisticsExample.Criteria criteria4 = statisticsExample1.createCriteria();
							criteria4.andCountContentIdEqualTo(statistics.get(i).getCountContentId());
							int countNunber= statisticsService.countByExample(statisticsExample1);
							//把数据转成json然后再转成String
							JSONObject jo = new JSONObject();
							jo.put("countContentId", statistics.get(i).getCountContentId());
							jo.put("contentName", statistics.get(i).getContentName());
							jo.put("number", countNunber);
							json.put(jo);
							String countnumber = json.toString();
							mNursingContentVOs.get(e).setNursedNumber(countnumber);
						}
					}
				}
				
			}
			
			// 把“\”替换成“/”
			for (int i = 0; i < mNursingContentVOs.size(); i++) {
				if (mNursingContentVOs.get(i).getContentImgurl() != null) {
					String zhuanye = mNursingContentVOs.get(i)
							.getContentImgurl().replaceAll("\\\\", "/");
					mNursingContentVOs.get(i).setContentImgurl(zhuanye);
				}
			}
			if (mNursingContentVOs.size() > 0) {
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(mNursingContentVOs);
			} else {
				netState.setData("查询成功");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);

			}

		}

		return netState;
		
	}
	/**
	 * 通过ID查询护士信息
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
	@RequestMapping(value = "selectfornursebyid", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectforNurseById(String userId, String nurseid, Double latitude,
			Double longitude, HttpServletRequest request) throws Exception{
		NetState netState = new NetState();
		if (nurseid == null || nurseid.equals("")) {
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} else if (latitude == null || latitude.equals("")) {
			netState.setData("经度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} else if (longitude == null || longitude.equals("")) {
			netState.setData("维度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} 
			NurseVO nurseVO = new NurseVO();

				// 查询护士的基本信息
				nurseVO = nurseService.selectForNurseIdreultVO(nurseid);
				
				if(nurseVO==null || "".equals(nurseVO)){
					netState.setData("不存在该护士");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
				
				
				//获取医院ID
				String hosId =  nurseVO.getNurseWorkUnit();
				
				if(hosId!=null && !"".equals(hosId)){
				  HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
				    if(hospitalVO!=null && !"".equals(hospitalVO)){
				    	nurseVO.setNurseWorkUnit(hospitalVO.getHospitalName());
				    }else{
				    	nurseVO.setNurseWorkUnit("该护士未选定医院");
					}
				}else{
					nurseVO.setNurseWorkUnit("该护士未选定医院");
				}
				
				//获取专业ID
				String majorId = nurseVO.getNurseOffice();
				if(majorId != null && !"".equals(majorId)){
					SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
					if(simpleMajor!=null && !"".equals(simpleMajor)){
						nurseVO.setNurseOffice(simpleMajor.getSimpleMajorName());
					}else{
						nurseVO.setNurseOffice("该护士未选定专业");
					}
				}else{
					nurseVO.setNurseOffice("该护士未选定专业");
				}
				// 计算护士的好评率
				EvaluateExample evaluateExample = new EvaluateExample();
				Criteria criteria = evaluateExample.createCriteria();
				criteria.andEvaluateNurseidEqualTo(nurseid);
				//统计该护士被评价的次数
				int count = evaluateService.countByExample(evaluateExample);
				List<Evaluate> evaluates = new ArrayList<Evaluate>();
				//查询该护士被评价的内容
				evaluates = evaluateService.selectByExample(evaluateExample);
				BigDecimal sum = new BigDecimal(0);
				for (int i = 0; i < evaluates.size(); i++) {
					sum = sum.add(evaluates.get(i).getEvaluateMark());
				}
				if (count == 0) {
					count = 1;
				}
				BigDecimal average = sum.divide(new BigDecimal(count), 0);
				if(average!=null){
					nurseVO.setApprovalRating(average.toString());
				}
				// 服务次数
				
				OrderReceiverExample oReceiverExample = new OrderReceiverExample();
				com.chance.ssm.po.OrderReceiverExample.Criteria criteria2 = oReceiverExample
						.createCriteria();
				criteria2.andOrderNurseidEqualTo(nurseid);
				//查询已完成的订单
				criteria2.andOrderReceivestateEqualTo("4");
				int nursedNumber = orderReceiverService
						.countByExample(oReceiverExample);
				nurseVO.setNursedNumber(Integer.toString(nursedNumber));

				// 关注的人数
				FollowExample followExample = new FollowExample();
				com.chance.ssm.po.FollowExample.Criteria criteria3 = followExample
						.createCriteria();
				criteria3.andFollowBefollowidEqualTo(nurseid);
				//统计关注的人数
				int attentionNumber = followService
						.countByExample(followExample);
				nurseVO.setAttentionNumber(Integer.toString(attentionNumber));
				if (userId != null && !"".equals(userId)) {
					List<Follow> follows = new ArrayList<Follow>();
					criteria3.andFollowFollowidEqualTo(userId);
					follows = followService.selectByExample(followExample);
					if (follows.size() > 0) {
						nurseVO.setIsfollow("1");
					} else {
						nurseVO.setIsfollow("0");
					}
				}
				// 计算相距距离
				nurseVO.setDistance(LzhUtils.LantitudeLongitudeDist(
						nurseVO.getNursePositionX(),
						nurseVO.getNursePositionY(), latitude, longitude));

				// 写入返回数据
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(nurseVO);

		return netState;

	}

	/**
	 * 根据护士ID查询护士的服务信息并统计服务次数
	 * 
	 * @param nurseid
	 *            护士ID
	 * @return
	 */
	@RequestMapping(value = "selectnurseprojectbyid", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectNurseProjectById(String nurseid) throws Exception{
		NetState netState = new NetState();
		if (nurseid == null || nurseid.equals("")) {
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			List<NursingProject> NursingProjectlist = new ArrayList<NursingProject>();
			List<NursingProject> newNursingProjectlist = new ArrayList<NursingProject>();
			// 查询所有护士所共有的服务项
			List<ManageNursingContentVO> mNursingContentVOs = new ArrayList<ManageNursingContentVO>();
			// 截取护士ID
			String[] nurseidsub = nurseid.split(",");
			int nurseNumber = nurseidsub.length;
			for (int i = 0; i < nurseidsub.length; i++) {
				// 查询一个护士所有的服务项
					NursingProjectExample nursingProjectExample = new NursingProjectExample();
					com.chance.ssm.po.NursingProjectExample.Criteria criteria = nursingProjectExample
							.createCriteria();
					//查询护士所有的服务项
					criteria.andNursingNurseidEqualTo(nurseidsub[i]);
					List<NursingProject>  nursingProjects = nursingProjectService.selectByExample(nursingProjectExample);
					
					if(nursingProjects == null || nursingProjects.size()==0){
						netState.setData("没有数据");
						netState.setErrorCode(NetState.SUCCESS);
						return netState;
					}
					NursingProjectlist.addAll(nursingProjects);
			}
				if(nurseNumber>1){
					for  ( int  i  =   0 ; i  <  NursingProjectlist.size()  -   1 ; i ++ )   { 
					    for  ( int  j  =  NursingProjectlist.size()  -   1 ; j  >  i; j -- )  
					    	{ 
						      if  (NursingProjectlist.get(j).getNursingProjectMacontent().equals(NursingProjectlist.get(i).getNursingProjectMacontent())
						    		  
						    		  )   { 
						    	  newNursingProjectlist.add(NursingProjectlist.get(j));
						    	  
						      } 
					    	} 
					} 
				}
				if(nurseNumber>1){
					 //不止一个人
				    for (int c = 0; c < newNursingProjectlist.size(); c++) {
						ManageNursingContentVO nursingProjectExample112 = mNursingContentService.selectManageNursingContentNewF(newNursingProjectlist.get(c).getNursingProjectMacontent());
						mNursingContentVOs.add(nursingProjectExample112);
					}
				}else{
					 //只有一个人
				    for (int c = 0; c < NursingProjectlist.size(); c++) {
						ManageNursingContentVO nursingProjectExample112 = mNursingContentService.selectManageNursingContentNewF(NursingProjectlist.get(c).getNursingProjectMacontent());
						mNursingContentVOs.add(nursingProjectExample112);
					}
				}
				List<String> goodContentidlist = new ArrayList<String>();
				// 统计护理次数
				if (mNursingContentVOs.size() > 0) {
					//初始化需要查询的产品所需的二级菜单集
					
					//获取二级菜单ID
					for (int i = 0; i < mNursingContentVOs.size(); i++) {
						String contentid = mNursingContentVOs.get(i).getManageNursingContentId();
						goodContentidlist.add(mNursingContentVOs.get(i).getManageNursingContentId());

					}
					StatisticsExample statisticsExample = new StatisticsExample();
					com.chance.ssm.po.StatisticsExample.Criteria criteria3 = statisticsExample.createCriteria();
					criteria3.andCountContentIdIn(goodContentidlist);
					List<StatisticsVO> statistics = new ArrayList<StatisticsVO>();
					statistics = statisticsService.countByExamplegroup(statisticsExample);
					//循环吧统计此时赋值给mNursingContentVOs实体类
					
					for (int e = 0; e < mNursingContentVOs.size(); e++) {
						for(int i = 0; i < statistics.size(); i++){
							JSONArray json = new JSONArray();
							if(mNursingContentVOs.get(e).getManageNursingContentId().equals(statistics.get(i).getCountContentId())){
								//根据这个服务ID统计次数
								StatisticsExample statisticsExample1 = new StatisticsExample();
								com.chance.ssm.po.StatisticsExample.Criteria criteria4 = statisticsExample1.createCriteria();
								criteria4.andCountContentIdEqualTo(statistics.get(i).getCountContentId());
								int countNunber= statisticsService.countByExample(statisticsExample1);
								//把数据转成json然后再转成String
								JSONObject jo = new JSONObject();
								jo.put("countContentId", statistics.get(i).getCountContentId());
								jo.put("contentName", statistics.get(i).getContentName());
								jo.put("number", countNunber);
								json.put(jo);
								String countnumber = json.toString();
								mNursingContentVOs.get(e).setNursedNumber(countnumber);
							}
						}
					}
					
				}
				//根据二级产品ID得到三级的价格(默认优先,其次钱数)
				for (ManageNursingContentVO manageNursingContentVO : mNursingContentVOs) {
					//得到二级Id
					String manageNursingContentId = manageNursingContentVO.getManageNursingContentId();
					if(manageNursingContentId!=null && !"".equals(manageNursingContentId)){
						List<Goods> goodslist = goodsService.selectGoodsMoneyByOther(manageNursingContentId);
						//得到钱数
						BigDecimal money = goodslist.get(0).getGoodsMoney();
						if(money!=null || "".equals(money)){
							manageNursingContentVO.setMinMoney(money.toString());
						}
					}
				}
				
				// 把“\”替换成“/”
				for (int i = 0; i < mNursingContentVOs.size(); i++) {
					if (mNursingContentVOs.get(i).getContentImgurl() != null) {
						String zhuanye = mNursingContentVOs.get(i)
								.getContentImgurl().replaceAll("\\\\", "/");
						mNursingContentVOs.get(i)
								.setContentImgurl(zhuanye);
					}
				}
				
				if (mNursingContentVOs.size() == 0) {
					netState.setData("没有数据");
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(mNursingContentVOs);
				}
		}
		return netState;

	}
	//根据护士ID查询护士的基本信息
	@RequestMapping(value = "SelectNurseBasicsInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectNurseBasicsInfo(String nurseId) throws Exception{
		NetState netState = new NetState();
		if (nurseId == null || nurseId.equals("")) {
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		} 
		NursePaymentSettings nursePaymentSettings = nurseService.selectNurseInfoAndNursePaymentSettings(nurseId);
		if(nursePaymentSettings==null || "".equals(nursePaymentSettings)){
			netState.setData("不存在该护士");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			// 查询护士的基本信息
			
			//获取医院ID
			String hosId =nursePaymentSettings.getNurseWorkUnit();
			if(hosId!=null && !"".equals(hosId)){
			  HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
			    if(hospitalVO!=null && !"".equals(hospitalVO)){
			    	nursePaymentSettings.setNurseWorkUnit(hospitalVO.getHospitalName());
			    }else{
			    	nursePaymentSettings.setNurseWorkUnit("该护士未选定医院");
				}
			}else{
				nursePaymentSettings.setNurseWorkUnit("该护士未选定医院");
			}
			//获取专业ID
			String majorId = nursePaymentSettings.getNurseOffice();
			if(majorId != null && !"".equals(majorId)){
				SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
				if(simpleMajor!=null && !"".equals(simpleMajor)){
					nursePaymentSettings.setNurseOffice(simpleMajor.getSimpleMajorName());
				}else{
					nursePaymentSettings.setNurseOffice("该护士未选定专业");
				}
			}else{
				nursePaymentSettings.setNurseOffice("该护士未选定专业");
			}
			
			netState.setData("查询成功");
			netState.setJson(nursePaymentSettings);
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}

	/**
	 * 查询护士的时间
	 * 
	 * @param nurseid
	 *            护士ID
	 * @return
	 */
	@RequestMapping(value = "selectnursetime", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectNurseTime(String nurseid) {
		NetState netState = new NetState();
		if (nurseid == null || nurseid.equals("")) {
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			List<NurseNofree> noNurseNofrees = new ArrayList<NurseNofree>();
			NurseNofreeExample nofreeExample = new NurseNofreeExample();
			com.chance.ssm.po.NurseNofreeExample.Criteria criteria = nofreeExample
					.createCriteria();
			// 传入护士ID
			criteria.andNurseNofreeNurseidEqualTo(nurseid);
			try {
				noNurseNofrees = nurseNofreeService
						.selectByExample(nofreeExample);
				if (noNurseNofrees == null || "".equals(noNurseNofrees)) {
					netState.setData("暂未设定预约时间");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(noNurseNofrees);
				} else {
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(noNurseNofrees);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;

	}
	//查询站内信
	@RequestMapping(value = "standInnerLetter", method = RequestMethod.POST)
	public @ResponseBody
	NetState standInnerLetter(String nurseId,Integer pageNum,String state) throws Exception{
		NetState netState = new NetState();
		if (nurseId == null || nurseId.equals("")) {
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (pageNum == null || pageNum.equals("")) {
			netState.setData("分页参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if (state == null || state.equals("")) {
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<StandInnerLetter> newlist = new ArrayList<StandInnerLetter>();
		if(state=="0"|| "0".equals(state)){//查询用户
			newlist =  standInnerLetterService.selectStandInnerLetterUserId(nurseId);
		}else{//查询护士
			newlist =  standInnerLetterService.selectStandInnerLetterNurseId(nurseId);
		}
		// 每页多少条
			int num = 10;
			List<StandInnerLetter> paging = new ArrayList<StandInnerLetter>();
			if (newlist == null || newlist.size()<=0 ) {
				netState.setData("没有更多的数据了");
				netState.setErrorCode(NetState.SUCCESS);
				return netState;

			} else if ((newlist.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
				return netState;
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((newlist.size() - pageNum * num) < num) {
					for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
						paging.add(newlist.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(newlist.get(i + pageNum * num));
						
					}
				}
			}
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(paging);
		return netState;
	}

	/**
	 * 查询护士的评价
	 * 
	 * @param nurseid
	 *            护士ID
	 * @param type
	 *            (0所有，1好评，2一般，3不满意 )
	 *            pageNum -1 不分页
	 * @return
	 */
	@RequestMapping(value = "selectnurserated", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectNurseRated(String nurseid, String type, Integer pageNum) throws Exception{
		NetState netState = new NetState();
		if (nurseid == null || nurseid.equals("")) {
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (type == null || type.equals("")) {
			netState.setData("类型参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			EvaluateExample evaluateExample = new EvaluateExample();
			Criteria criteria = evaluateExample.createCriteria();

			if ("0".equals(type)) {
				criteria.andEvaluateNurseidEqualTo(nurseid);
			} else if ("1".equals(type)) {
				criteria.andEvaluateNurseidEqualTo(nurseid);
				criteria.andEvaluateMarkGreaterThan((long) 3);
			} else if ("2".equals(type)) {
				criteria.andEvaluateNurseidEqualTo(nurseid);
				criteria.andEvaluateMarkEqualTo((long)3);
			} else if ("3".equals(type)) {
				criteria.andEvaluateNurseidEqualTo(nurseid);
				criteria.andEvaluateMarkLessThan((long)3);
			}
			evaluateExample.setOrderByClause("evaluate_createtime desc");
			List<EvaluateVO> evaluates = new ArrayList<EvaluateVO>();
			evaluates = evaluateService.selectByExampleRuVO(evaluateExample);
			
			if(pageNum == -1 ){//不分页
				for (EvaluateVO evaluate : evaluates) {
					String orderSendId = evaluate.getEvaluateOrderSendId();
					//根据订单ID得到产品ID
					OrderSend orderSend = orderSendService.selectOrderSendInfoById(orderSendId);
					if(orderSend != null && !"".equals(orderSend)){
						String goodsId = orderSend.getOrderSendServicecontent();
						if(goodsId != null && !"".equals(goodsId)){
							String[] goods = goodsId.split(",");
							//通过产品ID查询二级服务信息
							ManageNursingContent manageNursingContent =manageNursingContentService.selectManageNursingContenInfoByGoodsId(goods[0]);
							if(manageNursingContent!=null && !"".equals(manageNursingContent)){
								evaluate.setManageNursingContentId(manageNursingContent.getManageNursingContentId());
								evaluate.setManageNursingContenName(manageNursingContent.getManageNursingContentName());
							}else{
								evaluate.setManageNursingContenName("该服务去了异次元");
							}
						}else{
							evaluate.setManageNursingContenName("该服务去了异次元");
						}
					}else{
						evaluate.setManageNursingContenName("该服务去了异次元");
					}
					
				}
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(evaluates);
			}else{
				int num = 5;
				List<EvaluateVO> paging = new ArrayList<EvaluateVO>();
				if (evaluates == null || evaluates.size() <= 0) {
					netState.setData("没有评价了");
					netState.setErrorCode(NetState.SUCCESS);

				} else if ((evaluates.size() - (pageNum * num)) < 0) {
					netState.setData("超出范围");
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					// 分页操作
					// 判断是否是最后一页
					if ((evaluates.size() - pageNum * num) < num) {
						for (int i = 0; i < (evaluates.size() - (pageNum * num)); i++) {
							paging.add(evaluates.get(i + pageNum * num));
						}
					} else {
						for (int i = 0; i < num; i++) {
							paging.add(evaluates.get(i + pageNum * num));

						}
					}
				}
				
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			}
		}
		return netState;

	}

	/**
	 * 通过用户ID查询用户的信息
	 * 
	 * @param userid
	 *            用户ID
	 * @return
	 */
	@RequestMapping(value = "selectuserinfobyid", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectUserInfoById(String userid) throws Exception{
		NetState netState = new NetState();
		if (userid == null || "".equals(userid)) {
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
				User user = new User();
				user = userService.selectForUserByID(userid);
				List<CouponUser> newlist = couponService.selectAllUserCouponInfo(userid);
				int count = 0;
				count = newlist.size();
				if(user == null || "".equals(user)){
					netState.setData("用户不存在");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					return netState;
				}
				user.setCouponCount(count);
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(user);
		}
		return netState;
	}

	//查询所有专业和有这个专业的医院
	@RequestMapping(value = "SelectMajorAndHospital", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectMajorAndHospital() throws Exception{
		NetState netState = new NetState();
		//查询所有专业
		List<Major> majors = new ArrayList<Major>();
		List<Major> newmajors = new ArrayList<Major>();
		List<Hospital> hospitals = new ArrayList<Hospital>();
		majors = mService.selectMajorGroupById();
		//循环匹配每个专业下面的医院
		for(Major major2 : majors){
			//通过专业id查询医院id和名称 
			hospitals = hService.selectHbtByMajorId(major2.getMajorId());
			JSONArray json = new JSONArray();
			for (Hospital a : hospitals) {
				JSONObject jo = new JSONObject();
				jo.put("hospitalsrId", a.getHospitalId());
				jo.put("hospitalsName", a.getHospitalName());
				json.put(jo);
			}
			String hbt = json.toString();
			major2.setHbt(hbt);
			newmajors.add(major2);
		}
		netState.setData("查询成功");
		netState.setErrorCode(NetState.SUCCESS);
		netState.setJson(newmajors);
		return netState;
	}
	/**
	 * 查询所有的医院和医院下面的专业，
	 * 
	 * @return
	 */
	@RequestMapping(value = "selecthospitalandmajor", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectHospitalAndMajor() {
		NetState netState = new NetState();
		List<Hospital> hospitals = new ArrayList<Hospital>();
		List<Major> majors = new ArrayList<Major>();

		HospitalExample hExample = new HospitalExample();

		try {
			//查询所有的医院
			hospitals = hService.selectByExample(hExample);
			//查询所有专业
			List<String> typelist = new ArrayList<String>();
			for(int i = 0; i < hospitals.size(); i++){
				typelist.add(hospitals.get(i).getHospitalId());
			}
			MajorExample mExample = new MajorExample();
			com.chance.ssm.po.MajorExample.Criteria criteria = mExample
					.createCriteria();
			criteria.andMajorDetailsIn(typelist);
			majors = mService.selectByExample(mExample);
			
			//循环匹配每个医院下面的专业
			for (int i = 0; i < hospitals.size(); i++) {
				JSONArray json = new JSONArray();
				for (int j = 0; j < majors.size(); j++) {
					if (hospitals.get(i).getHospitalId().equals(majors.get(j).getMajorDetails())) {
						JSONObject jo = new JSONObject();
						jo.put("majorId", majors.get(j).getMajorId());
						jo.put("majorName", majors.get(j).getMajorName());
						json.put(jo);
						//把专业从json转成String
						String maj = json.toString();
						hospitals.get(i).setMaj(maj);
						
					}
					
				}
				
			}
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(hospitals);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return netState;

	}
	
	/**
	 * 根据医院和专业查询护士，并根据距离排序 
	 * 
	 * @param hospitalName
	 *            医院名称
	 * @param majorName
	 *            专业名称
	 * @param latitude
	 *            经度
	 * @param longitude
	 *            纬度
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "selectnursebyhosandmaj", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectNurseByHosAndMaj(String hospitalName, String majorName,
			Double latitude, Double longitude, Integer pageNum,Integer raidus) throws Exception{
		NetState netState = new NetState();
		 if (latitude == null || "".equals(latitude)) {
			netState.setData("经度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (longitude == null || "".equals(longitude)) {
			netState.setData("纬度错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			// 构建参数
			Params params = new Params();
							
				if (raidus == null || raidus == 0) {// 如果没有传范围参数那么就是默认周边1.5公里
					raidus = 1000000000;
				}
				double[] location = PostionUtils
						.getAround(longitude, latitude, raidus);
				params.locationX = latitude;
				params.locationY = longitude;
				params.minX = location[0];
				params.maxY = location[3];
				params.maxX = location[2];
				params.minY= location[1];
				if(hospitalName!=null && !"".equals(hospitalName)){
					params.nurseWorkUnit = hospitalName;
				}
				if(majorName!=null && !"".equals(majorName)){
					params.nurseOffice = majorName;
				}
				List<NurseVO> nurseVOs  = nurseService.selectNurseDistance(params);

				Collections.sort(nurseVOs);
				int num = 10;
				List<NurseVO> paging = new ArrayList<NurseVO>();
				if (nurseVOs == null || nurseVOs.size() <= 0) {
					netState.setData("没有护士了");
					netState.setErrorCode(NetState.SUCCESS);

				} else if ((nurseVOs.size() - (pageNum * num)) < 0) {
					netState.setData("超出范围");
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					// 分页操作
					// 判断是否是最后一页
					if ((nurseVOs.size() - pageNum * num) < num) {
						for (int i = 0; i < (nurseVOs.size() - (pageNum * num)); i++) {
							paging.add(nurseVOs.get(i + pageNum * num));
						}
					} else {
						for (int i = 0; i < num; i++) {
							paging.add(nurseVOs.get(i + pageNum * num));

						}
					}
				}
				//讲医院ID和护士ID转为文字
				for (NurseVO nurseVO : paging) {
					nurseVO.setDistance(
							LzhUtils.LantitudeLongitudeDist(nurseVO
									.getNursePositionX(), nurseVO
									.getNursePositionY(), latitude, longitude));
					//获取医院ID
					String hosId =nurseVO.getNurseWorkUnit();
				    HospitalVO hospitalVO = hospitalService.selectByPrimaryKeyAndMajor(hosId);
				    if(hospitalVO!=null && !"".equals(hospitalVO)){
				    	nurseVO.setNurseWorkUnit(hospitalVO.getHospitalName());
				    }else{
						nurseVO.setNurseWorkUnit("其他医院");
					}
					
					//获取专业ID
					String majorId = nurseVO.getNurseOffice();
					SimpleMajor simpleMajor = simpleMajorService.selectByPrimaryKey(majorId);
					if(simpleMajor!=null && !"".equals(simpleMajor)){
						nurseVO.setNurseOffice(simpleMajor.getSimpleMajorName());
					}else{
						nurseVO.setNurseOffice("该护士未选定专业");
					}
				}
				
				
				if(paging==null || "".equals(paging) || paging.size()==0){
					netState.setData("查询结果为空");
					netState.setErrorCode(NetState.DATA_NOT_FOUND);
					netState.setJson(paging);
				}else{
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(paging);
				}
		}
		return netState;
	}
	//查询所有医院
	@RequestMapping(value = "selectAllHospital", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectAllHospital() throws Exception{
		NetState netState = new NetState();
		List<Hospital> hospitals = new ArrayList<Hospital>();

		HospitalExample hExample = new HospitalExample();
		//查询所有的医院
		hospitals = hService.selectByExample(hExample);
		
		if(hospitals.size()==0 || "".equals(hospitals)){
			netState.setData("没有符合的医院");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(hospitals);
		}
		return netState;
	}
	//查询所有专业
	@RequestMapping(value = "selectAllMajor", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectAllMajor() throws Exception{
		NetState netState = new NetState();
		SimpleMajorExample majorExample = new SimpleMajorExample();
		//com.chance.ssm.po.SimpleMajorExample.Criteria criteria = majorExample.createCriteria();
		List<SimpleMajor> simpleMajors = simpleMajorService.selectByExample(majorExample);
		if(simpleMajors.size()==0){
			netState.setData("查询结果为空");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
			netState.setJson(simpleMajors);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(simpleMajors);
		}
		return netState;
	}
	//通过专业查询所有医院
	@RequestMapping(value = "selectAllByHospital", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectAllByHospital(String majorId) throws Exception{
		NetState netState = new NetState();
		if(null==majorId || "".equals(majorId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		List<Hospital> hospital = new ArrayList<Hospital>();
		hospital = hService.selectHbtByMajorId(majorId);
		if(hospital.size()==0||"".equals(hospital)){
			netState.setData("没有符合的医院");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(hospital);
		}
		return netState;
	}
	
	//通过医院查询所有专业
		@RequestMapping(value = "selectAllByMajor", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectAllByMajor(String hospitalId) throws Exception{
			NetState netState = new NetState();
			if(null == hospitalId || "".equals(hospitalId)){
				netState.setData("参数错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			List<Major> major = mService.selectMajorBuHbtId(hospitalId);
			if(major.size()==0||"".equals(major)){
				netState.setData("没有符合的专业");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(major);
			}
			return netState;
		}
		
		//护士账单
		@RequestMapping(value = "selectNurseBills", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectNurseCapital(String nurseId) throws Exception{
			NetState netState = new NetState();
			if(null == nurseId || "".equals(nurseId)){
				netState.setData("参数错误"); 
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			List<NurseBillsOrderVO> nurseOrders = nurseService.selectNurseOrder(nurseId);
			//服务产品信息
			String[] contentid =null;
			//二级服务名
			String contentname="";
			String newcontentid ="";
			String goodsName = "";
			Goods goods = new Goods();
			ManageNursingContent manageNursingContent = new ManageNursingContent();
			for (NurseBillsOrderVO nurseBillsOrderVO : nurseOrders) {
				String newgoosName="";
				contentid= nurseBillsOrderVO.getOrderSendServicecontent().split(",");
				for(int c =0; c<contentid.length;c++){
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						contentname = manageNursingContent.getManageNursingContentName();
						if(newgoosName!=null && !"".equals(newgoosName)){
							newgoosName = newgoosName.substring(0, newgoosName.length()-1);
						}
						nurseBillsOrderVO.setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						nurseBillsOrderVO.setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
			}
			
			if(nurseOrders.size()==0 || "".equals(nurseOrders)){
				netState.setData("没有符合的账单");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				NurseBillsVO nurseBills = new NurseBillsVO(); 
				nurseBills.setTotalPriceWeek1(BigDecimal.ZERO);
				nurseBills.setTotalPriceWeek2(BigDecimal.ZERO);
				nurseBills.setTotalPriceWeek3(BigDecimal.ZERO);
				nurseBills.setTotalPriceWeek4(BigDecimal.ZERO);
				nurseBills.setTotalPrice(BigDecimal.ZERO);
				
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
				
				Date range1first = DateUtil.getFirstDayOfWeek(-3);		//前三周第一天
				Date range1Last = DateUtil.getLastDayOfWeek(-3);		//前三周最后一天
				Date range2first = DateUtil.getFirstDayOfWeek(-2);		//前二周第一天
				Date range2Last = DateUtil.getLastDayOfWeek(-2);		//前二周最后一天
				Date range3first = DateUtil.getFirstDayOfWeek(-1);		//前一周第一天
				Date range3Last = DateUtil.getLastDayOfWeek(-1);		//前一周最后一天
				Date range4first = DateUtil.getFirstDayOfWeek(0);		//当前周第一天
				Date range4Last = DateUtil.getLastDayOfWeek(0);			//当前周最后一天
				
				for (int i = 0; i < nurseOrders.size(); i++) {
					Date orderTime = nurseOrders.get(i).getOrderSendFinishOrderTime();
					//前三周的范围
					
					if(orderTime.getTime() > range1first.getTime() && orderTime.getTime() < range1Last.getTime()){
						nurseBills.setTotalPriceWeek1(nurseBills.getTotalPriceWeek1().add(nurseOrders.get(i).getPrice()));
					}
					//前二周的范围
					
					if(orderTime.getTime() > range2first.getTime() && orderTime.getTime() < range2Last.getTime()){
						nurseBills.setTotalPriceWeek2(nurseBills.getTotalPriceWeek2().add(nurseOrders.get(i).getPrice()));
					}
					//前一周的范围
					
					if(orderTime.getTime() > range3first.getTime() && orderTime.getTime() < range3Last.getTime()){
						nurseBills.setTotalPriceWeek3(nurseBills.getTotalPriceWeek3().add(nurseOrders.get(i).getPrice()));
					}
					//本周的范围
					
					if(orderTime.getTime() > range4first.getTime() && orderTime.getTime() < range4Last.getTime()){
						nurseBills.setTotalPriceWeek4(nurseBills.getTotalPriceWeek4().add(nurseOrders.get(i).getPrice()));
					}
					nurseBills.setTotalPrice(nurseBills.getTotalPrice().add(nurseOrders.get(i).getPrice()));
				}
				
				nurseBills.setNurseOrders(nurseOrders);
				nurseBills.setWeekRange1(sdf.format(range1first)+"-"+sdf.format(range1Last));
				nurseBills.setWeekRange2(sdf.format(range2first)+"-"+sdf.format(range2Last));
				nurseBills.setWeekRange3(sdf.format(range3first)+"-"+sdf.format(range3Last));
				nurseBills.setWeekRange4("本周");
				
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(nurseBills);
			}
			return netState;
		}
		

		//护士有无签到
		@RequestMapping(value = "selectNurseIsSignined", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectNurseIsSignin(String nurseId) throws Exception{
			NetState netState = new NetState();
			if(null == nurseId || "".equals(nurseId)){
				netState.setData("参数错误"); 
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			
			int i = nurseService.selectNurseSignin(nurseId);
			
			if(i==0){
				netState.setData("未签到"); 
				netState.setJson("no");
			}else{
				netState.setData("已签到");
				netState.setJson("yes");
			}
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		}
		
		//护士签到
		@RequestMapping(value = "nurseToSignin", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectNurseToSignin(String nurseId) throws Exception{
			NetState netState = new NetState();
			if(null == nurseId || "".equals(nurseId)){
				netState.setData("参数错误"); 
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			
			int i = nurseService.selectNurseSignin(nurseId);
			
			if(i==0){
				nurseService.nurseToSignin(nurseId);
				netState.setData("签到成功"); 
				netState.setJson("yes");
			}else{
				netState.setData("重复签到"); 
				netState.setJson("no");
			}
			
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		}
		
		//用户有无签到
		@RequestMapping(value = "selectUserIsSignined", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectUserIsSignin(String userId) throws Exception{
			NetState netState = new NetState();
			if(null == userId || "".equals(userId)){
				netState.setData("参数错误"); 
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			
			int i = userService.selectUserSignin(userId);
			
			if(i==0){
				netState.setData("未签到"); 
				netState.setJson("no");
			}else{
				netState.setData("已签到");
				netState.setJson("yes");
			}
			
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		}
		
		//用户签到
		@RequestMapping(value = "userToSignin", method = RequestMethod.POST)
		public @ResponseBody
		NetState selectUserToSignin(String userId) throws Exception{
			NetState netState = new NetState();
			if(null == userId || "".equals(userId)){
				netState.setData("参数错误"); 
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			
			int i = userService.selectUserSignin(userId);
			
			if(i==0){
				userService.userToSignin(userId);
				Coupon coupony = couponService.selectCountTypeByType(3);
				if(coupony!=null && !"".equals(coupony)){//说明后台设置了注册送的优惠券
					//将优惠券发给用户
					CouponUser couponUser = new CouponUser();
					couponUser.setCouponUserId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
					couponUser.setCouponUserUserId(userId);
					couponUser.setCouponUserMoney(coupony.getCouponMoney());
					couponUser.setCouponUserPic(coupony.getCouponPic());
					couponUser.setCouponUserFullGive(coupony.getCouponFullGive());
					//得到过期天数
					int time = coupony.getCouponExpirationTime();
					if(!"".equals(time) && time!=0){//如果设置了过期时间
						//将当前时间加上过期的天数
						String date =DateUtil.getAfterafewdays(coupony.getCouponExpirationTime());
						DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						couponUser.setCouponUserExpirationTime(fmt.parse(date));
					}
					couponUser.setCouponUserIstouse(1);
					couponUser.setCouponUserSperak(coupony.getCouponSpeak());
					couponUser.setCouponUserCreatetime(new Date());
					int c = couponService.insertSelectiveCouponUser(couponUser);
					if(c==0){
						netState.setData("注册送优惠券错误");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}
				}
				netState.setData("签到成功");
				netState.setJson("yes");
			}else{
				netState.setData("重复签到");
				netState.setJson("no");
			}
			
			netState.setErrorCode(NetState.SUCCESS);
			return netState;
		}
	//查看我邀请的人
	@RequestMapping(value = "selectMyInvitationUserInfo", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectMyInvitationUserInfo(String userId) throws Exception{
		NetState netState = new NetState();
		if(null == userId || "".equals(userId)){
			netState.setData("参数错误"); 
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		List<User> list = userService.selectMyInvitationUserInfo(userId);
		if(list.size()==0 || "".equals(list)){
			netState.setData("没有符合的数据"); 
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}else{
			netState.setData("查询成功"); 
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(list);
		}
		return netState;
	}
		
	//投诉
	@RequestMapping(value = "complaintAdd", method = RequestMethod.POST)
	public @ResponseBody
	NetState complaintAdd(String userId,Integer identity,String content,String complaintPic,HttpServletRequest request,String orderSendId) throws Exception{
		NetState netState = new NetState();
		if(null == userId || "".equals(userId)){
			netState.setData("参数错误1"); 
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(null == identity || "".equals(identity)){
			netState.setData("参数错误2"); 
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(null == content || "".equals(content)){
			netState.setData("参数错误3"); 
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		Complaint complaint = new Complaint();
		complaint.setComplaintId(java.util.UUID.randomUUID().toString()
				.replaceAll("-", ""));
		
		complaint.setComplaintUserid(userId);
		complaint.setComplaintIdentity(identity);
		complaint.setComplaintContent(content);
		if(orderSendId!=null && !"".equals(orderSendId)){
			//订单ID
			complaint.setComplaintContentNote(orderSendId);
			//得到接单的护士ID
			OrderReceiverAndOrderVO orderReceiverAndOrderVO = orderReceiverService.selectStateNurseOrderInfoByid(orderSendId);
			if(orderReceiverAndOrderVO!=null && !"".equals(orderReceiverAndOrderVO)){
				complaint.setComplaintSparefour(orderReceiverAndOrderVO.getOrderNurseid());
			}
		}
		//投诉单号
		complaint.setComplaintNumber(RandomUtil.getRandomMath());
		SavePic savePic = new SavePic();
		if(complaintPic!=null && !"".equals(complaintPic)){
			String pic = savePic.manyImgPathAdd(request, userId, "ComplainPic", complaintPic);
			complaint.setComplaintContentPic(pic);
		}
		if(identity == 0 && (orderSendId == null || "".equals(orderSendId))){//用户对平台投诉
			complaint.setComplaintSparethree("0");
		}
		if(identity == 1 && (orderSendId == null || "".equals(orderSendId))){//护士对平台投诉
			complaint.setComplaintSparethree("1");
		}
		if(identity == 0 && (orderSendId != null && !"".equals(orderSendId))){//用户对订单台投诉
			complaint.setComplaintSparethree("5");
		}
		if(identity == 1 && (orderSendId != null && !"".equals(orderSendId))){//护士对订单投诉
			complaint.setComplaintSparethree("4");
		}
		complaint.setComplaintContentCreatetime(new Date());
		
		int i = complaintService.insertSelective(complaint);
		if(i==0 ){
			netState.setData("投诉失败"); 
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("投诉成功"); 
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	
	/**
	 * identity(0用户1护士)
	 * **/
	//提现()
	@RequestMapping(value = "drawMoney", method = RequestMethod.POST)
	public @ResponseBody
	NetState drawMoney(String userId,Integer identity,BigDecimal money) throws Exception{
		NetState netState = new NetState();
		Date date = new Date();
		if(userId==null || "".equals(userId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(identity==null || "".equals(identity)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(money==null || "".equals(money)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		
		BigDecimal balan = BigDecimal.ZERO;
		//判断当前身份
		if(identity==0){//查询用户
			User user = userService.selectForUserByID(userId);
			if(user==null || "".equals(user)){
				netState.setData("参数错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{//得到余额
				balan = user.getUserBalance();
			}
		}else{//查询护士
			Nurse nurse = nurseService.selectForNurseId(userId);
			if(nurse==null || "".equals(nurse)){
				netState.setData("参数错误");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}else{//得到余额
				balan = nurse.getNurseBalance();
			}
		}
		if(money.compareTo(balan)==1){//如果提现的金额大于用户余额
			netState.setData("当前余额不足");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//成功提现(触发器自动扣除用户余额)
		DrawMoney drawMoney = new DrawMoney();
		drawMoney.setDrawMoneyId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
		drawMoney.setDrawMoneySize(money);
		drawMoney.setDrawMoneyUsersId(userId);
		drawMoney.setDrawMoneyUsersIdentity(identity);
		drawMoney.setDrawMoneyState(0);
		drawMoney.setDrawMoneyCreatetime(date);
		
		SimpleDateFormat format = new SimpleDateFormat();
		int i = drawMoneyService.insertSelective(drawMoney);
			if(identity==0 || "0".equals(identity)){//用户资金池
				CapitalUserPool UserPool =  new CapitalUserPool();
				UserPool.setCapitalUserPoolId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				UserPool.setCapitalUserPoolPeopleid(userId);
				UserPool.setCapitalUserPoolPeopleIdentity(0);
				UserPool.setCapitalUserPoolMoney(money);
				UserPool.setCapitalUserPoolSpeak("提现");
				UserPool.setCapitalUserPoolCreatetime(date);
				capitalUserPoolService.insertSelective(UserPool);
				//更新用户余额
				User user = new User();
				user.setUserId(userId);
				user.setUserBalance(balan.subtract(money));
				userService.updateByPrimaryKeySelective(user);
				
				////将推送记录到用户站内信中
				StandInnerLetter innerLetter = new StandInnerLetter();
				innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter.setStandInnerLetterUserId(userId);       
				innerLetter.setStandInnerLetterUserIdentity(0);
				innerLetter.setStandInnerLetterTitle("提现");
				//0订单消息/1资金消息/2系统通知
				innerLetter.setStandInnerLetterUserType(1);
				
				innerLetter.setStandInnerLetterContent("您于"+format.format(date)+"提现¥"+money+"");
				innerLetter.setStandInnerLetterCreatetime(date);
				standInnerLetterService.insertSelective(innerLetter);
				
			}else{//护士资金池
				//在资金记录表中记录
				//资金池记录数据
				CapitalNursePool pool = new CapitalNursePool();
				pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
					.replaceAll("-", ""));
				pool.setCapitalNursePoolPeopleid(userId);
				pool.setCapitalNursePoolOrdersendid("");
				pool.setCapitalNursePoolPeopleidIdentity(0);//支出
				pool.setCapitalNursePoolMoney(money);
				pool.setCapitalNursePoolSpeak("提现");
				pool.setCapitalNursePoolType(6);
				pool.setCapitalNursePoolCreatetime(date);
				capitalNursePoolService.insertSelective(pool);
				
				//更新护士余额
				Nurse nurse = new Nurse();
				nurse.setNurseId(userId);
				nurse.setNurseBalance(balan.subtract(money));
				nurseService.updateByNurseId(nurse);
				
				////将推送记录到护士站内信中
				StandInnerLetter innerLetter = new StandInnerLetter();
				innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
				innerLetter.setStandInnerLetterUserId(userId);                     
				innerLetter.setStandInnerLetterUserIdentity(1);
				innerLetter.setStandInnerLetterTitle("提现");
				//0订单消息/1资金消息/2系统通知
				innerLetter.setStandInnerLetterUserType(1);
				innerLetter.setStandInnerLetterContent("您于"+format.format(date)+"提现¥"+money+"");
				innerLetter.setStandInnerLetterCreatetime(date);
				standInnerLetterService.insertSelective(innerLetter);
			}
			
		if(i==0){
			netState.setData("提现失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			
			
			netState.setData("提现成功");
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	
	
	// 富文本 适用人群 selectByPrimaryKeyBLOB
	// @RequestMapping(value = "contentForPeopleInfo")
	// public String contentForPeopleInfo(Model model, HttpServletRequest
	// request,
	// HttpServletResponse response) throws Exception {
	// // 得到服务项id
	// // String contentId = request.getParameter("contentId");
	// String contentId = "b8c612f8dda44537930d87fe7dfb738e";
	// 富文本 适用人群
	@RequestMapping(value = "contentForPeopleInfo")
	public String contentForPeopleInfo(Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 得到服务项id
		String contentId = request.getParameter("contentId");
		// String contentId = "b8c612f8dda44537930d87fe7dfb738e";
		// 通过服务项查询适用人群
		ManageNursingContentWithBLOBs bloBs = mNursingContentService
				.selectByPrimaryKeyBLOB(contentId);
		String contentforpeople = bloBs.getManageNursingContentForpeople();
		// 将适用人群发送到页面
		model.addAttribute("contentforpeople", contentforpeople);
		return "contentforpenple";
	}

	// 富文本 注意事项
	@RequestMapping(value = "contentLook")
	public String contentLook(Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String contentId = request.getParameter("contentId");
		ManageNursingContentWithBLOBs bloBs = mNursingContentService
				.selectByPrimaryKeyBLOB(contentId);
		String contentlook = bloBs.getManageNursingContentLook();
		model.addAttribute("contentlook", contentlook);
		return "contentlook";
	}

	// 富文本 套餐
	@RequestMapping(value = "contentPackaAge")
	public String contentPackaAge(Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String contentId = request.getParameter("contentId");
		Package package1 = new Package();
		List<Package> packages = new ArrayList<Package>();
		PackageExample packageExample = new PackageExample();
		com.chance.ssm.po.PackageExample.Criteria criteria = packageExample
				.createCriteria();
		// 查询套餐的条件
		criteria.andPackageManursingContentEqualTo(contentId);
		packages = packageService.selectByExampleWithBLOBs(packageExample);
		if (packages.size() > 0) {
			package1 = packages.get(0);
		}
		String packageDescribe = package1.getPackage1Describe();
		model.addAttribute("packageDescribe", packageDescribe);
		return "contentpackage";
	}

	// 商品详情页(套餐+适用人群+注意事项)
	@RequestMapping(value = "contentDetails")
	public String contentDetails(Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 套餐
		String contentId = request.getParameter("contentId");
		Package package1 = new Package();
		List<Package> packages = new ArrayList<Package>();
		PackageExample packageExample = new PackageExample();
		com.chance.ssm.po.PackageExample.Criteria criteria = packageExample
				.createCriteria();
		// 查询套餐的条件
		criteria.andPackageManursingContentEqualTo(contentId);
		packages = packageService.selectByExampleWithBLOBs(packageExample);
		if (packages.size() > 0) {
			package1 = packages.get(0);
		}
		String packageDescribe = "";
		if(package1!=null && !"".equals(package1)){
			packageDescribe = package1.getPackage1Describe();
		}

		// 适用人群
		// 通过服务项查询适用人群
		ManageNursingContentWithBLOBs bloBs = mNursingContentService
				.selectByPrimaryKeyBLOB(contentId);
		String contentforpeople ="";
		String contentlook = "";
		if(bloBs!=null && !"".equals(bloBs)){
			contentforpeople = bloBs.getManageNursingContentForpeople();
			// 注意事项
			contentlook = bloBs.getManageNursingContentLook();
		}

		model.addAttribute("contentforpeople", contentforpeople);
		model.addAttribute("contentlook", contentlook);
		model.addAttribute("packageDescribe", packageDescribe);
		return "contentdetails";
	}
	
	//验证护士支付密码
    @RequestMapping(value = "NursePasswordVerification", method = RequestMethod.POST)
	public @ResponseBody NetState NursePasswordVerification(String nurseId,String passWord) throws Exception {
		NetState netState = new NetState();
		if(nurseId==null ||"".equals(nurseId)){
			netState.setData("护士Id参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		NursePaymentSettings nursePaymentSettings =nursePaymentSettingsService.selectByPrimaryKey(nurseId);
		
		if(nursePaymentSettings == null || "".equals(nursePaymentSettings)){
			netState.setData("该护士还未设置密码");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//将提交的密码md5加密后比较数据库
			String md5pwd = Md5Encrypt.Bit16(passWord).toLowerCase();
			
			//得到护士的密码
			String pwd = nursePaymentSettings.getNursePaymentSettingsPwd();
			if(pwd == null || "".equals(pwd)){
				netState.setData("您账号还没绑定密码,请绑定后再来提现");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
			else if(pwd!=md5pwd && !md5pwd.equals(pwd)){
				netState.setData("密码输入错误,请重新输入");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				netState.setData("验证成功");
				netState.setErrorCode(NetState.SUCCESS);
			}
		}
		 return netState;
    }
    //验证用户支付密码
    @RequestMapping(value = "UserPasswordVerification", method = RequestMethod.POST)
	public @ResponseBody NetState UserPasswordVerification(String userId,String passWord) throws Exception {
		NetState netState = new NetState();
		if(userId==null ||"".equals(userId)){
			netState.setData("用户Id参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		User user = userService.selectForUserByID(userId);
		
		if(user == null || "".equals(user)){
			netState.setData("该用户不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//将提交的密码md5加密后比较数据库
			String md5pwd = Md5Encrypt.Bit16(passWord).toLowerCase();
			
			//得到护士的密码
			String pwd = user.getUserDistrict();
			if(pwd == null || "".equals(pwd)){
				netState.setData("您账号还没绑定密码,请绑定后再来提现");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
			else if(pwd!=md5pwd && !md5pwd.equals(pwd)){
				netState.setData("密码输入错误,请重新输入");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}else{
				netState.setData("验证成功");
				netState.setErrorCode(NetState.SUCCESS);
			}
		}
		 return netState;
    }
  //查询用户余额及支付宝账号和密码
    @RequestMapping(value = "selectUserThreeInfo", method = RequestMethod.POST)
	public @ResponseBody NetState selectUserThreeInfo(String userId) throws Exception {
    	NetState netState = new NetState();
    	if(userId == null || "".equals(userId)){
    		netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}
    	SelectUserThreeInfoVo userThreeInfoVo = userService.selectUserThreeInfo(userId);
    	
    	if(userThreeInfoVo == null || "".equals(userThreeInfoVo)){
    		netState.setData("该用户不存在");
        	netState.setErrorCode(NetState.PARAMS_ERROR);
        	netState.setJson(userThreeInfoVo);
    	}else{
    		netState.setData("查询成功");
        	netState.setErrorCode(NetState.SUCCESS);
        	netState.setJson(userThreeInfoVo);
    	}
    	return netState;
    }
	//查询护士余额及支付宝账号和密码
    @RequestMapping(value = "selectNurseThreeInfo", method = RequestMethod.POST)
	public @ResponseBody NetState selectNurseThreeInfo(String nurseId) throws Exception {
    	NetState netState = new NetState();
    	if(nurseId == null || "".equals(nurseId)){
    		netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}
    	  //根据护士ID查询记录
        NurseThreeInfoVo infoVo =  nursePaymentSettingsService.selectNurseThreeInfoByNurseId(nurseId);
        if(infoVo == null || "".equals(infoVo)){
        	  netState.setData("不存在该护士");
              netState.setErrorCode(NetState.DATA_NOT_FOUND);
        }else{
        	  netState.setData("查询成功");
              netState.setErrorCode(NetState.SUCCESS);
              netState.setJson(infoVo);
        }
    	return netState;
    }
    /**
     * 
     * @param roleId 用户或护士ID
     * @param identity 0用户1护士
     * @param type 0订单消息/1资金消息/2系统通知/3全部站内信
     * @return
     * @throws Exception
     */
    //查询用户或护士站内信
    @RequestMapping(value = "selectStandInnerLetterInfo", method = RequestMethod.POST)
	public @ResponseBody NetState selectStandInnerLetterInfo(Model model, HttpServletRequest request,
			HttpServletResponse response,HttpSession session, String roleId,Integer identity,Integer type) throws Exception {
    	NetState  netState = new NetState();
    	if(roleId == null || "".equals(roleId)){
    		netState.setData("Id参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}
    	if(identity == null || "".equals(identity)){
    		netState.setData("身份参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}
    	/*if(type == null || "".equals(type)){
    		netState.setData("类型参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}*/
    	List<StandInnerLetter> list = new ArrayList<StandInnerLetter>();
    	if(type==3 || "3".equals(type)){
    		list = standInnerLetterService.selectStandInnerLetteInfoAll(roleId,identity);
    	}else{
    		list = standInnerLetterService.selectStandInnerLetteInfo(roleId,identity,type);
    	}
    	 
    	if(list.size()==0){
    		 netState.setData("查询为空");
             netState.setErrorCode(NetState.DATA_NOT_FOUND);
    	}else{
    		 netState.setData("查询成功");
             netState.setErrorCode(NetState.SUCCESS);
             netState.setJson(list);
    	}
    	return netState;
    }
    /**
     * 
     * @param roleId 用户或护士ID
     * @param identity 0用户1护士
     * @param type 0订单消息/1资金消息/2系统通知/3全部站内信
     * @return
     * @throws Exception
     */
    //根据类型删除站内信
    @RequestMapping(value = "deleteStandInnerLetterInfo", method = RequestMethod.POST)
   	public @ResponseBody NetState deleteStandInnerLetterInfo(Model model, HttpServletRequest request,
   			HttpServletResponse response,HttpSession session, String roleId,Integer identity,Integer type) throws Exception {
    	NetState  netState = new NetState();
    	if(roleId == null || "".equals(roleId)){
    		netState.setData("Id参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}
    	if(identity == null || "".equals(identity)){
    		netState.setData("身份参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}
    	if(type == null || "".equals(type)){
    		netState.setData("类型参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
    	}
    	int i = 0;
    	if(type==3 || "3".equals(type)){
    		i = standInnerLetterService.deleteByPrimaryKeyByUserIdOrNurseId(roleId,identity);
    	}else{
    		i = standInnerLetterService.deleteByPrimaryKeyByUserIdOrNurseIdAndType(roleId,identity,type);
    	}
    	 
    	if(i==0){
    		 netState.setData("删除失败");
             netState.setErrorCode(NetState.DATA_NOT_FOUND);
    	}else{
    		 netState.setData("删除成功");
             netState.setErrorCode(NetState.SUCCESS);
    	}
    	
    	
    	return netState;
    }
	//用户和护士注册短信验证
	@RequestMapping(value = "sendSmsCode", method = RequestMethod.POST)
	public @ResponseBody NetState sendSmsCode(Model model, HttpServletRequest request,
			HttpServletResponse response,HttpSession session, String Phone) throws Exception {
		NetState netState = new NetState();
		if(Phone == null || "".equals(Phone)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		int i = (int) ((Math.random()*9+1)*100000);
		session.setAttribute("code", i);
		//发送短信
		//SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, Phone, "【小护健康】欢迎注册小护健康APP,您的验证码为"+i+",有效期为15分钟", null, null, "0",  null,  null,  null,  null, null,  null, null);
		//阿里云短信 jyg
		AliyunSmsUtil.sendSms(Phone, SmsEnum.User_registration.getModeCode(), i);
		
		netState.setData("生成成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	
	//护士绑定支付提现密码短信验证
	@RequestMapping(value = "sendSmsByNurseBindPassword", method = RequestMethod.POST)
	public @ResponseBody NetState sendSmsByNurseBindPassword(Model model, HttpServletRequest request,
			HttpServletResponse response,HttpSession session, String nurseId) throws Exception {
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//得到护士的账号
		Nurse nurse = nurseService.selectForNurseId(nurseId);
		if(nurse == null || "".equals(nurse)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		String nurseName = nurse.getNurseName();
		int i = (int) ((Math.random()*9+1)*100000);
		session.setAttribute("drawcode", i);
		//发送短信
		//SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nurseName, "【小护健康】您正在绑定您的提现密码,您的验证码为"+i+",有效期为15分钟", null, null, "0",  null,  null,  null,  null, null,  null, null);
		AliyunSmsUtil.sendSms(nurseName, SmsEnum.Bind_password.getModeCode(), i);
		netState.setData("生成成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
	}
	//用户绑定支付提现密码短信验证
	@RequestMapping(value = "sendSmsByUserBindPassword", method = RequestMethod.POST)
	public @ResponseBody NetState sendSmsByUserBindPassword(Model model, HttpServletRequest request,
			HttpServletResponse response,HttpSession session, String userId) throws Exception {
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//得到护士的账号
		User user = userService.selectForUserByID(userId);
		if(user == null || "".equals(user)){
			netState.setData("该用户不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		String userName = user.getUserName();
		int i = (int) ((Math.random()*9+1)*100000);
		session.setAttribute("drawcode", i);
		//发送短信
		//SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userName, "【小护健康】您正在绑定您的提现密码,您的验证码为"+i+",有效期为15分钟", null, null, "0",  null,  null,  null,  null, null,  null, null);
		AliyunSmsUtil.sendSms(userName, SmsEnum.Bind_password.getModeCode(), i);
		netState.setData("生成成功");
		netState.setErrorCode(NetState.SUCCESS);
		return netState;
		}
}
