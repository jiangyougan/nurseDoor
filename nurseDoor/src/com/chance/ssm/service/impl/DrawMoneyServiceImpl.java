package com.chance.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.drawmoneymapper.DrawMoneyMapper;
import com.chance.ssm.po.DrawMoney;
import com.chance.ssm.po.DrawMoneyExample;
import com.chance.ssm.po.vo.ComplaintVagueVo;
import com.chance.ssm.service.DrawMoneyService;

public class DrawMoneyServiceImpl implements DrawMoneyService{
	
	@Autowired
	private DrawMoneyMapper drawMoneyMapper;

	@Override
	public int insertSelective(DrawMoney record) throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.insertSelective(record);
	}

	@Override
	public List<DrawMoney> selectUserDrawMoneyNow(ComplaintVagueVo complaintVagueVo) throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectUserDrawMoneyNow(complaintVagueVo);
	}

	@Override
	public List<DrawMoney> selectNurseDrawMoneyNow(ComplaintVagueVo complaintVagueVo) throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectNurseDrawMoneyNow(complaintVagueVo);
	}

	@Override
	public List<DrawMoney> selectUserDrawMoneyNed(ComplaintVagueVo complaintVagueVo) throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectUserDrawMoneyNed(complaintVagueVo);
	}

	@Override
	public List<DrawMoney> selectNurseDrawMoneyNed(ComplaintVagueVo complaintVagueVo) throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectNurseDrawMoneyNed(complaintVagueVo);
	}

	@Override
	public int selectUserDrawMoneyNowCount() throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectUserDrawMoneyNowCount();
	}

	@Override
	public int selectUserDrawMoneyNedCount() throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectUserDrawMoneyNedCount();
	}

	@Override
	public int selectNurseDrawMoneyNowCount() throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectNurseDrawMoneyNowCount();
	}

	@Override
	public int selectNurseDrawMoneyNedCount() throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.selectNurseDrawMoneyNedCount();
	}

	@Override
	public int updateByExampleSelective(DrawMoney record,
			DrawMoneyExample example) throws Exception {
		// TODO Auto-generated method stub
		return drawMoneyMapper.updateByExampleSelective(record, example);
	}

}
