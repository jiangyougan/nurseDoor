package com.chance.ssm.mapper.customerservicephonemapper;

import com.chance.ssm.po.CustomerServicePhone;
import com.chance.ssm.po.CustomerServicePhoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerServicePhoneMapper {
    int countByExample(CustomerServicePhoneExample example);

    int deleteByExample(CustomerServicePhoneExample example);

    //删除客服电话
    int deleteByPrimaryKey(String customerServicePhoneId);

    int insert(CustomerServicePhone record);

    //添加客服电话
    int insertSelective(CustomerServicePhone record);

    //查询所有客服电话
    List<CustomerServicePhone> selectByExample(CustomerServicePhoneExample example);

    CustomerServicePhone selectByPrimaryKey(String customerServicePhoneId);

    int updateByExampleSelective(@Param("record") CustomerServicePhone record, @Param("example") CustomerServicePhoneExample example);

    int updateByExample(@Param("record") CustomerServicePhone record, @Param("example") CustomerServicePhoneExample example);

    //修改客服电话信息
    int updateByPrimaryKeySelective(CustomerServicePhone record);

    int updateByPrimaryKey(CustomerServicePhone record);
    
    //修改所有的数据未非默认
    int updateServicePhoneDefault();
}