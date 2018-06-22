package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Goods;
import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.vo.GoodsVO;

public interface GoodsService {
	
	public List<Goods> selectByExample(GoodsExample example)throws Exception;
	
	//根据传入的条件查询数据,返回VO扩展类
    public List<GoodsVO> selectByExampleRuVO(GoodsExample example)throws Exception;
    
  //通过护理服务项id查询收费服务 
    public List<Goods> selectGoodInfoByContent(String goodsContent)throws Exception;

    //根据id查询产品信息
    public Goods selectByPrimaryKey(String goodsId)throws Exception;
    
    //通过产品id修改信息
    public int updateByPrimaryKeySelective(Goods record)throws Exception;
    
    //根据传入的条件删除数据
    public int deleteByExample(GoodsExample example) throws Exception;
    
    //添加产品
    public int insertSelective(Goods record)throws Exception;
    
    //删除产品收费项
    public int deleteByPrimaryKey(String goodsId)throws Exception;
    
    //统计数据
    public int countByExample(GoodsExample example)throws Exception;
    
    //根据二级产品ID得到三级产品信息(默认优先,钱少其次)
    public  List<Goods> selectGoodsMoneyByOther(String goodsContent)throws Exception;
    
    //根据二级产品ID查看有没有上架的产品 
    List<Goods> selectGoodsIsCanUse(String goodsContent);
}
