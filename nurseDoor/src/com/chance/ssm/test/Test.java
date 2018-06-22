package com.chance.ssm.test;

import java.io.BufferedReader;  
import java.io.File;
import java.io.FileReader;  
import java.io.IOException;  
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;



  
public class Test {  
	//读取本地json文件
	public static String ReadFile(String path){
		String laststr="";
		File file=new File(path);
		BufferedReader reader=null;
		try{
		reader=new BufferedReader(new FileReader(file));
		String tempString=null;
		//int line=1;
		while((tempString=reader.readLine())!=null){
		//System.out.println("line"+line+":"+tempString);
		laststr=laststr+tempString;
		//line++;
		}
		reader.close();
		}catch(IOException e){
		e.printStackTrace();
		}finally{
		if(reader!=null){
		try{
		reader.close();
		}catch(IOException el){
		}  }  }
		return laststr;
		}
	public  void urlreadFile(){
		 //查询Ip信息的接口，返回json
        String url="http://XX.XX.XX.XX:8088/XXXX/date/update.json";
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //得到的json数据
        System.out.println(result);
	}
  
    /** 读取网络上的json文件
     * @param args 
     */  
    public static void main(String[] args) throws Exception{
    	//date转String
//    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    	Date time = new Date();
//    	String startTime = sdf.format(time);
//    	String time2 = startTime+" "+"8:00:00";
//    	//String 转date
//    	DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    	Date date = fmt.parse(time2);
//    	System.out.println("date="+date);
//
//    	System.out.println("startTime="+startTime);
//    	
//    	System.out.println("Date="+time);
    	DecimalFormat    df   = new DecimalFormat("######0.00");  
    	BigDecimal b1 = new BigDecimal(9);
    	BigDecimal b2 =new BigDecimal(df.format(b1.divide(new BigDecimal(8)).doubleValue())) ;
    	System.out.println("b2="+b2);
    	
    	

    }
  
}  