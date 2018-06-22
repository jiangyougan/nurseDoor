package com.chance.ssm.mapper.couponusermapper;

import com.chance.ssm.po.CouponUser;
import com.chance.ssm.po.CouponUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponUserMapper {
    int countByExample(CouponUserExample example);

    int deleteByExample(CouponUserExample example);

    int deleteByPrimaryKey(String couponUserId);

    int insert(CouponUser record);

    
    //给用户添加优惠券
    int insertSelectiveCouponUser(CouponUser record);

    List<CouponUser> selectByExample(CouponUserExample example);

    //通过优惠券ID查询优惠券
    CouponUser selectByPrimaryKeyByCouponUserId(String couponUserId);

    int updateByExampleSelective(@Param("record") CouponUser record, @Param("example") CouponUserExample example);

    int updateByExample(@Param("record") CouponUser record, @Param("example") CouponUserExample example);

    //修改优惠券
    int updateUCouponUserByPrimaryKeySelective(CouponUser record);

    int updateByPrimaryKey(CouponUser record);
    
    // 查看用户所有的优惠券
    List<CouponUser>selectAllUserCouponInfo(String couponUserUserId);
}