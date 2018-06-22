package com.chance.ssm.po.base;

/**
 * 网络状态
 * 
 * @author God
 * 
 */
public class NetState {
	public static final int SUCCESS = 200;// 链接成功
	public static final int DATA_NOT_FOUND = 300;// 数据库未找到数据
	public static final int PARAMS_ERROR = 400;// 客户端参数错误
	public static final int SERVER_ERROR = 500;//客户端进一步操作
	private String data;// 网络状态
	private int errorCode;// 网络状态码
	private Object Json;
	
	
	public Object getJson() {
		return Json;
	}

	public void setJson(Object json) {
		Json = json;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
