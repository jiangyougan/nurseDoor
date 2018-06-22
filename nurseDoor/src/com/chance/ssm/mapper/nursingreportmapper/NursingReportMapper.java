package com.chance.ssm.mapper.nursingreportmapper;

import com.chance.ssm.po.NursingReport;
import com.chance.ssm.po.NursingReportExample;
import com.chance.ssm.po.vo.NursingReportKeyWordVO;
import com.chance.ssm.po.vo.NursingUserAndNurseVO;
import com.chance.ssm.po.vo.ReportVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NursingReportMapper {
    int countByExample(NursingReportExample example);

    int deleteByExample(NursingReportExample example);

    int insert(NursingReport record);

    //添加护理报告
    int insertSelective(NursingReport record);

    //查询所有护理报告
    List<NursingReport> selectByExample(NursingReportExample example);

    int updateByExampleSelective(@Param("record") NursingReport record, @Param("example") NursingReportExample example);

    int updateByExample(@Param("record") NursingReport record, @Param("example") NursingReportExample example);
    
    //根据用户id查询护理报告通过身份证号分组(查询结果为空的原因  订单不存在，护士不存在，受护人不存在，护理报告不存在)
    List<ReportVO> selectReportByUserId(String orderSendUserid);
    
    //根据用户id和受护人身份证号码查询护理报告详细信息(查询结果为空的原因  订单不存在，护士不存在，受护人不存在，护理报告不存在)
    List<ReportVO> selectReportByUserIdAndPersonCard(ReportVO reportVO);
    
    //根据订单id得到护理报告表信息 
    NursingReport selectReportByOrderId(String nursingReportOrderid);
    
    //护士查看自己填写的护理报告 根据用户id和受护人身份证号码查询护理报告详细信息(查询结果为空的原因  订单不存在，护士不存在，受护人不存在，护理报告不存在)
    List<ReportVO> selectReportByUserIdAndPersonCardByNurseId(String nurseId);
    
    //查看所有护理报告(包括模糊查询)
    List<NursingUserAndNurseVO> selectAllNursingReportAndkeyWord(NursingReportKeyWordVO nursingReportKeyWordVO);
    
    //查看所有护理报告(包括模糊查询)数量
    int selectAllNursingReportAndkeyWordCount(NursingReportKeyWordVO nursingReportKeyWordVO);
}