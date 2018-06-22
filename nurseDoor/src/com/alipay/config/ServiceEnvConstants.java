package com.alipay.config;

/**
 * 支付宝环境变量
 * 2018-06-22 10:17:39
 */
public class ServiceEnvConstants {

    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "utf-8";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "utf-8";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA2";
    
    /** 合作伙伴Id  */
    public static final String PARTNER           = "2088921132566379";

    /** 应用appId  */
    public static final String APP_ID            = "2018062060391770";

    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
    
    /**私钥*/
    public static final String PRIVATE_KEY 			= "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDB6ZvsKM5MG4X0/D9fD2dWrk1XIi99qaA/kUcXH5AURWOfoPoA9Q69FURoF6rSj5xV5cW+fpX+3R3kYgNpgrFTEQBtbCc8yf2Og+J9B+gd+Qg8mWTpkOx3xfa99U32YQJuXgfwhDn/2U6itV6As+Vt1GHO6BRpBW2CxCu+nyQlK6LDSht9IIbkjoA+6icq7h3baNl98NR+h92gVTIxRhYxxnMWlFNzMjEumrLlncJxFB1IInZX5JLuWorgsqnl0edDnImOkoG33AutxJ8MQhAPE8J3JV0AyeH8rMHgeQ/Zd4S+UKt/7OizVeR7GhDxJam1XJ4iHx+5IYBOfpTBzpTZAgMBAAECggEBAME6os9v0jLw8kmv2w5E8TrlMdh0DlLwZukxQV//ablpc96rsLSnfepZePMpMmXkCWtnLeeniJyRhqoAKVpIi580v/JJ5cejmHEdZuIksN69O8H3MSG18o1fzYJ5IRk0jhGgzdSUTp9u0fc9OFCT8znAez6M8Vm9uOSnyteHCaOm3OfQnIO0k43jR4sZirvGssc7LTGLOFKMkXSUApF9ctT5N9XRUUk+HRKe4jm96RJ8isE7GgNT8WFvH4L8PKCRBtufNGcMHcVxn0SVIGEkoqwdQAar6SIfu5bOVZm9TYH9Dt7BoCRR//1kqKMiwLHlYAlwR7fbi3wcqDrbf6aL1SkCgYEA7exa7ht4W2902B1c8BUYqYGO7PbHaltix+gjXgsrFgTCWhCyM7BYgXWDIsHhX2dpwLz/TWZoRBwWsKQunMZRToeFR2SasWPhaIwJC2CJ5lKexBYvOIMzGbQl2z7KBGN33FxC4/RmL82Pkn0BuaLCGL8/H4/KcbHiSHJWQtHImHMCgYEA0KU9Avs/EcWPHDl5n6Z19gBnm2WMzZC0oK3lHBM6BbmUVc10RfacyrKXxHoh32cAmslJI9J0eRLZX6A/6EmaxNMN06pwuCKu9GyQae3ypnfFXHGNHFI28nfjh3IXYfRqq6sw/kjCmGEqh/7RmeuWuv8ROGMjBBDjvVSOw3f6poMCgYEAwM4Zvf1K4qYGxR++cdxWuP6ByWwOnBTkjuWCy7I3P0eqC/ydvJ96iaamF2OQdJTEMWm3ZozHj/JHPOw/zdI0j3PpQLq5VWmAgA2DQtH/zkND39mueJhxr7G6P9q5MSc+ObgWiM5EhRaK84YUANBxhEZvK++Fee9SVa06VDnW2hsCgYEAuokAYwn8+QaHS9SWyAUqsSTrfCLuH1qgIodVriQCW9vuokdtDJ/Ozemdhisq3XBZOgl7OmuNdjFD5hp/CE3F8PJAClz3KajYge4Nrqbtqaaq7FsYrZlTRrOo2A9ImGrMc245/x1N3K4COFO5UMMvnz8rRh5bz+bJtRtEB73cecECgYARZrRhprog72Fx/TGrgsImX6xRUqCCWqWrmWJuxAb4eeZwLPbJ5I6OgjMFm+xtKY69AXoDt0wW8tNTowUGoj+ttL0S6FaE9IHOUSnnc25gDa8gwepeZGaqRGu/hcBFs4NdN4/VTWN55waIG2wl2852MpOvuNyBCdkYzK5qZX0faw==";

    /**公钥*/
	public static final String PUBLIC_KEY        	= "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwemb7CjOTBuF9Pw/Xw9nVq5NVyIvfamgP5FHFx+QFEVjn6D6APUOvRVEaBeq0o+cVeXFvn6V/t0d5GIDaYKxUxEAbWwnPMn9joPifQfoHfkIPJlk6ZDsd8X2vfVN9mECbl4H8IQ5/9lOorVegLPlbdRhzugUaQVtgsQrvp8kJSuiw0obfSCG5I6APuonKu4d22jZffDUfofdoFUyMUYWMcZzFpRTczIxLpqy5Z3CcRQdSCJ2V+SS7lqK4LKp5dHnQ5yJjpKBt9wLrcSfDEIQDxPCdyVdAMnh/KzB4HkP2XeEvlCrf+zos1XkexoQ8SWptVyeIh8fuSGATn6Uwc6U2QIDAQAB";

	 /**支付宝公钥*/
	public static final String ALIPAY_PUBLIC_KEY 	= "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApCTLFRsIRhadqOVWaOLZkkr1wJcKEqOjLRKlUZu0wjGoFZGPfLPZcJfWsI84fSDe370xxTfxZZY6wiuPsrOPOIKg4jA26lIBuNoFdyvWhU4tJ8wgPmxiZVm1wCv7rUpcWDGKdag6pD35BNvtzmqNMUi9YM2j6+kZvjtlYQvfnKCeb+3nRzrH2GY0zIVKkUFQIBd5/53Xi7z1dod/ENHpISUbfBw4peYVnHHIDlhwPTRzSEQefrTd8Tzd2ypcBwmIcYwF2TsxdT38HOWWcpPg+eG3yrVfo7ZThnU5jU1C9Qbc+kSe9qFfUgKPQZfWKT2BlBkPOWlits2j7JheSbDzjwIDAQAB";

    
}