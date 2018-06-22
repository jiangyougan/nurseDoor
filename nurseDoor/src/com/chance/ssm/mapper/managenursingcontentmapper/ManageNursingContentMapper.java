package com.chance.ssm.mapper.managenursingcontentmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.ManageNursingContent;
import com.chance.ssm.po.ManageNursingContentExample;
import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.po.NursingProjectExample;
import com.chance.ssm.po.vo.ManageNursingContentVO;

public interface ManageNursingContentMapper {
    int countByExample(ManageNursingContentExample example);

    int deleteByExample(ManageNursingContentExample example);

    int deleteByPrimaryKey(String manageNursingContentId);

    int insert(ManageNursingContentWithBLOBs record);

    int insertSelective(ManageNursingContentWithBLOBs record);

    List<ManageNursingContentWithBLOBs> selectByExampleWithBLOBs(ManageNursingContentExample example);

    List<ManageNursingContent> selectByExample(ManageNursingContentExample example);

//    ManageNursingContentWithBLOBs selectByPrimaryKey(String manageNursingContentId);
    //根据ID查询数据，返回BLOB类型
    ManageNursingContentWithBLOBs selectByPrimaryKeyBLOB(String manageNursingContentId);

    int updateByExampleSelective(@Param("record") ManageNursingContentWithBLOBs record, @Param("example") ManageNursingContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ManageNursingContentWithBLOBs record, @Param("example") ManageNursingContentExample example);

    int updateByExample(@Param("record") ManageNursingContent record, @Param("example") ManageNursingContentExample example);

    int updateByPrimaryKeySelective(ManageNursingContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ManageNursingContentWithBLOBs record);

    int updateByPrimaryKey(ManageNursingContent record);
    
    //通过服务项id查询服务信息
    ManageNursingContent selectmanageNursingContentById(String manageNursingContentId);
    
    //通过服务id查询包含多少小项
    List<ManageNursingContent> SelectByManageNursingContentMaproject(String manageNursingContentMaproject);
    
    //通过传入的数据查询数据，和nursing_project表关联
    List<ManageNursingContentVO> selectByExampleAndProject(String nursingNurseid);
    
    //根据ID查询数据
    ManageNursingContent selectByPrimaryKey(String manageNursingContentId);
  
    //通过传入的条件查询数据返回VO扩展类
    List<ManageNursingContentVO> selectByExampleRuVO(ManageNursingContentExample example);
    
    //通过和project表关联查询并返回VO扩展类
    List<ManageNursingContentVO> selectByExampleAndProjectRuVO(NursingProjectExample example);
    
    int updateByPrimaryKeySelectiveMap(ManageNursingContentWithBLOBs record);
   
    //根据二级服务ID查询服务内容
    ManageNursingContentVO selectManageNursingContentNewF(String manageNursingContentId);
    
    //通过产品ID查询二级服务信息
    ManageNursingContent selectManageNursingContenInfoByGoodsId(String goodsContent);
    
    
}