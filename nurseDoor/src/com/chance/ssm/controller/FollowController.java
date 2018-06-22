package com.chance.ssm.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.Collects;
import com.chance.ssm.po.CollectsExample;
import com.chance.ssm.po.Follow;
import com.chance.ssm.po.FollowExample;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.FollowExample.Criteria;
import com.chance.ssm.po.Goods;
import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.CollectsVO;
import com.chance.ssm.po.vo.FollowUserVo;
import com.chance.ssm.po.vo.FollowVO;
import com.chance.ssm.po.vo.NurseVO;
import com.chance.ssm.service.CollectsService;
import com.chance.ssm.service.FollowService;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.SimpleMajorService;
/**
 * 收藏，关注控制类
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="follow")
public class FollowController {
	
	@Autowired
	private FollowService followService;
	
	@Autowired
	private CollectsService collectsService;
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private SimpleMajorService simpleMajorService;
	
	/**
	 * 取消收藏
	 * @param collectId 收藏ID
	 * @return
	 */
	@RequestMapping(value="delectcollectsbyid",method = RequestMethod.POST)
	public @ResponseBody NetState DelectCollectsById(String collectId)throws Exception{
		NetState netState = new NetState();
		if(collectId == null || "".equals(collectId)){
			netState.setData("收藏ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
				int i = collectsService.deleteByPrimaryKey(collectId);
				if(i > 0){
					netState.setData("取消成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("取消失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
		}
		return netState;
		
	}
	
	/**
	 * 取消关注
	 * @param followId 关注ID
	 * @return
	 */
	@RequestMapping(value="delectfollowbyid", method = RequestMethod.POST)
	public @ResponseBody NetState DelectFollowById(String followId)throws Exception{
		NetState netState = new NetState();
		 if(followId == null || "".equals(followId)){
			netState.setData("关注ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
				int i = followService.deleteByPrimaryKey(followId);
				if(i > 0){
					netState.setData("取消成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("取消失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
		}
		return netState;
		
	}
	
	/**
	 * 查询我的收藏
	 * @param userId 收藏人ID
	 * @return
	 */
	@RequestMapping(value="selectcollects", method = RequestMethod.POST)
	public @ResponseBody NetState SelectCollects(String userId, Integer pageNum)throws Exception{
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("收藏人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			//新建一个收藏实体类的List
			List<CollectsVO> cList = new ArrayList<CollectsVO>();
			CollectsExample collectsExample = new CollectsExample();
			com.chance.ssm.po.CollectsExample.Criteria criteria = collectsExample.createCriteria();
			//根据收藏人ID查询
			criteria.andCollectionUseridEqualTo(userId);
				//查询出来数据
				cList = collectsService.selectByExampleRuVO(collectsExample);
				
				//分页操作
				int num = 5;
				List<CollectsVO> paging = new ArrayList<CollectsVO>();
				if (cList == null || cList.size() <= 0) {
					netState.setData("没有数据了");
					netState.setErrorCode(NetState.SUCCESS);

				} else if ((cList.size() - (pageNum * num)) < 0) {
					netState.setData("超出范围");
					netState.setErrorCode(NetState.SUCCESS);
				} else {
					// 分页操作
					// 判断是否是最后一页
					if ((cList.size() - pageNum * num) < num) {
						for (int i = 0; i < (cList.size() - (pageNum * num)); i++) {
							paging.add(cList.get(i + pageNum * num));
						}
					} else {
						for (int i = 0; i < num; i++) {
							paging.add(cList.get(i + pageNum * num));

						}
					}
				}
				
				//获取关注的服务ID
				List<String> conteneIds = new ArrayList<String>();
				for(int i = 0; i < paging.size(); i++){
					conteneIds.add(paging.get(i).getCollectionContentid());
				}
				if(conteneIds.size() > 0){
					List<Goods> goods = new ArrayList<Goods>();
					GoodsExample goodsExample = new GoodsExample();
					com.chance.ssm.po.GoodsExample.Criteria criteria2 = goodsExample.createCriteria();
					criteria2.andGoodsContentIn(conteneIds);
					//查询三级菜单，按照金钱大小进行排序
					goodsExample.setOrderByClause("goods_isdefault asc,goods_money asc");
					goods = goodsService.selectByExample(goodsExample);
					//获取默认选项的钱数
					List<BigDecimal> moneyDefault = new ArrayList<BigDecimal>();
					Map<String,BigDecimal> moneyDefaultMap = new ConcurrentHashMap<String,BigDecimal>();
//					List<Map<String,BigDecimal>> moneyDefaultMapList = new ArrayList<Map<String,BigDecimal>>();
					if (goods.size() > 0) {
						moneyDefaultMap.put(goods.get(0).getGoodsContent(),	goods.get(0).getGoodsMoney());
						BigDecimal moneymap = new BigDecimal(0);
						for (int i = 0; i < goods.size(); i++) {

							if (goods.get(i).getGoodsIsdefault() == 0) {
								moneyDefault.add(goods.get(i).getGoodsMoney());
								String countidlist = goods.get(i).getGoodsContent();
								if(null != moneyDefaultMap.entrySet() && !"".equals(moneyDefaultMap.entrySet())){
									for(Map.Entry<String, BigDecimal> entry:moneyDefaultMap.entrySet()){    
										String countidmap = entry.getKey();
										
										if(countidlist.equals(countidmap)){
											
											moneyDefaultMap.put(countidlist, moneymap.add(goods.get(i).getGoodsMoney()));
											moneymap = entry.getValue();
										}else{
											moneyDefaultMap.put(goods.get(i).getGoodsContent(), goods.get(i).getGoodsMoney());
										}
									}   
								}
//								moneyDefault.add(goods.get(i).getGoodsMoney());
//								moneyDefaultMap.put(goods.get(i).getGoodsContent(), goods.get(i).getGoodsMoney());
							}
						}
					}
					//如果有默认选项
					if(moneyDefault.size() > 0){
						for(Map.Entry<String, BigDecimal> entry:moneyDefaultMap.entrySet()){ 
							String countidmap = entry.getKey();
							BigDecimal moneymap = entry.getValue();
							for(int j = 0; j < paging.size(); j++){
								if(countidmap.equals(paging.get(j).getCollectionContentid())){
									paging.get(j).setMinMoney(moneymap.toString());
								}
							}
						}

					}else{
					//获取最低钱数
					if(goods.size()>0){
						for (int i = 0; i < goods.size(); i++) {
							for (int j = 0; j < paging.size(); j++) {
								if(paging.get(j).getCollectionContentid().equals(goods.get(i).getGoodsContent()))
									paging.get(j).setMinMoney(goods.get(0).getGoodsMoney().toString());
							}
						}
					}
					}
				}
				
				
				if(cList.size() > 0){
					for (int i = 0; i < paging.size(); i++) {
						if (paging.get(i).getImgUrl() != null) {
							String zhuanye = paging.get(i)
									.getImgUrl().replaceAll("\\\\", "/");
							paging.get(i)
									.setImgUrl(zhuanye);
						}
					}
					
					//如果查询出来的有值
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(paging);
				}else{
					netState.setData("没有数据");
					netState.setErrorCode(NetState.DATA_NOT_FOUND);
				}
			
		}
		return netState;
		
	}
	
	/**
	 * 添加收藏
	 * @param userId 收藏人ID
	 * @param contentId 收藏的服务ID
	 * @return
	 */
	@RequestMapping(value="addcollects", method = RequestMethod.POST)
	public @ResponseBody NetState AddCollects(String userId, String contentId)throws Exception{
		NetState netState = new NetState();
		if(userId == null || "".equals(userId)){
			netState.setData("收藏人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(contentId == null || "".equals(contentId)){
			netState.setData("收藏的服务ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			Collects collects = new Collects();
			//生成关注ID
			String Id = java.util.UUID.randomUUID().toString().replaceAll("-", "");
			collects.setCollectionId(Id);
			collects.setCollectionUserid(userId);
			collects.setCollectionContentid(contentId);
			collects.setCollectionCreatime(new Date());
				int i = collectsService.insertSelective(collects);
				if(i > 0){
					netState.setData("添加成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("添加失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
		}
		return netState;
		
	}
	
	/**
	 * 查询我的粉丝
	 * @param befollowId 被关注ID（自己的ID）
	 * @return
	 */
	@RequestMapping(value="selectfollowbybefollowid", method = RequestMethod.POST)
	public @ResponseBody NetState SelectFollowByBeFollowId(String befollowId, Integer pageNum)throws Exception{
		NetState netState = new NetState();
		if(befollowId == null || "".equals(befollowId)){
			netState.setData("被关注人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			List<FollowUserVo> followVos = new ArrayList<FollowUserVo>();
			/*FollowExample followExample = new FollowExample();
			Criteria criteria = followExample.createCriteria();
			criteria.andFollowBefollowidEqualTo(befollowId);
			criteria.andFollowFollowidIdenEqualTo(1);*/
			followVos = followService.selectFollowNurseForUser(befollowId);
			//分页操作
			int num = 5;
			List<FollowUserVo> paging = new ArrayList<FollowUserVo>();
			if (followVos == null || followVos.size() <= 0) {
				netState.setData("没有数据了");
				netState.setErrorCode(NetState.SUCCESS);

			} else if ((followVos.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((followVos.size() - pageNum * num) < num) {
					for (int i = 0; i < (followVos.size() - (pageNum * num)); i++) {
						paging.add(followVos.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(followVos.get(i + pageNum * num));

					}
				}
			}
			if(followVos.size() > 0){
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			}else{
				netState.setData("没有数据");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
			}
		}
		return netState;
		
	}
	
	/**
	 * 查询我的关注
	 * @param followId 关注ID（自己的ID）
	 * @return
	 */
	@RequestMapping(value="selectfollowbyfollowid", method = RequestMethod.POST)
	public @ResponseBody NetState SelectFollowByfollowId(String followId, Integer pageNum)throws Exception{
		NetState netState = new NetState();
		if(followId == null || "".equals(followId)){
			netState.setData("关注人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(pageNum == null || "".equals(pageNum)){
			netState.setData("页数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			List<FollowVO> followList = new ArrayList<FollowVO>();
			FollowExample followExample = new FollowExample();
			Criteria criteria = followExample.createCriteria();
			criteria.andFollowFollowidEqualTo(followId);
			followList = followService.selectByExampleRuVO(followExample);
			int num = 5;
			List<FollowVO> paging = new ArrayList<FollowVO>();
			if (followList == null || followList.size() <= 0) {
				netState.setData("没有订单了");
				netState.setErrorCode(NetState.SUCCESS);

			} else if ((followList.size() - (pageNum * num)) < 0) {
				netState.setData("超出范围");
				netState.setErrorCode(NetState.SUCCESS);
			} else {
				// 分页操作
				// 判断是否是最后一页
				if ((followList.size() - pageNum * num) < num) {
					for (int i = 0; i < (followList.size() - (pageNum * num)); i++) {
						paging.add(followList.get(i + pageNum * num));
					}
				} else {
					for (int i = 0; i < num; i++) {
						paging.add(followList.get(i + pageNum * num));

					}
				}
			}
			if(followList.size() > 0){
				for (FollowVO followVO : paging) {
					String workUnit = followVO.getWorkUnit();
					//通过专业ID查询
					SimpleMajor major =simpleMajorService.selectByPrimaryKey(workUnit);
					if(major!=null && !"".equals(major)){
						followVO.setWorkUnit(major.getSimpleMajorName());
					}else{
						followVO.setWorkUnit("未选中专业");
					}
				}
				
				netState.setData("查询成功");
				netState.setErrorCode(NetState.SUCCESS);
				netState.setJson(paging);
			}else{
				netState.setData("没有数据");
				netState.setErrorCode(NetState.DATA_NOT_FOUND);
			}
		}
		return netState;
		
	}
	
	/**
	 * 添加关注 护士对护士的关注
	 * @param followId 关注人ID
	 * @param befollowId 被关注人ID
	 * @return
	 */
	@RequestMapping(value="addnursefollow", method = RequestMethod.POST)
	public @ResponseBody NetState AddNurseFollow(String followId, String befollowId)throws Exception{
		NetState netState = new NetState();
		if(followId == null || "".equals(followId)){
			netState.setData("关注人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(befollowId == null || "".equals(befollowId)){
			netState.setData("被关注人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			Follow follow = new Follow();
			//生成关注ID
			String Id = java.util.UUID.randomUUID().toString().replaceAll("-", "");
			follow.setFollowId(Id);
			follow.setFollowFollowid(followId);
			follow.setFollowBefollowidIden(1);
			follow.setFollowBefollowid(befollowId);
			follow.setFollowCreatetime(new Date());
			int i = followService.insertSelective(follow);
			if(i > 0){
				netState.setData("添加成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("添加失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		
		}
		return null;
	}
	/**
	 * 添加关注 用户对护士的关注
	 * @param followId 关注人ID
	 * @param befollowId 被关注人ID
	 * @return
	 */
	@RequestMapping(value="addfollow", method = RequestMethod.POST)
	public @ResponseBody NetState AddFollow(String followId, String befollowId,String role)throws Exception{
		NetState netState = new NetState();
		if(followId == null || "".equals(followId)){
			netState.setData("关注人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(befollowId == null || "".equals(befollowId)){
			netState.setData("被关注人ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			Follow follow = new Follow();
			//生成关注ID
			String Id = java.util.UUID.randomUUID().toString().replaceAll("-", "");
			follow.setFollowId(Id);
			follow.setFollowFollowid(followId);
			follow.setFollowFollowidIden(Integer.parseInt(role));
			follow.setFollowBefollowidIden(1);
			follow.setFollowBefollowid(befollowId);
			follow.setFollowCreatetime(new Date());
			int i = 0;
				i = followService.insertSelective(follow);
				if(i > 0){
					netState.setData("添加成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("添加失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
		}
		return netState;
		
	}
}
