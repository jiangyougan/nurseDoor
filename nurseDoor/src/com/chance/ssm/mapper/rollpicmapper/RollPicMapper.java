package com.chance.ssm.mapper.rollpicmapper;

import com.chance.ssm.po.RollPic;
import com.chance.ssm.po.RollPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RollPicMapper {
    int countByExample(RollPicExample example);

    int deleteByExample(RollPicExample example);

    //删除轮播图
    int deleteByPrimaryKey(String rollPicId);

    int insert(RollPic record);

    //插入轮播图
    int insertSelective(RollPic record);

    List<RollPic> selectByExample(RollPicExample example);

    //通过id查询轮播图
    RollPic selectByPrimaryKey(String rollPicId);

    int updateByExampleSelective(@Param("record") RollPic record, @Param("example") RollPicExample example);

    int updateByExample(@Param("record") RollPic record, @Param("example") RollPicExample example);

    //修改
    int updateByPrimaryKeySelective(RollPic record);

    int updateByPrimaryKey(RollPic record);
    
    //查询所有轮播图
    List<RollPic> selectAllRollPic();
}