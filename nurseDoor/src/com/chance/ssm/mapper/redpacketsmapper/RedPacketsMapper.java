package com.chance.ssm.mapper.redpacketsmapper;

import com.chance.ssm.po.RedPackets;
import com.chance.ssm.po.RedPacketsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedPacketsMapper {
    int countByExample(RedPacketsExample example);

    int deleteByExample(RedPacketsExample example);

    int deleteByPrimaryKey(String redPackets);

    int insert(RedPackets record);

    //添加红包
    int insertSelective(RedPackets record);

    //查询所有红包
    List<RedPackets> selectByExample(RedPacketsExample example);

    //通过ID查看红包
    RedPackets selectByPrimaryKeyByResPacketsId(String redPackets);

    int updateByExampleSelective(@Param("record") RedPackets record, @Param("example") RedPacketsExample example);

    int updateByExample(@Param("record") RedPackets record, @Param("example") RedPacketsExample example);

    //修改红包
    int updateByPrimaryKeySelective(RedPackets record);

    int updateByPrimaryKey(RedPackets record);
    
    //判断有没有添加过该类别的红包
    RedPackets selectRedpacketsInfoByType(Integer redPacketsType);
}