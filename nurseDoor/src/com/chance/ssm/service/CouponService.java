package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Coupon;
import com.chance.ssm.po.CouponExample;
import com.chance.ssm.po.CouponUser;

public interface CouponService {

	//查询优惠券
   public List<Coupon> selectByExample(CouponExample example)throws Exception;
   
   //添加优惠券
   public int insertSelective(Coupon record)throws Exception;
   
   //通过ID查看优惠券
   public Coupon selectByPrimaryKey(String couponId)throws Exception;
   
   //通过优惠券ID修改优惠券
   public int updateByPrimaryKeySelective(Coupon record)throws Exception;
   
   //删除优惠券
   public int deleteByPrimaryKey(String couponId)throws Exception;

   //根据类别判断有没有添加过注册送的优惠券或推荐送的优惠券
   public Coupon selectCountTypeByType(Integer couponType)throws Exception;
   
   
   //给用户添加优惠券
   public int insertSelectiveCouponUser(CouponUser record)throws Exception;
   
   // 查看用户所有的优惠券
   public List<CouponUser>selectAllUserCouponInfo(String couponUserUserId)throws Exception;
   
   //通过优惠券ID查询优惠券
   public CouponUser selectByPrimaryKeyByCouponUserId(String couponUserId)throws Exception;
   
   //修改用户的优惠券
   public int updateUCouponUserByPrimaryKeySelective(CouponUser record)throws Exception;
   
   //查询普通优惠券
   public List<Coupon>  selectPutongCouponInfo()throws Exception;
}
