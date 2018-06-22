package com.chance.ssm.mapper.redpacketsusermapper;

import com.chance.ssm.po.RedPacketsUser;
import com.chance.ssm.po.RedPacketsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedPacketsUserMapper {
    int countByExample(RedPacketsUserExample example);

    int deleteByExample(RedPacketsUserExample example);

    int deleteByPrimaryKey(String redPacketsNurseId);

    int insert(RedPacketsUser record);

    //发红包
    int insertSelectiveNurseRedPackets(RedPacketsUser record);

    //查询红包
    List<RedPacketsUser> selectByExample(RedPacketsUserExample example);

    RedPacketsUser selectByPrimaryKey(String redPacketsNurseId);

    int updateByExampleSelective(@Param("record") RedPacketsUser record, @Param("example") RedPacketsUserExample example);

    int updateByExample(@Param("record") RedPacketsUser record, @Param("example") RedPacketsUserExample example);

    int updateByPrimaryKeySelective(RedPacketsUser record);

    int updateByPrimaryKey(RedPacketsUser record);
    
    //根据护士ID查询所有红包
    List<RedPacketsUser> selectRedPacketsNurseAllInfo(String nurseId);
}