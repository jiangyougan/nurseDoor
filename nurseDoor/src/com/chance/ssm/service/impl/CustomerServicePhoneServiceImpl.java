package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.customerservicephonemapper.CustomerServicePhoneMapper;
import com.chance.ssm.po.CustomerServicePhone;
import com.chance.ssm.po.CustomerServicePhoneExample;
import com.chance.ssm.service.CustomerServicePhoneService;

public class CustomerServicePhoneServiceImpl implements CustomerServicePhoneService{

	@Autowired
	private CustomerServicePhoneMapper customerServicePhoneMapper;
	@Override
	public List<CustomerServicePhone> selectByExample(
			CustomerServicePhoneExample example) throws Exception {
		// TODO Auto-generated method stub
		return customerServicePhoneMapper.selectByExample(example);
	}
	@Override
	public int insertSelective(CustomerServicePhone record) throws Exception {
		// TODO Auto-generated method stub
		return customerServicePhoneMapper.insertSelective(record);
	}
	@Override
	public int updateByPrimaryKeySelective(CustomerServicePhone record)
			throws Exception {
		// TODO Auto-generated method stub
		return customerServicePhoneMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int updateServicePhoneDefault() throws Exception {
		// TODO Auto-generated method stub
		return customerServicePhoneMapper.updateServicePhoneDefault();
	}
	@Override
	public int deleteByPrimaryKey(String customerServicePhoneId)
			throws Exception {
		// TODO Auto-generated method stub
		return customerServicePhoneMapper.deleteByPrimaryKey(customerServicePhoneId);
	}

}
