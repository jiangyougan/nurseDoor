package com.chance.ssm.mapper.nursingtestingcontentmapper;

import com.chance.ssm.po.NursingTestingContent;
import com.chance.ssm.po.NursingTestingContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NursingTestingContentMapper {
    int countByExample(NursingTestingContentExample example);

    int deleteByExample(NursingTestingContentExample example);

    int insert(NursingTestingContent record);

    //添加检测项
    int insertSelective(NursingTestingContent record);

    List<NursingTestingContent> selectByExample(NursingTestingContentExample example);

    int updateByExampleSelective(@Param("record") NursingTestingContent record, @Param("example") NursingTestingContentExample example);

    int updateByExample(@Param("record") NursingTestingContent record, @Param("example") NursingTestingContentExample example);

    //根据订单id查询检测项
    List<NursingTestingContent> selectTestingContentByOrderId(String nursingOrderid);
}