package com.chance.ssm.mapper.protectedpersonmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.OrderSend;
import com.chance.ssm.po.ProtectedPerson;
import com.chance.ssm.po.ProtectedPersonExample;
import com.chance.ssm.po.vo.ProtectedPersonVO;

public interface ProtectedPersonMapper {
    int countByExample(ProtectedPersonExample example);

    int deleteByExample(ProtectedPersonExample example);

    int deleteByPrimaryKey(String protectedPersonId);

    int insert(ProtectedPerson record);

    int insertSelective(ProtectedPerson record);

    List<ProtectedPerson> selectByExample(ProtectedPersonExample example);

    //通过受护人id查询受护人信息
    ProtectedPerson selectByPrimaryKey(String protectedPersonId);

    int updateByExampleSelective(@Param("record") ProtectedPerson record, @Param("example") ProtectedPersonExample example);

    int updateByExample(@Param("record") ProtectedPerson record, @Param("example") ProtectedPersonExample example);

    int updateByPrimaryKeySelective(ProtectedPerson record);

    int updateByPrimaryKey(ProtectedPerson record);
    
    //根据订单id和受护人id得到该订单的受护人详细信息
    ProtectedPerson selectProtectedPersonDetails(String orderSendUsername,String orderSendId);
    
    //根据条件查询数据，返回vo扩展类list
    List<ProtectedPersonVO> selectByExampleRuVOs(ProtectedPersonExample example);
    
    //根据条件查询数据，返回vo扩展类
    ProtectedPersonVO selectByExampleRuVO(ProtectedPersonExample example);
    
    //根据身份证号查询有没有相同的
    int selectPersonCountByCard(String protectedPersonCard);
    
    //根据用户ID查询患者信息
    List<ProtectedPerson> selectPersionInfoByUserId(String protectedUserId);
}