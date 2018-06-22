package com.chance.ssm.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.NurseNofree;
import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.NurseNoFreeVo;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.ManageNursingContentService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.service.OrderSendService;
import com.chance.ssm.service.ProtectedAddressService;
import com.chance.ssm.service.ProtectedPersonService;
/**
 * 富文本测试类
 * @author Administrator
 *
 */
@Controller
public class UeditorTest {
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private ManageNursingContentService manageNursingContentService;
	
	@Autowired
	private ProtectedPersonService protectedPersonService;
	
	@Autowired
	private ProtectedAddressService protectedAddressService;
	
	public List<OrderSend> orderLookReceiver(String nurseId,Integer pageNum
			)throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time  = sdf.parse(sdf.format(400000)); //日期格式
		NetState netState = new NetState();
		if("".equals(nurseId)|| nurseId==null){
			netState.setData("参数1错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return null;
		}else if("".equals(pageNum) || pageNum==null){
			netState.setData("参数2错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return null;
		}
		String newcontentid ="";
		String goodsName = "";
		String newgoosName = "";
		Goods goods = null;
		//得到详细地址描述
		String addressString = "";
		//得到受护人id
		String orderSendUserName = "";
		//通过受护id查询经纬度
		Double addressPositionX = null;
		Double addressPositionY = null;
		//服务产品信息
		String[] contentid =null;
		//二级服务名
		String contentname="";
		
		//得到受护人的名字、性别可年龄
		String neworderSendUserName = "";
		
		ManageNursingContent manageNursingContent = new ManageNursingContent();
		
		ProtectedPerson protectedPerson = new ProtectedPerson();
		
		ProtectedAddress protectedAddress = new ProtectedAddress();
		//新建专属单list
		List<OrderSend> spelist = new ArrayList<OrderSend>();
		//新建所有订单list
		List<OrderSend> ordlist = new ArrayList<OrderSend>();
		//总list
		List<OrderSend> newlist = new ArrayList<OrderSend>();
		//获取护士的空闲时间
		List<NurseNoFreeVo> freelist = nurseService.selectNurseFreeInfo(nurseId);
		if(freelist==null || "".equals(freelist) || freelist.size()==0){
			//判断有没有我的专属单
			spelist = orderSendService.selectSpecialOrderInfo(nurseId);
			//获取所有可接订单
			ordlist = orderSendService.selectCanAccessAllOrder();
			//变成一个list
			newlist.addAll(spelist);
			newlist.addAll(ordlist);
			int size = newlist.size();
			for(int i=0;i<size;i++){
				contentid= newlist.get(i).getOrderSendServicecontent().split(",");
				for(int c =0; c<contentid.length;c++){
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						contentname = manageNursingContent.getManageNursingContentName();
    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
    					newlist.get(i).setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						newlist.get(i).setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
				orderSendUserName = newlist.get(i).getOrderSendUsername();
				if(orderSendUserName!=null && !"".equals(orderSendUserName)){
					//通过受护人id得到受护人信息
					protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserName);
					if(protectedPerson == null && "".equals(protectedPerson)){
						newlist.get(i).setOrderSendUsername("没有该受护人信息");
					}else{
						//得到受护人的名字、性别可年龄
						neworderSendUserName = orderSendUserName+","+protectedPerson.getProtectedPersonName();
						newlist.get(i).setOrderSendUsername(neworderSendUserName);
						newlist.get(i).setOrderSendSex(protectedPerson.getProtectedPersonSex());
						newlist.get(i).setOrderSendAge(protectedPerson.getProtectedPersonAge());
						//通过受护人地址id得到受护人地址信息
						protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
						if(protectedAddress==null || "".equals(protectedAddress)){
							newlist.get(i).setOrderSendAddree("经纬度为空");
						}else{
							addressString = protectedAddress.getProtectedAddressAddress();
							//通过受护id查询经纬度
							addressPositionX = protectedAddress.getProtectedAddressPositionX();
							addressPositionY = protectedAddress.getProtectedAddressPositionY();
							newlist.get(i).setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
						}
					}
				}else{
					newlist.get(i).setOrderSendUsername("受护人信息为空");
				}
			}
		}else{
			int freesize = freelist.size();
			SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
			for (int i = 0; i < freesize; i++) {
				//得到该排班的日期
				Date nofreetime = freelist.get(i).getNurseNofreeDate();
				//date转String
		    	String startTime = sdff.format(nofreetime);
		    	
		    	String begintime = startTime+" "+freelist.get(i).getNurseNofreeShiftBegintime();
		    	String stoptime = startTime+" "+freelist.get(i).getNurseNofreeShiftStoptime();
		    	//String 转date
		    	DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				Date freebeginTime = fmt.parse(begintime);
				Date freestopTime = fmt.parse(stoptime);
				
				//判断有没有我的专属单
				spelist = orderSendService.selectSpecialOrderInfo(nurseId);
				//获取所有可接订单
				ordlist = orderSendService.selectCanAccess(freebeginTime,freestopTime);
				//获取受护人的经纬度
			}
			//将两个list变成一个list
			newlist.addAll(spelist);
			newlist.addAll(ordlist);
			int size = newlist.size();
			for(int i=0;i<size;i++){
				//服务产品信息
            	contentid = newlist.get(i).getOrderSendServicecontent().split(",");
//			
				for(int c =0; c<contentid.length;c++){
					goods = goodsService.selectByPrimaryKey(contentid[c]);
					if(goods!=null){
						newcontentid = goods.getGoodsContent();
						goodsName = goods.getGoodsName();
						newgoosName+=goodsName+",";
					}
				}
				if(newcontentid!= null || !"".equals(newcontentid)){
					manageNursingContent = manageNursingContentService.selectmanageNursingContentById(newcontentid);
					if(manageNursingContent!=null){
						contentname =manageNursingContent.getManageNursingContentName();
    					newgoosName = newgoosName.substring(0, newgoosName.length()-1);
    					newlist.get(i).setOrderSendServicecontent(contentname+":"+newgoosName);
					}else{
						newlist.get(i).setOrderSendServicecontent("该服务不存在"+":"+newgoosName);
					}
				}
				//得到受护人id
				orderSendUserName = newlist.get(i).getOrderSendUsername();
				if(orderSendUserName!=null && !"".equals(orderSendUserName)){
					//通过受护人id得到受护人信息
					protectedPerson = protectedPersonService.selectByPrimaryKey(orderSendUserName);
					if(protectedPerson == null && "".equals(protectedPerson)){
						newlist.get(i).setOrderSendUsername("没有该受护人信息");
					}else{
						//得到受护人的名字、性别可年龄
						neworderSendUserName = orderSendUserName+","+protectedPerson.getProtectedPersonName();
						newlist.get(i).setOrderSendUsername(neworderSendUserName);
						newlist.get(i).setOrderSendSex(protectedPerson.getProtectedPersonSex());
						newlist.get(i).setOrderSendAge(protectedPerson.getProtectedPersonAge());
						//通过受护人地址id得到受护人地址信息
						protectedAddress = protectedAddressService.selectByPrimaryKey(protectedPerson.getProtectedAddressId());
						if(protectedAddress==null || "".equals(protectedAddress)){
							newlist.get(i).setOrderSendAddree("经纬度为空");
						}else{
							//得到详细地址描述
							addressString = protectedAddress.getProtectedAddressAddress();
							//通过受护id查询经纬度
							addressPositionX = protectedAddress.getProtectedAddressPositionX();
							addressPositionY = protectedAddress.getProtectedAddressPositionY();
							newlist.get(i).setOrderSendAddree(addressPositionX+","+addressPositionY+","+addressString);
						}
					}
				}else{ 
					newlist.get(i).setOrderSendUsername("受护人信息为空");
				}
			}
		}
			// 每页多少条
		int num = 5;
		List<OrderSend> paging = new ArrayList<OrderSend>();
		if (newlist == null || newlist.size()<=0 ) {
			netState.setData("没有订单了");
			netState.setErrorCode(NetState.SUCCESS);

		} else if ((newlist.size() - (pageNum * num)) < 0) {
			netState.setData("超出范围");
			netState.setErrorCode(NetState.SUCCESS);
		} else {
			// 分页操作
			// 判断是否是最后一页
			if ((newlist.size() - pageNum * num) < num) {
				for (int i = 0; i < (newlist.size() - (pageNum * num)); i++) {
					paging.add(newlist.get(i + pageNum * num));
				}
			} else {
				for (int i = 0; i < num; i++) {
					paging.add(newlist.get(i + pageNum * num));
					
				}
			}
		}
		
	return paging;
	}

}
