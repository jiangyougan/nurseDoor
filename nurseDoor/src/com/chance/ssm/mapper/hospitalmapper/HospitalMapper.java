package com.chance.ssm.mapper.hospitalmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Hospital;
import com.chance.ssm.po.HospitalExample;
import com.chance.ssm.po.vo.HospitalVO;

public interface HospitalMapper {
    int countByExample(HospitalExample example);

    int deleteByExample(HospitalExample example);

    int deleteByPrimaryKey(String hospitalId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    //查询所有医院
    List<Hospital> selectByExample(HospitalExample example);

    Hospital selectByPrimaryKey(String hospitalId);

    int updateByExampleSelective(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExample(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
    
    //和专业表进行关联，查询所有医院和医院下面的专业
    List<Hospital> selectByExampleAndMajor(HospitalExample example);
    
    //通过专业id查询医院id和名称 
    List<Hospital> selectHbtByMajorId(String majorId);
    
    //根据ID查询医院信息，并和专业表进行关联
    HospitalVO selectByPrimaryKeyAndMajor(String hospitalId);
}