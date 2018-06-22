package com.chance.ssm.mapper.protectedaddressmapper;

import com.chance.ssm.po.ProtectedAddress;
import com.chance.ssm.po.ProtectedAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtectedAddressMapper {
    int countByExample(ProtectedAddressExample example);

    int deleteByExample(ProtectedAddressExample example);

    int deleteByPrimaryKey(String protectedAddressId);

    int insert(ProtectedAddress record);

    int insertSelective(ProtectedAddress record);

    List<ProtectedAddress> selectByExample(ProtectedAddressExample example);

    //通过守护人地址id查询信息
    ProtectedAddress selectByPrimaryKey(String protectedAddressId);

    int updateByExampleSelective(@Param("record") ProtectedAddress record, @Param("example") ProtectedAddressExample example);

    int updateByExample(@Param("record") ProtectedAddress record, @Param("example") ProtectedAddressExample example);

    int updateByPrimaryKeySelective(ProtectedAddress record);

    int updateByPrimaryKey(ProtectedAddress record);
}