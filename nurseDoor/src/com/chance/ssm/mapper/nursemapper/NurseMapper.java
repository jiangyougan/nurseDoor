package com.chance.ssm.mapper.nursemapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseExample;
import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.User;
import com.chance.ssm.po.vo.NurseBillsOrderVO;
import com.chance.ssm.po.vo.NurseRankingVO;
import com.chance.ssm.po.vo.NurseVO;
import com.chance.ssm.po.vo.Params;

public interface NurseMapper {
    int countByExample(NurseExample example);

    int deleteByExample(NurseExample example);

    int insert(Nurse record);

    //护士端注册
    int insertSelective(Nurse record);

    //查询所有护士
    List<Nurse> selectByExample(NurseExample example);

    int updateByExampleSelective(@Param("record") Nurse record, @Param("example") NurseExample example);

    int updateByExample(@Param("record") Nurse record, @Param("example") NurseExample example);
    
    //查询所有护士
    List<Nurse>selectAllNurseInfo(Map<String,Integer> params);
    
    //查询所有正在认证的护士
    List<Nurse>selectAllNurseInfodistrict(Map<String,Integer> params);
    
    //通过账号查询用户信息
    Nurse selectForNurseName(String nurseName);
    
    //通过id查询护士信息
    Nurse selectForNurseId(String nurseId);
    
    //通过护士id更新护士信息
    int updateByNurseId(Nurse nurse);
    
    //通过订单id查询接取的护士信息
    Nurse selectNurseInfoByOrder(String ordersendId);
    
    
    //通过ID查询护士信息，返回护士的VO扩展类
    NurseVO selectForNurseIdreultVO(String nurseId);
    
    //通过传入的条件不同查询记录，并返回vo扩展类
    List<NurseVO> selectByExampleRsuVO(NurseExample example);
    
    //查附近的护士
    List<NurseVO> selectNurseDistance(Params params);
    
    
    List<NurseVO> selectFindFujinPeople(Params params);
    
    //通过id查询护士账单
    List<NurseBillsOrderVO> selectNurseOrder(String nurseId);
    
    //护士积分排行总榜
    List<NurseRankingVO> selectNurseMarkDesc();
    
    //护士近一月积分排行总榜
    List<NurseRankingVO>selectNurseThirtyDayRanking();
    
    //护士关注排行总榜
    List<NurseRankingVO> selectNurseForFollow();
    
    //查询护士积分排行榜
    NurseRankingVO selectNurseRanking(String nurseId);
    
    //查询护士近一月积分排行榜
    NurseRankingVO selectNurseThirtyDayRankingByNurseId(String nurseId);
    
    //查询护士7天排行总榜
    List<NurseRankingVO> selectNurseSevenDayRanking();
    
    //查询护士7天排行榜排名
    NurseRankingVO selectNurseSevenDayRankingByNurseId(String nurseId);
    
    //通过邀请码查看护士
    Nurse selectNurseForInvitationcode(String nurseInvitationcode);
    
    //通过关键字查询护士
    List<Nurse> selectKeyWordFromNurse(String _parameter);
    
    //通过关键字查询通过认证的护士
    List<Nurse> selectKeyWordFromNurseKdh(String _parameter);
    
    //根据护士ID查询护士的信息和真实照片等信息
    NursePaymentSettings selectNurseInfoAndNursePaymentSettings(String nurseId);
    
    //查询所有认证中的护士数量
    int selectAllNurseInfodistrictCount();
    
    /**查询护士总数*/
    int selectNurseCount();
    
    /**新增护士统计 当日*/
    int selectNurseCountOnDay();
    
    /**新增护士统计 当周*/
    int selectNurseCountOnWeek();
    
    /**新增护士统计 当月*/
    int selectNurseCountOnMonth();
    
    List<Nurse> selectStatisticsNurseSuccessMonth();
    
    List<Nurse> selectStatisticsNurseSuccessYear();
    
}