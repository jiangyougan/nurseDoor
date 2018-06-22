package com.chance.ssm.mapper.goodservicerecommendmapper;

import com.chance.ssm.po.GoodServiceRecommend;
import com.chance.ssm.po.GoodServiceRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodServiceRecommendMapper {
    int countByExample(GoodServiceRecommendExample example);

    int deleteByExample(GoodServiceRecommendExample example);

    //删除精品服务
    int deleteByPrimaryKeyGoodService(String goodServiceRecommendId);

    int insert(GoodServiceRecommend record);

    //添加精品新服务
    int insertSelectiveGoodServiceRecommend(GoodServiceRecommend record);

    //查询所有精品推荐服务
    List<GoodServiceRecommend> selectByExample(GoodServiceRecommendExample example);

    GoodServiceRecommend selectByPrimaryKey(String goodServiceRecommendId);

    int updateByExampleSelective(@Param("record") GoodServiceRecommend record, @Param("example") GoodServiceRecommendExample example);

    int updateByExample(@Param("record") GoodServiceRecommend record, @Param("example") GoodServiceRecommendExample example);

    //修改精品服务
    int updateByPrimaryKeySelectiveGoodService(GoodServiceRecommend record);

    int updateByPrimaryKey(GoodServiceRecommend record);
}