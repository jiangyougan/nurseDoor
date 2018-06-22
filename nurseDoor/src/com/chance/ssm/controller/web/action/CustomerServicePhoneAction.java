package com.chance.ssm.controller.web.action;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.CustomerServicePhone;
import com.chance.ssm.po.CustomerServicePhoneExample;
import com.chance.ssm.po.CustomerServicePhoneExample.Criteria;
import com.chance.ssm.service.CustomerServicePhoneService;

/**
 * 客服电话控制器
 * @author Administrator
 *
 */
@Controller
public class CustomerServicePhoneAction {
	
	@Autowired
	private CustomerServicePhoneService customerServicePhoneService;

		//查询所有客服电话
		@RequestMapping(value="/selectCustomerServicePhone", method = RequestMethod.GET)
		 public String selectCustomerServicePhone(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
			
			CustomerServicePhoneExample example = new CustomerServicePhoneExample();
			example.setOrderByClause("customer_service_phone_default DESC,customer_service_phone_isuse ASC");
			List<com.chance.ssm.po.CustomerServicePhone> list =  customerServicePhoneService.selectByExample(example);
			
			model.addAttribute("list", list);
			return "customer_service_phone";
		}
		//添加客服电话
		@RequestMapping(value="/addCustomerServicePhone", method = RequestMethod.POST)
		 public String addCustomerServicePhone(Model model,HttpServletRequest request,HttpServletResponse response,String phone,String note,String isdefault,String isuse)throws Exception{
			//判断是否选择默认
			if(isdefault == "1" || "1".equals(isdefault)){
				//查询有没有添加默认的
				CustomerServicePhoneExample example = new CustomerServicePhoneExample();
				Criteria criteria = example.createCriteria();
				criteria.andCustomerServicePhoneDefaultEqualTo(1);
				List<com.chance.ssm.po.CustomerServicePhone> list =  customerServicePhoneService.selectByExample(example);
				if(list.size()>0){
					model.addAttribute("customerServiceState", 1);
					return "customer_service_phone_add";
				}
			}
			//插入到数据库
			CustomerServicePhone customerServicePhone = new CustomerServicePhone();
			customerServicePhone.setCustomerServicePhoneId(UUID.randomUUID().toString().replaceAll("-", ""));
			customerServicePhone.setCustomerServicePhone(phone);
			if(isdefault != null && !"".equals(isdefault)){
				customerServicePhone.setCustomerServicePhoneDefault(Integer.parseInt(isdefault));
			}else{
				customerServicePhone.setCustomerServicePhoneDefault(0);
			}
			if(isuse != null && !"".equals(isuse)){
				customerServicePhone.setCustomerServicePhoneIsuse(Integer.parseInt(isuse));
			}else{
				customerServicePhone.setCustomerServicePhoneIsuse(0);
			}
			customerServicePhone.setCustomerServicePhoneNote(note);
			customerServicePhone.setCustomerServicePhoneCreatetime(new Date());
			int i = customerServicePhoneService.insertSelective(customerServicePhone);
			if(i>0){
				model.addAttribute("customerServiceState", 2);
			}else{
				model.addAttribute("customerServiceState", 3);
			}
			return "customer_service_phone_add";
		}
	
		//启用或停用客服电话
		@RequestMapping(value="/EnableOrDisableServicePhone", method = RequestMethod.GET)
		 public String EnableOrDisableServicePhone(Model model,HttpServletRequest request,HttpServletResponse response,String customerservicephoneid,String isuse)throws Exception{
			//根据客服电话ID修改启用状态
			CustomerServicePhone customerServicePhone = new CustomerServicePhone();
			customerServicePhone.setCustomerServicePhoneId(customerservicephoneid);
			customerServicePhone.setCustomerServicePhoneIsuse(Integer.parseInt(isuse));
			customerServicePhoneService.updateByPrimaryKeySelective(customerServicePhone);
			return "redirect:selectCustomerServicePhone.action";
		}
	
		//设置客服电话为默认
		@RequestMapping(value="/setDefault", method = RequestMethod.GET)
		 public String setDefault(Model model,HttpServletRequest request,HttpServletResponse response,String customerservicephoneid)throws Exception{
			customerServicePhoneService.updateServicePhoneDefault();
			//根据客服电话ID修改默认
			CustomerServicePhone customerServicePhone = new CustomerServicePhone();
			customerServicePhone.setCustomerServicePhoneId(customerservicephoneid);
			customerServicePhone.setCustomerServicePhoneDefault(1);
			customerServicePhoneService.updateByPrimaryKeySelective(customerServicePhone);
			return "redirect:selectCustomerServicePhone.action";
		}
		@RequestMapping(value="/delServicePhone", method = RequestMethod.GET)
		 public String delServicePhone(Model model,HttpServletRequest request,HttpServletResponse response,String customerservicephoneid)throws Exception{
			
			customerServicePhoneService.deleteByPrimaryKey(customerservicephoneid);
			return "redirect:selectCustomerServicePhone.action";
		}
}
