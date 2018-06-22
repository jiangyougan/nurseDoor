package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Hospital;
import com.chance.ssm.po.HospitalExample;
import com.chance.ssm.po.vo.HospitalVO;

public interface HospitalService {
	//根据传入的条件不同查询不同的数据 
	public List<Hospital> selectByExample(HospitalExample example)throws Exception;
	
	//和专业表进行关联，查询所有医院和医院下面的专业
    public List<Hospital> selectByExampleAndMajor(HospitalExample example)throws Exception;
    
    //添加医院
    public int insertSelective(Hospital record)throws Exception;
    
    //根据ID删除医院
    public int deleteByPrimaryKey(String hospitalId)throws Exception;
    
    //根据ID修改医院
    public int updateByPrimaryKeySelective(Hospital record)throws Exception;
    
    //根据ID查询医院信息，并和专业表进行关联
    public HospitalVO selectByPrimaryKeyAndMajor(String hospitalId)throws Exception;
    
    //根据ID查询医院信息
    public Hospital selectByPrimaryKey(String hospitalId)throws Exception;

    //通过专业id查询医院id和名称 
    public List<Hospital> selectHbtByMajorId(String majorId)throws Exception;
    
    
}
