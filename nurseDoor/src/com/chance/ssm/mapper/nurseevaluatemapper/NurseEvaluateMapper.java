package com.chance.ssm.mapper.nurseevaluatemapper;

import com.chance.ssm.po.NurseEvaluate;
import com.chance.ssm.po.NurseEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseEvaluateMapper {
    int countByExample(NurseEvaluateExample example);

    int deleteByExample(NurseEvaluateExample example);

    int deleteByPrimaryKey(String nurseEvaluateId);

    int insert(NurseEvaluate record);

    int insertSelective(NurseEvaluate record);

    List<NurseEvaluate> selectByExample(NurseEvaluateExample example);

    NurseEvaluate selectByPrimaryKey(String nurseEvaluateId);

    int updateByExampleSelective(@Param("record") NurseEvaluate record, @Param("example") NurseEvaluateExample example);

    int updateByExample(@Param("record") NurseEvaluate record, @Param("example") NurseEvaluateExample example);

    int updateByPrimaryKeySelective(NurseEvaluate record);

    int updateByPrimaryKey(NurseEvaluate record);
    
    //根据订单查看有没有评价
    List<NurseEvaluate> selectNurseToUserEvaluate(String evaluteSendId);
    
    //根据订单ID查询评价
    NurseEvaluate selectEvaluateInfoByOrderid(String evaluteSendId);
    
}