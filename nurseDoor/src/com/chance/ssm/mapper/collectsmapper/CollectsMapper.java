package com.chance.ssm.mapper.collectsmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Collects;
import com.chance.ssm.po.CollectsExample;
import com.chance.ssm.po.vo.CollectsVO;

public interface CollectsMapper {
    int countByExample(CollectsExample example);

    int deleteByExample(CollectsExample example);

    int deleteByPrimaryKey(String collectionId);

    int insert(Collects record);

    int insertSelective(Collects record);

    List<Collects> selectByExample(CollectsExample example);

    Collects selectByPrimaryKey(String collectionId);

    int updateByExampleSelective(@Param("record") Collects record, @Param("example") CollectsExample example);

    int updateByExample(@Param("record") Collects record, @Param("example") CollectsExample example);

    int updateByPrimaryKeySelective(Collects record);

    int updateByPrimaryKey(Collects record);
    
    //根据传入的条件查询数据，并返回VO扩展类
    List<CollectsVO> selectByExampleRuVO(CollectsExample example);
}