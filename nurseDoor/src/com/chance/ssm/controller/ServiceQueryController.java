package com.chance.ssm.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.chance.ssm.po.*;
import com.chance.ssm.po.Package;
import com.chance.ssm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.NurseNofreeExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.NurseNoFreeVo;
import com.chance.ssm.po.vo.ProtectedPersonVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 查询护士服务控制类
 * 
 * @author Administrator
 */
@Controller
@RequestMapping("service")
public class ServiceQueryController {
	@Autowired
	private SaveService saveService;

	@Autowired
	private PackageService packageService;

	@Autowired
	private ProtectedPersonService personService;

	@Autowired
	private ManageNursingContentService mContentService;

	@Autowired
	private NurseNofreeService nofreeService;

	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private OrderSendService orderSendService;
	
	@Autowired
	private CollectsService collectsService;

	/**
	 * 通过服务ID和用户ID查询服务的内容和用户服务的信息,
	 * 
	 * @param contentId
	 *            服务ID
	 * @param userid
	 *            用户ID
	 * @param nurseid
	 *            护士ID当选择护士的时候有护士ID，没有选择护士的时候没有护士ID
	 * @return
	 */
	@RequestMapping(value = "selectservicebycontentid", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectServiceByContentId(String contentId, String userid,
			String nurseid) throws Exception{
		NetState netState = new NetState();
		if (contentId == null || "".equals(contentId)) {
			netState.setData("服务ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else if (userid == null || "".equals(userid)) {
			netState.setData("用户ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {

				ProtectedPersonVO protectedPersons = new ProtectedPersonVO();

				// 查询被护人信息
				ProtectedPersonExample personExample = new ProtectedPersonExample();
				com.chance.ssm.po.ProtectedPersonExample.Criteria criteria = personExample
						.createCriteria();
				criteria.andProtectedUserIdEqualTo(userid);
				// 统计受护人的个数
				int number = personService.countByExample(personExample);
				if (number > 1) {
					criteria.andProtectedDefaultEqualTo(1);
				}
				protectedPersons = personService
						.selectByExampleRuVO(personExample);
				
				if(protectedPersons==null || "".equals(protectedPersons)){//如果没有受护人
					ProtectedPersonVO personVO = new ProtectedPersonVO();
					// 查询服务信息
					ManageNursingContentWithBLOBs manageNursingContent = new ManageNursingContentWithBLOBs();
					manageNursingContent = mContentService
							.selectByPrimaryKeyBLOB(contentId);
					if (manageNursingContent != null && !"".equals(manageNursingContent)) {
						String serviceName = manageNursingContent.getManageNursingContentName();
						

						personVO.setContentId(manageNursingContent.getManageNursingContentId());
						personVO.setServiceName(serviceName);
						if(manageNursingContent.getContentImgurl()!=null){
						if (manageNursingContent.getContentImgurl().length()>0) {
							String zhuanye = manageNursingContent
									.getContentImgurl().replaceAll("\\\\", "/");
							personVO.setImgurls(zhuanye);
						}
						}
					}
					// 查询护士的服务产品
					GoodsExample goodsExample = new GoodsExample();
					com.chance.ssm.po.GoodsExample.Criteria criteria3 = goodsExample
							.createCriteria();
					criteria3.andGoodsContentEqualTo(contentId);
					goodsExample.setOrderByClause("goods_isdefault asc,goods_money asc");
					List<Goods> gList = new ArrayList<Goods>();
					gList = goodsService.selectByExample(goodsExample);
					//获取默认值的钱数
					List<BigDecimal> moneyDefault = new ArrayList<BigDecimal>();
					for(int i = 0; i < gList.size(); i++){
						if(gList.get(i).getGoodsIsdefault()==0){
							moneyDefault.add(gList.get(i).getGoodsMoney());
						}
					}
					BigDecimal minMoney = BigDecimal.ZERO;
					if (moneyDefault.size() > 0) {
						// BigDecimal newmoneyDefault = new BigDecimal(0);
						for (int i = 0; i < moneyDefault.size(); i++) {
							minMoney = minMoney.add(moneyDefault.get(i));
						}
					} else {
						if (gList.size() > 0) {
							minMoney = minMoney.add(gList.get(0).getGoodsMoney());
						}
					}
//					for (int i = 0; i < gList.size(); i++) {
//						if (gList.get(i).getGoodsIsdefault() == 0) {
//							minMoney = minMoney.add(gList.get(i).getGoodsMoney());
//						}
//					}
					personVO.setServiceMoney(minMoney.toString());
					// 如果护士的ID不等于null 则查询护士的空闲时间
					if (nurseid != null) {
//						NurseNofreeExample nofreeExample = new NurseNofreeExample();
//						Criteria criteria2 = nofreeExample.createCriteria();
//						criteria2.andNurseNofreeNurseidEqualTo(nurseid);
						//criteria2.andNurseNofreeBegintimeGreaterThan(new Date());
						List<NurseNofree> nurseNofreeList = new ArrayList<NurseNofree>();
						NurseNoFreeVo nurseNofree = new NurseNoFreeVo();
						//通过护士ID查询最近的一次空闲时间
						nurseNofree = nofreeService
								.selectByExampleOne(nurseid);
						if (nurseNofree != null) {
							SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
							//得到该排班的日期
							Date nofreetime = nurseNofree.getNurseNofreeDate();
							//date转String
					    	String startTime = sdff.format(nofreetime);
					    	
					    	String begintime = startTime+" "+nurseNofree.getNurseNofreeShiftBegintime();
					    	String stoptime = startTime+" "+nurseNofree.getNurseNofreeShiftStoptime();
					    	//String 转date
					    	DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							
							Date freebeginTime = fmt.parse(begintime);
							Date freestopTime = fmt.parse(stoptime);
							personVO.setNurseId(nurseid);
							personVO.setNurseNofreeBbegintime(Long
									.toString(freebeginTime.getTime()));
							personVO.setNurseNofreeStoptime(Long
									.toString(freestopTime.getTime()));
						}
					}

					// 查询交通费
					Traffic traffic = new Traffic();
					traffic = orderSendService.SelectTrafficInfo();
					BigDecimal trafficCost = traffic.getTrafficCost();
					// 查询保险信息
					SaveExample sExample = new SaveExample();
					List<Save> sList = new ArrayList<Save>();
					sList = saveService.selectByExample(sExample);
					if (sList.size() > 0) {
						personVO.setSaveID(sList.get(0).getSaveId());
						personVO.setSaveCost(sList.get(0).getSaveCost());
						personVO.setSaveLogo(sList.get(0).getSaveLogo());
						personVO.setSaveUrl(sList.get(0).getSaveUrl());
						personVO.setSaveInfo(sList.get(0).getSaveInfo());
					}
					
					//查询收藏表中有没有，然后判断有没有被收藏
					List<Collects> collects = new ArrayList<Collects>();
					CollectsExample collectsExample = new CollectsExample();
					com.chance.ssm.po.CollectsExample.Criteria criteria5 = collectsExample.createCriteria();
					criteria5.andCollectionUseridEqualTo(userid);
					criteria5.andCollectionContentidEqualTo(contentId);
					collects = collectsService.selectByExample(collectsExample);
					if(collects.size() > 0){
						personVO.setIscollect("1");
					}else{
						personVO.setIscollect("0");
					}
		
					
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(personVO);
					return netState;
				}
				
				//有守护人
				// 查询服务信息
				ManageNursingContentWithBLOBs manageNursingContent = new ManageNursingContentWithBLOBs();
				manageNursingContent = mContentService
						.selectByPrimaryKeyBLOB(contentId);
				if (manageNursingContent != null && !"".equals(manageNursingContent)) {
					String serviceName = manageNursingContent.getManageNursingContentName();
					

					protectedPersons.setContentId(manageNursingContent.getManageNursingContentId());
					protectedPersons.setServiceName(serviceName);
					if(manageNursingContent.getContentImgurl()!=null){
					if (manageNursingContent.getContentImgurl().length()>0) {
						String zhuanye = manageNursingContent
								.getContentImgurl().replaceAll("\\\\", "/");
						protectedPersons.setImgurls(zhuanye);
					}
					}
				}

				// 查询护士的服务产品
				GoodsExample goodsExample = new GoodsExample();
				com.chance.ssm.po.GoodsExample.Criteria criteria3 = goodsExample
						.createCriteria();
				criteria3.andGoodsContentEqualTo(contentId);
				goodsExample.setOrderByClause("goods_isdefault asc,goods_money asc");
				List<Goods> gList = new ArrayList<Goods>();
				gList = goodsService.selectByExample(goodsExample);
				//获取默认值的钱数
				List<BigDecimal> moneyDefault = new ArrayList<BigDecimal>();
				for(int i = 0; i < gList.size(); i++){
					if(gList.get(i).getGoodsIsdefault()==0){
						moneyDefault.add(gList.get(i).getGoodsMoney());
					}
				}
				BigDecimal minMoney = BigDecimal.ZERO;
				if (moneyDefault.size() > 0) {
					// BigDecimal newmoneyDefault = new BigDecimal(0);
					for (int i = 0; i < moneyDefault.size(); i++) {
						minMoney = minMoney.add(moneyDefault.get(i));
					}
				} else {
					if (gList.size() > 0) {
						minMoney = minMoney.add(gList.get(0).getGoodsMoney());
					}
				}
//				for (int i = 0; i < gList.size(); i++) {
//					if (gList.get(i).getGoodsIsdefault() == 0) {
//						minMoney = minMoney.add(gList.get(i).getGoodsMoney());
//					}
//				}
				protectedPersons.setServiceMoney(minMoney.toString());
				// 如果护士的ID不等于null 则查询护士的空闲时间
				if (nurseid != null) {
//					NurseNofreeExample nofreeExample = new NurseNofreeExample();
//					Criteria criteria2 = nofreeExample.createCriteria();
//					criteria2.andNurseNofreeNurseidEqualTo(nurseid);
//
//					criteria2.andNurseNofreeBegintimeGreaterThan(new Date());

					List<NurseNofree> nurseNofreeList = new ArrayList<NurseNofree>();

					NurseNoFreeVo nurseNofree = new NurseNoFreeVo();
					nurseNofree = nofreeService
							.selectByExampleOne(nurseid);
					
					if (nurseNofree != null) {
						SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
						//得到该排班的日期
						Date nofreetime = nurseNofree.getNurseNofreeDate();
						//date转String
				    	String startTime = sdff.format(nofreetime);
				    	
				    	String begintime = startTime+" "+nurseNofree.getNurseNofreeShiftBegintime();
				    	String stoptime = startTime+" "+nurseNofree.getNurseNofreeShiftStoptime();
				    	//String 转date
				    	DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						
						Date freebeginTime = fmt.parse(begintime);
						Date freestopTime = fmt.parse(stoptime);
						
						protectedPersons.setNurseId(nurseid);
						protectedPersons.setNurseNofreeBbegintime(Long
								.toString(freebeginTime
										.getTime()));
						protectedPersons.setNurseNofreeStoptime(Long
								.toString(freestopTime
										.getTime()));
					}
				}
				BigDecimal trafficCost = BigDecimal.ZERO;
				// 查询交通费
				Traffic traffic = new Traffic();
				traffic = orderSendService.SelectTrafficInfo();
				if(traffic!=null && !"".equals(traffic)){
					trafficCost = traffic.getTrafficCost();
				}
				
				// 查询保险信息
				SaveExample sExample = new SaveExample();
				List<Save> sList = new ArrayList<Save>();
				sList = saveService.selectByExample(sExample);
				if (sList.size() > 0) {
					protectedPersons.setSaveID(sList.get(0).getSaveId());
					protectedPersons.setSaveCost(sList.get(0).getSaveCost());
					protectedPersons.setSaveLogo(sList.get(0).getSaveLogo());
					protectedPersons.setSaveUrl(sList.get(0).getSaveUrl());
					protectedPersons.setSaveInfo(sList.get(0).getSaveInfo());
				}
				
				//查询收藏表中有没有，然后判断有没有被收藏
				List<Collects> collects = new ArrayList<Collects>();
				CollectsExample collectsExample = new CollectsExample();
				com.chance.ssm.po.CollectsExample.Criteria criteria5 = collectsExample.createCriteria();
				criteria5.andCollectionUseridEqualTo(userid);
				criteria5.andCollectionContentidEqualTo(contentId);
				collects = collectsService.selectByExample(collectsExample);
				if(collects.size() > 0){
					protectedPersons.setIscollect("1");
				}else{
					protectedPersons.setIscollect("0");
				}
				
				// protectedPersons.setSaves(sList);
				protectedPersons.setTrafficCost(trafficCost);
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(protectedPersons);

		}
		return netState;

	}

	/**
	 * 根据服务ID查询套餐
	 * 
	 * @param contentId
	 *            服务Id
	 * @return
	 */
	@RequestMapping(value = "selectpackagebycontentid", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectPackageByContentId(String contentId) {
		NetState netState = new NetState();
		if (contentId == null || "".equals(contentId)) {
			netState.setData("服务ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			PackageExample packageExample = new PackageExample();
			com.chance.ssm.po.PackageExample.Criteria criteria = packageExample
					.createCriteria();
			// 根据ID进行查询
			criteria.andPackageManursingContentEqualTo(contentId);
			// 按照时间排序
			packageExample.setOrderByClause("package_createtime asc");
			List<Package> packages = new ArrayList<Package>();
			try {
				packages = packageService.selectByExample(packageExample);
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(packages);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;

	}

	/**
	 * 根据服务ID查询服务内容
	 * 
	 * @param contentId
	 *            服务ID
	 * @return
	 */
	@RequestMapping(value = "selectcontentbyid", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectContentById(String contentId) {
		NetState netState = new NetState();
		if (contentId == null || "".equals(contentId)) {
			netState.setData("服务ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			try {
				// 查询服务信息
				ManageNursingContent manageNursingContent = new ManageNursingContent();
				manageNursingContent = mContentService
						.selectByPrimaryKey(contentId);

				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(manageNursingContent);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;

	}

	/**
	 * 查询所有的保险信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "selectsaveall", method = RequestMethod.POST)
	public @ResponseBody
	NetState selectsaveall() {
		NetState netState = new NetState();
		SaveExample saveExample = new SaveExample();
		List<Save> saves = new ArrayList<Save>();
		try {
			// 查询所有的保险
			saves = saveService.selectByExample(saveExample);
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(saves);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return netState;

	}

	/**
	 * todo 通过服务项详细id 查询护理服务内容 make传入参数为"content" 返回服务内容 make传入参数为"forpeople"
	 * 返回适用人群 make传入参数为"look" 返回注意事项
	 * 
	 * @param request
	 * @param mNursingContentId
	 *            服务项详细id
	 * @param make
	 *            标志(content,forpeople,look)
	 * @return
	 */
	@RequestMapping(value = "selectContentContent", method = RequestMethod.POST)
	public String selectContentContent(HttpServletRequest request,
			String mNursingContentId, String make) {
		try {
			ManageNursingContent manageNursingContent = new ManageNursingContent();
			manageNursingContent = mContentService
					.selectByPrimaryKey(mNursingContentId);
			if (manageNursingContent == null) {
				request.setAttribute("error", "找不到数据");
				return "error";
			}
			request.setAttribute("manageNursingContent", manageNursingContent);
			request.setAttribute("make", make);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "selectcontent";
	}

	// //护理服务id
	// // 服务详情选择
	// //ContentChoice
	// @RequestMapping(value = "ContentChoice", method = RequestMethod.POST)
	// public @ResponseBody NetState ContentChoice(String projectId) {
	// NetState netState = new NetState();
	// ManageNursingProjectExample example = new ManageNursingProjectExample();
	// example.createCriteria().andManageNursingProjectIdEqualTo(projectId);
	//
	// SaveExample saveExample = new SaveExample();
	// List<Save> saves = new ArrayList<Save>();
	// try {
	// saves = saveService.selectByExample(saveExample);
	// netState.setData("查询成功");
	// netState.setErrorCode(NetState.SUCCESS);
	// netState.setJson(saves);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return netState;
	//
	// }
}
