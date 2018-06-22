package com.chance.ssm.mapper.savemapper;

import com.chance.ssm.po.Save;
import com.chance.ssm.po.SaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaveMapper {
    int countByExample(SaveExample example);

    int deleteByExample(SaveExample example);

    int deleteByPrimaryKey(String saveId);

    int insert(Save record);


    List<Save> selectByExample(SaveExample example);

    Save selectByPrimaryKey(String saveId);

    //添加保险费
    int insertSaveSelective(Save record);
    
    //修改保险费
    int updateSaveByExampleSelective(@Param("record") Save record, @Param("example") SaveExample example);

    int updateByExample(@Param("record") Save record, @Param("example") SaveExample example);

    int updateByPrimaryKeySelective(Save record);

    int updateByPrimaryKey(Save record);
    
    Save selectSaveInfo();
}