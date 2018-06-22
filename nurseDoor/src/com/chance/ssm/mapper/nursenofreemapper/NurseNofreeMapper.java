package com.chance.ssm.mapper.nursenofreemapper;

import com.chance.ssm.po.NurseNofree;
import com.chance.ssm.po.NurseNofreeExample;
import com.chance.ssm.po.vo.NurseNoFreeVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseNofreeMapper {
    int countByExample(NurseNofreeExample example);

    int deleteByExample(NurseNofreeExample example);

    int deleteByPrimaryKey(String nurseNofreeId);

    int insert(NurseNofree record);

    int insertSelective(NurseNofree record);

    List<NurseNofree> selectByExample(NurseNofreeExample example);

    NurseNofree selectByPrimaryKey(String nurseNofreeId);

    //修改排班表    
    int updateByExampleSelective(@Param("record") NurseNofree record, @Param("example") NurseNofreeExample example);

    int updateByExample(@Param("record") NurseNofree record, @Param("example") NurseNofreeExample example);

    int updateByPrimaryKeySelective(NurseNofree record);

    int updateByPrimaryKey(NurseNofree record);
    
    // 通过护士ID查询最近的一次排班时间
    NurseNoFreeVo selectByExampleOne(String nurseNofreeNurseid);
    
    // 根据护士id查询排班时间(不包括备注)
    List<NurseNoFreeVo> selectNurseFreeInfo(String nurseNofreeNurseid);
    
    //查询护士3周的排班时间(当前周,下一周,下下一周(周一第一天,周日最后一天))(包括备注)
    List<NurseNoFreeVo> selectNurseNotFreeTimeThirdWeed(String nurseNofreeNurseid);
    
    //查询护士某一天的排班时间
    List<NurseNoFreeVo> selectNurseNoFreeTimeForSomeOneDay(String nurseNofreeNurseid,String date);
    
    //根据护士ID,日期,班次ID删除排班表(同一天不能有2个相同的班次)
    int deleteByNurseIdANdDateAdnShiftId(String date,String nurseId,String noFreeshiftId);
    
    //根据护士ID,日期,班次ID修改排班表(同一天不能有2个相同的班次)
    int updateByNurseIdANdDateAdnShiftId(String note,String date,String nurseId,String noFreeshiftId);
    
    //查询同一天有没有相同的班次
    List<NurseNofree> selectCommonNoFreeInfo(String nurseNofreeShiftId,String nofreeDate );
}