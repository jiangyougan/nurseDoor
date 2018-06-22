package com.smsclient.test.com.ruanwei.interfacej;

import com.smsclient.src.com.ruanwei.interfacej.SmsClientKeyword;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientOverage;
import com.smsclient.src.com.ruanwei.interfacej.SmsClientSend;
import com.smsclient.src.com.ruanwei.tool.SmsClientAccessTool;


public class Test {

	public static String url = "http://115.29.242.32:8888/sms.aspx";
	public static String userid = "1724";
	public static String account = "CHSL";
	public static String password = "880890";
	public static String checkWord = "这个字符串中是否包含了屏蔽字";

	public static void main(String[] args) {

		//keyword();
		// overage();
		sms();
		//test();
	}

	public static void keyword() {

		String keyword = SmsClientKeyword.queryKeyWord(url, userid, account,
				password, checkWord);
		System.out.println(keyword);
	}

	public static void overage() {

		String overage = SmsClientOverage.queryOverage(url, userid, account,
				password);
		System.out.println(overage);
	}

	public static void test() {
		String send = SmsClientAccessTool.getInstance().doAccessHTTPPost(
				"http://115.29.242.32/sms.aspx", "", "utf-8");
		System.out.println(send);
	}
	public static void sms(){
		String sms = SmsClientSend.sendSms(url, userid, account, password, "13867156117", "【小护健康】你好,您咨询的小护健康", null, null, "0",  null,  null,  null,  null, null,  null, null);
		System.out.println("sms="+sms);
	}
}
