package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.packagemapper.PackageMapper;
import com.chance.ssm.po.Package;
import com.chance.ssm.po.PackageExample;
import com.chance.ssm.service.PackageService;

public class PackageServiceImpl implements PackageService {
	
	@Autowired
	private PackageMapper packageMapper;

	@Override
	public List<Package> selectByExample(PackageExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return packageMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(Package record) throws Exception {
		// TODO Auto-generated method stub
		return packageMapper.insertSelective(record);
	}

	@Override
	public List<Package> selectByExampleWithBLOBs(PackageExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return packageMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public int updateByExampleSelective(Package record, PackageExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return packageMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int deleteByExample(PackageExample example) throws Exception {
		// TODO Auto-generated method stub
		return packageMapper.deleteByExample(example);
	}

	@Override
	public Package selectPackageByContentId(String packageManursingContent)
			throws Exception {
		// TODO Auto-generated method stub
		return packageMapper.selectPackageByContentId(packageManursingContent);
	}

}
