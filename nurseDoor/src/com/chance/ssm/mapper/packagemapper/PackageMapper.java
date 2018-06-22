package com.chance.ssm.mapper.packagemapper;

import com.chance.ssm.po.Package;
import com.chance.ssm.po.PackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageMapper {
    int countByExample(PackageExample example);

    int deleteByExample(PackageExample example);

    int insert(Package record);

    int insertSelective(Package record);

    List<Package> selectByExampleWithBLOBs(PackageExample example);

    List<Package> selectByExample(PackageExample example);

    int updateByExampleSelective(@Param("record") Package record, @Param("example") PackageExample example);

    int updateByExampleWithBLOBs(@Param("record") Package record, @Param("example") PackageExample example);

    int updateByExample(@Param("record") Package record, @Param("example") PackageExample example);
    
    //根据二级ID查询套餐
    Package selectPackageByContentId(String packageManursingContent);
}