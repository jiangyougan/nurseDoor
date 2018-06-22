package com.chance.ssm.mapper.majormapper;

import com.chance.ssm.po.Major;
import com.chance.ssm.po.MajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorMapper {
    int countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    int deleteByPrimaryKey(String majorId);

    int insert(Major record);

    int insertSelective(Major record);

    List<Major> selectByExample(MajorExample example);

    Major selectByPrimaryKey(String majorId);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
    
    //查询所有不重名的专业
    List<Major> selectMajorInfoByName();
    
    //通过医院查专业
    List<Major> selectMajorBuHbtId(String majorDetails);
    
    //查询所有不重复的专业
    List<Major> selectMajorGroupById();
}