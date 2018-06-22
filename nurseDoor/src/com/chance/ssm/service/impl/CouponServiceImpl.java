package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.couponmapper.CouponMapper;
import com.chance.ssm.mapper.couponusermapper.CouponUserMapper;
import com.chance.ssm.po.Coupon;
import com.chance.ssm.po.CouponExample;
import com.chance.ssm.po.CouponUser;
import com.chance.ssm.service.CouponService;

public class CouponServiceImpl implements CouponService{

	@Autowired
	private CouponMapper couponMapper;
	
	@Autowired
	private CouponUserMapper couponUserMapper;
	
	@Override
	public List<Coupon> selectByExample(CouponExample example) throws Exception {
		// TODO Auto-generated method stub
		return couponMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(Coupon record) throws Exception {
		// TODO Auto-generated method stub
		return couponMapper.insertSelective(record);
	}

	@Override
	public Coupon selectByPrimaryKey(String couponId) throws Exception {
		// TODO Auto-generated method stub
		return couponMapper.selectByPrimaryKey(couponId);
	}

	@Override
	public int updateByPrimaryKeySelective(Coupon record) throws Exception {
		// TODO Auto-generated method stub
		return couponMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String couponId) throws Exception {
		// TODO Auto-generated method stub
		return couponMapper.deleteByPrimaryKey(couponId);
	}

	@Override
	public Coupon selectCountTypeByType(Integer couponType) throws Exception {
		// TODO Auto-generated method stub
		return couponMapper.selectCountTypeByType(couponType);
	}

	@Override
	public int insertSelectiveCouponUser(CouponUser record) throws Exception {
		// TODO Auto-generated method stub
		return couponUserMapper.insertSelectiveCouponUser(record);
	}

	@Override
	public List<CouponUser> selectAllUserCouponInfo(String couponUserUserId)
			throws Exception {
		// TODO Auto-generated method stub
		return couponUserMapper.selectAllUserCouponInfo(couponUserUserId);
	}

	@Override
	public CouponUser selectByPrimaryKeyByCouponUserId(String couponUserId)
			throws Exception {
		// TODO Auto-generated method stub
		return couponUserMapper.selectByPrimaryKeyByCouponUserId(couponUserId);
	}

	@Override
	public int updateUCouponUserByPrimaryKeySelective(CouponUser record)
			throws Exception {
		// TODO Auto-generated method stub
		return couponUserMapper.updateUCouponUserByPrimaryKeySelective(record);
	}

	@Override
	public List<Coupon> selectPutongCouponInfo() throws Exception {
		// TODO Auto-generated method stub
		return couponMapper.selectPutongCouponInfo();
	}


}
