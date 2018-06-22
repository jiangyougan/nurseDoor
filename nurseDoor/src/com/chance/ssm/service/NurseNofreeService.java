package com.chance.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.NurseNofree;
import com.chance.ssm.po.NurseNofreeExample;
import com.chance.ssm.po.NurseNofreeShift;
import com.chance.ssm.po.NurseNofreeShiftExample;
import com.chance.ssm.po.vo.NurseNoFreeVo;

public interface NurseNofreeService {
	
	//根据传入的条件查询护士的时间
	public List<NurseNofree> selectByExample(NurseNofreeExample example) throws Exception;
	//添加数据
	public int insertSelective(NurseNofree record)throws Exception;
	
	 //通过护士ID查询最近的一次空闲时间
    public  NurseNoFreeVo selectByExampleOne(String nurseNofreeNurseid)throws Exception;
    
    //根据ID更新护士的空闲时间
    public int updateByPrimaryKeySelective(NurseNofree record)throws Exception;
    
    //根据ID删除数据
    public int deleteByPrimaryKey(String nurseNofreeId)throws Exception;
    
    //查询护士3周的空闲时间(当前周,下一周,下下一周(周一第一天,周日最后一天))
    public List<NurseNoFreeVo> selectNurseNotFreeTimeThirdWeed(String nurseNofreeNurseid)throws Exception;
    
    //查询护士某一天的排班时间
    public List<NurseNoFreeVo> selectNurseNoFreeTimeForSomeOneDay(String nurseNofreeNurseid,String date)throws Exception;
    
    //根据护士ID,日期,班次ID删除排班表(同一天不能有2个相同的班次)
    public int deleteByNurseIdANdDateAdnShiftId(String date,String nurseId,String noFreeshiftId)throws Exception;
    
    //修改排班表    
    public int updateByExampleSelective(@Param("record") NurseNofree record, @Param("example") NurseNofreeExample example)throws Exception;
    
    //根据护士ID,日期,班次ID修改排班表(同一天不能有2个相同的班次)
    public int updateByNurseIdANdDateAdnShiftId(String note,String date,String nurseId,String noFreeshiftId)throws Exception;
    
    //查询同一天有没有相同的班次
    public  List<NurseNofree> selectCommonNoFreeInfo(String nurseNofreeShiftId,String nofreeDate )throws Exception;
    
    //添加班次
    public int insertSelectiveShift(NurseNofreeShift record)throws Exception;
    
    //通过名称查询有没有同名的班次名称
    public int selectNurseNofreeShiftByName(String nurseNofreeShiftName,String nurseNofreeShiftNurseId)throws Exception;
    
    //通过班次ID查询信息
    public NurseNofreeShift selectByPrimaryKeyByShiftId(String nurseNofreeShiftId)throws Exception;
    
    //修改班次
    public int updateByPrimaryKeySelectiveNofreeShiftId(NurseNofreeShift record)throws Exception;
    
    //查询班次
    public List<NurseNofreeShift> selectByExampleShift(NurseNofreeShiftExample example)throws Exception;

}
