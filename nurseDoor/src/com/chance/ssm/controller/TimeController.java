package com.chance.ssm.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.CapitalNursePool;
import com.chance.ssm.po.CapitalPlatform;
import com.chance.ssm.po.CapitalUserPool;
import com.chance.ssm.po.Evaluate;
import com.chance.ssm.po.EvaluateExample;
import com.chance.ssm.po.InterestRate;
import com.chance.ssm.po.InterestRateExample;
import com.chance.ssm.po.Invitation;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NursingProject;
import com.chance.ssm.po.OrderCancelOrder;
import com.chance.ssm.po.OrderInfoByNurse;
import com.chance.ssm.po.OrderReceiver;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.Switch;
import com.chance.ssm.po.EvaluateExample.Criteria;
import com.chance.ssm.po.vo.OrderReceiverAndOrderVO;
import com.chance.ssm.po.vo.OrderSendCancalVo;
import com.chance.ssm.po.vo.UserAndOrderSend;
import com.chance.ssm.service.CapitalNursePoolService;
import com.chance.ssm.service.CapitalPlatformService;
import com.chance.ssm.service.EvaluateService;
import com.chance.ssm.service.InterestRateService;
import com.chance.ssm.service.InvitationService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.NursingProjectService;
import com.chance.ssm.service.OrderCancelOrderService;
import com.chance.ssm.service.OrderReceiverService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.RedPacketsService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.utils.DateUtil;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushPeo;



@Controller
public class TimeController {

	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	@Autowired
	private NursingProjectService nursingProjectService;
	
	@Autowired
	private EvaluateService evaluateService;
	
	@Autowired
	private InterestRateService interestRateService;
	
	@Autowired
	private CapitalPlatformService capitalPlatformService;
	
	@Autowired
	private CapitalNursePoolService capitalNursePoolService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
    @Autowired
    private RedPacketsService packetsService;
    
    @Autowired
    private OrderReceiverService orderReceiverService;
    
    @Autowired
    private InvitationService invitationService;
	
	// 护士端
	private static final String appKey = "f3df690c367e49335b6eca7b";
	private static final String masterSecret = "5fc63778c12794bf2c3cdbae";
	
	@Autowired
	private NurseService nurseService;

	//护士不在自动把所有订单发放
	@Scheduled(cron = "0 0/5 * * * ?")
	public void print111()throws Exception{
		//查询开关状态
		 Switch switch1 = orderSendService.selectSwhtchState();
		 int switchstate = switch1.getSwitchOrderOpen();
		 if(switchstate==0){
			 List<UserAndOrderSend> list = new ArrayList<UserAndOrderSend>();
				list = orderSendService.selectOrderSendWaitServiceSureAllInfo();
				for (int i = 0; i < list.size(); i++) {
					OrderSend orderSend1 = new OrderSend();
					orderSend1.setOrderSendId(list.get(i).getOrderSendId());
					orderSend1.setOrderSendState("0");
			    	orderSendService.updateByOrderSendId(orderSend1);
			    	
			    	//根据服务给匹配的护士发推送
			    	//根据订单ID得到产品ID
					OrderSend orderSend = orderSendService.selectOrderSendInfoById(list.get(i).getOrderSendId());
					if(orderSend != null && !"".equals(orderSend)){
						String goodsId = orderSend.getOrderSendServicecontent();
						if(goodsId != null && !"".equals(goodsId)){
							String[] goods = goodsId.split(",");
							//通过产品ID查询二级服务信息
							ManageNursingContent manageNursingContent =manageNursingContentService.selectManageNursingContenInfoByGoodsId(goods[0]);
							if(manageNursingContent!=null && !"".equals(manageNursingContent)){
								String  manageNursingContentId =  manageNursingContent.getManageNursingContentId();
								//根据服务ID查询匹配的护士ID
							    List<NursingProject> nursingProjects = nursingProjectService.selectNurseIdByContentIdFor(manageNursingContentId);
							    for (NursingProject nursingProject : nursingProjects) {
							    	//护士ID
									final String nurseId = nursingProject.getNursingNurseid();
									//根据护士ID得到护士账号
									Nurse nurse = nurseService.selectForNurseId(nurseId);
									if(nurse != null){
										//护士账号
										final String nurseName = nurse.getNurseName();
										Thread thread = new Thread() {
											public void run() {
												// 向客户端发送推送
												String TITLE = "普通订单";
												String ALERT = "亲,发现有一条订单,请看是否合适";
												String MSG_CONTENT = "亲,发现有一条订单,请看是否合适";
												//指定推送
												JdpushPeo.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
												//通知
												Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
												//发送短信
												SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nurseName, "【小护健康】亲,发现有一条订单,请看是否合适", null, null, "0",  null,  null,  null,  null, null,  null, null);
											};
										};
										thread.start();
									}
								}
							}
						}
					}
				} 
		 }
  	}
		//用户未评价定时间自动评价订单
//		@Scheduled(cron = "0 0 2 * * ?")
//		@Scheduled(cron="0/5 * * * * ?")
		@Scheduled(cron = "0 0/5 * * * ?")
		public void automaticvaluation()throws Exception{
			List<UserAndOrderSend> elist = orderSendService.selectOrderSendInfoButNotEvaluateSevenDay();
			Date date = new Date();
			if(elist.size()==0 || "".equals(elist)){
				
			}else{
				SimpleDateFormat format = new SimpleDateFormat();
				for (UserAndOrderSend userAndOrderSend : elist) {
					List<Evaluate> evaluates = new ArrayList<Evaluate>();
					EvaluateExample evaluateExample = new EvaluateExample();
					Criteria criteria = evaluateExample.createCriteria();
					criteria.andEvaluateOrderSendIdEqualTo(userAndOrderSend.getOrderSendId());
					evaluates = evaluateService.selectByExample(evaluateExample);
					if (evaluates.size() > 0) {
						
					} else {
						// 初始化实体类
						Evaluate evaluate = new Evaluate();
						// 生成评价ID
						String evaluateId = java.util.UUID.randomUUID().toString()
								.replaceAll("-", "");
						evaluate.setEvaluateId(evaluateId);
						evaluate.setEvaluateUserid(userAndOrderSend.getOrderSendUserid());
						evaluate.setEvaluateNurseid(userAndOrderSend.getNurseId());
						evaluate.setEvaluateContent("服务很好");
						evaluate.setEvaluateOrderSendId(userAndOrderSend.getOrderSendId());
						evaluate.setEvaluateMark(new BigDecimal(5));
						evaluate.setEvaluateCreatetime(new Date());
						int i = 0;
							i = evaluateService.insertSelective(evaluate);
						if (i > 0) {
							//获取平台的利率
							InterestRateExample example = new InterestRateExample();
							List<InterestRate> list = interestRateService.selectByExample(example);
							BigDecimal interes = BigDecimal.ZERO;
							if(list!=null && !"".equals(interestRateService) && list.size()!=0){
								interes = list.get(0).getInterestRateSize();
							}
							// 通过订单id查询订单详情
							OrderInfoByNurse orderInfoByNurse = orderSendService.selectOrderSendInfoByIdVo(userAndOrderSend.getOrderSendId());
							if(orderInfoByNurse==null || "".equals(orderInfoByNurse)){
							
							}else{
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
									capitalPlatform.setCapitalPlatformOrderSendId(userAndOrderSend.getOrderSendId());
									capitalPlatform.setCapitalPlatformNote("完成订单收益");
									capitalPlatform.setCapitalPlatformCreatetime(date);
									capitalPlatformService.insertSelective(capitalPlatform);
								}
								
								//最终到护士的钱(交通费加服务费减去平台收益)
								BigDecimal nurseFinalMoney = finalMoney.subtract(platform);
								
								//评价成功将钱打入护士账号(触发器自动加入)
								//将记录插入到护士资金表中
								CapitalNursePool pool = new CapitalNursePool();
								pool.setCapitalNursePoolId(java.util.UUID.randomUUID().toString()
									.replaceAll("-", ""));
								pool.setCapitalNursePoolPeopleid(userAndOrderSend.getNurseId());
								pool.setCapitalNursePoolOrdersendid(userAndOrderSend.getOrderSendId());
								pool.setCapitalNursePoolPeopleidIdentity(1);
								pool.setCapitalNursePoolMoney(nurseFinalMoney);
								pool.setCapitalNursePoolType(7);
								pool.setCapitalNursePoolSpeak("平台收取服务费"+interes.multiply(new BigDecimal(100))+"%的利率");
								pool.setCapitalNursePoolCreatetime(date);
								
								capitalNursePoolService.insertSelective(pool);
								
								//获取护士信息
								Nurse nurse = nurseService.selectForNurseId(userAndOrderSend.getNurseId());
	
								////将推送记录到护士站内信中
								StandInnerLetter innerLetter = new StandInnerLetter();
								innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
										.replaceAll("-", ""));
								innerLetter.setStandInnerLetterUserId(userAndOrderSend.getNurseId());                     
								innerLetter.setStandInnerLetterUserIdentity(1);
								innerLetter.setStandInnerLetterTitle("订单评价");
								//0订单消息/1资金消息/2系统通知
								innerLetter.setStandInnerLetterUserType(0);
								innerLetter.setStandInnerLetterContent("您的单号为"+userAndOrderSend.getOrderSendNumbers()+"订单于"+format.format(date)+"已被用户评价(系统默认)");
								innerLetter.setStandInnerLetterCreatetime(date);
								standInnerLetterService.insertSelective(innerLetter);
								
								////将到账信息记录到护士站内信中
								StandInnerLetter innerLetter2 = new StandInnerLetter();
								innerLetter2.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
										.replaceAll("-", ""));
								innerLetter2.setStandInnerLetterUserId(userAndOrderSend.getNurseId());                              
								innerLetter2.setStandInnerLetterUserIdentity(1);
								innerLetter2.setStandInnerLetterTitle("订单评价");
								//0订单消息/1资金消息/2系统通知
								innerLetter2.setStandInnerLetterUserType(1);
								innerLetter2.setStandInnerLetterContent("您的单号为"+userAndOrderSend.getOrderSendNumbers()+"订单于"+format.format(date)+"到账¥"+nurseFinalMoney+",剩余余额¥"+nurse.getNurseBalance());
								innerLetter2.setStandInnerLetterCreatetime(date);
								standInnerLetterService.insertSelective(innerLetter2);
								
								//完成订单的红包(百分比)
								RedPackets redPackets = packetsService.selectRedpacketsInfoByType(4);
								RedPacketsUser redPacketsUser = new RedPacketsUser();
								if(redPackets!=null && !redPackets.equals(redPackets)){
									//给护士发完成订单的红包
									//如果后台设置了完成订单的红包
									redPacketsUser.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
											.replaceAll("-", ""));
									
									//订单的(服务费的百分比)
									//护士获得的红包
									BigDecimal money = service.multiply(redPackets.getRedPacketsMoney().divide(new BigDecimal(100)));
									redPacketsUser.setRedPacketsNurseMoney(money);
									redPacketsUser.setRedPacketsNursePic(redPackets.getRedPacketsPic());
									redPacketsUser.setRedPacketsNurseNurseId(userAndOrderSend.getNurseId());
									redPacketsUser.setRedPacketsNurseNote(redPackets.getRedPacketsNote());
									redPacketsUser.setRedPacketsNurseSpeak(redPackets.getRedPacketsSpeak());
									redPacketsUser.setRedPacketsNurseCreatetime(date);
									packetsService.insertSelectiveNurseRedPackets(redPacketsUser);
									
									//添加到护士资金池(触发器自动加到护士月)
									CapitalNursePool pool1 = new CapitalNursePool();
									pool1.setCapitalNursePoolId(java.util.UUID.randomUUID().toString().replaceAll("-", ""));
									pool1.setCapitalNursePoolPeopleid(userAndOrderSend.getNurseId());
									pool1.setCapitalNursePoolOrdersendid("");
									pool1.setCapitalNursePoolMoney(money);
									pool1.setCapitalNursePoolSpeak(redPackets.getRedPacketsSpeak());
									pool1.setCapitalNursePoolType(3);
									pool1.setCapitalNursePoolCreatetime(date);
									capitalNursePoolService.insertSelective(pool1);
									
									////将红包记录到护士站内信中
									StandInnerLetter innerLetter1 = new StandInnerLetter();
									innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
											.replaceAll("-", ""));
									innerLetter1.setStandInnerLetterUserId(userAndOrderSend.getNurseId());                     
									innerLetter1.setStandInnerLetterUserIdentity(1);
									innerLetter1.setStandInnerLetterTitle("红包消息");
									//0订单消息/1资金消息/2系统通知
									innerLetter1.setStandInnerLetterUserType(1);
									innerLetter1.setStandInnerLetterContent("您于"+format.format(date)+"获得了一个¥"+redPackets.getRedPacketsMoney()+"的完成订单红包");
									innerLetter1.setStandInnerLetterCreatetime(date);
									standInnerLetterService.insertSelective(innerLetter1);
								}
								//判断是不是首单(固定)
								OrderReceiver orderReceiver = orderReceiverService.selectOrderIsNotFirstOrder(userAndOrderSend.getNurseId());
								RedPackets redPackets1 = packetsService.selectRedpacketsInfoByType(6);
								if(orderReceiver==null || "".equals(orderReceiver)){//首单
									if(redPackets1!=null && !"".equals(redPackets1)){//后台设置了首单返利
										//如果后台设置了推荐送的红包
										RedPackets redPacketsFirst = packetsService.selectRedpacketsInfoByType(3);
										RedPacketsUser redPacketsUserfirst = new RedPacketsUser();
										redPacketsUserfirst.setRedPacketsNurseId(java.util.UUID.randomUUID().toString()
												.replaceAll("-", ""));
										redPacketsUserfirst.setRedPacketsNurseMoney(redPacketsFirst.getRedPacketsMoney());
										redPacketsUserfirst.setRedPacketsNursePic(redPacketsFirst.getRedPacketsPic());
										redPacketsUserfirst.setRedPacketsNurseNurseId(userAndOrderSend.getNurseId());
										redPacketsUserfirst.setRedPacketsNurseNote(redPacketsFirst.getRedPacketsNote());
										redPacketsUserfirst.setRedPacketsNurseSpeak(redPacketsFirst.getRedPacketsSpeak());
										redPacketsUserfirst.setRedPacketsNurseCreatetime(new Date());
										packetsService.insertSelectiveNurseRedPackets(redPacketsUserfirst);
										
										//添加到护士资金池(触发器自动加到护士月)
										CapitalNursePool poolfirst = new CapitalNursePool();
										poolfirst.setCapitalNursePoolId(java.util.UUID.randomUUID().toString().replaceAll("-", ""));
										poolfirst.setCapitalNursePoolPeopleid(userAndOrderSend.getNurseId());
										poolfirst.setCapitalNursePoolOrdersendid("");
										poolfirst.setCapitalNursePoolMoney(redPacketsFirst.getRedPacketsMoney());
										poolfirst.setCapitalNursePoolSpeak(redPacketsFirst.getRedPacketsSpeak());
										poolfirst.setCapitalNursePoolType(5);
										poolfirst.setCapitalNursePoolCreatetime(date);
										capitalNursePoolService.insertSelective(poolfirst);
										
										////将推送记录到护士站内信中
										StandInnerLetter innerLetter1 = new StandInnerLetter();
										innerLetter1.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
												.replaceAll("-", ""));
										innerLetter1.setStandInnerLetterUserId(userAndOrderSend.getNurseId());                              
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
							    Invitation invitation = invitationService.selectinvitationMe(userAndOrderSend.getNurseId());
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
								
							}
						} 
					}
				}
			}
	 	}
}
