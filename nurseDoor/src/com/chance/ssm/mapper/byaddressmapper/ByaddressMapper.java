package com.chance.ssm.mapper.byaddressmapper;

import com.chance.ssm.po.Byaddress;
import com.chance.ssm.po.ByaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ByaddressMapper {
    int countByExample(ByaddressExample example);

    int deleteByExample(ByaddressExample example);

    int insert(Byaddress record);

    int insertSelective(Byaddress record);

    List<Byaddress> selectByExample(ByaddressExample example);

    int updateByExampleSelective(@Param("record") Byaddress record, @Param("example") ByaddressExample example);

    int updateByExample(@Param("record") Byaddress record, @Param("example") ByaddressExample example);
}