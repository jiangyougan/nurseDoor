package com.chance.ssm.mapper.nursefinishordersigninmapper;

import com.chance.ssm.po.NurseFinishOrderSignin;
import com.chance.ssm.po.NurseFinishOrderSigninExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseFinishOrderSigninMapper {
    int countByExample(NurseFinishOrderSigninExample example);

    int deleteByExample(NurseFinishOrderSigninExample example);

    int deleteByPrimaryKey(String nurseFinishOrderSignin);

    int insertfinishorderSignin(NurseFinishOrderSignin record);

    int insertSelective(NurseFinishOrderSignin record);

    List<NurseFinishOrderSignin> selectByExample(NurseFinishOrderSigninExample example);

    NurseFinishOrderSignin selectByPrimaryKey(String nurseFinishOrderSignin);

    int updateByExampleSelective(@Param("record") NurseFinishOrderSignin record, @Param("example") NurseFinishOrderSigninExample example);

    int updateByExample(@Param("record") NurseFinishOrderSignin record, @Param("example") NurseFinishOrderSigninExample example);

    int updateByPrimaryKeySelective(NurseFinishOrderSignin record);

    int updateByPrimaryKey(NurseFinishOrderSignin record);
    
    //护士完成订单加积分
    int insertSelectivefinishorderSignin(NurseFinishOrderSignin nurseFinishOrderSignin);
}