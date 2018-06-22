package com.chance.ssm.mapper.signinsetmapper;

import com.chance.ssm.po.SigninSet;
import com.chance.ssm.po.SigninSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SigninSetMapper {
    int countByExample(SigninSetExample example);

    int deleteByExample(SigninSetExample example);

    int insert(SigninSet record);

    int insertSelective(SigninSet record);

    List<SigninSet> selectByExample(SigninSetExample example);

    int updateByExampleSelective(@Param("record") SigninSet record, @Param("example") SigninSetExample example);

    int updateByExample(@Param("record") SigninSet record, @Param("example") SigninSetExample example);

    //护士注册赠送的积分
    SigninSet selectNurseRegistermark();
    
    //用户注册赠送的积分
    SigninSet selectUserRegistermark();
    
    //查询后台设定的积分 
    SigninSet selectMarkSetSignin();
    
}