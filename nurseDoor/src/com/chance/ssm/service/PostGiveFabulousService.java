package com.chance.ssm.service;

import java.util.List;


import com.chance.ssm.po.PostGiveFabulous;
import com.chance.ssm.po.PostGiveFabulousExample;

public interface PostGiveFabulousService {

	 //护士点赞
    public  int insertSelective(PostGiveFabulous record)throws Exception;
    
    // 查询当天点赞的数据
    public int selectpostgivefabulousToday(String postGiveFabulousNurseId,String postGiveFabulousPostThreeId)throws Exception;
    
    //查到护士对这个订单的点赞次数
    public List<PostGiveFabulous> selectpostgivefabulousForMeto(String postGiveFabulousNurseId,String postGiveFabulousPostThreeId)throws Exception;
    
    //查询点赞数量
    public int countByExample(PostGiveFabulousExample example)throws Exception;
}
