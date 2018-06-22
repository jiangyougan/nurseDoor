package com.chance.ssm.utils;

import java.util.HashMap;
import java.util.Map;

public class Pager{

	public static  int pageSize=10;//每页显示条数
	
	/**
	 * 分页算法
	 * pageNow:当前页
	 * totalPage:总页
	 * 返回:分页按钮从第几页-第几页
	 */
	public static Map<String,Integer> paging(int pageNow,int totalPage)throws Exception{
		int start,end;
//		System.out.println("pageNow="+pageNow+" totalPage="+totalPage);
		if (pageNow<=pageSize) {
			start=1;
		}else {
			start=(pageNow-1)/pageSize*pageSize+1;
		}
		
		if (totalPage<pageSize || pageNow==totalPage) {
			end=totalPage;
		}else {
			end=start+4;
		}
		
		Map<String, Integer> result=new HashMap<String, Integer>();
		System.out.println("start="+start+", end="+end);
		result.put("start", start);
		result.put("end", end);
		return result; 
	}
	
	public static int getTotalPage(int count){
//		System.out.println("count="+count);
//		System.out.println("pageSize="+pageSize);
//		System.out.println("count/pageSize+1="+count/pageSize+1);
		if(count % pageSize==0)
			return count/pageSize;
		else
			return count/pageSize+1;
	}
	
}
