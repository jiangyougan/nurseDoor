package com.chance.ssm.po.vo;

import com.chance.ssm.po.Goods;
/**
 * 产品扩展类
 * @author Administrator
 *
 */
public class GoodsVO extends Goods{
	private String serviceName;//服务名称
	
	private String contentImgurl;//图片地址
	
	private String contentNote;//备注
	
	private String iscollect;//是否已经收藏
	
	
	
	

	public String getIscollect() {
		return iscollect;
	}

	public void setIscollect(String iscollect) {
		this.iscollect = iscollect;
	}

	public String getContentImgurl() {
		return contentImgurl;
	}

	public void setContentImgurl(String contentImgurl) {
		this.contentImgurl = contentImgurl;
	}

	public String getContentNote() {
		return contentNote;
	}

	public void setContentNote(String contentNote) {
		this.contentNote = contentNote;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
}
