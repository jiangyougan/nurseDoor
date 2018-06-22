package com.chance.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Package;
import com.chance.ssm.po.PackageExample;

public interface PackageService {

	public List<Package> selectByExample(PackageExample example)throws Exception;
	
	//添加数据
	public int insertSelective(Package record)throws Exception;
	
	//查询文本
	public List<Package> selectByExampleWithBLOBs(PackageExample example)throws Exception;
	
	public int updateByExampleSelective(@Param("record") Package record, @Param("example") PackageExample example)throws Exception;
	
	//根据传入的条件删除数据
	public int deleteByExample(PackageExample example) throws Exception;
	
	//根据二级ID查询套餐
	public Package selectPackageByContentId(String packageManursingContent) throws Exception;
}
