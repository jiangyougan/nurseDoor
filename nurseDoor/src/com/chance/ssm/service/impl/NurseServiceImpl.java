package com.chance.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chance.ssm.mapper.nursefinishordersigninmapper.NurseFinishOrderSigninMapper;
import com.chance.ssm.mapper.nursemapper.NurseMapper;
import com.chance.ssm.mapper.nursenofreemapper.NurseNofreeMapper;
import com.chance.ssm.mapper.nursesigninmapper.NurseSigninMapper;
import com.chance.ssm.mapper.signinsetmapper.SigninSetMapper;
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
import com.chance.ssm.service.NurseService;
@Service
public class NurseServiceImpl implements NurseService{

	@Autowired
	private NurseMapper nurseMapper;
	
	@Autowired
	private NurseNofreeMapper nurseNofreeMapper;
	
	@Autowired
	private NurseSigninMapper nurseSigninMapper;
	
	@Autowired
	private SigninSetMapper signinSetMapper;
	
	@Autowired
	private NurseFinishOrderSigninMapper nurseFinishOrderSigninMapper;
	
	//护士端注册
	@Override
	public int insertSelective(Nurse record) throws Exception {
		
		return nurseMapper.insertSelective(record);
	}

	@Override
	public Nurse selectForNurseName(String nurseName) throws Exception {
		
		return nurseMapper.selectForNurseName(nurseName);
	}

	@Override
	public Nurse selectForNurseId(String nurseId) throws Exception {
		
		return nurseMapper.selectForNurseId(nurseId);
	}

	@Override
	public List<NurseNoFreeVo> selectNurseFreeInfo(String nurseNofreeNurseid)
			throws Exception {
		
		return nurseNofreeMapper.selectNurseFreeInfo(nurseNofreeNurseid);
	}

	@Override
	public int updateByNurseId(Nurse nurse) throws Exception {
		
		return nurseMapper.updateByNurseId(nurse);
	}

	@Override
	public Nurse selectNurseInfoByOrder(String ordersendId) throws Exception {
		
		return nurseMapper.selectNurseInfoByOrder(ordersendId);
	}

	@Transactional(rollbackFor=Exception.class)
	@Override
	public int updateByExampleSelective(Nurse record, NurseExample example) throws Exception {
		
		return nurseMapper.updateByExampleSelective(record, example);
	}

	@Override
	public NurseVO selectForNurseIdreultVO(String nurseId) throws Exception {
		
		return nurseMapper.selectForNurseIdreultVO(nurseId);
	}

	@Override
	public List<NurseVO> selectByExampleRsuVO(NurseExample example)
			throws Exception {
		
		return nurseMapper.selectByExampleRsuVO(example);
	}

	@Override
	public int countByExample(NurseExample example) throws Exception {
		
		return nurseMapper.countByExample(example);
	}

	@Override
	public List<NurseVO> selectFindFujinPeople(Params params) throws Exception {
		
		return nurseMapper.selectFindFujinPeople(params);
	}

	@Override
	public List<NurseBillsOrderVO> selectNurseOrder(String nurseId) throws Exception {
		
		return nurseMapper.selectNurseOrder(nurseId);
	}

	@Override
	public List<Nurse> selectByExample(NurseExample example) throws Exception {
		
		return nurseMapper.selectByExample(example);
	}

	@Override
	public int selectNurseSignin(String nurseId) throws Exception {
		
		return nurseSigninMapper.selectNurseSignin(nurseId);
	}

	@Override
	public int nurseToSignin(String nurseId) throws Exception {
		
		return nurseSigninMapper.nurseToSignin(nurseId);
	}

	@Override
	public List<NurseRankingVO> selectNurseMarkDesc() throws Exception {
		
		return nurseMapper.selectNurseMarkDesc();
	}

	@Override
	public NurseRankingVO selectNurseRanking(String nurseId) throws Exception {
		
		return nurseMapper.selectNurseRanking(nurseId);
	}

	@Override
	public Nurse selectNurseForInvitationcode(String nurseInvitationcode)
			throws Exception {
		
		return nurseMapper.selectNurseForInvitationcode(nurseInvitationcode);
	}

	@Override
	public SigninSet selectNurseRegistermark() throws Exception {
		
		return signinSetMapper.selectNurseRegistermark();
	}

	@Override
	public int selectNurseCount() throws Exception {
		
		return nurseMapper.selectNurseCount();
	}

	@Override
	public int selectNurseCountOnDay() throws Exception {
		
		return nurseMapper.selectNurseCountOnDay();
	}

	@Override
	public int selectNurseCountOnWeek() throws Exception {
		
		return nurseMapper.selectNurseCountOnWeek();
	}

	@Override
	public int selectNurseCountOnMonth() throws Exception {
		
		return nurseMapper.selectNurseCountOnMonth();
	}

	@Override
	public int selectNurseSigninCountOnDay() throws Exception{
		
		return nurseSigninMapper.selectNurseSigninCountOnDay();
	}

	@Override
	public int selectNurseSigninCountOnWeek() throws Exception{
		
		return nurseSigninMapper.selectNurseSigninCountOnWeek();
	}

	@Override
	public int selectNurseSigninCountOnMonth() throws Exception{
		
		return nurseSigninMapper.selectNurseSigninCountOnMonth();
	}

	

	@Override
	public SigninSet selectMarkSetSignin() throws Exception {
		// TODO Auto-generated method stub
		return signinSetMapper.selectMarkSetSignin();
	}

	@Override
	public int insertSelectivefinishorderSignin(
			NurseFinishOrderSignin nurseFinishOrderSignin) {
		// TODO Auto-generated method stub
		return nurseFinishOrderSigninMapper.insertSelectivefinishorderSignin(nurseFinishOrderSignin);
	}

	@Override
	public int insertfinishorderSignin(NurseFinishOrderSignin record)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseFinishOrderSigninMapper.insertfinishorderSignin(record);
	}

	@Override
	public List<NurseRankingVO> selectNurseThirtyDayRanking() throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectNurseThirtyDayRanking();
	}

	@Override
	public NurseRankingVO selectNurseThirtyDayRankingByNurseId(String nurseId)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectNurseThirtyDayRankingByNurseId(nurseId);
	}

	@Override
	public List<NurseRankingVO> selectNurseSevenDayRanking() throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectNurseSevenDayRanking();
	}

	@Override
	public NurseRankingVO selectNurseSevenDayRankingByNurseId(String nurseId)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectNurseSevenDayRankingByNurseId(nurseId);
	}

	@Override
	public List<NurseRankingVO> selectNurseForFollow() throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectNurseForFollow();
	}

	@Override
	public List<Nurse> selectAllNurseInfo(Map<String, Integer> params)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectAllNurseInfo(params);
	}

	@Override
	public List<Nurse> selectAllNurseInfodistrict(Map<String, Integer> params)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectAllNurseInfodistrict(params);
	}

	@Override
	public List<Nurse> selectKeyWordFromNurse(String _parameter)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectKeyWordFromNurse(_parameter);
	}

	@Override
	public List<Nurse> selectKeyWordFromNurseKdh(String _parameter)
			throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectKeyWordFromNurseKdh(_parameter);
	}

	@Override
	public NursePaymentSettings selectNurseInfoAndNursePaymentSettings(
			String nurseId) throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectNurseInfoAndNursePaymentSettings(nurseId);
	}

	@Override
	public List<NurseVO> selectNurseDistance(Params params) throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectNurseDistance(params);
	}

	@Override
	public int selectAllNurseInfodistrictCount() throws Exception {
		// TODO Auto-generated method stub
		return nurseMapper.selectAllNurseInfodistrictCount();
	}

	@Override
	public List<Nurse> selectStatisticsNurseSuccessMonth() {
		// TODO Auto-generated method stub
		return nurseMapper.selectStatisticsNurseSuccessMonth();
	}

	@Override
	public List<Nurse> selectStatisticsNurseSuccessYear() {
		// TODO Auto-generated method stub
		return nurseMapper.selectStatisticsNurseSuccessYear();
	}
	
	
}
