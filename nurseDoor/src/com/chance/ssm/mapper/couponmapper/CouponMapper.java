package com.chance.ssm.mapper.couponmapper;

import com.chance.ssm.po.Coupon;
import com.chance.ssm.po.CouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponMapper {
    int countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(String couponId);

    int insert(Coupon record);

    //添加优惠券
    int insertSelective(Coupon record);

    //查询所有优惠券
    List<Coupon> selectByExample(CouponExample example);

    
    //通过ID查看优惠券
    Coupon selectByPrimaryKey(String couponId);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    //通过优惠券ID修改优惠券
    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
    
    //根据类别判断有没有添加过注册送的优惠券或推荐送的优惠券
    Coupon selectCountTypeByType(Integer couponType);
    
    //查询普通优惠券
    List<Coupon>  selectPutongCouponInfo();
}