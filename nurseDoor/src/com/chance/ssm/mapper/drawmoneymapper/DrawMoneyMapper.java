package com.chance.ssm.mapper.drawmoneymapper;

import com.chance.ssm.po.DrawMoney;
import com.chance.ssm.po.DrawMoneyExample;
import com.chance.ssm.po.vo.ComplaintVagueVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DrawMoneyMapper {
    int countByExample(DrawMoneyExample example);

    int deleteByExample(DrawMoneyExample example);

    int insert(DrawMoney record);

    //用户或护士提现
    int insertSelective(DrawMoney record);

    List<DrawMoney> selectByExample(DrawMoneyExample example);

    
    //修改状态
    int updateByExampleSelective(@Param("record") DrawMoney record, @Param("example") DrawMoneyExample example);

    int updateByExample(@Param("record") DrawMoney record, @Param("example") DrawMoneyExample example);
    
    //查询用户正在申请提现的数据
    List<DrawMoney> selectUserDrawMoneyNow(ComplaintVagueVo complaintVagueVo);
    
    //查询用户提现过的数据
    List<DrawMoney> selectUserDrawMoneyNed(ComplaintVagueVo complaintVagueVo);
    
    //查询护士正在申请提现的数据
    List<DrawMoney> selectNurseDrawMoneyNow(ComplaintVagueVo complaintVagueVo);
    
    //查询护士提现过的数据
    List<DrawMoney> selectNurseDrawMoneyNed(ComplaintVagueVo complaintVagueVo);
    
    //查询用户正在申请提现的数据的数量
    int selectUserDrawMoneyNowCount();
    
    //查询用户提现过的数据的数量
    int selectUserDrawMoneyNedCount();
    
    //查询护士正在申请提现的数据的数量 
    int selectNurseDrawMoneyNowCount();
    
    //查询护士提现过的数据的数量
    int selectNurseDrawMoneyNedCount();
}