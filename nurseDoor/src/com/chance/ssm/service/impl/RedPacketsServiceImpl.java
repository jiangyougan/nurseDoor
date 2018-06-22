package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.redpacketsmapper.RedPacketsMapper;
import com.chance.ssm.mapper.redpacketsusermapper.RedPacketsUserMapper;
import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsExample;
import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.service.RedPacketsService;

public class RedPacketsServiceImpl implements RedPacketsService{

	@Autowired
	private RedPacketsMapper redPacketsMapper;
	
	@Autowired
	private RedPacketsUserMapper packetsUserMapper;
	
	
	@Override
	public List<RedPackets> selectByExample(RedPacketsExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return redPacketsMapper.selectByExample(example);
	}
	@Override
	public RedPackets selectRedpacketsInfoByType(Integer redPacketsType)
			throws Exception {
		// TODO Auto-generated method stub
		return redPacketsMapper.selectRedpacketsInfoByType(redPacketsType);
	}
	@Override
	public int insertSelective(RedPackets record) {
		// TODO Auto-generated method stub
		return redPacketsMapper.insertSelective(record);
	}
	@Override
	public RedPackets selectByPrimaryKeyByResPacketsId(String redPackets)
			throws Exception {
		// TODO Auto-generated method stub
		return redPacketsMapper.selectByPrimaryKeyByResPacketsId(redPackets);
	}
	@Override
	public int updateByPrimaryKeySelective(RedPackets record) throws Exception {
		// TODO Auto-generated method stub
		return redPacketsMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int insertSelectiveNurseRedPackets(RedPacketsUser record)
			throws Exception {
		// TODO Auto-generated method stub
		return packetsUserMapper.insertSelectiveNurseRedPackets(record);
	}
	@Override
	public List<RedPacketsUser> selectRedPacketsNurseAllInfo(String nurseId) {
		// TODO Auto-generated method stub
		return packetsUserMapper.selectRedPacketsNurseAllInfo(nurseId);
	}

}
