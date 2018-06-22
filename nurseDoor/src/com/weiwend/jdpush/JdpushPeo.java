package com.weiwend.jdpush;  
  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
  
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;  
import cn.jpush.api.push.PushResult;  
import cn.jpush.api.push.model.Message;  
import cn.jpush.api.push.model.Options;  
import cn.jpush.api.push.model.Platform;  
import cn.jpush.api.push.model.PushPayload;  
import cn.jpush.api.push.model.audience.Audience;  
import cn.jpush.api.push.model.audience.AudienceTarget;  
import cn.jpush.api.push.model.notification.AndroidNotification;  
import cn.jpush.api.push.model.notification.IosNotification;  
import cn.jpush.api.push.model.notification.Notification;  
  
public class JdpushPeo {  
     protected static final Logger LOG = LoggerFactory.getLogger(Jdpush.class);  
  
     // demo App defined in resources/jpush-api.conf   
  
//    public static final String TITLE = "选美颜值榜";  
//    public static final String ALERT = "祝大家新春快乐";  
//    public static final String MSG_CONTENT = "选美颜值榜祝新老客户新春快乐";  
    public static final String REGISTRATION_ID = "0900e8d85ef";  
    public static final String TAG = "tag_api";  
      
    public  static JPushClient jpushClient=null;  
      
    public static void testSendPush(String appKey ,String masterSecret,String TITLE,
    		String ALERT,String MSG_CONTENT,String People
    		) {  
          
          
          
         jpushClient = new JPushClient(masterSecret, appKey, 3);  
          
        // HttpProxy proxy = new HttpProxy("localhost", 3128);  
        // Can use this https proxy: https://github.com/Exa-Networks/exaproxy  
         
          
        // For push, all you need do is to build PushPayload object.  
        //PushPayload payload = buildPushObject_all_all_alert();  
         //生成推送的内容，这里我们先测试全部推送  
        PushPayload payload=buildPushObject_all_alias_alert(ALERT,People);  
         //指定推送
         //PushPayload payload=buildPushObject_android_tag_alertWithTitle(ALERT,TITLE,People);
          
          
        try {  
            System.out.println(payload.toString());  
          //PushResult result = jpushClient.sendPush(payload);  //直接推送 不经过客户端
            PushResult result = jpushClient.sendAndroidMessageWithAlias(TITLE, MSG_CONTENT, People);//经过客户端处理再推送
            System.out.println(result+"................................");  
              
            LOG.info("得到的结果 - " + result);  
              
        } catch (APIConnectionException e) {  
            LOG.error("连接错误应该重试. ", e);  
              
        } catch (APIRequestException e) {  
            LOG.error("从JPush服务器错误响应。应审查和修复它. ", e);  
            LOG.info("HTTP Status: " + e.getStatus());  
            LOG.info("错误代码: " + e.getErrorCode());  
            LOG.info("错误信息: " + e.getErrorMessage());  
            LOG.info("Msg ID: " + e.getMsgId());  
        }  
    }  
      
    public static PushPayload buildPushObject_all_all_alert(String ALERT) {  
        return PushPayload.alertAll(ALERT);  
    }  
      
    public static PushPayload buildPushObject_all_alias_alert(String ALERT,String People) {  
        return PushPayload.newBuilder()  
                .setPlatform(Platform.all())//设置接受的平台  
                .setAudience(Audience.alias(People))//Audience设置为all，说明采用广播方式推送，所有用户都可以接收到  
                .setNotification(Notification.alert(ALERT))  
                .build();  
    }  
      
    public static PushPayload buildPushObject_android_tag_alertWithTitle(String ALERT,String TITLE) { 
    	return PushPayload.newBuilder()  
                .setPlatform(Platform.android())  
                .setAudience(Audience.all())
                .setNotification(Notification.android(ALERT, TITLE, null))  
                .build();  
    }  
      
    public static PushPayload buildPushObject_android_and_ios() {  
        return PushPayload.newBuilder()  
                .setPlatform(Platform.android_ios())  
                .setAudience(Audience.tag("tag1"))  
                .setNotification(Notification.newBuilder()  
                        .setAlert("alert content")  
                        .addPlatformNotification(AndroidNotification.newBuilder()  
                                .setTitle("Android Title").build())  
                        .addPlatformNotification(IosNotification.newBuilder()  
                                .incrBadge(1)  
                                .addExtra("extra_key", "extra_value").build())  
                        .build())  
                .build();  
    }  
      
    public static PushPayload buildPushObject_ios_tagAnd_alertWithExtrasAndMessage(String ALERT,String MSG_CONTENT) {  
        return PushPayload.newBuilder()  
                .setPlatform(Platform.ios())  
                .setAudience(Audience.tag_and("tag1", "tag_all"))  
                .setNotification(Notification.newBuilder()  
                        .addPlatformNotification(IosNotification.newBuilder()  
                                .setAlert(ALERT)  
                                .setBadge(5)  
                                .setSound("happy")  
                                .addExtra("from", "JPush")  
                                .build())  
                        .build())  
                 .setMessage(Message.content(MSG_CONTENT))  
                 .setOptions(Options.newBuilder()  
                         .setApnsProduction(true)
                         .build())  
                 .build();  
    }  
      
    public static PushPayload buildPushObject_ios_audienceMore_messageWithExtras(String MSG_CONTENT) {  
        return PushPayload.newBuilder()  
                .setPlatform(Platform.android_ios())  
                .setAudience(Audience.newBuilder()  
                        .addAudienceTarget(AudienceTarget.tag("tag1", "tag2"))  
                        .addAudienceTarget(AudienceTarget.alias("alias1", "alias2"))  
                        .build())  
                .setMessage(Message.newBuilder()  
                        .setMsgContent(MSG_CONTENT)  
                        .addExtra("from", "JPush")  
                        .build())  
                .build();  
    }  
}  