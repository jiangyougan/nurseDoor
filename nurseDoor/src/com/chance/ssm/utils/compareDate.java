package com.chance.ssm.utils;

import java.util.Comparator;
import java.util.Date;

public class compareDate implements Comparator{
	
	public int comparedate(Date zoneDeathline, Date nowTime) {
		// TODO 自动生成的方法存根
		if (zoneDeathline.getTime() > nowTime.getTime()) {
//            System.out.println("zoneDeathline 在 nowTime 前");
            return 1;
        } else if (zoneDeathline.getTime() < nowTime.getTime()) {
//            System.out.println("zoneDeathline 在 nowTime 后");
            return -1;
        } else {//相等
            return 0;
        }
	}

	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
