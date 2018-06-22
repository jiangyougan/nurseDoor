package com.chance.ssm.test;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class TestTwo {
	
	private int int1;
	private String String1;
	public String abc(String a){
		int int2;
		int2 = int1;
		String String2 = String1;
		return "".equals(a) || a == null ?"is null":a;
	}
	

	public static void main(String[] args) {
	}
	
	//下载网络图片
	public String download(String urlString, String filename,String savePath) throws Exception {
				// 构造URL
				// System.setProperty("http.proxySet", "true");
				// System.setProperty("http.proxyHost", "192.168.2.138");
				// System.setProperty("http.proxyPort", "1081");
				URL url = new URL(urlString);
				// 打开连接
				URLConnection con = url.openConnection();
				//设置请求的路径
				con.setConnectTimeout(5*1000);
				// 输入流
				InputStream is = con.getInputStream();
				 
				// 1K的数据缓冲
				byte[] bs = new byte[1024];
				// 读取到的数据长度
				int len;
				// 输出的文件流
				java.io.File sf=new java.io.File(savePath);
				if(!sf.exists()){
				sf.mkdirs();
				}
				OutputStream os = new FileOutputStream(sf.getPath()+"/"+filename);
				// 开始读取
				while ((len = is.read(bs)) != -1) {
				os.write(bs, 0, len);
				}
				// 完毕，关闭所有链接
				os.close();
				 
				is.close();
				return filename;
				}
}
