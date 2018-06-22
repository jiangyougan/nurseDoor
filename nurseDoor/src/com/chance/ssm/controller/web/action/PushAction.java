package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseExample;
import com.chance.ssm.po.StandInnerLetter;
import com.chance.ssm.po.User;
import com.chance.ssm.po.UserExample;
import com.chance.ssm.po.UserExample.Criteria;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.StandInnerLetterService;
import com.chance.ssm.service.UserService;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.test.com.ruanwei.interfacej.Test;
import com.weiwend.jdpush.Jdpush;
import com.weiwend.jdpush.JdpushPeo;

/********全局推送控制器**********/
@Controller
public class PushAction {
	@Autowired
	private UserService userService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private StandInnerLetterService standInnerLetterService;
	
	/*private String userId = null;
	
	private String userPhone = null;
	
	private String nurseId = null;
	
	private String nursePhone = null;
	
	private String AllpushContent = null;*/
	
	//用户端
	private static final String appKey ="8121db7759363542b25159b8";
	private static final String masterSecret = "c20fa080107794c1337065f9";
	
	//护士端
	private static final String nurseappKey = "f3df690c367e49335b6eca7b";
	private static final String nursemasterSecret = "5fc63778c12794bf2c3cdbae";

	 @RequestMapping(value="/globalPush", method = RequestMethod.POST) 
	 public void updateinterest(Model model,HttpServletRequest request,HttpServletResponse response,String pushContent,String sel)throws Exception{
		 PrintWriter out = response.getWriter();
		 //查询全部用户
		 List<String> users = new ArrayList<String>();
		 UserExample userExample = new UserExample();
		 List<User> userlist =  userService.selectByExample(userExample);
		 for (int i = 0; i < userlist.size(); i++) {
			 users.add(userlist.get(i).getUserId());
		}
		 //查询全部护士
		 List<String> nurses = new ArrayList<String>();
		 NurseExample nurseExample = new NurseExample();
		 List<Nurse> nurselist =  nurseService.selectByExample(nurseExample);
		 for (int i = 0; i < nurselist.size(); i++) {
			 nurses.add(nurselist.get(i).getNurseId());
		}
		 String alter = null;
		 if(sel == "0" || "0".equals(sel)){//推送给用户
			 alter = pushUser(pushContent,users);
		 }else  if(sel == "1" || "1".equals(sel)){//推送给护士
			 alter = pushNurse(pushContent,nurses);
		 }else{//全局推送
			 //alter = pushAllPeople(pushContent,users,nurses);
			 alter = pushUser(pushContent,users);
			 alter = pushNurse(pushContent,nurses);
		 }
		 if(alter == "success" || "success".equals(alter)){
			 out.print(1); 
		 }else{
			 out.print(2); 
		 }
	 }
	 //推送给用户
	 public String pushUser(String pushContent,List<String> user)throws Exception{
		
		 ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		 for (int i = 0; i < user.size(); i++) {
			 final String userId = user.get(i);
			 //根据ID得到手机号
			 User user2 = userService.selectForUserByID(userId);
			 if(user2!=null && !"".equals(user2)){
				 final String userPhone = user2.getUserName();
				 final String AllpushContent = pushContent;
				 //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
				 cachedThreadPool.execute(new Runnable() {
					@Override
					public void run() {
						//根据赛区id获取赛区发布人的id
						//向客户端发送推送
						String TITLE = "系统消息";
						String ALERT= AllpushContent;
						String MSG_CONTENT= AllpushContent;
					//全部推送	
					Jdpush.testSendPush(appKey,masterSecret,TITLE,ALERT,MSG_CONTENT,userId);
						//发送短信
					 SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, userPhone, "【小护健康】"+AllpushContent, null, null, "0",  null,  null,  null,  null, null,  null, null);
						////将推送记录到用户站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(userId);                              
						innerLetter.setStandInnerLetterUserIdentity(0);
						innerLetter.setStandInnerLetterTitle("系统消息");
						//0订单消息/1资金消息/2系统通知
						innerLetter.setStandInnerLetterUserType(2);
						innerLetter.setStandInnerLetterContent(AllpushContent);
						innerLetter.setStandInnerLetterCreatetime(new Date());
						try {
							standInnerLetterService.insertSelective(innerLetter);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				 }
			 
		}
		 return "success";
	 }
	 //推送给护士
	 public String pushNurse(String pushContent,List<String> nurse)throws Exception{
		 ExecutorService cachedThreadPool = Executors.newCachedThreadPool();  
		 for (int i = 0; i < nurse.size(); i++) {
			 final String nurseId = nurse.get(i);
			 //根据ID得到手机号
			 Nurse Nurse2 = nurseService.selectForNurseId(nurseId);
			 if(Nurse2!=null && !"".equals(Nurse2)){
				 final String nursePhone = Nurse2.getNurseName();
				 final String AllpushContent = pushContent;
				 //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
				 cachedThreadPool.execute(new Runnable() {
					@Override
					public void run() {
						//根据赛区id获取赛区发布人的id
						//向客户端发送推送
						String TITLE = "系统消息";
						String ALERT= AllpushContent;
						String MSG_CONTENT= AllpushContent;
					//全部推送	
					Jdpush.testSendPush(nurseappKey,nursemasterSecret,TITLE,ALERT,MSG_CONTENT,nurseId);
						//发送短信
						SmsClientSend.sendSms(Test.url, Test.userid, Test.account, Test.password, nursePhone, "【小护健康】"+AllpushContent, null, null, "0",  null,  null,  null,  null, null,  null, null);
						////将推送记录到护士站内信中
						StandInnerLetter innerLetter = new StandInnerLetter();
						innerLetter.setStandInnerLetterId(java.util.UUID.randomUUID().toString()
								.replaceAll("-", ""));
						innerLetter.setStandInnerLetterUserId(nurseId);                              
						innerLetter.setStandInnerLetterUserIdentity(1);
						innerLetter.setStandInnerLetterTitle("系统消息");
						//0订单消息/1资金消息/2系统通知
						innerLetter.setStandInnerLetterUserType(2);
						innerLetter.setStandInnerLetterContent(AllpushContent);
						innerLetter.setStandInnerLetterCreatetime(new Date());
						try {
							standInnerLetterService.insertSelective(innerLetter);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				 }
			
		}
		 return "success";
	 }
	/* //推送全部
	 public String pushAllPeople(String pushContent,List<String> user,List<String> nurse){
		 return "success";
	 }*/
}
