package com.chance.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.vo.ManageNursingContentVO;

public interface ManageNursingContentService {

	// 通过传入的数据查询数据，和nursing_project表关联
	public List<ManageNursingContentVO> selectByExampleAndProject(
			String nursingNurseid) throws Exception;

	// 根据ID查询数据
	public ManageNursingContent selectByPrimaryKey(String manageNursingContentId)
			throws Exception;

	// 根据传入的不同条件查询不同的信息
	public List<ManageNursingContentVO> selectByExampleRuVO(
			ManageNursingContentExample example) throws Exception;

	// 添加数据
	public int insertSelective(ManageNursingContentWithBLOBs record)
			throws Exception;
	
	//根据条件更新数据
	public int updateByExampleWithBLOBs(@Param("record") ManageNursingContentWithBLOBs record, @Param("example") ManageNursingContentExample example) throws Exception;
	
	public int updateByExampleSelective(@Param("record") ManageNursingContentWithBLOBs record, @Param("example") ManageNursingContentExample example)throws Exception;
	
	//统计数据数量
	public int countByExample(ManageNursingContentExample example) throws Exception;
	
    //通过和project表关联查询并返回VO扩展类
    public List<ManageNursingContentVO> selectByExampleAndProjectRuVO(NursingProjectExample example)throws Exception;

    //根据ID查询数据，返回BLOB类型
    public ManageNursingContentWithBLOBs selectByPrimaryKeyBLOB(String manageNursingContentId)throws Exception;
    
    public List<ManageNursingContentWithBLOBs> selectByExampleWithBLOBs(ManageNursingContentExample example)throws Exception;

    //根据ID跟新数据
    public int updateByPrimaryKeySelective(ManageNursingContentWithBLOBs record)throws Exception;
    
    //根据ID删除数据
    public int deleteByPrimaryKey(String manageNursingContentId)throws Exception;
    
    //根据传入的条件删除数据
    public int deleteByExample(ManageNursingContentExample example) throws Exception;
    
  //通过服务项id查询服务信息
    public ManageNursingContent selectmanageNursingContentById(String manageNursingContentId)throws Exception;
    
    //根据条件查询数据
    public List<ManageNursingContent> selectByExample(ManageNursingContentExample example)throws Exception;
    
    public int updateByPrimaryKeyWithBLOBs(ManageNursingContentWithBLOBs record)throws Exception;
    
    public int updateByPrimaryKeySelectiveMap(ManageNursingContentWithBLOBs record)throws Exception;
    
    //根据二级服务ID查询服务内容
    public ManageNursingContentVO selectManageNursingContentNewF(String manageNursingContentId)throws Exception;
    
    //通过产品ID查询二级服务信息
    public ManageNursingContent selectManageNursingContenInfoByGoodsId(String goodsContent)throws Exception;
}
