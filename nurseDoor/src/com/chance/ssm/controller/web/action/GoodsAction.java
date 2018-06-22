package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.Goods;
import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.GoodsExample.Criteria;
import com.chance.ssm.service.GoodsService;


@Controller
public class GoodsAction {
	@Autowired
	private GoodsService goodsService;
	/**
	 * 收费项
	 * **/
	
	/**
	 * 三级菜单向上移动一位
	 * 把这条数据和上一条数据的位置进行交换
	 * @param contentid 二级菜单ID
	 * @param order 所在位置
	 * @param goodsId 三级菜单ID
	 * @param projectid 一级菜单ID
	 * @return
	 */
	@RequestMapping(value="goodsupwardone")
	public String GoodsUpwardOne(String contentid, String order, String goodsId, String projectid)throws Exception{
		
		Integer orderint = Integer.parseInt(order);
		
		if(orderint <= 1){
			return "redirect:GoodsListInfo.action?goodsContent=" + contentid+"&projectid="+projectid;
		}else{
			//查询上一位信息
			List<Goods> goodsList = new ArrayList<Goods>();
			GoodsExample goodsExample2 = new GoodsExample();
			Criteria criteria = goodsExample2.createCriteria();
			criteria.andGoodsContentEqualTo(contentid);
			//goods_order < orderint
			criteria.andGoodsOrderLessThan(orderint);
			goodsExample2.setOrderByClause("goods_order asc");
				goodsList = goodsService.selectByExample(goodsExample2);
				//获取上一位的排序,查出来List中最后一位
				int orderdown = goodsList.get(orderint-2).getGoodsOrder();
				//向下移动一位
				Goods goods = new Goods();
				goods.setGoodsOrder(orderdown);
				goods.setGoodsUpdatime(new Date());
				goods.setGoodsId(goodsId);
				//修改数据库
				int i = goodsService.updateByPrimaryKeySelective(goods);
				if(i > 0){
					if(goodsList.size() > 0){
						Goods goods2 = new Goods();
						goods2.setGoodsOrder(orderint);
						goods2.setGoodsUpdatime(new Date());
						goods2.setGoodsId(goodsList.get(goodsList.size()-1).getGoodsId());
						goodsService.updateByPrimaryKeySelective(goods2);
					}
				}
			
		}
		return "redirect:GoodsListInfo.action?goodsContent=" + contentid+"&projectid="+projectid;
		
		
	}

	/**
	 * 三级菜单下移一位
	 * 把这条数据的位置和下一位的位置进行交换
	 * @param contentid 二级菜单ID
	 * @param order 排序位置
	 * @param goodsId 三级菜单ID
	 * @return
	 */
	@RequestMapping(value="goodsdownone")
	public String GoodsDownOne(String contentid, String order, String goodsId, String projectid){
		Integer orderint = Integer.parseInt(order);
		//统计数据库中有多少条数据
		GoodsExample goodsExample = new GoodsExample();
		int countNumber = 0;
		try {
			countNumber = goodsService.countByExample(goodsExample);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(orderint >= countNumber){
			return "redirect:GoodsListInfo.action?goodsContent=" + contentid+"&projectid="+projectid;
		}else{
			//查询上一位信息
			List<Goods> goodsList = new ArrayList<Goods>();
			GoodsExample goodsExample2 = new GoodsExample();
			Criteria criteria = goodsExample2.createCriteria();
			criteria.andGoodsContentEqualTo(contentid);
			criteria.andGoodsOrderGreaterThan(orderint);
			goodsExample2.setOrderByClause("goods_order asc");
			try {
				goodsList = goodsService.selectByExample(goodsExample2);
				//获取下一位的排序
				int orderdown = goodsList.get(orderint).getGoodsOrder();
				//向下移动一位
				Goods goods = new Goods();
				goods.setGoodsOrder(orderdown);
				goods.setGoodsUpdatime(new Date());
				goods.setGoodsId(goodsId);
				//修改数据库
				int i = goodsService.updateByPrimaryKeySelective(goods);
				if(i > 0){
					if(goodsList.size() > 0){
						Goods goods2 = new Goods();
						goods2.setGoodsOrder(orderint);
						goods2.setGoodsUpdatime(new Date());
						goods2.setGoodsId(goodsList.get(0).getGoodsId());
						goodsService.updateByPrimaryKeySelective(goods2);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		}
		return "redirect:GoodsListInfo.action?goodsContent=" + contentid+"&projectid="+projectid;
		
	}
	
	//通过护理服务项id查询所有收费项
	@RequestMapping(value="/GoodsListInfo") 
	 public String CheckAdmin(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		String goodsContent = request.getParameter("goodsContent");
		String projectid = request.getParameter("projectid");
		//查询所有收费项
		List<Goods> list = goodsService.selectGoodInfoByContent(goodsContent);
		model.addAttribute("list", list);
		model.addAttribute("goodsContent", goodsContent);
		model.addAttribute("projectid", projectid);
		return "goods-list.jsp?goodsContent="+goodsContent;
	}
	//跳转到产品编辑页面 ，根据id查询数据填充到页面
	@RequestMapping(value="/UpdGoodEdit") 
	 public String UpdGoodEdit(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		//获取产品id
		String goodsContent = request.getParameter("goodsContent");
		String goodsId = request.getParameter("goodsId");
		Goods goods = goodsService.selectByPrimaryKey(goodsId);
		String goosdName = goods.getGoodsName();
		BigDecimal goodsMoney = goods.getGoodsMoney();
		Integer goodsIsdefault = goods.getGoodsIsdefault();
		
		model.addAttribute("goodsId", goodsId);
		model.addAttribute("goosdName", goosdName);
		model.addAttribute("goodsMoney", goodsMoney);
		model.addAttribute("goodsIsdefault", goodsIsdefault);
		model.addAttribute("goodsContent", goodsContent);
		return "goods-edt";
	}
	
	//修改收费项
	@RequestMapping(value="/UpdGoodInfo",method = RequestMethod.POST) 
	 public void UpdGoodInfo(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		//获取产品id和费用等信息
		String goodsContent= request.getParameter("goodsContent");
		String goodsId = request.getParameter("goodId");
		String goodsName = request.getParameter("goodsname");
		String goodsMoney = request.getParameter("cost");
		String goodsIsdefault = request.getParameter("goodsIsdefault");
		PrintWriter out = response.getWriter();
		
		Goods goods = new Goods();
		goods.setGoodsId(goodsId);
		goods.setGoodsName(goodsName);
		goods.setGoodsMoney(new BigDecimal(goodsMoney));
		goods.setGoodsIsdefault(Integer.parseInt(goodsIsdefault));
		goods.setGoodsUpdatime(new Date());
		int i = goodsService.updateByPrimaryKeySelective(goods);
		if(i>0){
			//model.addAttribute("errorcode", 200);
			out.print(1);
		}else{
			//model.addAttribute("errorcode", 400);
			out.print(0);
		}
		out.print(1);
		//model.addAttribute("errorcode", 200);
		//return "redirect:GoodsListInfo.action?goodsContent="+goodsContent;
	}
	//去添加产品页面 
	@RequestMapping(value="/GoodGotoInfo") 
	 public String GoodGotoInfo(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		String contentid = request.getParameter("contentid");
		model.addAttribute("contentid", contentid);
		return "goods-add";
	}
	//添加收费项
	@RequestMapping(value="/InsertGoodInfo",method = RequestMethod.POST) 
	 public String InsertGoodInfo(HttpServletResponse response,Model model,HttpServletRequest request,HttpSession session)throws Exception{
		//获取产品id和费用等信息
		String contentid= request.getParameter("contentid");
		//产品名称
		String goodsName = request.getParameter("goodsname");
		String goodsMoney = request.getParameter("cost");
		//是否默认
		String goodsIsdefault = request.getParameter("required");
		if(goodsIsdefault=="on" || "on".equals(goodsIsdefault)){
			goodsIsdefault="0";
		}else{
			goodsIsdefault="1";
		}
		//根据二级服务ID得到有几个产品
		List<Goods> list = goodsService.selectGoodInfoByContent(contentid);
		Integer goodsorder = 0;
		if(list.size()>0){
			goodsorder =list.size()+1; 
		}else{
			//得到产品排行最大的数据
			Goods goods1 = list.get(list.size()-1);
			goodsorder = goods1.getGoodsOrder()+1;
		}
		
		PrintWriter out = response.getWriter();
		
		Goods goods = new Goods();
		String goodsId= java.util.UUID.randomUUID().toString().replaceAll("-", "");
		goods.setGoodsId(goodsId);
		goods.setGoodsContent(contentid);
		goods.setGoodsName(goodsName);
		goods.setGoodsMoney(new BigDecimal(goodsMoney));
		goods.setGoodsIsdefault(Integer.parseInt(goodsIsdefault));
		goods.setGoodsOrder(goodsorder);
		goods.setGoodsCreatetime(new Date());
		int i = goodsService.insertSelective(goods);
		if(i>0){
			model.addAttribute("errorcode", i);
			out.print(1);
		}else{
			model.addAttribute("errorcode", i);
			out.print(0);
		}
		request.setCharacterEncoding("UTF-8");  
	    response.setCharacterEncoding("UTF-8");  
	    response.setContentType("text/html; charset=UTF-8");  
		model.addAttribute("errorcode", i);
		model.addAttribute("goodsContent", contentid);
		
		return "goods-add";
	}
	//删除收费项
	@RequestMapping(value="/delNursingGoodsListInfo",method = RequestMethod.POST) 
	 public void delNursingGoodsListInfo(HttpServletResponse response,Model model,HttpServletRequest request,HttpSession session,String goodsId,String contentId)throws Exception{
		PrintWriter out = response.getWriter();
		int i= goodsService.deleteByPrimaryKey(goodsId);
		if(i>0){
			//根据二级服务ID得到所有的产品
			 //根据二级产品ID得到三级产品信息(默认优先,钱少其次)
		    List<Goods> goodslit= goodsService.selectGoodsMoneyByOther(contentId);
		    int order = 1;
		    for (int j = 0; j < goodslit.size(); j++) {
		    	Goods goods = new Goods();
				goods.setGoodsId(goodslit.get(j).getGoodsId());
				goods.setGoodsOrder(order);
				goodsService.updateByPrimaryKeySelective(goods);
				order++;
			}
			out.print(0);
		}else{
			out.print(1);
		}
	}
	//产品上架下架
	//修改收费项
	@RequestMapping(value="/goodsUpAndDown",method = RequestMethod.GET) 
	 public String goodsUpAndDown(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session,String goodsId,String state,String goodsContent)throws Exception{
		Goods goods1 = new Goods();
		goods1.setGoodsId(goodsId);
		goods1.setGoodsNote(state);
		goods1.setGoodsUpdatime(new Date());
		goodsService.updateByPrimaryKeySelective(goods1);
		return "redirect:GoodsListInfo.action?goodsContent="+goodsContent;
	}
}
