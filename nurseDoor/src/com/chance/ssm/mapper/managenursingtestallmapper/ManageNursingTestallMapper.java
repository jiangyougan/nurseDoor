package com.chance.ssm.mapper.managenursingtestallmapper;

import com.chance.ssm.po.ManageNursingTestall;
import com.chance.ssm.po.ManageNursingTestallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageNursingTestallMapper {
	 int countByExample(ManageNursingTestallExample example);

	    int deleteByExample(ManageNursingTestallExample example);

	    int deleteByPrimaryKey(String manageNursingTestall);

	    int insert(ManageNursingTestall record);

	    int insertSelective(ManageNursingTestall record);

	    List<ManageNursingTestall> selectByExample(ManageNursingTestallExample example);

	    ManageNursingTestall selectByPrimaryKey(String manageNursingTestall);

	    int updateByExampleSelective(@Param("record") ManageNursingTestall record, @Param("example") ManageNursingTestallExample example);

	    int updateByExample(@Param("record") ManageNursingTestall record, @Param("example") ManageNursingTestallExample example);

	    int updateByPrimaryKeySelective(ManageNursingTestall record);

	    int updateByPrimaryKey(ManageNursingTestall record);
	    
	    //根据产品id得到检测项
	    List<ManageNursingTestall> selectTestContentByGoodsId(String goodsId);
}