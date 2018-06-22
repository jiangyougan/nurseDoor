package com.chance.ssm.po.vo;

import com.chance.ssm.po.Collects;

public class CollectsVO extends Collects {
	
	private String imgUrl;//图片地址
	
	private String contentName;//服务名称
	
	private String content;//服务详情 
	
	
	private String minMoney;//钱数
	
	

	public String getMinMoney() {
		return minMoney;
	}

	public void setMinMoney(String minMoney) {
		this.minMoney = minMoney;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
