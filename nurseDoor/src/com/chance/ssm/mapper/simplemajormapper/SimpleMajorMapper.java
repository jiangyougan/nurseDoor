package com.chance.ssm.mapper.simplemajormapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.SimpleMajorExample;
import com.chance.ssm.po.vo.SimpleMajorVO;

public interface SimpleMajorMapper {
    int countByExample(SimpleMajorExample example);

    int deleteByExample(SimpleMajorExample example);

    int deleteByPrimaryKey(String simpleMajorId);

    int insert(SimpleMajor record);

    int insertSelective(SimpleMajor record);

    List<SimpleMajor> selectByExample(SimpleMajorExample example);

    //通过专业id查询专业信息
    SimpleMajor selectByPrimaryKey(String simpleMajorId);

    int updateByExampleSelective(@Param("record") SimpleMajor record, @Param("example") SimpleMajorExample example);

    int updateByExample(@Param("record") SimpleMajor record, @Param("example") SimpleMajorExample example);

    int updateByPrimaryKeySelective(SimpleMajor record);

    int updateByPrimaryKey(SimpleMajor record);
    
    //查询专业返回VO扩展类
    List<SimpleMajorVO> selectByExampleRuVO(SimpleMajorExample example);
}