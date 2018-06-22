package com.chance.ssm.mapper.nursenofreeshiftmapper;

import com.chance.ssm.po.NurseNofreeShift;
import com.chance.ssm.po.NurseNofreeShiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseNofreeShiftMapper {
    int countByExample(NurseNofreeShiftExample example);

    int deleteByExample(NurseNofreeShiftExample example);

    int deleteByPrimaryKey(String nurseNofreeShiftId);

    int insert(NurseNofreeShift record);

    //添加班次
    int insertSelectiveShift(NurseNofreeShift record);

    //查询班次
    List<NurseNofreeShift> selectByExampleShift(NurseNofreeShiftExample example);

    
    //通过班次ID查询信息
    NurseNofreeShift selectByPrimaryKeyByShiftId(String nurseNofreeShiftId);

    int updateByExampleSelective(@Param("record") NurseNofreeShift record, @Param("example") NurseNofreeShiftExample example);

    int updateByExample(@Param("record") NurseNofreeShift record, @Param("example") NurseNofreeShiftExample example);

    //修改班次
    int updateByPrimaryKeySelectiveNofreeShiftId(NurseNofreeShift record);

    int updateByPrimaryKey(NurseNofreeShift record);
    
    //通过护士ID和名称查询有没有同名的班次名称
    int selectNurseNofreeShiftByName(@Param("nurseNofreeShiftName")String nurseNofreeShiftName,@Param("nurseNofreeShiftNurseId")String nurseNofreeShiftNurseId);
    
}