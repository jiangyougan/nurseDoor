package com.chance.ssm.mapper.caselablemapper;

import com.chance.ssm.po.CaseLable;
import com.chance.ssm.po.CaseLableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseLableMapper {
    int countByExample(CaseLableExample example);

    int deleteByExample(CaseLableExample example);

    int deleteByPrimaryKey(String caseLableId);

    int insert(CaseLable record);

    int insertSelective(CaseLable record);

    List<CaseLable> selectByExample(CaseLableExample example);

    CaseLable selectByPrimaryKey(String caseLableId);

    int updateByExampleSelective(@Param("record") CaseLable record, @Param("example") CaseLableExample example);

    int updateByExample(@Param("record") CaseLable record, @Param("example") CaseLableExample example);

    int updateByPrimaryKeySelective(CaseLable record);

    int updateByPrimaryKey(CaseLable record);
    
    //查询所有病历标签
    List<CaseLable> selectAllLableInfo();
}