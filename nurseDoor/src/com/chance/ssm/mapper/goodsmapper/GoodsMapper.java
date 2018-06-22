package com.chance.ssm.mapper.goodsmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chance.ssm.po.Goods;
import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.vo.GoodsVO;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(String goodsId);

    int insert(Goods record);

    //添加产品
    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    //根据id查询产品信息
    Goods selectByPrimaryKey(String goodsId);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    //通过产品id修改信息
    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    //根据传入的条件查询数据,返回VO扩展类
    List<GoodsVO> selectByExampleRuVO(GoodsExample example);
    
    //通过护理服务项id查询收费服务 
    List<Goods> selectGoodInfoByContent(String goodsContent);
    
    //根据二级产品ID得到三级产品信息(默认优先,钱少其次)
    List<Goods> selectGoodsMoneyByOther(String goodsContent);
    
    //根据二级产品ID查看有没有上架的产品 
    List<Goods> selectGoodsIsCanUse(String goodsContent);
}