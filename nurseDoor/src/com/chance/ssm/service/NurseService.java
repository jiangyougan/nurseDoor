package com.chance.ssm.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chance.ssm.po.ManageNursingProject;
import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseExample;
import com.chance.ssm.po.NurseFinishOrderSignin;
import com.chance.ssm.po.NurseNofree;
import com.chance.ssm.po.NursePaymentSettings;
import com.chance.ssm.po.SigninSet;
import com.chance.ssm.po.User;
import com.chance.ssm.po.vo.NurseBillsOrderVO;
import com.chance.ssm.po.vo.NurseNoFreeVo;
import com.chance.ssm.po.vo.NurseRankingVO;
import com.chance.ssm.po.vo.NurseVO;
import com.chance.ssm.po.vo.Params;

public interface NurseService {
	
	//护士端注册
	public int insertSelective(Nurse record)throws Exception;
	
	 //通过账号查询用户信息
	public Nurse selectForNurseName(String nurseName)throws Exception;
	
	  //通过id查询护士信息
	public Nurse selectForNurseId(String nurseId)throws Exception;
	
	//护士排班表的空闲时间
	public List<NurseNoFreeVo> selectNurseFreeInfo(String nurseNofreeNurseid)throws Exception;
	
	//通过护士id更新护士信息
	public int updateByNurseId(Nurse nurse)throws Exception;
	//根据条件更新用户信息
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public int updateByExampleSelective(@Param("record") Nurse record, @Param("example") NurseExample example)throws Exception;
	//通过订单id查询接取的护士信息
	public  Nurse selectNurseInfoByOrder(String ordersendId)throws Exception;
	 
	  //通过ID查询护士信息，返回护士的VO扩展类
    public NurseVO selectForNurseIdreultVO(String nurseId) throws Exception;
    
    //通过传入的条件不同查询记录，并返回vo扩展类
    public List<NurseVO> selectByExampleRsuVO(NurseExample example) throws Exception;
    
    //统计护士个数
    public int countByExample(NurseExample example)throws Exception;
    
    public List<NurseVO> selectFindFujinPeople(Params params)throws Exception;
    
    //通过id查询护士账单
    public List<NurseBillsOrderVO> selectNurseOrder(String nurseId)throws Exception;
    
    //查询订单信息
    public List<Nurse> selectByExample(NurseExample example)throws Exception;
    
    //通过id查询护士当天是否已签到
    public int selectNurseSignin(String nurseId)throws Exception;
    
    //护士去签到
    public int nurseToSignin(String nurseId)throws Exception;
    
    //护士积分排行总榜
    public List<NurseRankingVO> selectNurseMarkDesc()throws Exception;
    
    //查询护士排行榜
    public NurseRankingVO selectNurseRanking(String nurseId)throws Exception;
    
    //查询护士近一月积分排行榜
    public NurseRankingVO selectNurseThirtyDayRankingByNurseId(String nurseId)throws Exception;
    
    //护士近一月积分排行总榜
    public List<NurseRankingVO>selectNurseThirtyDayRanking()throws Exception;
    
    //查询护士7天排行总榜
    public List<NurseRankingVO> selectNurseSevenDayRanking()throws Exception;
    
    //查询护士7天排行榜排名
    public NurseRankingVO selectNurseSevenDayRankingByNurseId(String nurseId)throws Exception;
    
    //通过邀请码查看护士
    public Nurse selectNurseForInvitationcode(String nurseInvitationcode)throws Exception;
    
    //护士注册赠送的积分
    public SigninSet selectNurseRegistermark()throws Exception;
    
    //查询后台设定的积分 
    public SigninSet selectMarkSetSignin()throws Exception;
    
    //分页查询所有护士
    public List<Nurse> selectAllNurseInfo(Map<String,Integer> params)throws Exception;
    
    //通过关键字查询护士
    public List<Nurse> selectKeyWordFromNurse(String _parameter)throws Exception;
    
    //通过关键字查询通过认证的护士
    public  List<Nurse> selectKeyWordFromNurseKdh(String _parameter)throws Exception;
   
    //根据护士ID查询护士的信息和真实照片等信息
    public NursePaymentSettings selectNurseInfoAndNursePaymentSettings(String nurseId)throws Exception;
    
    /**查询护士总数*/
    public int selectNurseCount()throws Exception;
    
    /**新增护士统计 当日*/
    public int selectNurseCountOnDay()throws Exception;
    
    /**新增护士统计 当周*/
    public int selectNurseCountOnWeek()throws Exception;
    
    /**新增护士统计 当月*/
    public int selectNurseCountOnMonth()throws Exception;
    
    /**护士签到统计 当日*/
    public int selectNurseSigninCountOnDay()throws Exception;
    
    /**护士签到统计 当周*/
    public int selectNurseSigninCountOnWeek()throws Exception;
    
    /**护士签到统计 当月*/
    public int selectNurseSigninCountOnMonth()throws Exception;
    
    //护士完成订单加积分
    public int insertSelectivefinishorderSignin(NurseFinishOrderSignin nurseFinishOrderSignin)throws Exception;
    
    public int insertfinishorderSignin(NurseFinishOrderSignin record)throws Exception;
    
    //护士关注排行总榜
    public List<NurseRankingVO> selectNurseForFollow()throws Exception;
    
    //查询所有正在认证的护士
    public List<Nurse>selectAllNurseInfodistrict(Map<String,Integer> params)throws Exception;
    
    //查附近的护士
    public List<NurseVO> selectNurseDistance(Params params)throws Exception;
    
    //查询所有认证中的护士数量
    public int selectAllNurseInfodistrictCount()throws Exception;
    
    List<Nurse> selectStatisticsNurseSuccessMonth();
    
    List<Nurse> selectStatisticsNurseSuccessYear();
}
