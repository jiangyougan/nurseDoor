package com.alipay.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：1.0
 *日期：2016-06-06
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	//合作身份者ID，签约账号，以2088开头由16位纯数字组成的字符串，查看地址：https://openhome.alipay.com/platform/keyManage.htm?keyType=partner
	public static String partner = "2088521437137427";
	//app_id
	public static String app_id = "2016121504316457";
	
	//商户的私钥,需要PKCS8格式，RSA公私钥生成：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.nBDxfy&treeId=58&articleId=103242&docType=1
	public static String private_key = "MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBAMMqZzPZOYNTeadl"+
"hWaqVXV32n0DK5ja0wQcHUR/ju13F0izkwa/35XK9wynhUZebJXW9jbamrYU1eiU"+
"hhhvvBrmMFDhes9L276WKtYI+hJyHLn+s8HHwcMyhQU4VXjdn+ufQ+dSwlm/ujts"+
"Rqosb8Ozxm0RYGHUpPLOw6Aj9UtrAgMBAAECgYEAtW5tBJFTWxe2B31kV33P9mUW"+
"U5Mn63C6LJ7qQmyG9ZD5r1dpPiQPeZR2uGffiPxs25s7xuDQZKbX+OBiDMOKzKMN"+
"90CAsGbo0lXLUzbYl8jG/eSDQrgMHszQstaf/S+mEK0OjoQw0pcXeqtryc1Y9fQm"+
"1P13ikQmJ5/hl3wuZTECQQDnSbgAWwIg9j9TJx3m/iLeypws/tklNNz97okxVwEa"+
"lycfJJHLwdkGh/PlFHOxSZ6KiVzg2a+iXA9is1q2dJYDAkEA2ASm6Wb19yL9n1+a"+
"FqpAsPyuTq7KMOTqtLbBpaQmJ4EooHJQlB5r0tcZdYM+yrRPgMcAkNB7exJ+8kmp"+
"ynDMeQJBANLBayjvxT3SBhw4jdf6hj3r9GpQBAESbbn6zgsm0/ut9tk7EpvQVXnN"+
"EuMRQucvRYfJ6dd+pbvWFbMD6kpObI8CQQCWS/ZN4qM0BhZscrnlFyPXgJdOi3KG"+
"Pl/GyHlHZERfrA+2QpMp21it45cFGgHwSzAdq1gLaeLgKGhG71XBUmYRAkEAu6lG"+
"EjhkbuQVO31HYFoN7NZA8RoIdk7jcQPa+/TI9DX/kEDHWH2F/gIPYmqc71pUYJky"+
"JYiVSOoXGVVBu5LfhA==";
	
	//支付宝的公钥，查看地址：https://openhome.alipay.com/platform/keyManage.htm?keyType=partner
	public static String alipay_public_key  = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
	
	// 商户收款账号
	public static final String SELLER = "3382876353@qq.com"; 
	// 签名方式
	public static String sign_type = "RSA";
	
	// 调试用，创建TXT日志文件夹路径，见AlipayCore.java类中的logResult(String sWord)打印方法。
	public static String log_path ="C://";
		
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";

	// 接收通知的接口名
	public static String service = "mobile.securitypay.pay";

//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
}

