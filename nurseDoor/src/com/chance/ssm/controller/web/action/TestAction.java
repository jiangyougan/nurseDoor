package com.chance.ssm.controller.web.action;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TestAction {
	 @RequestMapping(value = "/testNewFile", method = RequestMethod.POST)
	 public void Test(HttpServletRequest request,HttpServletResponse response)throws Exception{
		 PrintWriter writer = response.getWriter();  
	        Map<String, String[]> params = request.getParameterMap();  
	        String queryString = "";  
	        for (String key : params.keySet()) {  
	            String[] values = params.get(key);  
	            for (int i = 0; i < values.length; i++) {  
	                String value = values[i];  
	                queryString += key + "=" + value + "&";  
	            }  
	        }  
	        // 去掉最后一个空格  
	        queryString = queryString.substring(0, queryString.length() - 1);  
	        writer.println("POST " + request.getRequestURL() + " " + queryString);  
	    }  
} 
