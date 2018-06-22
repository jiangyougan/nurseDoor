package com.chance.ssm.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.chance.ssm.po.ManageNursingTestall;

public class listRemoval {
	public List<String> getNewList(List<ManageNursingTestall> manageNursingTestalls2){
        List<String> list = new ArrayList<String>();
        for(int i=0; i<manageNursingTestalls2.size(); i++){
            ManageNursingTestall str = manageNursingTestalls2.get(i);  //获取传入集合对象的每一个元素
            if(!list.contains(str)){   //查看新集合中是否有指定的元素，如果没有则加入
                list.addAll((Collection<? extends String>) str);
            }
        }
        return list;  //返回集合
    }
}
