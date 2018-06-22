package com.chance.ssm.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.CapitalPlatform;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.Invitation;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.EvaluateExample.Criteria;
import com.chance.ssm.po.InterestRate;
import com.chance.ssm.po.InterestRateExample;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.EvaluateVO;
import com.chance.ssm.service.CapitalNursePoolService;
import com.chance.ssm.service.CapitalPlatformService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.InterestRateService;
import com.chance.ssm.service.InvitationService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.RedPacketsService;
import com.chance.ssm.service.StandInnerLetterService;
/**
 * 用户评价控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="evaluate")
public class EvaluateController {
	
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private InterestRateService interestRateService;
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private CapitalNursePoolService capitalNursePoolService;
	
	@Autowired
	private RedPacketsService packetsService;
	
	@Autowired
	private OrderReceiverService orderReceiverService;
	
	@Autowired
	private CapitalPlatformService capitalPlatformService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private InvitationService invitationService;
	
	/**
	 * 根据订单ID查询评价
	 * @param sendId 订单ID
	 * @return
	 */
	@RequestMapping(value="selectevaluatebysendid",method = RequestMethod.POST)
	public @ResponseBody NetState SelectEvaluateBySendId(String sendId){
		NetState netState = new NetState();
		if(sendId == null || "".equals(sendId)){
			netState.setData("订单ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			List<EvaluateVO> evaluateVOs = new ArrayList<EvaluateVO>();
			EvaluateExample evaluateExample = new EvaluateExample();
			Criteria criteria = evaluateExample.createCriteria();
			criteria.andEvaluateOrderSendIdEqualTo(sendId);
			try {
				evaluateVOs = evaluateService.selectByExampleRuVO(evaluateExample);
				if (evaluateVOs.size() > 0) {
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(evaluateVOs);
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
	}
	
	
	/**
	 * 查询护士的好评，一般，不满意的评价
	 * @param nurseId 护士ID
	 * @param mark （1好评，2一般，3不满意）
	 * @return
	 */
	@RequestMapping(value="selectevaluateorderbymark", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectEvaluateOrderByMark(String nurseId, String mark){
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(mark == null || "".equals(mark)){
			netState.setData("分数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//初始化评价实体类的list
			List<EvaluateVO> evaluateList = new ArrayList<EvaluateVO>();
			EvaluateExample evaluateExample = new EvaluateExample();
			Criteria criteria = evaluateExample.createCriteria();
			criteria.andEvaluateNurseidEqualTo(nurseId);
			if(mark.equals("1")){
				criteria.andEvaluateMarkGreaterThan((long)3);
			}
			if(mark.equals("2")){
				criteria.andEvaluateMarkEqualTo((long)3);
			}
			if(mark.equals("3")){
				criteria.andEvaluateMarkLessThan((long)3);
			}
			try {
				evaluateList = evaluateService.selectByExampleRuVO(evaluateExample);
				if (evaluateList.size() > 0) {
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(evaluateList);
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
		
	}
	
	/**
	 * 根据护士ID查询所有的评价内容
	 * @param nurseId 护士ID
	 * @return
	 */
	@RequestMapping(value="selectevaluatebynurseid",method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectEvaluateByNurseId(String nurseId){
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//初始化评价实体类的list
			List<EvaluateVO> evaluateList = new ArrayList<EvaluateVO>();
			EvaluateExample evaluateExample = new EvaluateExample();
			Criteria criteria = evaluateExample.createCriteria();
			criteria.andEvaluateNurseidEqualTo(nurseId);
			try {
				evaluateList = evaluateService.selectByExampleRuVO(evaluateExample);
				if (evaluateList.size() > 0) {
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(evaluateList);
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
		
	}
	
	
	/**
	 * 添加评价(用户对护士的评价)
	 * @param userId 用户ID
	 * @param nurseId 护士ID
	 * @param sendId 订单ID
	 * @param content 评价内容
	 * @param mark 评价打分
	 * @return
	 */
	@RequestMapping(value="addevaluate", method = RequestMethod.POST)
	public @ResponseBody
	NetState AddEvaluate(String userId, String nurseId, String sendId, String content, String mark)throws Exception{
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(nurseId == null || "".equals(nurseId)){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(sendId == null || "".equals(sendId)){
			netState.setData("订单ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(content == null || "".equals(content)){
			netState.setData("评价内容错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(mark == null || "".equals(mark)){
			netState.setData("分数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			 OrderSend orderSend1 = orderSendService.selectOrderSendInfoById(sendId);
			 
			 if(orderSend1 == null || "".equals(orderSend1)){
				netState.setData("订单不存在");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			 }
			
			List<Evaluate> evaluates = new ArrayList<Evaluate>();
			EvaluateExample evaluateExample = new EvaluateExample();
			Criteria criteria = evaluateExample.createCriteria();
			criteria.andEvaluateOrderSendIdEqualTo(sendId);
			try {
				evaluates = evaluateService.selectByExample(evaluateExample);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (evaluates.size() > 0) {
				netState.setData("已经评价过");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			} else {
				// 初始化实体类
				Evaluate evaluate = new Evaluate();
				// 生成评价ID
				String evaluateId = java.util.UUID.randomUUID().toString()
						.replaceAll("-", "");
				evaluate.setEvaluateId(evaluateId);
				evaluate.setEvaluateUserid(userId);
				evaluate.setEvaluateNurseid(nurseId);
				evaluate.setEvaluateContent(content);
				evaluate.setEvaluateOrderSendId(sendId);
				evaluate.setEvaluateMark(new BigDecimal(mark));
				evaluate.setEvaluateCreatetime(new Date());
				int i = 0;
				try {
					i = evaluateService.insertSelective(evaluate);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i > 0) {
					SimpleDateFormat format = new SimpleDateFormat();
					//获取平台的利率
					InterestRateExample example = new InterestRateExample();
					List<InterestRate> list = interestRateService.selectByExample(example);
					BigDecimal interes = BigDecimal.ZERO;
					if(list!=null && !"".equals(interestRateService) && list.size()!=0){
						interes = list.get(0).getInterestRateSize();
					}
					// 通过订单id查询订单详情
					OrderInfoByNurse orderInfoByNurse = orderSendService.selectOrderSendInfoByIdVo(sendId);
					if(orderInfoByNurse==null || "".equals(orderInfoByNurse)){
						netState.setData("该订单不存在,评价失败");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}
					Date date = new Date();
					//获取该订单的费用
					//交通费
					BigDecimal traffic = orderInfoByNurse.getOrderSendTrafficmoney();
					
					//订单服务费
					BigDecimal service = orderInfoByNurse.getOrderSendCostmoney();
					
					BigDecimal finalMoney = traffic.add(service);
					
					//平台收取的费用
					BigDecimal platform = BigDecimal.ZERO;
					//平台利率收入
					if(interes.compareTo(BigDecimal.ZERO) == 0){//如果平台没有设置利率或者设置的利率为0
						
					}else{
						//平台收取的费用
						platform= service.multiply(interes);
						//平台收益
						CapitalPlatform capitalPlatform = new CapitalPlatform();
						capitalPlatform.setCapitalPlatformMoney(platform);
						capitalPlatform.setCapitalPlatformOrderSendId(sendId);
						capitalPlatform.setCapitalPlatformNote("完成订单收益");
						capitalPlatform.setCapitalPlatformCreatetime(date);
						capitalPlatformService.insertSelective(capitalPlatform);
					}
					//最终到护士的钱(交通费加服务费减去平台收益)
					BigDecimal nurseFinalMoney = finalMoney.subtract(platform);
					
					//评价成功将钱打入护士账号(只有订单收入触发器自动加入)
					//将记录插入到护士资金表中
					CapitalNursePool pool = new CapitalNursePool();
					pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
						.replaceAll("-", ""));
					pool.setCapitalNursePoolPeopleid(nurseId);
					pool.setCapitalNursePoolOrdersendid(sendId);
					pool.setCapitalNursePoolMoney(nurseFinalMoney);
					pool.setCapitalNursePoolSpeak("平台收取服务费"+interes.multiply(new BigDecimal(100))+"%的利率");
					pool.setCapitalNursePoolType(7);
					pool.setCapitalNursePoolCreatetime(date);
					
					////将推送记录到护士站内信中
					StandInnerLetter innerLetter = new StandInnerLetter();
					innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					innerLetter.setStandInnerLetterUserId(nurseId);                              
					innerLetter.setStandInnerLetterUserIdentity(1);
					innerLetter.setStandInnerLetterTitle("订单评价");
					//0订单消息/1资金消息/2系统通知
					innerLetter.setStandInnerLetterUserType(0);
					
					innerLetter.setStandInnerLetterContent("您的单号为"+orderSend1.getOrderSendNumbers()+"订单于"+format.format(date)+"已被用户评价");
					innerLetter.setStandInnerLetterCreatetime(date);
					standInnerLetterService.insertSelective(innerLetter);
					
					//获取护士信息
					Nurse nurse = nurseService.selectForNurseId(nurseId);
					
					////将到账信息记录到护士站内信中
					StandInnerLetter innerLetter2 = new StandInnerLetter();
					innerLetter2.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
					innerLetter2.setStandInnerLetterUserId(nurseId);                              
					innerLetter2.setStandInnerLetterUserIdentity(1);
					innerLetter2.setStandInnerLetterTitle("订单评价");
					//0订单消息/1资金消息/2系统通知
					innerLetter2.setStandInnerLetterUserType(1);
					innerLetter2.setStandInnerLetterContent("您的单号为"+orderSend1.getOrderSendNumbers()+"订单于"+format.format(date)+"到账¥"+nurseFinalMoney.setScale(2, BigDecimal.ROUND_HALF_UP)+",剩余余额¥"+nurse.getNurseBalance());
					innerLetter2.setStandInnerLetterCreatetime(date);
					standInnerLetterService.insertSelective(innerLetter2);
					
					int c = capitalNursePoolService.insertSelective(pool);
					if(c==0){
						netState.setData("评价失败,请重新评价");
						netState.setErrorCode(NetState.PARAMS_ERROR);
						return netState;
					}
					//完成订单的红包(百分比)
					RedPackets redPackets = packetsService.selectRedpacketsInfoByType(4);
					RedPacketsUser redPacketsUser = new RedPacketsUser();
					if(redPackets!=null && !redPackets.equals(redPackets)){
						//给护士发完成订单的红包
						//如果后台设置了推荐送的红包
						redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						
						//订单的(服务费的百分比)
						//护士获得的红包
						BigDecimal money = service.multiply(redPackets.getRedPacketsMoney().divide(new BigDecimal(100)));
						redPacketsUser.setRedPacketsNurseMoney(money);
						redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
						redPacketsUser.setRedPacketsNurseNurseId(nurseId);
						redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
						redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
						redPacketsUser.setRedPacketsNurseCreatetime(new Date());
						packetsService.insertSelectiveNurseRedPackets(redPacketsUser);
						
						//添加到护士资金池(触发器自动加到护士月)
						CapitalNursePool pool1 = new CapitalNursePool();
						pool1.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
							.replaceAll("-", ""));
						pool1.setCapitalNursePoolPeopleid(nurseId);
						pool1.setCapitalNursePoolOrdersendid("");
						pool1.setCapitalNursePoolMoney(money);
						pool1.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
						pool1.setCapitalNursePoolType(3);
						pool1.setCapitalNursePoolCreatetime(new Date());
						capitalNursePoolService.insertSelective(pool1);
						
						////将红包记录到护士站内信中
						StandInnerLetter innerLetter1 = new StandInnerLetter();
						innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter1.setStandInnerLetterUserId(nurseId);                     
						innerLetter1.setStandInnerLetterUserIdentity(1);
						innerLetter1.setStandInnerLetterTitle("红包消息");
						//0订单消息/1资金消息/2系统通知
						innerLetter1.setStandInnerLetterUserType(1);
						innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPackets.getRedPacketsMoney()+"的完成订单红包");
						innerLetter1.setStandInnerLetterCreatetime(date);
						standInnerLetterService.insertSelective(innerLetter1);
					}
					//判断是不是首单(固定)
					OrderReceiver orderReceiver = orderReceiverService.selectOrderIsNotFirstOrder(nurseId);
					RedPackets redPacketsFirst = packetsService.selectRedpacketsInfoByType(6);
					if(orderReceiver==null || "".equals(orderReceiver)){//首单
						if(redPacketsFirst!=null && !"".equals(redPacketsFirst)){//后台设置了首单红包
							RedPacketsUser redPacketsUserfirst = new RedPacketsUser();
							redPacketsUserfirst.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							redPacketsUserfirst.setRedPacketsNurseMoney(redPacketsFirst.getRedPacketsMoney());
							redPacketsUserfirst.setRedPacketsNursePic(redPacketsFirst.getRedPacketsPic());
							redPacketsUserfirst.setRedPacketsNurseNurseId(nurseId);
							redPacketsUserfirst.setRedPacketsNurseNote(redPacketsFirst.getRedPacketsNote());
							redPacketsUserfirst.setRedPacketsNurseSpeak(redPacketsFirst.getRedPacketsSpeak());
							redPacketsUserfirst.setRedPacketsNurseCreatetime(new Date());
							packetsService.insertSelectiveNurseRedPackets(redPacketsUserfirst);
							
							//添加到护士资金池(触发器自动加到护士月)
							CapitalNursePool poolfirst = new CapitalNursePool();
							poolfirst.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
							poolfirst.setCapitalNursePoolPeopleid(nurseId);
							poolfirst.setCapitalNursePoolOrdersendid("");
							poolfirst.setCapitalNursePoolMoney(redPacketsFirst.getRedPacketsMoney());
							poolfirst.setCapitalNursePoolSpeak(redPacketsFirst.getRedPacketsSpeak());
							poolfirst.setCapitalNursePoolType(5);
							poolfirst.setCapitalNursePoolCreatetime(new Date());
							capitalNursePoolService.insertSelective(poolfirst);
							
							////将推送记录到护士站内信中
							StandInnerLetter innerLetter1 = new StandInnerLetter();
							innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
							innerLetter1.setStandInnerLetterUserId(nurseId);                              
							innerLetter1.setStandInnerLetterUserIdentity(1);
							innerLetter1.setStandInnerLetterTitle("首单红包");
							//0订单消息/1资金消息/2系统通知
							innerLetter1.setStandInnerLetterUserType(1);
							innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPacketsFirst.getRedPacketsMoney()+"的首单红包");
							innerLetter1.setStandInnerLetterCreatetime(new Date());
							standInnerLetterService.insertSelective(innerLetter1);
							
						}
					}
					//判断我是不是被别人邀请来的
					//查询邀请我的人
				    Invitation invitation = invitationService.selectinvitationMe(nurseId);
				    if(invitation!=null && !"".equals(invitation)){
				    	//获取邀请我的人ID
				    	String beNurseId = invitation.getInvitationUserId();
				    	RedPackets redPacketsFirst1 = packetsService.selectRedpacketsInfoByType(5);
				    	//获取返利百分比
				    	if(redPacketsFirst1!=null && !"".equals(redPacketsFirst1)){//后台设置了返利红包
				    		//获取返利百分比
				    		BigDecimal percentage = redPacketsFirst1.getRedPacketsMoney().divide(new BigDecimal(100));
				    		//获取返利的金额(服务费X百分比)
				    		BigDecimal rebate = service.multiply(percentage);
				    		
								RedPacketsUser redPacketsUserfirst1 = new RedPacketsUser();
								redPacketsUserfirst1.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
										.replaceAll("-", ""));
								redPacketsUserfirst1.setRedPacketsNurseMoney(rebate);
								redPacketsUserfirst1.setRedPacketsNursePic(redPacketsFirst1.getRedPacketsPic());
								redPacketsUserfirst1.setRedPacketsNurseNurseId(beNurseId);
								redPacketsUserfirst1.setRedPacketsNurseNote(redPacketsFirst1.getRedPacketsNote());
								redPacketsUserfirst1.setRedPacketsNurseSpeak(redPacketsFirst1.getRedPacketsSpeak());
								redPacketsUserfirst1.setRedPacketsNurseCreatetime(new Date());
								packetsService.insertSelectiveNurseRedPackets(redPacketsUserfirst1);
								
								//添加到护士资金池(触发器自动加到护士月)
								CapitalNursePool poolfirst = new CapitalNursePool();
								poolfirst.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
								poolfirst.setCapitalNursePoolPeopleid(beNurseId);
								poolfirst.setCapitalNursePoolOrdersendid("");
								poolfirst.setCapitalNursePoolMoney(rebate);
								poolfirst.setCapitalNursePoolSpeak(redPacketsFirst1.getRedPacketsSpeak());
								poolfirst.setCapitalNursePoolType(5);
								poolfirst.setCapitalNursePoolCreatetime(new Date());
								capitalNursePoolService.insertSelective(poolfirst);
								
								////将推送记录到护士站内信中
								StandInnerLetter innerLetter1 = new StandInnerLetter();
								innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
										.replaceAll("-", ""));
								innerLetter1.setStandInnerLetterUserId(beNurseId);                              
								innerLetter1.setStandInnerLetterUserIdentity(1);
								innerLetter1.setStandInnerLetterTitle("返利红包");
								//0订单消息/1资金消息/2系统通知
								innerLetter1.setStandInnerLetterUserType(1);
								innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+rebate+"的返利红包");
								innerLetter1.setStandInnerLetterCreatetime(new Date());
								standInnerLetterService.insertSelective(innerLetter1);
							}
				    }
					
					netState.setData("添加成功");
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					netState.setData("添加失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			}
		}
		return netState;
		
	}
	

}
