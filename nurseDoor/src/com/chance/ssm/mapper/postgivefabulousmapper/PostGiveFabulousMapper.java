package com.chance.ssm.mapper.postgivefabulousmapper;

import com.chance.ssm.po.PostGiveFabulous;
import com.chance.ssm.po.PostGiveFabulousExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostGiveFabulousMapper {
	
	//查询点赞数量
    int countByExample(PostGiveFabulousExample example);

    int deleteByExample(PostGiveFabulousExample example);

    int deleteByPrimaryKey(Integer postGiveFabulousId);

    int insert(PostGiveFabulous record);

    //点赞
    int insertSelective(PostGiveFabulous record);

    List<PostGiveFabulous> selectByExample(PostGiveFabulousExample example);

    PostGiveFabulous selectByPrimaryKey(Integer postGiveFabulousId);

    int updateByExampleSelective(@Param("record") PostGiveFabulous record, @Param("example") PostGiveFabulousExample example);

    int updateByExample(@Param("record") PostGiveFabulous record, @Param("example") PostGiveFabulousExample example);

    int updateByPrimaryKeySelective(PostGiveFabulous record);

    int updateByPrimaryKey(PostGiveFabulous record);
    
    // 查询当天点赞的数据
    int selectpostgivefabulousToday(String postGiveFabulousNurseId,String postGiveFabulousPostThreeId);
    
    //查到护士对这个订单的点赞次数
    List<PostGiveFabulous> selectpostgivefabulousForMeto(@Param("postGiveFabulousNurseId")String postGiveFabulousNurseId,@Param("postGiveFabulousPostThreeId")String postGiveFabulousPostThreeId);
}