package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.managenursingcontentmapper.ManageNursingContentMapper;
import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.vo.ManageNursingContentVO;
import com.chance.ssm.service.ManageNursingContentService;

public class ManageNursingContentServiceImpl implements
		ManageNursingContentService {
	
	@Autowired
	private ManageNursingContentMapper mContentMapper;

	@Override
	public List<ManageNursingContentVO> selectByExampleAndProject(
			String nursingNurseid) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectByExampleAndProject(nursingNurseid);
	}

	@Override
	public ManageNursingContent selectByPrimaryKey(String manageNursingContentId)
			throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectByPrimaryKey(manageNursingContentId);
	}

	@Override
	public List<ManageNursingContentVO> selectByExampleRuVO(
			ManageNursingContentExample example) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectByExampleRuVO(example);
	}

	@Override
	public int insertSelective(ManageNursingContentWithBLOBs record)
			throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.insertSelective(record);
	}

	@Override
	public int updateByExampleWithBLOBs(ManageNursingContentWithBLOBs record,
			ManageNursingContentExample example) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExampleSelective(ManageNursingContentWithBLOBs record,
			ManageNursingContentExample example) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(ManageNursingContentExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.countByExample(example);
	}

	@Override
	public List<ManageNursingContentVO> selectByExampleAndProjectRuVO(
			NursingProjectExample example) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectByExampleAndProjectRuVO(example);
	}

	@Override
	public ManageNursingContentWithBLOBs selectByPrimaryKeyBLOB(
			String manageNursingContentId) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectByPrimaryKeyBLOB(manageNursingContentId);
	}

	@Override
	public List<ManageNursingContentWithBLOBs> selectByExampleWithBLOBs(
			ManageNursingContentExample example) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public int updateByPrimaryKeySelective(ManageNursingContentWithBLOBs record)
			throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String manageNursingContentId)
			throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.deleteByPrimaryKey(manageNursingContentId);
	}

	@Override
	public int deleteByExample(ManageNursingContentExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.deleteByExample(example);
	}

	@Override
	public ManageNursingContent selectmanageNursingContentById(
			String manageNursingContentId) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectmanageNursingContentById(manageNursingContentId);
	}

	@Override
	public List<ManageNursingContent> selectByExample(
			ManageNursingContentExample example) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectByExample(example);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(ManageNursingContentWithBLOBs record)
			throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKeySelectiveMap(
			ManageNursingContentWithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.updateByPrimaryKeySelectiveMap(record);
	}

	@Override
	public ManageNursingContentVO selectManageNursingContentNewF(
			String manageNursingContentId) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectManageNursingContentNewF(manageNursingContentId);
	}

	@Override
	public ManageNursingContent selectManageNursingContenInfoByGoodsId(
			String goodsContent) throws Exception {
		// TODO Auto-generated method stub
		return mContentMapper.selectManageNursingContenInfoByGoodsId(goodsContent);
	}

	

}
